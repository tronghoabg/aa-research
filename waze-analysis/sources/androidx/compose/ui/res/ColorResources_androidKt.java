package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.res.ResourcesCompat;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ColorResources_androidKt {
    public static final long colorResource(int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1777644873, i3, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:34)");
        }
        long jColor = ColorKt.Color(ResourcesCompat.getColor((Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources()), i2, ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getTheme()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jColor;
    }
}
