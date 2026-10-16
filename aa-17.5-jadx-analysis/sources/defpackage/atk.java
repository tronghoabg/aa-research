package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class atk {
    private static final aan b = e(true);
    private static final aan c = e(false);
    private static final ctp a = atj.a;

    public static final ath a(cto ctoVar) {
        Object objG = ctoVar.g();
        if (objG instanceof ath) {
            return (ath) objG;
        }
        return null;
    }

    public static final ctp b(cfn cfnVar, boolean z) {
        ctp ctpVar = (ctp) (z ? b : c).a(cfnVar);
        return ctpVar == null ? new atl(cfnVar, z) : ctpVar;
    }

    public static final void c(cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-211209833);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            ctp ctpVar = a;
            bvv bvvVar = (bvv) buxVarC;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> 32);
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            ccx ccxVarAh = bvvVar.ah();
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVar, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ati(cfyVar, i, i4);
        }
    }

    public static final void d(cun cunVar, cuo cuoVar, cto ctoVar, dlr dlrVar, int i, int i2, cfn cfnVar) {
        cfn cfnVar2;
        ath athVarA = a(ctoVar);
        cunVar.s(cuoVar, ((athVarA == null || (cfnVar2 = athVarA.a) == null) ? cfnVar : cfnVar2).a((cuoVar.a << 32) | (cuoVar.b & 4294967295L), (i << 32) | (i2 & 4294967295L), dlrVar), BitmapDescriptorFactory.HUE_RED);
    }

    private static final aan e(boolean z) {
        aan aanVar = new aan(9);
        cfn cfnVar = cfl.a;
        aanVar.m(cfnVar, new atl(cfnVar, z));
        cfn cfnVar2 = cfl.b;
        aanVar.m(cfnVar2, new atl(cfnVar2, z));
        cfn cfnVar3 = cfl.c;
        aanVar.m(cfnVar3, new atl(cfnVar3, z));
        cfn cfnVar4 = cfl.d;
        aanVar.m(cfnVar4, new atl(cfnVar4, z));
        cfn cfnVar5 = cfl.e;
        aanVar.m(cfnVar5, new atl(cfnVar5, z));
        cfn cfnVar6 = cfl.f;
        aanVar.m(cfnVar6, new atl(cfnVar6, z));
        cfn cfnVar7 = cfl.g;
        aanVar.m(cfnVar7, new atl(cfnVar7, z));
        cfn cfnVar8 = cfl.h;
        aanVar.m(cfnVar8, new atl(cfnVar8, z));
        cfn cfnVar9 = cfl.i;
        aanVar.m(cfnVar9, new atl(cfnVar9, z));
        return aanVar;
    }
}
