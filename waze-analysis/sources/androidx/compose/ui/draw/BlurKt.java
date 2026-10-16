package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BlurKt {
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m7745blur1fqSgw(Modifier modifier, float f2, float f3, Shape shape) {
        int iM8654getDecal3opZhB0;
        boolean z;
        if (shape != null) {
            iM8654getDecal3opZhB0 = TileMode.Companion.m8653getClamp3opZhB0();
            z = true;
        } else {
            iM8654getDecal3opZhB0 = TileMode.Companion.m8654getDecal3opZhB0();
            z = false;
        }
        boolean z2 = z;
        return ((Dp.m11163compareTo0680j_4(f2, 0.0f) <= 0 || Dp.m11163compareTo0680j_4(f3, 0.0f) <= 0) && !z2) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new BlurKt$blur$1(f2, f3, iM8654getDecal3opZhB0, shape, z2));
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7746blur1fqSgw$default(Modifier modifier, float f2, float f3, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m7749boximpl(BlurredEdgeTreatment.Companion.m7756getRectangleGoahg());
        }
        return m7745blur1fqSgw(modifier, f2, f3, blurredEdgeTreatment.m7755unboximpl());
    }

    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m7747blurF8QBwvs(Modifier modifier, float f2, Shape shape) {
        return m7745blur1fqSgw(modifier, f2, f2, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7748blurF8QBwvs$default(Modifier modifier, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m7749boximpl(BlurredEdgeTreatment.Companion.m7756getRectangleGoahg());
        }
        return m7747blurF8QBwvs(modifier, f2, blurredEdgeTreatment.m7755unboximpl());
    }
}
