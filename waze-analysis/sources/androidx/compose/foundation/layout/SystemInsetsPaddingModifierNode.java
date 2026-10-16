package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.LayoutModifierNode;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SystemInsetsPaddingModifierNode extends InsetsPaddingModifierNode implements LayoutModifierNode {
    private l<? super WindowInsetsHolder, ? extends WindowInsets> insetsGetter;
    private WindowInsetsHolder windowInsetsHolder;

    public SystemInsetsPaddingModifierNode(l<? super WindowInsetsHolder, ? extends WindowInsets> lVar) {
        super(WindowInsetsKt.WindowInsets());
        this.insetsGetter = lVar;
    }

    public final WindowInsetsHolder getWindowInsetsHolder() {
        return this.windowInsetsHolder;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode, androidx.compose.ui.Modifier.Node
    public void onAttach() {
        View viewRequireView = DelegatableNode_androidKt.requireView(this);
        WindowInsetsHolder orCreateFor = WindowInsetsHolder.Companion.getOrCreateFor(viewRequireView);
        orCreateFor.incrementAccessors(viewRequireView);
        update(this.insetsGetter.invoke(orCreateFor));
        this.windowInsetsHolder = orCreateFor;
        super.onAttach();
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode, androidx.compose.ui.Modifier.Node
    public void onDetach() {
        View viewRequireView = DelegatableNode_androidKt.requireView(this);
        WindowInsetsHolder windowInsetsHolder = this.windowInsetsHolder;
        if (windowInsetsHolder != null) {
            windowInsetsHolder.decrementAccessors(viewRequireView);
        }
        super.onDetach();
    }

    public final void setWindowInsetsHolder(WindowInsetsHolder windowInsetsHolder) {
        this.windowInsetsHolder = windowInsetsHolder;
    }

    public final void update(l<? super WindowInsetsHolder, ? extends WindowInsets> lVar) {
        if (this.insetsGetter != lVar) {
            this.insetsGetter = lVar;
            WindowInsetsHolder windowInsetsHolder = this.windowInsetsHolder;
            if (windowInsetsHolder != null) {
                update(lVar.invoke(windowInsetsHolder));
            }
        }
    }
}
