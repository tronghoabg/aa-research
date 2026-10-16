package defpackage;

/* loaded from: classes3.dex */
public final class adba implements adaz {
    private static final war a;

    static {
        wap wapVarA = new wap(wac.a("com.google.android.gms.car"), "", "", false, false).b().a();
        wapVarA.d("bypass_car_client_uncaught_exception_handler_whitelist", "com.google.android.apps.maps,com.google.android.projection.gearhead,com.locnall.KimGiSa,com.waze");
        a = wapVarA.e("client_fullscreen_presentation", false);
    }

    @Override // defpackage.adaz
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
