package defpackage;

/* loaded from: classes.dex */
public final class acym implements acyl {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;
    private static final wcj d;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.s("VideoDiagnosticsFeature__max_media_stats_reports_to_dump", 20L);
        b = rjuVar.v("VideoDiagnosticsFeature__video_latency_histogram_intervals_ms", new acut(11), "ChAAAQIECBAgQIABgAKABIAI");
        c = rjuVar.s("VideoDiagnosticsFeature__video_stats_logging_period_ms", 300000L);
        d = rjuVar.u("VideoDiagnosticsFeature__video_stats_period_focused_time_only", false);
    }

    @Override // defpackage.acyl
    public final long a() {
        return ((Long) a.gu()).longValue();
    }

    @Override // defpackage.acyl
    public final long b() {
        return ((Long) c.gu()).longValue();
    }

    @Override // defpackage.acyl
    public final abrt c() {
        return (abrt) b.gu();
    }

    @Override // defpackage.acyl
    public final boolean d() {
        return ((Boolean) d.gu()).booleanValue();
    }
}
