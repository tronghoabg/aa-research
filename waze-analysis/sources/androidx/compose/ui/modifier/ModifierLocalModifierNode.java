package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalModifierNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r1v9 */
        public static Object $default$getCurrent(ModifierLocalModifierNode modifierLocalModifierNode, ModifierLocal modifierLocal) {
            NodeChain nodes$ui;
            if (!modifierLocalModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("ModifierLocal accessed from an unattached node");
            }
            ModifierLocalModifierNode modifierLocalModifierNode2 = modifierLocalModifierNode;
            if (!modifierLocalModifierNode2.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = modifierLocalModifierNode2.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(modifierLocalModifierNode2);
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 32) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 32) != 0) {
                            DelegatingNode delegatingNodePop = parent$ui;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof ModifierLocalModifierNode) {
                                    ModifierLocalModifierNode modifierLocalModifierNode3 = (ModifierLocalModifierNode) delegatingNodePop;
                                    if (modifierLocalModifierNode3.getProvidedValues().contains$ui(modifierLocal)) {
                                        return modifierLocalModifierNode3.getProvidedValues().get$ui(modifierLocal);
                                    }
                                } else if ((delegatingNodePop.getKindSet$ui() & 32) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                                    int i2 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & 32) != 0) {
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
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            return modifierLocal.getDefaultFactory$ui().invoke();
        }

        public static void $default$provide(ModifierLocalModifierNode modifierLocalModifierNode, ModifierLocal modifierLocal, Object obj) {
            if (modifierLocalModifierNode.getProvidedValues() == EmptyMap.INSTANCE) {
                InlineClassHelperKt.throwIllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
            }
            if (!modifierLocalModifierNode.getProvidedValues().contains$ui(modifierLocal)) {
                InlineClassHelperKt.throwIllegalArgumentException("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.");
            }
            modifierLocalModifierNode.getProvidedValues().mo9902set$ui(modifierLocal, obj);
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    <T> T getCurrent(ModifierLocal<T> modifierLocal);

    ModifierLocalMap getProvidedValues();

    <T> void provide(ModifierLocal<T> modifierLocal, T t);
}
