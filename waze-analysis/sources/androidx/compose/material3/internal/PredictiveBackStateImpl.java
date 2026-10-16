package androidx.compose.material3.internal;

import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PredictiveBackStateImpl implements PredictiveBackState {
    private final MutableState value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(BackEventProgress.NotRunning.INSTANCE, null, 2, null);

    @Override // androidx.compose.material3.internal.PredictiveBackState
    public BackEventProgress getValue() {
        return (BackEventProgress) this.value$delegate.getValue();
    }

    public void setValue(BackEventProgress backEventProgress) {
        this.value$delegate.setValue(backEventProgress);
    }
}
