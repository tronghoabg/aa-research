package defpackage;

/* loaded from: classes3.dex */
public final class adej implements adei {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = addf.b;
        a = rjuVar.r("MapCoreV3Migration__labeling_log_sampling_rate_percentage", 1.0d);
        b = rjuVar.u("MapCoreV3Migration__labeling_metrics_enabled", true);
    }

    @Override // defpackage.adei
    public final double a() {
        return ((Double) a.gu()).doubleValue();
    }

    @Override // defpackage.adei
    public final boolean b() {
        return ((Boolean) b.gu()).booleanValue();
    }
}
