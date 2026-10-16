package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adfo implements defpackage.adfn {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adee.b;
        a = rkqVar.u("SliLogging__detailed_startup_time_logging_enabled", false);
        b = rkqVar.s("SliLogging__low_end_device_frametime_logging_rate", 2L);
    }

    @Override // defpackage.adfn
    public final long a() {
        return ((java.lang.Long) b.fF()).longValue();
    }

    @Override // defpackage.adfn
    public final boolean b() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }
}
