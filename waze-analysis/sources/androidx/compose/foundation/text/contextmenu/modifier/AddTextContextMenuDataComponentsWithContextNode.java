package androidx.compose.foundation.text.contextmenu.modifier;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h.ab;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AddTextContextMenuDataComponentsWithContextNode extends DelegatingNode implements CompositionLocalConsumerModifierNode {
    private p<? super TextContextMenuBuilderScope, ? super Context, ab> builder;

    public AddTextContextMenuDataComponentsWithContextNode(p<? super TextContextMenuBuilderScope, ? super Context, ab> pVar) {
        this.builder = pVar;
        delegate(new AddTextContextMenuDataComponentsNode(new l() { // from class: androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AddTextContextMenuDataComponentsWithContextNode._init_$lambda$0(this.f$0, (TextContextMenuBuilderScope) obj);
            }
        }));
    }

    static final ab _init_$lambda$0(AddTextContextMenuDataComponentsWithContextNode addTextContextMenuDataComponentsWithContextNode, TextContextMenuBuilderScope textContextMenuBuilderScope) {
        addTextContextMenuDataComponentsWithContextNode.builder.invoke(textContextMenuBuilderScope, CompositionLocalConsumerModifierNodeKt.currentValueOf(addTextContextMenuDataComponentsWithContextNode, AndroidCompositionLocals_androidKt.getLocalContext()));
        return ab.f48028a;
    }

    public final p<TextContextMenuBuilderScope, Context, ab> getBuilder() {
        return this.builder;
    }

    public final void setBuilder(p<? super TextContextMenuBuilderScope, ? super Context, ab> pVar) {
        this.builder = pVar;
    }
}
