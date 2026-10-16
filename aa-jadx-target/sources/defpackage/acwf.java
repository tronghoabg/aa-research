package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acwf implements defpackage.acwe {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 5);

    @Override // defpackage.acwe
    public final defpackage.absx a() {
        return (defpackage.absx) a.e(3, "PhoneThemeFeature__manufacturer_prefers_device_font_family", new defpackage.acvv(2), "CgdzYW1zdW5n").fF();
    }

    @Override // defpackage.acwe
    public final defpackage.absx b() {
        return (defpackage.absx) a.e(4, "PhoneThemeFeature__manufacturer_uses_dynamic_icon_shape", new defpackage.acvv(2), "CgdzYW1zdW5nCgZnb29nbGU").fF();
    }

    @Override // defpackage.acwe
    public final boolean c() {
        return ((java.lang.Boolean) a.d(0, "PhoneThemeFeature__cache_alternative_system_app_icon_components", false).fF()).booleanValue();
    }

    @Override // defpackage.acwe
    public final boolean d() {
        return ((java.lang.Boolean) a.d(1, "PhoneThemeFeature__enable_dynamic_app_icon_shape_by_manufacturer_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acwe
    public final boolean e() {
        return ((java.lang.Boolean) a.d(2, "PhoneThemeFeature__enable_dynamic_font_family", false).fF()).booleanValue();
    }
}
