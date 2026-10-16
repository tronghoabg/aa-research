package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.intl.Locale;
import java.text.DecimalFormatSymbols;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DigitDirectionalityApi21 {
    public static final DigitDirectionalityApi21 INSTANCE = new DigitDirectionalityApi21();

    private DigitDirectionalityApi21() {
    }

    public final byte resolve(Locale locale) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(locale.getPlatformLocale()).getZeroDigit());
    }
}
