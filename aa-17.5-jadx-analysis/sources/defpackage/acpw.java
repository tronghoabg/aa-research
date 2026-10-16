package defpackage;

/* loaded from: classes.dex */
public final class acpw implements acpv {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.u("DebugLogging__enable_memory_optimization", false);
        b = rjuVar.u("DebugLogging__enabled", false);
    }

    @Override // defpackage.acpv
    public final boolean a() {
        return ((Boolean) a.gu()).booleanValue();
    }

    @Override // defpackage.acpv
    public final boolean b() {
        return ((Boolean) b.gu()).booleanValue();
    }
}
