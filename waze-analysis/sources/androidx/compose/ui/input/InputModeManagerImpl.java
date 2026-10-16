package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 8;
    private final MutableState inputMode$delegate;
    private final InputModeChangeRequester onRequestInputModeChange;

    private InputModeManagerImpl(int i2, InputModeChangeRequester inputModeChangeRequester) {
        this.onRequestInputModeChange = inputModeChangeRequester;
        this.inputMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m9068boximpl(i2), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo9078getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m9074unboximpl();
    }

    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo9079requestInputModeiuPiT84(int i2) {
        return this.onRequestInputModeChange.mo9077requestiuPiT84(i2);
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m9080setInputModeiuPiT84(int i2) {
        this.inputMode$delegate.setValue(InputMode.m9068boximpl(i2));
    }

    public /* synthetic */ InputModeManagerImpl(int i2, InputModeChangeRequester inputModeChangeRequester, o oVar) {
        this(i2, inputModeChangeRequester);
    }
}
