package defpackage;

/* loaded from: classes.dex */
public final class acrd implements acrc {
    private static final wcv a = new wcv(aclg.b, 29);

    @Override // defpackage.acrc
    public final boolean A() {
        return ((Boolean) a.d(26, "FrameworkGalFeature__tls_auth_bypass_fix", false).gu()).booleanValue();
    }

    @Override // defpackage.acrc
    public final boolean B() {
        return ((Boolean) a.d(27, "FrameworkGalFeature__use_ping_configuration", false).gu()).booleanValue();
    }

    @Override // defpackage.acrc
    public final boolean C() {
        return ((Boolean) a.d(28, "FrameworkGalFeature__use_sequence_numbers", false).gu()).booleanValue();
    }

    @Override // defpackage.acrc
    public final long a() {
        return ((Long) a.b(0, "FrameworkGalFeature__audio_deprioritization_threshold_ms_usb", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long b() {
        return ((Long) a.b(1, "FrameworkGalFeature__audio_deprioritization_threshold_ms_wifi", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long c() {
        return ((Long) a.b(3, "FrameworkGalFeature__default_max_hu_audio_buffer_ms", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long d() {
        return ((Long) a.b(4, "FrameworkGalFeature__default_max_hu_audio_buffer_ms_navigation", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long e() {
        return ((Long) a.b(5, "FrameworkGalFeature__default_target_hu_buffer_after_max_hu_buffer_reached_ms", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long f() {
        return ((Long) a.b(6, "FrameworkGalFeature__default_target_hu_buffer_after_max_hu_buffer_reached_ms_navigation", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long g() {
        return ((Long) a.b(8, "FrameworkGalFeature__fragment_size", 16128L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long h() {
        return ((Long) a.b(9, "FrameworkGalFeature__framer_send_buffer_size", 16384L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long i() {
        return ((Long) a.b(11, "FrameworkGalFeature__hu_gal_ping_timeout_delta_ms", 50L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long j() {
        return ((Long) a.b(15, "FrameworkGalFeature__max_audio_buffer_ms", 900L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long k() {
        return ((Long) a.b(16, "FrameworkGalFeature__max_hu_audio_buffer_ms", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long l() {
        return ((Long) a.b(17, "FrameworkGalFeature__max_hu_audio_buffer_ms_navigation", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long m() {
        return ((Long) a.b(19, "FrameworkGalFeature__stall_threshold_ms_usb", 5000L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long n() {
        return ((Long) a.b(20, "FrameworkGalFeature__stall_threshold_ms_wifi", 5000L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long o() {
        return ((Long) a.b(21, "FrameworkGalFeature__target_buffer_after_max_buffer_reached_ms", 700L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long p() {
        return ((Long) a.b(22, "FrameworkGalFeature__target_buffer_after_stall_ms_usb", 250L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long q() {
        return ((Long) a.b(23, "FrameworkGalFeature__target_buffer_after_stall_ms_wifi", 250L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long r() {
        return ((Long) a.b(24, "FrameworkGalFeature__target_hu_buffer_after_max_hu_buffer_reached_ms", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final long s() {
        return ((Long) a.b(25, "FrameworkGalFeature__target_hu_buffer_after_max_hu_buffer_reached_ms_navigation", 0L).gu()).longValue();
    }

    @Override // defpackage.acrc
    public final abrk t() {
        return (abrk) a.e(10, "FrameworkGalFeature__gal_ping_configuration", new acml(16), "CMA+EOgHGMgBIAU").gu();
    }

    @Override // defpackage.acrc
    public final boolean u() {
        return ((Boolean) a.d(2, "FrameworkGalFeature__close_on_reader_finish", false).gu()).booleanValue();
    }

    @Override // defpackage.acrc
    public final boolean v() {
        return ((Boolean) a.d(7, "FrameworkGalFeature__detect_hu_gal_ping_timeout", false).gu()).booleanValue();
    }

    @Override // defpackage.acrc
    public final boolean w() {
        return ((Boolean) a.d(12, "FrameworkGalFeature__invoke_callback_when_bye_bye_requested_by_md", false).gu()).booleanValue();
    }

    @Override // defpackage.acrc
    public final boolean x() {
        return ((Boolean) a.d(13, "FrameworkGalFeature__is_gal_snoop_available", false).gu()).booleanValue();
    }

    @Override // defpackage.acrc
    public final boolean y() {
        return ((Boolean) a.d(14, "FrameworkGalFeature__is_gal_snoop_enabled_in_starship", false).gu()).booleanValue();
    }

    @Override // defpackage.acrc
    public final boolean z() {
        return ((Boolean) a.d(18, "FrameworkGalFeature__post_reader_close_on_control_channel_handler", false).gu()).booleanValue();
    }
}
