package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acpl implements defpackage.acpk {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 5);

    @Override // defpackage.acpk
    public final boolean a() {
        return ((java.lang.Boolean) a.d(0, "CarProjectionValidator__filter_disabled_packages_in_ispackageallowed_method", true).fF()).booleanValue();
    }

    @Override // defpackage.acpk
    public final boolean b() {
        return ((java.lang.Boolean) a.d(1, "CarProjectionValidator__include_enabled_only_components", true).fF()).booleanValue();
    }

    @Override // defpackage.acpk
    public final boolean c() {
        return ((java.lang.Boolean) a.d(2, "CarProjectionValidator__log_reason_apps_not_allowed_all_apps", false).fF()).booleanValue();
    }

    @Override // defpackage.acpk
    public final boolean d() {
        return ((java.lang.Boolean) a.d(3, "CarProjectionValidator__measure_latency_enabled", true).fF()).booleanValue();
    }

    @Override // defpackage.acpk
    public final boolean e() {
        return ((java.lang.Boolean) a.d(4, "CarProjectionValidator__media_codec_checks_enabled_kill_switch", true).fF()).booleanValue();
    }
}
