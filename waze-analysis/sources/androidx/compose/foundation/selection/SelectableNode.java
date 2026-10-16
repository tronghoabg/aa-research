package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SelectableNode extends ClickableNode {
    private boolean selected;

    private SelectableNode(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, a<ab> aVar) {
        super(mutableInteractionSource, indicationNodeFactory, z2, z3, null, role, aVar, null);
        this.selected = z;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, this.selected);
    }

    /* renamed from: update-O2vRcR0, reason: not valid java name */
    public final void m3054updateO2vRcR0(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, a<ab> aVar) {
        if (this.selected != z) {
            this.selected = z;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        super.m2022updateO2vRcR0(mutableInteractionSource, indicationNodeFactory, z2, z3, (String) null, role, aVar);
    }

    public /* synthetic */ SelectableNode(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, a aVar, o oVar) {
        this(z, mutableInteractionSource, indicationNodeFactory, z2, z3, role, aVar);
    }
}
