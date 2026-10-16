package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nsu {
    public static final com.google.android.gms.car.CarWindowLayoutParams a(defpackage.ntb ntbVar, defpackage.nta ntaVar, defpackage.affc affcVar) {
        defpackage.qts qtsVarN = ntbVar.n(ntaVar);
        if (qtsVarN == null) {
            return null;
        }
        affcVar.invoke(qtsVarN);
        return qtsVarN.a();
    }

    public static defpackage.noy b(com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams, java.lang.String str, android.support.v4.app.Fragment fragment, defpackage.eqg eqgVar) {
        return c().a(carWindowLayoutParams, str, fragment, eqgVar);
    }

    public static defpackage.npb c() {
        return (defpackage.npb) defpackage.mkp.a.b(defpackage.npb.class, new defpackage.lga(11));
    }

    public static /* synthetic */ java.lang.String d(int i) {
        if (i != 1) {
            return i != 2 ? "RESTORE_PREVIOUSLY_SAVED_VIEW" : "SAVE_FOCUSED_VIEW";
        }
        return "DEFAULT";
    }
}
