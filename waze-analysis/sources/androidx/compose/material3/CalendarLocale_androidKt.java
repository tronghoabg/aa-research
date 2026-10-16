package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CalendarLocale_androidKt {
    public static final Locale defaultLocale(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1612326743, i2, -1, "androidx.compose.material3.defaultLocale (CalendarLocale.android.kt:26)");
        }
        Locale platformLocale = ((androidx.compose.ui.text.intl.Locale) composer.consume(CompositionLocalsKt.getLocalLocale())).getPlatformLocale();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return platformLocale;
    }
}
