package androidx.window.embedding;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmbeddingAnimationParams {
    private final EmbeddingAnimationBackground animationBackground;
    private final AnimationSpec changeAnimation;
    private final AnimationSpec closeAnimation;
    private final AnimationSpec openAnimation;

    /* compiled from: WazeSource */
    public final class Builder {
        private EmbeddingAnimationBackground animationBackground = EmbeddingAnimationBackground.DEFAULT;
        private AnimationSpec changeAnimation;
        private AnimationSpec closeAnimation;
        private AnimationSpec openAnimation;

        public Builder() {
            AnimationSpec animationSpec = AnimationSpec.DEFAULT;
            this.openAnimation = animationSpec;
            this.closeAnimation = animationSpec;
            this.changeAnimation = animationSpec;
        }

        public final EmbeddingAnimationParams build() {
            return new EmbeddingAnimationParams(this.animationBackground, this.openAnimation, this.closeAnimation, this.changeAnimation, null);
        }

        public final Builder setAnimationBackground(EmbeddingAnimationBackground embeddingAnimationBackground) {
            x.f(embeddingAnimationBackground, "background");
            this.animationBackground = embeddingAnimationBackground;
            return this;
        }

        public final Builder setChangeAnimation(AnimationSpec animationSpec) {
            x.f(animationSpec, "spec");
            this.changeAnimation = animationSpec;
            return this;
        }

        public final Builder setCloseAnimation(AnimationSpec animationSpec) {
            x.f(animationSpec, "spec");
            this.closeAnimation = animationSpec;
            return this;
        }

        public final Builder setOpenAnimation(AnimationSpec animationSpec) {
            x.f(animationSpec, "spec");
            this.openAnimation = animationSpec;
            return this;
        }
    }

    /* synthetic */ EmbeddingAnimationParams(EmbeddingAnimationBackground embeddingAnimationBackground, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, int i2, o oVar) {
        this((i2 & 1) != 0 ? EmbeddingAnimationBackground.DEFAULT : embeddingAnimationBackground, (i2 & 2) != 0 ? AnimationSpec.DEFAULT : animationSpec, (i2 & 4) != 0 ? AnimationSpec.DEFAULT : animationSpec2, (i2 & 8) != 0 ? AnimationSpec.DEFAULT : animationSpec3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddingAnimationParams)) {
            return false;
        }
        EmbeddingAnimationParams embeddingAnimationParams = (EmbeddingAnimationParams) obj;
        return x.n(this.animationBackground, embeddingAnimationParams.animationBackground) && x.n(this.openAnimation, embeddingAnimationParams.openAnimation) && x.n(this.closeAnimation, embeddingAnimationParams.closeAnimation) && x.n(this.changeAnimation, embeddingAnimationParams.changeAnimation);
    }

    public final EmbeddingAnimationBackground getAnimationBackground() {
        return this.animationBackground;
    }

    public final AnimationSpec getChangeAnimation() {
        return this.changeAnimation;
    }

    public final AnimationSpec getCloseAnimation() {
        return this.closeAnimation;
    }

    public final AnimationSpec getOpenAnimation() {
        return this.openAnimation;
    }

    public int hashCode() {
        return (((((this.animationBackground.hashCode() * 31) + this.openAnimation.hashCode()) * 31) + this.closeAnimation.hashCode()) * 31) + this.changeAnimation.hashCode();
    }

    public String toString() {
        return "EmbeddingAnimationParams:{animationBackground=" + this.animationBackground + ", openAnimation=" + this.openAnimation + ", closeAnimation=" + this.closeAnimation + ", changeAnimation=" + this.changeAnimation + " }";
    }

    /* compiled from: WazeSource */
    public final class AnimationSpec {
        public static final Companion Companion = new Companion(null);
        public static final AnimationSpec DEFAULT = new AnimationSpec(0);
        public static final AnimationSpec JUMP_CUT = new AnimationSpec(1);
        private final int value;

        private AnimationSpec(int i2) {
            this.value = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof AnimationSpec) && this.value == ((AnimationSpec) obj).value;
        }

        public final int getValue$window() {
            return this.value;
        }

        public int hashCode() {
            return this.value * 31;
        }

        public String toString() {
            int i2 = this.value;
            if (i2 == 0) {
                return "DEFAULT";
            }
            if (i2 == 1) {
                return "JUMP_CUT";
            }
            return "Unknown value: " + i2;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final AnimationSpec getAnimationSpecFromValue$window(int i2) {
                if (i2 == AnimationSpec.DEFAULT.getValue$window()) {
                    return AnimationSpec.DEFAULT;
                }
                if (i2 == AnimationSpec.JUMP_CUT.getValue$window()) {
                    return AnimationSpec.JUMP_CUT;
                }
                throw new IllegalArgumentException("Undefined value:" + i2);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    public /* synthetic */ EmbeddingAnimationParams(EmbeddingAnimationBackground embeddingAnimationBackground, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, o oVar) {
        this(embeddingAnimationBackground, animationSpec, animationSpec2, animationSpec3);
    }

    private EmbeddingAnimationParams(EmbeddingAnimationBackground embeddingAnimationBackground, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3) {
        this.animationBackground = embeddingAnimationBackground;
        this.openAnimation = animationSpec;
        this.closeAnimation = animationSpec2;
        this.changeAnimation = animationSpec3;
    }
}
