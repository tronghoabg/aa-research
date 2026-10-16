package defpackage;

import androidx.car.app.model.TemplateWrapper;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final class hev {
    public static final void a(List list, hjm hjmVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-3068297);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.A(hjmVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i4 = i2 << 3;
            int i5 = (i2 >> 6) & 14;
            int i6 = i4 & 112;
            if (hjmVar == hjm.c) {
                buxVarC.v(-1213105523);
                hir hirVar = gux.e(buxVarC).c;
                fxi.b(cfyVar, list, 2, 24.0f, buxVarC, i5 | 384 | i6, 0);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1212899311);
                cfm cfmVar = cfl.k;
                hir hirVar2 = gux.e(buxVarC).c;
                fxy.b(cfyVar, list, cfmVar, false, 2, 24.0f, null, buxVarC, i5 | 24960 | i6, 72);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu(list, hjmVar, cfyVar, i, 12, (char[]) null);
        }
    }

    public static final void b(hfc hfcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(755202552);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(hfcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfyVar2 = cfyVar;
            hkr.b(cfyVar2, gvq.f(hfcVar.a), null, null, asl.K(gux.e(buxVarC).a.g, BitmapDescriptorFactory.HUE_RED, 2), bxc.i(2139048118, true, new fun(hfcVar, (hjo) buxVarC.f(hjp.a), 11, null), buxVarC), buxVarC, ((i2 >> 3) & 14) | 196608, 12);
        } else {
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hfcVar, cfyVar2, i, i4);
        }
    }

    public static final gmw c(wb wbVar, geu geuVar) {
        TemplateWrapper templateWrapperB = hmh.a.b(geuVar, TemplateWrapper.wrap(wbVar));
        return templateWrapperB.getTemplate() instanceof gmw ? (gmw) templateWrapperB.getTemplate() : (gmw) ((gyy) geuVar.F(gyy.class)).a(templateWrapperB.getTemplate(), geuVar);
    }
}
