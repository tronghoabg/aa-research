package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acnh implements defpackage.acng {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 32);

    @Override // defpackage.acng
    public final boolean A() {
        return ((java.lang.Boolean) a.d(21, "Assistant__quick_feedback_throttling_enabled", true).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean B() {
        return ((java.lang.Boolean) a.d(25, "Assistant__scrim_click_closes_when_pending_open_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean C() {
        return ((java.lang.Boolean) a.d(28, "Assistant__upgrade_model_notification_alpha_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean D() {
        return ((java.lang.Boolean) a.d(29, "Assistant__upgrade_model_notification_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean E() {
        return ((java.lang.Boolean) a.d(30, "Assistant__virtual_device_id_in_client_state_snapshot_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean F() {
        return ((java.lang.Boolean) a.d(31, "Assistant__voice_session_manager_handles_asr_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final double a() {
        return ((java.lang.Double) a.a(2, "Assistant__assistant_message_summarization_quick_feedback_triggering_rate", 0.05d).fF()).doubleValue();
    }

    @Override // defpackage.acng
    public final double b() {
        return ((java.lang.Double) a.a(13, "Assistant__grpc_retry_backoff_multiplier", 2.0d).fF()).doubleValue();
    }

    @Override // defpackage.acng
    public final double c() {
        return ((java.lang.Double) a.a(14, "Assistant__grpc_retry_initial_backoff_seconds", 0.5d).fF()).doubleValue();
    }

    @Override // defpackage.acng
    public final double d() {
        return ((java.lang.Double) a.a(16, "Assistant__grpc_retry_max_backoff_seconds", 15.0d).fF()).doubleValue();
    }

    @Override // defpackage.acng
    public final double e() {
        return ((java.lang.Double) a.a(22, "Assistant__quick_feedback_triggering_rate", 0.02d).fF()).doubleValue();
    }

    @Override // defpackage.acng
    public final double f() {
        return ((java.lang.Double) a.a(24, "Assistant__robin_model_notification_triggering_rate", 0.0d).fF()).doubleValue();
    }

    @Override // defpackage.acng
    public final long g() {
        return ((java.lang.Long) a.b(0, "Assistant__api_version_override", -1L).fF()).longValue();
    }

    @Override // defpackage.acng
    public final long h() {
        return ((java.lang.Long) a.b(6, "Assistant__dodgeboost_initial_handshake_min_gsa_version", 301397393L).fF()).longValue();
    }

    @Override // defpackage.acng
    public final long i() {
        return ((java.lang.Long) a.b(7, "Assistant__education_delay_milliseconds", 15000L).fF()).longValue();
    }

    @Override // defpackage.acng
    public final long j() {
        return ((java.lang.Long) a.b(11, "Assistant__gemini_live_dashboard_focus_delay", 300L).fF()).longValue();
    }

    @Override // defpackage.acng
    public final long k() {
        return ((java.lang.Long) a.b(15, "Assistant__grpc_retry_max_attempts", 5L).fF()).longValue();
    }

    @Override // defpackage.acng
    public final long l() {
        return ((java.lang.Long) a.b(19, "Assistant__icon_experiment_variant", 0L).fF()).longValue();
    }

    @Override // defpackage.acng
    public final long m() {
        return ((java.lang.Long) a.b(23, "Assistant__robin_model_notification_max_count", 1L).fF()).longValue();
    }

    @Override // defpackage.acng
    public final long n() {
        return ((java.lang.Long) a.b(27, "Assistant__transcription_character_limit", 45L).fF()).longValue();
    }

    @Override // defpackage.acng
    public final defpackage.absv o() {
        return (defpackage.absv) a.e(26, "Assistant__supported_api_versions", new defpackage.acnu(1), "CgUAAQIEBQ").fF();
    }

    @Override // defpackage.acng
    public final boolean p() {
        return ((java.lang.Boolean) a.d(1, "Assistant__assistant_message_summarization_quick_feedback_throttling_enabled", true).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean q() {
        return ((java.lang.Boolean) a.d(3, "Assistant__check_all_assistant_regions_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean r() {
        return ((java.lang.Boolean) a.d(4, "Assistant__debug_query_sender_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean s() {
        return ((java.lang.Boolean) a.d(5, "Assistant__dodgeboost_initial_handshake_enabled", true).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean t() {
        return ((java.lang.Boolean) a.d(8, "Assistant__enable_feedback_after_thumbs_down", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean u() {
        return ((java.lang.Boolean) a.d(9, "Assistant__enable_waive_priority_bind", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean v() {
        return ((java.lang.Boolean) a.d(10, "Assistant__gemini_barge_in_enabled_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean w() {
        return ((java.lang.Boolean) a.d(12, "Assistant__gemini_luminous_ui_updates", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean x() {
        return ((java.lang.Boolean) a.d(17, "Assistant__gsa_dismisses_on_nav_active_start_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean y() {
        return ((java.lang.Boolean) a.d(18, "Assistant__has_latest_robin_model", false).fF()).booleanValue();
    }

    @Override // defpackage.acng
    public final boolean z() {
        return ((java.lang.Boolean) a.d(20, "Assistant__interrupt_live_on_short_search_key_press_kill_switch", true).fF()).booleanValue();
    }
}
