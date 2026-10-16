package defpackage;

/* loaded from: classes3.dex */
public final class adea implements addz {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;
    private static final wcj d;

    static {
        rju rjuVar = addf.b;
        a = rjuVar.u("DeveloperOverrides__force_lite_mode", false);
        b = rjuVar.t("DeveloperOverrides__quota_status", "");
        c = rjuVar.u("DeveloperOverrides__show_renderer_label", false);
        d = rjuVar.u("DeveloperOverrides__show_renderer_version", false);
    }

    @Override // defpackage.addz
    public final String a() {
        return (String) b.gu();
    }

    @Override // defpackage.addz
    public final boolean b() {
        return ((Boolean) a.gu()).booleanValue();
    }

    @Override // defpackage.addz
    public final boolean c() {
        return ((Boolean) c.gu()).booleanValue();
    }

    @Override // defpackage.addz
    public final boolean d() {
        return ((Boolean) d.gu()).booleanValue();
    }
}
