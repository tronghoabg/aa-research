package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class hfv implements afeg {
    public final /* synthetic */ doj a;
    public final /* synthetic */ afeg b;
    public final /* synthetic */ cil c;
    public final /* synthetic */ cil d;
    public final /* synthetic */ cil e;
    public final /* synthetic */ cil f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    private final /* synthetic */ int k;

    public /* synthetic */ hfv(dom domVar, doj dojVar, afeg afegVar, hgc hgcVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, hfi hfiVar, int i, int i2) {
        this.k = i2;
        this.h = domVar;
        this.a = dojVar;
        this.b = afegVar;
        this.i = hgcVar;
        this.c = cilVar;
        this.d = cilVar2;
        this.e = cilVar3;
        this.f = cilVar4;
        this.j = hfiVar;
        this.g = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.k != 0) {
            ((Integer) obj2).intValue();
            int i = this.g;
            Object obj3 = this.j;
            cil cilVar = this.f;
            cil cilVar2 = this.e;
            cil cilVar3 = this.d;
            cil cilVar4 = this.c;
            Object obj4 = this.i;
            afeg afegVar = this.b;
            doj dojVar = this.a;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            hfz.h((dom) this.h, dojVar, afegVar, (hgc) obj4, cilVar4, cilVar3, cilVar2, cilVar, (hfi) obj3, (bux) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i5 = this.g;
        Object obj5 = this.i;
        cil cilVar5 = this.f;
        cil cilVar6 = this.e;
        cil cilVar7 = this.d;
        cil cilVar8 = this.c;
        afeg afegVar2 = this.b;
        Object obj6 = this.h;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        dom domVar = (dom) this.j;
        doj dojVar2 = (doj) obj6;
        hfi hfiVar = (hfi) obj5;
        hfz.c(domVar, this.a, dojVar2, afegVar2, cilVar8, cilVar7, cilVar6, cilVar5, hfiVar, (bux) obj, (i6 & (-920350135)) | i7 | (i8 >> 1) | (i8 & (i7 + i7)));
        return afak.a;
    }

    public /* synthetic */ hfv(dom domVar, doj dojVar, doj dojVar2, afeg afegVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, hfi hfiVar, int i, int i2) {
        this.k = i2;
        this.j = domVar;
        this.a = dojVar;
        this.h = dojVar2;
        this.b = afegVar;
        this.c = cilVar;
        this.d = cilVar2;
        this.e = cilVar3;
        this.f = cilVar4;
        this.i = hfiVar;
        this.g = i;
    }
}
