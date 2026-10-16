package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import androidx.compose.ui.text.intl.Locale;
import h.g.b.x;
import h.m.k;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String capitalize(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? k.v(cCharAt, locale.getPlatformLocale()) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        x.e(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String decapitalize(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        java.util.Locale platformLocale = locale.getPlatformLocale();
        x.f(platformLocale, "locale");
        String strValueOf = String.valueOf(cCharAt);
        x.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(platformLocale);
        x.e(lowerCase, "toLowerCase(...)");
        String str2 = lowerCase;
        Objects.toString(str2);
        String strSubstring = str.substring(1);
        x.e(strSubstring, "substring(...)");
        return String.valueOf(str2).concat(String.valueOf(strSubstring));
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toLowerCase(String str, Locale locale) {
        String lowerCase = str.toLowerCase(locale.getPlatformLocale());
        x.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toUpperCase(String str, Locale locale) {
        String upperCase = str.toUpperCase(locale.getPlatformLocale());
        x.e(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
