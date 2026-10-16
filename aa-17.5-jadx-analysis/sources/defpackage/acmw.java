package defpackage;

/* loaded from: classes.dex */
public final class acmw implements acmv {
    private static final wcv a = new wcv(aclg.b, 9);

    @Override // defpackage.acmv
    public final long a() {
        return ((Long) a.b(1, "AudioDiagnosticsFeature__audio_stats_logging_period_milliseconds", 30000L).gu()).longValue();
    }

    @Override // defpackage.acmv
    public final long b() {
        return ((Long) a.b(4, "AudioDiagnosticsFeature__log_audio_latency_stats_telemetry_threshold_usb", 700L).gu()).longValue();
    }

    @Override // defpackage.acmv
    public final long c() {
        return ((Long) a.b(5, "AudioDiagnosticsFeature__log_audio_latency_stats_telemetry_threshold_wifi", 1400L).gu()).longValue();
    }

    @Override // defpackage.acmv
    public final long d() {
        return ((Long) a.b(6, "AudioDiagnosticsFeature__max_events_per_diagnostics_message", 128L).gu()).longValue();
    }

    @Override // defpackage.acmv
    public final long e() {
        return ((Long) a.b(7, "AudioDiagnosticsFeature__publishing_period_millis", 1000L).gu()).longValue();
    }

    @Override // defpackage.acmv
    public final long f() {
        return ((Long) a.b(8, "AudioDiagnosticsFeature__report_audio_latency_stats_interval_ms", 30000L).gu()).longValue();
    }

    @Override // defpackage.acmv
    public final abrt g() {
        return (abrt) a.e(0, "AudioDiagnosticsFeature__audio_latency_histogram_intervals_ms", new acml(2), "ChAAAQIECBAgQIABgAKABIAI").gu();
    }

    @Override // defpackage.acmv
    public final abrt h() {
        return (abrt) a.e(2, "AudioDiagnosticsFeature__audio_video_lag_histogram_intervals_ms", new acml(2), "CjqW//////////8B1v//////////AfD//////////wH6//////////8B/f//////////AQADBhAqao0C").gu();
    }

    @Override // defpackage.acmv
    public final abrt i() {
        return (abrt) a.e(3, "AudioDiagnosticsFeature__audio_video_perceived_lag_histogram_intervals_ms", new acml(2), "CjOW//////////8B3///////////Afb//////////wH9//////////8BAAMKIWrUAsMIrhs").gu();
    }
}
