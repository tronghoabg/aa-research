package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyWindowInfo implements WindowInfo {
    public static final int $stable = 0;
    private MutableState<DerivedSize> _containerSize;
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private a<DerivedSize> onInitializeContainerSize;

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerDpSize-MYxV2XQ, reason: not valid java name */
    public long mo10258getContainerDpSizeMYxV2XQ() {
        DerivedSize zero;
        MutableState<DerivedSize> mutableStateMutableStateOf$default = this._containerSize;
        if (mutableStateMutableStateOf$default == null) {
            a<DerivedSize> aVar = this.onInitializeContainerSize;
            if (aVar == null || (zero = aVar.invoke()) == null) {
                zero = DerivedSize.Companion.getZero();
            }
            mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(zero, null, 2, null);
            this._containerSize = mutableStateMutableStateOf$default;
            this.onInitializeContainerSize = null;
        }
        if (mutableStateMutableStateOf$default == null) {
            x.g();
        }
        return mutableStateMutableStateOf$default.getValue().m10226getDpSizeMYxV2XQ();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public long mo10259getContainerSizeYbymL2g() {
        DerivedSize zero;
        MutableState<DerivedSize> mutableStateMutableStateOf$default = this._containerSize;
        if (mutableStateMutableStateOf$default == null) {
            a<DerivedSize> aVar = this.onInitializeContainerSize;
            if (aVar == null || (zero = aVar.invoke()) == null) {
                zero = DerivedSize.Companion.getZero();
            }
            mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(zero, null, 2, null);
            this._containerSize = mutableStateMutableStateOf$default;
            this.onInitializeContainerSize = null;
        }
        if (mutableStateMutableStateOf$default == null) {
            x.g();
        }
        return mutableStateMutableStateOf$default.getValue().m10227getPxSizeYbymL2g();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public int mo10260getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui().getValue().m9678unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m10261setKeyboardModifiers5xRPYO0(int i2) {
        WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui().setValue(PointerKeyboardModifiers.m9672boximpl(i2));
    }

    public final void setOnInitializeContainerSize(a<DerivedSize> aVar) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = aVar;
        }
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z));
    }

    public final void updateContainerSizeIfObserved(a<DerivedSize> aVar) {
        MutableState mutableState = this._containerSize;
        if (mutableState != null) {
            mutableState.setValue(aVar.invoke());
        }
    }
}
