package defpackage;

/* loaded from: classes.dex */
public final class acov implements acou {
    private static final wcv a = new wcv(aclg.b, 22);

    @Override // defpackage.acou
    public final long a() {
        return ((Long) a.b(4, "ConnectivityLogging__bluetooth_timeout_millis", 10000L).gu()).longValue();
    }

    @Override // defpackage.acou
    public final long b() {
        return ((Long) a.b(5, "ConnectivityLogging__connectivity_refresh_timeout_ms", 3000L).gu()).longValue();
    }

    @Override // defpackage.acou
    public final long c() {
        return ((Long) a.b(10, "ConnectivityLogging__heartbeat_interval_ms", 60000L).gu()).longValue();
    }

    @Override // defpackage.acou
    public final long d() {
        return ((Long) a.b(15, "ConnectivityLogging__overlogged_connectivity_events_throttle_limit", 20L).gu()).longValue();
    }

    @Override // defpackage.acou
    public final long e() {
        return ((Long) a.b(16, "ConnectivityLogging__process_usb_level", 2L).gu()).longValue();
    }

    @Override // defpackage.acou
    public final long f() {
        return ((Long) a.b(17, "ConnectivityLogging__session_obsolete_expiration_timeout_ms", 120000L).gu()).longValue();
    }

    @Override // defpackage.acou
    public final long g() {
        return ((Long) a.b(18, "ConnectivityLogging__session_obsolete_expiration_via_last_event_timeout_ms", 60000L).gu()).longValue();
    }

    @Override // defpackage.acou
    public final long h() {
        return ((Long) a.b(19, "ConnectivityLogging__session_timeout_ms", 120000L).gu()).longValue();
    }

    @Override // defpackage.acou
    public final abrs i() {
        return (abrs) a.e(2, "ConnectivityLogging__blocklisted_connectivity_events", new acml(10), "CgUMDQWQHA").gu();
    }

    @Override // defpackage.acou
    public final abrs j() {
        return (abrs) a.e(9, "ConnectivityLogging__events_requiring_status", new acml(10), "ChcBAwQFBgcICQ8QERcZGhs4OeoHjxmDDw").gu();
    }

    @Override // defpackage.acou
    public final abrs k() {
        return (abrs) a.e(12, "ConnectivityLogging__main_module_events", new acml(10), "CgsRjxnBF4MPhA+FDw").gu();
    }

    @Override // defpackage.acou
    public final abrs l() {
        return (abrs) a.e(13, "ConnectivityLogging__non_extending_events", new acml(10), "").gu();
    }

    @Override // defpackage.acou
    public final abrs m() {
        return (abrs) a.e(14, "ConnectivityLogging__overlogged_connectivity_events", new acml(10), "ChWVGpgggB2EHZogoh2eILgXxeoBmBo").gu();
    }

    @Override // defpackage.acou
    public final String n() {
        return (String) a.c(3, "ConnectivityLogging__bluetooth_main_module_regex_name", ".*\\.android\\.bt$").gu();
    }

    @Override // defpackage.acou
    public final String o() {
        return (String) a.c(21, "ConnectivityLogging__wifi_main_module_regex_name", ".*\\.android\\.wifi$").gu();
    }

    @Override // defpackage.acou
    public final boolean p() {
        return ((Boolean) a.d(0, "ConnectivityLogging__allow_repeated_startup_events", false).gu()).booleanValue();
    }

    @Override // defpackage.acou
    public final boolean q() {
        return ((Boolean) a.d(1, "ConnectivityLogging__always_log_bluetooth_disconnect", false).gu()).booleanValue();
    }

    @Override // defpackage.acou
    public final boolean r() {
        return ((Boolean) a.d(6, "ConnectivityLogging__crash_if_background_exception_in_connectivity_logger", false).gu()).booleanValue();
    }

    @Override // defpackage.acou
    public final boolean s() {
        return ((Boolean) a.d(7, "ConnectivityLogging__disable_usb_trigger_configured_accessory_event", true).gu()).booleanValue();
    }

    @Override // defpackage.acou
    public final boolean t() {
        return ((Boolean) a.d(8, "ConnectivityLogging__disable_usb_trigger_configured_event", true).gu()).booleanValue();
    }

    @Override // defpackage.acou
    public final boolean u() {
        return ((Boolean) a.d(11, "ConnectivityLogging__log_gal_disconnect_telemetry_part_two_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acou
    public final boolean v() {
        return ((Boolean) a.d(20, "ConnectivityLogging__track_key_count_for_usb_connection_kill_switch", true).gu()).booleanValue();
    }
}
