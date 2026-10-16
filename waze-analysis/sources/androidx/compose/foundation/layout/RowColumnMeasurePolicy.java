package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface RowColumnMeasurePolicy {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.RowColumnMeasurePolicy$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: createConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m2801createConstraintsxF2OJ5Q$default(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i2, int i3, int i4, int i5, boolean z, int i6, Object obj) {
            if (obj == null) {
                return rowColumnMeasurePolicy.mo2475createConstraintsxF2OJ5Q(i2, i3, i4, i5, z & ((i6 & 16) == 0));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
    }

    /* renamed from: createConstraints-xF2OJ5Q */
    long mo2475createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z);

    int crossAxisSize(Placeable placeable);

    int mainAxisSize(Placeable placeable);

    MeasureResult placeHelper(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7);

    void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope);
}
