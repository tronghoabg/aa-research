package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import h.g.b.y;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean captureFocus(FocusTargetNode focusTargetNode) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal == 0) {
            DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(true);
            focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Captured);
            return true;
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new i();
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(false);
                focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Captured, FocusStateImpl.Active);
                return true;
            }
            if (iOrdinal != 3) {
                throw new i();
            }
        }
        return false;
    }

    private static final boolean grantFocus(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new AnonymousClass1(focusTargetNode));
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(focusTargetNode);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new i();
                }
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(focusTargetNode);
            }
        }
        return true;
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m7898performCustomClearFocusMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                CustomDestinationResult customDestinationResultM7898performCustomClearFocusMxy_nc0 = m7898performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i2);
                if (customDestinationResultM7898performCustomClearFocusMxy_nc0 == CustomDestinationResult.None) {
                    customDestinationResultM7898performCustomClearFocusMxy_nc0 = null;
                }
                return customDestinationResultM7898performCustomClearFocusMxy_nc0 == null ? m7900performCustomExitMxy_nc0(focusTargetNode, i2) : customDestinationResultM7898performCustomClearFocusMxy_nc0;
            }
            if (iOrdinal == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (iOrdinal != 3) {
                throw new i();
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:5:0x000b, B:7:0x0038, B:9:0x0046, B:10:0x0049, B:12:0x0051, B:13:0x0054, B:15:0x005a, B:16:0x005d, B:19:0x0064, B:22:0x0073, B:25:0x007c), top: B:36:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:5:0x000b, B:7:0x0038, B:9:0x0046, B:10:0x0049, B:12:0x0051, B:13:0x0054, B:15:0x005a, B:16:0x005d, B:19:0x0064, B:22:0x0073, B:25:0x007c), top: B:36:0x000b }] */
    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.ui.focus.CustomDestinationResult m7899performCustomEnterMxy_nc0(androidx.compose.ui.focus.FocusTargetNode r7, int r8) {
        /*
            boolean r0 = androidx.compose.ui.focus.FocusTargetNode.access$isProcessingCustomEnter$p(r7)
            if (r0 != 0) goto L90
            r0 = 1
            androidx.compose.ui.focus.FocusTargetNode.access$setProcessingCustomEnter$p(r7, r0)
            r1 = 0
            androidx.compose.ui.focus.FocusProperties r2 = r7.fetchFocusProperties$ui()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope r3 = new androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope     // Catch: java.lang.Throwable -> L8b
            r4 = 0
            r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L8b
            r8 = r7
            androidx.compose.ui.node.DelegatableNode r8 = (androidx.compose.ui.node.DelegatableNode) r8     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.node.Owner r8 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r8)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusOwner r8 = r8.getFocusOwner()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusTargetNode r5 = r8.getActiveFocusTargetNode()     // Catch: java.lang.Throwable -> L8b
            r6 = r3
            androidx.compose.ui.focus.FocusEnterExitScope r6 = (androidx.compose.ui.focus.FocusEnterExitScope) r6     // Catch: java.lang.Throwable -> L8b
            h.g.a.l r2 = r2.getOnEnter()     // Catch: java.lang.Throwable -> L8b
            r2.invoke(r6)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusTargetNode r8 = r8.getActiveFocusTargetNode()     // Catch: java.lang.Throwable -> L8b
            boolean r2 = r3.isCanceled()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L60
            androidx.compose.ui.focus.FocusRequester$Companion r8 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r8 = r8.getCancel()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r2 = r2.getCancel()     // Catch: java.lang.Throwable -> L8b
            if (r8 != r2) goto L49
        L46:
            androidx.compose.ui.focus.CustomDestinationResult r8 = androidx.compose.ui.focus.CustomDestinationResult.Cancelled     // Catch: java.lang.Throwable -> L8b
            goto L83
        L49:
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r2 = r2.getRedirect$ui()     // Catch: java.lang.Throwable -> L8b
            if (r8 != r2) goto L54
        L51:
            androidx.compose.ui.focus.CustomDestinationResult r8 = androidx.compose.ui.focus.CustomDestinationResult.Redirected     // Catch: java.lang.Throwable -> L8b
            goto L83
        L54:
            boolean r8 = androidx.compose.ui.focus.FocusRequester.m7885requestFocus3ESFkO8$default(r8, r1, r0, r4)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L5d
        L5a:
            androidx.compose.ui.focus.CustomDestinationResult r8 = androidx.compose.ui.focus.CustomDestinationResult.Redirected     // Catch: java.lang.Throwable -> L8b
            goto L83
        L5d:
            androidx.compose.ui.focus.CustomDestinationResult r8 = androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled     // Catch: java.lang.Throwable -> L8b
            goto L83
        L60:
            if (r5 == r8) goto L87
            if (r8 == 0) goto L87
            androidx.compose.ui.focus.FocusRequester$Companion r8 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r8 = r8.getRedirect$ui()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r2 = r2.getCancel()     // Catch: java.lang.Throwable -> L8b
            if (r8 != r2) goto L73
            goto L46
        L73:
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r2 = r2.getRedirect$ui()     // Catch: java.lang.Throwable -> L8b
            if (r8 != r2) goto L7c
            goto L51
        L7c:
            boolean r8 = androidx.compose.ui.focus.FocusRequester.m7885requestFocus3ESFkO8$default(r8, r1, r0, r4)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L5d
            goto L5a
        L83:
            androidx.compose.ui.focus.FocusTargetNode.access$setProcessingCustomEnter$p(r7, r1)
            return r8
        L87:
            androidx.compose.ui.focus.FocusTargetNode.access$setProcessingCustomEnter$p(r7, r1)
            goto L90
        L8b:
            r8 = move-exception
            androidx.compose.ui.focus.FocusTargetNode.access$setProcessingCustomEnter$p(r7, r1)
            throw r8
        L90:
            androidx.compose.ui.focus.CustomDestinationResult r7 = androidx.compose.ui.focus.CustomDestinationResult.None
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.m7899performCustomEnterMxy_nc0(androidx.compose.ui.focus.FocusTargetNode, int):androidx.compose.ui.focus.CustomDestinationResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:5:0x000b, B:7:0x0038, B:9:0x0046, B:10:0x0049, B:12:0x0051, B:13:0x0054, B:15:0x005a, B:16:0x005d, B:19:0x0064, B:22:0x0073, B:25:0x007c), top: B:36:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:5:0x000b, B:7:0x0038, B:9:0x0046, B:10:0x0049, B:12:0x0051, B:13:0x0054, B:15:0x005a, B:16:0x005d, B:19:0x0064, B:22:0x0073, B:25:0x007c), top: B:36:0x000b }] */
    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.ui.focus.CustomDestinationResult m7900performCustomExitMxy_nc0(androidx.compose.ui.focus.FocusTargetNode r7, int r8) {
        /*
            boolean r0 = androidx.compose.ui.focus.FocusTargetNode.access$isProcessingCustomExit$p(r7)
            if (r0 != 0) goto L90
            r0 = 1
            androidx.compose.ui.focus.FocusTargetNode.access$setProcessingCustomExit$p(r7, r0)
            r1 = 0
            androidx.compose.ui.focus.FocusProperties r2 = r7.fetchFocusProperties$ui()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope r3 = new androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope     // Catch: java.lang.Throwable -> L8b
            r4 = 0
            r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L8b
            r8 = r7
            androidx.compose.ui.node.DelegatableNode r8 = (androidx.compose.ui.node.DelegatableNode) r8     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.node.Owner r8 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r8)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusOwner r8 = r8.getFocusOwner()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusTargetNode r5 = r8.getActiveFocusTargetNode()     // Catch: java.lang.Throwable -> L8b
            r6 = r3
            androidx.compose.ui.focus.FocusEnterExitScope r6 = (androidx.compose.ui.focus.FocusEnterExitScope) r6     // Catch: java.lang.Throwable -> L8b
            h.g.a.l r2 = r2.getOnExit()     // Catch: java.lang.Throwable -> L8b
            r2.invoke(r6)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusTargetNode r8 = r8.getActiveFocusTargetNode()     // Catch: java.lang.Throwable -> L8b
            boolean r2 = r3.isCanceled()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L60
            androidx.compose.ui.focus.FocusRequester$Companion r8 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r8 = r8.getCancel()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r2 = r2.getCancel()     // Catch: java.lang.Throwable -> L8b
            if (r8 != r2) goto L49
        L46:
            androidx.compose.ui.focus.CustomDestinationResult r8 = androidx.compose.ui.focus.CustomDestinationResult.Cancelled     // Catch: java.lang.Throwable -> L8b
            goto L83
        L49:
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r2 = r2.getRedirect$ui()     // Catch: java.lang.Throwable -> L8b
            if (r8 != r2) goto L54
        L51:
            androidx.compose.ui.focus.CustomDestinationResult r8 = androidx.compose.ui.focus.CustomDestinationResult.Redirected     // Catch: java.lang.Throwable -> L8b
            goto L83
        L54:
            boolean r8 = androidx.compose.ui.focus.FocusRequester.m7885requestFocus3ESFkO8$default(r8, r1, r0, r4)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L5d
        L5a:
            androidx.compose.ui.focus.CustomDestinationResult r8 = androidx.compose.ui.focus.CustomDestinationResult.Redirected     // Catch: java.lang.Throwable -> L8b
            goto L83
        L5d:
            androidx.compose.ui.focus.CustomDestinationResult r8 = androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled     // Catch: java.lang.Throwable -> L8b
            goto L83
        L60:
            if (r5 == r8) goto L87
            if (r8 == 0) goto L87
            androidx.compose.ui.focus.FocusRequester$Companion r8 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r8 = r8.getRedirect$ui()     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r2 = r2.getCancel()     // Catch: java.lang.Throwable -> L8b
            if (r8 != r2) goto L73
            goto L46
        L73:
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.ui.focus.FocusRequester.Companion     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.focus.FocusRequester r2 = r2.getRedirect$ui()     // Catch: java.lang.Throwable -> L8b
            if (r8 != r2) goto L7c
            goto L51
        L7c:
            boolean r8 = androidx.compose.ui.focus.FocusRequester.m7885requestFocus3ESFkO8$default(r8, r1, r0, r4)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L5d
            goto L5a
        L83:
            androidx.compose.ui.focus.FocusTargetNode.access$setProcessingCustomExit$p(r7, r1)
            return r8
        L87:
            androidx.compose.ui.focus.FocusTargetNode.access$setProcessingCustomExit$p(r7, r1)
            goto L90
        L8b:
            r8 = move-exception
            androidx.compose.ui.focus.FocusTargetNode.access$setProcessingCustomExit$p(r7, r1)
            throw r8
        L90:
            androidx.compose.ui.focus.CustomDestinationResult r7 = androidx.compose.ui.focus.CustomDestinationResult.None
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.m7900performCustomExitMxy_nc0(androidx.compose.ui.focus.FocusTargetNode, int):androidx.compose.ui.focus.CustomDestinationResult");
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m7901performCustomRequestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        Modifier.Node nodePop;
        NodeChain nodes$ui;
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return m7898performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i2);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new i();
                }
                FocusTargetNode focusTargetNode2 = focusTargetNode;
                if (!focusTargetNode2.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui = focusTargetNode2.getNode().getParent$ui();
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
                loop0: while (true) {
                    if (layoutNodeRequireLayoutNode == null) {
                        nodePop = null;
                        break;
                    }
                    if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 1024) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                                nodePop = parent$ui;
                                MutableVector mutableVector = null;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                            if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodePop = delegate$ui;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop != null) {
                                                        mutableVector.add(nodePop);
                                                    }
                                                    mutableVector.add(delegate$ui);
                                                    nodePop = null;
                                                }
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    nodePop = DelegatableNodeKt.pop(mutableVector);
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                        }
                    }
                    layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                    parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
                if (focusTargetNode3 == null) {
                    return CustomDestinationResult.None;
                }
                int iOrdinal2 = focusTargetNode3.getFocusState().ordinal();
                if (iOrdinal2 == 0) {
                    return m7899performCustomEnterMxy_nc0(focusTargetNode3, i2);
                }
                if (iOrdinal2 == 1) {
                    return m7901performCustomRequestFocusMxy_nc0(focusTargetNode3, i2);
                }
                if (iOrdinal2 == 2) {
                    return CustomDestinationResult.Cancelled;
                }
                if (iOrdinal2 != 3) {
                    throw new i();
                }
                CustomDestinationResult customDestinationResultM7901performCustomRequestFocusMxy_nc0 = m7901performCustomRequestFocusMxy_nc0(focusTargetNode3, i2);
                CustomDestinationResult customDestinationResult = customDestinationResultM7901performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None ? customDestinationResultM7901performCustomRequestFocusMxy_nc0 : null;
                return customDestinationResult == null ? m7899performCustomEnterMxy_nc0(focusTargetNode3, i2) : customDestinationResult;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    public static final boolean performRequestFocus(FocusTargetNode focusTargetNode) {
        MutableVector mutableVector;
        NodeChain nodes$ui;
        FocusTargetNode focusTargetNode2;
        boolean z;
        boolean z2;
        FocusOwner focusOwner;
        FocusOwner focusOwner2;
        Boolean boolValueOf;
        NodeChain nodes$ui2;
        NodeChain nodes$ui3;
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusOwner focusOwner3 = DelegatableNodeKt.requireOwner(focusTargetNode3).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner3.getActiveFocusTargetNode();
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        boolean z3 = true;
        if (activeFocusTargetNode == focusTargetNode) {
            FocusStateImpl focusStateImpl = focusState;
            focusTargetNode.dispatchFocusCallbacks$ui(focusStateImpl, focusStateImpl);
            return true;
        }
        int i2 = 0;
        MutableVector mutableVector2 = null;
        if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if ((activeFocusTargetNode == null || activeFocusTargetNode.isInteropViewHost()) && !focusTargetNode.isInteropViewHost() && !m7903requestOwnerFocusEtdf9zw$default(focusTargetNode, null, null, 3, null)) {
                return false;
            }
        } else if (activeFocusTargetNode == null && !m7903requestOwnerFocusEtdf9zw$default(focusTargetNode, null, null, 3, null)) {
            return false;
        }
        int i3 = 16;
        if (activeFocusTargetNode != null) {
            mutableVector = new MutableVector(new FocusTargetNode[16], 0);
            FocusTargetNode focusTargetNode4 = activeFocusTargetNode;
            if (!focusTargetNode4.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = focusTargetNode4.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode4);
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                            MutableVector mutableVector3 = mutableVector2;
                            Modifier.Node nodePop = parent$ui;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) nodePop);
                                } else {
                                    if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui();
                                        int i4 = i2;
                                        while (delegate$ui != null) {
                                            if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    nodePop = delegate$ui;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[i3], 0);
                                                    }
                                                    if (nodePop != null) {
                                                        mutableVector3.add(nodePop);
                                                    }
                                                    mutableVector3.add(delegate$ui);
                                                    nodePop = null;
                                                }
                                            }
                                            delegate$ui = delegate$ui.getChild$ui();
                                            i3 = 16;
                                        }
                                        if (i4 != 1) {
                                        }
                                    }
                                    i3 = 16;
                                    i2 = 0;
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector3);
                                i3 = 16;
                                i2 = 0;
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                        i3 = 16;
                        i2 = 0;
                        mutableVector2 = null;
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                if (layoutNodeRequireLayoutNode == null || (nodes$ui3 = layoutNodeRequireLayoutNode.getNodes$ui()) == null) {
                    i3 = 16;
                    i2 = 0;
                    mutableVector2 = null;
                    parent$ui = null;
                } else {
                    parent$ui = nodes$ui3.getTail$ui();
                    i3 = 16;
                    i2 = 0;
                    mutableVector2 = null;
                }
            }
        } else {
            mutableVector = null;
        }
        MutableVector mutableVector4 = new MutableVector(new FocusTargetNode[16], 0);
        MutableVector mutableVector5 = new MutableVector(new FocusTargetNode[16], 0);
        if (!focusTargetNode3.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui2 = focusTargetNode3.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode3);
        boolean z4 = true;
        while (layoutNodeRequireLayoutNode2 != null) {
            if ((layoutNodeRequireLayoutNode2.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui2 != null) {
                    if ((parent$ui2.getKindSet$ui() & 1024) != 0) {
                        FocusTargetNode focusTargetNodePop = parent$ui2;
                        MutableVector mutableVector6 = null;
                        while (focusTargetNodePop != 0) {
                            if (focusTargetNodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode5 = focusTargetNodePop;
                                if (mutableVector != null) {
                                    z = z3;
                                    boolValueOf = Boolean.valueOf(mutableVector.remove(focusTargetNode5));
                                } else {
                                    z = z3;
                                    boolValueOf = null;
                                }
                                focusTargetNode2 = focusTargetNode3;
                                if (x.n(boolValueOf, Boolean.valueOf(z))) {
                                    mutableVector4.add(focusTargetNode5);
                                } else {
                                    mutableVector5.add(focusTargetNode5);
                                }
                                z4 &= focusTargetNode5 == activeFocusTargetNode ? false : z;
                                z2 = false;
                            } else {
                                focusTargetNode2 = focusTargetNode3;
                                z = z3;
                                z2 = z;
                            }
                            if (z2 && (focusTargetNodePop.getKindSet$ui() & 1024) != 0 && (focusTargetNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui2 = focusTargetNodePop.getDelegate$ui();
                                int i5 = 0;
                                focusTargetNodePop = focusTargetNodePop;
                                while (delegate$ui2 != null) {
                                    Modifier.Node node = focusTargetNodePop;
                                    if ((delegate$ui2.getKindSet$ui() & 1024) == 0) {
                                        focusOwner2 = focusOwner3;
                                    } else {
                                        i5++;
                                        if (i5 == z) {
                                            node = delegate$ui2;
                                            focusOwner2 = focusOwner3;
                                        } else {
                                            if (mutableVector6 == null) {
                                                focusOwner2 = focusOwner3;
                                                mutableVector6 = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                focusOwner2 = focusOwner3;
                                            }
                                            if (focusTargetNodePop != 0) {
                                                mutableVector6.add(focusTargetNodePop);
                                            }
                                            mutableVector6.add(delegate$ui2);
                                            node = null;
                                        }
                                    }
                                    delegate$ui2 = delegate$ui2.getChild$ui();
                                    focusOwner3 = focusOwner2;
                                    z = true;
                                    focusTargetNodePop = node;
                                }
                                focusOwner = focusOwner3;
                                boolean z5 = z;
                                if (i5 != z5) {
                                    focusTargetNodePop = DelegatableNodeKt.pop(mutableVector6);
                                    focusTargetNode3 = focusTargetNode2;
                                    focusOwner3 = focusOwner;
                                    z3 = true;
                                } else {
                                    z3 = z5;
                                    focusTargetNode3 = focusTargetNode2;
                                    focusOwner3 = focusOwner;
                                }
                            } else {
                                focusOwner = focusOwner3;
                                focusTargetNodePop = DelegatableNodeKt.pop(mutableVector6);
                                focusTargetNode3 = focusTargetNode2;
                                focusOwner3 = focusOwner;
                                z3 = true;
                            }
                        }
                    }
                    parent$ui2 = parent$ui2.getParent$ui();
                    focusTargetNode3 = focusTargetNode3;
                    focusOwner3 = focusOwner3;
                    z3 = true;
                }
            }
            FocusTargetNode focusTargetNode6 = focusTargetNode3;
            FocusOwner focusOwner4 = focusOwner3;
            layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
            if (layoutNodeRequireLayoutNode2 == null || (nodes$ui2 = layoutNodeRequireLayoutNode2.getNodes$ui()) == null) {
                focusTargetNode3 = focusTargetNode6;
                focusOwner3 = focusOwner4;
                z3 = true;
                parent$ui2 = null;
            } else {
                parent$ui2 = nodes$ui2.getTail$ui();
                focusTargetNode3 = focusTargetNode6;
                focusOwner3 = focusOwner4;
                z3 = true;
            }
        }
        FocusTargetNode focusTargetNode7 = focusTargetNode3;
        FocusOwner focusOwner5 = focusOwner3;
        if (z4 && activeFocusTargetNode != null && !prepareToClearFocus$default(activeFocusTargetNode, false, true, 1, null)) {
            return false;
        }
        grantFocus(focusTargetNode);
        if (z4 && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
        }
        if (mutableVector != null) {
            int size = mutableVector.getSize() - 1;
            Object[] objArr = mutableVector.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    FocusTargetNode focusTargetNode8 = (FocusTargetNode) objArr[size];
                    if (focusOwner5.getActiveFocusTargetNode() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode8.dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    size--;
                }
            }
        }
        int size2 = mutableVector5.getSize() - 1;
        Object[] objArr2 = mutableVector5.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                FocusTargetNode focusTargetNode9 = (FocusTargetNode) objArr2[size2];
                if (focusOwner5.getActiveFocusTargetNode() != focusTargetNode) {
                    return false;
                }
                focusTargetNode9.dispatchFocusCallbacks$ui(focusTargetNode9 == activeFocusTargetNode ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                size2--;
            }
        }
        if (focusOwner5.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        focusTargetNode.dispatchFocusCallbacks$ui(focusState, FocusStateImpl.Active);
        if (focusOwner5.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        if (ComposeUiFlags.isFocusRestorationEnabled) {
            FocusTargetNode focusTargetNode10 = (FocusTargetNode) (mutableVector4.getSize() == 0 ? null : mutableVector4.content[mutableVector4.getSize() - 1]);
            if (!focusTargetNode7.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui3 = focusTargetNode7.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode3 = DelegatableNodeKt.requireLayoutNode(focusTargetNode7);
            loop10: while (layoutNodeRequireLayoutNode3 != null) {
                if ((layoutNodeRequireLayoutNode3.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui3 != null) {
                        if ((parent$ui3.getKindSet$ui() & 1024) != 0) {
                            Modifier.Node nodePop2 = parent$ui3;
                            MutableVector mutableVector7 = null;
                            while (nodePop2 != null) {
                                if (nodePop2 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode11 = (FocusTargetNode) nodePop2;
                                    FocusRestorerKt.saveFocusedChild(focusTargetNode11);
                                    if (focusTargetNode11 == focusTargetNode10) {
                                        break loop10;
                                    }
                                } else if ((nodePop2.getKindSet$ui() & 1024) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                    int i6 = 0;
                                    for (Modifier.Node delegate$ui3 = ((DelegatingNode) nodePop2).getDelegate$ui(); delegate$ui3 != null; delegate$ui3 = delegate$ui3.getChild$ui()) {
                                        if ((delegate$ui3.getKindSet$ui() & 1024) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                nodePop2 = delegate$ui3;
                                            } else {
                                                if (mutableVector7 == null) {
                                                    mutableVector7 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop2 != null) {
                                                    mutableVector7.add(nodePop2);
                                                }
                                                mutableVector7.add(delegate$ui3);
                                                nodePop2 = null;
                                            }
                                        }
                                    }
                                    if (i6 != 1) {
                                        nodePop2 = DelegatableNodeKt.pop(mutableVector7);
                                    }
                                }
                                nodePop2 = DelegatableNodeKt.pop(mutableVector7);
                            }
                        }
                        parent$ui3 = parent$ui3.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode3 = layoutNodeRequireLayoutNode3.getParent$ui();
                parent$ui3 = (layoutNodeRequireLayoutNode3 == null || (nodes$ui = layoutNodeRequireLayoutNode3.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
        }
        if (!ComposeUiFlags.isViewFocusFixEnabled || DelegatableNodeKt.requireLayoutNode(focusTargetNode7).getInteropView() != null) {
            return true;
        }
        m7902requestOwnerFocusEtdf9zw(focusTargetNode, FocusDirection.m7852boximpl(FocusDirection.Companion.m7863getNextdhqQ8s()), null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean prepareToClearChildFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return prepareToClearFocus(activeChild, z, z2);
        }
        return true;
    }

    public static final boolean prepareToClearFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal == 3) {
                return true;
            }
            throw new i();
        }
        if (!prepareToClearChildFocus(focusTargetNode, z, z2)) {
            return false;
        }
        if (!z2) {
            return true;
        }
        focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
        return true;
    }

    public static /* synthetic */ boolean prepareToClearFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i2, Object obj) {
        return prepareToClearFocus(focusTargetNode, 1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2);
    }

    /* renamed from: requestOwnerFocus-Etdf9zw, reason: not valid java name */
    private static final boolean m7902requestOwnerFocusEtdf9zw(FocusTargetNode focusTargetNode, FocusDirection focusDirection, Rect rect) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo7875requestOwnerFocus7o62pno(focusDirection, rect);
    }

    /* renamed from: requestOwnerFocus-Etdf9zw$default, reason: not valid java name */
    static /* synthetic */ boolean m7903requestOwnerFocusEtdf9zw$default(FocusTargetNode focusTargetNode, FocusDirection focusDirection, Rect rect, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            focusDirection = null;
        }
        if ((i2 & 2) != 0) {
            rect = null;
        }
        return m7902requestOwnerFocusEtdf9zw(focusTargetNode, focusDirection, rect);
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<ab> {
        final /* synthetic */ FocusTargetNode $this_grantFocus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FocusTargetNode focusTargetNode) {
            super(0);
            this.$this_grantFocus = focusTargetNode;
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_grantFocus.fetchFocusProperties$ui();
        }
    }
}
