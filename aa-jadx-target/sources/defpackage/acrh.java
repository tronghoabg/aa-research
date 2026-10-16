package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acrh implements acrg {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 20);

    public final double a() {
        return ((java.lang.Double) a.a(15, "Dialer__quick_feedback_display_rate", 0.02d).fF()).doubleValue();
    }

    public final long b() {
        return ((java.lang.Long) a.b(0, "Dialer__call_audio_spot_check_delay_millis", 4000L).fF()).longValue();
    }

    public final long c() {
        return ((java.lang.Long) a.b(3, "Dialer__delayed_startup_timeout_for_duplex_ics_ms", 60000L).fF()).longValue();
    }

    public final long d() {
        return ((java.lang.Long) a.b(4, "Dialer__delayed_stop_timeout_for_duplex_ics_ms", 60000L).fF()).longValue();
    }

    public final long e() {
        return ((java.lang.Long) a.b(13, "Dialer__notification_image_cancel_delay_ms", 1000L).fF()).longValue();
    }

    public final defpackage.absk f() {
        return (defpackage.absk) a.e(18, "Dialer__voip_package_list", new defpackage.acnu(12), "CAU").fF();
    }

    public final defpackage.absx g() {
        return (defpackage.absx) a.e(5, "Dialer__dialer_to_calling_component_package_map", new defpackage.acnu(11), "Cjdjb20uc2Ftc3VuZy5hbmRyb2lkLmRpYWxlcjpjb20uc2Ftc3VuZy5hbmRyb2lkLmluY2FsbHVp").fF();
    }

    public final defpackage.absx h() {
        return (defpackage.absx) a.e(9, "Dialer__external_dialer_allow_list", new defpackage.acnu(11), "Chtjb20uZ29vZ2xlLmFuZHJvaWQuZGlhbGVyOjo").fF();
    }

    public final defpackage.absx i() {
        return (defpackage.absx) a.e(16, "Dialer__supported_dialers_for_duplex", new defpackage.acnu(11), "Chxjb20uc2Ftc3VuZy5hbmRyb2lkLmRpYWxlcjo6Cihjb20uc2Ftc3VuZy5hbmRyb2lkLmluY2FsbHVpOjE0MTAwMDAwMjE6CiNjb20uZ29vZ2xlLmFuZHJvaWQuZGlhbGVyOjE2MjQyNzQ4Og").fF();
    }

    public final boolean j() {
        return ((java.lang.Boolean) a.d(1, "Dialer__call_availability_error_screen_enabled", false).fF()).booleanValue();
    }

    public final boolean k() {
        return ((java.lang.Boolean) a.d(2, "Dialer__calls_manager_ics_enabled", false).fF()).booleanValue();
    }

    public final boolean l() {
        return ((java.lang.Boolean) a.d(6, "Dialer__disable_cp2_account_type_voip_filter_kill_switch", true).fF()).booleanValue();
    }

    public final boolean m() {
        return ((java.lang.Boolean) a.d(7, "Dialer__enable_cp2_contact_lookup_with_account_query_type", false).fF()).booleanValue();
    }

    public final boolean n() {
        return ((java.lang.Boolean) a.d(8, "Dialer__enable_third_action_on_call_huns", false).fF()).booleanValue();
    }

    public final boolean o() {
        return ((java.lang.Boolean) a.d(10, "Dialer__external_dialer_enabled", false).fF()).booleanValue();
    }

    public final boolean p() {
        return ((java.lang.Boolean) a.d(11, "Dialer__multi_sim_is_dry_run", false).fF()).booleanValue();
    }

    public final boolean q() {
        return ((java.lang.Boolean) a.d(12, "Dialer__multi_sim_tooltip_enabled", false).fF()).booleanValue();
    }

    public final boolean r() {
        return ((java.lang.Boolean) a.d(14, "Dialer__notification_powered_calls_enabled", true).fF()).booleanValue();
    }

    public final boolean s() {
        return ((java.lang.Boolean) a.d(17, "Dialer__unified_iccaras_enabled", false).fF()).booleanValue();
    }

    public final boolean t() {
        return ((java.lang.Boolean) a.d(19, "Dialer__when_api_37_disable_cp2_account_type_query_kill_switch", true).fF()).booleanValue();
    }
}
