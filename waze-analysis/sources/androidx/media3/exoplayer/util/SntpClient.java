package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.d.b.an;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";
    public static final int DEFAULT_TIMEOUT_MS = 1000;
    private static final int MAX_RETRY_COUNT = 10;
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TRANSMIT_TIME_OFFSET = 40;
    private static long elapsedRealtimeOffsetMs = 0;
    private static boolean isInitialized = false;
    private static long lastUpdateElapsedRealtime = -9223372036854775807L;
    private static long maxElapsedTimeUntilUpdateMs = -9223372036854775807L;
    private static String ntpHost = "time.android.com";
    private static int timeoutMs = 1000;
    private static final Object loaderLock = new Object();
    private static final Object valueLock = new Object();

    /* compiled from: WazeSource */
    public interface InitializationCallback {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    /* compiled from: WazeSource */
    final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        private final InitializationCallback callback;

        public NtpTimeCallback(InitializationCallback initializationCallback) {
            this.callback = initializationCallback;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long j2, long j3, boolean z) {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long j2, long j3) {
            if (this.callback != null) {
                boolean zIsInitialized = SntpClient.isInitialized();
                InitializationCallback initializationCallback = this.callback;
                if (zIsInitialized) {
                    initializationCallback.onInitialized();
                } else {
                    initializationCallback.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j2, long j3, IOException iOException, int i2) {
            InitializationCallback initializationCallback = this.callback;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public /* synthetic */ void onLoadStarted(Loader.Loadable loadable, long j2, long j3, int i2) {
        }
    }

    /* compiled from: WazeSource */
    final class NtpTimeLoadable implements Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() {
            synchronized (SntpClient.loaderLock) {
                synchronized (SntpClient.valueLock) {
                    if (SntpClient.isInitialized) {
                        return;
                    }
                    long jLoadNtpTimeOffsetMs = SntpClient.loadNtpTimeOffsetMs();
                    synchronized (SntpClient.valueLock) {
                        SntpClient.lastUpdateElapsedRealtime = SystemClock.elapsedRealtime();
                        SntpClient.elapsedRealtimeOffsetMs = jLoadNtpTimeOffsetMs;
                        SntpClient.isInitialized = true;
                    }
                }
            }
        }
    }

    private SntpClient() {
    }

    private static void checkValidServerReply(byte b2, byte b3, int i2, long j2) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b3));
        }
        if (i2 == 0 || i2 > 15) {
            throw new IOException("SNTP: Untrusted stratum: " + i2);
        }
        if (j2 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j2;
        synchronized (valueLock) {
            j2 = isInitialized ? elapsedRealtimeOffsetMs : C.TIME_UNSET;
        }
        return j2;
    }

    public static long getMaxElapsedTimeUntilUpdateMs() {
        long j2;
        synchronized (valueLock) {
            j2 = maxElapsedTimeUntilUpdateMs;
        }
        return j2;
    }

    public static String getNtpHost() {
        String str;
        synchronized (valueLock) {
            str = ntpHost;
        }
        return str;
    }

    public static int getTimeoutMs() {
        int i2;
        synchronized (valueLock) {
            i2 = timeoutMs;
        }
        return i2;
    }

    public static void initialize(Loader loader, InitializationCallback initializationCallback) {
        if (isInitialized()) {
            if (initializationCallback != null) {
                initializationCallback.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.startLoading(new NtpTimeLoadable(), new NtpTimeCallback(initializationCallback), 1);
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (valueLock) {
            if (lastUpdateElapsedRealtime != C.TIME_UNSET && maxElapsedTimeUntilUpdateMs != C.TIME_UNSET) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - lastUpdateElapsedRealtime;
                boolean z2 = false;
                if (isInitialized && jElapsedRealtime < maxElapsedTimeUntilUpdateMs) {
                    z2 = true;
                }
                isInitialized = z2;
            }
            z = isInitialized;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(getTimeoutMs());
            InetAddress[] allByName = InetAddress.getAllByName(getNtpHost());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i2], 123);
                bArr[0] = StylePropertiesKt.RotationYId;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                writeTimestamp(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j2 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b2 = bArr[0];
                    int i4 = bArr[1] & 255;
                    long timestamp = readTimestamp(bArr, 24);
                    long timestamp2 = readTimestamp(bArr, 32);
                    long timestamp3 = readTimestamp(bArr, 40);
                    checkValidServerReply((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i4, timestamp3);
                    long j3 = (j2 + (((timestamp2 - timestamp) + (timestamp3 - j2)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j3;
                } catch (SocketTimeoutException e2) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e2;
                    } else {
                        socketTimeoutException.addSuppressed(e2);
                    }
                    int i5 = i3 + 1;
                    if (i3 >= 10) {
                        break;
                    }
                    i2++;
                    i3 = i5;
                }
            }
            an.B(socketTimeoutException);
            throw socketTimeoutException;
        } finally {
        }
    }

    private static long read32(byte[] bArr, int i2) {
        int i3 = bArr[i2];
        int i4 = i3 & 128;
        int i5 = i2 + 3;
        int i6 = i2 + 2;
        int i7 = bArr[i2 + 1];
        int i8 = bArr[i6];
        int i9 = bArr[i5];
        if (i4 == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i7 & 128) == 128) {
            i7 = (i7 & 127) + 128;
        }
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        if ((i9 & 128) == 128) {
            i9 = (i9 & 127) + 128;
        }
        return (i3 << 24) + (i7 << 16) + (i8 << 8) + i9;
    }

    private static long readTimestamp(byte[] bArr, int i2) {
        long j2 = read32(bArr, i2);
        long j3 = read32(bArr, i2 + 4);
        if (j2 == 0) {
            if (j3 == 0) {
                return 0L;
            }
            j2 = 0;
        }
        return ((j2 - 2208988800L) * 1000) + ((j3 * 1000) / 4294967296L);
    }

    public static void setMaxElapsedTimeUntilUpdateMs(long j2) {
        synchronized (valueLock) {
            maxElapsedTimeUntilUpdateMs = j2;
        }
    }

    public static void setNtpHost(String str) {
        synchronized (valueLock) {
            if (!ntpHost.equals(str)) {
                ntpHost = str;
                isInitialized = false;
            }
        }
    }

    public static void setTimeoutMs(int i2) {
        synchronized (valueLock) {
            if (timeoutMs != i2) {
                timeoutMs = i2;
                isInitialized = false;
            }
        }
    }

    private static void writeTimestamp(byte[] bArr, int i2, long j2) {
        if (j2 == 0) {
            Arrays.fill(bArr, i2, i2 + 8, (byte) 0);
            return;
        }
        long j3 = j2 / 1000;
        long j4 = OFFSET_1900_TO_1970 + j3;
        bArr[i2] = (byte) (j4 >> 24);
        bArr[i2 + 1] = (byte) (j4 >> 16);
        bArr[i2 + 2] = (byte) (j4 >> 8);
        bArr[i2 + 3] = (byte) j4;
        long j5 = ((j2 - (j3 * 1000)) * 4294967296L) / 1000;
        bArr[i2 + 4] = (byte) (j5 >> 24);
        bArr[i2 + 5] = (byte) (j5 >> 16);
        bArr[i2 + 6] = (byte) (j5 >> 8);
        bArr[i2 + 7] = (byte) (Math.random() * 255.0d);
    }
}
