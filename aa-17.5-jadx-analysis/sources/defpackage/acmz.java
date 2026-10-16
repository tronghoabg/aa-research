package defpackage;

/* loaded from: classes.dex */
public final class acmz implements acmy {
    private static final wcv a = new wcv(aclg.b, 8);

    @Override // defpackage.acmy
    public final long a() {
        return ((Long) a.b(0, "AudioFlowControl__bottom_half_sender_lib_max_queue_ms", 900L).gu()).longValue();
    }

    @Override // defpackage.acmy
    public final long b() {
        return ((Long) a.b(1, "AudioFlowControl__bottom_half_sender_lib_resume_queue_ms", 700L).gu()).longValue();
    }

    @Override // defpackage.acmy
    public final long c() {
        return ((Long) a.b(5, "AudioFlowControl__transmission_queue_max_capacity", 0L).gu()).longValue();
    }

    @Override // defpackage.acmy
    public final boolean d() {
        return ((Boolean) a.d(2, "AudioFlowControl__enable_bottom_half_sender_lib_queue_dropping", false).gu()).booleanValue();
    }

    @Override // defpackage.acmy
    public final boolean e() {
        return ((Boolean) a.d(3, "AudioFlowControl__force_flow_control_for_small_max_unacked", false).gu()).booleanValue();
    }

    @Override // defpackage.acmy
    public final boolean f() {
        return ((Boolean) a.d(4, "AudioFlowControl__throttling_disabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acmy
    public final boolean g() {
        return ((Boolean) a.d(6, "AudioFlowControl__use_audio_frame_processor_interface_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acmy
    public final boolean h() {
        return ((Boolean) a.d(7, "AudioFlowControl__use_synchronous_audio_processor", false).gu()).booleanValue();
    }
}
