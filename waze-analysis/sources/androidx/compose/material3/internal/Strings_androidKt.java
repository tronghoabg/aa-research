package androidx.compose.material3.internal;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import h.g.b.x;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Strings_androidKt {
    public static final String formatString(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        x.e(str2, "format(...)");
        return str2;
    }

    /* renamed from: getString-2EP1pXo, reason: not valid java name */
    public static final String m6375getString2EP1pXo(int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-907677715, i3, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:29)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        String string = ((Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources())).getString(i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    /* renamed from: getString-qBjtwXw, reason: not valid java name */
    public static final String m6376getStringqBjtwXw(int i2, Object[] objArr, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1427268608, i3, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:37)");
        }
        String strM6375getString2EP1pXo = m6375getString2EP1pXo(i2, composer, i3 & 14);
        Locale platformLocale = ((androidx.compose.ui.text.intl.Locale) composer.consume(CompositionLocalsKt.getLocalLocale())).getPlatformLocale();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(platformLocale, strM6375getString2EP1pXo, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        x.e(str, "format(...)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return str;
    }
}
