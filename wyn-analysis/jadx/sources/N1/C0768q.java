package N1;

/* renamed from: N1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0768q {

    /* renamed from: a, reason: collision with root package name */
    public final long f8258a;

    static {
        new C0768q(new J5.n(3));
        Q1.x.E(0);
        Q1.x.E(1);
        Q1.x.E(2);
        Q1.x.E(3);
        Q1.x.E(4);
        Q1.x.E(5);
        Q1.x.E(6);
    }

    public C0768q(J5.n nVar) {
        nVar.getClass();
        int i5 = Q1.x.f9724a;
        this.f8258a = nVar.f5655a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0768q)) {
            return false;
        }
        C0768q c0768q = (C0768q) obj;
        c0768q.getClass();
        return this.f8258a == c0768q.f8258a;
    }

    public final int hashCode() {
        long j8 = this.f8258a;
        return ((((int) 0) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 29791;
    }
}
