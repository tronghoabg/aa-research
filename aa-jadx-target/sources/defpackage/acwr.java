package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acwr implements defpackage.acwq {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;
    private static final defpackage.wdf d;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.s("ProjectedPresentation__config_check_delay", 20L);
        b = rkqVar.s("ProjectedPresentation__configuration_check_tolerance_dp", 2L);
        c = rkqVar.u("ProjectedPresentation__crash_projected_presentation_if_unable_to_get_correct_configuration", false);
        d = rkqVar.s("ProjectedPresentation__max_config_checks", 10L);
    }

    @Override // defpackage.acwq
    public final long a() {
        return ((java.lang.Long) a.fF()).longValue();
    }

    @Override // defpackage.acwq
    public final long b() {
        return ((java.lang.Long) b.fF()).longValue();
    }

    @Override // defpackage.acwq
    public final long c() {
        return ((java.lang.Long) d.fF()).longValue();
    }

    @Override // defpackage.acwq
    public final boolean d() {
        return ((java.lang.Boolean) c.fF()).booleanValue();
    }
}
