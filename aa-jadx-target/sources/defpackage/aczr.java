package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aczr implements defpackage.aczq {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 23);

    @Override // defpackage.aczq
    public final double a() {
        return ((java.lang.Double) a.a(2, "VideoEncoderParams__adaptive_bitrate_gradient_h264", 2.75d).fF()).doubleValue();
    }

    @Override // defpackage.aczq
    public final double b() {
        return ((java.lang.Double) a.a(3, "VideoEncoderParams__adaptive_bitrate_gradient_h265", 0.46d).fF()).doubleValue();
    }

    @Override // defpackage.aczq
    public final double c() {
        return ((java.lang.Double) a.a(6, "VideoEncoderParams__bitrate_adjustment_exponent", 0.5d).fF()).doubleValue();
    }

    @Override // defpackage.aczq
    public final double d() {
        return ((java.lang.Double) a.a(20, "VideoEncoderParams__sixty_fps_bitrate_multiplier", 2.0d).fF()).doubleValue();
    }

    @Override // defpackage.aczq
    public final double e() {
        return ((java.lang.Double) a.a(21, "VideoEncoderParams__sixty_fps_bitrate_multiplier_h265", 2.0d).fF()).doubleValue();
    }

    @Override // defpackage.aczq
    public final double f() {
        return ((java.lang.Double) a.a(22, "VideoEncoderParams__throw_encoder_errors_percent", 0.0d).fF()).doubleValue();
    }

    @Override // defpackage.aczq
    public final long g() {
        return ((java.lang.Long) a.b(0, "VideoEncoderParams__adaptive_bitrate_baseline_h264", 1500000L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final long h() {
        return ((java.lang.Long) a.b(1, "VideoEncoderParams__adaptive_bitrate_baseline_h265", 3500000L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final long i() {
        return ((java.lang.Long) a.b(4, "VideoEncoderParams__adaptive_bitrate_minimal_h264", 2000000L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final long j() {
        return ((java.lang.Long) a.b(5, "VideoEncoderParams__adaptive_bitrate_minimal_h265", 2000000L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final long k() {
        return ((java.lang.Long) a.b(14, "VideoEncoderParams__key_frame_interval_ackless", 2L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final long l() {
        return ((java.lang.Long) a.b(15, "VideoEncoderParams__key_frame_interval_wireless", 60L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final long m() {
        return ((java.lang.Long) a.b(16, "VideoEncoderParams__max_qp_wireless", 30L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final long n() {
        return ((java.lang.Long) a.b(17, "VideoEncoderParams__min_qp_wireless", 15L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final long o() {
        return ((java.lang.Long) a.b(18, "VideoEncoderParams__roi_qp_offset", 0L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final long p() {
        return ((java.lang.Long) a.b(19, "VideoEncoderParams__roi_qp_offset_margin", 127L).fF()).longValue();
    }

    @Override // defpackage.aczq
    public final boolean q() {
        return ((java.lang.Boolean) a.d(7, "VideoEncoderParams__disable_h265_encoder_checker", false).fF()).booleanValue();
    }

    @Override // defpackage.aczq
    public final boolean r() {
        return ((java.lang.Boolean) a.d(8, "VideoEncoderParams__enable_max_h264_encoder_compatibility", false).fF()).booleanValue();
    }

    @Override // defpackage.aczq
    public final boolean s() {
        return ((java.lang.Boolean) a.d(9, "VideoEncoderParams__enable_max_h264_encoder_compatibility_fast_track", false).fF()).booleanValue();
    }

    @Override // defpackage.aczq
    public final boolean t() {
        return ((java.lang.Boolean) a.d(10, "VideoEncoderParams__enable_roi_encoding", true).fF()).booleanValue();
    }

    @Override // defpackage.aczq
    public final boolean u() {
        return ((java.lang.Boolean) a.d(11, "VideoEncoderParams__enforce_supported_codec_dimensions", false).fF()).booleanValue();
    }

    @Override // defpackage.aczq
    public final boolean v() {
        return ((java.lang.Boolean) a.d(12, "VideoEncoderParams__extend_avc_support", false).fF()).booleanValue();
    }

    @Override // defpackage.aczq
    public final boolean w() {
        return ((java.lang.Boolean) a.d(13, "VideoEncoderParams__force_software_codec", false).fF()).booleanValue();
    }
}
