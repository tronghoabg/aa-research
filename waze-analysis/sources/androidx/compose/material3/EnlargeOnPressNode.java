package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EnlargeOnPressNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private AnimationSpec<Float> animationSpec;
    private br collectionJob;
    private InteractionSource interactionSource;
    private final Animatable<Float, AnimationVector1D> pressedAnimatable = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    public EnlargeOnPressNode(InteractionSource interactionSource, AnimationSpec<Float> animationSpec) {
        this.interactionSource = interactionSource;
        this.animationSpec = animationSpec;
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void launchCollectionJob$material3() {
        br brVar = this.collectionJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.collectionJob = aj.z(getCoroutineScope(), null, null, new EnlargeOnPressNode$launchCollectionJob$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public ButtonGroupParentData modifyParentData(Density density, Object obj) {
        ButtonGroupParentData buttonGroupParentData = obj instanceof ButtonGroupParentData ? (ButtonGroupParentData) obj : null;
        return new ButtonGroupParentData(ButtonGroupKt.getWeight(buttonGroupParentData), this.pressedAnimatable, buttonGroupParentData != null ? buttonGroupParentData.getAlignment() : null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        launchCollectionJob$material3();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.collectionJob = null;
    }

    public final void setAnimationSpec(AnimationSpec<Float> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public final void setInteractionSource(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }
}
