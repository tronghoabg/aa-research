package E5;

/* loaded from: classes3.dex */
public abstract class W implements InterfaceC0453h {

    /* renamed from: f, reason: collision with root package name */
    public static final A5.f f3260f;

    /* renamed from: a, reason: collision with root package name */
    public final long f3261a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3262b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3263c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3264d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3265e;

    static {
        new V().a();
        f3260f = new A5.f(10);
    }

    public W(V v2) {
        this.f3261a = v2.f3255a;
        this.f3262b = v2.f3256b;
        this.f3263c = v2.f3257c;
        this.f3264d = v2.f3258d;
        this.f3265e = v2.f3259e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w2 = (W) obj;
        return this.f3261a == w2.f3261a && this.f3262b == w2.f3262b && this.f3263c == w2.f3263c && this.f3264d == w2.f3264d && this.f3265e == w2.f3265e;
    }

    public final int hashCode() {
        long j8 = this.f3261a;
        int i5 = ((int) (j8 ^ (j8 >>> 32))) * 31;
        long j10 = this.f3262b;
        return ((((((i5 + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f3263c ? 1 : 0)) * 31) + (this.f3264d ? 1 : 0)) * 31) + (this.f3265e ? 1 : 0);
    }
}
