package j$.util.concurrent;

import androidx.camera.video.AudioStats;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a, reason: collision with root package name */
    public long f50165a;

    /* renamed from: b, reason: collision with root package name */
    public int f50166b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f50167c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f50161d = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f50162e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public static final v f50163f = new v();

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLong f50164g = new AtomicLong(c(System.currentTimeMillis()) ^ c(System.nanoTime()));

    static {
        if (((Boolean) AccessController.doPrivileged(new j$.nio.file.j(4))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j2 = seed[0] & 255;
            for (int i2 = 1; i2 < 8; i2++) {
                j2 = (j2 << 8) | (seed[i2] & 255);
            }
            f50164g.set(j2);
        }
    }

    private ThreadLocalRandom() {
        this.f50167c = true;
    }

    public static final void a() {
        int iAddAndGet = f50162e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jC = c(f50164g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f50163f.get();
        threadLocalRandom.f50165a = jC;
        threadLocalRandom.f50166b = iAddAndGet;
    }

    public static int b(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        return (int) (((j3 ^ (j3 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    public static long c(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
        return j4 ^ (j4 >>> 33);
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f50163f.get();
        if (threadLocalRandom.f50166b == 0) {
            a();
        }
        return threadLocalRandom;
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.f50165a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    public final long d() {
        long j2 = this.f50165a - 7046029254386353131L;
        this.f50165a = j2;
        return j2;
    }

    @Override // java.util.Random
    public final int next(int i2) {
        return nextInt() >>> (32 - i2);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return b(d()) < 0;
    }

    public final double nextDouble(double d2, double d3) {
        if (d2 >= d3) {
            j$.time.f.b("bound must be greater than origin");
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d2 >= d3) {
            return dNextLong;
        }
        double d4 = ((d3 - d2) * dNextLong) + d2;
        return d4 >= d3 ? Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1) : d4;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (b(d()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f50161d;
        Double d2 = (Double) threadLocal.get();
        if (d2 != null) {
            threadLocal.set(null);
            return d2.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d3 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d3 < 1.0d && d3 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d3) * (-2.0d)) / d3);
                threadLocal.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    public int nextInt(int i2, int i3) {
        if (i2 >= i3) {
            j$.time.f.b("bound must be greater than origin");
            return 0;
        }
        int iB = b(d());
        if (i2 >= i3) {
            return iB;
        }
        int i4 = i3 - i2;
        int i5 = i4 - 1;
        if ((i4 & i5) == 0) {
            return (iB & i5) + i2;
        }
        if (i4 > 0) {
            int iB2 = iB >>> 1;
            while (true) {
                int i6 = iB2 + i5;
                int i7 = iB2 % i4;
                if (i6 - i7 >= 0) {
                    return i7 + i2;
                }
                iB2 = b(d()) >>> 1;
            }
        } else {
            while (true) {
                if (iB >= i2 && iB < i3) {
                    return iB;
                }
                iB = b(d());
            }
        }
    }

    public long nextLong(long j2, long j3) {
        if (j2 >= j3) {
            j$.time.f.b("bound must be greater than origin");
            return 0L;
        }
        long jC = c(d());
        if (j2 >= j3) {
            return jC;
        }
        long j4 = j3 - j2;
        long j5 = j4 - 1;
        if ((j4 & j5) == 0) {
            return (jC & j5) + j2;
        }
        if (j4 > 0) {
            long jC2 = jC >>> 1;
            while (true) {
                long j6 = jC2 + j5;
                long j7 = jC2 % j4;
                if (j6 - j7 >= 0) {
                    return j7 + j2;
                }
                jC2 = c(d()) >>> 1;
            }
        } else {
            while (true) {
                if (jC >= j2 && jC < j3) {
                    return jC;
                }
                jC = c(d());
            }
        }
    }

    @Override // java.util.Random
    public final void setSeed(long j2) {
        if (this.f50167c) {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ ThreadLocalRandom(int i2) {
        this();
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (c(d()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d2) {
        if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
            double dC = (c(d()) >>> 11) * 1.1102230246251565E-16d * d2;
            return dC < d2 ? dC : Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1);
        }
        j$.time.f.b("bound must be positive");
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return b(d());
    }

    @Override // java.util.Random
    public final int nextInt(int i2) {
        if (i2 > 0) {
            int iB = b(d());
            int i3 = i2 - 1;
            if ((i2 & i3) == 0) {
                return iB & i3;
            }
            while (true) {
                int i4 = iB >>> 1;
                int i5 = i4 + i3;
                int i6 = i4 % i2;
                if (i5 - i6 >= 0) {
                    return i6;
                }
                iB = b(d());
            }
        } else {
            j$.time.f.b("bound must be positive");
            return 0;
        }
    }

    @Override // java.util.Random
    public final long nextLong() {
        return c(d());
    }

    public final long nextLong(long j2) {
        if (j2 > 0) {
            long jC = c(d());
            long j3 = j2 - 1;
            if ((j2 & j3) == 0) {
                return jC & j3;
            }
            while (true) {
                long j4 = jC >>> 1;
                long j5 = j4 + j3;
                long j6 = j4 % j2;
                if (j5 - j6 >= 0) {
                    return j6;
                }
                jC = c(d());
            }
        } else {
            j$.time.f.b("bound must be positive");
            return 0L;
        }
    }
}
