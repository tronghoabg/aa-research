package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.o;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsProviderModifierNode extends Modifier.Node implements LayoutModifierNode, BeyondBoundsLayoutProviderModifierNode, BeyondBoundsLayout {
    private LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private Orientation orientation;
    private boolean reverseLayout;
    private LazyLayoutBeyondBoundsState state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final LazyLayoutBeyondBoundsProviderModifierNode$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsProviderModifierNode(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z;
        this.orientation = orientation;
    }

    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m2926addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i2) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m2928isForward4vf7U8o(i2)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m2927hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i2) {
        if (m2929isOppositeToOrientation4vf7U8o(i2)) {
            return false;
        }
        if (m2928isForward4vf7U8o(i2)) {
            if (interval.getEnd() < this.state.getItemCount() - 1) {
                return true;
            }
        } else if (interval.getStart() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m2928isForward4vf7U8o(int i2) {
        if (BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9730getBeforehoxUOeE())) {
            return false;
        }
        if (BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9729getAfterhoxUOeE())) {
            return true;
        }
        if (BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9728getAbovehoxUOeE())) {
            return this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9731getBelowhoxUOeE())) {
            return !this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9732getLefthoxUOeE())) {
            LayoutDirection layoutDirectionRequireLayoutDirection = DelegatableNodeKt.requireLayoutDirection(this);
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            int iOrdinal = layoutDirectionRequireLayoutDirection.ordinal();
            if (iOrdinal == 0) {
                return this.reverseLayout;
            }
            if (iOrdinal == 1) {
                return !this.reverseLayout;
            }
            throw new i();
        }
        if (!BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9733getRighthoxUOeE())) {
            LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
            throw new e();
        }
        LayoutDirection layoutDirectionRequireLayoutDirection2 = DelegatableNodeKt.requireLayoutDirection(this);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int iOrdinal2 = layoutDirectionRequireLayoutDirection2.ordinal();
        if (iOrdinal2 == 0) {
            return !this.reverseLayout;
        }
        if (iOrdinal2 == 1) {
            return this.reverseLayout;
        }
        throw new i();
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m2929isOppositeToOrientation4vf7U8o(int i2) {
        if (BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9728getAbovehoxUOeE()) || BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9731getBelowhoxUOeE())) {
            return this.orientation == Orientation.Horizontal;
        }
        if (BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9732getLefthoxUOeE()) || BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9733getRighthoxUOeE())) {
            return this.orientation == Orientation.Vertical;
        }
        if (BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9730getBeforehoxUOeE()) || BeyondBoundsLayout.LayoutDirection.m9724equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m9729getAfterhoxUOeE())) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
        throw new e();
    }

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode
    public BeyondBoundsLayout getBeyondBoundsLayout() {
        return this;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo2930layouto7g1Pn8(final int i2, l<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> lVar) {
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems() || !isAttached()) {
            return lVar.invoke(emptyBeyondBoundsScope);
        }
        boolean zM2928isForward4vf7U8o = m2928isForward4vf7U8o(i2);
        LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState = this.state;
        int lastPlacedIndex = zM2928isForward4vf7U8o ? lazyLayoutBeyondBoundsState.getLastPlacedIndex() : lazyLayoutBeyondBoundsState.getFirstPlacedIndex();
        final aq aqVar = new aq();
        aqVar.f48105a = this.beyondBoundsInfo.addInterval(lastPlacedIndex, lastPlacedIndex);
        int iItemsPerViewport = this.state.itemsPerViewport();
        int i3 = iItemsPerViewport + iItemsPerViewport;
        int itemCount = this.state.getItemCount();
        if (i3 > itemCount) {
            i3 = itemCount;
        }
        T tInvoke = null;
        for (int i4 = 0; tInvoke == null && m2927hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) aqVar.f48105a, i2) && i4 < i3; i4++) {
            LazyLayoutBeyondBoundsInfo.Interval intervalM2926addNextIntervalFR3nfPY = m2926addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) aqVar.f48105a, i2);
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) aqVar.f48105a);
            aqVar.f48105a = intervalM2926addNextIntervalFR3nfPY;
            LayoutModifierNodeKt.remeasureSync(this);
            tInvoke = lVar.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    return this.this$0.m2927hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) aqVar.f48105a, i2);
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) aqVar.f48105a);
        LayoutModifierNodeKt.remeasureSync(this);
        return tInvoke;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public AnonymousClass1() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03831() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LazyLayoutBeyondBoundsProviderModifierNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03841() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03851() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final void update(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z;
        this.orientation = orientation;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
