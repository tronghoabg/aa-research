package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aln implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aln(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [cwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v59, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v73, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [dlo, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ?? r5 = this.a;
                defpackage.aja ajaVar = (defpackage.aja) defpackage.cjv.y(r5, defpackage.alc.a);
                defpackage.alo aloVar = (defpackage.alo) r5;
                aloVar.a = ajaVar;
                defpackage.aja ajaVar2 = aloVar.a;
                aloVar.b = ajaVar2 != null ? ajaVar2.a() : null;
                return defpackage.afbk.a;
            case 1:
                return java.lang.Boolean.valueOf(((defpackage.all) this.a).c() > 0);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Float.valueOf(this.a.dI(125.0f));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ana anaVar = (defpackage.ana) this.a;
                java.lang.Object objH = anaVar.h();
                if (objH != null) {
                    return objH;
                }
                float fB = anaVar.b();
                if (java.lang.Float.isNaN(fB)) {
                    return anaVar.g();
                }
                float fA = anaVar.n().a(anaVar.g());
                if (java.lang.Float.isNaN(fA) || fB == fA) {
                    return anaVar.g();
                }
                java.lang.Object objB = anaVar.n().b(fB);
                return objB == null ? anaVar.g() : objB;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.ana anaVar2 = (defpackage.ana) this.a;
                float fA2 = anaVar2.n().a(anaVar2.i());
                float fA3 = anaVar2.n().a(anaVar2.j()) - fA2;
                float fAbs = java.lang.Math.abs(fA3);
                float f = 1.0f;
                if (!java.lang.Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fD = (anaVar2.d() - fA2) / fA3;
                    if (fD < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fD <= 0.999999f) {
                        f = fD;
                    }
                }
                return java.lang.Float.valueOf(f);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.ana) this.a).n();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ana anaVar3 = (defpackage.ana) this.a;
                return new defpackage.afau(anaVar3.n(), anaVar3.j());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return (defpackage.apd) aiyo.a(this.a.i());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.valueOf(((defpackage.aqp) this.a).c == defpackage.apn.a);
            case 9:
                return java.lang.Boolean.valueOf(((defpackage.cge) this.a).A);
            case 10:
                defpackage.cjc cjcVar = ((defpackage.aqj) this.a).j;
                if (!cjcVar.q.A) {
                    return null;
                }
                defpackage.cja cjaVarG = cjcVar.g();
                if (!cjaVarG.a()) {
                    return null;
                }
                if (cjaVarG.b()) {
                    cjcVar.getClass();
                    return cjcVar.h(null);
                }
                defpackage.cjc cjcVarB = ((defpackage.czz) defpackage.cjv.t(cjcVar)).J.b();
                if (cjcVarB != null) {
                    return cjcVarB.h(defpackage.cjv.p(cjcVar));
                }
                return null;
            case 11:
                return (defpackage.arf) aiyo.a(this.a.i());
            case 12:
                return java.lang.Boolean.valueOf(((defpackage.aqp) this.a).c == defpackage.apn.a);
            case 13:
                return java.lang.Integer.valueOf(((defpackage.axx) this.a).l().m);
            case 14:
                return new defpackage.axj((defpackage.affc) this.a.a());
            case 15:
                return java.lang.Integer.valueOf(((defpackage.axo) ((defpackage.axx) this.a).e.a()).i);
            case 16:
                defpackage.cwu cwuVar = ((defpackage.azi) this.a).b;
                if (cwuVar != null) {
                    defpackage.dai.G(cwuVar);
                }
                return defpackage.afbk.a;
            case 17:
                return (defpackage.azm) ((defpackage.afer) this.a.a()).invoke();
            case 18:
                return java.lang.Float.valueOf(((defpackage.baf) this.a).b.b());
            case 19:
                return java.lang.Float.valueOf(((defpackage.baf) this.a).b.a());
            default:
                defpackage.baf bafVar = (defpackage.baf) this.a;
                return java.lang.Float.valueOf(bafVar.b.d() - bafVar.b.c());
        }
    }
}
