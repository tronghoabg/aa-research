package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;
    private LayoutCoordinates coordinates;
    private final Modifier.Node modifierNode;
    private PointerEvent pointerEvent;
    private boolean wasIn;
    private final PointerIdArray pointerIds = new PointerIdArray();
    private final LongSparseArray<PointerInputChange> relevantChanges = new LongSparseArray<>(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    public Node(Modifier.Node node) {
        this.modifierNode = node;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(a<ab> aVar) {
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode;
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached() || (coordinator$ui = this.modifierNode.getCoordinator$ui()) == null || (layoutNode = coordinator$ui.getLayoutNode()) == null || !layoutNode.isPlaced()) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!Offset.m7977equalsimpl0(pointerEvent.getChanges().get(i2).m9608getPositionF1C5BW0(), pointerEvent2.getChanges().get(i2).m9608getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        PointerInputChange pointerInputChange;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        int i3;
        int i4;
        boolean zBuildCache = super.buildCache(longSparseArray, layoutCoordinates, internalPointerEvent, z);
        boolean z6 = true;
        if (this.modifierNode.isAttached()) {
            DelegatingNode delegatingNodePop = this.modifierNode;
            MutableVector mutableVector = null;
            while (delegatingNodePop != 0) {
                if (delegatingNodePop instanceof PointerInputModifierNode) {
                    this.coordinates = PointerInputModifierNodeKt.getLayoutCoordinates((PointerInputModifierNode) delegatingNodePop);
                } else if ((delegatingNodePop.getKindSet$ui() & 16) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                    int i5 = 0;
                    delegatingNodePop = delegatingNodePop;
                    while (delegate$ui != null) {
                        if ((delegate$ui.getKindSet$ui() & 16) != 0) {
                            i5++;
                            if (i5 == 1) {
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
                    if (i5 != 1) {
                    }
                }
                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
            }
            if (this.coordinates != null) {
                int size = longSparseArray.size();
                int i6 = 0;
                while (i6 < size) {
                    long jKeyAt = longSparseArray.keyAt(i6);
                    PointerInputChange pointerInputChangeValueAt = longSparseArray.valueAt(i6);
                    if (this.pointerIds.contains(jKeyAt)) {
                        long jM9609getPreviousPositionF1C5BW0 = pointerInputChangeValueAt.m9609getPreviousPositionF1C5BW0();
                        boolean z7 = z6;
                        long jM9608getPositionF1C5BW0 = pointerInputChangeValueAt.m9608getPositionF1C5BW0();
                        if ((((jM9609getPreviousPositionF1C5BW0 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0 && (((jM9608getPositionF1C5BW0 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            ArrayList arrayList = new ArrayList(pointerInputChangeValueAt.getHistorical().size());
                            List<HistoricalChange> historical = pointerInputChangeValueAt.getHistorical();
                            z4 = zBuildCache;
                            int size2 = historical.size();
                            i2 = size;
                            int i7 = 0;
                            while (i7 < size2) {
                                HistoricalChange historicalChange = historical.get(i7);
                                int i8 = size2;
                                int i9 = i7;
                                long jM9509getPositionF1C5BW0 = historicalChange.m9509getPositionF1C5BW0();
                                if ((((jM9509getPositionF1C5BW0 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                                    long uptimeMillis = historicalChange.getUptimeMillis();
                                    i4 = i6;
                                    LayoutCoordinates layoutCoordinates2 = this.coordinates;
                                    if (layoutCoordinates2 == null) {
                                        x.g();
                                    }
                                    arrayList.add(new HistoricalChange(uptimeMillis, layoutCoordinates2.mo9744localPositionOfR5De75A(layoutCoordinates, jM9509getPositionF1C5BW0), historicalChange.getScaleFactor(), historicalChange.m9508getPanOffsetF1C5BW0(), historicalChange.m9507getOriginalEventPositionF1C5BW0$ui(), (o) null));
                                } else {
                                    i4 = i6;
                                }
                                i7 = i9 + 1;
                                size2 = i8;
                                i6 = i4;
                            }
                            i3 = i6;
                            LongSparseArray<PointerInputChange> longSparseArray2 = this.relevantChanges;
                            LayoutCoordinates layoutCoordinates3 = this.coordinates;
                            if (layoutCoordinates3 == null) {
                                x.g();
                            }
                            long jMo9744localPositionOfR5De75A = layoutCoordinates3.mo9744localPositionOfR5De75A(layoutCoordinates, jM9609getPreviousPositionF1C5BW0);
                            LayoutCoordinates layoutCoordinates4 = this.coordinates;
                            if (layoutCoordinates4 == null) {
                                x.g();
                            }
                            longSparseArray2.put(jKeyAt, PointerInputChange.m9594copyOHpmEuE$default(pointerInputChangeValueAt, 0L, 0L, layoutCoordinates4.mo9744localPositionOfR5De75A(layoutCoordinates, jM9608getPositionF1C5BW0), false, 0L, jMo9744localPositionOfR5De75A, false, 0, arrayList, 0L, DisplayStrings.DS_NEXT, null));
                        } else {
                            z4 = zBuildCache;
                            i2 = size;
                            i3 = i6;
                            z5 = z7;
                        }
                    } else {
                        z4 = zBuildCache;
                        i2 = size;
                        z5 = z6;
                        i3 = i6;
                    }
                    i6 = i3 + 1;
                    z6 = z5;
                    zBuildCache = z4;
                    size = i2;
                }
                boolean z8 = zBuildCache;
                boolean z9 = z6;
                boolean zIsEmpty = this.relevantChanges.isEmpty();
                PointerIdArray pointerIdArray = this.pointerIds;
                if (zIsEmpty) {
                    pointerIdArray.clear();
                    getChildren().clear();
                    return z9;
                }
                int size3 = pointerIdArray.getSize();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    if (!longSparseArray.containsKey(this.pointerIds.m9710get_I2yYro(size3))) {
                        this.pointerIds.removeAt(size3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(this.relevantChanges.size());
                int size4 = this.relevantChanges.size();
                for (int i10 = 0; i10 < size4; i10++) {
                    arrayList2.add(this.relevantChanges.valueAt(i10));
                }
                PointerEvent pointerEvent = new PointerEvent(arrayList2, internalPointerEvent);
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size5 = changes.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size5) {
                        pointerInputChange = null;
                        break;
                    }
                    PointerInputChange pointerInputChange2 = changes.get(i11);
                    if (internalPointerEvent.m9513activeHoverEvent0FcD4WY(pointerInputChange2.m9605getIdJ3iCeTQ())) {
                        pointerInputChange = pointerInputChange2;
                        break;
                    }
                    i11++;
                }
                PointerInputChange pointerInputChange3 = pointerInputChange;
                if (pointerInputChange3 != null) {
                    if (z) {
                        z2 = false;
                        z3 = this.isIn;
                        if (!z3 && (pointerInputChange3.getPressed() || pointerInputChange3.getPreviousPressed())) {
                            LayoutCoordinates layoutCoordinates5 = this.coordinates;
                            if (layoutCoordinates5 == null) {
                                x.g();
                            }
                            z3 = !PointerEventKt.m9543isOutOfBoundsO0kMr_c(pointerInputChange3, layoutCoordinates5.mo9743getSizeYbymL2g());
                            this.isIn = z3;
                        }
                    } else {
                        z2 = false;
                        this.isIn = false;
                        z3 = false;
                    }
                    if (z3 != this.wasIn && (PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9554getMove7fucELk()) || PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9552getEnter7fucELk()) || PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9553getExit7fucELk()))) {
                        pointerEvent.m9542setTypeEhbLWgg$ui(this.isIn ? PointerEventType.Companion.m9552getEnter7fucELk() : PointerEventType.Companion.m9553getExit7fucELk());
                    } else if (PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9552getEnter7fucELk()) && this.wasIn && !this.hasExited) {
                        pointerEvent.m9542setTypeEhbLWgg$ui(PointerEventType.Companion.m9554getMove7fucELk());
                    } else if (PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9553getExit7fucELk()) && this.isIn && pointerInputChange3.getPressed()) {
                        pointerEvent.m9542setTypeEhbLWgg$ui(PointerEventType.Companion.m9554getMove7fucELk());
                    }
                } else {
                    z2 = false;
                }
                boolean z10 = (z8 || !PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9554getMove7fucELk()) || hasPositionChanged(this.pointerEvent, pointerEvent)) ? z9 : z2;
                this.pointerEvent = pointerEvent;
                return z10;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            boolean pressed = pointerInputChange.getPressed();
            boolean zM9513activeHoverEvent0FcD4WY = internalPointerEvent.m9513activeHoverEvent0FcD4WY(pointerInputChange.m9605getIdJ3iCeTQ());
            boolean z = this.isIn;
            if (!pressed && (!zM9513activeHoverEvent0FcD4WY || !z)) {
                this.pointerIds.remove(pointerInputChange.m9605getIdJ3iCeTQ());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9553getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            nodeArr[i2].dispatchCancel();
        }
        DelegatingNode delegatingNodePop = this.modifierNode;
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).onCancelPointerInput();
            } else if ((delegatingNodePop.getKindSet$ui() & 16) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                int i3 = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
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
                if (i3 != 1) {
                }
            }
            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (!this.relevantChanges.isEmpty() && this.modifierNode.isAttached() && (coordinator$ui = this.modifierNode.getCoordinator$ui()) != null && (layoutNode = coordinator$ui.getLayoutNode()) != null && layoutNode.isPlaced()) {
            PointerEvent pointerEvent = this.pointerEvent;
            if (pointerEvent == null) {
                x.g();
            }
            LayoutCoordinates layoutCoordinates = this.coordinates;
            if (layoutCoordinates == null) {
                x.g();
            }
            DelegatingNode delegatingNodePop = this.modifierNode;
            long jMo9743getSizeYbymL2g = layoutCoordinates.mo9743getSizeYbymL2g();
            MutableVector mutableVector = null;
            while (delegatingNodePop != 0) {
                if (delegatingNodePop instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop).mo1940onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, jMo9743getSizeYbymL2g);
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
            if (this.modifierNode.isAttached()) {
                MutableVector<Node> children = getChildren();
                Node[] nodeArr = children.content;
                int size = children.getSize();
                for (int i3 = 0; i3 < size; i3++) {
                    nodeArr[i3].dispatchFinalEventPass(internalPointerEvent);
                }
            }
            z = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode;
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached() || (coordinator$ui = this.modifierNode.getCoordinator$ui()) == null || (layoutNode = coordinator$ui.getLayoutNode()) == null || !layoutNode.isPlaced()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            x.g();
        }
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 == null) {
            x.g();
        }
        DelegatingNode delegatingNodePop = this.modifierNode;
        long jMo9743getSizeYbymL2g = layoutCoordinates2.mo9743getSizeYbymL2g();
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodePop).mo1940onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo9743getSizeYbymL2g);
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
        if (this.modifierNode.isAttached()) {
            MutableVector<Node> children = getChildren();
            Node[] nodeArr = children.content;
            int size = children.getSize();
            for (int i3 = 0; i3 < size; i3++) {
                Node node = nodeArr[i3];
                LongSparseArray<PointerInputChange> longSparseArray2 = this.relevantChanges;
                LayoutCoordinates layoutCoordinates3 = this.coordinates;
                if (layoutCoordinates3 == null) {
                    x.g();
                }
                node.dispatchMainEventPass(longSparseArray2, layoutCoordinates3, internalPointerEvent, z);
            }
        }
        if (this.modifierNode.isAttached()) {
            DelegatingNode delegatingNodePop2 = this.modifierNode;
            MutableVector mutableVector2 = null;
            while (delegatingNodePop2 != 0) {
                if (delegatingNodePop2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNodePop2).mo1940onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo9743getSizeYbymL2g);
                } else if ((delegatingNodePop2.getKindSet$ui() & 16) != 0 && (delegatingNodePop2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui2 = delegatingNodePop2.getDelegate$ui();
                    int i4 = 0;
                    delegatingNodePop2 = delegatingNodePop2;
                    while (delegate$ui2 != null) {
                        if ((delegate$ui2.getKindSet$ui() & 16) != 0) {
                            i4++;
                            if (i4 == 1) {
                                delegatingNodePop2 = delegate$ui2;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNodePop2 != 0) {
                                    mutableVector2.add(delegatingNodePop2);
                                }
                                mutableVector2.add(delegate$ui2);
                                delegatingNodePop2 = 0;
                            }
                        }
                        delegate$ui2 = delegate$ui2.getChild$ui();
                        delegatingNodePop2 = delegatingNodePop2;
                    }
                    if (i4 != 1) {
                    }
                }
                delegatingNodePop2 = DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long j2, MutableObjectList<Node> mutableObjectList) {
        if (this.pointerIds.contains(j2) && !mutableObjectList.contains(this)) {
            this.pointerIds.remove(j2);
            this.relevantChanges.remove(j2);
        }
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            nodeArr[i2].removeInvalidPointerIdsAndChanges(j2, mutableObjectList);
        }
    }

    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
