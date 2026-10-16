package defpackage;

/* loaded from: classes.dex */
public final class acvd implements acvc {
    private static final wcv a = new wcv(aclg.b, 5);

    @Override // defpackage.acvc
    public final abru a() {
        return (abru) a.e(3, "PhoneThemeFeature__manufacturer_prefers_device_font_family", new acut(2), "CgdzYW1zdW5n").gu();
    }

    @Override // defpackage.acvc
    public final abru b() {
        return (abru) a.e(4, "PhoneThemeFeature__manufacturer_uses_dynamic_icon_shape", new acut(2), "CgdzYW1zdW5nCgZnb29nbGU").gu();
    }

    @Override // defpackage.acvc
    public final boolean c() {
        return ((Boolean) a.d(0, "PhoneThemeFeature__cache_alternative_system_app_icon_components", false).gu()).booleanValue();
    }

    @Override // defpackage.acvc
    public final boolean d() {
        return ((Boolean) a.d(1, "PhoneThemeFeature__enable_dynamic_app_icon_shape_by_manufacturer_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acvc
    public final boolean e() {
        return ((Boolean) a.d(2, "PhoneThemeFeature__enable_dynamic_font_family", false).gu()).booleanValue();
    }
}
