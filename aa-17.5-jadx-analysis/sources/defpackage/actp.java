package defpackage;

/* loaded from: classes.dex */
public final class actp implements acto {
    private static final wcv a = new wcv(aclg.b, 26);

    @Override // defpackage.acto
    public final double a() {
        return ((Double) a.a(16, "Messaging__minimum_smart_action_confidence_score", 0.1d).gu()).doubleValue();
    }

    @Override // defpackage.acto
    public final long b() {
        return ((Long) a.b(14, "Messaging__max_last_msg_received_age_to_display_smart_actions_hr", 12L).gu()).longValue();
    }

    @Override // defpackage.acto
    public final long c() {
        return ((Long) a.b(15, "Messaging__maximum_smart_action_display_text_length", 10L).gu()).longValue();
    }

    @Override // defpackage.acto
    public final long d() {
        return ((Long) a.b(17, "Messaging__remove_fake_sbn_assistant_min_version", 301291321L).gu()).longValue();
    }

    @Override // defpackage.acto
    public final abrh e() {
        return (abrh) a.e(0, "Messaging__app_block_list", new actm(2), "CAYSG2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbRIcY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWFwcxIaY29tLmdtLmdtYy5ub21hZC5vd25lcnNoaXASEGpwLmNvLmhvbmRhLmxvZ3ISHGNvbS5nbS5idWljay5ub21hZC5vd25lcnNoaXASIGNvbS5nbS5jaGV2cm9sZXQubm9tYWQub3duZXJzaGlwEh9jb20uZ20uY2FkaWxsYWMubm9tYWQub3duZXJzaGlw").gu();
    }

    @Override // defpackage.acto
    public final abru f() {
        return (abru) a.e(10, "Messaging__empty_audio_uri_package_list", new actm(3), "CiFjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZXNzYWdpbmc").gu();
    }

    @Override // defpackage.acto
    public final abru g() {
        return (abru) a.e(21, "Messaging__send_message_intent_list", new actm(3), "Cjdjb20uZ29vZ2xlLmFuZHJvaWQudm9pY2VzZWFyY2guU0VORF9NRVNTQUdFX1RPX0NPTlRBQ1RTChxhbmRyb2lkLmludGVudC5hY3Rpb24uU0VORFRPCihjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5keW5hbWl0ZS5zdGFydGRt").gu();
    }

    @Override // defpackage.acto
    public final String h() {
        return (String) a.c(13, "Messaging__llm_info_page_uri", "https://support.google.com/assistant/answer/14524048").gu();
    }

    @Override // defpackage.acto
    public final boolean i() {
        return ((Boolean) a.d(1, "Messaging__app_identification_intent_service_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean j() {
        return ((Boolean) a.d(2, "Messaging__assistant_compose_message_client_input_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean k() {
        return ((Boolean) a.d(3, "Messaging__assistant_notification_data_sharing_frx_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean l() {
        return ((Boolean) a.d(4, "Messaging__assistant_notification_data_sharing_leave_behind_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean m() {
        return ((Boolean) a.d(5, "Messaging__autoplay_messages_kill_switch", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean n() {
        return ((Boolean) a.d(6, "Messaging__cal_mute_button_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean o() {
        return ((Boolean) a.d(7, "Messaging__carextender_enabled", true).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean p() {
        return ((Boolean) a.d(8, "Messaging__display_hun_only_for_notification_importance_above_default", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean q() {
        return ((Boolean) a.d(9, "Messaging__display_hun_only_for_notification_importance_above_low", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean r() {
        return ((Boolean) a.d(11, "Messaging__image_description_readout_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean s() {
        return ((Boolean) a.d(12, "Messaging__launcher_priority_messaging_suppression_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean t() {
        return ((Boolean) a.d(18, "Messaging__remove_fake_sbn_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean u() {
        return ((Boolean) a.d(19, "Messaging__remove_im_stream_item_path", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean v() {
        return ((Boolean) a.d(20, "Messaging__remove_sms_stream_item_path", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean w() {
        return ((Boolean) a.d(22, "Messaging__set_readout_button_label_to_play", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean x() {
        return ((Boolean) a.d(23, "Messaging__smart_action_navigate_enabled_for_all_nav_apps", false).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean y() {
        return ((Boolean) a.d(24, "Messaging__unexport_notification_action_receivers_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acto
    public final boolean z() {
        return ((Boolean) a.d(25, "Messaging__use_app_accent_color_as_fab_background", false).gu()).booleanValue();
    }
}
