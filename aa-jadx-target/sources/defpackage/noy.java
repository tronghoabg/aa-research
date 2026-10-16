package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class noy {
    protected final com.google.android.gms.car.CarWindowLayoutParams a;
    protected final java.lang.String b;
    protected final android.support.v4.app.Fragment c;
    protected final defpackage.eqg d;
    public java.lang.Object e;
    public int f;
    protected com.google.android.gms.car.display.CarDisplayId g;

    public noy(com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams, java.lang.String str, android.support.v4.app.Fragment fragment, defpackage.eqg eqgVar) {
        this.a = carWindowLayoutParams;
        this.b = str;
        this.c = fragment;
        this.d = eqgVar;
        android.os.Bundle bundle = carWindowLayoutParams.r;
        java.lang.String str2 = defpackage.ntb.c;
        com.google.android.gms.car.display.CarDisplayId carDisplayId = !bundle.containsKey(str2) ? null : (com.google.android.gms.car.display.CarDisplayId) carWindowLayoutParams.r.getParcelable(str2);
        this.g = carDisplayId;
        if (carDisplayId == null) {
            this.g = com.google.android.gms.car.display.CarDisplayId.a;
        }
    }

    public final defpackage.noz a() throws defpackage.qsu, defpackage.qst {
        return b(defpackage.kit.b().e());
    }

    public final defpackage.noz b(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        defpackage.mkp mkpVar = defpackage.mkp.a;
        android.content.Context context = mkpVar.c;
        mkpVar.g();
        defpackage.sax saxVarH = qshVar.a().h(this.g);
        defpackage.yqm yqmVar = defpackage.nte.a;
        defpackage.ntb ntbVarA = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).a(this.g);
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams = this.a;
        android.os.Bundle bundle = carWindowLayoutParams.r;
        java.lang.String str = defpackage.ntb.b;
        defpackage.noz nozVar = new defpackage.noz(saxVarH, carWindowLayoutParams, !bundle.containsKey(str) ? null : defpackage.nta.values()[bundle.getInt(str)], ntbVarA, this.c, this.d, this.e);
        saxVarH.f(nozVar.m, this.b, context, carWindowLayoutParams, this.f);
        return nozVar;
    }
}
