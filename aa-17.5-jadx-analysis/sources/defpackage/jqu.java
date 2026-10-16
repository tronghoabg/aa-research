package defpackage;

import android.content.Context;
import android.os.Build;
import android.security.advancedprotection.AdvancedProtectionManager;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class jqu {
    private static final ygr a = ygr.s("cubs", "grizzly", "kodiak", "yogi", "formosan");
    private static final ygr b = ygr.s("frankel", "blazer", "mustang", "rango", "stallion");
    private static final ygr c = ygr.t("shiba", "husky", "akita", "tokay", "caiman", "komodo", "comet", "tegu");
    private static final ygr d = ygr.t("oriole", "raven", "bluejay", "panther", "cheetah", "lynx", "felix", "tangorpro");

    public static boolean a(Context context) {
        AdvancedProtectionManager advancedProtectionManagerM;
        String str;
        boolean zB;
        if (Build.VERSION.SDK_INT >= 36 && (advancedProtectionManagerM = b$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(b$$ExternalSyntheticApiModelOutline0.m$1()))) != null && advancedProtectionManagerM.isAdvancedProtectionEnabled() && Build.MANUFACTURER != null && woy.at(Build.MANUFACTURER, "google") && (str = Build.DEVICE) != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
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

    private static boolean b(String str) {
        String str2 = Build.VERSION.SECURITY_PATCH;
        return !TextUtils.isEmpty(str2) && str2.compareTo(str) >= 0;
    }
}
