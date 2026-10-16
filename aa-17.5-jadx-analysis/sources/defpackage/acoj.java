package defpackage;

/* loaded from: classes.dex */
public final class acoj implements acoi {
    private static final wcv a = new wcv(aclg.b, 5);

    @Override // defpackage.acoi
    public final boolean a() {
        return ((Boolean) a.d(0, "CarProjectionValidator__filter_disabled_packages_in_ispackageallowed_method", true).gu()).booleanValue();
    }

    @Override // defpackage.acoi
    public final boolean b() {
        return ((Boolean) a.d(1, "CarProjectionValidator__include_enabled_only_components", true).gu()).booleanValue();
    }

    @Override // defpackage.acoi
    public final boolean c() {
        return ((Boolean) a.d(2, "CarProjectionValidator__log_reason_apps_not_allowed_all_apps", false).gu()).booleanValue();
    }

    @Override // defpackage.acoi
    public final boolean d() {
        return ((Boolean) a.d(3, "CarProjectionValidator__measure_latency_enabled", true).gu()).booleanValue();
    }

    @Override // defpackage.acoi
    public final boolean e() {
        return ((Boolean) a.d(4, "CarProjectionValidator__media_codec_checks_enabled_kill_switch", true).gu()).booleanValue();
    }
}
