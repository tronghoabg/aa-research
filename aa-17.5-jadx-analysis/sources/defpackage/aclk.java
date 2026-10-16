package defpackage;

/* loaded from: classes.dex */
public final class aclk implements aclj {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.u("AapmEducationFeature__aapm_hun_enabled", false);
        b = rjuVar.u("AapmEducationFeature__aapm_on_start_telemetry_kill_switch", true);
        c = rjuVar.u("AapmEducationFeature__aapm_settings_info_enabled", false);
    }

    @Override // defpackage.aclj
    public final boolean a() {
        return ((Boolean) a.gu()).booleanValue();
    }

    @Override // defpackage.aclj
    public final boolean b() {
        return ((Boolean) b.gu()).booleanValue();
    }

    @Override // defpackage.aclj
    public final boolean c() {
        return ((Boolean) c.gu()).booleanValue();
    }
}
