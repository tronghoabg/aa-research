package defpackage;

/* loaded from: classes.dex */
public final class acoa implements acnz {
    private static final wcv a = new wcv(aclg.b, 10);

    @Override // defpackage.acnz
    public final abrs a() {
        return (abrs) a.e(6, "CarActivityManager__interaction_log_command_codes", new acml(7), "CgwAAgUHCQsNFBYXGzE").gu();
    }

    @Override // defpackage.acnz
    public final abrs b() {
        return (abrs) a.e(8, "CarActivityManager__latency_log_command_codes", new acml(7), "CgYAAgcNGzE").gu();
    }

    @Override // defpackage.acnz
    public final abru c() {
        return (abru) a.e(5, "CarActivityManager__gmm_start_sub_phase_timers_hu_make_allow_list", new acml(8), "CgdoeXVuZGFpCgNraWE").gu();
    }

    @Override // defpackage.acnz
    public final abru d() {
        return (abru) a.e(7, "CarActivityManager__interaction_log_packages", new acml(8), "").gu();
    }

    @Override // defpackage.acnz
    public final boolean e() {
        return ((Boolean) a.d(0, "CarActivityManager__cancel_pending_lifecycle_events_for_finish", false).gu()).booleanValue();
    }

    @Override // defpackage.acnz
    public final boolean f() {
        return ((Boolean) a.d(1, "CarActivityManager__check_start_info_for_fallback_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acnz
    public final boolean g() {
        return ((Boolean) a.d(2, "CarActivityManager__fail_resume_for_no_drawing_spec_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acnz
    public final boolean h() {
        return ((Boolean) a.d(3, "CarActivityManager__fail_resume_for_wrong_state_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acnz
    public final boolean i() {
        return ((Boolean) a.d(4, "CarActivityManager__forward_keycode_tel_to_gearhead", false).gu()).booleanValue();
    }

    @Override // defpackage.acnz
    public final boolean j() {
        return ((Boolean) a.d(9, "CarActivityManager__use_pending_video_config_kill_switch", true).gu()).booleanValue();
    }
}
