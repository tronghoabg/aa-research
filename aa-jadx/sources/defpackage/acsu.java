package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acsu implements defpackage.acst {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("HatsLapseDetector__enabled", false);
        b = rkqVar.s("HatsLapseDetector__max_trigger_seconds", 1209600L);
        c = rkqVar.s("HatsLapseDetector__min_trigger_seconds", 691200L);
    }

    @Override // defpackage.acst
    public final long a() {
        return ((java.lang.Long) b.fF()).longValue();
    }

    @Override // defpackage.acst
    public final long b() {
        return ((java.lang.Long) c.fF()).longValue();
    }

    @Override // defpackage.acst
    public final boolean c() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }
}
