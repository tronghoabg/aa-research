package androidx.compose.ui.layout;

import androidx.collection.IntList;
import h.a.i;
import h.n.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SubcomposeLayoutPausableCompositionException extends IllegalStateException {
    private final IntList operations;
    private final Object slotId;

    public SubcomposeLayoutPausableCompositionException(IntList intList, Object obj, Throwable th) {
        super(th);
        this.operations = intList;
        this.slotId = obj;
    }

    private final List<String> operationsList() {
        String str;
        IntList intList = this.operations;
        List listB = i.b();
        int i2 = intList._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i.a(listB);
            }
            int i3 = this.operations.get(i2);
            if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9837getCancelPausedPrecompositionNjRlDlw())) {
                str = "CancelPausedPrecomposition";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9843getReuseForceSyncDeactivationNjRlDlw())) {
                str = "ReuseForceSyncDeactivation";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9844getReuseScheduleOutOfFrameDeactivationNjRlDlw())) {
                str = "ReuseScheduleOutOfFrameDeactivation";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9845getReuseSyncDeactivationNjRlDlw())) {
                str = "ReuseSyncDeactivation";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9842getReuseDeactivationViaHostNjRlDlw())) {
                str = "ReuseDeactivationViaHost";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9853getTookFromPrecomposeMapNjRlDlw())) {
                str = "TookFromPrecomposeMap";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9849getSubcomposeNjRlDlw())) {
                str = "Subcompose";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9851getSubcomposeNewNjRlDlw())) {
                str = "SubcomposeNew";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9852getSubcomposePausableNjRlDlw())) {
                str = "SubcomposePausable";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9850getSubcomposeForceReuseNjRlDlw())) {
                str = "SubcomposeForceReuse";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9838getDeactivateOutOfFrameNjRlDlw())) {
                str = "DeactivateOutOfFrame";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9839getDeactivateOutOfFrameCancelledNjRlDlw())) {
                str = "DeactivateOutOfFrameCancelled";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9847getSlotToReusedFromOnDeactivateNjRlDlw())) {
                str = "SlotToReusedFromOnDeactivate";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9848getSlotToReusedFromOnReuseNjRlDlw())) {
                str = "SlotToReusedFromOnReuse";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9846getReusedNjRlDlw())) {
                str = "Reused";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9841getResumePausedNjRlDlw())) {
                str = "ResumePaused";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9840getPausePausedNjRlDlw())) {
                str = "PausePaused";
            } else if (SLOperation.m9832equalsimpl0(i3, SLOperation.Companion.m9836getApplyPausedNjRlDlw())) {
                str = "ApplyPaused";
            } else {
                str = "Unexpected " + i3;
            }
            listB.add(i2 + ": " + str);
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return o.al("\n            |slotid=" + this.slotId + ". Last operations:\n            |" + i.aM(operationsList(), "\n", null, null, 0, null, 62) + "\n            ");
    }

    public static /* synthetic */ void getMessage$annotations() {
    }
}
