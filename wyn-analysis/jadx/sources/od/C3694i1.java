package od;

import md.AbstractC3537e;
import md.AbstractC3556y;
import md.C3546n;
import md.EnumC3545m;

/* renamed from: od.i1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3694i1 implements md.N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3537e f41991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3703l1 f41992b;

    public C3694i1(C3703l1 c3703l1, AbstractC3537e abstractC3537e) {
        this.f41992b = c3703l1;
        this.f41991a = abstractC3537e;
    }

    @Override // md.N
    public final void a(C3546n c3546n) {
        md.M c3700k1;
        C3703l1 c3703l1 = this.f41992b;
        c3703l1.getClass();
        EnumC3545m enumC3545m = c3546n.f40701a;
        if (enumC3545m == EnumC3545m.f40696e) {
            return;
        }
        EnumC3545m enumC3545m2 = EnumC3545m.f40694c;
        EnumC3545m enumC3545m3 = EnumC3545m.f40695d;
        AbstractC3556y abstractC3556y = c3703l1.f42007f;
        if (enumC3545m == enumC3545m2 || enumC3545m == enumC3545m3) {
            abstractC3556y.i();
        }
        if (c3703l1.f42009h == enumC3545m2) {
            if (enumC3545m == EnumC3545m.f40692a) {
                return;
            }
            if (enumC3545m == enumC3545m3) {
                c3703l1.e();
                return;
            }
        }
        int iOrdinal = enumC3545m.ordinal();
        if (iOrdinal != 0) {
            AbstractC3537e abstractC3537e = this.f41991a;
            if (iOrdinal == 1) {
                c3700k1 = new C3700k1(md.K.b(abstractC3537e, null));
            } else if (iOrdinal == 2) {
                c3700k1 = new C3700k1(md.K.a(c3546n.f40702b));
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:" + enumC3545m);
                }
                c3700k1 = new C3685f1(c3703l1, abstractC3537e);
            }
        } else {
            c3700k1 = new C3700k1(md.K.f40583e);
        }
        c3703l1.f42009h = enumC3545m;
        abstractC3556y.l(enumC3545m, c3700k1);
    }
}
