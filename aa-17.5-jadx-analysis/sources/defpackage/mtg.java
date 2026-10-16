package defpackage;

import android.os.Bundle;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class mtg implements afeg {
    final /* synthetic */ bwq a;
    final /* synthetic */ afdr b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ Bundle e;
    final /* synthetic */ dom f;

    public mtg(bwq bwqVar, dom domVar, afdr afdrVar, float f, float f2, Bundle bundle) {
        this.a = bwqVar;
        this.f = domVar;
        this.b = afdrVar;
        this.c = f;
        this.d = f2;
        this.e = bundle;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        bux buxVar = (bux) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && buxVar.H()) {
            buxVar.s();
        } else {
            this.a.b(afak.a);
            dom domVar = this.f;
            int i = domVar.b;
            domVar.g();
            buxVar.v(1305321102);
            boolean zC = buxVar.C(null);
            Object objG = buxVar.g();
            if (zC || objG == buw.a) {
                gge ggeVar = new gge(5);
                lah lahVar = byj.a;
                objG = new bvk(ggeVar, null);
                buxVar.x(objG);
            }
            new mwa(this.c, this.d, BitmapDescriptorFactory.HUE_RED, (bym) objG, domVar, null);
            buxVar.v(1911936940);
            cfy cfyVarG = cjn.g(awd.c(cfy.e, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, czz.au(buxVar).c, true, 0, 1042431);
            Bundle bundle = this.e;
            vo voVarD = dtv.d(buxVar);
            eps epsVar = (eps) dyz.c(((eqa) buxVar.f(erz.a)).getLifecycle(), buxVar).a();
            Object objG2 = buxVar.g();
            if (objG2 == buw.a) {
                objG2 = muo.b;
                buxVar.x(objG2);
            }
            dtk.i(jvm.class, cfyVarG, voVarD, bundle, epsVar, (afec) objG2, buxVar, 0);
            buxVar.o();
            buxVar.o();
            if (domVar.b != i) {
                buxVar.v(1658858795);
                buxVar.r(this.b);
                buxVar.o();
            } else {
                buxVar.v(1659148056);
                buxVar.o();
            }
        }
        return afak.a;
    }
}
