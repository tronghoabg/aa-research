package od;

import A7.C0237b0;

/* renamed from: od.e1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3682e1 extends md.M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41946a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41947b;

    public C3682e1(md.K k) {
        Fe.e.t(k, "result");
        this.f41947b = k;
    }

    @Override // md.M
    public final md.K a(C3709n1 c3709n1) {
        switch (this.f41946a) {
            case 0:
                return (md.K) this.f41947b;
            default:
                return md.K.a((md.k0) this.f41947b);
        }
    }

    public String toString() {
        switch (this.f41946a) {
            case 0:
                C0237b0 c0237b0 = new C0237b0(C3682e1.class.getSimpleName());
                c0237b0.f((md.K) this.f41947b, "result");
                return c0237b0.toString();
            default:
                return super.toString();
        }
    }

    public C3682e1(md.k0 k0Var) {
        this.f41947b = k0Var;
    }
}
