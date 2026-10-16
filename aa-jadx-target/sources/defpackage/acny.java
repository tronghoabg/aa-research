package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acny implements defpackage.acnx {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 9);

    @Override // defpackage.acnx
    public final long a() {
        return ((java.lang.Long) a.b(1, "AudioDiagnosticsFeature__audio_stats_logging_period_milliseconds", 30000L).fF()).longValue();
    }

    @Override // defpackage.acnx
    public final long b() {
        return ((java.lang.Long) a.b(4, "AudioDiagnosticsFeature__log_audio_latency_stats_telemetry_threshold_usb", 700L).fF()).longValue();
    }

    @Override // defpackage.acnx
    public final long c() {
        return ((java.lang.Long) a.b(5, "AudioDiagnosticsFeature__log_audio_latency_stats_telemetry_threshold_wifi", 1400L).fF()).longValue();
    }

    @Override // defpackage.acnx
    public final long d() {
        return ((java.lang.Long) a.b(6, "AudioDiagnosticsFeature__max_events_per_diagnostics_message", 128L).fF()).longValue();
    }

    @Override // defpackage.acnx
    public final long e() {
        return ((java.lang.Long) a.b(7, "AudioDiagnosticsFeature__publishing_period_millis", 1000L).fF()).longValue();
    }

    @Override // defpackage.acnx
    public final long f() {
        return ((java.lang.Long) a.b(8, "AudioDiagnosticsFeature__report_audio_latency_stats_interval_ms", 30000L).fF()).longValue();
    }

    @Override // defpackage.acnx
    public final defpackage.absw g() {
        return (defpackage.absw) a.e(0, "AudioDiagnosticsFeature__audio_latency_histogram_intervals_ms", new defpackage.acnn(2), "ChAAAQIECBAgQIABgAKABIAI").fF();
    }

    @Override // defpackage.acnx
    public final defpackage.absw h() {
        return (defpackage.absw) a.e(2, "AudioDiagnosticsFeature__audio_video_lag_histogram_intervals_ms", new defpackage.acnn(2), "CjqW//////////8B1v//////////AfD//////////wH6//////////8B/f//////////AQADBhAqao0C").fF();
    }

    @Override // defpackage.acnx
    public final defpackage.absw i() {
        return (defpackage.absw) a.e(3, "AudioDiagnosticsFeature__audio_video_perceived_lag_histogram_intervals_ms", new defpackage.acnn(2), "CjOW//////////8B3///////////Afb//////////wH9//////////8BAAMKIWrUAsMIrhs").fF();
    }
}
