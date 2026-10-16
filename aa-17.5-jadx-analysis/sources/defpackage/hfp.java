package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class hfp implements afeg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ hfp(int i, axr axrVar, afeg afegVar, kwp kwpVar, byb bybVar, byd bydVar, byd bydVar2, bym bymVar, int i2) {
        this.i = i2;
        this.a = i;
        this.c = axrVar;
        this.b = afegVar;
        this.f = kwpVar;
        this.d = bybVar;
        this.e = bydVar;
        this.g = bydVar2;
        this.h = bymVar;
    }

    /* JADX WARN: Type inference failed for: r13v18, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) throws dpm {
        int i = this.i;
        if (i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i2 = this.a;
            Object obj3 = this.g;
            Object obj4 = this.f;
            Object obj5 = this.e;
            Object obj6 = this.d;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = 613566756 & i3;
            hft.d((dom) this.h, (hge) this.b, (doj) this.c, (doj) obj6, (doj) obj5, (hga) obj4, (doj) obj3, buxVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | (i5 & (i4 + i4)));
            return afak.a;
        }
        if (i == 1) {
            bux buxVar2 = (bux) obj;
            ((Integer) obj2).intValue();
            int i6 = this.a;
            Object obj7 = this.g;
            Object obj8 = this.b;
            Object obj9 = this.f;
            Object obj10 = this.e;
            int i7 = i6 | 1;
            int i8 = i7 & 306783378;
            int i9 = 613566756 & i7;
            hft.h((dom) this.h, (doj) this.c, (doj) this.d, (doj) obj10, (hga) obj9, (hge) obj8, (doj) obj7, buxVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | (i9 & (i8 + i8)));
            return afak.a;
        }
        if (i == 2) {
            bux buxVar3 = (bux) obj;
            ((Integer) obj2).intValue();
            int i10 = this.a;
            Object obj11 = this.d;
            Object obj12 = this.c;
            Object obj13 = this.f;
            int i11 = i10 | 1;
            int i12 = i11 & 306783378;
            int i13 = 613566756 & i11;
            hft.g((dom) this.h, (doj) this.e, (doj) this.g, this.b, (hgc) obj13, (cil) obj12, (cil) obj11, buxVar3, (i11 & (-920350135)) | i12 | (i13 >> 1) | (i13 & (i12 + i12)));
            return afak.a;
        }
        if (i == 3) {
            bux buxVar4 = (bux) obj;
            ((Integer) obj2).intValue();
            int i14 = this.a;
            ?? r6 = this.b;
            Object obj14 = this.g;
            Object obj15 = this.f;
            Object obj16 = this.e;
            int i15 = i14 | 1;
            int i16 = 306783378 & i15;
            int i17 = 613566756 & i15;
            hji.a((hiu) this.d, (bry) this.c, (hje) this.h, (hix) obj16, (hjf) obj15, (hja) obj14, r6, buxVar4, (i15 & (-920350135)) | i16 | (i17 >> 1) | (i17 & (i16 + i16)));
            return afak.a;
        }
        if (i == 4) {
            bux buxVar5 = (bux) obj;
            ((Integer) obj2).intValue();
            int i18 = this.a;
            Object obj17 = this.h;
            Object obj18 = this.g;
            Object obj19 = this.e;
            Object obj20 = this.d;
            int i19 = i18 | 1;
            int i20 = 306783378 & i19;
            int i21 = 613566756 & i19;
            lxw.w((nwr) this.f, this.b, (cil) this.c, (cil) obj20, (cil) obj19, (cil) obj18, (cil) obj17, buxVar5, (i19 & (-920350135)) | i20 | (i21 >> 1) | (i21 & (i20 + i20)));
            return afak.a;
        }
        cqu cquVar = (cqu) obj;
        cquVar.getClass();
        cquVar.b();
        long j = ((cja) obj2).a & 4294967295L;
        byb bybVar = (byb) this.d;
        float fE = bybVar.e() + Float.intBitsToFloat((int) j);
        bybVar.h(fE);
        if (((byd) this.e).e() > 0) {
            ?? r13 = this.h;
            Object obj21 = this.g;
            byd bydVar = (byd) obj21;
            int iG = afpt.g(bydVar.e() + afgi.k(fE / r12.e()), 0, this.a - 1);
            if (iG != ((Number) r13.a()).intValue()) {
                Object obj22 = this.f;
                mlq.t((axr) this.c, ((Number) r13.a()).intValue(), iG, this.b);
                bybVar.h(fE - ((iG - ((Number) r13.a()).intValue()) * r12.e()));
                bydVar.h(iG);
                ((kwp) obj22).q(9);
            }
        }
        return afak.a;
    }

    public /* synthetic */ hfp(dom domVar, doj dojVar, doj dojVar2, afeg afegVar, hgc hgcVar, cil cilVar, cil cilVar2, int i, int i2) {
        this.i = i2;
        this.h = domVar;
        this.e = dojVar;
        this.g = dojVar2;
        this.b = afegVar;
        this.f = hgcVar;
        this.c = cilVar;
        this.d = cilVar2;
        this.a = i;
    }

    public /* synthetic */ hfp(dom domVar, doj dojVar, doj dojVar2, doj dojVar3, hga hgaVar, hge hgeVar, doj dojVar4, int i, int i2) {
        this.i = i2;
        this.h = domVar;
        this.c = dojVar;
        this.d = dojVar2;
        this.e = dojVar3;
        this.f = hgaVar;
        this.b = hgeVar;
        this.g = dojVar4;
        this.a = i;
    }

    public /* synthetic */ hfp(dom domVar, hge hgeVar, doj dojVar, doj dojVar2, doj dojVar3, hga hgaVar, doj dojVar4, int i, int i2) {
        this.i = i2;
        this.h = domVar;
        this.b = hgeVar;
        this.c = dojVar;
        this.d = dojVar2;
        this.e = dojVar3;
        this.f = hgaVar;
        this.g = dojVar4;
        this.a = i;
    }

    public /* synthetic */ hfp(hiu hiuVar, bry bryVar, hje hjeVar, hix hixVar, hjf hjfVar, hja hjaVar, afeg afegVar, int i, int i2) {
        this.i = i2;
        this.d = hiuVar;
        this.c = bryVar;
        this.h = hjeVar;
        this.e = hixVar;
        this.f = hjfVar;
        this.g = hjaVar;
        this.b = afegVar;
        this.a = i;
    }

    public /* synthetic */ hfp(nwr nwrVar, afec afecVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, cil cilVar5, int i, int i2) {
        this.i = i2;
        this.f = nwrVar;
        this.b = afecVar;
        this.c = cilVar;
        this.d = cilVar2;
        this.e = cilVar3;
        this.g = cilVar4;
        this.h = cilVar5;
        this.a = i;
    }
}
