package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DpTouchBoundsExpansion;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PointerIconKt {
    public static final Modifier pointerHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z) {
        return modifier.then(new PointerHoverIconModifierElement(pointerIcon, z));
    }

    public static final Modifier stylusHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return modifier.then(new StylusHoverIconModifierElement(pointerIcon, z, dpTouchBoundsExpansion));
    }

    public static /* synthetic */ Modifier stylusHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i2, Object obj) {
        boolean z2 = z & ((i2 & 2) == 0);
        if ((i2 & 4) != 0) {
            dpTouchBoundsExpansion = null;
        }
        return stylusHoverIcon(modifier, pointerIcon, z2, dpTouchBoundsExpansion);
    }
}
