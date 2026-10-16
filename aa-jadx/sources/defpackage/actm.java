package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class actm implements defpackage.actl {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("LauncherShortcuts__assistant_shortcut_enabled", false);
        b = rkqVar.u("LauncherShortcuts__enabled", false);
        c = rkqVar.s("LauncherShortcuts__max_shortcuts", 32L);
    }

    @Override // defpackage.actl
    public final long a() {
        return ((java.lang.Long) c.fF()).longValue();
    }

    @Override // defpackage.actl
    public final boolean b() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    @Override // defpackage.actl
    public final boolean c() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }
}
