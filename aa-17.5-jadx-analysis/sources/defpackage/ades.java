package defpackage;

/* loaded from: classes3.dex */
public final class ades implements ader {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = addf.b;
        a = rjuVar.u("SliLogging__detailed_startup_time_logging_enabled", false);
        b = rjuVar.s("SliLogging__low_end_device_frametime_logging_rate", 2L);
    }

    @Override // defpackage.ader
    public final long a() {
        return ((Long) b.gu()).longValue();
    }

    @Override // defpackage.ader
    public final boolean b() {
        return ((Boolean) a.gu()).booleanValue();
    }
}
