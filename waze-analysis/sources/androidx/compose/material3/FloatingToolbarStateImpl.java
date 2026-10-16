package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FloatingToolbarStateImpl implements FloatingToolbarState {
    private MutableFloatState _offset;
    private final MutableFloatState contentOffset$delegate;
    private final MutableFloatState offsetLimit$delegate;

    public FloatingToolbarStateImpl(float f2, float f3, float f4) {
        this.offsetLimit$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.contentOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f4);
        this._offset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
    }

    @Override // androidx.compose.material3.FloatingToolbarState
    public float getContentOffset() {
        return this.contentOffset$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.FloatingToolbarState
    public float getOffset() {
        return this._offset.getFloatValue();
    }

    @Override // androidx.compose.material3.FloatingToolbarState
    public float getOffsetLimit() {
        return this.offsetLimit$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.FloatingToolbarState
    public void setContentOffset(float f2) {
        this.contentOffset$delegate.setFloatValue(f2);
    }

    @Override // androidx.compose.material3.FloatingToolbarState
    public void setOffset(float f2) {
        this._offset.setFloatValue(n.g(f2, getOffsetLimit(), 0.0f));
    }

    @Override // androidx.compose.material3.FloatingToolbarState
    public void setOffsetLimit(float f2) {
        this.offsetLimit$delegate.setFloatValue(f2);
    }
}
