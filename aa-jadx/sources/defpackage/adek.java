package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adek implements defpackage.adej {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adee.b;
        a = rkqVar.u("BoomerangReliabilityManagement__ignore_repeated_log_attempts", false);
        b = rkqVar.s("BoomerangReliabilityManagement__recovery_crash_count_threshold", 3L);
    }

    @Override // defpackage.adej
    public final long a() {
        return ((java.lang.Long) b.fF()).longValue();
    }

    @Override // defpackage.adej
    public final boolean b() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }
}
