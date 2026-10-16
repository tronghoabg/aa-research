package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FabVisibleModifier extends ModifierNodeElement<FabVisibleNode> {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final AnimationSpec<Float> alphaAnimationSpec;
    private final AnimationSpec<Float> scaleAnimationSpec;
    private final float targetScale;
    private final boolean visible;

    public /* synthetic */ FabVisibleModifier(boolean z, Alignment alignment, float f2, AnimationSpec animationSpec, AnimationSpec animationSpec2, int i2, o oVar) {
        this(z, alignment, f2, (i2 & 8) != 0 ? null : animationSpec, (i2 & 16) != 0 ? null : animationSpec2);
    }

    private final boolean component1() {
        return this.visible;
    }

    private final Alignment component2() {
        return this.alignment;
    }

    private final float component3() {
        return this.targetScale;
    }

    private final AnimationSpec<Float> component4() {
        return this.scaleAnimationSpec;
    }

    private final AnimationSpec<Float> component5() {
        return this.alphaAnimationSpec;
    }

    public static /* synthetic */ FabVisibleModifier copy$default(FabVisibleModifier fabVisibleModifier, boolean z, Alignment alignment, float f2, AnimationSpec animationSpec, AnimationSpec animationSpec2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = fabVisibleModifier.visible;
        }
        if ((i2 & 2) != 0) {
            alignment = fabVisibleModifier.alignment;
        }
        if ((i2 & 4) != 0) {
            f2 = fabVisibleModifier.targetScale;
        }
        if ((i2 & 8) != 0) {
            animationSpec = fabVisibleModifier.scaleAnimationSpec;
        }
        if ((i2 & 16) != 0) {
            animationSpec2 = fabVisibleModifier.alphaAnimationSpec;
        }
        AnimationSpec animationSpec3 = animationSpec2;
        float f3 = f2;
        return fabVisibleModifier.copy(z, alignment, f3, animationSpec, animationSpec3);
    }

    public final FabVisibleModifier copy(boolean z, Alignment alignment, float f2, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        return new FabVisibleModifier(z, alignment, f2, animationSpec, animationSpec2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FabVisibleNode create() {
        return new FabVisibleNode(this.visible, this.alignment, this.targetScale, this.scaleAnimationSpec, this.alphaAnimationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FabVisibleModifier)) {
            return false;
        }
        FabVisibleModifier fabVisibleModifier = (FabVisibleModifier) obj;
        return this.visible == fabVisibleModifier.visible && x.n(this.alignment, fabVisibleModifier.alignment) && Float.compare(this.targetScale, fabVisibleModifier.targetScale) == 0 && x.n(this.scaleAnimationSpec, fabVisibleModifier.scaleAnimationSpec) && x.n(this.alphaAnimationSpec, fabVisibleModifier.alphaAnimationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM = (((FabVisibleModifier$$ExternalSyntheticBackport0.m(this.visible) * 31) + this.alignment.hashCode()) * 31) + Float.floatToIntBits(this.targetScale);
        AnimationSpec<Float> animationSpec = this.scaleAnimationSpec;
        int iHashCode = ((iM * 31) + (animationSpec == null ? 0 : animationSpec.hashCode())) * 31;
        AnimationSpec<Float> animationSpec2 = this.alphaAnimationSpec;
        return iHashCode + (animationSpec2 != null ? animationSpec2.hashCode() : 0);
    }

    public String toString() {
        return "FabVisibleModifier(visible=" + this.visible + ", alignment=" + this.alignment + ", targetScale=" + this.targetScale + ", scaleAnimationSpec=" + this.scaleAnimationSpec + ", alphaAnimationSpec=" + this.alphaAnimationSpec + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FabVisibleNode fabVisibleNode) {
        fabVisibleNode.updateNode(this.visible, this.alignment, this.targetScale, this.scaleAnimationSpec, this.alphaAnimationSpec);
    }

    public FabVisibleModifier(boolean z, Alignment alignment, float f2, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        this.visible = z;
        this.alignment = alignment;
        this.targetScale = f2;
        this.scaleAnimationSpec = animationSpec;
        this.alphaAnimationSpec = animationSpec2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
