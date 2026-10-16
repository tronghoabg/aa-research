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
import androidx.compose.ui.state.ToggleableStateKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ToggleableNode extends ClickableNode {
    private final a<ab> _onClick;
    private l<? super Boolean, ab> onValueChange;
    private boolean value;

    private ToggleableNode(final boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, final l<? super Boolean, ab> lVar) {
        super(mutableInteractionSource, indicationNodeFactory, z2, z3, null, role, new a() { // from class: androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return ToggleableNode._init_$lambda$0(lVar, z);
            }
        }, null);
        this.value = z;
        this.onValueChange = lVar;
        this._onClick = new a() { // from class: androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return ToggleableNode._onClick$lambda$0(this.f$0);
            }
        };
    }

    static final ab _init_$lambda$0(l lVar, boolean z) {
        lVar.invoke(Boolean.valueOf(!z));
        return ab.f48028a;
    }

    static final ab _onClick$lambda$0(ToggleableNode toggleableNode) {
        toggleableNode.onValueChange.invoke(Boolean.valueOf(!toggleableNode.value));
        return ab.f48028a;
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
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(this.value));
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getToggle());
        SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, FillableData_androidKt.createFromBoolean(FillableData.Companion, this.value));
        SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ToggleableNode.applyAdditionalSemantics$lambda$1(semanticsPropertyReceiver, (FillableData) obj));
            }
        }, 1, null);
    }

    public final a<ab> get_onClick() {
        return this._onClick;
    }

    /* renamed from: update-O2vRcR0, reason: not valid java name */
    public final void m3067updateO2vRcR0(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, l<? super Boolean, ab> lVar) {
        if (this.value != z) {
            this.value = z;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.onValueChange = lVar;
        super.m2022updateO2vRcR0(mutableInteractionSource, indicationNodeFactory, z2, z3, (String) null, role, this._onClick);
    }

    public /* synthetic */ ToggleableNode(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, l lVar, o oVar) {
        this(z, mutableInteractionSource, indicationNodeFactory, z2, z3, role, lVar);
    }
}
