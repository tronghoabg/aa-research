package N1;

/* loaded from: classes.dex */
public abstract class E extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f8029a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8030b;

    static {
        N0.a.k(0, 1, 2, 3, 4);
        Q1.x.E(5);
    }

    public E(int i5, long j8, Throwable th, String str) {
        super(str, th);
        this.f8029a = i5;
        this.f8030b = j8;
    }
}
