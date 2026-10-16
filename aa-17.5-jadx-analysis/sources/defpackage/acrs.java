package defpackage;

/* loaded from: classes3.dex */
public final class acrs implements acrr {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.u("HatsLapseDetector__enabled", false);
        b = rjuVar.s("HatsLapseDetector__max_trigger_seconds", 1209600L);
        c = rjuVar.s("HatsLapseDetector__min_trigger_seconds", 691200L);
    }

    @Override // defpackage.acrr
    public final long a() {
        return ((Long) b.gu()).longValue();
    }

    @Override // defpackage.acrr
    public final long b() {
        return ((Long) c.gu()).longValue();
    }

    @Override // defpackage.acrr
    public final boolean c() {
        return ((Boolean) a.gu()).booleanValue();
    }
}
