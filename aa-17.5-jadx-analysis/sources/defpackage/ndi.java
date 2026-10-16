package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ndi implements afeh {
    final /* synthetic */ boolean a;
    final /* synthetic */ afdr b;
    final /* synthetic */ afec c;
    final /* synthetic */ afdr d;
    final /* synthetic */ asf e;
    final /* synthetic */ boolean f;
    final /* synthetic */ afeh g;
    final /* synthetic */ ndp h;
    final /* synthetic */ boolean i;
    final /* synthetic */ boolean j;
    final /* synthetic */ boolean k;
    final /* synthetic */ boolean l;
    final /* synthetic */ afdr m;
    final /* synthetic */ boolean n;
    final /* synthetic */ boolean o;
    final /* synthetic */ asf p;
    final /* synthetic */ bym q;
    final /* synthetic */ bym r;

    public ndi(boolean z, afdr afdrVar, afec afecVar, afdr afdrVar2, asf asfVar, boolean z2, afeh afehVar, ndp ndpVar, boolean z3, boolean z4, boolean z5, boolean z6, afdr afdrVar3, boolean z7, boolean z8, asf asfVar2, bym bymVar, bym bymVar2) {
        this.a = z;
        this.b = afdrVar;
        this.c = afecVar;
        this.d = afdrVar2;
        this.e = asfVar;
        this.f = z2;
        this.g = afehVar;
        this.h = ndpVar;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = afdrVar3;
        this.n = z7;
        this.o = z8;
        this.p = asfVar2;
        this.q = bymVar;
        this.r = bymVar2;
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
            if (ldz.a.a().b() && this.a) {
                float f = gjk.b.k;
                jAA = roc.aA(f, f);
            } else {
                jAA = 0;
            }
            float fD = atoVar.d() - dll.b(jAA);
            float fC = atoVar.c() - dll.a(jAA);
            afdr afdrVar = this.b;
            float f2 = fD + BitmapDescriptorFactory.HUE_RED;
            float f3 = fC + BitmapDescriptorFactory.HUE_RED;
            boolean z = mcd.z(f2, f3);
            bym bymVarC = byx.c(afdrVar, buxVar);
            sx sxVarF = tl.f(buxVar);
            afec afecVar = this.c;
            bvq.g(sxVarF, new ksw(sxVarF, afecVar, (afck) null, 16, (byte[]) null), buxVar);
            cct cctVarI = bxc.i(1115281302, false, mtk.d, buxVar);
            cfv cfvVar = cfy.e;
            String str = mwb.a;
            cfy cfyVarD = das.d(cfvVar, mwb.b);
            boolean z2 = afdrVar != null;
            tl.e(sxVarF, cctVarI, cfyVarD, z2, z2, false, new mzx(bymVarC, afecVar, 7), bxc.i(1835273884, true, new ndh(this.a, this.d, this.e, this.f, z, this.g, afdrVar, f2, f3, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r), buxVar), buxVar, 12583352, 32);
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
