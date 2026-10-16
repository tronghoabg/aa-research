package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Fade {
    public static final int $stable = 0;
    private final float alpha;
    private final FiniteAnimationSpec<Float> animationSpec;

    public Fade(float f2, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.alpha = f2;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fade copy$default(Fade fade, float f2, FiniteAnimationSpec finiteAnimationSpec, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = fade.alpha;
        }
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = fade.animationSpec;
        }
        return fade.copy(f2, finiteAnimationSpec);
    }

    public final float component1() {
        return this.alpha;
    }

    public final FiniteAnimationSpec<Float> component2() {
        return this.animationSpec;
    }

    public final Fade copy(float f2, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new Fade(f2, finiteAnimationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return Float.compare(this.alpha, fade.alpha) == 0 && x.n(this.animationSpec, fade.animationSpec);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.alpha) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.alpha + ", animationSpec=" + this.animationSpec + ')';
    }
}
