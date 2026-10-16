package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adbz implements defpackage.adby {
    private static final defpackage.wbn a;

    static {
        defpackage.wbl wblVarA = new defpackage.wbl(defpackage.way.a("com.google.android.gms.car"), "", "", false, false).b().a();
        wblVarA.d("bypass_car_client_uncaught_exception_handler_whitelist", "com.google.android.apps.maps,com.google.android.projection.gearhead,com.locnall.KimGiSa,com.waze");
        a = wblVarA.e("client_fullscreen_presentation", false);
    }

    @Override // defpackage.adby
    public final boolean a() {
        return ((java.lang.Boolean) a.b()).booleanValue();
    }
}
