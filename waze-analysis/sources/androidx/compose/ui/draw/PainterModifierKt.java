package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PainterModifierKt {
    public static final Modifier paint(Modifier modifier, Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        return modifier.then(new PainterElement(painter, z, alignment, contentScale, f2, colorFilter));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i2 & 8) != 0) {
            contentScale = ContentScale.Companion.getInside();
        }
        ContentScale contentScale2 = contentScale;
        boolean z2 = (!((i2 & 2) == 0)) | z;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i2 & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z2, alignment2, contentScale2, f3, colorFilter);
    }
}
