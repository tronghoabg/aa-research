package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TargetData {
    public static final int $stable = 0;
    private final MutableState currentMfrOffset$delegate;
    private final MutableState initialMfrOffset$delegate;
    private final MutableState size$delegate;
    private final MutableState targetStructuralOffset$delegate;

    private TargetData(long j2, long j3, long j4) {
        this.size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m8037boximpl(j2), null, 2, null);
        this.initialMfrOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m7969boximpl(j3), null, 2, null);
        this.targetStructuralOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m7969boximpl(j4), null, 2, null);
        this.currentMfrOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m7969boximpl(j3), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentMfrOffset-F1C5BW0, reason: not valid java name */
    public final long m1844getCurrentMfrOffsetF1C5BW0() {
        return ((Offset) this.currentMfrOffset$delegate.getValue()).m7990unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getInitialMfrOffset-F1C5BW0, reason: not valid java name */
    public final long m1845getInitialMfrOffsetF1C5BW0() {
        return ((Offset) this.initialMfrOffset$delegate.getValue()).m7990unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m1846getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m8054unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getTargetStructuralOffset-F1C5BW0, reason: not valid java name */
    public final long m1847getTargetStructuralOffsetF1C5BW0() {
        return ((Offset) this.targetStructuralOffset$delegate.getValue()).m7990unboximpl();
    }

    /* renamed from: setCurrentMfrOffset-k-4lQ0M, reason: not valid java name */
    public final void m1848setCurrentMfrOffsetk4lQ0M(long j2) {
        this.currentMfrOffset$delegate.setValue(Offset.m7969boximpl(j2));
    }

    /* renamed from: setInitialMfrOffset-k-4lQ0M, reason: not valid java name */
    public final void m1849setInitialMfrOffsetk4lQ0M(long j2) {
        this.initialMfrOffset$delegate.setValue(Offset.m7969boximpl(j2));
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m1850setSizeuvyYCjk(long j2) {
        this.size$delegate.setValue(Size.m8037boximpl(j2));
    }

    /* renamed from: setTargetStructuralOffset-k-4lQ0M, reason: not valid java name */
    public final void m1851setTargetStructuralOffsetk4lQ0M(long j2) {
        this.targetStructuralOffset$delegate.setValue(Offset.m7969boximpl(j2));
    }

    public /* synthetic */ TargetData(long j2, long j3, long j4, o oVar) {
        this(j2, j3, j4);
    }
}
