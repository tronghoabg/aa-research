package androidx.compose.ui.semantics;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import h.a.i;
import h.g.a.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsOwnerKt {
    private static final Rect DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);

    public static final List<SemanticsNode> getAllSemanticsNodes(SemanticsOwner semanticsOwner, boolean z, boolean z2) {
        return i.ao(getAllSemanticsNodesToMap(semanticsOwner, !z, z2).values());
    }

    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(SemanticsOwner semanticsOwner, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SemanticsNode unmergedRootSemanticsNode = z ? semanticsOwner.getUnmergedRootSemanticsNode() : semanticsOwner.getRootSemanticsNode();
        if (z2 && unmergedRootSemanticsNode.getLayoutNode$ui().isDeactivated()) {
            return linkedHashMap;
        }
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, z2, unmergedRootSemanticsNode);
        return linkedHashMap;
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map<Integer, SemanticsNode> map, boolean z, SemanticsNode semanticsNode) {
        map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, false, !z, 3, null);
        int size = children$ui$default.size();
        for (int i2 = 0; i2 < size; i2++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map, z, (SemanticsNode) children$ui$default.get(i2));
        }
    }

    public static final IntObjectMap<SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToIntObjectMap(SemanticsOwner semanticsOwner, int i2, l<? super SemanticsNode, Boolean> lVar) {
        MutableIntObjectMap mutableIntObjectMapEmptyIntObjectMap;
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
            if (unmergedRootSemanticsNode.getLayoutNode$ui().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui().isAttached()) {
                Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
                MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(48);
                SemanticsRegion SemanticsRegion = SemanticsRegion_androidKt.SemanticsRegion();
                SemanticsRegion.set(IntRectKt.roundToIntRect(boundsInRoot));
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(unmergedRootSemanticsNode, mutableIntObjectMap, lVar, i2, unmergedRootSemanticsNode, SemanticsRegion_androidKt.SemanticsRegion(), SemanticsRegion);
                mutableIntObjectMapEmptyIntObjectMap = mutableIntObjectMap;
            } else {
                mutableIntObjectMapEmptyIntObjectMap = IntObjectMapKt.emptyIntObjectMap();
            }
            return mutableIntObjectMapEmptyIntObjectMap;
        } finally {
            Trace.endSection();
        }
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(MutableIntObjectMap<SemanticsNodeWithAdjustedBounds> mutableIntObjectMap, l<? super SemanticsNode, Boolean> lVar, SemanticsNode semanticsNode, int i2, SemanticsNode semanticsNode2, SemanticsRegion semanticsRegion, SemanticsRegion semanticsRegion2) {
        if (!semanticsNode2.getLayoutNode$ui().isPlaced() || !semanticsNode2.getLayoutNode$ui().isAttached() || semanticsRegion2.isEmpty()) {
            if (semanticsNode2.isFake$ui()) {
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(mutableIntObjectMap, semanticsNode, i2, semanticsNode2);
                return;
            }
            return;
        }
        Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
        if (touchBoundsInRoot.isEmpty()) {
            touchBoundsInRoot = semanticsNode2.getUnclippedBoundsInRoot$ui();
        }
        IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(touchBoundsInRoot);
        SemanticsRegion semanticsRegion3 = semanticsRegion;
        semanticsRegion.set(intRectRoundToIntRect);
        if (semanticsRegion.intersect(semanticsRegion2)) {
            mutableIntObjectMap.set(getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(semanticsNode, i2, semanticsNode2), new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion.getBounds()));
            List<SemanticsNode> replacedChildren$ui = semanticsNode2.getReplacedChildren$ui();
            int size = replacedChildren$ui.size() - 1;
            while (size >= 0) {
                if (!lVar.invoke(replacedChildren$ui.get(size)).booleanValue()) {
                    getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(mutableIntObjectMap, lVar, semanticsNode, i2, replacedChildren$ui.get(size), semanticsRegion3, semanticsRegion2);
                }
                size--;
                semanticsRegion3 = semanticsRegion;
            }
            if (isImportantForAccessibility(semanticsNode2)) {
                semanticsRegion2.difference(intRectRoundToIntRect);
            }
        }
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(MutableIntObjectMap<SemanticsNodeWithAdjustedBounds> mutableIntObjectMap, SemanticsNode semanticsNode, int i2, SemanticsNode semanticsNode2) {
        LayoutInfo layoutInfo;
        SemanticsNode parent = semanticsNode2.getParent();
        mutableIntObjectMap.set(getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(semanticsNode, i2, semanticsNode2), new SemanticsNodeWithAdjustedBounds(semanticsNode2, IntRectKt.roundToIntRect((parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? DefaultFakeNodeBounds : parent.getBoundsInRoot())));
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(SemanticsNode semanticsNode, MutableIntObjectMap<SemanticsNodeWithAdjustedBounds> mutableIntObjectMap, l<? super SemanticsNode, Boolean> lVar, int i2, SemanticsNode semanticsNode2, SemanticsRegion semanticsRegion, SemanticsRegion semanticsRegion2) {
        boolean z = true;
        if (semanticsNode2.getLayoutNode$ui().isPlaced() && semanticsNode2.getLayoutNode$ui().isAttached()) {
            z = false;
        }
        if (!semanticsRegion2.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.isFake$ui()) {
                IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(semanticsNode2.getTouchBoundsInRoot());
                SemanticsRegion semanticsRegion3 = semanticsRegion;
                semanticsRegion3.set(intRectRoundToIntRect);
                int allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId = getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(semanticsNode, i2, semanticsNode2);
                if (!semanticsRegion.intersect(semanticsRegion2)) {
                    if (semanticsNode2.isFake$ui()) {
                        getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(mutableIntObjectMap, semanticsNode, i2, semanticsNode2);
                        return;
                    } else {
                        if (allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId == i2) {
                            mutableIntObjectMap.set(allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId, new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                mutableIntObjectMap.set(allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId, new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion3.getBounds()));
                List<SemanticsNode> replacedChildren$ui = semanticsNode2.getReplacedChildren$ui();
                if (ComposeUiFlags.isAccessibilityShouldIncludeOffscreenChildrenEnabled && semanticsNode2.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() && isPartiallyOffscreenInScrollParent(semanticsNode2)) {
                    SemanticsRegion SemanticsRegion = SemanticsRegion_androidKt.SemanticsRegion();
                    SemanticsRegion.set(IntRectKt.roundToIntRect(semanticsNode2.getUnclippedBoundsInRoot$ui()));
                    for (int size = replacedChildren$ui.size() - 1; size >= 0; size--) {
                        if (!lVar.invoke(replacedChildren$ui.get(size)).booleanValue()) {
                            getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(mutableIntObjectMap, lVar, semanticsNode, i2, replacedChildren$ui.get(size), SemanticsRegion_androidKt.SemanticsRegion(), SemanticsRegion);
                        }
                    }
                } else {
                    int size2 = replacedChildren$ui.size() - 1;
                    while (size2 >= 0) {
                        if (!lVar.invoke(replacedChildren$ui.get(size2)).booleanValue()) {
                            getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(semanticsNode, mutableIntObjectMap, lVar, i2, replacedChildren$ui.get(size2), semanticsRegion3, semanticsRegion2);
                        }
                        size2--;
                        semanticsRegion3 = semanticsRegion;
                    }
                }
                if (isImportantForAccessibility(semanticsNode2)) {
                    semanticsRegion2.difference(intRectRoundToIntRect);
                }
            }
        }
    }

    private static final int getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(SemanticsNode semanticsNode, int i2, SemanticsNode semanticsNode2) {
        return semanticsNode2.getId() == semanticsNode.getId() ? i2 : semanticsNode2.getId();
    }

    private static final SemanticsNode getScrollableParent(SemanticsNode semanticsNode) {
        for (SemanticsNode parent = semanticsNode.getParent(); parent != null; parent = parent.getParent()) {
            if (isScrollNode(parent)) {
                return parent;
            }
        }
        return null;
    }

    public static final boolean isHidden(SemanticsNode semanticsNode) {
        return semanticsNode.isTransparent$ui() || semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getHideFromAccessibility()) || semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getInvisibleToUser());
    }

    public static final boolean isImportantForAccessibility(SemanticsNode semanticsNode) {
        if (isHidden(semanticsNode)) {
            return false;
        }
        return semanticsNode.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig$ui().containsImportantForAccessibility$ui();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean isPartiallyOffscreenInScrollParent(androidx.compose.ui.semantics.SemanticsNode r8) {
        /*
            androidx.compose.ui.semantics.SemanticsNode r0 = getScrollableParent(r8)
            r1 = 0
            if (r0 == 0) goto L57
            androidx.compose.ui.node.NodeCoordinator r8 = r8.findCoordinatorToGetBounds$ui()
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L1d
            boolean r4 = r8.isAttached()
            if (r2 == r4) goto L16
            r8 = r3
        L16:
            if (r8 == 0) goto L1d
            androidx.compose.ui.layout.LayoutCoordinates r8 = r8.getCoordinates()
            goto L1e
        L1d:
            r8 = r3
        L1e:
            androidx.compose.ui.node.NodeCoordinator r0 = r0.findCoordinatorToGetBounds$ui()
            if (r0 == 0) goto L31
            boolean r4 = r0.isAttached()
            if (r2 == r4) goto L2b
            r0 = r3
        L2b:
            if (r0 == 0) goto L31
            androidx.compose.ui.layout.LayoutCoordinates r3 = r0.getCoordinates()
        L31:
            if (r8 == 0) goto L57
            if (r3 != 0) goto L36
            goto L57
        L36:
            androidx.compose.ui.geometry.Rect r8 = r3.localBoundingBoxOf(r8, r1)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r4 = r0.m7996getZeroF1C5BW0()
            long r6 = r3.mo9743getSizeYbymL2g()
            long r6 = androidx.compose.ui.unit.IntSizeKt.m11351toSizeozmzZPI(r6)
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.ui.geometry.RectKt.m8020Recttz77jQw(r4, r6)
            androidx.compose.ui.geometry.Rect r0 = r8.intersect(r0)
            boolean r8 = h.g.b.x.n(r8, r0)
            if (r8 != 0) goto L57
            return r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsOwnerKt.isPartiallyOffscreenInScrollParent(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    private static final boolean isScrollNode(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()) || semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
    }

    public static /* synthetic */ void isHidden$annotations(SemanticsNode semanticsNode) {
    }
}
