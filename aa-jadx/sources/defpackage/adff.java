package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adff implements defpackage.adfe {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adee.b;
        a = rkqVar.r("MapCoreV3Migration__labeling_log_sampling_rate_percentage", 1.0d);
        b = rkqVar.u("MapCoreV3Migration__labeling_metrics_enabled", true);
    }

    @Override // defpackage.adfe
    public final double a() {
        return ((java.lang.Double) a.fF()).doubleValue();
    }

    @Override // defpackage.adfe
    public final boolean b() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }
}
