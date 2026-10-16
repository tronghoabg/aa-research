package defpackage;

/* loaded from: classes.dex */
public final class acyp implements acyo {
    private static final wcv a = new wcv(aclg.b, 23);

    @Override // defpackage.acyo
    public final double a() {
        return ((Double) a.a(2, "VideoEncoderParams__adaptive_bitrate_gradient_h264", 2.75d).gu()).doubleValue();
    }

    @Override // defpackage.acyo
    public final double b() {
        return ((Double) a.a(3, "VideoEncoderParams__adaptive_bitrate_gradient_h265", 0.46d).gu()).doubleValue();
    }

    @Override // defpackage.acyo
    public final double c() {
        return ((Double) a.a(6, "VideoEncoderParams__bitrate_adjustment_exponent", 0.5d).gu()).doubleValue();
    }

    @Override // defpackage.acyo
    public final double d() {
        return ((Double) a.a(20, "VideoEncoderParams__sixty_fps_bitrate_multiplier", 2.0d).gu()).doubleValue();
    }

    @Override // defpackage.acyo
    public final double e() {
        return ((Double) a.a(21, "VideoEncoderParams__sixty_fps_bitrate_multiplier_h265", 2.0d).gu()).doubleValue();
    }

    @Override // defpackage.acyo
    public final double f() {
        return ((Double) a.a(22, "VideoEncoderParams__throw_encoder_errors_percent", 0.0d).gu()).doubleValue();
    }

    @Override // defpackage.acyo
    public final long g() {
        return ((Long) a.b(0, "VideoEncoderParams__adaptive_bitrate_baseline_h264", 1500000L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final long h() {
        return ((Long) a.b(1, "VideoEncoderParams__adaptive_bitrate_baseline_h265", 3500000L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final long i() {
        return ((Long) a.b(4, "VideoEncoderParams__adaptive_bitrate_minimal_h264", 2000000L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final long j() {
        return ((Long) a.b(5, "VideoEncoderParams__adaptive_bitrate_minimal_h265", 2000000L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final long k() {
        return ((Long) a.b(14, "VideoEncoderParams__key_frame_interval_ackless", 2L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final long l() {
        return ((Long) a.b(15, "VideoEncoderParams__key_frame_interval_wireless", 60L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final long m() {
        return ((Long) a.b(16, "VideoEncoderParams__max_qp_wireless", 30L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final long n() {
        return ((Long) a.b(17, "VideoEncoderParams__min_qp_wireless", 15L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final long o() {
        return ((Long) a.b(18, "VideoEncoderParams__roi_qp_offset", 0L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final long p() {
        return ((Long) a.b(19, "VideoEncoderParams__roi_qp_offset_margin", 127L).gu()).longValue();
    }

    @Override // defpackage.acyo
    public final boolean q() {
        return ((Boolean) a.d(7, "VideoEncoderParams__disable_h265_encoder_checker", false).gu()).booleanValue();
    }

    @Override // defpackage.acyo
    public final boolean r() {
        return ((Boolean) a.d(8, "VideoEncoderParams__enable_max_h264_encoder_compatibility", false).gu()).booleanValue();
    }

    @Override // defpackage.acyo
    public final boolean s() {
        return ((Boolean) a.d(9, "VideoEncoderParams__enable_max_h264_encoder_compatibility_fast_track", false).gu()).booleanValue();
    }

    @Override // defpackage.acyo
    public final boolean t() {
        return ((Boolean) a.d(10, "VideoEncoderParams__enable_roi_encoding", true).gu()).booleanValue();
    }

    @Override // defpackage.acyo
    public final boolean u() {
        return ((Boolean) a.d(11, "VideoEncoderParams__enforce_supported_codec_dimensions", false).gu()).booleanValue();
    }

    @Override // defpackage.acyo
    public final boolean v() {
        return ((Boolean) a.d(12, "VideoEncoderParams__extend_avc_support", false).gu()).booleanValue();
    }

    @Override // defpackage.acyo
    public final boolean w() {
        return ((Boolean) a.d(13, "VideoEncoderParams__force_software_codec", false).gu()).booleanValue();
    }
}
