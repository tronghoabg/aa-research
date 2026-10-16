package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acsf implements defpackage.acse {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 30);

    @Override // defpackage.acse
    public final boolean A() {
        return ((java.lang.Boolean) a.d(19, "FrameworkGalFeature__post_reader_close_on_control_channel_handler", false).fF()).booleanValue();
    }

    @Override // defpackage.acse
    public final boolean B() {
        return ((java.lang.Boolean) a.d(27, "FrameworkGalFeature__tls_auth_bypass_fix", false).fF()).booleanValue();
    }

    @Override // defpackage.acse
    public final boolean C() {
        return ((java.lang.Boolean) a.d(28, "FrameworkGalFeature__use_ping_configuration", false).fF()).booleanValue();
    }

    @Override // defpackage.acse
    public final boolean D() {
        return ((java.lang.Boolean) a.d(29, "FrameworkGalFeature__use_sequence_numbers", false).fF()).booleanValue();
    }

    @Override // defpackage.acse
    public final long a() {
        return ((java.lang.Long) a.b(0, "FrameworkGalFeature__audio_deprioritization_threshold_ms_usb", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long b() {
        return ((java.lang.Long) a.b(1, "FrameworkGalFeature__audio_deprioritization_threshold_ms_wifi", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long c() {
        return ((java.lang.Long) a.b(3, "FrameworkGalFeature__default_max_hu_audio_buffer_ms", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long d() {
        return ((java.lang.Long) a.b(4, "FrameworkGalFeature__default_max_hu_audio_buffer_ms_navigation", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long e() {
        return ((java.lang.Long) a.b(5, "FrameworkGalFeature__default_target_hu_buffer_after_max_hu_buffer_reached_ms", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long f() {
        return ((java.lang.Long) a.b(6, "FrameworkGalFeature__default_target_hu_buffer_after_max_hu_buffer_reached_ms_navigation", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long g() {
        return ((java.lang.Long) a.b(8, "FrameworkGalFeature__fragment_size", 16128L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long h() {
        return ((java.lang.Long) a.b(9, "FrameworkGalFeature__framer_send_buffer_size", 16384L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long i() {
        return ((java.lang.Long) a.b(11, "FrameworkGalFeature__hu_gal_ping_timeout_delta_ms", 50L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long j() {
        return ((java.lang.Long) a.b(16, "FrameworkGalFeature__max_audio_buffer_ms", 900L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long k() {
        return ((java.lang.Long) a.b(17, "FrameworkGalFeature__max_hu_audio_buffer_ms", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long l() {
        return ((java.lang.Long) a.b(18, "FrameworkGalFeature__max_hu_audio_buffer_ms_navigation", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long m() {
        return ((java.lang.Long) a.b(20, "FrameworkGalFeature__stall_threshold_ms_usb", 5000L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long n() {
        return ((java.lang.Long) a.b(21, "FrameworkGalFeature__stall_threshold_ms_wifi", 5000L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long o() {
        return ((java.lang.Long) a.b(22, "FrameworkGalFeature__target_buffer_after_max_buffer_reached_ms", 700L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long p() {
        return ((java.lang.Long) a.b(23, "FrameworkGalFeature__target_buffer_after_stall_ms_usb", 250L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long q() {
        return ((java.lang.Long) a.b(24, "FrameworkGalFeature__target_buffer_after_stall_ms_wifi", 250L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long r() {
        return ((java.lang.Long) a.b(25, "FrameworkGalFeature__target_hu_buffer_after_max_hu_buffer_reached_ms", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final long s() {
        return ((java.lang.Long) a.b(26, "FrameworkGalFeature__target_hu_buffer_after_max_hu_buffer_reached_ms_navigation", 0L).fF()).longValue();
    }

    @Override // defpackage.acse
    public final defpackage.absn t() {
        return (defpackage.absn) a.e(10, "FrameworkGalFeature__gal_ping_configuration", new defpackage.acnn(16), "CMA+EOgHGMgBIAU").fF();
    }

    @Override // defpackage.acse
    public final boolean u() {
        return ((java.lang.Boolean) a.d(2, "FrameworkGalFeature__close_on_reader_finish", false).fF()).booleanValue();
    }

    @Override // defpackage.acse
    public final boolean v() {
        return ((java.lang.Boolean) a.d(7, "FrameworkGalFeature__detect_hu_gal_ping_timeout", false).fF()).booleanValue();
    }

    @Override // defpackage.acse
    public final boolean w() {
        return ((java.lang.Boolean) a.d(12, "FrameworkGalFeature__invoke_callback_when_bye_bye_requested_by_md", false).fF()).booleanValue();
    }

    @Override // defpackage.acse
    public final boolean x() {
        return ((java.lang.Boolean) a.d(13, "FrameworkGalFeature__is_gal_snoop_available", false).fF()).booleanValue();
    }

    @Override // defpackage.acse
    public final boolean y() {
        return ((java.lang.Boolean) a.d(14, "FrameworkGalFeature__is_gal_snoop_enabled_in_starship", false).fF()).booleanValue();
    }

    @Override // defpackage.acse
    public final boolean z() {
        return ((java.lang.Boolean) a.d(15, "FrameworkGalFeature__log_unexpected_unencrypted_message_type", false).fF()).booleanValue();
    }
}
