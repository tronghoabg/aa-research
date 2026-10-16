package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acmm implements acml {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("AapmEducationFeature__aapm_hun_enabled", false);
        b = rkqVar.u("AapmEducationFeature__aapm_on_start_telemetry_kill_switch", true);
        c = rkqVar.u("AapmEducationFeature__aapm_settings_info_enabled", false);
    }

    public final boolean a() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    public final boolean b() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }

    public final boolean c() {
        return ((java.lang.Boolean) c.fF()).booleanValue();
    }
}
