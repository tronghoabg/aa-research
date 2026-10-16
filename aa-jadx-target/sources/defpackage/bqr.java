package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bqr implements defpackage.affg {
    public final /* synthetic */ defpackage.cgf a;
    public final /* synthetic */ defpackage.ask b;
    public final /* synthetic */ defpackage.cld c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ defpackage.ajl f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ defpackage.afer i;
    public final /* synthetic */ float j;
    public final /* synthetic */ defpackage.affg k;

    public /* synthetic */ bqr(defpackage.cgf cgfVar, defpackage.ask askVar, defpackage.cld cldVar, long j, float f, defpackage.ajl ajlVar, boolean z, boolean z2, defpackage.afer aferVar, float f2, defpackage.affg affgVar) {
        this.a = cgfVar;
        this.b = askVar;
        this.c = cldVar;
        this.d = j;
        this.e = f;
        this.f = ajlVar;
        this.g = z;
        this.h = z2;
        this.i = aferVar;
        this.j = f2;
        this.k = affgVar;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.bve bveVar = (defpackage.bve) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        int i2 = iIntValue & 1;
        defpackage.bvm bvmVar = defpackage.bqv.a;
        if (bveVar.I(i != 2, i2)) {
            float f = this.j;
            defpackage.afer aferVar = this.i;
            boolean z = this.h;
            boolean z2 = this.g;
            defpackage.ajl ajlVar = this.f;
            float f2 = this.e;
            long j = this.d;
            defpackage.cld cldVar = this.c;
            defpackage.ask askVar = this.b;
            defpackage.cgf cgfVar = this.a;
            defpackage.csu csuVar = defpackage.bok.a;
            defpackage.cgf cgfVarA = cgfVar.a(defpackage.bou.a);
            defpackage.bvm bvmVar2 = defpackage.bpk.a;
            java.lang.Object obj3 = ((defpackage.khb) bveVar.f(bvmVar2)).a;
            defpackage.cgf cgfVarA2 = defpackage.bqv.a(cgfVarA.a(defpackage.cgf.e), cldVar, defpackage.bnl.c(((defpackage.bol) bveVar.f(defpackage.bom.a)).a, j, f2, bveVar), ajlVar, ((defpackage.dlo) bveVar.f(defpackage.dbl.d)).dI(f));
            java.lang.Object obj4 = ((defpackage.khb) bveVar.f(bvmVar2)).a;
            defpackage.cgf cgfVarA3 = defpackage.afw.P(cgfVarA2, z2, askVar, defpackage.bpk.a(false, 0.0f, 0L, cldVar, true, 215), z, null, aferVar).a(new defpackage.bsv(new defpackage.bev(19)));
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, true);
            long jB = bveVar.b();
            long j2 = jB ^ (jB >>> 32);
            defpackage.cdd cddVarN = bveVar.N();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar, cgfVarA3);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVar.M();
            bveVar.w();
            if (bveVar.G()) {
                bveVar.j(aferVar2);
            } else {
                bveVar.y();
            }
            defpackage.affg affgVar = this.k;
            defpackage.byw.c(bveVar, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVar, cddVarN, defpackage.cwl.d);
            defpackage.byw.c(bveVar, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVar.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVar, cgfVarN, defpackage.cwl.c);
            affgVar.invoke(bveVar, 0);
            bveVar.n();
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }
}
