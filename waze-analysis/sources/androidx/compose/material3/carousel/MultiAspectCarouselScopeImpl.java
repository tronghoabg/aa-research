package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MultiAspectCarouselScopeImpl implements MultiAspectCarouselScope {
    @Override // androidx.compose.material3.carousel.MultiAspectCarouselScope
    public Modifier maskBorder(Modifier modifier, BorderStroke borderStroke, Shape shape, MultiAspectCarouselItemDrawInfo multiAspectCarouselItemDrawInfo, Composer composer, int i2) {
        composer.startReplaceGroup(1191696812);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1191696812, i2, -1, "androidx.compose.material3.carousel.MultiAspectCarouselScopeImpl.maskBorder (MultiAspectCarousel.kt:237)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new MaskShape(shape, multiAspectCarouselItemDrawInfo);
            composer.updateRememberedValue(objRememberedValue);
        }
        Modifier modifierBorder = BorderKt.border(modifier, borderStroke, (MaskShape) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierBorder;
    }

    @Override // androidx.compose.material3.carousel.MultiAspectCarouselScope
    public Modifier maskClip(Modifier modifier, Shape shape, MultiAspectCarouselItemDrawInfo multiAspectCarouselItemDrawInfo) {
        return modifier.then(new MaskParallaxNodeElement(shape, multiAspectCarouselItemDrawInfo));
    }
}
