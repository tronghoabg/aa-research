package defpackage;

/* loaded from: classes.dex */
public final class acue implements acud {
    private static final wcv a = new wcv(aclg.b, 5);

    @Override // defpackage.acud
    public final boolean a() {
        return ((Boolean) a.d(0, "Nativity__car_process_activity_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acud
    public final boolean b() {
        return ((Boolean) a.d(1, "Nativity__ghost_activities_enabled", true).gu()).booleanValue();
    }

    @Override // defpackage.acud
    public final boolean c() {
        return ((Boolean) a.d(2, "Nativity__ghost_activity_telemetry_on_failure_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acud
    public final boolean d() {
        return ((Boolean) a.d(3, "Nativity__sixth_sense_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acud
    public final boolean e() {
        return ((Boolean) a.d(4, "Nativity__use_default_device_context", false).gu()).booleanValue();
    }
}
