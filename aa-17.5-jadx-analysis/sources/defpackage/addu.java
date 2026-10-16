package defpackage;

/* loaded from: classes3.dex */
public final class addu implements addt {
    private static final wcv a = new wcv(addf.b, 6);

    @Override // defpackage.addt
    public final boolean a() {
        return ((Boolean) a.d(0, "ContextualStyling__enable_custom_hybrid", true).gu()).booleanValue();
    }

    @Override // defpackage.addt
    public final boolean b() {
        return ((Boolean) a.d(1, "ContextualStyling__enable_custom_navigation", false).gu()).booleanValue();
    }

    @Override // defpackage.addt
    public final boolean c() {
        return ((Boolean) a.d(2, "ContextualStyling__enable_custom_navigation_low_light", false).gu()).booleanValue();
    }

    @Override // defpackage.addt
    public final boolean d() {
        return ((Boolean) a.d(3, "ContextualStyling__enable_custom_terrain_vector_client", true).gu()).booleanValue();
    }

    @Override // defpackage.addt
    public final boolean e() {
        return ((Boolean) a.d(4, "ContextualStyling__enable_custom_terrain_vector_client_dark", true).gu()).booleanValue();
    }

    @Override // defpackage.addt
    public final boolean f() {
        return ((Boolean) a.d(5, "46372601", false).gu()).booleanValue();
    }
}
