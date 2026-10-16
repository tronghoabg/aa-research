package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acvw implements defpackage.acvu {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 14);

    @Override // defpackage.acvu
    public final long a() {
        return ((java.lang.Long) a.b(1, "Performance__delay_prewarm_ms", 2000L).fF()).longValue();
    }

    @Override // defpackage.acvu
    public final long b() {
        return ((java.lang.Long) a.b(5, "Performance__lifetime_delayed_start_delay_ms", 1000L).fF()).longValue();
    }

    @Override // defpackage.acvu
    public final long c() {
        return ((java.lang.Long) a.b(6, "Performance__lifetime_delayed_start_no_video_focus_timeout_ms", 2000L).fF()).longValue();
    }

    @Override // defpackage.acvu
    public final defpackage.absx d() {
        return (defpackage.absx) a.e(2, "Performance__emit_broadcast_receiver_telemetry_list", new defpackage.acvv(0), "").fF();
    }

    @Override // defpackage.acvu
    public final java.lang.String e() {
        return (java.lang.String) a.c(11, "Performance__primes_transmitter", "prod").fF();
    }

    @Override // defpackage.acvu
    public final boolean f() {
        return ((java.lang.Boolean) a.d(0, "Performance__cache_lifetime_state", false).fF()).booleanValue();
    }

    @Override // defpackage.acvu
    public final boolean g() {
        return ((java.lang.Boolean) a.d(3, "Performance__ignore_first_run_for_version_code_enabled", true).fF()).booleanValue();
    }

    @Override // defpackage.acvu
    public final boolean h() {
        return ((java.lang.Boolean) a.d(4, "Performance__ignore_preflight_lockscreen_activity", true).fF()).booleanValue();
    }

    @Override // defpackage.acvu
    public final boolean i() {
        return ((java.lang.Boolean) a.d(7, "Performance__log_to_telemetry", true).fF()).booleanValue();
    }

    @Override // defpackage.acvu
    public final boolean j() {
        return ((java.lang.Boolean) a.d(8, "Performance__minor_car_activity_manager_startup_improvements_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acvu
    public final boolean k() {
        return ((java.lang.Boolean) a.d(9, "Performance__navigation_client_manager_delayed_start_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acvu
    public final boolean l() {
        return ((java.lang.Boolean) a.d(10, "Performance__pre_warm_activities_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acvu
    public final boolean m() {
        return ((java.lang.Boolean) a.d(12, "Performance__reduce_car_activity_logging_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acvu
    public final boolean n() {
        return ((java.lang.Boolean) a.d(13, "Performance__remove_preflight_interval", true).fF()).booleanValue();
    }
}
