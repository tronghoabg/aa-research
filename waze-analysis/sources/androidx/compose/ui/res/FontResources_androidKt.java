package androidx.compose.ui.res;

import android.content.Context;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FontResources_androidKt {
    private static final Object cacheLock = new Object();
    private static final MutableScatterMap<FontFamily, Typeface> syncLoadedTypefaces = ScatterMapKt.mutableScatterMapOf();

    public static final Typeface fontResource(FontFamily fontFamily, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i2, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Typeface typefaceFontResourceFromContext = fontResourceFromContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typefaceFontResourceFromContext;
    }

    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if (!(fontFamily instanceof SystemFontFamily) && !(fontFamily instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
        }
        synchronized (cacheLock) {
            MutableScatterMap<FontFamily, Typeface> mutableScatterMap = syncLoadedTypefaces;
            Typeface typefaceTypeface$default = mutableScatterMap.get(fontFamily);
            if (typefaceTypeface$default == null) {
                typefaceTypeface$default = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                mutableScatterMap.set(fontFamily, typefaceTypeface$default);
            }
            typeface = typefaceTypeface$default;
        }
        return typeface;
    }
}
