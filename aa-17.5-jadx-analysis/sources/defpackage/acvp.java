package defpackage;

/* loaded from: classes.dex */
public final class acvp implements acvo {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;
    private static final wcj d;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.s("ProjectedPresentation__config_check_delay", 20L);
        b = rjuVar.s("ProjectedPresentation__configuration_check_tolerance_dp", 2L);
        c = rjuVar.u("ProjectedPresentation__crash_projected_presentation_if_unable_to_get_correct_configuration", false);
        d = rjuVar.s("ProjectedPresentation__max_config_checks", 10L);
    }

    @Override // defpackage.acvo
    public final long a() {
        return ((Long) a.gu()).longValue();
    }

    @Override // defpackage.acvo
    public final long b() {
        return ((Long) b.gu()).longValue();
    }

    @Override // defpackage.acvo
    public final long c() {
        return ((Long) d.gu()).longValue();
    }

    @Override // defpackage.acvo
    public final boolean d() {
        return ((Boolean) c.gu()).booleanValue();
    }
}
