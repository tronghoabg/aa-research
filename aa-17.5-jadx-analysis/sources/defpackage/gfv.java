package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class gfv implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    private final /* synthetic */ int j;

    public /* synthetic */ gfv(cfy cfyVar, axr axrVar, avp avpVar, atc atcVar, cfm cfmVar, aom aomVar, boolean z, aiu aiuVar, afec afecVar, int i) {
        this.j = i;
        this.f = cfyVar;
        this.c = axrVar;
        this.e = avpVar;
        this.d = atcVar;
        this.g = cfmVar;
        this.i = aomVar;
        this.b = z;
        this.h = aiuVar;
        this.a = afecVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [avp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [cfm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [aom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [ase, asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [hju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v4, types: [cfy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ckv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [avp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [atc, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        cfy cfyVar;
        cfv cfvVarBe;
        cfy cfyVarJ;
        afdr afdrVar;
        Object obj3;
        ajh ajhVar;
        int i = this.j;
        int i2 = 4;
        if (i == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                Object obj4 = this.c;
                buxVar.t(-363495132, this.a);
                long j = ((cjv) buxVar.f(ggf.a)).a;
                cfy cfyVar2 = cfy.e;
                gfy gfyVar = (gfy) obj4;
                cfy cfyVarG = ((Number) gfyVar.a().d()).floatValue() < 1.0f ? cjn.g(cfyVar2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((Number) gfyVar.a().d()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 0, 1048571) : cfyVar2;
                ?? r5 = this.i;
                ?? r8 = this.h;
                Object obj5 = this.f;
                Object obj6 = this.e;
                Object obj7 = this.d;
                boolean z = this.b;
                cil cilVar = (cil) obj7;
                gvl gvlVar = (gvl) obj5;
                bqp.b(cfyVarG, null, j, 0L, BitmapDescriptorFactory.HUE_RED, null, bxc.i(-410232931, true, new hjg(gfyVar, (cil) obj6, cilVar, gvlVar, (cfy) r5, (cfy) r8, 1), buxVar), buxVar, 122);
                if (z) {
                    buxVar.v(1618684048);
                    cfyVar2.getClass();
                    obj6.getClass();
                    if (obj7 != null) {
                        cfyVar = cfyVar2;
                        cfvVarBe = ca.be(bxc.j(cfyVar, cilVar));
                    } else {
                        cfyVar = cfyVar2;
                        cfvVarBe = cfyVar;
                    }
                    int iOrdinal = gvlVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1 || iOrdinal == 2) {
                            cfyVarJ = fxi.j(cfyVar, new fzl(obj6, 5));
                        } else {
                            if (iOrdinal != 3 && iOrdinal != 4) {
                                throw new aezs();
                            }
                            cfyVarJ = fxi.j(cfyVar, new fzl(obj6, 6));
                        }
                        cfyVar = cfyVarJ;
                    }
                    fwl.i(((gve) this.g).a().b(), cfvVarBe.a(cfyVar), r8, buxVar, 0);
                    buxVar.o();
                } else {
                    buxVar.v(1619080941);
                    buxVar.o();
                }
                buxVar.m();
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i != 1) {
            bux buxVar2 = (bux) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                Object obj8 = this.a;
                boolean zC = buxVar2.C(obj8);
                Object objG = buxVar2.g();
                if (zC || objG == buw.a) {
                    objG = new kut(obj8, i2);
                    buxVar2.x(objG);
                }
                Object obj9 = this.h;
                boolean z2 = this.b;
                ?? r11 = this.i;
                awx.c(this.f, (axr) this.c, this.e, this.d, this.g, r11, z2, (aiu) obj9, (afec) objG, buxVar2, 0, 0);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        bux buxVar3 = (bux) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
            ?? r1 = this.f;
            fwy fwyVar = (fwy) r1;
            afdr afdrVar2 = fwyVar.d;
            if (afdrVar2 == null) {
                buxVar3.v(-1614309574);
                Object objG2 = buxVar3.g();
                if (objG2 == buw.a) {
                    objG2 = new fwp(4);
                    buxVar3.x(objG2);
                }
                buxVar3.o();
                afdrVar = (afdr) objG2;
            } else {
                buxVar3.v(-1714643015);
                buxVar3.o();
                afdrVar = afdrVar2;
            }
            ?? r14 = this.h;
            ?? r7 = this.c;
            Object obj10 = this.a;
            cfy cfyVarA = fww.a(gzj.e(this.e, r1));
            fxe fxeVar = (fxe) obj10;
            long j2 = ((cjv) fxeVar.j.invoke(buxVar3, 0)).a;
            float f = gux.g(buxVar3).f.c;
            ggi ggiVar = new ggi(f, f, f);
            long j3 = ((cjv) fxeVar.k.invoke(buxVar3, 0)).a;
            float f2 = (gux.g(buxVar3).f.c - 1.0f) + BitmapDescriptorFactory.HUE_RED;
            cfy cfyVarA2 = ggh.a(cfyVarA, r7, j2, j3, ggiVar, new ggi(f2, f2, f2), r14, false, false, buxVar3, 113246208, 0);
            boolean z3 = fwyVar.e && afdrVar2 != null;
            Object obj11 = this.d;
            afdr afdrVar3 = afdrVar;
            bmn bmnVar = new bmn(((cjv) fxeVar.h.invoke(buxVar3, 0)).a, ((cjv) fxeVar.i.invoke(buxVar3, 0)).a, ((cjv) fxeVar.l.invoke(buxVar3, 0)).a, ((cjv) fxeVar.m.invoke(buxVar3, 0)).a);
            if (obj11 == null) {
                buxVar3.v(-1714617353);
                avp avpVar = bmo.a;
                bmr bmrVar = new bmr(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
                buxVar3.o();
                obj3 = bmrVar;
            } else {
                buxVar3.v(-1714618221);
                buxVar3.o();
                obj3 = obj11;
            }
            fwx fwxVar = (fwx) this.g;
            afeg afegVar = fwxVar.k;
            if (afegVar == null) {
                buxVar3.v(-1613393773);
                buxVar3.o();
                ajhVar = null;
            } else {
                buxVar3.v(-1714612946);
                ajhVar = (ajh) afegVar.invoke(buxVar3, 0);
                buxVar3.o();
            }
            czz.aw(afdrVar3, cfyVarA2, z3, r7, bmnVar, (bmr) obj3, ajhVar, this.i, r14, bxc.i(945387382, true, new kkx(fwyVar, fwxVar, this.b, 1), buxVar3), buxVar3, 805306368, 0);
        } else {
            buxVar3.s();
        }
        return afak.a;
    }

    public /* synthetic */ gfv(fwy fwyVar, cfy cfyVar, fxe fxeVar, ckv ckvVar, asf asfVar, bmr bmrVar, fwx fwxVar, avp avpVar, boolean z, int i) {
        this.j = i;
        this.f = fwyVar;
        this.e = cfyVar;
        this.a = fxeVar;
        this.c = ckvVar;
        this.h = asfVar;
        this.d = bmrVar;
        this.g = fwxVar;
        this.i = avpVar;
        this.b = z;
    }

    public /* synthetic */ gfv(Object obj, gfy gfyVar, boolean z, cil cilVar, cil cilVar2, gvl gvlVar, gve gveVar, cfy cfyVar, cfy cfyVar2, int i) {
        this.j = i;
        this.a = obj;
        this.c = gfyVar;
        this.b = z;
        this.d = cilVar;
        this.e = cilVar2;
        this.f = gvlVar;
        this.g = gveVar;
        this.h = cfyVar;
        this.i = cfyVar2;
    }
}
