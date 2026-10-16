package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SwipeToDismissBoxDefaults {
    public static final int $stable = 0;
    public static final SwipeToDismissBoxDefaults INSTANCE = new SwipeToDismissBoxDefaults();

    private SwipeToDismissBoxDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _get_positionalThreshold_$lambda$0$0$0(Density density, float f2) {
        return density.mo2127toPx0680j_4(56.0f);
    }

    public final l<Float, Float> getPositionalThreshold(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1545861529, i2, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:372)");
        }
        composer.startReplaceGroup(-485754360);
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new l() { // from class: androidx.compose.material3.SwipeToDismissBoxDefaults$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Float.valueOf(SwipeToDismissBoxDefaults._get_positionalThreshold_$lambda$0$0$0(density, ((Float) obj).floatValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        l<Float, Float> lVar = (l) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lVar;
    }
}
