package androidx.compose.ui.layout;

import android.graphics.Rect;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.ScatterMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKindKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowInsetsRulers_androidKt {
    private static final WindowInsetsRulers[] AnimatableInsetsRulers;
    public static final String RulerKey = "androidx.compose.ui.layout.WindowInsetsRulers";
    private static final IntObjectMap<WindowInsetsRulers> WindowInsetsTypeMap;

    static {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(8);
        mutableIntObjectMap.set(1, WindowInsetsRulers.Companion.getStatusBars());
        mutableIntObjectMap.set(2, WindowInsetsRulers.Companion.getNavigationBars());
        mutableIntObjectMap.set(4, WindowInsetsRulers.Companion.getCaptionBar());
        mutableIntObjectMap.set(8, WindowInsetsRulers.Companion.getIme());
        mutableIntObjectMap.set(16, WindowInsetsRulers.Companion.getSystemGestures());
        mutableIntObjectMap.set(32, WindowInsetsRulers.Companion.getMandatorySystemGestures());
        mutableIntObjectMap.set(64, WindowInsetsRulers.Companion.getTappableElement());
        mutableIntObjectMap.set(128, WindowInsetsRulers.Companion.getDisplayCutout());
        WindowInsetsTypeMap = mutableIntObjectMap;
        AnimatableInsetsRulers = new WindowInsetsRulers[]{WindowInsetsRulers.Companion.getStatusBars(), WindowInsetsRulers.Companion.getNavigationBars(), WindowInsetsRulers.Companion.getCaptionBar(), WindowInsetsRulers.Companion.getTappableElement(), WindowInsetsRulers.Companion.getSystemGestures(), WindowInsetsRulers.Companion.getMandatorySystemGestures(), WindowInsetsRulers.Companion.getIme(), WindowInsetsRulers.Companion.getWaterfall(), WindowInsetsRulers.Companion.getDisplayCutout()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    public static final List<RectRulers> findDisplayCutouts(Placeable.PlacementScope placementScope) {
        Modifier.Node parent$ui;
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = coordinates != null ? LayoutCoordinatesKt.findRootCoordinates(coordinates) : null;
        for (NodeCoordinator wrapped$ui = layoutCoordinatesFindRootCoordinates instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinatesFindRootCoordinates : null; wrapped$ui != null; wrapped$ui = wrapped$ui.getWrapped$ui()) {
            boolean zM10076getIncludeSelfInTraversalH91voCI = NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(262144);
            if (zM10076getIncludeSelfInTraversalH91voCI) {
                parent$ui = wrapped$ui.getTail();
            } else {
                parent$ui = wrapped$ui.getTail().getParent$ui();
                if (parent$ui == null) {
                    continue;
                }
            }
            for (Modifier.Node nodeHeadNode = wrapped$ui.headNode(zM10076getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & 262144) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
                if ((nodeHeadNode.getKindSet$ui() & 262144) != 0) {
                    MutableVector mutableVector = null;
                    DelegatingNode delegatingNodePop = nodeHeadNode;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof TraversableNode) {
                            TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                            if (traversableNode.getTraverseKey() == RulerKey) {
                                return ((WindowInsetsRulerProvider) traversableNode).getCutoutRulers();
                            }
                        } else if ((delegatingNodePop.getKindSet$ui() & 262144) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                            int i2 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & 262144) != 0) {
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
                if (nodeHeadNode != parent$ui) {
                }
            }
        }
        return ac.f47967a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    public static final WindowInsetsAnimation findInsetsAnimationProperties(Placeable.PlacementScope placementScope, WindowInsetsRulers windowInsetsRulers) {
        Modifier.Node parent$ui;
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = coordinates != null ? LayoutCoordinatesKt.findRootCoordinates(coordinates) : null;
        for (NodeCoordinator wrapped$ui = layoutCoordinatesFindRootCoordinates instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinatesFindRootCoordinates : null; wrapped$ui != null; wrapped$ui = wrapped$ui.getWrapped$ui()) {
            boolean zM10076getIncludeSelfInTraversalH91voCI = NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(262144);
            if (zM10076getIncludeSelfInTraversalH91voCI) {
                parent$ui = wrapped$ui.getTail();
            } else {
                parent$ui = wrapped$ui.getTail().getParent$ui();
                if (parent$ui == null) {
                    continue;
                }
            }
            for (Modifier.Node nodeHeadNode = wrapped$ui.headNode(zM10076getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & 262144) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
                if ((nodeHeadNode.getKindSet$ui() & 262144) != 0) {
                    MutableVector mutableVector = null;
                    DelegatingNode delegatingNodePop = nodeHeadNode;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof TraversableNode) {
                            TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                            if (traversableNode.getTraverseKey() == RulerKey) {
                                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = ((WindowInsetsRulerProvider) traversableNode).getInsetsValues().get(windowInsetsRulers);
                                return windowWindowInsetsAnimationValues != null ? windowWindowInsetsAnimationValues : NoWindowInsetsAnimation.INSTANCE;
                            }
                        } else if ((delegatingNodePop.getKindSet$ui() & 262144) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                            int i2 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & 262144) != 0) {
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
                if (nodeHeadNode != parent$ui) {
                }
            }
        }
        return NoWindowInsetsAnimation.INSTANCE;
    }

    /* renamed from: provideInsetsValues-cytEWk0, reason: not valid java name */
    private static final void m9893provideInsetsValuescytEWk0(RulerScope rulerScope, RectRulers rectRulers, long j2, int i2, int i3) {
        if (ValueInsets.m9885equalsimpl0(j2, ValueInsets_androidKt.getUnsetValueInsets())) {
            return;
        }
        rulerScope.provides(rectRulers.getLeft(), (int) (j2 >>> 48));
        rulerScope.provides(rectRulers.getTop(), (int) ((j2 >>> 32) & 65535));
        rulerScope.provides(rectRulers.getRight(), i2 - ((int) ((j2 >>> 16) & 65535)));
        rulerScope.provides(rectRulers.getBottom(), i3 - ((int) (j2 & 65535)));
    }

    public static final void provideWindowInsetsRulers(RulerScope rulerScope, WindowInsetsRulerProvider windowInsetsRulerProvider) {
        long jMo9743getSizeYbymL2g = rulerScope.getCoordinates().mo9743getSizeYbymL2g();
        ScatterMap<Object, WindowWindowInsetsAnimationValues> insetsValues = windowInsetsRulerProvider.getInsetsListener().getInsetsValues();
        long j2 = jMo9743getSizeYbymL2g >> 32;
        long j3 = jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        for (WindowInsetsRulers windowInsetsRulers : AnimatableInsetsRulers) {
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = insetsValues.get(windowInsetsRulers);
            if (windowWindowInsetsAnimationValues == null) {
                x.g();
            }
            int i2 = (int) j3;
            int i3 = (int) j2;
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
            m9893provideInsetsValuescytEWk0(rulerScope, windowInsetsRulers.getCurrent(), windowWindowInsetsAnimationValues2.m9894getCurrenthdzbrEE(), i3, i2);
            if (windowWindowInsetsAnimationValues2.isAnimating()) {
                m9893provideInsetsValuescytEWk0(rulerScope, windowWindowInsetsAnimationValues2.getSource(), windowWindowInsetsAnimationValues2.m9896getSourceValueInsetshdzbrEE(), i3, i2);
                m9893provideInsetsValuescytEWk0(rulerScope, windowWindowInsetsAnimationValues2.getTarget(), windowWindowInsetsAnimationValues2.m9897getTargetValueInsetshdzbrEE(), i3, i2);
            }
            m9893provideInsetsValuescytEWk0(rulerScope, windowInsetsRulers.getMaximum(), windowWindowInsetsAnimationValues2.m9895getMaximumhdzbrEE(), i3, i2);
        }
        MutableObjectList<MutableState<Rect>> cutoutRects = windowInsetsRulerProvider.getCutoutRects();
        if (cutoutRects.isNotEmpty()) {
            List<RectRulers> cutoutRulers = windowInsetsRulerProvider.getCutoutRulers();
            MutableObjectList<MutableState<Rect>> mutableObjectList = cutoutRects;
            Object[] objArr = mutableObjectList.content;
            int i4 = mutableObjectList._size;
            for (int i5 = 0; i5 < i4; i5++) {
                MutableState mutableState = (MutableState) objArr[i5];
                RectRulers rectRulers = cutoutRulers.get(i5);
                Rect rect = (Rect) mutableState.getValue();
                rulerScope.provides(rectRulers.getLeft(), rect.left);
                rulerScope.provides(rectRulers.getTop(), rect.top);
                rulerScope.provides(rectRulers.getRight(), rect.right);
                rulerScope.provides(rectRulers.getBottom(), rect.bottom);
            }
        }
    }
}
