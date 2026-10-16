package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acmp implements defpackage.acmo {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;
    private static final defpackage.wdf d;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("AceFeature__actionable_insight_enabled", false);
        b = rkqVar.u("AceFeature__fake_insight_generation", false);
        c = rkqVar.s("AceFeature__maximum_ace_wait_time", 10000L);
        d = rkqVar.s("AceFeature__mode", 0L);
    }

    @Override // defpackage.acmo
    public final long a() {
        return ((java.lang.Long) c.fF()).longValue();
    }

    @Override // defpackage.acmo
    public final long b() {
        return ((java.lang.Long) d.fF()).longValue();
    }

    @Override // defpackage.acmo
    public final boolean c() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    @Override // defpackage.acmo
    public final boolean d() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }
}
