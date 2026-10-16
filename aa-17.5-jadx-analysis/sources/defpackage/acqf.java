package defpackage;

/* loaded from: classes.dex */
public final class acqf implements acqe {
    private static final wcv a = new wcv(aclg.b, 19);

    @Override // defpackage.acqe
    public final double a() {
        return ((Double) a.a(14, "Dialer__quick_feedback_display_rate", 0.02d).gu()).doubleValue();
    }

    @Override // defpackage.acqe
    public final long b() {
        return ((Long) a.b(0, "Dialer__call_audio_spot_check_delay_millis", 4000L).gu()).longValue();
    }

    @Override // defpackage.acqe
    public final long c() {
        return ((Long) a.b(3, "Dialer__delayed_startup_timeout_for_duplex_ics_ms", 60000L).gu()).longValue();
    }

    @Override // defpackage.acqe
    public final long d() {
        return ((Long) a.b(4, "Dialer__delayed_stop_timeout_for_duplex_ics_ms", 60000L).gu()).longValue();
    }

    @Override // defpackage.acqe
    public final long e() {
        return ((Long) a.b(12, "Dialer__notification_image_cancel_delay_ms", 1000L).gu()).longValue();
    }

    @Override // defpackage.acqe
    public final abrh f() {
        return (abrh) a.e(17, "Dialer__voip_package_list", new acms(12), "CAU").gu();
    }

    @Override // defpackage.acqe
    public final abru g() {
        return (abru) a.e(5, "Dialer__dialer_to_calling_component_package_map", new acms(11), "Cjdjb20uc2Ftc3VuZy5hbmRyb2lkLmRpYWxlcjpjb20uc2Ftc3VuZy5hbmRyb2lkLmluY2FsbHVp").gu();
    }

    @Override // defpackage.acqe
    public final abru h() {
        return (abru) a.e(8, "Dialer__external_dialer_allow_list", new acms(11), "Chtjb20uZ29vZ2xlLmFuZHJvaWQuZGlhbGVyOjo").gu();
    }

    @Override // defpackage.acqe
    public final abru i() {
        return (abru) a.e(15, "Dialer__supported_dialers_for_duplex", new acms(11), "Chxjb20uc2Ftc3VuZy5hbmRyb2lkLmRpYWxlcjo6Cihjb20uc2Ftc3VuZy5hbmRyb2lkLmluY2FsbHVpOjE0MTAwMDAwMjE6CiNjb20uZ29vZ2xlLmFuZHJvaWQuZGlhbGVyOjE2MjQyNzQ4Og").gu();
    }

    @Override // defpackage.acqe
    public final boolean j() {
        return ((Boolean) a.d(1, "Dialer__call_availability_error_screen_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acqe
    public final boolean k() {
        return ((Boolean) a.d(2, "Dialer__calls_manager_ics_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acqe
    public final boolean l() {
        return ((Boolean) a.d(6, "Dialer__disable_cp2_account_type_voip_filter_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acqe
    public final boolean m() {
        return ((Boolean) a.d(7, "Dialer__enable_cp2_contact_lookup_with_account_query_type", false).gu()).booleanValue();
    }

    @Override // defpackage.acqe
    public final boolean n() {
        return ((Boolean) a.d(9, "Dialer__external_dialer_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acqe
    public final boolean o() {
        return ((Boolean) a.d(10, "Dialer__multi_sim_is_dry_run", false).gu()).booleanValue();
    }

    @Override // defpackage.acqe
    public final boolean p() {
        return ((Boolean) a.d(11, "Dialer__multi_sim_tooltip_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acqe
    public final boolean q() {
        return ((Boolean) a.d(13, "Dialer__notification_powered_calls_enabled", true).gu()).booleanValue();
    }

    @Override // defpackage.acqe
    public final boolean r() {
        return ((Boolean) a.d(16, "Dialer__unified_iccaras_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acqe
    public final boolean s() {
        return ((Boolean) a.d(18, "Dialer__when_api_37_disable_cp2_account_type_query_kill_switch", true).gu()).booleanValue();
    }
}
