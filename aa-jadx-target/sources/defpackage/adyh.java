package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adyh extends defpackage.admj {
    public static final defpackage.admd f = defpackage.admd.d("pick_first: attempting to connect");
    public final defpackage.admb g;
    public defpackage.adkh h = defpackage.adkh.d;
    private defpackage.admg i;

    public adyh(defpackage.admb admbVar) {
        this.g = admbVar;
    }

    @Override // defpackage.admj
    public final defpackage.ador a(defpackage.admf admfVar) {
        adyf adyfVar;
        java.lang.Boolean bool;
        java.util.List listE = admfVar.a;
        if (listE.isEmpty()) {
            defpackage.adjs adjsVar = admfVar.b;
            defpackage.ador adorVarE = defpackage.ador.m.e("NameResolver returned no usable address. addrs=" + java.lang.String.valueOf(listE) + ", attrs=" + adjsVar.toString());
            b(adorVarE);
            return adorVarE;
        }
        java.lang.Object obj = admfVar.c;
        if ((obj instanceof adyf) && (bool = (adyfVar = (adyf) obj).a) != null && bool.booleanValue()) {
            java.lang.Long l = adyfVar.b;
            listE = adyd.e(listE, new java.util.Random());
        }
        defpackage.admg admgVar = this.i;
        if (admgVar == null) {
            defpackage.admb admbVar = this.g;
            defpackage.adlw adlwVar = new defpackage.adlw();
            adlwVar.c(listE);
            defpackage.admg admgVarB = admbVar.b(adlwVar.a());
            admgVarB.c(new defpackage.adye(this, admgVarB, 0));
            this.i = admgVarB;
            e(defpackage.adkh.a, new defpackage.adma(f));
            admgVarB.a();
        } else {
            admgVar.d(listE);
        }
        return defpackage.ador.b;
    }

    @Override // defpackage.admj
    public final void b(defpackage.ador adorVar) {
        defpackage.admg admgVar = this.i;
        if (admgVar != null) {
            admgVar.b();
            this.i = null;
        }
        e(defpackage.adkh.c, new defpackage.adma(defpackage.admd.b(adorVar)));
    }

    @Override // defpackage.admj
    public final void c() {
        defpackage.admg admgVar = this.i;
        if (admgVar != null) {
            admgVar.a();
        }
    }

    @Override // defpackage.admj
    public final void d() {
        defpackage.admg admgVar = this.i;
        if (admgVar != null) {
            admgVar.b();
        }
    }

    public final void e(defpackage.adkh adkhVar, defpackage.admh admhVar) {
        this.h = adkhVar;
        this.g.f(adkhVar, admhVar);
    }
}
