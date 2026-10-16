package defpackage;

/* loaded from: classes3.dex */
public final class aczr implements aczq {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.s("WirelessLatencyMonitor__probe_interval_ms", 1000L);
        b = rjuVar.s("WirelessLatencyMonitor__report_interval_ms", 5000L);
        c = rjuVar.s("WirelessLatencyMonitor__warning_threshold_ms", 300L);
    }

    @Override // defpackage.aczq
    public final long a() {
        return ((Long) a.gu()).longValue();
    }

    @Override // defpackage.aczq
    public final long b() {
        return ((Long) b.gu()).longValue();
    }

    @Override // defpackage.aczq
    public final long c() {
        return ((Long) c.gu()).longValue();
    }
}
