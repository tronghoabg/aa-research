package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adet implements defpackage.ades {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;

    static {
        defpackage.rkq rkqVar = defpackage.adee.b;
        a = rkqVar.u("ContextualStyling__enable_custom_hybrid", true);
        b = rkqVar.u("ContextualStyling__enable_custom_terrain_vector_client", true);
        c = rkqVar.u("ContextualStyling__enable_custom_terrain_vector_client_dark", true);
    }

    @Override // defpackage.ades
    public final boolean a() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }

    @Override // defpackage.ades
    public final boolean b() {
        return ((java.lang.Boolean) b.fF()).booleanValue();
    }

    @Override // defpackage.ades
    public final boolean c() {
        return ((java.lang.Boolean) c.fF()).booleanValue();
    }
}
