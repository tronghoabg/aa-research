package N1;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: d, reason: collision with root package name */
    public static final Q f8081d = new Q(new P());

    /* renamed from: a, reason: collision with root package name */
    public final int f8082a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8083b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8084c;

    static {
        Q1.x.E(1);
        Q1.x.E(2);
        Q1.x.E(3);
    }

    public Q(P p10) {
        this.f8082a = p10.f8078a;
        this.f8083b = p10.f8079b;
        this.f8084c = p10.f8080c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q.class == obj.getClass()) {
            Q q4 = (Q) obj;
            if (this.f8082a == q4.f8082a && this.f8083b == q4.f8083b && this.f8084c == q4.f8084c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8082a + 31) * 31) + (this.f8083b ? 1 : 0)) * 31) + (this.f8084c ? 1 : 0);
    }
}
