package defpackage;

/* loaded from: classes3.dex */
public final class addl implements addk {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = addf.b;
        a = rjuVar.u("BoomerangReliabilityManagement__ignore_repeated_log_attempts", false);
        b = rjuVar.s("BoomerangReliabilityManagement__recovery_crash_count_threshold", 3L);
    }

    @Override // defpackage.addk
    public final long a() {
        return ((Long) b.gu()).longValue();
    }

    @Override // defpackage.addk
    public final boolean b() {
        return ((Boolean) a.gu()).booleanValue();
    }
}
