package io.github.muntashirakon.adb;

import androidx.core.location.LocationRequestCompat;
import defpackage.ad;
import defpackage.r;
import io.github.muntashirakon.adb.AdbProtocol;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import javax.security.auth.DestroyFailedException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class AdbConnection implements Closeable {
    public static final String TAG = "AdbConnection";
    private volatile boolean mAbortOnUnauthorised;
    private final int mApi;
    private volatile boolean mAuthorisationFailed;
    private volatile boolean mConnectAttempted;
    private volatile boolean mConnectionEstablished;
    private volatile Exception mConnectionException;
    private final Thread mConnectionThread;
    private final String mHost;
    private final KeyPair mKeyPair;
    private int mLastLocalId;
    private volatile int mMaxData;
    private final ConcurrentHashMap<Integer, AdbStream> mOpenedStreams;
    private final InputStream mPlainInputStream;
    private final OutputStream mPlainOutputStream;
    private final int mPort;
    private volatile int mProtocolVersion;
    private volatile boolean mSentSignature;
    private final Socket mSocket;
    private volatile InputStream mTlsInputStream;
    private volatile OutputStream mTlsOutputStream;
    private volatile String mDeviceName = "Unknown Device";
    private volatile boolean mIsTls = false;
    private final Object mLock = new Object();

    private AdbConnection(String str, int i, KeyPair keyPair, int i2) throws IOException {
        Objects.requireNonNull(str);
        this.mHost = str;
        this.mPort = i;
        this.mApi = i2;
        this.mProtocolVersion = AdbProtocol.getProtocolVersion(i2);
        this.mMaxData = AdbProtocol.getMaxData(i2);
        Objects.requireNonNull(keyPair);
        this.mKeyPair = keyPair;
        try {
            Socket socket = new Socket(str, i);
            this.mSocket = socket;
            this.mPlainInputStream = socket.getInputStream();
            this.mPlainOutputStream = socket.getOutputStream();
            socket.setTcpNoDelay(true);
            this.mOpenedStreams = new ConcurrentHashMap<>();
            this.mLastLocalId = 0;
            this.mConnectionThread = createConnectionThread();
        } catch (Throwable th) {
            throw ((IOException) new IOException().initCause(th));
        }
    }

    private void cleanupStreams() {
        Iterator<AdbStream> it = this.mOpenedStreams.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException unused) {
            }
        }
        this.mOpenedStreams.clear();
    }

    public static AdbConnection create(String str, int i, PrivateKey privateKey, Certificate certificate) {
        return create(str, i, privateKey, certificate, 1);
    }

    private Thread createConnectionThread() {
        return new Thread(new r(this, 0));
    }

    private InputStream getInputStream() {
        if (!this.mIsTls) {
            return this.mPlainInputStream;
        }
        InputStream inputStream = this.mTlsInputStream;
        Objects.requireNonNull(inputStream);
        return inputStream;
    }

    private OutputStream getOutputStream() {
        if (!this.mIsTls) {
            return this.mPlainOutputStream;
        }
        OutputStream outputStream = this.mTlsOutputStream;
        Objects.requireNonNull(outputStream);
        return outputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createConnectionThread$0() throws IOException {
        AdbStream adbStream;
        byte[] bArrGenerateAuth;
        while (true) {
            if (!this.mConnectionThread.isInterrupted()) {
                try {
                    AdbProtocol.Message message = AdbProtocol.Message.parse(getInputStream(), this.mProtocolVersion, this.mMaxData);
                    int i = message.command;
                    switch (i) {
                        case AdbProtocol.A_CLSE /* 1163086915 */:
                        case AdbProtocol.A_WRTE /* 1163154007 */:
                        case AdbProtocol.A_OKAY /* 1497451343 */:
                            if (this.mConnectionEstablished && (adbStream = this.mOpenedStreams.get(Integer.valueOf(message.arg1))) != null) {
                                synchronized (adbStream) {
                                    try {
                                        int i2 = message.command;
                                        if (i2 == 1497451343) {
                                            adbStream.updateRemoteId(message.arg0);
                                            adbStream.readyForWrite();
                                            adbStream.notify();
                                        } else if (i2 == 1163154007) {
                                            adbStream.addPayload(message.payload);
                                            adbStream.sendReady();
                                        } else {
                                            this.mOpenedStreams.remove(Integer.valueOf(message.arg1));
                                            adbStream.notifyClose(true);
                                        }
                                    } finally {
                                    }
                                }
                            }
                            break;
                        case AdbProtocol.A_AUTH /* 1213486401 */:
                            if (!this.mIsTls && message.arg0 == 1) {
                                if (!this.mSentSignature) {
                                    bArrGenerateAuth = AdbProtocol.generateAuth(2, AndroidPubkey.adbAuthSign(this.mKeyPair.getPrivateKey(), message.payload));
                                    this.mSentSignature = true;
                                } else if (this.mAbortOnUnauthorised) {
                                    this.mAuthorisationFailed = true;
                                    break;
                                } else {
                                    bArrGenerateAuth = AdbProtocol.generateAuth(3, AndroidPubkey.encodeWithName((RSAPublicKey) this.mKeyPair.getPublicKey(), this.mDeviceName));
                                }
                                sendPacket(bArrGenerateAuth);
                            }
                            break;
                        case AdbProtocol.A_CNXN /* 1314410051 */:
                            synchronized (this) {
                                this.mProtocolVersion = message.arg0;
                                this.mMaxData = message.arg1;
                                this.mConnectionEstablished = true;
                                notifyAll();
                            }
                        case AdbProtocol.A_STLS /* 1397511251 */:
                            sendPacket(AdbProtocol.generateStls());
                            SSLSocket sSLSocket = (SSLSocket) SslUtils.getSslContext(this.mKeyPair).getSocketFactory().createSocket(this.mSocket, this.mHost, this.mPort, true);
                            sSLSocket.startHandshake();
                            synchronized (this) {
                                this.mTlsInputStream = sSLSocket.getInputStream();
                                this.mTlsOutputStream = sSLSocket.getOutputStream();
                                this.mIsTls = true;
                            }
                        default:
                            String.format("Unrecognized command = 0x%x", Integer.valueOf(i));
                    }
                } catch (Exception e) {
                    this.mConnectionException = e;
                    e.printStackTrace();
                }
            }
        }
        synchronized (this) {
            cleanupStreams();
            notifyAll();
            this.mConnectionEstablished = false;
            this.mConnectAttempted = false;
        }
    }

    private boolean waitForConnection(long j, TimeUnit timeUnit) {
        String message;
        synchronized (this) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Objects.requireNonNull(timeUnit);
                long millis = jCurrentTimeMillis + timeUnit.toMillis(j);
                while (!this.mConnectionEstablished && this.mConnectAttempted && millis - System.currentTimeMillis() > 0) {
                    wait(millis - System.currentTimeMillis());
                }
                if (this.mConnectionEstablished) {
                    return true;
                }
                if (this.mConnectAttempted) {
                    return false;
                }
                if (this.mAuthorisationFailed) {
                    throw new AdbAuthenticationFailedException();
                }
                Exception exc = this.mConnectionException;
                if (exc == null || !(exc instanceof SSLProtocolException) || (message = exc.getMessage()) == null || !message.contains("protocol error")) {
                    throw new IOException("Connection failed");
                }
                throw ((AdbPairingRequiredException) new AdbPairingRequiredException("ADB pairing is required.").initCause(exc));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException, IOException {
        this.mSocket.close();
        this.mConnectionThread.interrupt();
        try {
            this.mConnectionThread.join();
        } catch (InterruptedException unused) {
        }
        try {
            this.mKeyPair.destroy();
        } catch (DestroyFailedException unused2) {
        }
    }

    public boolean connect() {
        return connect(LocationRequestCompat.PASSIVE_INTERVAL, TimeUnit.MILLISECONDS, false);
    }

    public void flushPacket() {
        synchronized (this.mLock) {
            getOutputStream().flush();
        }
    }

    public int getMaxData() {
        if (!this.mConnectAttempted) {
            throw new IllegalStateException("connect() must be called first");
        }
        waitForConnection(LocationRequestCompat.PASSIVE_INTERVAL, TimeUnit.MILLISECONDS);
        return this.mMaxData;
    }

    public int getProtocolVersion() {
        return this.mProtocolVersion;
    }

    public boolean isConnected() {
        return !this.mSocket.isClosed() && this.mSocket.isConnected();
    }

    public boolean isConnectionEstablished() {
        return this.mConnectionEstablished;
    }

    public AdbStream open(int i, String... strArr) {
        if (i < 1 || i > 15) {
            throw new IllegalArgumentException(ad.b(i, "Invalid service: "));
        }
        return open(LocalServices.getDestination(i, strArr));
    }

    public void sendPacket(byte[] bArr) {
        synchronized (this.mLock) {
            OutputStream outputStream = getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
        }
    }

    public void setDeviceName(String str) {
        Objects.requireNonNull(str);
        this.mDeviceName = str;
    }

    public static AdbConnection create(String str, int i, PrivateKey privateKey, Certificate certificate, int i2) {
        Objects.requireNonNull(privateKey);
        Objects.requireNonNull(certificate);
        return create(str, i, new KeyPair(privateKey, certificate), i2);
    }

    public boolean connect(long j, TimeUnit timeUnit, boolean z) {
        if (this.mConnectionEstablished) {
            throw new IllegalStateException("Already connected");
        }
        sendPacket(AdbProtocol.generateConnect(this.mApi));
        this.mConnectAttempted = true;
        this.mAbortOnUnauthorised = z;
        this.mAuthorisationFailed = false;
        this.mConnectionThread.start();
        Objects.requireNonNull(timeUnit);
        return waitForConnection(j, timeUnit);
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static class Builder {
        private int mApi;
        private Certificate mCertificate;
        private String mDeviceName;
        private String mHost;
        private KeyPair mKeyPair;
        private int mPort;
        private PrivateKey mPrivateKey;

        public Builder() {
            this.mHost = "127.0.0.1";
            this.mPort = 5555;
            this.mApi = 1;
        }

        public AdbConnection build() {
            Certificate certificate;
            if (this.mKeyPair == null) {
                PrivateKey privateKey = this.mPrivateKey;
                if (privateKey == null || (certificate = this.mCertificate) == null) {
                    throw new UnsupportedOperationException("Private key and certificate must be set.");
                }
                this.mKeyPair = new KeyPair(privateKey, certificate);
            }
            AdbConnection adbConnectionCreate = AdbConnection.create(this.mHost, this.mPort, this.mKeyPair, this.mApi);
            String str = this.mDeviceName;
            if (str != null) {
                adbConnectionCreate.setDeviceName(str);
            }
            return adbConnectionCreate;
        }

        public AdbConnection connect() throws IOException {
            AdbConnection adbConnectionBuild = build();
            if (adbConnectionBuild.connect()) {
                throw new IOException("Unable to establish a new connection.");
            }
            return adbConnectionBuild;
        }

        public Builder setApi(int i) {
            this.mApi = i;
            return this;
        }

        public Builder setCertificate(Certificate certificate) {
            this.mCertificate = certificate;
            return this;
        }

        public Builder setDeviceName(String str) {
            this.mDeviceName = str;
            return this;
        }

        public Builder setHost(String str) {
            this.mHost = str;
            return this;
        }

        public Builder setKeyPair(KeyPair keyPair) {
            this.mKeyPair = keyPair;
            return this;
        }

        public Builder setPort(int i) {
            this.mPort = i;
            return this;
        }

        public Builder setPrivateKey(PrivateKey privateKey) {
            this.mPrivateKey = privateKey;
            return this;
        }

        public AdbConnection connect(long j, TimeUnit timeUnit, boolean z) throws IOException {
            AdbConnection adbConnectionBuild = build();
            if (adbConnectionBuild.connect(j, timeUnit, z)) {
                throw new IOException("Unable to establish a new connection.");
            }
            return adbConnectionBuild;
        }

        public Builder(String str, int i) {
            this.mApi = 1;
            this.mHost = str;
            this.mPort = i;
        }
    }

    public static AdbConnection create(String str, int i, KeyPair keyPair, int i2) {
        return new AdbConnection(str, i, keyPair, i2);
    }

    public AdbStream open(String str) throws ConnectException {
        int i = this.mLastLocalId + 1;
        this.mLastLocalId = i;
        if (this.mConnectAttempted) {
            waitForConnection(LocationRequestCompat.PASSIVE_INTERVAL, TimeUnit.MILLISECONDS);
            AdbStream adbStream = new AdbStream(this, i);
            this.mOpenedStreams.put(Integer.valueOf(i), adbStream);
            Objects.requireNonNull(str);
            sendPacket(AdbProtocol.generateOpen(i, str));
            synchronized (adbStream) {
                adbStream.wait();
            }
            if (!adbStream.isClosed()) {
                return adbStream;
            }
            this.mOpenedStreams.remove(Integer.valueOf(i));
            throw new ConnectException("Stream open actively rejected by remote peer.");
        }
        throw new IllegalStateException("connect() must be called first");
    }
}
