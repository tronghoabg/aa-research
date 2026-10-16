package N1;

/* renamed from: N1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8158b;

    static {
        D9.n nVar = new D9.n(3);
        Q1.k.c(nVar.f2592b <= nVar.f2593c);
        new C0759h(nVar);
        Q1.x.E(0);
        Q1.x.E(1);
        Q1.x.E(2);
        Q1.x.E(3);
    }

    public C0759h(D9.n nVar) {
        nVar.getClass();
        this.f8157a = nVar.f2592b;
        this.f8158b = nVar.f2593c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0759h)) {
            return false;
        }
        C0759h c0759h = (C0759h) obj;
        c0759h.getClass();
        if (this.f8157a != c0759h.f8157a || this.f8158b != c0759h.f8158b) {
            return false;
        }
        int i5 = Q1.x.f9724a;
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f8157a) * 31) + this.f8158b) * 31;
    }
}
