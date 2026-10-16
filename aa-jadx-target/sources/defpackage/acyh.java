package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acyh implements defpackage.acyg {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.r("Telemetry__high_volume_events_sampling_rate", 0.01d);
        int i = 8;
        b = rkqVar.v("Telemetry__high_volume_non_ui_events_list", new defpackage.acvv(i), "ChGEAvQc9Rz1A/YD9wP4A2H9AQ");
        c = rkqVar.v("Telemetry__high_volume_ui_events_list", new defpackage.acvv(i), "ChDgXeFd9S6sMcsxrBSIbqEa");
    }

    @Override // defpackage.acyg
    public final double a() {
        return ((java.lang.Double) a.fF()).doubleValue();
    }

    @Override // defpackage.acyg
    public final defpackage.absv b() {
        return (defpackage.absv) b.fF();
    }

    @Override // defpackage.acyg
    public final defpackage.absv c() {
        return (defpackage.absv) c.fF();
    }
}
