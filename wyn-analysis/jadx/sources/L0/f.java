package L0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6799a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f6800b = A6.c.b(Float.NaN, Float.NaN);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6801c = 0;

    static {
        float f10 = 0;
        f6799a = A6.c.b(f10, f10);
    }

    public static final float a(long j8) {
        if (j8 != f6800b) {
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    public static final float b(long j8) {
        if (j8 != f6800b) {
            return Float.intBitsToFloat((int) (j8 >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    public static final long c(long j8, float f10) {
        return A6.c.b(b(j8) * f10, a(j8) * f10);
    }
}
