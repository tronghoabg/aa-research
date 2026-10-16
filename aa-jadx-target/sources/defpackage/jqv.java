package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jqv {
    private static final defpackage.yhx a = defpackage.yhx.s("cubs", "grizzly", "kodiak", "yogi", "formosan");
    private static final defpackage.yhx b = defpackage.yhx.s("frankel", "blazer", "mustang", "rango", "stallion");
    private static final defpackage.yhx c = defpackage.yhx.t("shiba", "husky", "akita", "tokay", "caiman", "komodo", "comet", "tegu");
    private static final defpackage.yhx d = defpackage.yhx.t("oriole", "raven", "bluejay", "panther", "cheetah", "lynx", "felix", "tangorpro");

    public static boolean a(android.content.Context context) {
        android.security.advancedprotection.AdvancedProtectionManager advancedProtectionManagerM;
        java.lang.String str;
        boolean zB;
        if (android.os.Build.VERSION.SDK_INT >= 36 && (advancedProtectionManagerM = b$.ExternalSyntheticApiModelOutline0.m(context.getSystemService(b$.ExternalSyntheticApiModelOutline0.m$1()))) != null && b$.ExternalSyntheticApiModelOutline0.m(advancedProtectionManagerM) && android.os.Build.MANUFACTURER != null && defpackage.ysr.bD(android.os.Build.MANUFACTURER, "google") && (str = android.os.Build.DEVICE) != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            if (a.contains(lowerCase)) {
                return true;
            }
            if (b.contains(lowerCase)) {
                zB = b("2025-12-01");
            } else if (c.contains(lowerCase)) {
                zB = b("2026-03-01");
            } else if (d.contains(lowerCase)) {
                zB = b("2026-06-01");
            }
            if (zB) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(java.lang.String str) {
        java.lang.String str2 = android.os.Build.VERSION.SECURITY_PATCH;
        return !android.text.TextUtils.isEmpty(str2) && str2.compareTo(str) >= 0;
    }
}
