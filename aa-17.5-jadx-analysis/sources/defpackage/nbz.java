package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class nbz implements afeh {
    final /* synthetic */ afdr a;
    final /* synthetic */ afec b;
    final /* synthetic */ ncr c;

    public nbz(afdr afdrVar, afec afecVar, ncr ncrVar) {
        this.a = afdrVar;
        this.b = afecVar;
        this.c = ncrVar;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long jAA;
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
            } else {
                jAA = 0;
            }
            float fD = atoVar.d() - dll.b(jAA);
            float fC = atoVar.c() - dll.a(jAA);
            afdr afdrVar = this.a;
            float f2 = fD + BitmapDescriptorFactory.HUE_RED;
            float f3 = fC + BitmapDescriptorFactory.HUE_RED;
            boolean z = mcd.z(f2, f3);
            bym bymVarC = byx.c(afdrVar, buxVar);
            sx sxVarF = tl.f(buxVar);
            afec afecVar = this.b;
            bvq.g(sxVarF, new ksw(sxVarF, afecVar, (afck) null, 15), buxVar);
            cct cctVarI = bxc.i(1115281302, false, mtk.c, buxVar);
            cfv cfvVar = cfy.e;
            String str = mwb.a;
            cfy cfyVarD = das.d(cfvVar, mwb.b);
            boolean z2 = afdrVar != null;
            tl.e(sxVarF, cctVarI, cfyVarD, z2, z2, false, new mzx(bymVarC, afecVar, 5), bxc.i(1835273884, true, new ndu(z, afdrVar, f2, f3, this.c, 1), buxVar), buxVar, 12583352, 32);
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
