package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuModifierKt {
    private static final boolean continueTraversal = true;
    private static final String wrongNodeTypeErrorMessage = "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.";

    public static final Modifier appendTextContextMenuComponents(Modifier modifier, l<? super TextContextMenuBuilderScope, ab> lVar) {
        return modifier.then(new AddTextContextMenuDataComponentsElement(lVar));
    }

    public static final TextContextMenuData collectTextContextMenuData(DelegatableNode delegatableNode) {
        final TextContextMenuBuilderScope textContextMenuBuilderScope = new TextContextMenuBuilderScope();
        traverseTextContextMenuDataNodes(delegatableNode, new TextContextMenuModifierKt$collectTextContextMenuData$1$1(textContextMenuBuilderScope), new l() { // from class: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextContextMenuModifierKt.collectTextContextMenuData$lambda$0$0(textContextMenuBuilderScope, (l) obj);
            }
        });
        return textContextMenuBuilderScope.build$foundation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab collectTextContextMenuData$lambda$0$0(TextContextMenuBuilderScope textContextMenuBuilderScope, l lVar) {
        lVar.invoke(textContextMenuBuilderScope);
        return ab.f48028a;
    }

    public static final Modifier filterTextContextMenuComponents(Modifier modifier, l<? super TextContextMenuComponent, Boolean> lVar) {
        return modifier.then(new FilterTextContextMenuDataComponentsElement(lVar));
    }

    private static final void traverseTextContextMenuDataNodes(DelegatableNode delegatableNode, final l<? super l<? super TextContextMenuComponent, Boolean>, ab> lVar, final l<? super l<? super TextContextMenuBuilderScope, ab>, ab> lVar2) {
        TraversableNodeKt.traverseAncestors(delegatableNode, TextContextMenuDataTraverseKey.INSTANCE, new l() { // from class: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                TextContextMenuModifierKt.traverseTextContextMenuDataNodes$lambda$0(lVar2, lVar, (TraversableNode) obj);
                return true;
            }
        });
    }

    static final boolean traverseTextContextMenuDataNodes$lambda$0(l lVar, l lVar2, TraversableNode traversableNode) {
        if (traversableNode instanceof AddTextContextMenuDataComponentsNode) {
            lVar.invoke(((AddTextContextMenuDataComponentsNode) traversableNode).getBuilder());
            return true;
        }
        if (!(traversableNode instanceof FilterTextContextMenuDataComponentsNode)) {
            throw new IllegalStateException(wrongNodeTypeErrorMessage);
        }
        lVar2.invoke(((FilterTextContextMenuDataComponentsNode) traversableNode).getFilter());
        return true;
    }
}
