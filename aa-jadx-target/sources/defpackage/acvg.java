package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acvg implements defpackage.acvf {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 5);

    @Override // defpackage.acvf
    public final boolean a() {
        return ((java.lang.Boolean) a.d(0, "Nativity__car_process_activity_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acvf
    public final boolean b() {
        return ((java.lang.Boolean) a.d(1, "Nativity__ghost_activities_enabled", true).fF()).booleanValue();
    }

    @Override // defpackage.acvf
    public final boolean c() {
        return ((java.lang.Boolean) a.d(2, "Nativity__ghost_activity_telemetry_on_failure_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acvf
    public final boolean d() {
        return ((java.lang.Boolean) a.d(3, "Nativity__sixth_sense_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acvf
    public final boolean e() {
        return ((java.lang.Boolean) a.d(4, "Nativity__use_default_device_context", false).fF()).booleanValue();
    }
}
