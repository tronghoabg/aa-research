package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mtm implements defpackage.affg {
    public final /* synthetic */ float a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ mtm(defpackage.affh affhVar, defpackage.msw mswVar, defpackage.bys bysVar, float f, boolean z, defpackage.bys bysVar2, int i) {
        this.g = i;
        this.c = affhVar;
        this.d = mswVar;
        this.e = bysVar;
        this.a = f;
        this.b = z;
        this.f = bysVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bys, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.cgf cgfVarJ;
        float f;
        boolean z = false;
        if (this.g == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                defpackage.cgf cgfVarY = defpackage.dai.y(defpackage.cgf.e, "top_card_back");
                java.lang.Object objG = bveVar.g();
                java.lang.Object obj3 = defpackage.bvd.a;
                if (objG == obj3) {
                    objG = new defpackage.mcz(16);
                    bveVar.x(objG);
                }
                float f2 = this.a;
                ?? r7 = this.e;
                defpackage.cgf cgfVarR = defpackage.bzd.r(cgfVarY, (defpackage.affc) objG);
                boolean zC = bveVar.C(r7) | bveVar.z(f2);
                java.lang.Object objG2 = bveVar.g();
                if (zC || objG2 == obj3) {
                    objG2 = new mte(f2, (defpackage.bys) r7, 2);
                    bveVar.x(objG2);
                }
                this.c.invoke(new defpackage.msx((defpackage.msw) this.d, defpackage.cjv.g(cgfVarR, (defpackage.affc) objG2), this.b, null, ((java.lang.Boolean) this.f.a()).booleanValue(), false, 40), bveVar, 8);
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        if (bveVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            boolean z2 = this.b;
            float f3 = this.a;
            if (defpackage.dlr.a(f3, 0.0f) < 0) {
                defpackage.cgc cgcVar = defpackage.cgf.e;
                if (z2) {
                    f = (-f3) + 0.0f;
                    z = true;
                } else {
                    f = 0.0f;
                }
                cgfVarJ = defpackage.edd.l(cgcVar, 0.0f, 0.0f, f, z ? 0.0f : (-f3) + 0.0f);
            } else {
                defpackage.cgc cgcVar2 = defpackage.cgf.e;
                float f4 = z2 ? f3 : 0.0f;
                if (true == z2) {
                    f3 = 0.0f;
                }
                cgfVarJ = defpackage.asq.J(cgcVar2, 0.0f, 0.0f, f4, f3);
            }
            defpackage.cgf cgfVar = cgfVarJ;
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.f;
            defpackage.ca.L((defpackage.aft) this.d, cgfVar, (defpackage.acw) this.e, (defpackage.acx) obj5, null, defpackage.dai.as(-1317508326, true, new defpackage.klc(obj4, 18), bveVar2), bveVar2, 196608, 16);
        } else {
            bveVar2.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ mtm(defpackage.aft aftVar, float f, boolean z, defpackage.acw acwVar, defpackage.acx acxVar, defpackage.affg affgVar, int i) {
        this.g = i;
        this.d = aftVar;
        this.a = f;
        this.b = z;
        this.e = acwVar;
        this.f = acxVar;
        this.c = affgVar;
    }
}
