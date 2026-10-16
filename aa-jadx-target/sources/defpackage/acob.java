package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acob implements defpackage.acoa {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 8);

    @Override // defpackage.acoa
    public final long a() {
        return ((java.lang.Long) a.b(0, "AudioFlowControl__bottom_half_sender_lib_max_queue_ms", 900L).fF()).longValue();
    }

    @Override // defpackage.acoa
    public final long b() {
        return ((java.lang.Long) a.b(1, "AudioFlowControl__bottom_half_sender_lib_resume_queue_ms", 700L).fF()).longValue();
    }

    @Override // defpackage.acoa
    public final long c() {
        return ((java.lang.Long) a.b(5, "AudioFlowControl__transmission_queue_max_capacity", 0L).fF()).longValue();
    }

    @Override // defpackage.acoa
    public final boolean d() {
        return ((java.lang.Boolean) a.d(2, "AudioFlowControl__enable_bottom_half_sender_lib_queue_dropping", false).fF()).booleanValue();
    }

    @Override // defpackage.acoa
    public final boolean e() {
        return ((java.lang.Boolean) a.d(3, "AudioFlowControl__force_flow_control_for_small_max_unacked", false).fF()).booleanValue();
    }

    @Override // defpackage.acoa
    public final boolean f() {
        return ((java.lang.Boolean) a.d(4, "AudioFlowControl__throttling_disabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acoa
    public final boolean g() {
        return ((java.lang.Boolean) a.d(6, "AudioFlowControl__use_audio_frame_processor_interface_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acoa
    public final boolean h() {
        return ((java.lang.Boolean) a.d(7, "AudioFlowControl__use_synchronous_audio_processor", false).fF()).booleanValue();
    }
}
