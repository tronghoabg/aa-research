package androidx.core.text;

import android.text.TextUtils;
import h.g.b.x;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LocaleKt {
    public static final int getLayoutDirection(Locale locale) {
        x.f(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
