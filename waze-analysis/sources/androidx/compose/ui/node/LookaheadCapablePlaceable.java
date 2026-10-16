package androidx.compose.ui.node;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final l<PlaceableResult, ab> onCommitAffectingRuler = LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1.INSTANCE;
    private ResettableRulerScope _rulerScope;
    private PlaceableResult cachedRulerPlaceableResult;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);
    private MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> rulerReaders;
    private RulerTrackingMap rulerValues;
    private l<? super RulerScope, ab> rulersLambda;

    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addRulerReader(androidx.compose.ui.node.LayoutNode r32, androidx.compose.ui.layout.Ruler r33) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.addRulerReader(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.Ruler):void");
    }

    /* renamed from: captureRulers-OSxE8f4, reason: not valid java name */
    private final void m9993captureRulersOSxE8f4(PlaceableResult placeableResult, long j2, long j3) {
        OwnerSnapshotObserver snapshotObserver;
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = this.rulerReaders;
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        Owner owner$ui = getLayoutNode().getOwner$ui();
        if (owner$ui != null && (snapshotObserver = owner$ui.getSnapshotObserver()) != null) {
            snapshotObserver.observer.observeReads(placeableResult, onCommitAffectingRuler, new LookaheadCapablePlaceable$captureRulers$1(this, j2, j3, placeableResult));
        }
        rulerTrackingMap.notifyChanged(isLookingAhead(), this, mutableScatterMap);
    }

    /* renamed from: captureRulers-OSxE8f4$default, reason: not valid java name */
    static /* synthetic */ void m9994captureRulersOSxE8f4$default(LookaheadCapablePlaceable lookaheadCapablePlaceable, PlaceableResult placeableResult, long j2, long j3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
        }
        if ((i2 & 2) != 0) {
            j2 = IntOffset.Companion.m11306getMaxnOccac();
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = IntSize.Companion.m11344getZeroYbymL2g();
        }
        lookaheadCapablePlaceable.m9993captureRulersOSxE8f4(placeableResult, j4, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void captureRulersIfNeeded(androidx.compose.ui.node.PlaceableResult r18) {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.isPlacingForAlignment
            if (r1 == 0) goto L7
            goto L60
        L7:
            androidx.compose.ui.layout.MeasureResult r1 = r18.getResult()
            h.g.a.l r8 = r1.getRulers()
            androidx.collection.MutableScatterMap<androidx.compose.ui.layout.Ruler, androidx.collection.MutableScatterSet<androidx.compose.ui.node.WeakReference<androidx.compose.ui.node.LayoutNode>>> r1 = r0.rulerReaders
            if (r8 != 0) goto L61
            if (r1 == 0) goto L60
            r2 = r1
            androidx.collection.ScatterMap r2 = (androidx.collection.ScatterMap) r2
            java.lang.Object[] r3 = r2.values
            long[] r2 = r2.metadata
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L5d
            r5 = 0
            r6 = r5
        L23:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L58
            int r9 = r6 - r4
            r10 = r5
        L36:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L52
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            androidx.collection.MutableScatterSet r11 = (androidx.collection.MutableScatterSet) r11
            r0.notifyRulerValueChange(r11)
        L52:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L36
        L56:
            if (r11 != r12) goto L5d
        L58:
            if (r6 == r4) goto L5d
            int r6 = r6 + 1
            goto L23
        L5d:
            r1.clear()
        L60:
            return
        L61:
            r6 = 6
            r7 = 0
            r2 = 0
            r4 = 0
            r1 = r18
            m9994captureRulersOSxE8f4$default(r0, r1, r2, r4, r6, r7)
            r0.rulersLambda = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.captureRulersIfNeeded(androidx.compose.ui.node.PlaceableResult):void");
    }

    private final LookaheadCapablePlaceable findAncestorRulerDefiner(Ruler ruler) {
        LookaheadCapablePlaceable parent;
        while (true) {
            RulerTrackingMap rulerTrackingMap = this.rulerValues;
            if ((rulerTrackingMap != null && rulerTrackingMap.contains(ruler)) || (parent = this.getParent()) == null) {
                break;
            }
            this = parent;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResettableRulerScope getRulerScope() {
        ResettableRulerScope resettableRulerScope = this._rulerScope;
        if (resettableRulerScope != null) {
            return resettableRulerScope;
        }
        ResettableRulerScope resettableRulerScope2 = new ResettableRulerScope();
        this._rulerScope = resettableRulerScope2;
        return resettableRulerScope2;
    }

    private final boolean isLayoutNodeAncestor(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode == layoutNode2) {
            return true;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (parent$ui != null) {
            return isLayoutNodeAncestor(parent$ui, layoutNode2);
        }
        return false;
    }

    private final void notifyRulerValueChange(MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet) {
        int i2;
        LayoutNode layoutNode;
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet2 = mutableScatterSet;
        Object[] objArr = mutableScatterSet2.elements;
        long[] jArr = mutableScatterSet2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i3 << 3) + i5]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui(false);
                        } else {
                            layoutNode.requestRelayout$ui(false);
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void captureRulersIfNeeded$ui(androidx.compose.ui.layout.MeasureResult r24) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.captureRulersIfNeeded$ui(androidx.compose.ui.layout.MeasureResult):void");
    }

    public final float findRulerValue(Ruler ruler, float f2) {
        if (!this.isPlacingForAlignment) {
            LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
            while (true) {
                RulerTrackingMap rulerTrackingMap = lookaheadCapablePlaceable.rulerValues;
                float orDefault = rulerTrackingMap != null ? rulerTrackingMap.getOrDefault(ruler, Float.NaN) : Float.NaN;
                if (!Float.isNaN(orDefault)) {
                    lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                    return ruler.calculateCoordinate$ui(orDefault, lookaheadCapablePlaceable.getCoordinates(), getCoordinates());
                }
                LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
                if (parent == null) {
                    lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                    break;
                }
                lookaheadCapablePlaceable = parent;
            }
        }
        return f2;
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int iCalculateAlignmentLine;
        if (getHasMeasureResult() && (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return iCalculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m11296getXimpl(m9807getApparentToRealOffsetnOccac()) : IntOffset.m11297getYimpl(m9807getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui();

    public abstract LookaheadCapablePlaceable getParent();

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long mo9995getPositionnOccac();

    protected final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped$ui = nodeCoordinator.getWrapped$ui();
        if (!x.n(wrapped$ui != null ? wrapped$ui.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    public final void invalidateChildrenOfDefiningRuler$ui(Ruler ruler) {
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = findAncestorRulerDefiner(ruler).rulerReaders;
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSetRemove = mutableScatterMap != null ? mutableScatterMap.remove(ruler) : null;
        if (mutableScatterSetRemove != null) {
            notifyRulerValueChange(mutableScatterSetRemove);
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public final boolean isPlacingForAlignment$ui() {
        return this.isPlacingForAlignment;
    }

    public final boolean isShallowPlacing$ui() {
        return this.isShallowPlacing;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int i2, final int i3, final Map<AlignmentLine, Integer> map, final l<? super RulerScope, ab> lVar, final l<? super Placeable.PlacementScope, ab> lVar2) {
        if ((i2 & (-16777216)) != 0 || ((-16777216) & i3) != 0) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable.layout.1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return i3;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public l<RulerScope, ab> getRulers() {
                return lVar;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return i2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                lVar2.invoke(this.getPlacementScope());
            }
        };
    }

    public final void provideRelativeRulerValue(Ruler ruler, float f2) {
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        if (getLayoutDirection() != LayoutDirection.Ltr) {
            f2 = getWidth() - f2;
        }
        rulerTrackingMap.set(ruler, f2);
    }

    public final void provideRulerValue(Ruler ruler, float f2) {
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        rulerTrackingMap.set(ruler, f2);
    }

    public abstract void replace$ui();

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
        return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
        return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
    }

    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    public final void setPlacingForAlignment$ui(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public final void setShallowPlacing$ui(boolean z) {
        this.isShallowPlacing = z;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
        return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
        return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
        return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
        return Density.CC.m11133$default$toPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo2127toPx0680j_4(float f2) {
        return Density.CC.m11134$default$toPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return Density.CC.$default$toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
        return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
        return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
        return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z) {
        LookaheadCapablePlaceable parent = getParent();
        LayoutNode layoutNode = parent != null ? parent.getLayoutNode() : null;
        if (x.n(layoutNode, getLayoutNode())) {
            setPlacedUnderMotionFrameOfReference(z);
            return;
        }
        if ((layoutNode != null ? layoutNode.getLayoutState$ui() : null) != LayoutNode.LayoutState.LayingOut) {
            if ((layoutNode != null ? layoutNode.getLayoutState$ui() : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        setPlacedUnderMotionFrameOfReference(z);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    final class ResettableRulerScope implements RulerScope {
        private boolean coordinatesAccessed;
        private long positionOnScreen = IntOffset.Companion.m11306getMaxnOccac();
        private long size = IntSize.Companion.m11344getZeroYbymL2g();

        public ResettableRulerScope() {
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public LayoutCoordinates getCoordinates() {
            this.coordinatesAccessed = true;
            LayoutCoordinates coordinates = LookaheadCapablePlaceable.this.getCoordinates();
            if (IntOffset.m11295equalsimpl0(this.positionOnScreen, IntOffset.Companion.m11306getMaxnOccac())) {
                this.positionOnScreen = IntOffsetKt.m11313roundk4lQ0M(LayoutCoordinatesKt.positionOnScreen(coordinates));
                this.size = coordinates.mo9743getSizeYbymL2g();
            }
            LookaheadCapablePlaceable.this.getLayoutNode().getLayoutDelegate$ui().onCoordinatesUsed();
            return coordinates;
        }

        public final boolean getCoordinatesAccessed() {
            return this.coordinatesAccessed;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return LookaheadCapablePlaceable.this.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return LookaheadCapablePlaceable.this.getFontScale();
        }

        /* renamed from: getPositionOnScreen-nOcc-ac, reason: not valid java name */
        public final long m9996getPositionOnScreennOccac() {
            return this.positionOnScreen;
        }

        /* renamed from: getSize-YbymL2g, reason: not valid java name */
        public final long m9997getSizeYbymL2g() {
            return this.size;
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public void provides(Ruler ruler, float f2) {
            LookaheadCapablePlaceable.this.provideRulerValue(ruler, f2);
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public void providesRelative(VerticalRuler verticalRuler, float f2) {
            LookaheadCapablePlaceable.this.provideRelativeRulerValue(verticalRuler, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
        }

        public final void setCoordinatesAccessed(boolean z) {
            this.coordinatesAccessed = z;
        }

        /* renamed from: setPositionOnScreen--gyyYBs, reason: not valid java name */
        public final void m9998setPositionOnScreengyyYBs(long j2) {
            this.positionOnScreen = j2;
        }

        /* renamed from: setSize-ozmzZPI, reason: not valid java name */
        public final void m9999setSizeozmzZPI(long j2) {
            this.size = j2;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo2127toPx0680j_4(float f2) {
            return Density.CC.m11134$default$toPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return Density.CC.$default$toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
        }
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
        return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
        return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public /* synthetic */ MeasureResult layout(int i2, int i3, Map map, l lVar) {
        return MeasureScope.CC.$default$layout(this, i2, i3, map, lVar);
    }
}
