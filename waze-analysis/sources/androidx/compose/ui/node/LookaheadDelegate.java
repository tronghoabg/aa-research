package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;
    private MeasureResult _measureResult;
    private final NodeCoordinator coordinator;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m11307getZeronOccac();
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);
    private final MutableObjectIntMap<AlignmentLine> cachedAlignmentLinesMap = ObjectIntMapKt.mutableObjectIntMapOf();

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    /* renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m10001placeSelfgyyYBs(long j2) {
        if (!IntOffset.m11295equalsimpl0(mo9995getPositionnOccac(), j2)) {
            m10007setPositiongyyYBs(j2);
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLayoutNode().getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
            if (lookaheadPassDelegate$ui != null) {
                lookaheadPassDelegate$ui.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (isPlacingForAlignment$ui()) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_measureResult(MeasureResult measureResult) {
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m9811setMeasuredSizeozmzZPI((measureResult.getWidth() << 32) | (measureResult.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        } else {
            m9811setMeasuredSizeozmzZPI(IntSize.Companion.m11344getZeroYbymL2g());
        }
        if (!x.n(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !measureResult.getAlignmentLines().isEmpty()) && !x.n(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            LinkedHashMap linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui = this.coordinator.getLayoutNode().getLayoutDelegate$ui().getLookaheadAlignmentLinesOwner$ui();
        if (lookaheadAlignmentLinesOwner$ui == null) {
            x.g();
        }
        return lookaheadAlignmentLinesOwner$ui;
    }

    public final int getCachedAlignmentLine$ui(AlignmentLine alignmentLine) {
        return this.cachedAlignmentLinesMap.getOrDefault(alignmentLine, Integer.MIN_VALUE);
    }

    protected final MutableObjectIntMap<AlignmentLine> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        return wrapped$ui != null ? wrapped$ui.getLookaheadDelegate() : null;
    }

    /* renamed from: getConstraints-msEJaDk$ui, reason: not valid java name */
    public final long m10002getConstraintsmsEJaDk$ui() {
        return m9809getMeasurementConstraintsmsEJaDk();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new e();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui = this.coordinator.getWrappedBy$ui();
        return wrappedBy$ui != null ? wrappedBy$ui.getLookaheadDelegate() : null;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo9995getPositionnOccac() {
        return this.position;
    }

    /* renamed from: getSize-YbymL2g$ui, reason: not valid java name */
    public final long m10003getSizeYbymL2g$ui() {
        return (getWidth() << 32) | (getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public int maxIntrinsicHeight(int i2) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        if (wrapped$ui == null) {
            x.g();
        }
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        return lookaheadDelegate.maxIntrinsicHeight(i2);
    }

    public int maxIntrinsicWidth(int i2) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        if (wrapped$ui == null) {
            x.g();
        }
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        return lookaheadDelegate.maxIntrinsicWidth(i2);
    }

    public int minIntrinsicHeight(int i2) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        if (wrapped$ui == null) {
            x.g();
        }
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        return lookaheadDelegate.minIntrinsicHeight(i2);
    }

    public int minIntrinsicWidth(int i2) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        if (wrapped$ui == null) {
            x.g();
        }
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        return lookaheadDelegate.minIntrinsicWidth(i2);
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m10004performingMeasureK40F9xA(long j2, a<? extends MeasureResult> aVar) {
        m9812setMeasurementConstraintsBRTryo0(j2);
        set_measureResult(aVar.invoke());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo9742placeAtf8xVGno(long j2, float f2, l<? super GraphicsLayerScope, ab> lVar) {
        m10001placeSelfgyyYBs(j2);
        if (isShallowPlacing$ui()) {
            return;
        }
        placeChildren();
    }

    protected void placeChildren() {
        getMeasureResult$ui().placeChildren();
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui, reason: not valid java name */
    public final void m10005placeSelfApparentToRealOffsetgyyYBs$ui(long j2) {
        m10001placeSelfgyyYBs(IntOffset.m11300plusqkQi6aY(j2, m9807getApparentToRealOffsetnOccac()));
    }

    /* renamed from: positionIn-iSbpLlY$ui, reason: not valid java name */
    public final long m10006positionIniSbpLlY$ui(LookaheadDelegate lookaheadDelegate, boolean z) {
        long jM11307getZeronOccac = IntOffset.Companion.m11307getZeronOccac();
        while (!x.n(this, lookaheadDelegate)) {
            if (!this.isPlacedUnderMotionFrameOfReference() || !z) {
                jM11307getZeronOccac = IntOffset.m11300plusqkQi6aY(jM11307getZeronOccac, this.mo9995getPositionnOccac());
            }
            NodeCoordinator wrappedBy$ui = this.coordinator.getWrappedBy$ui();
            if (wrappedBy$ui == null) {
                x.g();
            }
            this = wrappedBy$ui.getLookaheadDelegate();
            if (this == null) {
                x.g();
            }
        }
        return jM11307getZeronOccac;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui() {
        mo9742placeAtf8xVGno(mo9995getPositionnOccac(), 0.0f, (l<? super GraphicsLayerScope, ab>) null);
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m10007setPositiongyyYBs(long j2) {
        this.position = j2;
    }
}
