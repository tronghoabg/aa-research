package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.Alignment;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ButtonGroupParentData {
    public static final int $stable = 8;
    private Alignment.Vertical alignment;
    private Animatable<Float, AnimationVector1D> pressedAnimatable;
    private float weight;

    public /* synthetic */ ButtonGroupParentData(float f2, Animatable animatable, Alignment.Vertical vertical, int i2, o oVar) {
        this(1 == (i2 & 1) ? 0.0f : f2, (i2 & 2) != 0 ? AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null) : animatable, (i2 & 4) != 0 ? null : vertical);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ButtonGroupParentData copy$default(ButtonGroupParentData buttonGroupParentData, float f2, Animatable animatable, Alignment.Vertical vertical, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = buttonGroupParentData.weight;
        }
        if ((i2 & 2) != 0) {
            animatable = buttonGroupParentData.pressedAnimatable;
        }
        if ((i2 & 4) != 0) {
            vertical = buttonGroupParentData.alignment;
        }
        return buttonGroupParentData.copy(f2, animatable, vertical);
    }

    public final float component1() {
        return this.weight;
    }

    public final Animatable<Float, AnimationVector1D> component2() {
        return this.pressedAnimatable;
    }

    public final Alignment.Vertical component3() {
        return this.alignment;
    }

    public final ButtonGroupParentData copy(float f2, Animatable<Float, AnimationVector1D> animatable, Alignment.Vertical vertical) {
        return new ButtonGroupParentData(f2, animatable, vertical);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonGroupParentData)) {
            return false;
        }
        ButtonGroupParentData buttonGroupParentData = (ButtonGroupParentData) obj;
        return Float.compare(this.weight, buttonGroupParentData.weight) == 0 && x.n(this.pressedAnimatable, buttonGroupParentData.pressedAnimatable) && x.n(this.alignment, buttonGroupParentData.alignment);
    }

    public final Alignment.Vertical getAlignment() {
        return this.alignment;
    }

    public final Animatable<Float, AnimationVector1D> getPressedAnimatable() {
        return this.pressedAnimatable;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.weight) * 31) + this.pressedAnimatable.hashCode();
        Alignment.Vertical vertical = this.alignment;
        return (iFloatToIntBits * 31) + (vertical == null ? 0 : vertical.hashCode());
    }

    public final void setAlignment(Alignment.Vertical vertical) {
        this.alignment = vertical;
    }

    public final void setPressedAnimatable(Animatable<Float, AnimationVector1D> animatable) {
        this.pressedAnimatable = animatable;
    }

    public final void setWeight(float f2) {
        this.weight = f2;
    }

    public String toString() {
        return "ButtonGroupParentData(weight=" + this.weight + ", pressedAnimatable=" + this.pressedAnimatable + ", alignment=" + this.alignment + ')';
    }

    public ButtonGroupParentData(float f2, Animatable<Float, AnimationVector1D> animatable, Alignment.Vertical vertical) {
        this.weight = f2;
        this.pressedAnimatable = animatable;
        this.alignment = vertical;
    }

    public ButtonGroupParentData() {
        this(0.0f, null, null, 7, null);
    }
}
