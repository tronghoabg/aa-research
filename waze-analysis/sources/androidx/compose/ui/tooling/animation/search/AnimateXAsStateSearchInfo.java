package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.ToolingOverride;
import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimateXAsStateSearchInfo<T, V extends AnimationVector> implements SearchInfo<AnimateXAsStateComposeAnimation<?, ?>, AnimateXAsStateClock<?, ?>> {
    public static final int $stable = 8;
    private final Animatable<T, V> animatable;
    private final Object animationObject;
    private final AnimationSpec<T> animationSpec;
    private Object initialState;
    private Object targetState;
    private final ToolingOverride<T> toolingOverride;

    public AnimateXAsStateSearchInfo(Animatable<T, V> animatable, AnimationSpec<T> animationSpec, ToolingOverride<T> toolingOverride) {
        this.animatable = animatable;
        this.animationSpec = animationSpec;
        this.toolingOverride = toolingOverride;
        this.animationObject = animatable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimateXAsStateSearchInfo copy$default(AnimateXAsStateSearchInfo animateXAsStateSearchInfo, Animatable animatable, AnimationSpec animationSpec, ToolingOverride toolingOverride, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            animatable = animateXAsStateSearchInfo.animatable;
        }
        if ((i2 & 2) != 0) {
            animationSpec = animateXAsStateSearchInfo.animationSpec;
        }
        if ((i2 & 4) != 0) {
            toolingOverride = animateXAsStateSearchInfo.toolingOverride;
        }
        return animateXAsStateSearchInfo.copy(animatable, animationSpec, toolingOverride);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void attach() {
        this.toolingOverride.overrideState();
    }

    public final Animatable<T, V> component1() {
        return this.animatable;
    }

    public final AnimationSpec<T> component2() {
        return this.animationSpec;
    }

    public final ToolingOverride<T> component3() {
        return this.toolingOverride;
    }

    public final AnimateXAsStateSearchInfo<T, V> copy(Animatable<T, V> animatable, AnimationSpec<T> animationSpec, ToolingOverride<T> toolingOverride) {
        return new AnimateXAsStateSearchInfo<>(animatable, animationSpec, toolingOverride);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void detach() {
        this.toolingOverride.clearOverride();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateXAsStateSearchInfo)) {
            return false;
        }
        AnimateXAsStateSearchInfo animateXAsStateSearchInfo = (AnimateXAsStateSearchInfo) obj;
        return x.n(this.animatable, animateXAsStateSearchInfo.animatable) && x.n(this.animationSpec, animateXAsStateSearchInfo.animationSpec) && x.n(this.toolingOverride, animateXAsStateSearchInfo.toolingOverride);
    }

    public final Animatable<T, V> getAnimatable() {
        return this.animatable;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getAnimationObject() {
        return this.animationObject;
    }

    public final AnimationSpec<T> getAnimationSpec() {
        return this.animationSpec;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getInitialState() {
        return this.initialState;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        return this.animatable.getLabel();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getTargetState() {
        return this.targetState;
    }

    public final ToolingOverride<T> getToolingOverride() {
        return this.toolingOverride;
    }

    public int hashCode() {
        return (((this.animatable.hashCode() * 31) + this.animationSpec.hashCode()) * 31) + this.toolingOverride.hashCode();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setInitialStateToCurrentAnimationValue() {
        this.initialState = this.animatable.getTargetValue();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setTargetStateToCurrentAnimationValue() {
        this.targetState = this.animatable.getTargetValue();
    }

    public String toString() {
        return "AnimateXAsStateSearchInfo(animatable=" + this.animatable + ", animationSpec=" + this.animationSpec + ", toolingOverride=" + this.toolingOverride + ')';
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public AnimateXAsStateComposeAnimation<?, ?> createAnimation() {
        return AnimateXAsStateComposeAnimation.Companion.parse$ui_tooling(this);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public AnimateXAsStateClock<?, ?> createClock(AnimateXAsStateComposeAnimation<?, ?> animateXAsStateComposeAnimation, ClockInfo clockInfo) {
        return new AnimateXAsStateClock<>(animateXAsStateComposeAnimation);
    }
}
