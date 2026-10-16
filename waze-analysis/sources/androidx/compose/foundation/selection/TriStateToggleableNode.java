package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.autofill.FillableData_androidKt;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TriStateToggleableNode extends ClickableNode {
    private ToggleableState state;

    private TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, Role role, a<ab> aVar) {
        super(mutableInteractionSource, indicationNodeFactory, z, z2, null, role, aVar, null);
        this.state = toggleableState;
    }

    static final boolean applyAdditionalSemantics$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver, FillableData fillableData) {
        Boolean booleanValue = fillableData.getBooleanValue();
        if (booleanValue == null) {
            return false;
        }
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(booleanValue.booleanValue()));
        return true;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, this.state);
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getToggle());
        SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, FillableData_androidKt.createFromBoolean(FillableData.Companion, this.state != ToggleableState.Indeterminate));
        SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.selection.TriStateToggleableNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TriStateToggleableNode.applyAdditionalSemantics$lambda$1(semanticsPropertyReceiver, (FillableData) obj));
            }
        }, 1, null);
    }

    /* renamed from: update-O2vRcR0, reason: not valid java name */
    public final void m3068updateO2vRcR0(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, Role role, a<ab> aVar) {
        if (this.state != toggleableState) {
            this.state = toggleableState;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        super.m2022updateO2vRcR0(mutableInteractionSource, indicationNodeFactory, z, z2, (String) null, role, aVar);
    }

    public /* synthetic */ TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, Role role, a aVar, o oVar) {
        this(toggleableState, mutableInteractionSource, indicationNodeFactory, z, z2, role, aVar);
    }
}
