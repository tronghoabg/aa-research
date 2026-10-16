package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import h.ab;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {
    public static final int $stable = SnapshotStateObserver.$stable;
    private final SnapshotStateObserver observer;
    private final l<LayoutNode, ab> onCommitAffectingLookaheadMeasure = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.INSTANCE;
    private final l<LayoutNode, ab> onCommitAffectingMeasure = OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;
    private final l<LayoutNode, ab> onCommitAffectingSemantics = OwnerSnapshotObserver$onCommitAffectingSemantics$1.INSTANCE;
    private final l<LayoutNode, ab> onCommitAffectingLayout = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;
    private final l<LayoutNode, ab> onCommitAffectingLayoutModifier = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;
    private final l<LayoutNode, ab> onCommitAffectingLayoutModifierInLookahead = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.INSTANCE;
    private final l<LayoutNode, ab> onCommitAffectingLookahead = OwnerSnapshotObserver$onCommitAffectingLookahead$1.INSTANCE;

    public OwnerSnapshotObserver(l<? super a<ab>, ab> lVar) {
        this.observer = new SnapshotStateObserver(lVar);
    }

    public final void clear$ui(Object obj) {
        this.observer.clear(obj);
    }

    public final void clearInvalidObservations$ui() {
        this.observer.clearIf(OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE);
    }

    public final void observeLayoutModifierSnapshotReads$ui(LayoutNode layoutNode, a<ab> aVar) {
        l lVar = this.onCommitAffectingLayoutModifier;
        this.observer.observeReads(layoutNode, lVar, aVar);
    }

    public final void observeLayoutModifierSnapshotReadsAffectingLookahead$ui(LayoutNode layoutNode, a<ab> aVar) {
        l lVar = this.onCommitAffectingLayoutModifierInLookahead;
        this.observer.observeReads(layoutNode, lVar, aVar);
    }

    public final void observeLayoutSnapshotReads$ui(LayoutNode layoutNode, a<ab> aVar) {
        l lVar = this.onCommitAffectingLayout;
        this.observer.observeReads(layoutNode, lVar, aVar);
    }

    public final void observeLayoutSnapshotReadsAffectingLookahead$ui(LayoutNode layoutNode, a<ab> aVar) {
        l lVar = this.onCommitAffectingLookahead;
        this.observer.observeReads(layoutNode, lVar, aVar);
    }

    public final void observeMeasureSnapshotReads$ui(LayoutNode layoutNode, a<ab> aVar) {
        l lVar = this.onCommitAffectingMeasure;
        this.observer.observeReads(layoutNode, lVar, aVar);
    }

    public final void observeMeasureSnapshotReadsAffectingLookahead$ui(LayoutNode layoutNode, a<ab> aVar) {
        l lVar = this.onCommitAffectingLookaheadMeasure;
        this.observer.observeReads(layoutNode, lVar, aVar);
    }

    public final <T extends OwnerScope> void observeReads$ui(T t, l<? super T, ab> lVar, a<ab> aVar) {
        this.observer.observeReads(t, lVar, aVar);
    }

    public final void observeSemanticsReads$ui(LayoutNode layoutNode, a<ab> aVar) {
        l lVar = this.onCommitAffectingSemantics;
        this.observer.observeReads(layoutNode, lVar, aVar);
    }

    public final void startObserving$ui() {
        this.observer.start();
    }

    public final void stopObserving$ui() {
        this.observer.stop();
        this.observer.clear();
    }
}
