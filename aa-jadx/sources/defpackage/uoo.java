package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uoo {
    public final defpackage.yhe a;
    public final java.lang.String b;
    public final defpackage.zem c;
    public final defpackage.yhe d;
    public final int e;
    public final defpackage.abgw f;
    public java.util.Map g = new java.util.HashMap();
    public final java.lang.String h;

    /* JADX WARN: Multi-variable type inference failed */
    public uoo(defpackage.abgx abgxVar, java.lang.String str) {
        defpackage.abgw abgwVarB = defpackage.abgw.b(abgxVar.d);
        this.f = abgwVarB == null ? defpackage.abgw.MULTIZOOM_STYLE_TABLE : abgwVarB;
        java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.ukf.class);
        for (int i = 0; i < abgxVar.c.size(); i++) {
            defpackage.abib abibVar = (defpackage.abib) abgxVar.c.get(i);
            defpackage.abia abiaVarB = defpackage.abia.b(abibVar.c);
            int i2 = (abiaVarB == null ? defpackage.abia.UNKNOWN : abiaVarB).aj;
            defpackage.ukf[] ukfVarArr = defpackage.uoq.b;
            int length = ukfVarArr.length;
            defpackage.ukf ukfVar = ukfVarArr[i2];
            if (ukfVar != null && (abibVar.b & 2) != 0) {
                enumMap.put(ukfVar, abibVar.d);
            }
        }
        this.a = defpackage.ysr.F(enumMap);
        this.h = str;
        this.b = abgxVar.e;
        defpackage.abhb abhbVar = abgxVar.f;
        defpackage.abpf abpfVar = (abhbVar == null ? defpackage.abhb.a : abhbVar).b;
        defpackage.zem zemVar = defpackage.zem.a;
        this.c = abpfVar.isEmpty() ? defpackage.zem.a : new defpackage.zem(defpackage.ysr.cQ(abpfVar));
        this.e = abgxVar.hashCode();
        defpackage.yha yhaVar = new defpackage.yha(4);
        defpackage.abhb abhbVar2 = abgxVar.f;
        for (defpackage.abha abhaVar : (abhbVar2 == null ? defpackage.abhb.a : abhbVar2).c) {
            yhaVar.f(java.lang.Integer.valueOf(abhaVar.c), java.lang.Integer.valueOf(abhaVar.d));
        }
        this.d = yhaVar.d(true);
    }
}
