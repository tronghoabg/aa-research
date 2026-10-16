package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.TransformOrigin;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Scale {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<Float> animationSpec;
    private final float scale;
    private final long transformOrigin;

    private Scale(float f2, long j2, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.scale = f2;
        this.transformOrigin = j2;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-bnNdC4k$default, reason: not valid java name */
    public static /* synthetic */ Scale m1803copybnNdC4k$default(Scale scale, float f2, long j2, FiniteAnimationSpec finiteAnimationSpec, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = scale.scale;
        }
        if ((i2 & 2) != 0) {
            j2 = scale.transformOrigin;
        }
        if ((i2 & 4) != 0) {
            finiteAnimationSpec = scale.animationSpec;
        }
        return scale.m1805copybnNdC4k(f2, j2, finiteAnimationSpec);
    }

    public final float component1() {
        return this.scale;
    }

    /* renamed from: component2-SzJe1aQ, reason: not valid java name */
    public final long m1804component2SzJe1aQ() {
        return this.transformOrigin;
    }

    public final FiniteAnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    /* renamed from: copy-bnNdC4k, reason: not valid java name */
    public final Scale m1805copybnNdC4k(float f2, long j2, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new Scale(f2, j2, finiteAnimationSpec, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.scale, scale.scale) == 0 && TransformOrigin.m8665equalsimpl0(this.transformOrigin, scale.transformOrigin) && x.n(this.animationSpec, scale.animationSpec);
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m1806getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.scale) * 31) + TransformOrigin.m8668hashCodeimpl(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) TransformOrigin.m8669toStringimpl(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }

    public /* synthetic */ Scale(float f2, long j2, FiniteAnimationSpec finiteAnimationSpec, o oVar) {
        this(f2, j2, finiteAnimationSpec);
    }
}
