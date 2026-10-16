package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acxv implements defpackage.acxu {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 22);

    @Override // defpackage.acxu
    public final long a() {
        return ((java.lang.Long) a.b(0, "SynchronizedMediaFeature__audio_buffer_limit_ms", 300L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long b() {
        return ((java.lang.Long) a.b(1, "SynchronizedMediaFeature__audio_buffer_limit_ms_tts", 400L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long c() {
        return ((java.lang.Long) a.b(2, "SynchronizedMediaFeature__audio_buffer_limit_parked_exp_ms", 300L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long d() {
        return ((java.lang.Long) a.b(3, "SynchronizedMediaFeature__audio_buffer_limit_parked_exp_ms_tts", 400L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long e() {
        return ((java.lang.Long) a.b(4, "SynchronizedMediaFeature__average_lag_weight", 4L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long f() {
        return ((java.lang.Long) a.b(5, "SynchronizedMediaFeature__average_lag_weight_parked_exp", 4L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long g() {
        return ((java.lang.Long) a.b(9, "SynchronizedMediaFeature__max_audio_delay_allowed_ms", 500L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long h() {
        return ((java.lang.Long) a.b(10, "SynchronizedMediaFeature__max_audio_delay_allowed_parked_exp_ms", 500L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long i() {
        return ((java.lang.Long) a.b(11, "SynchronizedMediaFeature__max_lag_tolerance_ms", 20L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long j() {
        return ((java.lang.Long) a.b(12, "SynchronizedMediaFeature__max_lag_tolerance_parked_exp_ms", 20L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long k() {
        return ((java.lang.Long) a.b(13, "SynchronizedMediaFeature__max_media_stats_reports_to_dump", 20L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long l() {
        return ((java.lang.Long) a.b(14, "SynchronizedMediaFeature__max_video_delay_allowed_ms", 500L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long m() {
        return ((java.lang.Long) a.b(15, "SynchronizedMediaFeature__max_video_delay_allowed_parked_exp_ms", 500L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long n() {
        return ((java.lang.Long) a.b(16, "SynchronizedMediaFeature__media_stats_report_interval_ms", 5000L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long o() {
        return ((java.lang.Long) a.b(17, "SynchronizedMediaFeature__media_stats_report_interval_ms_tts", 500L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long p() {
        return ((java.lang.Long) a.b(18, "SynchronizedMediaFeature__sync_interval_ms", 1000L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long q() {
        return ((java.lang.Long) a.b(19, "SynchronizedMediaFeature__sync_interval_parked_exp_ms", 1000L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long r() {
        return ((java.lang.Long) a.b(20, "SynchronizedMediaFeature__sync_offset_override_ms", 0L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final long s() {
        return ((java.lang.Long) a.b(21, "SynchronizedMediaFeature__sync_offset_override_parked_exp_ms", 0L).fF()).longValue();
    }

    @Override // defpackage.acxu
    public final boolean t() {
        return ((java.lang.Boolean) a.d(6, "SynchronizedMediaFeature__enable_media_stats", true).fF()).booleanValue();
    }

    @Override // defpackage.acxu
    public final boolean u() {
        return ((java.lang.Boolean) a.d(7, "SynchronizedMediaFeature__enable_sync", false).fF()).booleanValue();
    }

    @Override // defpackage.acxu
    public final boolean v() {
        return ((java.lang.Boolean) a.d(8, "SynchronizedMediaFeature__enable_sync_parked_exp", true).fF()).booleanValue();
    }
}
