package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adcy implements defpackage.adcx {
    private static final defpackage.wbn a;
    private static final defpackage.wbn b;
    private static final defpackage.wbn c;
    private static final defpackage.wbn d;

    static {
        defpackage.wbl wblVarA = new defpackage.wbl(defpackage.way.a("com.google.android.gms.car"), "", "", false, false).b().a();
        wblVarA.d("WirelessFrxFeature__activity_in_gearhead_to_launch", "com.google.android.apps.auto.components.frx.phonescreen.WirelessConnectingActivity");
        a = wblVarA.d("WirelessFrxFeature__dongle_device_name_matches", "Intercooler");
        b = wblVarA.c("WirelessFrxFeature__min_os_api_number", 29L);
        c = wblVarA.e("WirelessFrxFeature__show_if_location_services_disabled", true);
        d = wblVarA.e("WirelessFrxFeature__show_if_missing_location_permission", true);
    }

    @Override // defpackage.adcx
    public final long a() {
        return ((java.lang.Long) b.b()).longValue();
    }

    @Override // defpackage.adcx
    public final java.lang.String b() {
        return (java.lang.String) a.b();
    }

    @Override // defpackage.adcx
    public final boolean c() {
        return ((java.lang.Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.adcx
    public final boolean d() {
        return ((java.lang.Boolean) d.b()).booleanValue();
    }
}
