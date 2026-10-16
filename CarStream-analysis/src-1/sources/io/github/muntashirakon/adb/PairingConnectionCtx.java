package io.github.muntashirakon.adb;

import android.os.Build;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class PairingConnectionCtx implements Closeable {
    public static final String EXPORTED_KEY_LABEL = "adb-label\u0000";
    public static final int EXPORT_KEY_SIZE = 64;
    public static final String TAG = "PairingConnectionCtx";
    private final String mHost;
    private DataInputStream mInputStream;
    private DataOutputStream mOutputStream;
    private PairingAuthCtx mPairingAuthCtx;
    private final PeerInfo mPeerInfo;
    private final int mPort;
    private final byte[] mPswd;
    private final Role mRole;
    private final SSLContext mSslContext;
    private State mState;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static class PairingPacketHeader {
        public static final byte CURRENT_KEY_HEADER_VERSION = 1;
        public static final int MAX_PAYLOAD_SIZE = 16384;
        public static final byte MAX_SUPPORTED_KEY_HEADER_VERSION = 1;
        public static final byte MIN_SUPPORTED_KEY_HEADER_VERSION = 1;
        public static final byte PAIRING_PACKET_HEADER_SIZE = 6;
        public static final byte PEER_INFO = 1;
        public static final byte SPAKE2_MSG = 0;
        private final int payloadSize;
        private final byte type;
        private final byte version;

        public PairingPacketHeader(byte b, byte b2, int i) {
            this.version = b;
            this.type = b2;
            this.payloadSize = i;
        }

        public static PairingPacketHeader readFrom(ByteBuffer byteBuffer) {
            byte b = byteBuffer.get();
            byte b2 = byteBuffer.get();
            int i = byteBuffer.getInt();
            if (b < 1 || b > 1) {
                return null;
            }
            if ((b2 == 0 || b2 == 1) && i > 0 && i <= 16384) {
                return new PairingPacketHeader(b, b2, i);
            }
            return null;
        }

        public String toString() {
            return "PairingPacketHeader{version=" + ((int) this.version) + ", type=" + ((int) this.type) + ", payloadSize=" + this.payloadSize + '}';
        }

        public void writeTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.version).put(this.type).putInt(this.payloadSize);
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static class PeerInfo {
        public static final byte ADB_DEVICE_GUID = 0;
        public static final byte ADB_RSA_PUB_KEY = 0;
        public static final int MAX_PEER_INFO_SIZE = 8192;
        private final byte[] data;
        private final byte type;

        public PeerInfo(byte b, byte[] bArr) {
            byte[] bArr2 = new byte[8191];
            this.data = bArr2;
            this.type = b;
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 8191));
        }

        public static PeerInfo readFrom(ByteBuffer byteBuffer) {
            byte b = byteBuffer.get();
            byte[] bArr = new byte[8191];
            byteBuffer.get(bArr);
            return new PeerInfo(b, bArr);
        }

        public String toString() {
            return "PeerInfo{type=" + ((int) this.type) + ", data=" + Arrays.toString(this.data) + '}';
        }

        public void writeTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.type).put(this.data);
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public enum Role {
        Client,
        Server
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public enum State {
        Ready,
        ExchangingMsgs,
        ExchangingPeerInfo,
        Stopped
    }

    public PairingConnectionCtx(String str, int i, byte[] bArr, KeyPair keyPair, String str2) {
        this.mRole = Role.Client;
        this.mState = State.Ready;
        Objects.requireNonNull(str);
        this.mHost = str;
        this.mPort = i;
        Objects.requireNonNull(bArr);
        this.mPswd = bArr;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPair.getPublicKey();
        Objects.requireNonNull(str2);
        this.mPeerInfo = new PeerInfo((byte) 0, AndroidPubkey.encodeWithName(rSAPublicKey, str2));
        this.mSslContext = SslUtils.getSslContext(keyPair);
    }

    private boolean checkHeaderType(byte b, byte b2) {
        return b == b2;
    }

    private PairingPacketHeader createHeader(byte b, int i) {
        return new PairingPacketHeader((byte) 1, b, i);
    }

    private boolean doExchangeMsgs() throws IOException {
        byte[] msg = this.mPairingAuthCtx.getMsg();
        writeHeader(createHeader((byte) 0, msg.length), msg);
        PairingPacketHeader header = readHeader();
        if (header == null || !checkHeaderType((byte) 0, header.type)) {
            return false;
        }
        byte[] bArr = new byte[header.payloadSize];
        this.mInputStream.readFully(bArr);
        try {
            return this.mPairingAuthCtx.initCipher(bArr);
        } catch (Exception e) {
            throw ((IOException) new IOException().initCause(e));
        }
    }

    private boolean doExchangePeerInfo() throws IOException {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8192).order(ByteOrder.BIG_ENDIAN);
        this.mPeerInfo.writeTo(byteBufferOrder);
        byte[] bArrEncrypt = this.mPairingAuthCtx.encrypt(byteBufferOrder.array());
        if (bArrEncrypt == null) {
            return false;
        }
        writeHeader(createHeader((byte) 1, bArrEncrypt.length), bArrEncrypt);
        PairingPacketHeader header = readHeader();
        if (header == null || !checkHeaderType((byte) 1, header.type)) {
            return false;
        }
        byte[] bArr = new byte[header.payloadSize];
        this.mInputStream.readFully(bArr);
        byte[] bArrDecrypt = this.mPairingAuthCtx.decrypt(bArr);
        if (bArrDecrypt == null || bArrDecrypt.length != 8192) {
            return false;
        }
        PeerInfo.readFrom(ByteBuffer.wrap(bArrDecrypt)).toString();
        return true;
    }

    private byte[] exportKeyingMaterial(SSLSocket sSLSocket, int i) throws SSLException {
        Class<?> cls;
        try {
            if (SslUtils.isCustomConscrypt()) {
                cls = Class.forName("org.conscrypt.Conscrypt");
            } else {
                if (Build.VERSION.SDK_INT < 29) {
                    throw new SSLException("TLSv1.3 isn't supported on your platform. Use custom Conscrypt library instead.");
                }
                cls = Class.forName("com.android.org.conscrypt.Conscrypt");
            }
            return (byte[]) cls.getMethod("exportKeyingMaterial", SSLSocket.class, String.class, byte[].class, Integer.TYPE).invoke(null, sSLSocket, EXPORTED_KEY_LABEL, null, Integer.valueOf(i));
        } catch (SSLException e) {
            throw e;
        } catch (Throwable th) {
            throw new SSLException(th);
        }
    }

    private void notifyResult() {
        this.mState = State.Stopped;
    }

    private PairingPacketHeader readHeader() throws IOException {
        byte[] bArr = new byte[6];
        this.mInputStream.readFully(bArr);
        return PairingPacketHeader.readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN));
    }

    private void setupTlsConnection() throws IOException {
        Socket socketAccept = this.mRole == Role.Server ? ((SSLServerSocket) this.mSslContext.getServerSocketFactory().createServerSocket(this.mPort)).accept() : new Socket(this.mHost, this.mPort);
        socketAccept.setTcpNoDelay(true);
        SSLSocket sSLSocket = (SSLSocket) this.mSslContext.getSocketFactory().createSocket(socketAccept, this.mHost, this.mPort, true);
        sSLSocket.startHandshake();
        this.mInputStream = new DataInputStream(sSLSocket.getInputStream());
        this.mOutputStream = new DataOutputStream(sSLSocket.getOutputStream());
        byte[] bArrExportKeyingMaterial = exportKeyingMaterial(sSLSocket, 64);
        byte[] bArr = this.mPswd;
        byte[] bArr2 = new byte[bArr.length + bArrExportKeyingMaterial.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrExportKeyingMaterial, 0, bArr2, this.mPswd.length, bArrExportKeyingMaterial.length);
        PairingAuthCtx pairingAuthCtxCreateAlice = PairingAuthCtx.createAlice(bArr2);
        if (pairingAuthCtxCreateAlice == null) {
            throw new IOException("Unable to create PairingAuthCtx.");
        }
        this.mPairingAuthCtx = pairingAuthCtxCreateAlice;
    }

    private void writeHeader(PairingPacketHeader pairingPacketHeader, byte[] bArr) throws IOException {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.BIG_ENDIAN);
        pairingPacketHeader.writeTo(byteBufferOrder);
        this.mOutputStream.write(byteBufferOrder.array());
        this.mOutputStream.write(bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Arrays.fill(this.mPswd, (byte) 0);
        try {
            this.mInputStream.close();
        } catch (IOException unused) {
        }
        try {
            this.mOutputStream.close();
        } catch (IOException unused2) {
        }
        if (this.mState != State.Ready) {
            this.mPairingAuthCtx.destroy();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        throw new java.io.IOException("Connection closed with errors.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void start() throws java.io.IOException {
        /*
            r2 = this;
            io.github.muntashirakon.adb.PairingConnectionCtx$State r0 = r2.mState
            io.github.muntashirakon.adb.PairingConnectionCtx$State r1 = io.github.muntashirakon.adb.PairingConnectionCtx.State.Ready
            if (r0 != r1) goto L52
            io.github.muntashirakon.adb.PairingConnectionCtx$State r0 = io.github.muntashirakon.adb.PairingConnectionCtx.State.ExchangingMsgs
            r2.mState = r0
            r2.setupTlsConnection()
        Ld:
            io.github.muntashirakon.adb.PairingConnectionCtx$State r0 = r2.mState
            int r0 = r0.ordinal()
            if (r0 == 0) goto L4a
            r1 = 1
            if (r0 == r1) goto L34
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L4a
            goto Ld
        L1f:
            boolean r0 = r2.doExchangePeerInfo()
            if (r0 == 0) goto L29
            r2.notifyResult()
            return
        L29:
            r2.notifyResult()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Could not exchange peer info."
            r0.<init>(r1)
            throw r0
        L34:
            boolean r0 = r2.doExchangeMsgs()
            if (r0 == 0) goto L3f
            io.github.muntashirakon.adb.PairingConnectionCtx$State r0 = io.github.muntashirakon.adb.PairingConnectionCtx.State.ExchangingPeerInfo
            r2.mState = r0
            goto Ld
        L3f:
            r2.notifyResult()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Exchanging message wasn't successful."
            r0.<init>(r1)
            throw r0
        L4a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Connection closed with errors."
            r0.<init>(r1)
            throw r0
        L52:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Connection is not ready yet."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.muntashirakon.adb.PairingConnectionCtx.start():void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PairingConnectionCtx(String str, int i, byte[] bArr, PrivateKey privateKey, Certificate certificate, String str2) {
        this(str, i, bArr, new KeyPair(privateKey, certificate), str2);
        Objects.requireNonNull(privateKey);
        Objects.requireNonNull(certificate);
    }
}
