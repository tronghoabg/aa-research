package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface MultiAspectCarouselScope {
    Modifier maskBorder(Modifier modifier, BorderStroke borderStroke, Shape shape, MultiAspectCarouselItemDrawInfo multiAspectCarouselItemDrawInfo, Composer composer, int i2);

    Modifier maskClip(Modifier modifier, Shape shape, MultiAspectCarouselItemDrawInfo multiAspectCarouselItemDrawInfo);
}
