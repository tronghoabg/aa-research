package f0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2546b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f34733a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f34734b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f34735c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f34736d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34737e = 0;

    static {
        long j8 = 3;
        long j10 = j8 << 32;
        f34733a = (0 & 4294967295L) | j10;
        f34734b = (1 & 4294967295L) | j10;
        f34735c = j10 | (2 & 4294967295L);
        f34736d = (j8 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j8, long j10) {
        return j8 == j10;
    }

    public static String b(long j8) {
        return a(j8, f34733a) ? "Rgb" : a(j8, f34734b) ? "Xyz" : a(j8, f34735c) ? "Lab" : a(j8, f34736d) ? "Cmyk" : "Unknown";
    }
}
