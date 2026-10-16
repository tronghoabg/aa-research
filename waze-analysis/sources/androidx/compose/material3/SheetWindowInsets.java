package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SheetWindowInsets implements WindowInsets {
    public static final int $stable = 0;
    private final SheetState state;

    public SheetWindowInsets(SheetState sheetState) {
        this.state = sheetState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SheetWindowInsets) {
            return x.n(this.state, ((SheetWindowInsets) obj).state);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        float offset = this.state.getAnchoredDraggableState$material3().getOffset();
        if (Float.isNaN(offset)) {
            return 0;
        }
        return n.h((int) offset, 0);
    }

    public int hashCode() {
        return this.state.hashCode();
    }
}
