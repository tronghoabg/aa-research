package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.style.StyleModifierKt;
import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.text.TextStyle;
import h.g.a.l;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextStyleProviderNodeKt {
    /* renamed from: inheritedTextStyle-Bh5OqGs, reason: not valid java name */
    public static final TextStyle m3838inheritedTextStyleBh5OqGs(DelegatableNode delegatableNode, final int i2, final TextStyle textStyle) {
        final aq aqVar = new aq();
        aqVar.f48105a = textStyle;
        TraversableNodeKt.traverseAncestors(delegatableNode, StyleModifierKt.OuterNodeKey, new l() { // from class: androidx.compose.foundation.text.modifiers.TextStyleProviderNodeKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TextStyleProviderNodeKt.inheritedTextStyle_Bh5OqGs$lambda$0(aqVar, i2, textStyle, (TraversableNode) obj));
            }
        });
        return (TextStyle) aqVar.f48105a;
    }

    static final boolean inheritedTextStyle_Bh5OqGs$lambda$0(aq aqVar, int i2, TextStyle textStyle, TraversableNode traversableNode) {
        if (!(traversableNode instanceof StyleOuterNode)) {
            return true;
        }
        aqVar.f48105a = ((StyleOuterNode) traversableNode).mo3152computeInheritedTextStyleBLjeIk(i2, textStyle);
        return false;
    }
}
