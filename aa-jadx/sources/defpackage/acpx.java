package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acpx implements defpackage.acpw {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 22);

    @Override // defpackage.acpw
    public final long a() {
        return ((java.lang.Long) a.b(4, "ConnectivityLogging__bluetooth_timeout_millis", 10000L).fF()).longValue();
    }

    @Override // defpackage.acpw
    public final long b() {
        return ((java.lang.Long) a.b(5, "ConnectivityLogging__connectivity_refresh_timeout_ms", 3000L).fF()).longValue();
    }

    @Override // defpackage.acpw
    public final long c() {
        return ((java.lang.Long) a.b(10, "ConnectivityLogging__heartbeat_interval_ms", 60000L).fF()).longValue();
    }

    @Override // defpackage.acpw
    public final long d() {
        return ((java.lang.Long) a.b(15, "ConnectivityLogging__overlogged_connectivity_events_throttle_limit", 20L).fF()).longValue();
    }

    @Override // defpackage.acpw
    public final long e() {
        return ((java.lang.Long) a.b(16, "ConnectivityLogging__process_usb_level", 2L).fF()).longValue();
    }

    @Override // defpackage.acpw
    public final long f() {
        return ((java.lang.Long) a.b(17, "ConnectivityLogging__session_obsolete_expiration_timeout_ms", 120000L).fF()).longValue();
    }

    @Override // defpackage.acpw
    public final long g() {
        return ((java.lang.Long) a.b(18, "ConnectivityLogging__session_obsolete_expiration_via_last_event_timeout_ms", 60000L).fF()).longValue();
    }

    @Override // defpackage.acpw
    public final long h() {
        return ((java.lang.Long) a.b(19, "ConnectivityLogging__session_timeout_ms", 120000L).fF()).longValue();
    }

    @Override // defpackage.acpw
    public final defpackage.absv i() {
        return (defpackage.absv) a.e(2, "ConnectivityLogging__blocklisted_connectivity_events", new defpackage.acnn(10), "CgUMDQWQHA").fF();
    }

    @Override // defpackage.acpw
    public final defpackage.absv j() {
        return (defpackage.absv) a.e(9, "ConnectivityLogging__events_requiring_status", new defpackage.acnn(10), "ChcBAwQFBgcICQ8QERcZGhs4OeoHjxmDDw").fF();
    }

    @Override // defpackage.acpw
    public final defpackage.absv k() {
        return (defpackage.absv) a.e(12, "ConnectivityLogging__main_module_events", new defpackage.acnn(10), "CgsRjxnBF4MPhA+FDw").fF();
    }

    @Override // defpackage.acpw
    public final defpackage.absv l() {
        return (defpackage.absv) a.e(13, "ConnectivityLogging__non_extending_events", new defpackage.acnn(10), "").fF();
    }

    @Override // defpackage.acpw
    public final defpackage.absv m() {
        return (defpackage.absv) a.e(14, "ConnectivityLogging__overlogged_connectivity_events", new defpackage.acnn(10), "ChWVGpgggB2EHZogoh2eILgXxeoBmBo").fF();
    }

    @Override // defpackage.acpw
    public final java.lang.String n() {
        return (java.lang.String) a.c(3, "ConnectivityLogging__bluetooth_main_module_regex_name", ".*\\.android\\.bt$").fF();
    }

    @Override // defpackage.acpw
    public final java.lang.String o() {
        return (java.lang.String) a.c(21, "ConnectivityLogging__wifi_main_module_regex_name", ".*\\.android\\.wifi$").fF();
    }

    @Override // defpackage.acpw
    public final boolean p() {
        return ((java.lang.Boolean) a.d(0, "ConnectivityLogging__allow_repeated_startup_events", false).fF()).booleanValue();
    }

    @Override // defpackage.acpw
    public final boolean q() {
        return ((java.lang.Boolean) a.d(1, "ConnectivityLogging__always_log_bluetooth_disconnect", false).fF()).booleanValue();
    }

    @Override // defpackage.acpw
    public final boolean r() {
        return ((java.lang.Boolean) a.d(6, "ConnectivityLogging__crash_if_background_exception_in_connectivity_logger", false).fF()).booleanValue();
    }

    @Override // defpackage.acpw
    public final boolean s() {
        return ((java.lang.Boolean) a.d(7, "ConnectivityLogging__disable_usb_trigger_configured_accessory_event", true).fF()).booleanValue();
    }

    @Override // defpackage.acpw
    public final boolean t() {
        return ((java.lang.Boolean) a.d(8, "ConnectivityLogging__disable_usb_trigger_configured_event", true).fF()).booleanValue();
    }

    @Override // defpackage.acpw
    public final boolean u() {
        return ((java.lang.Boolean) a.d(11, "ConnectivityLogging__log_gal_disconnect_telemetry_part_two_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acpw
    public final boolean v() {
        return ((java.lang.Boolean) a.d(20, "ConnectivityLogging__track_key_count_for_usb_connection_kill_switch", true).fF()).booleanValue();
    }
}
