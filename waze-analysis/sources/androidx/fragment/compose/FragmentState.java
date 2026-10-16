package androidx.fragment.compose;

import android.support.v4.app.aq;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentState {
    public static final int $stable = 0;
    private MutableState<aq> state;

    public /* synthetic */ FragmentState(MutableState mutableState, int i2, o oVar) {
        this((i2 & 1) != 0 ? SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null) : mutableState);
    }

    public final MutableState<aq> getState$fragment_compose() {
        return this.state;
    }

    public final void setState$fragment_compose(MutableState<aq> mutableState) {
        this.state = mutableState;
    }

    public FragmentState(MutableState<aq> mutableState) {
        this.state = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
