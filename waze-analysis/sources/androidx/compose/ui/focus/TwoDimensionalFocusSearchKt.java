package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import h.g.a.l;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return focusTargetNodeFindActiveFocusNode;
        }
        throw new IllegalStateException(NoActiveChild);
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m7924beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i2, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i2, rect)) {
            return false;
        }
        return !beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i2, rect) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance(rect2, i2, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i2, rect);
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i2, Rect rect2) {
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s())) {
            return rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
            return rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i2, Rect rect2) {
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s())) {
            return rect2.getLeft() >= rect.getRight();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s())) {
            return rect2.getRight() <= rect.getLeft();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s())) {
            return rect2.getTop() >= rect.getBottom();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
            return rect2.getBottom() <= rect.getTop();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistance(androidx.compose.ui.geometry.Rect r1, int r2, androidx.compose.ui.geometry.Rect r3) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7862getLeftdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r0 == 0) goto L16
            float r2 = r3.getLeft()
            float r1 = r1.getRight()
        L14:
            float r2 = r2 - r1
            goto L57
        L16:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7865getRightdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r0 == 0) goto L2d
            float r1 = r1.getLeft()
            float r2 = r3.getRight()
        L2a:
            float r2 = r1 - r2
            goto L57
        L2d:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7866getUpdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r0 == 0) goto L42
            float r2 = r3.getTop()
            float r1 = r1.getBottom()
            goto L14
        L42:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7859getDowndhqQ8s()
            boolean r2 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r2 == 0) goto L5e
            float r1 = r1.getTop()
            float r2 = r3.getBottom()
            goto L2a
        L57:
            r1 = 0
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L5d
            return r1
        L5d:
            return r2
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$majorAxisDistance(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(androidx.compose.ui.geometry.Rect r1, int r2, androidx.compose.ui.geometry.Rect r3) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7862getLeftdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r0 == 0) goto L16
            float r2 = r3.getLeft()
            float r1 = r1.getLeft()
        L14:
            float r2 = r2 - r1
            goto L57
        L16:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7865getRightdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r0 == 0) goto L2d
            float r1 = r1.getRight()
            float r2 = r3.getRight()
        L2a:
            float r2 = r1 - r2
            goto L57
        L2d:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7866getUpdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r0 == 0) goto L42
            float r2 = r3.getTop()
            float r1 = r1.getTop()
            goto L14
        L42:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7859getDowndhqQ8s()
            boolean r2 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r2 == 0) goto L5f
            float r1 = r1.getBottom()
            float r2 = r3.getBottom()
            goto L2a
        L57:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L5e
            return r1
        L5e:
            return r2
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & 1024) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                                if (focusTargetNode.isAttached()) {
                                    FocusTargetNode focusTargetNode2 = focusTargetNode;
                                    if (!DelegatableNodeKt.requireLayoutNode(focusTargetNode2).isDeactivated()) {
                                        if (focusTargetNode.fetchFocusProperties$ui().getCanFocus()) {
                                            mutableVector.add(focusTargetNode);
                                        } else {
                                            collectAccessibleChildren(focusTargetNode2, mutableVector);
                                        }
                                    }
                                }
                            } else if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                            }
                                            mutableVector3.add(delegate$ui);
                                            nodePop = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m7925findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i2) {
        Rect rectTranslate;
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s())) {
            rectTranslate = rect.translate((rect.getRight() - rect.getLeft()) + 1.0f, 0.0f);
        } else if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s())) {
            rectTranslate = rect.translate(-((rect.getRight() - rect.getLeft()) + 1.0f), 0.0f);
        } else if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, (rect.getBottom() - rect.getTop()) + 1.0f);
        } else {
            if (!FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            rectTranslate = rect.translate(0.0f, -((rect.getBottom() - rect.getTop()) + 1.0f));
        }
        FocusTargetNode[] focusTargetNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        for (int i3 = 0; i3 < size; i3++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i3];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                Rect rectFocusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                if (m7928isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i2)) {
                    focusTargetNode = focusTargetNode2;
                    rectTranslate = rectFocusRect;
                }
            }
        }
        return focusTargetNode;
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m7926findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode focusTargetNode, int i2, l<? super FocusTargetNode, Boolean> lVar) {
        Rect rectBottomRight;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.getSize() == 0 ? null : mutableVector.content[0]);
            if (focusTargetNode2 != null) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
        } else {
            if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7860getEnterdhqQ8s())) {
                i2 = FocusDirection.Companion.m7865getRightdhqQ8s();
            }
            if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
                rectBottomRight = topLeft(FocusTraversalKt.focusRect(focusTargetNode));
            } else {
                if (!FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s()) && !FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection);
                }
                rectBottomRight = bottomRight(FocusTraversalKt.focusRect(focusTargetNode));
            }
            FocusTargetNode focusTargetNodeM7925findBestCandidate4WY_MpI = m7925findBestCandidate4WY_MpI(mutableVector, rectBottomRight, i2);
            if (focusTargetNodeM7925findBestCandidate4WY_MpI != null) {
                return lVar.invoke(focusTargetNodeM7925findBestCandidate4WY_MpI).booleanValue();
            }
        }
        return false;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m7927generateAndSearchChildren4C6V_qg(FocusTargetNode focusTargetNode, Rect rect, int i2, l<? super FocusTargetNode, Boolean> lVar) {
        if (m7929searchChildren4C6V_qg(focusTargetNode, rect, i2, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m7850searchBeyondBoundsOMvw8(focusTargetNode, i2, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode(), focusTargetNode, rect, i2, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    public static final boolean m7928isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i2, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i2, rect3) && !m7924beamBeatsI7lrPNg(rect3, rect, rect2, i2)) {
            return !m7924beamBeatsI7lrPNg(rect3, rect2, rect, i2) && isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect2);
        }
        return true;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i2, Rect rect2) {
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s())) {
            return (rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s())) {
            return (rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
            return (rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(androidx.compose.ui.geometry.Rect r1, int r2, androidx.compose.ui.geometry.Rect r3) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7862getLeftdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r0 == 0) goto L16
            float r2 = r3.getLeft()
            float r1 = r1.getRight()
        L14:
            float r2 = r2 - r1
            goto L57
        L16:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7865getRightdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r0 == 0) goto L2d
            float r1 = r1.getLeft()
            float r2 = r3.getRight()
        L2a:
            float r2 = r1 - r2
            goto L57
        L2d:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7866getUpdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r0 == 0) goto L42
            float r2 = r3.getTop()
            float r1 = r1.getBottom()
            goto L14
        L42:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r0 = r0.m7859getDowndhqQ8s()
            boolean r2 = androidx.compose.ui.focus.FocusDirection.m7855equalsimpl0(r2, r0)
            if (r2 == 0) goto L5e
            float r1 = r1.getTop()
            float r2 = r3.getBottom()
            goto L2a
        L57:
            r1 = 0
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L5d
            return r1
        L5d:
            return r2
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$majorAxisDistance(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i2, Rect rect2) {
        float top;
        float top2;
        float bottom;
        float top3;
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s())) {
            top = rect2.getTop() + ((rect2.getBottom() - rect2.getTop()) / 2.0f);
            top2 = rect.getTop();
            bottom = rect.getBottom();
            top3 = rect.getTop();
        } else {
            if (!FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s()) && !FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            top = rect2.getLeft() + ((rect2.getRight() - rect2.getLeft()) / 2.0f);
            top2 = rect.getLeft();
            bottom = rect.getRight();
            top3 = rect.getLeft();
        }
        return top - (top2 + ((bottom - top3) / 2.0f));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i2, Rect rect, Rect rect2) {
        long jIsBetterCandidate_I7lrPNg$majorAxisDistance = (long) isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i2, rect);
        long jIsBetterCandidate_I7lrPNg$minorAxisDistance = (long) isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i2, rect);
        return (13 * jIsBetterCandidate_I7lrPNg$majorAxisDistance * jIsBetterCandidate_I7lrPNg$majorAxisDistance) + (jIsBetterCandidate_I7lrPNg$minorAxisDistance * jIsBetterCandidate_I7lrPNg$minorAxisDistance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m7929searchChildren4C6V_qg(FocusTargetNode focusTargetNode, Rect rect, int i2, l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode focusTargetNodeM7925findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        if (!focusTargetNode2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode2.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode2.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & 1024) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
                                if (focusTargetNode3.isAttached()) {
                                    mutableVector.add(focusTargetNode3);
                                }
                            } else if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                            }
                                            mutableVector3.add(delegate$ui);
                                            nodePop = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
        while (mutableVector.getSize() != 0 && (focusTargetNodeM7925findBestCandidate4WY_MpI = m7925findBestCandidate4WY_MpI(mutableVector, rect, i2)) != null) {
            if (focusTargetNodeM7925findBestCandidate4WY_MpI.fetchFocusProperties$ui().getCanFocus()) {
                return lVar.invoke(focusTargetNodeM7925findBestCandidate4WY_MpI).booleanValue();
            }
            if (m7927generateAndSearchChildren4C6V_qg(focusTargetNodeM7925findBestCandidate4WY_MpI, rect, i2, lVar)) {
                return true;
            }
            mutableVector.remove(focusTargetNodeM7925findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    /* renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final Boolean m7930twoDimensionalFocusSearchsMXa3k8(FocusTargetNode focusTargetNode, int i2, Rect rect, l<? super FocusTargetNode, Boolean> lVar) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
                if (activeChild == null) {
                    throw new IllegalStateException(NoActiveChild);
                }
                int iOrdinal2 = activeChild.getFocusState().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM7930twoDimensionalFocusSearchsMXa3k8 = m7930twoDimensionalFocusSearchsMXa3k8(activeChild, i2, rect, lVar);
                        if (!x.n(boolM7930twoDimensionalFocusSearchsMXa3k8, false)) {
                            return boolM7930twoDimensionalFocusSearchsMXa3k8;
                        }
                        if (rect == null) {
                            rect = FocusTraversalKt.focusRect(activeNode(activeChild));
                        }
                        return Boolean.valueOf(m7927generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i2, lVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new i();
                        }
                        throw new IllegalStateException(NoActiveChild);
                    }
                }
                if (rect == null) {
                    rect = FocusTraversalKt.focusRect(activeChild);
                }
                return Boolean.valueOf(m7927generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i2, lVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.fetchFocusProperties$ui().getCanFocus() ? lVar.invoke(focusTargetNode) : rect == null ? Boolean.valueOf(m7926findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i2, lVar)) : Boolean.valueOf(m7929searchChildren4C6V_qg(focusTargetNode, rect, i2, lVar));
                }
                throw new i();
            }
        }
        return Boolean.valueOf(m7926findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i2, lVar));
    }
}
