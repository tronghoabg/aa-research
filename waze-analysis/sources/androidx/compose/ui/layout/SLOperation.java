package androidx.compose.ui.layout;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
final class SLOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int CancelPausedPrecomposition = 0;
    private static final int ReuseForceSyncDeactivation = 1;
    private static final int ReuseScheduleOutOfFrameDeactivation = 2;
    private static final int ReuseSyncDeactivation = 3;
    private static final int ReuseDeactivationViaHost = 4;
    private static final int TookFromPrecomposeMap = 5;
    private static final int Subcompose = 6;
    private static final int SubcomposeNew = 7;
    private static final int SubcomposePausable = 8;
    private static final int SubcomposeForceReuse = 9;
    private static final int DeactivateOutOfFrame = 10;
    private static final int DeactivateOutOfFrameCancelled = 11;
    private static final int SlotToReusedFromOnDeactivate = 12;
    private static final int SlotToReusedFromOnReuse = 13;
    private static final int Reused = 14;
    private static final int ResumePaused = 15;
    private static final int PausePaused = 16;
    private static final int ApplyPaused = 17;

    private /* synthetic */ SLOperation(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SLOperation m9829boximpl(int i2) {
        return new SLOperation(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9831equalsimpl(int i2, Object obj) {
        return (obj instanceof SLOperation) && i2 == ((SLOperation) obj).m9835unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9832equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9834toStringimpl(int i2) {
        return "SLOperation(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m9831equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9834toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9835unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getApplyPaused-NjRlDlw, reason: not valid java name */
        public final int m9836getApplyPausedNjRlDlw() {
            return SLOperation.ApplyPaused;
        }

        /* renamed from: getCancelPausedPrecomposition-NjRlDlw, reason: not valid java name */
        public final int m9837getCancelPausedPrecompositionNjRlDlw() {
            return SLOperation.CancelPausedPrecomposition;
        }

        /* renamed from: getDeactivateOutOfFrame-NjRlDlw, reason: not valid java name */
        public final int m9838getDeactivateOutOfFrameNjRlDlw() {
            return SLOperation.DeactivateOutOfFrame;
        }

        /* renamed from: getDeactivateOutOfFrameCancelled-NjRlDlw, reason: not valid java name */
        public final int m9839getDeactivateOutOfFrameCancelledNjRlDlw() {
            return SLOperation.DeactivateOutOfFrameCancelled;
        }

        /* renamed from: getPausePaused-NjRlDlw, reason: not valid java name */
        public final int m9840getPausePausedNjRlDlw() {
            return SLOperation.PausePaused;
        }

        /* renamed from: getResumePaused-NjRlDlw, reason: not valid java name */
        public final int m9841getResumePausedNjRlDlw() {
            return SLOperation.ResumePaused;
        }

        /* renamed from: getReuseDeactivationViaHost-NjRlDlw, reason: not valid java name */
        public final int m9842getReuseDeactivationViaHostNjRlDlw() {
            return SLOperation.ReuseDeactivationViaHost;
        }

        /* renamed from: getReuseForceSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m9843getReuseForceSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseForceSyncDeactivation;
        }

        /* renamed from: getReuseScheduleOutOfFrameDeactivation-NjRlDlw, reason: not valid java name */
        public final int m9844getReuseScheduleOutOfFrameDeactivationNjRlDlw() {
            return SLOperation.ReuseScheduleOutOfFrameDeactivation;
        }

        /* renamed from: getReuseSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m9845getReuseSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseSyncDeactivation;
        }

        /* renamed from: getReused-NjRlDlw, reason: not valid java name */
        public final int m9846getReusedNjRlDlw() {
            return SLOperation.Reused;
        }

        /* renamed from: getSlotToReusedFromOnDeactivate-NjRlDlw, reason: not valid java name */
        public final int m9847getSlotToReusedFromOnDeactivateNjRlDlw() {
            return SLOperation.SlotToReusedFromOnDeactivate;
        }

        /* renamed from: getSlotToReusedFromOnReuse-NjRlDlw, reason: not valid java name */
        public final int m9848getSlotToReusedFromOnReuseNjRlDlw() {
            return SLOperation.SlotToReusedFromOnReuse;
        }

        /* renamed from: getSubcompose-NjRlDlw, reason: not valid java name */
        public final int m9849getSubcomposeNjRlDlw() {
            return SLOperation.Subcompose;
        }

        /* renamed from: getSubcomposeForceReuse-NjRlDlw, reason: not valid java name */
        public final int m9850getSubcomposeForceReuseNjRlDlw() {
            return SLOperation.SubcomposeForceReuse;
        }

        /* renamed from: getSubcomposeNew-NjRlDlw, reason: not valid java name */
        public final int m9851getSubcomposeNewNjRlDlw() {
            return SLOperation.SubcomposeNew;
        }

        /* renamed from: getSubcomposePausable-NjRlDlw, reason: not valid java name */
        public final int m9852getSubcomposePausableNjRlDlw() {
            return SLOperation.SubcomposePausable;
        }

        /* renamed from: getTookFromPrecomposeMap-NjRlDlw, reason: not valid java name */
        public final int m9853getTookFromPrecomposeMapNjRlDlw() {
            return SLOperation.TookFromPrecomposeMap;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m9830constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9833hashCodeimpl(int i2) {
        return i2;
    }
}
