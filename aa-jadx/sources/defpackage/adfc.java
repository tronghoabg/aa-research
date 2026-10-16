package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adfc implements defpackage.adfb {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adee.b;
        a = rkqVar.u("45688989", true);
        b = rkqVar.u("MapCapabilitiesGating__metadata_logging_enabled", true);
    }

    @Override // defpackage.adfb
    public final boolean a() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    @Override // defpackage.adfb
    public final boolean b() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }
}
