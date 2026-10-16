package j$.util.concurrent;

import j$.util.stream.C2985m0;
import j$.util.stream.D;
import j$.util.stream.IntStream;
import j$.util.stream.L3;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a, reason: collision with root package name */
    long f37809a;

    /* renamed from: b, reason: collision with root package name */
    int f37810b;

    /* renamed from: c, reason: collision with root package name */
    boolean f37811c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f37805d = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicInteger f37806e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f37807f = new w();

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicLong f37808g = new AtomicLong(h(System.currentTimeMillis()) ^ h(System.nanoTime()));

    /* synthetic */ ThreadLocalRandom(int i5) {
        this();
    }

    private static int g(long j8) {
        long j10 = (j8 ^ (j8 >>> 33)) * (-49064778989728563L);
        return (int) (((j10 ^ (j10 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j8) {
        long j10 = (j8 ^ (j8 >>> 33)) * (-49064778989728563L);
        long j11 = (j10 ^ (j10 >>> 33)) * (-4265267296055464877L);
        return j11 ^ (j11 >>> 33);
    }

    private ThreadLocalRandom() {
        this.f37811c = true;
    }

    static final void f() {
        int iAddAndGet = f37806e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jH = h(f37808g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f37807f.get();
        threadLocalRandom.f37809a = jH;
        threadLocalRandom.f37810b = iAddAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f37807f.get();
        if (threadLocalRandom.f37810b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j8) {
        if (this.f37811c) {
            throw new UnsupportedOperationException();
        }
    }

    final long i() {
        long j8 = this.f37809a - 7046029254386353131L;
        this.f37809a = j8;
        return j8;
    }

    @Override // java.util.Random
    protected final int next(int i5) {
        return nextInt() >>> (32 - i5);
    }

    final long e(long j8, long j10) {
        long jH = h(i());
        if (j8 >= j10) {
            return jH;
        }
        long j11 = j10 - j8;
        long j12 = j11 - 1;
        if ((j11 & j12) == 0) {
            return (jH & j12) + j8;
        }
        if (j11 > 0) {
            while (true) {
                long j13 = jH >>> 1;
                long j14 = j13 + j12;
                long j15 = j13 % j11;
                if (j14 - j15 >= 0) {
                    return j15 + j8;
                }
                jH = h(i());
            }
        } else {
            while (true) {
                if (jH >= j8 && jH < j10) {
                    return jH;
                }
                jH = h(i());
            }
        }
    }

    final int d(int i5, int i10) {
        int iG = g(i());
        if (i5 >= i10) {
            return iG;
        }
        int i11 = i10 - i5;
        int i12 = i11 - 1;
        if ((i11 & i12) == 0) {
            return (iG & i12) + i5;
        }
        if (i11 > 0) {
            int iG2 = iG >>> 1;
            while (true) {
                int i13 = iG2 + i12;
                int i14 = iG2 % i11;
                if (i13 - i14 >= 0) {
                    return i14 + i5;
                }
                iG2 = g(i()) >>> 1;
            }
        } else {
            while (true) {
                if (iG >= i5 && iG < i10) {
                    return iG;
                }
                iG = g(i());
            }
        }
    }

    final double c(double d3, double d5) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d3 >= d5) {
            return dNextLong;
        }
        double d10 = ((d5 - d3) * dNextLong) + d3;
        return d10 >= d5 ? Double.longBitsToDouble(Double.doubleToLongBits(d5) - 1) : d10;
    }

    @Override // java.util.Random
    public int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iG = g(i());
        int i10 = i5 - 1;
        if ((i5 & i10) == 0) {
            return iG & i10;
        }
        while (true) {
            int i11 = iG >>> 1;
            int i12 = i11 + i10;
            int i13 = i11 % i5;
            if (i12 - i13 >= 0) {
                return i13;
            }
            iG = g(i());
        }
    }

    public int nextInt(int i5, int i10) {
        if (i5 >= i10) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return d(i5, i10);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    public long nextLong(long j8) {
        if (j8 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long jH = h(i());
        long j10 = j8 - 1;
        if ((j8 & j10) == 0) {
            return jH & j10;
        }
        while (true) {
            long j11 = jH >>> 1;
            long j12 = j11 + j10;
            long j13 = j11 % j8;
            if (j12 - j13 >= 0) {
                return j13;
            }
            jH = h(i());
        }
    }

    public long nextLong(long j8, long j10) {
        if (j8 >= j10) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return e(j8, j10);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d3) {
        if (d3 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double dH = (h(i()) >>> 11) * 1.1102230246251565E-16d * d3;
        return dH < d3 ? dH : Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1);
    }

    public final double nextDouble(double d3, double d5) {
        if (d3 >= d5) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return c(d3, d5);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f37805d;
        Double d3 = (Double) threadLocal.get();
        if (d3 != null) {
            threadLocal.set(null);
            return d3.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d5 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d5 < 1.0d && d5 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d5) * (-2.0d)) / d5);
                threadLocal.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j8) {
        if (j8 >= 0) {
            return IntStream.Wrapper.convert(L3.b(new z(0L, j8, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints() {
        return IntStream.Wrapper.convert(L3.b(new z(0L, Long.MAX_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j8, int i5, int i10) {
        if (j8 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i5 < i10) {
            return IntStream.Wrapper.convert(L3.b(new z(0L, j8, i5, i10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i5, int i10) {
        if (i5 < i10) {
            return IntStream.Wrapper.convert(L3.b(new z(0L, Long.MAX_VALUE, i5, i10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j8) {
        if (j8 >= 0) {
            return C2985m0.k(L3.c(new A(0L, j8, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C2985m0.k(L3.c(new A(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j8, long j10, long j11) {
        if (j8 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j10 < j11) {
            return C2985m0.k(L3.c(new A(0L, j8, j10, j11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j8, long j10) {
        if (j8 < j10) {
            return C2985m0.k(L3.c(new A(0L, Long.MAX_VALUE, j8, j10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j8) {
        if (j8 >= 0) {
            return D.k(L3.a(new y(0L, j8, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return D.k(L3.a(new y(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j8, double d3, double d5) {
        if (j8 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d3 < d5) {
            return D.k(L3.a(new y(0L, j8, d3, d5)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d3, double d5) {
        if (d3 < d5) {
            return D.k(L3.a(new y(0L, Long.MAX_VALUE, d3, d5)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    static final int b() {
        return ((ThreadLocalRandom) f37807f.get()).f37810b;
    }

    static final int a(int i5) {
        int i10 = i5 ^ (i5 << 13);
        int i11 = i10 ^ (i10 >>> 17);
        int i12 = i11 ^ (i11 << 5);
        ((ThreadLocalRandom) f37807f.get()).f37810b = i12;
        return i12;
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j8 = seed[0] & 255;
            for (int i5 = 1; i5 < 8; i5++) {
                j8 = (j8 << 8) | (seed[i5] & 255);
            }
            f37808g.set(j8);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.f37809a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
