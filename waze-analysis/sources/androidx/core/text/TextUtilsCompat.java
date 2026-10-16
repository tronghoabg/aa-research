package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TextUtilsCompat {
    private TextUtilsCompat() {
    }

    public static int getLayoutDirectionFromLocale(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static String htmlEncode(String str) {
        return TextUtils.htmlEncode(str);
    }
}
