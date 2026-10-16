package androidx.compose.ui.node;

import h.ab;
import h.g.a.q;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;
    private final DepthSortedSet approachSet;
    private final DepthSortedSet lookaheadAndAncestorMeasureSet;
    private final DepthSortedSet lookaheadAndAncestorPlaceSet;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Invalidation.values().length];
            try {
                iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Invalidation.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Invalidation.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.lookaheadAndAncestorMeasureSet = new DepthSortedSet(z);
        this.lookaheadAndAncestorPlaceSet = new DepthSortedSet(z);
        this.approachSet = new DepthSortedSet(z);
    }

    public final void add(LayoutNode layoutNode, Invalidation invalidation) {
        Invalidation invalidation2 = Invalidation.LookaheadMeasurement;
        int iOrdinal = invalidation.ordinal();
        if (iOrdinal == 0) {
            this.lookaheadAndAncestorMeasureSet.add(layoutNode);
            this.approachSet.add(layoutNode);
            return;
        }
        if (iOrdinal == 1) {
            this.lookaheadAndAncestorPlaceSet.add(layoutNode);
            this.approachSet.add(layoutNode);
            return;
        }
        if (iOrdinal == 2) {
            if (layoutNode.getLookaheadRoot$ui() != null) {
                this.approachSet.add(layoutNode);
                return;
            } else {
                this.lookaheadAndAncestorMeasureSet.add(layoutNode);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new i();
        }
        if (layoutNode.getLookaheadRoot$ui() != null) {
            this.approachSet.add(layoutNode);
        } else {
            this.lookaheadAndAncestorPlaceSet.add(layoutNode);
        }
    }

    public final boolean contains(LayoutNode layoutNode, boolean z) {
        LayoutNode lookaheadRoot$ui = layoutNode.getLookaheadRoot$ui();
        boolean z2 = this.lookaheadAndAncestorMeasureSet.contains(layoutNode) || this.lookaheadAndAncestorPlaceSet.contains(layoutNode);
        return z ? lookaheadRoot$ui != null && z2 : (lookaheadRoot$ui == null && z2) || this.approachSet.contains(layoutNode);
    }

    public final boolean getAffectsLookaheadMeasure() {
        return (this.approachSet.isEmpty() || this.lookaheadAndAncestorMeasureSet.isEmpty()) ? false : true;
    }

    public final boolean isEmpty() {
        return this.lookaheadAndAncestorMeasureSet.isEmpty() && this.approachSet.isEmpty() && this.lookaheadAndAncestorPlaceSet.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final void popEach(q<? super LayoutNode, ? super Boolean, ? super Boolean, ab> qVar) {
        LayoutNode layoutNodePop;
        while (true) {
            boolean z = false;
            if (!this.lookaheadAndAncestorMeasureSet.isEmpty()) {
                layoutNodePop = this.lookaheadAndAncestorMeasureSet.pop();
                z = layoutNodePop.getLookaheadRoot$ui() != null;
                z = false;
            } else if (!this.lookaheadAndAncestorPlaceSet.isEmpty()) {
                layoutNodePop = this.lookaheadAndAncestorPlaceSet.pop();
                if (layoutNodePop.getLookaheadRoot$ui() != null) {
                    z = true;
                }
            } else if (this.approachSet.isEmpty()) {
                return;
            } else {
                layoutNodePop = this.approachSet.pop();
            }
            qVar.invoke(layoutNodePop, Boolean.valueOf(z), Boolean.valueOf(z));
        }
    }

    public final boolean remove(LayoutNode layoutNode) {
        return this.approachSet.remove(layoutNode) || this.lookaheadAndAncestorMeasureSet.remove(layoutNode) || this.lookaheadAndAncestorPlaceSet.remove(layoutNode);
    }

    public final boolean contains(LayoutNode layoutNode) {
        return this.lookaheadAndAncestorMeasureSet.contains(layoutNode) || this.lookaheadAndAncestorPlaceSet.contains(layoutNode) || this.approachSet.contains(layoutNode);
    }
}
