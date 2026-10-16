package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final MutableState<PointerKeyboardModifiers> GlobalKeyboardModifiers = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m9672boximpl(0), null, 2, null);
    private final MutableState<IntSize> _containerSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m11331boximpl(IntSize.Companion.m11344getZeroYbymL2g()), null, 2, null);
    private final MutableState<DpSize> _containerDpSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DpSize.m11250boximpl(DpSize.Companion.m11272getZeroMYxV2XQ()), null, 2, null);
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerDpSize-MYxV2XQ */
    public long mo10258getContainerDpSizeMYxV2XQ() {
        return this._containerDpSize.getValue().m11270unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g */
    public long mo10259getContainerSizeYbymL2g() {
        return this._containerSize.getValue().m11343unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo10260getKeyboardModifiersk7X9c1A() {
        return GlobalKeyboardModifiers.getValue().m9678unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setContainerDpSize-EaSLcWc, reason: not valid java name */
    public void m10297setContainerDpSizeEaSLcWc(long j2) {
        this._containerDpSize.setValue(DpSize.m11250boximpl(j2));
    }

    /* renamed from: setContainerSize-ozmzZPI, reason: not valid java name */
    public void m10298setContainerSizeozmzZPI(long j2) {
        this._containerSize.setValue(IntSize.m11331boximpl(j2));
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m10299setKeyboardModifiers5xRPYO0(int i2) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m9672boximpl(i2));
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z));
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Companion {
        private Companion() {
        }

        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
