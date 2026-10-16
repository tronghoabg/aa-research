package defpackage;

/* loaded from: classes3.dex */
public final class adbz implements adby {
    private static final war a;
    private static final war b;
    private static final war c;
    private static final war d;

    static {
        wap wapVarA = new wap(wac.a("com.google.android.gms.car"), "", "", false, false).b().a();
        wapVarA.d("WirelessFrxFeature__activity_in_gearhead_to_launch", "com.google.android.apps.auto.components.frx.phonescreen.WirelessConnectingActivity");
        a = wapVarA.d("WirelessFrxFeature__dongle_device_name_matches", "Intercooler");
        b = wapVarA.c("WirelessFrxFeature__min_os_api_number", 29L);
        c = wapVarA.e("WirelessFrxFeature__show_if_location_services_disabled", true);
        d = wapVarA.e("WirelessFrxFeature__show_if_missing_location_permission", true);
    }

    @Override // defpackage.adby
    public final long a() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.adby
    public final String b() {
        return (String) a.b();
    }

    @Override // defpackage.adby
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.adby
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }
}
