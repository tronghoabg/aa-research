package defpackage;

/* loaded from: classes.dex */
public final class acxf implements acxe {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.r("Telemetry__high_volume_events_sampling_rate", 0.01d);
        int i = 8;
        b = rjuVar.v("Telemetry__high_volume_non_ui_events_list", new acut(i), "ChGEAvQc9Rz1A/YD9wP4A2H9AQ");
        c = rjuVar.v("Telemetry__high_volume_ui_events_list", new acut(i), "ChDgXeFd9S6sMcsxrBSIbqEa");
    }

    @Override // defpackage.acxe
    public final double a() {
        return ((Double) a.gu()).doubleValue();
    }

    @Override // defpackage.acxe
    public final abrs b() {
        return (abrs) b.gu();
    }

    @Override // defpackage.acxe
    public final abrs c() {
        return (abrs) c.gu();
    }
}
