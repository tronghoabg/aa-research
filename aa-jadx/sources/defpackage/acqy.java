package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acqy implements defpackage.acqx {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("DebugLogging__enable_memory_optimization", false);
        b = rkqVar.u("DebugLogging__enabled", false);
    }

    @Override // defpackage.acqx
    public final boolean a() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    @Override // defpackage.acqx
    public final boolean b() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }
}
