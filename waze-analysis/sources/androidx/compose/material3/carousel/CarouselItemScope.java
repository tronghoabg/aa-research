package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CarouselItemScope {
    CarouselItemDrawInfo getCarouselItemDrawInfo();

    Modifier maskBorder(Modifier modifier, BorderStroke borderStroke, Shape shape, Composer composer, int i2);

    Modifier maskClip(Modifier modifier, Shape shape, Composer composer, int i2);

    GenericShape rememberMaskShape(Shape shape, Composer composer, int i2);
}
