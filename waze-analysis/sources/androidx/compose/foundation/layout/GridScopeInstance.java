package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import h.k.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GridScopeInstance implements GridScope {
    public static final int $stable = 0;
    public static final GridScopeInstance INSTANCE = new GridScopeInstance();

    private GridScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.GridScope
    public Modifier gridItem(Modifier modifier, j jVar, j jVar2, Alignment alignment) {
        if (jVar.isEmpty()) {
            throw new IllegalArgumentException("Row range (" + jVar + ") cannot be empty");
        }
        if (!jVar2.isEmpty()) {
            return gridItem(modifier, jVar.a(), jVar2.a(), (jVar.b() - jVar.a()) + 1, (jVar2.b() - jVar2.a()) + 1, alignment);
        }
        throw new IllegalArgumentException("Column range (" + jVar2 + ") cannot be empty");
    }

    @Override // androidx.compose.foundation.layout.GridScope
    public Modifier gridItem(Modifier modifier, int i2, int i3, int i4, int i5, Alignment alignment) {
        if (i2 != 0 && (i2 < -1000 || i2 >= 1001)) {
            throw new IllegalArgumentException("row must be between -1000 and 1000");
        }
        if (i3 != 0 && (i3 < -1000 || i3 >= 1001)) {
            throw new IllegalArgumentException("column must be between -1000 and 1000");
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException("rowSpan must be > 0");
        }
        if (i5 > 0) {
            return modifier.then(new GridItemElement(i2, i3, i4, i5, alignment));
        }
        throw new IllegalArgumentException("columnSpan must be > 0");
    }
}
