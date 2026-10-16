package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RailPredictiveBackState {
    public static final int $stable = 0;
    private final MutableState swipeEdgeMatchesRail$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwipeEdgeMatchesRail() {
        return ((Boolean) this.swipeEdgeMatchesRail$delegate.getValue()).booleanValue();
    }

    public final void setSwipeEdgeMatchesRail(boolean z) {
        this.swipeEdgeMatchesRail$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(boolean r3, boolean r4) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L6
            if (r4 == 0) goto Ld
            r4 = r0
        L6:
            r1 = 0
            if (r3 != 0) goto Lc
            if (r4 == 0) goto Lc
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r2.setSwipeEdgeMatchesRail(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.RailPredictiveBackState.update(boolean, boolean):void");
    }
}
