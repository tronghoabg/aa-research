package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aczo implements defpackage.aczn {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;
    private static final defpackage.wdf d;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.s("VideoDiagnosticsFeature__max_media_stats_reports_to_dump", 20L);
        b = rkqVar.v("VideoDiagnosticsFeature__video_latency_histogram_intervals_ms", new defpackage.acvv(11), "ChAAAQIECBAgQIABgAKABIAI");
        c = rkqVar.s("VideoDiagnosticsFeature__video_stats_logging_period_ms", 300000L);
        d = rkqVar.u("VideoDiagnosticsFeature__video_stats_period_focused_time_only", false);
    }

    @Override // defpackage.aczn
    public final long a() {
        return ((java.lang.Long) a.fF()).longValue();
    }

    @Override // defpackage.aczn
    public final long b() {
        return ((java.lang.Long) c.fF()).longValue();
    }

    @Override // defpackage.aczn
    public final defpackage.absw c() {
        return (defpackage.absw) b.fF();
    }

    @Override // defpackage.aczn
    public final boolean d() {
        return ((java.lang.Boolean) d.fF()).booleanValue();
    }
}
