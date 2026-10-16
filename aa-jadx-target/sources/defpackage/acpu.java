package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acpu implements defpackage.acpt {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 15);

    @Override // defpackage.acpt
    public final long a() {
        return ((java.lang.Long) a.b(1, "ClientAnrs__default_timeout_ms", 5000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long b() {
        return ((java.lang.Long) a.b(2, "ClientAnrs__display_cam_timeout_ms", 53000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long c() {
        return ((java.lang.Long) a.b(3, "ClientAnrs__finish_timeout_ms", 5000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long d() {
        return ((java.lang.Long) a.b(4, "ClientAnrs__input_event_timeout_ms", 10000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long e() {
        return ((java.lang.Long) a.b(5, "ClientAnrs__input_focus_change_timeout_ms", 10000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long f() {
        return ((java.lang.Long) a.b(6, "ClientAnrs__lifetime_timeout_ms", 30000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long g() {
        return ((java.lang.Long) a.b(8, "ClientAnrs__on_new_intent_timeout_ms", 10000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long h() {
        return ((java.lang.Long) a.b(9, "ClientAnrs__pause_timeout_ms", 10000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long i() {
        return ((java.lang.Long) a.b(10, "ClientAnrs__resume_timeout_ms", 10000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long j() {
        return ((java.lang.Long) a.b(11, "ClientAnrs__setup_timeout_ms", 18000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long k() {
        return ((java.lang.Long) a.b(12, "ClientAnrs__start_timeout_ms", 13000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long l() {
        return ((java.lang.Long) a.b(13, "ClientAnrs__stop_timeout_ms", 5000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final long m() {
        return ((java.lang.Long) a.b(14, "ClientAnrs__video_config_change_timeout_ms", 10000L).fF()).longValue();
    }

    @Override // defpackage.acpt
    public final boolean n() {
        return ((java.lang.Boolean) a.d(0, "ClientAnrs__add_thread_stack_traces", false).fF()).booleanValue();
    }

    @Override // defpackage.acpt
    public final boolean o() {
        return ((java.lang.Boolean) a.d(7, "ClientAnrs__log_client_anrs", true).fF()).booleanValue();
    }
}
