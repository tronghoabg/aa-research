package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acue implements defpackage.acud {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 7);

    @Override // defpackage.acud
    public final defpackage.absw a() {
        return (defpackage.absw) a.e(0, "MediaStatsFeature__audio_estimated_buffer_histogram_intervals_ms", new defpackage.acnn(19), "Cg4ABQoZMmTIAZADvAXoBw").fF();
    }

    @Override // defpackage.acud
    public final defpackage.absw b() {
        return (defpackage.absw) a.e(2, "MediaStatsFeature__synchronized_media_audio_video_delay_histogram_intervals_ms", new defpackage.acnn(19), "Cg4ABQoUMmTIAawCkAP0Aw").fF();
    }

    @Override // defpackage.acud
    public final defpackage.absw c() {
        return (defpackage.absw) a.e(3, "MediaStatsFeature__synchronized_media_lag_histogram_intervals_ms", new defpackage.acnn(19), "CkTz/f////////8Blv//////////Adb//////////wHw//////////8B+v//////////Af3//////////wEAAwYQKmqNAg").fF();
    }

    @Override // defpackage.acud
    public final defpackage.absw d() {
        return (defpackage.absw) a.e(4, "MediaStatsFeature__video_frame_jitter_histogram_intervals_ms", new defpackage.acnn(19), "Cjyc//////////8Bzv//////////Aez//////////wH2//////////8B+///////////AQAFChQyZMgB9AM").fF();
    }

    @Override // defpackage.acud
    public final defpackage.absw e() {
        return (defpackage.absw) a.e(5, "MediaStatsFeature__video_frame_pacing_delay_histogram_intervals_ms", new defpackage.acnn(19), "Cg4ABQoUMmTIAawCkAP0Aw").fF();
    }

    @Override // defpackage.acud
    public final defpackage.absw f() {
        return (defpackage.absw) a.e(6, "MediaStatsFeature__video_overflow_duration_histogram_intervals_ms", new defpackage.acnn(19), "Cg4AIUJklgH6AfQD6AfQDw").fF();
    }

    @Override // defpackage.acud
    public final boolean g() {
        return ((java.lang.Boolean) a.d(1, "MediaStatsFeature__enable_media_stats_event_logging", false).fF()).booleanValue();
    }
}
