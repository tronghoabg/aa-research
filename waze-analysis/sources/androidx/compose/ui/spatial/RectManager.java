package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.r;
import h.g.b.au;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RectManager {
    public static final int $stable = 8;
    private final MutableRect cachedRect;
    private final MutableObjectList<a<ab>> callbacks;
    private final a<ab> dispatchLambda;
    private Object dispatchToken;
    private final ExecuteDelayed executeDelayed;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;
    private final IntObjectMap<LayoutNode> layoutNodes;
    private final RectList rects;
    private long scheduledDispatchDeadline;
    private final ThrottledCallbacks throttledCallbacks;

    public RectManager(IntObjectMap<LayoutNode> intObjectMap, ExecuteDelayed executeDelayed) {
        this.layoutNodes = intObjectMap;
        this.executeDelayed = executeDelayed;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList<>(0, 1, null);
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new RectManager$dispatchLambda$1(this);
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                long jM10339getOffsetFromRectListForBjo55l4 = m10339getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m11295equalsimpl0(jM10339getOffsetFromRectListForBjo55l4, IntOffset.Companion.m11306getMaxnOccac())) {
                    int iM11296getXimpl = IntOffset.m11296getXimpl(jM10339getOffsetFromRectListForBjo55l4);
                    int iM11297getYimpl = IntOffset.m11297getYimpl(jM10339getOffsetFromRectListForBjo55l4);
                    mutableRect.m7965translatek4lQ0M((Float.floatToRawIntBits(iM11297getYimpl) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(iM11296getXimpl) << 32));
                    return;
                }
            }
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] fArrMo10124getUnderlyingMatrixsQKQjiQ = layer.mo10124getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m8517isIdentity58bKbWc(fArrMo10124getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m8500mapimpl(fArrMo10124getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            long jMo9995getPositionnOccac = nodeCoordinator.mo9995getPositionnOccac();
            int iM11296getXimpl2 = IntOffset.m11296getXimpl(jMo9995getPositionnOccac);
            int iM11297getYimpl2 = IntOffset.m11297getYimpl(jMo9995getPositionnOccac);
            mutableRect.m7965translatek4lQ0M((Float.floatToRawIntBits(iM11297getYimpl2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(iM11296getXimpl2) << 32));
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui();
        }
    }

    private final boolean hasPositionalLayerTransformations(NodeCoordinator nodeCoordinator) {
        OwnedLayer layer = nodeCoordinator.getLayer();
        return (layer == null || MatrixKt.m8517isIdentity58bKbWc(layer.mo10124getUnderlyingMatrixsQKQjiQ())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean inRectList(LayoutNode layoutNode) {
        return layoutNode.getRectListIndex$ui() != -4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int indexInRectList(LayoutNode layoutNode) {
        int rectListIndex$ui = layoutNode.getRectListIndex$ui();
        int i2 = -4;
        if (rectListIndex$ui == -4) {
            rectListIndex$ui = -4;
        } else {
            RectList rectList = this.rects;
            int semanticsId = layoutNode.getSemanticsId();
            long[] jArr = rectList.items;
            if (rectListIndex$ui < 0 || rectListIndex$ui >= rectList.itemsSize - 2 || (((int) jArr[rectListIndex$ui + 2]) & 33554431) != (33554431 & semanticsId)) {
                rectListIndex$ui = rectList.indexOf(semanticsId);
            }
        }
        if (rectListIndex$ui == -4) {
            InlineClassHelperKt.throwIllegalArgumentException("LayoutNode " + layoutNode.getSemanticsId() + " not found in RectList");
        } else {
            i2 = rectListIndex$ui;
        }
        layoutNode.setRectListIndex$ui(i2);
        return i2;
    }

    private final void insertOrUpdateTransformedNode(LayoutNode layoutNode) {
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(true);
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
        int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
        float measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        boundingRectInRoot(outerCoordinator$ui, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        if (inRectList(layoutNode)) {
            this.rects.updateAt(indexInRectList(layoutNode), left, top, right, bottom);
        } else {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            layoutNode.setRectListIndex$ui(this.rects.insert(semanticsId, left, top, right, bottom, parent$ui != null ? parent$ui.getSemanticsId() : -1, parent$ui != null ? indexInRectList(parent$ui) : -4, layoutNode.getNodes$ui().m10027hasH91voCI$ui(1024), layoutNode.getNodes$ui().m10027hasH91voCI$ui(16), this.throttledCallbacks.getRectChangedMap().containsKey(semanticsId)));
        }
        layoutNode.setRectInParentDirty$ui(false);
        invalidate();
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        insertOrUpdateTransformedNode(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (layoutNode2.isPlaced()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
            }
        }
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m10338outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long jM11307getZeronOccac = IntOffset.Companion.m11307getZeronOccac();
        for (NodeCoordinator innerCoordinator$ui = layoutNode.getInnerCoordinator$ui(); innerCoordinator$ui != null && innerCoordinator$ui != outerCoordinator$ui; innerCoordinator$ui = innerCoordinator$ui.getWrappedBy$ui()) {
            if (hasPositionalLayerTransformations(innerCoordinator$ui)) {
                return IntOffset.Companion.m11306getMaxnOccac();
            }
            jM11307getZeronOccac = IntOffset.m11300plusqkQi6aY(jM11307getZeronOccac, innerCoordinator$ui.mo9995getPositionnOccac());
        }
        return jM11307getZeronOccac;
    }

    private final void resetHasPositionalLayerTransformationsForSubtreeIfNeeded(LayoutNode layoutNode) {
        if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui() || hasPositionalLayerTransformations(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(false);
        if (layoutNode.getOuterToInnerOffsetDirty$ui()) {
            layoutNode.m9981setOuterToInnerOffsetgyyYBs$ui(m10338outerToInnerOffsetBjo55l4(layoutNode));
            layoutNode.setOuterToInnerOffsetDirty$ui(false);
        }
        if (IntOffset.m11295equalsimpl0(layoutNode.m9976getOuterToInnerOffsetnOccac$ui(), IntOffset.Companion.m11306getMaxnOccac())) {
            return;
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNodeArr[i2]);
        }
    }

    public final void dispatchCallbacks() {
        removeScheduledCallback();
        long jCurrentTimeMillis = Actual_jvmAndAndroidKt.currentTimeMillis();
        boolean z = this.isDirty;
        boolean z2 = z || this.isScreenOrWindowDirty;
        if (z) {
            this.isDirty = false;
            MutableObjectList<a<ab>> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                ((a) objArr[i3]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i4 = rectList.itemsSize;
            for (int i5 = 0; i5 < jArr.length - 2 && i5 < i4; i5 += 3) {
                long j2 = jArr[i5 + 2];
                if ((((int) (j2 >> 60)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(((int) j2) & 33554431, jArr[i5], jArr[i5 + 1], jCurrentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(jCurrentTimeMillis);
        }
        if (z2) {
            this.throttledCallbacks.fireGlobalChangeEntries(jCurrentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(jCurrentTimeMillis);
        if (this.throttledCallbacks.getMinDebounceDeadline() > 0) {
            scheduleDebounceCallback(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.focus.FocusTargetModifierNode findFocusableNodeFromRect$ui(int r33, int r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.RectManager.findFocusableNodeFromRect$ui(int, int, int, int, int):androidx.compose.ui.focus.FocusTargetModifierNode");
    }

    /* renamed from: getOffsetFromRectListFor-Bjo55l4, reason: not valid java name */
    public final long m10339getOffsetFromRectListForBjo55l4(LayoutNode layoutNode) {
        if (!inRectList(layoutNode)) {
            return IntOffset.Companion.m11306getMaxnOccac();
        }
        long topLeftAt = this.rects.getTopLeftAt(indexInRectList(layoutNode)) >> 32;
        return (((int) r4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (((int) topLeftAt) << 32);
    }

    public final RectList getRects() {
        return this.rects;
    }

    public final ThrottledCallbacks getThrottledCallbacks$ui() {
        return this.throttledCallbacks;
    }

    public final boolean intersects$ui(DelegatableNode delegatableNode, int i2, int i3, int i4, int i5) {
        NodeCoordinator nodeCoordinatorM9921requireCoordinator64DMado = DelegatableNodeKt.m9921requireCoordinator64DMado(delegatableNode, 1024);
        LayoutNode layoutNode = nodeCoordinatorM9921requireCoordinator64DMado.getLayoutNode();
        if (x.n(nodeCoordinatorM9921requireCoordinator64DMado, layoutNode.getOuterCoordinator$ui())) {
            return true;
        }
        long jMo9746localToRootMKHz9U = layoutNode.getOuterCoordinator$ui().mo9746localToRootMKHz9U(LayoutCoordinates.CC.m9763localPositionOfS_NoaFU$default(layoutNode.getOuterCoordinator$ui(), nodeCoordinatorM9921requireCoordinator64DMado, 0L, false, 6, null));
        long jMo9743getSizeYbymL2g = nodeCoordinatorM9921requireCoordinator64DMado.mo9743getSizeYbymL2g();
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo9746localToRootMKHz9U >> 32)));
        int i6 = ((int) (jMo9743getSizeYbymL2g >> 32)) + iRound;
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo9746localToRootMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        return i2 < i6 && i4 > iRound && i3 < ((int) (jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + iRound2 && i5 > iRound2;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    public final void invalidateCallbacksFor(LayoutNode layoutNode) {
        if (inRectList(layoutNode)) {
            this.isDirty = true;
            this.rects.markUpdatedAt(indexInRectList(layoutNode));
        }
        scheduleDebounceCallback(true);
    }

    public final boolean isDescendantOf$ui(LayoutNode layoutNode, LayoutNode layoutNode2) {
        int depth$ui = layoutNode.getDepth$ui() - layoutNode2.getDepth$ui();
        if (depth$ui > 0) {
            for (int i2 = 0; i2 < depth$ui; i2++) {
                layoutNode = layoutNode.getParent$ui();
                if (layoutNode == null) {
                    return false;
                }
            }
            if (layoutNode == layoutNode2) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTargetDrawnFirst$ui(int i2, int i3) {
        LayoutNode parent$ui;
        LayoutNode parent$ui2;
        LayoutNode parent$ui3 = this.layoutNodes.get(i2);
        if (parent$ui3 != null && (parent$ui = this.layoutNodes.get(i3)) != null && parent$ui3.getDepth$ui() != 0 && parent$ui.getDepth$ui() != 0) {
            while (parent$ui3.getDepth$ui() > parent$ui.getDepth$ui()) {
                parent$ui3 = parent$ui3.getParent$ui();
                if (parent$ui3 == null) {
                    return false;
                }
            }
            if (parent$ui3 != parent$ui) {
                while (parent$ui.getDepth$ui() > parent$ui3.getDepth$ui()) {
                    parent$ui = parent$ui.getParent$ui();
                    if (parent$ui == null) {
                        return false;
                    }
                }
                if (parent$ui3 != parent$ui) {
                    LayoutNode layoutNode = parent$ui3;
                    LayoutNode layoutNode2 = layoutNode;
                    LayoutNode layoutNode3 = parent$ui;
                    while (layoutNode != parent$ui) {
                        LayoutNode parent$ui4 = layoutNode.getParent$ui();
                        if (parent$ui4 == null || (parent$ui2 = parent$ui.getParent$ui()) == null) {
                            return false;
                        }
                        layoutNode3 = parent$ui;
                        parent$ui = parent$ui2;
                        layoutNode2 = layoutNode;
                        layoutNode = parent$ui4;
                    }
                    if (layoutNode2.getMeasurePassDelegate$ui().getZIndex$ui() == layoutNode3.getMeasurePassDelegate$ui().getZIndex$ui()) {
                        return layoutNode2.getPlaceOrder$ui() < layoutNode3.getPlaceOrder$ui();
                    }
                    if (layoutNode2.getMeasurePassDelegate$ui().getZIndex$ui() < layoutNode3.getMeasurePassDelegate$ui().getZIndex$ui()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void recalculateRectIfDirty(LayoutNode layoutNode) {
        long jM11307getZeronOccac;
        if (layoutNode.isPlaced() && layoutNode.getRectInParentDirty$ui()) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if (parent$ui == null || parent$ui.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                jM11307getZeronOccac = parent$ui == null ? IntOffset.Companion.m11307getZeronOccac() : IntOffset.Companion.m11306getMaxnOccac();
            } else {
                if (parent$ui.getOuterToInnerOffsetDirty$ui()) {
                    parent$ui.setOuterToInnerOffsetDirty$ui(false);
                    parent$ui.m9981setOuterToInnerOffsetgyyYBs$ui(m10338outerToInnerOffsetBjo55l4(parent$ui));
                }
                jM11307getZeronOccac = parent$ui.m9976getOuterToInnerOffsetnOccac$ui();
            }
            NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            if (!RectManagerKt.m10344isSetgyyYBs(jM11307getZeronOccac) || hasPositionalLayerTransformations(outerCoordinator$ui)) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
            } else if (layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNode);
            } else {
                long jM11300plusqkQi6aY = IntOffset.m11300plusqkQi6aY(jM11307getZeronOccac, outerCoordinator$ui.mo9995getPositionnOccac());
                MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
                int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
                int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
                if (inRectList(layoutNode)) {
                    int iIndexInRectList = indexInRectList(layoutNode);
                    RectList rectList = this.rects;
                    if (parent$ui != null) {
                        rectList.moveBasedOnParentOffset(iIndexInRectList, indexInRectList(parent$ui), IntOffset.m11296getXimpl(jM11300plusqkQi6aY), IntOffset.m11297getYimpl(jM11300plusqkQi6aY), measuredWidth, measuredHeight);
                    } else {
                        rectList.moveAt(indexInRectList(layoutNode), IntOffset.m11296getXimpl(jM11300plusqkQi6aY), IntOffset.m11297getYimpl(jM11300plusqkQi6aY), IntOffset.m11296getXimpl(jM11300plusqkQi6aY) + measuredWidth, IntOffset.m11297getYimpl(jM11300plusqkQi6aY) + measuredHeight);
                    }
                } else {
                    int semanticsId = layoutNode.getSemanticsId();
                    boolean zM10027hasH91voCI$ui = layoutNode.getNodes$ui().m10027hasH91voCI$ui(1024);
                    boolean zM10027hasH91voCI$ui2 = layoutNode.getNodes$ui().m10027hasH91voCI$ui(16);
                    boolean zContainsKey = this.throttledCallbacks.getRectChangedMap().containsKey(semanticsId);
                    RectList rectList2 = this.rects;
                    if (parent$ui != null) {
                        layoutNode.setRectListIndex$ui(rectList2.insertBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), indexInRectList(parent$ui), IntOffset.m11296getXimpl(jM11300plusqkQi6aY), IntOffset.m11297getYimpl(jM11300plusqkQi6aY), measuredWidth, measuredHeight, zM10027hasH91voCI$ui, zM10027hasH91voCI$ui2, zContainsKey));
                    } else {
                        layoutNode.setRectListIndex$ui(rectList2.insert(semanticsId, IntOffset.m11296getXimpl(jM11300plusqkQi6aY), IntOffset.m11297getYimpl(jM11300plusqkQi6aY), IntOffset.m11296getXimpl(jM11300plusqkQi6aY) + measuredWidth, IntOffset.m11297getYimpl(jM11300plusqkQi6aY) + measuredHeight, -1, -4, zM10027hasH91voCI$ui, zM10027hasH91voCI$ui2, zContainsKey));
                    }
                }
            }
            layoutNode.setRectInParentDirty$ui(false);
            invalidate();
            scheduleDebounceCallback(true);
        }
    }

    public final Object registerOnChangedCallback(a<ab> aVar) {
        this.callbacks.add(aVar);
        return aVar;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int i2, long j2, long j3, DelegatableNode delegatableNode, l<? super RelativeLayoutBounds, ab> lVar) {
        return this.throttledCallbacks.registerOnGlobalChange(i2, j2, j3, delegatableNode, lVar);
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int i2, long j2, long j3, DelegatableNode delegatableNode, l<? super RelativeLayoutBounds, ab> lVar) {
        DelegatableNode.RegistrationHandle registrationHandleRegisterOnRectChanged = this.throttledCallbacks.registerOnRectChanged(i2, j2, j3, delegatableNode, lVar);
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode.getNode());
        if (inRectList(layoutNodeRequireLayoutNode)) {
            this.rects.updateHasCallbacksAt(indexInRectList(layoutNodeRequireLayoutNode), true);
        }
        invalidate();
        scheduleDebounceCallback(true);
        return registrationHandleRegisterOnRectChanged;
    }

    public final void remove(LayoutNode layoutNode) {
        if (inRectList(layoutNode)) {
            this.rects.removeAt(indexInRectList(layoutNode));
            layoutNode.setRectListIndex$ui(-4);
            layoutNode.setRectInParentDirty$ui(true);
            invalidate();
            this.isFragmented = true;
        }
    }

    public final void removeScheduledCallback() {
        Object obj = this.dispatchToken;
        if (obj != null) {
            this.executeDelayed.removeDelayedExecution(obj);
            this.dispatchToken = null;
        }
    }

    public final void resetOffsets() {
        this.isScreenOrWindowDirty = this.throttledCallbacks.m10357updateOffsetsLDcG7Xg(IntOffset.Companion.m11307getZeronOccac(), IntOffset.Companion.m11307getZeronOccac(), null, 0, 0);
    }

    public final void scheduleDebounceCallback(boolean z) {
        boolean z2 = false;
        boolean z3 = true;
        if (z && this.dispatchToken == null) {
            z3 = false;
        }
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0) {
            z2 = z3;
        } else if (z3) {
            return;
        }
        if (this.scheduledDispatchDeadline == minDebounceDeadline && z2) {
            return;
        }
        Object obj = this.dispatchToken;
        if (obj != null) {
            this.executeDelayed.removeDelayedExecution(obj);
        }
        long jCurrentTimeMillis = Actual_jvmAndAndroidKt.currentTimeMillis();
        long jMax = Math.max(minDebounceDeadline, 16 + jCurrentTimeMillis);
        this.scheduledDispatchDeadline = jMax;
        this.dispatchToken = this.executeDelayed.executeDelayed(jMax - jCurrentTimeMillis, this.dispatchLambda);
    }

    public final void unregisterOnChangedCallback(Object obj) {
        if ((au.e(obj, 0) ? (a) obj : null) == null) {
            return;
        }
        this.callbacks.remove(obj);
    }

    public final void unsetHasCallbacksFor(LayoutNode layoutNode) {
        if (inRectList(layoutNode)) {
            this.rects.updateHasCallbacksAt(indexInRectList(layoutNode), false);
        }
    }

    public final void updateFlagsFor(LayoutNode layoutNode, boolean z, boolean z2) {
        if (layoutNode.isAttached() && inRectList(layoutNode)) {
            this.rects.updateFlagsAt(indexInRectList(layoutNode), z, z2);
        }
    }

    /* renamed from: updateOffsets-gTq6Wqs, reason: not valid java name */
    public final void m10340updateOffsetsgTq6Wqs(long j2, long j3, float[] fArr, int i2, int i3) {
        if ((RectManagerKt.m10343analyzeComponents58bKbWc(fArr) & 2) != 0) {
            fArr = null;
        }
        boolean z = true;
        if (!this.throttledCallbacks.m10357updateOffsetsLDcG7Xg(j2, j3, fArr, i2, i3) && !this.isScreenOrWindowDirty) {
            z = false;
        }
        this.isScreenOrWindowDirty = z;
    }

    public final void withRect(int i2, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, ab> rVar) {
        LayoutNode layoutNode = (LayoutNode) this.layoutNodes.get(i2);
        if (layoutNode == null || !inRectList(layoutNode)) {
            return;
        }
        RectList rects = getRects();
        int iIndexInRectList = indexInRectList(layoutNode);
        long[] jArr = rects.items;
        long j2 = jArr[iIndexInRectList];
        long j3 = jArr[iIndexInRectList + 1];
        rVar.invoke(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2), Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3));
    }

    public static /* synthetic */ void getThrottledCallbacks$ui$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RectManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RectManager(IntObjectMap intObjectMap, ExecuteDelayUsingPostAndRemove executeDelayUsingPostAndRemove, int i2, o oVar) {
        this((i2 & 1) != 0 ? IntObjectMapKt.intObjectMapOf() : intObjectMap, (i2 & 2) != 0 ? ExecuteDelayUsingPostAndRemove.INSTANCE : executeDelayUsingPostAndRemove);
    }
}
