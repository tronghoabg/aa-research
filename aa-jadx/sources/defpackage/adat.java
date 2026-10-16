package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adat implements defpackage.adas {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.s("WirelessLatencyMonitor__probe_interval_ms", 1000L);
        b = rkqVar.s("WirelessLatencyMonitor__report_interval_ms", 5000L);
        c = rkqVar.s("WirelessLatencyMonitor__warning_threshold_ms", 300L);
    }

    @Override // defpackage.adas
    public final long a() {
        return ((java.lang.Long) a.fF()).longValue();
    }

    @Override // defpackage.adas
    public final long b() {
        return ((java.lang.Long) b.fF()).longValue();
    }

    @Override // defpackage.adas
    public final long c() {
        return ((java.lang.Long) c.fF()).longValue();
    }
}
