package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;
import h.k.n;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private p<? super Canvas, ? super GraphicsLayer, ab> _drawBlock;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private Canvas drawBlockCanvas;
    private GraphicsLayer drawBlockParentLayer;
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastClip;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private l<? super GraphicsLayerScope, ab> layerBlock;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private MutableObjectIntMap<AlignmentLine> oldAlignmentLines;
    private boolean released;
    private boolean wasLayerBlockInvoked;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;
    public static final Companion Companion = new Companion(null);
    private static final l<NodeCoordinator, ab> onCommitAffectingLayerParams = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;
    private static final l<NodeCoordinator, ab> onCommitAffectingLayer = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m8492constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo, reason: not valid java name */
        public void mo10062childHitTestqzLsGqo(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z) {
            layoutNode.m9977hitTest6fMxITs$ui(j2, hitTestResult, i2, z);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo10063entityTypeOLwlOKw() {
            return 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet$ui() & 16) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui = node.getDelegate$ui();
                    int i2 = 0;
                    node = node;
                    while (delegate$ui != null) {
                        if ((delegate$ui.getKindSet$ui() & 16) != 0) {
                            i2++;
                            if (i2 == 1) {
                                node = delegate$ui;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.add(node);
                                }
                                mutableVector.add(delegate$ui);
                                node = 0;
                            }
                        }
                        delegate$ui = delegate$ui.getChild$ui();
                        node = node;
                    }
                    if (i2 != 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode) {
            if (!layoutNode.getOuterCoordinator$ui().shouldSharePointerInputWithSiblings()) {
                return false;
            }
            hitTestResult.acceptHits();
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public /* synthetic */ boolean shouldHitTest(Modifier.Node node) {
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            return true;
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo */
        public void mo10062childHitTestqzLsGqo(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z) {
            layoutNode.m9978hitTestSemantics6fMxITs$ui(j2, hitTestResult, i2, z);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo10063entityTypeOLwlOKw() {
            return 8;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTest(Modifier.Node node) {
            if (ComposeUiFlags.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                return SemanticsOwnerKt.isImportantForAccessibility(SemanticsNodeKt.SemanticsNode(DelegatableNodeKt.requireLayoutNode(node), false));
            }
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
            return semanticsConfiguration == null || !semanticsConfiguration.isClearingSemantics();
        }
    };
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.Companion.m11307getZeronOccac();
    private Shape lastShape = RectangleShapeKt.getRectangleShape();
    private final a<ab> invalidateParentLayer = new NodeCoordinator$invalidateParentLayer$1(this);

    /* compiled from: WazeSource */
    public interface HitTestSource {

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.ui.node.NodeCoordinator$HitTestSource$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$shouldHitTest(HitTestSource hitTestSource, Modifier.Node node) {
                return true;
            }
        }

        /* renamed from: childHitTest-qzLsGqo */
        void mo10062childHitTestqzLsGqo(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z);

        /* renamed from: entityType-OLwlOKw */
        int mo10063entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode);

        boolean shouldHitTest(Modifier.Node node);

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z);
        }
        fromParentRect(mutableRect, z);
    }

    /* renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m10034ancestorToLocalS_NoaFU(NodeCoordinator nodeCoordinator, long j2, boolean z) {
        if (nodeCoordinator == this) {
            return j2;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        return (nodeCoordinator2 == null || x.n(nodeCoordinator, nodeCoordinator2)) ? m10050fromParentPosition8S9VItk(j2, z) : m10050fromParentPosition8S9VItk(nodeCoordinator2.m10034ancestorToLocalS_NoaFU(nodeCoordinator, j2, z), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node nodeM10053headH91voCI = m10053headH91voCI(4);
        if (nodeM10053headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
        } else {
            getLayoutNode().getMDrawScope$ui().m9988draweZhPAX0$ui(canvas, IntSizeKt.m11351toSizeozmzZPI(mo9743getSizeYbymL2g()), this, nodeM10053headH91voCI, graphicsLayer);
        }
    }

    /* renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m10035fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j2, boolean z, int i2, Object obj) {
        if (obj == null) {
            return nodeCoordinator.m10050fromParentPosition8S9VItk(j2, z | (!((i2 & 2) == 0)));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z) {
        float fM11296getXimpl = IntOffset.m11296getXimpl(mo9995getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - fM11296getXimpl);
        mutableRect.setRight(mutableRect.getRight() - fM11296getXimpl);
        float fM11297getYimpl = IntOffset.m11297getYimpl(mo9995getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - fM11297getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - fM11297getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z) {
                mutableRect.intersect(0.0f, 0.0f, (int) (mo9743getSizeYbymL2g() >> 32), (int) (mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                mutableRect.isEmpty();
            }
        }
    }

    private final p<Canvas, GraphicsLayer, ab> getDrawBlock() {
        p pVar = this._drawBlock;
        if (pVar != null) {
            return pVar;
        }
        NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = new NodeCoordinator$drawBlock$1(this, new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this));
        this._drawBlock = nodeCoordinator$drawBlock$1;
        return nodeCoordinator$drawBlock$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m10036hasNodeH91voCI(int i2) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(i2));
        return nodeHeadNode != null && DelegatableNodeKt.m9919has64DMado(nodeHeadNode, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean z) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui() == this) {
            return getLayoutNode().getNodes$ui().getHead$ui();
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (!z) {
            if (nodeCoordinator == null) {
                return null;
            }
            return nodeCoordinator.getTail();
        }
        if (nodeCoordinator == null || (tail = nodeCoordinator.getTail()) == null) {
            return null;
        }
        return tail.getChild$ui();
    }

    /* renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m10037hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z) {
        if (node == null) {
            mo9967hitTestChildqzLsGqo(hitTestSource, j2, hitTestResult, i2, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m10037hit5ShdDok(NodeCoordinatorKt.m10065nextUntilhw7D004(node, hitTestSource.mo10063entityTypeOLwlOKw(), 2), hitTestSource, j2, hitTestResult, i2, z);
            return;
        }
        int i3 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(-1.0f, z, false));
        m10037hit5ShdDok(NodeCoordinatorKt.m10065nextUntilhw7D004(node, hitTestSource.mo10063entityTypeOLwlOKw(), 2), hitTestSource, j2, hitTestResult, i2, z);
        hitTestResult.hitDepth = i3;
    }

    /* renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m10038hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z, float f2) {
        if (node == null) {
            mo9967hitTestChildqzLsGqo(hitTestSource, j2, hitTestResult, i2, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m10038hitNearFh5PU_I(NodeCoordinatorKt.m10065nextUntilhw7D004(node, hitTestSource.mo10063entityTypeOLwlOKw(), 2), hitTestSource, j2, hitTestResult, i2, z, f2);
            return;
        }
        int i3 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f2, z, false));
        m10041outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m10065nextUntilhw7D004(node, hitTestSource.mo10063entityTypeOLwlOKw(), 2), hitTestSource, j2, hitTestResult, i2, z, f2, true);
        hitTestResult.hitDepth = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m10039isInExpandedTouchBoundsThDn1k(Modifier.Node node, long j2, int i2) {
        if (node == 0) {
            return false;
        }
        if (!PointerType.m9682equalsimpl0(i2, PointerType.Companion.m9688getStylusT8wyACA()) && !PointerType.m9682equalsimpl0(i2, PointerType.Companion.m9686getEraserT8wyACA())) {
            return false;
        }
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                long jMo1935getTouchBoundsExpansionRZrCHBk = ((PointerInputModifierNode) node).mo1935getTouchBoundsExpansionRZrCHBk();
                int i3 = (int) (j2 >> 32);
                if (Float.intBitsToFloat(i3) >= (-TouchBoundsExpansion.m10155computeLeftimpl$ui(jMo1935getTouchBoundsExpansionRZrCHBk, getLayoutDirection())) && Float.intBitsToFloat(i3) < getMeasuredWidth() + TouchBoundsExpansion.m10156computeRightimpl$ui(jMo1935getTouchBoundsExpansionRZrCHBk, getLayoutDirection())) {
                    int i4 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                    if (Float.intBitsToFloat(i4) >= (-TouchBoundsExpansion.m10163getTopimpl(jMo1935getTouchBoundsExpansionRZrCHBk)) && Float.intBitsToFloat(i4) < getMeasuredHeight() + TouchBoundsExpansion.m10160getBottomimpl(jMo1935getTouchBoundsExpansionRZrCHBk)) {
                        return true;
                    }
                }
                return false;
            }
            if ((node.getKindSet$ui() & 16) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = node.getDelegate$ui();
                int i5 = 0;
                node = node;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & 16) != 0) {
                        i5++;
                        if (i5 == 1) {
                            node = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                            }
                            mutableVector.add(delegate$ui);
                            node = 0;
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    node = node;
                }
                if (i5 != 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        return false;
    }

    /* renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m10040offsetFromEdgeMKHz9U(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - getMeasuredWidth());
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) < 0.0f ? -r6 : r6 - getMeasuredHeight())) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m10041outOfBoundsHit8NAm7pk(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z, float f2, boolean z2) {
        if (node == null) {
            mo9967hitTestChildqzLsGqo(hitTestSource, j2, hitTestResult, i2, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m10041outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m10065nextUntilhw7D004(node, hitTestSource.mo10063entityTypeOLwlOKw(), 2), hitTestSource, j2, hitTestResult, i2, z, f2, z2);
            return;
        }
        if (m10039isInExpandedTouchBoundsThDn1k(node, j2, i2)) {
            hitTestResult.hitExpandedTouchBounds(node, z, new NodeCoordinator$outOfBoundsHit$1(this, node, hitTestSource, j2, hitTestResult, i2, z, f2, z2));
        } else if (z2) {
            m10038hitNearFh5PU_I(node, hitTestSource, j2, hitTestResult, i2, z, f2);
        } else {
            m10043speculativeHitFh5PU_I(node, hitTestSource, j2, hitTestResult, i2, z, f2);
        }
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m10042placeSelfMLgxB_4(long j2, float f2, l<? super GraphicsLayerScope, ab> lVar, GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            if (lVar != null) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != graphicsLayer) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = graphicsLayer;
            }
            if (this.layer == null) {
                OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(getDrawBlock(), this.invalidateParentLayer, graphicsLayer);
                ownedLayerCreateLayer.mo10129resizeozmzZPI(m9808getMeasuredSizeYbymL2g());
                ownedLayerCreateLayer.mo10128movegyyYBs(j2);
                this.layer = ownedLayerCreateLayer;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, lVar, false, 2, null);
        }
        if (!IntOffset.m11295equalsimpl0(mo9995getPositionnOccac(), j2)) {
            LayoutNodeKt.requireOwner(getLayoutNode()).voteFrameRate(FrameRateCategory.Companion.m7657getHighNSsRyOo());
            m10058setPositiongyyYBs(j2);
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo10128movegyyYBs(j2);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            getLayoutNode().onCoordinatorRectChanged$ui(this);
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui = getLayoutNode().getOwner$ui();
            if (owner$ui != null) {
                owner$ui.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f2;
        if (this == getLayoutNode().getOuterCoordinator$ui()) {
            LayoutNodeKt.requireOwner(getLayoutNode()).getRectManager().recalculateRectIfDirty(getLayoutNode());
        }
        if (isPlacingForAlignment$ui()) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    public static /* synthetic */ void rectInParent$ui$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        nodeCoordinator.rectInParent$ui(mutableRect, z, z2 & ((i2 & 4) == 0));
    }

    /* renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m10043speculativeHitFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z, float f2) {
        if (node == null) {
            mo9967hitTestChildqzLsGqo(hitTestSource, j2, hitTestResult, i2, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m10043speculativeHitFh5PU_I(NodeCoordinatorKt.m10065nextUntilhw7D004(node, hitTestSource.mo10063entityTypeOLwlOKw(), 2), hitTestSource, j2, hitTestResult, i2, z, f2);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f2, z, new NodeCoordinator$speculativeHit$1(this, node, hitTestSource, j2, hitTestResult, i2, z, f2));
        } else {
            m10041outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m10065nextUntilhw7D004(node, hitTestSource.mo10063entityTypeOLwlOKw(), 2), hitTestSource, j2, hitTestResult, i2, z, f2, false);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        x.d(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m10044toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j2, boolean z, int i2, Object obj) {
        if (obj == null) {
            return nodeCoordinator.m10059toParentPosition8S9VItk(j2, z | (!((i2 & 2) == 0)));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
    }

    /* renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m10045transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (x.n(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null) {
            x.g();
        }
        nodeCoordinator2.m10045transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
        if (!IntOffset.m11295equalsimpl0(mo9995getPositionnOccac(), IntOffset.Companion.m11307getZeronOccac())) {
            float[] fArr2 = tmpMatrix;
            Matrix.m8501resetimpl(fArr2);
            Matrix.m8514translateimpl$default(fArr2, -IntOffset.m11296getXimpl(mo9995getPositionnOccac()), -IntOffset.m11297getYimpl(mo9995getPositionnOccac()), 0.0f, 4, null);
            Matrix.m8511timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo10125inverseTransform58bKbWc(fArr);
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m10046transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        while (!x.n(this, nodeCoordinator)) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo10130transform58bKbWc(fArr);
            }
            if (!IntOffset.m11295equalsimpl0(this.mo9995getPositionnOccac(), IntOffset.Companion.m11307getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m8501resetimpl(fArr2);
                Matrix.m8514translateimpl$default(fArr2, IntOffset.m11296getXimpl(r0), IntOffset.m11297getYimpl(r0), 0.0f, 4, null);
                Matrix.m8511timesAssign58bKbWc(fArr, fArr2);
            }
            this = this.wrappedBy;
            if (this == null) {
                x.g();
            }
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, l lVar, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        nodeCoordinator.updateLayerBlock(lVar, z & ((i2 & 2) == 0));
    }

    private final void updateLayerParameters(boolean z) {
        if (this.explicitLayer != null) {
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        l<? super GraphicsLayerScope, ab> lVar = this.layerBlock;
        if (ownedLayer == null) {
            if (lVar != null) {
                InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
                return;
            }
            return;
        }
        if (lVar == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("updateLayerParameters requires a non-null layerBlock");
            throw new e();
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        reusableGraphicsLayerScope.setGraphicsDensity$ui(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.setLayoutDirection$ui(getLayoutNode().getLayoutDirection());
        reusableGraphicsLayerScope.m8586setSizeuvyYCjk(IntSizeKt.m11351toSizeozmzZPI(mo9743getSizeYbymL2g()));
        OwnerSnapshotObserver snapshotObserver = getSnapshotObserver();
        l<NodeCoordinator, ab> lVar2 = onCommitAffectingLayerParams;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(lVar, this);
        snapshotObserver.observer.observeReads(this, lVar2, anonymousClass1);
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
        layerPositionalProperties2.copyFrom(layerPositionalProperties);
        layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
        ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
        boolean z2 = this.isClipping;
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        boolean zHasSameValuesAs = layerPositionalProperties2.hasSameValuesAs(layerPositionalProperties);
        if (z) {
            if (zHasSameValuesAs && z2 == this.isClipping) {
                return;
            }
            Owner owner$ui = getLayoutNode().getOwner$ui();
            if (owner$ui != null) {
                owner$ui.onLayoutChange(getLayoutNode());
            }
        }
        if (zHasSameValuesAs) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        layoutNode.onCoordinatorRectChanged$ui(this);
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            LayoutNodeKt.requireOwner(layoutNode).requestOnPositionedCallback(layoutNode);
        }
    }

    static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        nodeCoordinator.updateLayerParameters(1 == ((z ? 1 : 0) | (i2 & 1)));
    }

    /* renamed from: calculateMinimumTouchTargetOffset-C6jSQ5I, reason: not valid java name */
    protected final long m10047calculateMinimumTouchTargetOffsetC6jSQ5I(MutableRect mutableRect, long j2) {
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        if (mutableRect.getRight() < 0.0f || left > ((int) (mo9743getSizeYbymL2g() >> 32)) || mutableRect.getBottom() < 0.0f || top > ((int) (mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float right = (fIntBitsToFloat - (mutableRect.getRight() - mutableRect.getLeft())) / 2.0f;
        float fE = right > 0.0f ? left - right : n.e(left, (-fIntBitsToFloat) / 2.0f);
        return (Float.floatToRawIntBits(fE) << 32) | (Float.floatToRawIntBits((fIntBitsToFloat2 - (mutableRect.getBottom() - mutableRect.getTop())) / 2.0f > 0.0f ? top - r9 : n.e(top, (-fIntBitsToFloat2) / 2.0f)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    protected final long m10048calculateMinimumTouchTargetPaddingE7KxVPU(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - getMeasuredWidth();
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - getMeasuredHeight()) / 2.0f;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    protected final float m10049distanceInMinimumTouchTargettz77jQw(long j2, long j3) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (j3 >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM10048calculateMinimumTouchTargetPaddingE7KxVPU = m10048calculateMinimumTouchTargetPaddingE7KxVPU(j3);
        long j4 = jM10048calculateMinimumTouchTargetPaddingE7KxVPU >> 32;
        int i2 = (int) (jM10048calculateMinimumTouchTargetPaddingE7KxVPU & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) j4);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long jM10040offsetFromEdgeMKHz9U = m10040offsetFromEdgeMKHz9U(j2);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jM10040offsetFromEdgeMKHz9U >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jM10040offsetFromEdgeMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) <= fIntBitsToFloat2) {
            return Offset.m7979getDistanceSquaredimpl(jM10040offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float fM11296getXimpl = IntOffset.m11296getXimpl(mo9995getPositionnOccac());
        float fM11297getYimpl = IntOffset.m11297getYimpl(mo9995getPositionnOccac());
        canvas.translate(fM11296getXimpl, fM11297getYimpl);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-fM11296getXimpl, -fM11297getYimpl);
    }

    protected final void drawBorder(Canvas canvas, Paint paint) {
        canvas.drawRect(0.5f, 0.5f, ((int) (m9808getMeasuredSizeYbymL2g() >> 32)) - 0.5f, ((int) (m9808getMeasuredSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - 0.5f, paint);
    }

    public abstract void ensureLookaheadDelegateCreated();

    public final NodeCoordinator findCommonAncestor$ui(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            if (!tail2.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            Modifier.Node node = tail2.getNode();
            while (true) {
                node = node.getParent$ui();
                if (node == null) {
                    return this;
                }
                if ((node.getKindSet$ui() & 2) != 0 && node == tail) {
                    break;
                }
            }
        } else {
            while (layoutNode.getDepth$ui() > layoutNode2.getDepth$ui()) {
                layoutNode = layoutNode.getParent$ui();
                if (layoutNode == null) {
                    x.g();
                }
            }
            while (layoutNode2.getDepth$ui() > layoutNode.getDepth$ui()) {
                layoutNode2 = layoutNode2.getParent$ui();
                if (layoutNode2 == null) {
                    x.g();
                }
            }
            while (layoutNode != layoutNode2) {
                layoutNode = layoutNode.getParent$ui();
                layoutNode2 = layoutNode2.getParent$ui();
                if (layoutNode == null || layoutNode2 == null) {
                    throw new IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            if (layoutNode2 == getLayoutNode()) {
                return this;
            }
            if (layoutNode != nodeCoordinator.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui();
            }
        }
        return nodeCoordinator;
    }

    /* renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m10050fromParentPosition8S9VItk(long j2, boolean z) {
        if (z || !isPlacedUnderMotionFrameOfReference()) {
            j2 = IntOffsetKt.m11309minusNvtHpc(j2, mo9995getPositionnOccac());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo10127mapOffset8S9VItk(j2, true) : j2;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui().getAlignmentLinesOwner$ui();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    public final boolean getForceMeasureWithLookaheadConstraints$ui() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final boolean getForcePlaceWithLookaheadOffset$ui() {
        return this.forcePlaceWithLookaheadOffset;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return isPlacedUnderMotionFrameOfReference();
    }

    public final boolean getLastClip$ui() {
        return this.lastClip;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui, reason: not valid java name */
    public final long m10051getLastMeasurementConstraintsmsEJaDk$ui() {
        return m9809getMeasurementConstraintsmsEJaDk();
    }

    public final Shape getLastShape$ui() {
        return this.lastShape;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    protected final l<GraphicsLayerScope, ab> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError);
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m10052getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo2128toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo9982getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui();
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public Object getParentData() {
        if (!getLayoutNode().getNodes$ui().m10027hasH91voCI$ui(64)) {
            return null;
        }
        getTail();
        aq aqVar = new aq();
        for (Modifier.Node tail$ui = getLayoutNode().getNodes$ui().getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if ((tail$ui.getKindSet$ui() & 64) != 0) {
                MutableVector mutableVector = null;
                DelegatingNode delegatingNodePop = tail$ui;
                while (delegatingNodePop != 0) {
                    if (delegatingNodePop instanceof ParentDataModifierNode) {
                        aqVar.f48105a = ((ParentDataModifierNode) delegatingNodePop).modifyParentData(getLayoutNode().getDensity(), aqVar.f48105a);
                    } else if ((delegatingNodePop.getKindSet$ui() & 64) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                        int i2 = 0;
                        delegatingNodePop = delegatingNodePop;
                        while (delegate$ui != null) {
                            if ((delegate$ui.getKindSet$ui() & 64) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    delegatingNodePop = delegate$ui;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodePop != 0) {
                                        mutableVector.add(delegatingNodePop);
                                    }
                                    mutableVector.add(delegate$ui);
                                    delegatingNodePop = 0;
                                }
                            }
                            delegate$ui = delegate$ui.getChild$ui();
                            delegatingNodePop = delegatingNodePop;
                        }
                        if (i2 != 1) {
                        }
                    }
                    delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return aqVar.f48105a;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            StringBuilder sb = new StringBuilder(ExpectAttachedLayoutCoordinates);
            for (LayoutNode layoutNode = getLayoutNode(); layoutNode != null; layoutNode = layoutNode.getParent$ui()) {
                sb.append("\n|");
                sb.append(layoutNode);
                sb.append(" isAttached=");
                sb.append(layoutNode.isAttached());
                sb.append(" modifier=");
                sb.append(layoutNode.getModifier());
                sb.append(" tail=");
                sb.append(getTail());
            }
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        onCoordinatesUsed$ui();
        return getLayoutNode().getOuterCoordinator$ui().wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo9995getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        MutableScatterSet mutableScatterSetMutableScatterSetOf = null;
        while (this != null) {
            MeasureResult measureResult = this._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && !alignmentLines.isEmpty()) {
                if (mutableScatterSetMutableScatterSetOf == null) {
                    mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                }
                mutableScatterSetMutableScatterSetOf.addAll(alignmentLines.keySet());
            }
            this = this.wrapped;
        }
        return mutableScatterSetMutableScatterSetOf != null ? mutableScatterSetMutableScatterSetOf.asSet() : e.c.d.a.p();
    }

    protected final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo9743getSizeYbymL2g() {
        return m9808getMeasuredSizeYbymL2g();
    }

    public abstract Modifier.Node getTail();

    public final boolean getWasLayerBlockInvoked$ui() {
        return this.wasLayerBlockInvoked;
    }

    public final NodeCoordinator getWrapped$ui() {
        return this.wrapped;
    }

    public final NodeCoordinator getWrappedBy$ui() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m10053headH91voCI(int i2) {
        Modifier.Node parent$ui;
        boolean zM10076getIncludeSelfInTraversalH91voCI = NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(i2);
        if (zM10076getIncludeSelfInTraversalH91voCI) {
            parent$ui = getTail();
        } else {
            parent$ui = getTail().getParent$ui();
            if (parent$ui == null) {
                return null;
            }
        }
        for (Modifier.Node nodeHeadNode = headNode(zM10076getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & i2) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
            if ((nodeHeadNode.getKindSet$ui() & i2) != 0) {
                return nodeHeadNode;
            }
            if (nodeHeadNode == parent$ui) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m10054hitTestqzLsGqo(HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z) {
        NodeCoordinator nodeCoordinator;
        boolean z2;
        Modifier.Node nodeM10053headH91voCI = m10053headH91voCI(hitTestSource.mo10063entityTypeOLwlOKw());
        if (!m10061withinLayerBoundsk4lQ0M(j2)) {
            if (PointerType.m9682equalsimpl0(i2, PointerType.Companion.m9689getTouchT8wyACA())) {
                float fM10049distanceInMinimumTouchTargettz77jQw = m10049distanceInMinimumTouchTargettz77jQw(j2, m10052getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(fM10049distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.isHitInMinimumTouchTargetBetter(fM10049distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m10038hitNearFh5PU_I(nodeM10053headH91voCI, hitTestSource, j2, hitTestResult, i2, false, fM10049distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (nodeM10053headH91voCI == null) {
            mo9967hitTestChildqzLsGqo(hitTestSource, j2, hitTestResult, i2, z);
            return;
        }
        if (m10055isPointerInBoundsk4lQ0M(j2)) {
            m10037hit5ShdDok(nodeM10053headH91voCI, hitTestSource, j2, hitTestResult, i2, z);
            return;
        }
        float fM10049distanceInMinimumTouchTargettz77jQw2 = !PointerType.m9682equalsimpl0(i2, PointerType.Companion.m9689getTouchT8wyACA()) ? Float.POSITIVE_INFINITY : m10049distanceInMinimumTouchTargettz77jQw(j2, m10052getMinimumTouchTargetSizeNHjbRc());
        if ((Float.floatToRawIntBits(fM10049distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040) {
            z2 = z;
            z = hitTestResult.isHitInMinimumTouchTargetBetter(fM10049distanceInMinimumTouchTargettz77jQw2, z2);
            nodeCoordinator = this;
        } else {
            nodeCoordinator = this;
            z2 = z;
        }
        nodeCoordinator.m10041outOfBoundsHit8NAm7pk(nodeM10053headH91voCI, hitTestSource, j2, hitTestResult, i2, z2, fM10049distanceInMinimumTouchTargettz77jQw2, z);
    }

    /* renamed from: hitTestChild-qzLsGqo */
    public void mo9967hitTestChildqzLsGqo(HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m10054hitTestqzLsGqo(hitTestSource, m10035fromParentPosition8S9VItk$default(nodeCoordinator, j2, false, 2, null), hitTestResult, i2, z);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    /* renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m10055isPointerInBoundsk4lQ0M(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) getMeasuredWidth()) && fIntBitsToFloat2 < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!layoutCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + layoutCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight((int) (layoutCoordinates.mo9743getSizeYbymL2g() >> 32));
        rectCache.setBottom((int) (layoutCoordinates.mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        NodeCoordinator nodeCoordinator = coordinator;
        while (nodeCoordinator != nodeCoordinatorFindCommonAncestor$ui) {
            boolean z2 = z;
            rectInParent$ui$default(nodeCoordinator, rectCache, z2, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            if (nodeCoordinator == null) {
                x.g();
            }
            z = z2;
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui, rectCache, z);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo9744localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j2) {
        return mo9745localPositionOfS_NoaFU(layoutCoordinates, j2, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo9745localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j2, boolean z) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadLayoutCoordinates lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) layoutCoordinates;
            lookaheadLayoutCoordinates.getCoordinator().onCoordinatesUsed$ui();
            return lookaheadLayoutCoordinates.mo9745localPositionOfS_NoaFU(this, j2 ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui) {
            j2 = coordinator.m10059toParentPosition8S9VItk(j2, z);
            coordinator = coordinator.wrappedBy;
            if (coordinator == null) {
                x.g();
            }
        }
        return m10034ancestorToLocalS_NoaFU(nodeCoordinatorFindCommonAncestor$ui, j2, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo9746localToRootMKHz9U(long j2) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui();
        long jM10044toParentPosition8S9VItk$default = j2;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                long jM10339getOffsetFromRectListForBjo55l4 = LayoutNodeKt.requireOwner(layoutNode).getRectManager().m10339getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m11295equalsimpl0(jM10339getOffsetFromRectListForBjo55l4, IntOffset.Companion.m11306getMaxnOccac())) {
                    return IntOffsetKt.m11311plusNvtHpc(jM10044toParentPosition8S9VItk$default, jM10339getOffsetFromRectListForBjo55l4);
                }
            }
            jM10044toParentPosition8S9VItk$default = m10044toParentPosition8S9VItk$default(nodeCoordinator, jM10044toParentPosition8S9VItk$default, false, 2, null);
        }
        return jM10044toParentPosition8S9VItk$default;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo9747localToScreenMKHz9U(long j2) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo9691localToScreenMKHz9U(mo9746localToRootMKHz9U(j2));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo9748localToWindowMKHz9U(long j2) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo10132calculatePositionInWindowMKHz9U(mo9746localToRootMKHz9U(j2));
    }

    public final void onCoordinatesUsed$ui() {
        getLayoutNode().getLayoutDelegate$ui().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeDetach() {
        releaseLayer();
        if (getLayoutNode().isPlaced()) {
            onUnplaced();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasureResultChanged(int r10, int r11) {
        /*
            r9 = this;
            long r0 = (long) r10
            long r10 = (long) r11
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r2
            androidx.compose.ui.node.OwnedLayer r2 = r9.layer
            long r10 = r10 | r0
            if (r2 == 0) goto L14
            r2.mo10129resizeozmzZPI(r10)
            goto L25
        L14:
            androidx.compose.ui.node.LayoutNode r0 = r9.getLayoutNode()
            boolean r0 = r0.isPlaced()
            if (r0 == 0) goto L25
            androidx.compose.ui.node.NodeCoordinator r0 = r9.wrappedBy
            if (r0 == 0) goto L25
            r0.invalidateLayer()
        L25:
            r9.m9811setMeasuredSizeozmzZPI(r10)
            h.g.a.l<? super androidx.compose.ui.graphics.GraphicsLayerScope, h.ab> r10 = r9.layerBlock
            r11 = 0
            if (r10 == 0) goto L30
            r9.updateLayerParameters(r11)
        L30:
            r10 = 4
            boolean r0 = androidx.compose.ui.node.NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(r10)
            if (r0 == 0) goto L3c
            androidx.compose.ui.Modifier$Node r1 = r9.getTail()
            goto L48
        L3c:
            androidx.compose.ui.Modifier$Node r1 = r9.getTail()
            androidx.compose.ui.Modifier$Node r1 = r1.getParent$ui()
            if (r1 != 0) goto L48
            goto Lb5
        L48:
            androidx.compose.ui.Modifier$Node r0 = access$headNode(r9, r0)
        L4c:
            if (r0 == 0) goto Lb5
            int r2 = r0.getAggregateChildKindSet$ui()
            r2 = r2 & r10
            if (r2 == 0) goto Lb5
            int r2 = r0.getKindSet$ui()
            r2 = r2 & r10
            if (r2 == 0) goto Lae
            r2 = 0
            r3 = r0
            r4 = r2
        L5f:
            if (r3 == 0) goto Lae
            boolean r5 = r3 instanceof androidx.compose.ui.node.DrawModifierNode
            if (r5 == 0) goto L6b
            androidx.compose.ui.node.DrawModifierNode r3 = (androidx.compose.ui.node.DrawModifierNode) r3
            r3.onMeasureResultChanged()
            goto La9
        L6b:
            int r5 = r3.getKindSet$ui()
            r5 = r5 & r10
            if (r5 == 0) goto La9
            boolean r5 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto La9
            r5 = r3
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.getDelegate$ui()
            r6 = r11
        L7e:
            r7 = 1
            if (r5 == 0) goto La7
            int r8 = r5.getKindSet$ui()
            r8 = r8 & r10
            if (r8 == 0) goto La2
            int r6 = r6 + 1
            if (r6 != r7) goto L8e
            r3 = r5
            goto La2
        L8e:
            if (r4 != 0) goto L99
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            r7 = 16
            androidx.compose.ui.Modifier$Node[] r7 = new androidx.compose.ui.Modifier.Node[r7]
            r4.<init>(r7, r11)
        L99:
            if (r3 == 0) goto L9e
            r4.add(r3)
        L9e:
            r4.add(r5)
            r3 = r2
        La2:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild$ui()
            goto L7e
        La7:
            if (r6 == r7) goto L5f
        La9:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r4)
            goto L5f
        Lae:
            if (r0 == r1) goto Lb5
            androidx.compose.ui.Modifier$Node r0 = r0.getChild$ui()
            goto L4c
        Lb5:
            androidx.compose.ui.node.LayoutNode r10 = r9.getLayoutNode()
            androidx.compose.ui.node.Owner r10 = r10.getOwner$ui()
            if (r10 == 0) goto Lc6
            androidx.compose.ui.node.LayoutNode r11 = r9.getLayoutNode()
            r10.onLayoutChange(r11)
        Lc6:
            androidx.compose.ui.node.LayoutNode r10 = r9.getLayoutNode()
            r10.onCoordinatorRectChanged$ui(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.onMeasureResultChanged(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public final void onMeasured() {
        Modifier.Node parent$ui;
        if (m10036hasNodeH91voCI(128)) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                boolean zM10076getIncludeSelfInTraversalH91voCI = NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(128);
                if (!zM10076getIncludeSelfInTraversalH91voCI) {
                    parent$ui = getTail().getParent$ui();
                    if (parent$ui == null) {
                    }
                }
                parent$ui = getTail();
                for (Modifier.Node nodeHeadNode = headNode(zM10076getIncludeSelfInTraversalH91voCI); nodeHeadNode != null; nodeHeadNode = nodeHeadNode.getChild$ui()) {
                    if ((nodeHeadNode.getAggregateChildKindSet$ui() & 128) == 0) {
                        break;
                    }
                    if ((nodeHeadNode.getKindSet$ui() & 128) != 0) {
                        MutableVector mutableVector = null;
                        DelegatingNode delegatingNodePop = nodeHeadNode;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof MeasuredSizeAwareModifierNode) {
                                ((MeasuredSizeAwareModifierNode) delegatingNodePop).mo2116onRemeasuredozmzZPI(m9808getMeasuredSizeYbymL2g());
                            } else if ((delegatingNodePop.getKindSet$ui() & 128) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                                int i2 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & 128) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            delegatingNodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector.add(delegatingNodePop);
                                            }
                                            mutableVector.add(delegate$ui);
                                            delegatingNodePop = 0;
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i2 != 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (nodeHeadNode == parent$ui) {
                        break;
                    }
                }
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void onPlaced() {
        Modifier.Node parent$ui;
        boolean zM10076getIncludeSelfInTraversalH91voCI = NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(4194304);
        if (zM10076getIncludeSelfInTraversalH91voCI) {
            parent$ui = getTail();
        } else {
            parent$ui = getTail().getParent$ui();
            if (parent$ui == null) {
                return;
            }
        }
        for (Modifier.Node nodeHeadNode = headNode(zM10076getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & 4194304) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
            if ((nodeHeadNode.getKindSet$ui() & 4194304) != 0) {
                DelegatingNode delegatingNodePop = nodeHeadNode;
                MutableVector mutableVector = null;
                while (delegatingNodePop != 0) {
                    if (delegatingNodePop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNodePop).onPlaced(this);
                    } else if ((delegatingNodePop.getKindSet$ui() & 4194304) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                        int i2 = 0;
                        delegatingNodePop = delegatingNodePop;
                        while (delegate$ui != null) {
                            if ((delegate$ui.getKindSet$ui() & 4194304) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    delegatingNodePop = delegate$ui;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodePop != 0) {
                                        mutableVector.add(delegatingNodePop);
                                    }
                                    mutableVector.add(delegate$ui);
                                    delegatingNodePop = 0;
                                }
                            }
                            delegate$ui = delegate$ui.getChild$ui();
                            delegatingNodePop = delegatingNodePop;
                        }
                        if (i2 != 1) {
                        }
                    }
                    delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (nodeHeadNode == parent$ui) {
                return;
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
        if (IntOffset.m11295equalsimpl0(mo9995getPositionnOccac(), IntOffset.Companion.m11307getZeronOccac())) {
            return;
        }
        getLayoutNode().onCoordinatorRectChanged$ui(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void onUnplaced() {
        Modifier.Node parent$ui;
        if (m10036hasNodeH91voCI(1048576)) {
            boolean zM10076getIncludeSelfInTraversalH91voCI = NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(1048576);
            if (zM10076getIncludeSelfInTraversalH91voCI) {
                parent$ui = getTail();
            } else {
                parent$ui = getTail().getParent$ui();
                if (parent$ui == null) {
                    return;
                }
            }
            for (Modifier.Node nodeHeadNode = headNode(zM10076getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & 1048576) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
                if ((nodeHeadNode.getKindSet$ui() & 1048576) != 0) {
                    DelegatingNode delegatingNodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof UnplacedAwareModifierNode) {
                            ((UnplacedAwareModifierNode) delegatingNodePop).onUnplaced();
                        } else if ((delegatingNodePop.getKindSet$ui() & 1048576) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                            int i2 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & 1048576) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        delegatingNodePop = delegate$ui;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                        }
                                        mutableVector.add(delegate$ui);
                                        delegatingNodePop = 0;
                                    }
                                }
                                delegate$ui = delegate$ui.getChild$ui();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i2 != 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == parent$ui) {
                    return;
                }
            }
        }
    }

    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas, graphicsLayer);
        }
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    protected final Placeable m10056performingMeasureK40F9xA(long j2, a<? extends Placeable> aVar) {
        m9812setMeasurementConstraintsBRTryo0(j2);
        return aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo9810placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) {
        if (!this.forcePlaceWithLookaheadOffset) {
            m10042placeSelfMLgxB_4(j2, f2, null, graphicsLayer);
            return;
        }
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            x.g();
        }
        m10042placeSelfMLgxB_4(lookaheadDelegate.mo9995getPositionnOccac(), f2, null, graphicsLayer);
    }

    /* renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m10057placeSelfApparentToRealOffsetMLgxB_4(long j2, float f2, l<? super GraphicsLayerScope, ab> lVar, GraphicsLayer graphicsLayer) {
        m10042placeSelfMLgxB_4(IntOffset.m11300plusqkQi6aY(j2, m9807getApparentToRealOffsetnOccac()), f2, lVar, graphicsLayer);
    }

    public final void rectInParent$ui(MutableRect mutableRect, boolean z, boolean z2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z2) {
                    long jM10052getMinimumTouchTargetSizeNHjbRc = m10052getMinimumTouchTargetSizeNHjbRc();
                    long jM10047calculateMinimumTouchTargetOffsetC6jSQ5I = m10047calculateMinimumTouchTargetOffsetC6jSQ5I(mutableRect, jM10052getMinimumTouchTargetSizeNHjbRc);
                    long j2 = jM10047calculateMinimumTouchTargetOffsetC6jSQ5I >> 32;
                    int i2 = (int) (jM10047calculateMinimumTouchTargetOffsetC6jSQ5I & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) j2);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                    long jMo9743getSizeYbymL2g = mo9743getSizeYbymL2g();
                    long j3 = jMo9743getSizeYbymL2g >> 32;
                    long j4 = jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                    int i3 = (int) (jM10052getMinimumTouchTargetSizeNHjbRc >> 32);
                    float f2 = (int) j3;
                    float fMin = Math.min(Float.intBitsToFloat(i3) + f2, Math.max(f2, Float.intBitsToFloat(i3) + fIntBitsToFloat));
                    int i4 = (int) (jM10052getMinimumTouchTargetSizeNHjbRc & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                    float f3 = (int) j4;
                    mutableRect.intersect(fIntBitsToFloat, fIntBitsToFloat2, fMin, Math.min(Float.intBitsToFloat(i4) + f3, Math.max(f3, Float.intBitsToFloat(i4) + fIntBitsToFloat2)));
                } else if (z) {
                    mutableRect.intersect(0.0f, 0.0f, (int) (mo9743getSizeYbymL2g() >> 32), (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & mo9743getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float fM11296getXimpl = IntOffset.m11296getXimpl(mo9995getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + fM11296getXimpl);
        mutableRect.setRight(mutableRect.getRight() + fM11296getXimpl);
        float fM11297getYimpl = IntOffset.m11297getYimpl(mo9995getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + fM11297getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() + fM11297getYimpl);
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui$default(getLayoutNode(), false, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo9810placeAtf8xVGno(mo9995getPositionnOccac(), this.zIndex, graphicsLayer);
        } else {
            mo9742placeAtf8xVGno(mo9995getPositionnOccac(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo9749screenToLocalMKHz9U(long j2) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return mo9744localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo9692screenToLocalMKHz9U(j2));
    }

    public final void setForceMeasureWithLookaheadConstraints$ui(boolean z) {
        this.forceMeasureWithLookaheadConstraints = z;
    }

    public final void setForcePlaceWithLookaheadOffset$ui(boolean z) {
        this.forcePlaceWithLookaheadOffset = z;
    }

    public final void setLastClip$ui(boolean z) {
        this.lastClip = z;
    }

    public final void setLastShape$ui(Shape shape) {
        this.lastShape = shape;
    }

    protected abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    public void setMeasureResult$ui(MeasureResult measureResult) {
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            MutableObjectIntMap<AlignmentLine> mutableObjectIntMap = this.oldAlignmentLines;
            if (((mutableObjectIntMap == null || !mutableObjectIntMap.isNotEmpty()) && measureResult.getAlignmentLines().isEmpty()) || NodeCoordinatorKt.compareEquals(this.oldAlignmentLines, measureResult.getAlignmentLines())) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            MutableObjectIntMap<AlignmentLine> mutableObjectIntMapMutableObjectIntMapOf = this.oldAlignmentLines;
            if (mutableObjectIntMapMutableObjectIntMapOf == null) {
                mutableObjectIntMapMutableObjectIntMapOf = ObjectIntMapKt.mutableObjectIntMapOf();
                this.oldAlignmentLines = mutableObjectIntMapMutableObjectIntMapOf;
            }
            mutableObjectIntMapMutableObjectIntMapOf.clear();
            for (Map.Entry<AlignmentLine, Integer> entry : measureResult.getAlignmentLines().entrySet()) {
                mutableObjectIntMapMutableObjectIntMapOf.set(entry.getKey(), entry.getValue().intValue());
            }
        }
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    protected void m10058setPositiongyyYBs(long j2) {
        this.position = j2;
    }

    public final void setWasLayerBlockInvoked$ui(boolean z) {
        this.wasLayerBlockInvoked = z;
    }

    public final void setWrapped$ui(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    protected final void setZIndex(float f2) {
        this.zIndex = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(16));
        if (nodeHeadNode != null && nodeHeadNode.isAttached()) {
            Modifier.Node node = nodeHeadNode;
            if (!node.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node2 = node.getNode();
            if ((node2.getAggregateChildKindSet$ui() & 16) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 16) != 0) {
                        DelegatingNode delegatingNodePop = node2;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) delegatingNodePop).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else if ((delegatingNodePop.getKindSet$ui() & 16) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                                int i2 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & 16) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            delegatingNodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector.add(delegatingNodePop);
                                            }
                                            mutableVector.add(delegate$ui);
                                            delegatingNodePop = 0;
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i2 != 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node2 = node2.getChild$ui();
                }
            }
        }
        return false;
    }

    /* renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m10059toParentPosition8S9VItk(long j2, boolean z) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j2 = ownedLayer.mo10127mapOffset8S9VItk(j2, false);
        }
        return (z || !isPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m11311plusNvtHpc(j2, mo9995getPositionnOccac()) : j2;
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM10048calculateMinimumTouchTargetPaddingE7KxVPU = m10048calculateMinimumTouchTargetPaddingE7KxVPU(m10052getMinimumTouchTargetSizeNHjbRc());
        int i2 = (int) (jM10048calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
        rectCache.setLeft(-Float.intBitsToFloat(i2));
        int i3 = (int) (jM10048calculateMinimumTouchTargetPaddingE7KxVPU & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        rectCache.setTop(-Float.intBitsToFloat(i3));
        rectCache.setRight(getMeasuredWidth() + Float.intBitsToFloat(i2));
        rectCache.setBottom(getMeasuredHeight() + Float.intBitsToFloat(i3));
        while (this != layoutCoordinatesFindRootCoordinates) {
            this.rectInParent$ui(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            this = this.wrappedBy;
            if (this == null) {
                x.g();
            }
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo9750transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        Matrix.m8501resetimpl(fArr);
        coordinator.m10046transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui, fArr);
        m10045transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo9751transformToScreen58bKbWc(float[] fArr) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator coordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m10046transformToAncestorEL8BTi8(coordinator, fArr);
        if (ownerRequireOwner instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) ownerRequireOwner).mo9514localToScreen58bKbWc(fArr);
            return;
        }
        long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(coordinator);
        if ((9223372034707292159L & jPositionOnScreen) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            Matrix.m8513translateimpl(fArr, Float.intBitsToFloat((int) (jPositionOnScreen >> 32)), Float.intBitsToFloat((int) (jPositionOnScreen & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 0.0f);
        }
    }

    public final void updateLayerBlock(l<? super GraphicsLayerScope, ab> lVar, boolean z) {
        Owner owner$ui;
        if (lVar != null && this.explicitLayer != null) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z2 = (!z && this.layerBlock == lVar && x.n(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && lVar != null) {
            this.layerBlock = lVar;
            if (this.layer != null) {
                if (z2) {
                    updateLayerParameters$default(this, false, 1, null);
                    return;
                }
                return;
            }
            OwnedLayer ownedLayerCreateLayer$default = Owner.CC.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, 4, null);
            ownedLayerCreateLayer$default.mo10129resizeozmzZPI(m9808getMeasuredSizeYbymL2g());
            ownedLayerCreateLayer$default.mo10128movegyyYBs(mo9995getPositionnOccac());
            this.layer = ownedLayerCreateLayer$default;
            updateLayerParameters$default(this, false, 1, null);
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            return;
        }
        this.layerBlock = null;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (!MatrixKt.m8517isIdentity58bKbWc(ownedLayer.mo10124getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.onCoordinatorRectChanged$ui(this);
            }
            ownedLayer.destroy();
            this.layer = null;
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && layoutNode.isPlaced() && (owner$ui = layoutNode.getOwner$ui()) != null) {
                owner$ui.onLayoutChange(layoutNode);
            }
        }
        this.lastLayerDrawingWasSkipped = false;
    }

    public final void visitNodes(int i2, boolean z, l<? super Modifier.Node, ab> lVar) {
        Modifier.Node tail = getTail();
        if (!z && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(z); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & i2) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
            if ((nodeHeadNode.getKindSet$ui() & i2) != 0) {
                lVar.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m10060visitNodesaLcG6gQ(int i2, l<? super T, ab> lVar) {
        Modifier.Node parent$ui;
        boolean zM10076getIncludeSelfInTraversalH91voCI = NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(i2);
        if (zM10076getIncludeSelfInTraversalH91voCI) {
            parent$ui = getTail();
        } else {
            parent$ui = getTail().getParent$ui();
            if (parent$ui == null) {
                return;
            }
        }
        for (Modifier.Node nodeHeadNode = headNode(zM10076getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & i2) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
            if ((nodeHeadNode.getKindSet$ui() & i2) != 0) {
                for (Modifier.Node nodePop = nodeHeadNode; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                    x.i();
                    lVar.invoke(nodePop);
                }
            }
            if (nodeHeadNode == parent$ui) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo9752windowToLocalMKHz9U(long j2) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo9744localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m7984minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo10131calculateLocalPositionMKHz9U(j2), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    protected final void withPositionTranslation(Canvas canvas, l<? super Canvas, ab> lVar) {
        float fM11296getXimpl = IntOffset.m11296getXimpl(mo9995getPositionnOccac());
        float fM11297getYimpl = IntOffset.m11297getYimpl(mo9995getPositionnOccac());
        canvas.translate(fM11296getXimpl, fM11297getYimpl);
        lVar.invoke(canvas);
        canvas.translate(-fM11296getXimpl, -fM11297getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m10061withinLayerBoundsk4lQ0M(long j2) {
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (j2 & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo10126isInLayerk4lQ0M(j2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo9742placeAtf8xVGno(long j2, float f2, l<? super GraphicsLayerScope, ab> lVar) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                x.g();
            }
            m10042placeSelfMLgxB_4(lookaheadDelegate.mo9995getPositionnOccac(), f2, lVar, null);
            return;
        }
        m10042placeSelfMLgxB_4(j2, f2, lVar, null);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<ab> {
        final /* synthetic */ l<GraphicsLayerScope, ab> $layerBlock;
        final /* synthetic */ NodeCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super GraphicsLayerScope, ab> lVar, NodeCoordinator nodeCoordinator) {
            super(0);
            this.$layerBlock = lVar;
            this.this$0 = nodeCoordinator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$layerBlock.invoke(NodeCoordinator.graphicsLayerScope);
            boolean zN = x.n(this.this$0.getLastShape$ui(), NodeCoordinator.graphicsLayerScope.getShape());
            boolean z = this.this$0.getLastClip$ui() != NodeCoordinator.graphicsLayerScope.getClip();
            if (!zN) {
                this.this$0.setLastShape$ui(NodeCoordinator.graphicsLayerScope.getShape());
                this.this$0.setLastClip$ui(NodeCoordinator.graphicsLayerScope.getClip());
                if (this.this$0.getWasLayerBlockInvoked$ui() && (z || this.this$0.getLastClip$ui())) {
                    this.this$0.getLayoutNode().invalidateSemantics$ui();
                }
            } else if (z) {
                z = true;
                this.this$0.setLastShape$ui(NodeCoordinator.graphicsLayerScope.getShape());
                this.this$0.setLastClip$ui(NodeCoordinator.graphicsLayerScope.getClip());
                if (this.this$0.getWasLayerBlockInvoked$ui()) {
                    this.this$0.getLayoutNode().invalidateSemantics$ui();
                }
            }
            this.this$0.setWasLayerBlockInvoked$ui(true);
            NodeCoordinator.graphicsLayerScope.updateOutline$ui();
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }
}
