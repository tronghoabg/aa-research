package defpackage;

/* loaded from: classes.dex */
public final class acwt implements acws {
    private static final wcv a = new wcv(aclg.b, 22);

    @Override // defpackage.acws
    public final long a() {
        return ((Long) a.b(0, "SynchronizedMediaFeature__audio_buffer_limit_ms", 300L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long b() {
        return ((Long) a.b(1, "SynchronizedMediaFeature__audio_buffer_limit_ms_tts", 400L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long c() {
        return ((Long) a.b(2, "SynchronizedMediaFeature__audio_buffer_limit_parked_exp_ms", 300L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long d() {
        return ((Long) a.b(3, "SynchronizedMediaFeature__audio_buffer_limit_parked_exp_ms_tts", 400L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long e() {
        return ((Long) a.b(4, "SynchronizedMediaFeature__average_lag_weight", 4L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long f() {
        return ((Long) a.b(5, "SynchronizedMediaFeature__average_lag_weight_parked_exp", 4L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long g() {
        return ((Long) a.b(9, "SynchronizedMediaFeature__max_audio_delay_allowed_ms", 500L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long h() {
        return ((Long) a.b(10, "SynchronizedMediaFeature__max_audio_delay_allowed_parked_exp_ms", 500L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long i() {
        return ((Long) a.b(11, "SynchronizedMediaFeature__max_lag_tolerance_ms", 20L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long j() {
        return ((Long) a.b(12, "SynchronizedMediaFeature__max_lag_tolerance_parked_exp_ms", 20L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long k() {
        return ((Long) a.b(13, "SynchronizedMediaFeature__max_media_stats_reports_to_dump", 20L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long l() {
        return ((Long) a.b(14, "SynchronizedMediaFeature__max_video_delay_allowed_ms", 500L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long m() {
        return ((Long) a.b(15, "SynchronizedMediaFeature__max_video_delay_allowed_parked_exp_ms", 500L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long n() {
        return ((Long) a.b(16, "SynchronizedMediaFeature__media_stats_report_interval_ms", 5000L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long o() {
        return ((Long) a.b(17, "SynchronizedMediaFeature__media_stats_report_interval_ms_tts", 500L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long p() {
        return ((Long) a.b(18, "SynchronizedMediaFeature__sync_interval_ms", 1000L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long q() {
        return ((Long) a.b(19, "SynchronizedMediaFeature__sync_interval_parked_exp_ms", 1000L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long r() {
        return ((Long) a.b(20, "SynchronizedMediaFeature__sync_offset_override_ms", 0L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final long s() {
        return ((Long) a.b(21, "SynchronizedMediaFeature__sync_offset_override_parked_exp_ms", 0L).gu()).longValue();
    }

    @Override // defpackage.acws
    public final boolean t() {
        return ((Boolean) a.d(6, "SynchronizedMediaFeature__enable_media_stats", true).gu()).booleanValue();
    }

    @Override // defpackage.acws
    public final boolean u() {
        return ((Boolean) a.d(7, "SynchronizedMediaFeature__enable_sync", false).gu()).booleanValue();
    }

    @Override // defpackage.acws
    public final boolean v() {
        return ((Boolean) a.d(8, "SynchronizedMediaFeature__enable_sync_parked_exp", true).gu()).booleanValue();
    }
}
