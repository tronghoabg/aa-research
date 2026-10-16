package defpackage;

/* loaded from: classes.dex */
public final class actc implements actb {
    private static final wcv a = new wcv(aclg.b, 7);

    @Override // defpackage.actb
    public final abrt a() {
        return (abrt) a.e(0, "MediaStatsFeature__audio_estimated_buffer_histogram_intervals_ms", new acml(19), "Cg4ABQoZMmTIAZADvAXoBw").gu();
    }

    @Override // defpackage.actb
    public final abrt b() {
        return (abrt) a.e(2, "MediaStatsFeature__synchronized_media_audio_video_delay_histogram_intervals_ms", new acml(19), "Cg4ABQoUMmTIAawCkAP0Aw").gu();
    }

    @Override // defpackage.actb
    public final abrt c() {
        return (abrt) a.e(3, "MediaStatsFeature__synchronized_media_lag_histogram_intervals_ms", new acml(19), "CkTz/f////////8Blv//////////Adb//////////wHw//////////8B+v//////////Af3//////////wEAAwYQKmqNAg").gu();
    }

    @Override // defpackage.actb
    public final abrt d() {
        return (abrt) a.e(4, "MediaStatsFeature__video_frame_jitter_histogram_intervals_ms", new acml(19), "Cjyc//////////8Bzv//////////Aez//////////wH2//////////8B+///////////AQAFChQyZMgB9AM").gu();
    }

    @Override // defpackage.actb
    public final abrt e() {
        return (abrt) a.e(5, "MediaStatsFeature__video_frame_pacing_delay_histogram_intervals_ms", new acml(19), "Cg4ABQoUMmTIAawCkAP0Aw").gu();
    }

    @Override // defpackage.actb
    public final abrt f() {
        return (abrt) a.e(6, "MediaStatsFeature__video_overflow_duration_histogram_intervals_ms", new acml(19), "Cg4AIUJklgH6AfQD6AfQDw").gu();
    }

    @Override // defpackage.actb
    public final boolean g() {
        return ((Boolean) a.d(1, "MediaStatsFeature__enable_media_stats_event_logging", false).gu()).booleanValue();
    }
}
