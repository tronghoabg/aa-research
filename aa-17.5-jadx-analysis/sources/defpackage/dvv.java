package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dvv {
    public static final /* synthetic */ int a = 0;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(30);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(31);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(33);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (affa.f("REL", str2)) {
            return false;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = str2.toUpperCase(locale);
        upperCase.getClass();
        Locale locale2 = Locale.US;
        locale2.getClass();
        String upperCase2 = str.toUpperCase(locale2);
        upperCase2.getClass();
        Integer numB = b(upperCase);
        Integer numB2 = b(upperCase2);
        if (numB == null || numB2 == null) {
            return (numB == null && numB2 == null) ? upperCase.compareTo(upperCase2) >= 0 : numB != null;
        }
        numB.intValue();
        numB2.intValue();
        return true;
    }

    private static final Integer b(String str) {
        return affa.f(str, "BAKLAVA") ? 0 : null;
    }
}
