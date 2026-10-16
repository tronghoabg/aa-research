package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class cor implements defpackage.affg {
    private final /* synthetic */ int a;

    public /* synthetic */ cor(int i) {
        this.a = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = 13;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.cnp) obj).m(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case 1:
                ((defpackage.cnp) obj).i(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.cnp) obj).k(((defpackage.clh) obj2).a);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.cnl) obj).i((java.lang.String) obj2);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.cnl) obj).l(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.cnl) obj).j(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.cnl) obj).k(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.cnl) obj).m(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.cnl) obj).n(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case 9:
                ((defpackage.cnl) obj).o(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case 10:
                ((defpackage.cnl) obj).p(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case 11:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ((java.lang.Boolean) obj2).booleanValue();
                return bool;
            case 12:
                return (java.lang.String) obj;
            case 13:
                return (defpackage.vx) obj;
            case 14:
                defpackage.ddz ddzVar = ((defpackage.dec) obj).b;
                defpackage.affg affgVar = defpackage.del.a;
                defpackage.dej dejVar = defpackage.def.u;
                return java.lang.Integer.valueOf(java.lang.Float.compare(((java.lang.Number) ddzVar.d(dejVar, new defpackage.bmd(13))).floatValue(), ((java.lang.Number) ((defpackage.dec) obj2).b.d(dejVar, new defpackage.bmd(14))).floatValue()));
            case 15:
                dna dnaVarA = dmr.a((defpackage.cxl) obj);
                dnaVarA.y = (defpackage.affc) obj2;
                dnaVarA.d = new defpackage.cwg(dnaVarA, i);
                dnaVarA.e = true;
                dnaVarA.q.invoke();
                return defpackage.afbk.a;
            case 16:
                dna dnaVarA2 = dmr.a((defpackage.cxl) obj);
                dnaVarA2.z = (defpackage.affc) obj2;
                dnaVarA2.f = new defpackage.cwg(dnaVarA2, 12);
                return defpackage.afbk.a;
            case 17:
                defpackage.cgf cgfVar = (defpackage.cgf) obj2;
                dna dnaVarA3 = dmr.a((defpackage.cxl) obj);
                if (cgfVar != dnaVarA3.g) {
                    dnaVarA3.g = cgfVar;
                    defpackage.affc affcVar = dnaVarA3.h;
                    if (affcVar != null) {
                        affcVar.invoke(cgfVar);
                    }
                }
                return defpackage.afbk.a;
            case 18:
                defpackage.dlo dloVar = (defpackage.dlo) obj2;
                dna dnaVarA4 = dmr.a((defpackage.cxl) obj);
                if (dloVar != dnaVarA4.i) {
                    dnaVarA4.i = dloVar;
                    defpackage.affc affcVar2 = dnaVarA4.j;
                    if (affcVar2 != null) {
                        affcVar2.invoke(dloVar);
                    }
                }
                return defpackage.afbk.a;
            case 19:
                defpackage.eqg eqgVar = (defpackage.eqg) obj2;
                dna dnaVarA5 = dmr.a((defpackage.cxl) obj);
                if (eqgVar != dnaVarA5.k) {
                    dnaVarA5.k = eqgVar;
                    defpackage.edd.d(dnaVarA5, eqgVar);
                }
                return defpackage.afbk.a;
            default:
                defpackage.fbm fbmVar = (defpackage.fbm) obj2;
                dna dnaVarA6 = dmr.a((defpackage.cxl) obj);
                if (fbmVar != dnaVarA6.l) {
                    dnaVarA6.l = fbmVar;
                    defpackage.ebq.g(dnaVarA6, fbmVar);
                }
                return defpackage.afbk.a;
        }
    }
}
