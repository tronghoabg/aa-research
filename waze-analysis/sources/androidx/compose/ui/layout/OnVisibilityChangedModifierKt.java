package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnVisibilityChangedModifierKt {
    public static final Modifier onVisibilityChanged(Modifier modifier, long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, l<? super Boolean, ab> lVar) {
        return modifier.then(new OnVisibilityChangedElement(j2, f2, layoutBoundsHolder, lVar));
    }

    public static /* synthetic */ Modifier onVisibilityChanged$default(Modifier modifier, long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, l lVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            j2 = 0;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i2 & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onVisibilityChanged(modifier, j3, f3, layoutBoundsHolder, lVar);
    }

    public static final DelegatableNode onVisibilityChangedNode(long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, l<? super Boolean, ab> lVar) {
        return new OnVisibilityChangedNode(j2, f2, layoutBoundsHolder, lVar);
    }

    public static /* synthetic */ DelegatableNode onVisibilityChangedNode$default(long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, l lVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            j2 = 0;
        }
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onVisibilityChangedNode(j2, f2, layoutBoundsHolder, lVar);
    }
}
