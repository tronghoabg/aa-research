package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bmm {
    public static final csm a = new csm(null);
    public static final cvh b = new cvh(null);

    public static final void a(cfy cfyVar, long j, long j2, afeh afehVar, bux buxVar, int i) {
        int i2;
        long j3;
        afeh afehVar2;
        ckv ckvVarAr;
        afeh afehVar3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1428256508);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            j3 = j2;
            i2 |= true != buxVarC.B(j3) ? 128 : 256;
        } else {
            j3 = j2;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            float f = afehVar != null ? 16.0f : 6.0f;
            if (afehVar != null) {
                buxVarC.v(-1051024814);
                ckvVarAr = czz.ar(7, buxVarC);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1050967433);
                ckvVarAr = czz.ar(7, buxVarC);
                bvvVar.Y(false);
            }
            cfy cfyVarA = afp.E(awd.a(cfyVar, f, f), j, ckvVarAr).a(afehVar != null ? asl.I(cfy.e, 4.0f, BitmapDescriptorFactory.HUE_RED) : cfy.e);
            ctp ctpVarA = avv.a(atd.e, cfl.n, buxVarC, 54);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            avy avyVar = avy.a;
            if (afehVar != null) {
                buxVarC.v(1345815094);
                czz.ao(j3, czz.ap(12, buxVarC), bxc.i(541712501, true, new bmc(afehVar, avyVar, 2, null), buxVarC), buxVarC, ((i2 >> 6) & 14) | 384);
                bvvVar.Y(false);
                afehVar3 = afehVar;
            } else {
                afehVar3 = null;
                buxVarC.v(1346141834);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
            afehVar2 = afehVar3;
        } else {
            buxVarC.s();
            afehVar2 = afehVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ggx(cfyVar, j, j2, afehVar2, i, 1);
        }
    }
}
