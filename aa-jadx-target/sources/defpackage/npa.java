package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class npa implements defpackage.npb {
    @Override // defpackage.npb
    public final defpackage.noy a(com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams, java.lang.String str, android.support.v4.app.Fragment fragment, defpackage.eqg eqgVar) {
        if (carWindowLayoutParams.o == 0) {
            defpackage.qts qtsVar = new defpackage.qts(carWindowLayoutParams);
            qtsVar.n = 2132149941;
            carWindowLayoutParams = qtsVar.a();
        }
        return new defpackage.noy(carWindowLayoutParams, str, fragment, eqgVar);
    }

    @Override // defpackage.npb
    public final defpackage.noz b(android.support.v4.app.Fragment fragment) {
        if (fragment.getParentFragment() != null) {
            return b(fragment);
        }
        java.lang.Object host = fragment.getHost();
        if (host instanceof defpackage.noz) {
            return (defpackage.noz) host;
        }
        return null;
    }
}
