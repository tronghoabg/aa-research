package defpackage;

/* loaded from: classes3.dex */
public final class acsk implements acsj {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.u("LauncherShortcuts__assistant_shortcut_enabled", false);
        b = rjuVar.u("LauncherShortcuts__enabled", false);
        c = rjuVar.s("LauncherShortcuts__max_shortcuts", 32L);
    }

    @Override // defpackage.acsj
    public final long a() {
        return ((Long) c.gu()).longValue();
    }

    @Override // defpackage.acsj
    public final boolean b() {
        return ((Boolean) a.gu()).booleanValue();
    }

    @Override // defpackage.acsj
    public final boolean c() {
        return ((Boolean) b.gu()).booleanValue();
    }
}
