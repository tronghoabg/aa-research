package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acpc implements defpackage.acpb {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 10);

    @Override // defpackage.acpb
    public final defpackage.absv a() {
        return (defpackage.absv) a.e(6, "CarActivityManager__interaction_log_command_codes", new defpackage.acnn(7), "CgwAAgUHCQsNFBYXGzE").fF();
    }

    @Override // defpackage.acpb
    public final defpackage.absv b() {
        return (defpackage.absv) a.e(8, "CarActivityManager__latency_log_command_codes", new defpackage.acnn(7), "CgYAAgcNGzE").fF();
    }

    @Override // defpackage.acpb
    public final defpackage.absx c() {
        return (defpackage.absx) a.e(5, "CarActivityManager__gmm_start_sub_phase_timers_hu_make_allow_list", new defpackage.acnn(8), "CgdoeXVuZGFpCgNraWE").fF();
    }

    @Override // defpackage.acpb
    public final defpackage.absx d() {
        return (defpackage.absx) a.e(7, "CarActivityManager__interaction_log_packages", new defpackage.acnn(8), "").fF();
    }

    @Override // defpackage.acpb
    public final boolean e() {
        return ((java.lang.Boolean) a.d(0, "CarActivityManager__cancel_pending_lifecycle_events_for_finish", false).fF()).booleanValue();
    }

    @Override // defpackage.acpb
    public final boolean f() {
        return ((java.lang.Boolean) a.d(1, "CarActivityManager__check_start_info_for_fallback_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acpb
    public final boolean g() {
        return ((java.lang.Boolean) a.d(2, "CarActivityManager__fail_resume_for_no_drawing_spec_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acpb
    public final boolean h() {
        return ((java.lang.Boolean) a.d(3, "CarActivityManager__fail_resume_for_wrong_state_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acpb
    public final boolean i() {
        return ((java.lang.Boolean) a.d(4, "CarActivityManager__forward_keycode_tel_to_gearhead", false).fF()).booleanValue();
    }

    @Override // defpackage.acpb
    public final boolean j() {
        return ((java.lang.Boolean) a.d(9, "CarActivityManager__use_pending_video_config_kill_switch", true).fF()).booleanValue();
    }
}
