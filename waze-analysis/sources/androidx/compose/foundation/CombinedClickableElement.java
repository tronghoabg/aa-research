package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {
    private final boolean enabled;
    private final boolean hapticFeedbackEnabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final a<ab> onClick;
    private final String onClickLabel;
    private final a<ab> onDoubleClick;
    private final a<ab> onLongClick;
    private final String onLongClickLabel;
    private final Role role;
    private final boolean useLocalIndication;

    private CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, a<ab> aVar, String str2, a<ab> aVar2, a<ab> aVar3, boolean z3) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.enabled = z2;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = aVar;
        this.onLongClickLabel = str2;
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
        this.hapticFeedbackEnabled = z3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CombinedClickableNode create() {
        return new CombinedClickableNode(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.hapticFeedbackEnabled, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return x.n(this.interactionSource, combinedClickableElement.interactionSource) && x.n(this.indicationNodeFactory, combinedClickableElement.indicationNodeFactory) && this.useLocalIndication == combinedClickableElement.useLocalIndication && this.enabled == combinedClickableElement.enabled && x.n(this.onClickLabel, combinedClickableElement.onClickLabel) && x.n(this.role, combinedClickableElement.role) && this.onClick == combinedClickableElement.onClick && x.n(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && this.onLongClick == combinedClickableElement.onLongClick && this.onDoubleClick == combinedClickableElement.onDoubleClick && this.hapticFeedbackEnabled == combinedClickableElement.hapticFeedbackEnabled;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int iHashCode = mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int iHashCode2 = indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0;
        int i2 = iHashCode * 31;
        boolean z = this.useLocalIndication;
        boolean z2 = this.enabled;
        String str = this.onClickLabel;
        int iM = (((((((i2 + iHashCode2) * 31) + CombinedClickableElement$$ExternalSyntheticBackport0.m(z)) * 31) + CombinedClickableElement$$ExternalSyntheticBackport0.m(z2)) * 31) + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.role;
        int iM10315unboximpl = (((iM + (role != null ? role.m10315unboximpl() : 0)) * 31) + this.onClick.hashCode()) * 31;
        String str2 = this.onLongClickLabel;
        int iHashCode3 = (iM10315unboximpl + (str2 != null ? str2.hashCode() : 0)) * 31;
        a<ab> aVar = this.onLongClick;
        int iHashCode4 = (iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<ab> aVar2 = this.onDoubleClick;
        return ((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + CombinedClickableElement$$ExternalSyntheticBackport0.m(this.hapticFeedbackEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("combinedClickable");
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("onClickLabel", this.onClickLabel);
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("onClick", this.onClick);
        inspectorInfo.getProperties().set("onDoubleClick", this.onDoubleClick);
        inspectorInfo.getProperties().set("onLongClick", this.onLongClick);
        inspectorInfo.getProperties().set("onLongClickLabel", this.onLongClickLabel);
        inspectorInfo.getProperties().set("hapticFeedbackEnabled", Boolean.valueOf(this.hapticFeedbackEnabled));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CombinedClickableNode combinedClickableNode) {
        combinedClickableNode.setHapticFeedbackEnabled(this.hapticFeedbackEnabled);
        combinedClickableNode.m2024update2tQrsxU(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role);
    }

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, a aVar, String str2, a aVar2, a aVar3, boolean z3, o oVar) {
        this(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, aVar, str2, aVar2, aVar3, z3);
    }
}
