package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adez implements defpackage.adey {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;
    private static final defpackage.wdf d;

    static {
        defpackage.rkq rkqVar = defpackage.adee.b;
        a = rkqVar.u("DeveloperOverrides__force_lite_mode", false);
        b = rkqVar.t("DeveloperOverrides__quota_status", "");
        c = rkqVar.u("DeveloperOverrides__show_renderer_label", false);
        d = rkqVar.u("DeveloperOverrides__show_renderer_version", false);
    }

    @Override // defpackage.adey
    public final java.lang.String a() {
        return (java.lang.String) b.fF();
    }

    @Override // defpackage.adey
    public final boolean b() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    @Override // defpackage.adey
    public final boolean c() {
        return ((java.lang.Boolean) c.fF()).booleanValue();
    }

    @Override // defpackage.adey
    public final boolean d() {
        return ((java.lang.Boolean) d.fF()).booleanValue();
    }
}
