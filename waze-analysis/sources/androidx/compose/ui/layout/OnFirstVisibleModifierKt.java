package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnFirstVisibleModifierKt {
    public static final Modifier onFirstVisible(Modifier modifier, long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, h.g.a.a<ab> aVar) {
        return modifier.then(new OnFirstVisibleElement(j2, f2, layoutBoundsHolder, aVar));
    }

    public static /* synthetic */ Modifier onFirstVisible$default(Modifier modifier, long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, h.g.a.a aVar, int i2, Object obj) {
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
        return onFirstVisible(modifier, j3, f3, layoutBoundsHolder, aVar);
    }
}
