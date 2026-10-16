package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ndv implements afeh {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ndv(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [afec, java.lang.Object] */
    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        long jAA = 0;
        if (i == 0) {
            ato atoVar = (ato) obj;
            bux buxVar = (bux) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != buxVar.C(atoVar) ? 2 : 4;
            }
            if (buxVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                if (ldz.a.a().b()) {
                    float f = gjk.b.k;
                    jAA = roc.aA(f, f);
                }
                float fD = atoVar.d() - dll.b(jAA);
                float fC = atoVar.c() - dll.a(jAA);
                float f2 = fD + BitmapDescriptorFactory.HUE_RED;
                float f3 = fC + BitmapDescriptorFactory.HUE_RED;
                boolean z = mcd.z(f2, f3);
                bym bymVarC = byx.c(null, buxVar);
                sx sxVarF = tl.f(buxVar);
                bvq.g(sxVarF, new nba(sxVarF, (afck) null, 2), buxVar);
                cct cctVarI = bxc.i(1115281302, false, mtk.e, buxVar);
                cfv cfvVar = cfy.e;
                String str = mwb.a;
                tl.e(sxVarF, cctVarI, das.d(cfvVar, mwb.b), false, false, false, new hko(bymVarC, 20), bxc.i(1835273884, true, new ndu(z, f2, f3, (nea) this.a, (Pattern) this.b, 0), buxVar), buxVar, 12583352, 32);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i == 1) {
            cfy cfyVar = (cfy) obj;
            bux buxVar2 = (bux) obj2;
            int iIntValue2 = ((Number) obj3).intValue();
            cfyVar.getClass();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= true != buxVar2.C(cfyVar) ? 2 : 4;
            }
            if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                mcd.i(this.b, ndj.c(this.a), cfyVar, null, BitmapDescriptorFactory.HUE_RED, 0L, 0L, 0L, false, 0L, false, buxVar2, (iIntValue2 << 6) & 896, 0, 2040);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        if (i == 2) {
            ato atoVar2 = (ato) obj;
            bux buxVar3 = (bux) obj2;
            int iIntValue3 = ((Number) obj3).intValue();
            if ((iIntValue3 & 6) == 0) {
                iIntValue3 |= true != buxVar3.C(atoVar2) ? 2 : 4;
            }
            if (buxVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                if (ldz.a.a().b()) {
                    float f4 = gjk.b.k;
                    jAA = roc.aA(f4, f4);
                }
                float fD2 = atoVar2.d() - dll.b(jAA);
                float fC2 = atoVar2.c() - dll.a(jAA);
                float f5 = fD2 + BitmapDescriptorFactory.HUE_RED;
                float f6 = fC2 + BitmapDescriptorFactory.HUE_RED;
                boolean z2 = mcd.z(f5, f6);
                bym bymVarC2 = byx.c(null, buxVar3);
                sx sxVarF2 = tl.f(buxVar3);
                ?? r6 = this.b;
                bvq.g(sxVarF2, new ksw(sxVarF2, (afec) r6, (afck) null, 17, (char[]) null), buxVar3);
                cct cctVarI2 = bxc.i(1115281302, false, mtk.g, buxVar3);
                cfv cfvVar2 = cfy.e;
                String str2 = mwb.a;
                tl.e(sxVarF2, cctVarI2, das.d(cfvVar2, mwb.b), false, false, false, new mzx(bymVarC2, r6, 11), bxc.i(1835273884, true, new nei(z2, f5, f6, (nel) this.a), buxVar3), buxVar3, 12583352, 32);
            } else {
                buxVar3.s();
            }
            return afak.a;
        }
        bux buxVar4 = (bux) obj2;
        int iIntValue4 = ((Number) obj3).intValue();
        ((abu) obj).getClass();
        if (buxVar4.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
            Object obj4 = this.a;
            ?? r0 = this.b;
            cfv cfvVar3 = cfy.e;
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar4, 0);
            int iG = a.g(buxVar4.b());
            ccx ccxVarN = buxVar4.N();
            cfy cfyVarJ = bzi.j(buxVar4, cfvVar3);
            afdr afdrVar = cwb.a;
            buxVar4.M();
            buxVar4.w();
            if (buxVar4.G()) {
                buxVar4.j(afdrVar);
            } else {
                buxVar4.y();
            }
            byq.c(buxVar4, ctpVarA, cwb.e);
            byq.c(buxVar4, ccxVarN, cwb.d);
            byq.c(buxVar4, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar4, cwb.g);
            byq.c(buxVar4, cfyVarJ, cwb.c);
            buxVar4.v(935350238);
            for (opt optVar : ((opm) obj4).c) {
                AppWidgetProviderInfo appWidgetProviderInfo = optVar.c;
                opr oprVarA = opr.a.a();
                ComponentName componentName = appWidgetProviderInfo.provider;
                componentName.getClass();
                mva.J(optVar, oprVarA.j(componentName), r0, buxVar4, 8);
            }
            buxVar4.o();
            buxVar4.n();
        } else {
            buxVar4.s();
        }
        return afak.a;
    }

    public ndv(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
