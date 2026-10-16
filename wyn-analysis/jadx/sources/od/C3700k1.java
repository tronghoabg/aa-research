package od;

import A7.C0237b0;
import md.AbstractC3537e;
import md.C3534b;

/* renamed from: od.k1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3700k1 extends md.M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42002a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f42003b;

    public C3700k1(md.K k) {
        Fe.e.t(k, "result");
        this.f42003b = k;
    }

    @Override // md.M
    public final md.K a(C3709n1 c3709n1) {
        switch (this.f42002a) {
            case 0:
                return (md.K) this.f42003b;
            default:
                md.K kA = ((md.M) this.f42003b).a(c3709n1);
                AbstractC3537e abstractC3537e = kA.f40584a;
                if (abstractC3537e == null) {
                    return kA;
                }
                C3534b c3534bC = abstractC3537e.c();
                return md.K.b(abstractC3537e, new vd.p((vd.k) c3534bC.f40613a.get(vd.r.f47216n), kA.f40585b));
        }
    }

    public String toString() {
        switch (this.f42002a) {
            case 0:
                C0237b0 c0237b0 = new C0237b0(C3700k1.class.getSimpleName());
                c0237b0.f((md.K) this.f42003b, "result");
                return c0237b0.toString();
            default:
                return super.toString();
        }
    }

    public C3700k1(md.M m10) {
        this.f42003b = m10;
    }
}
