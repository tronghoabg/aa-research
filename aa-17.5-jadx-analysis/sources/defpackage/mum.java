package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final /* synthetic */ class mum implements afeg {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mum(float f, dlr dlrVar, afeg afegVar, int i) {
        this.d = i;
        this.a = f;
        this.c = dlrVar;
        this.b = afegVar;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [avx, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = 1;
        if (this.d != 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            int i3 = iIntValue & 1;
            avp avpVar = bmf.a;
            if (buxVar.I(i2 != 2, i3)) {
                ca.ao(null, atd.g(8.0f), atd.g(this.a), null, 0, 0, bxc.i(879927511, true, new fun(this.c, this.b, i, null), buxVar), buxVar, 1572864, 57);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        int i4 = iIntValue2 & 3;
        if (buxVar2.I(i4 != 2, iIntValue2 & 1)) {
            Object obj3 = this.c;
            float f = this.a;
            ?? r14 = this.b;
            if (lec.a.a().e()) {
                buxVar2.v(1514175049);
                cfy cfyVarB = r14.b(cfy.e, f, true);
                vo voVarD = dtv.d(buxVar2);
                eps epsVar = (eps) dyz.c(((eqa) buxVar2.f(erz.a)).getLifecycle(), buxVar2).a();
                Object objG = buxVar2.g();
                if (objG == buw.a) {
                    objG = muo.a;
                    buxVar2.x(objG);
                }
                dtk.i(mur.class, cfyVarB, voVarD, (Bundle) obj3, epsVar, (afec) objG, buxVar2, 0);
                buxVar2.o();
            } else {
                buxVar2.v(1514355469);
                cfy cfyVarB2 = r14.b(cfy.e, f, true);
                vo voVarD2 = dtv.d(buxVar2);
                eps epsVar2 = (eps) dyz.c(((eqa) buxVar2.f(erz.a)).getLifecycle(), buxVar2).a();
                Object objG2 = buxVar2.g();
                if (objG2 == buw.a) {
                    objG2 = muo.c;
                    buxVar2.x(objG2);
                }
                dtk.i(msx.class, cfyVarB2, voVarD2, (Bundle) obj3, epsVar2, (afec) objG2, buxVar2, 0);
                buxVar2.o();
            }
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ mum(avx avxVar, float f, Bundle bundle, int i) {
        this.d = i;
        this.b = avxVar;
        this.a = f;
        this.c = bundle;
    }
}
