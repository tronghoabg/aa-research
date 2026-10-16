package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.style.TextDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache_androidKt {
    public static final int resolveTextDirectionForKeyboardTypePhone(Locale locale) {
        byte bResolve = DigitDirectionalityApi28.INSTANCE.resolve(locale);
        return (bResolve == 1 || bResolve == 2) ? TextDirection.Companion.m11032getRtls_7Xco() : TextDirection.Companion.m11031getLtrs_7Xco();
    }
}
