package defpackage;

/* loaded from: classes.dex */
public final class acuu implements acus {
    private static final wcv a = new wcv(aclg.b, 15);

    @Override // defpackage.acus
    public final long a() {
        return ((Long) a.b(2, "Performance__delay_prewarm_ms", 2000L).gu()).longValue();
    }

    @Override // defpackage.acus
    public final long b() {
        return ((Long) a.b(6, "Performance__lifetime_delayed_start_delay_ms", 1000L).gu()).longValue();
    }

    @Override // defpackage.acus
    public final long c() {
        return ((Long) a.b(7, "Performance__lifetime_delayed_start_no_video_focus_timeout_ms", 2000L).gu()).longValue();
    }

    @Override // defpackage.acus
    public final abru d() {
        return (abru) a.e(3, "Performance__emit_broadcast_receiver_telemetry_list", new acut(0), "").gu();
    }

    @Override // defpackage.acus
    public final String e() {
        return (String) a.c(12, "Performance__primes_transmitter", "prod").gu();
    }

    @Override // defpackage.acus
    public final boolean f() {
        return ((Boolean) a.d(0, "Performance__cache_lifetime_state", false).gu()).booleanValue();
    }

    @Override // defpackage.acus
    public final boolean g() {
        return ((Boolean) a.d(1, "Performance__car_api_telemetry_enabled", true).gu()).booleanValue();
    }

    @Override // defpackage.acus
    public final boolean h() {
        return ((Boolean) a.d(4, "Performance__ignore_first_run_for_version_code_enabled", true).gu()).booleanValue();
    }

    @Override // defpackage.acus
    public final boolean i() {
        return ((Boolean) a.d(5, "Performance__ignore_preflight_lockscreen_activity", true).gu()).booleanValue();
    }

    @Override // defpackage.acus
    public final boolean j() {
        return ((Boolean) a.d(8, "Performance__log_to_telemetry", true).gu()).booleanValue();
    }

    @Override // defpackage.acus
    public final boolean k() {
        return ((Boolean) a.d(9, "Performance__minor_car_activity_manager_startup_improvements_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acus
    public final boolean l() {
        return ((Boolean) a.d(10, "Performance__navigation_client_manager_delayed_start_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acus
    public final boolean m() {
        return ((Boolean) a.d(11, "Performance__pre_warm_activities_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acus
    public final boolean n() {
        return ((Boolean) a.d(13, "Performance__reduce_car_activity_logging_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acus
    public final boolean o() {
        return ((Boolean) a.d(14, "Performance__remove_preflight_interval", true).gu()).booleanValue();
    }
}
