package p2;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;

/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3759b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f43198a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f43199b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f43200c;

    /* renamed from: d, reason: collision with root package name */
    public static long f43201d;

    public static long a() {
        byte b5;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            synchronized (f43199b) {
            }
            datagramSocket.setSoTimeout(1000);
            c();
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b10 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i5 = 0;
            int i10 = 0;
            while (i5 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i5], 123);
                bArr2[b10] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b10);
                    b5 = b10;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j8 = jCurrentTimeMillis / 1000;
                    Long.signum(j8);
                    long j10 = jCurrentTimeMillis - (j8 * 1000);
                    b5 = b10;
                    socketTimeoutException = socketTimeoutException2;
                    long j11 = j8 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j11 >> 24);
                    bArr[41] = (byte) (j11 >> 16);
                    bArr[42] = (byte) (j11 >> 8);
                    bArr[43] = (byte) j11;
                    long j12 = (j10 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j12 >> 24);
                    bArr[45] = (byte) (j12 >> 16);
                    bArr[46] = (byte) (j12 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j13 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b11 = bArr3[b5];
                    int i11 = bArr3[1] & ForkServer.ERROR;
                    long jE = e(24, bArr3);
                    long jE2 = e(32, bArr3);
                    long jE3 = e(40, bArr3);
                    b((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), i11, jE3);
                    long j14 = (j13 + (((jE3 - j13) + (jE2 - jE)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j14;
                } catch (SocketTimeoutException e7) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e7;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e7);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i12 = i10 + 1;
                    if (i10 >= 10) {
                        break;
                    }
                    i5++;
                    i10 = i12;
                    b10 = b5;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void b(byte b5, byte b10, int i5, long j8) throws IOException {
        if (b5 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new IOException(AbstractC3256n.g(b10, "SNTP: Untrusted mode: "));
        }
        if (i5 == 0 || i5 > 15) {
            throw new IOException(AbstractC3256n.g(i5, "SNTP: Untrusted stratum: "));
        }
        if (j8 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void c() {
        synchronized (f43199b) {
        }
    }

    public static long d(int i5, byte[] bArr) {
        int i10 = bArr[i5];
        int i11 = bArr[i5 + 1];
        int i12 = bArr[i5 + 2];
        int i13 = bArr[i5 + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
    }

    public static long e(int i5, byte[] bArr) {
        long jD = d(i5, bArr);
        long jD2 = d(i5 + 4, bArr);
        if (jD == 0 && jD2 == 0) {
            return 0L;
        }
        return ((jD2 * 1000) / 4294967296L) + ((jD - 2208988800L) * 1000);
    }
}
