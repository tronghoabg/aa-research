package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ListItemElevation {
    public static final int $stable = 0;
    private final float draggedElevation;
    private final float elevation;

    private ListItemElevation(float f2, float f3) {
        this.elevation = f2;
        this.draggedElevation = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListItemElevation)) {
            return false;
        }
        ListItemElevation listItemElevation = (ListItemElevation) obj;
        return Dp.m11169equalsimpl0(this.elevation, listItemElevation.elevation) && Dp.m11169equalsimpl0(this.draggedElevation, listItemElevation.draggedElevation);
    }

    /* renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name */
    public final float m5136getDraggedElevationD9Ej5fM() {
        return this.draggedElevation;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m5137getElevationD9Ej5fM() {
        return this.elevation;
    }

    public int hashCode() {
        return (Dp.m11170hashCodeimpl(this.elevation) * 31) + Dp.m11170hashCodeimpl(this.draggedElevation);
    }

    public /* synthetic */ ListItemElevation(float f2, float f3, o oVar) {
        this(f2, f3);
    }
}
