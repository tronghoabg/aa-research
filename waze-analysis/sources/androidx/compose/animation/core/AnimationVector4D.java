package androidx.compose.animation.core;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float v1;
    private float v2;
    private float v3;
    private float v4;

    public AnimationVector4D(float f2, float f3, float f4, float f5) {
        super(null);
        this.v1 = f2;
        this.v2 = f3;
        this.v3 = f4;
        this.v4 = f5;
        this.size = 4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector4D)) {
            return false;
        }
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        return animationVector4D.v1 == this.v1 && animationVector4D.v2 == this.v2 && animationVector4D.v3 == this.v3 && animationVector4D.v4 == this.v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core(int i2) {
        if (i2 == 0) {
            return this.v1;
        }
        if (i2 == 1) {
            return this.v2;
        }
        if (i2 == 2) {
            return this.v3;
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return this.v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core() {
        return this.size;
    }

    public final float getV1() {
        return this.v1;
    }

    public final float getV2() {
        return this.v2;
    }

    public final float getV3() {
        return this.v3;
    }

    public final float getV4() {
        return this.v4;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.v1) * 31) + Float.floatToIntBits(this.v2)) * 31) + Float.floatToIntBits(this.v3)) * 31) + Float.floatToIntBits(this.v4);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector4D newVector$animation_core() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
        this.v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core(int i2, float f2) {
        if (i2 == 0) {
            this.v1 = f2;
            return;
        }
        if (i2 == 1) {
            this.v2 = f2;
        } else if (i2 == 2) {
            this.v3 = f2;
        } else {
            if (i2 != 3) {
                return;
            }
            this.v4 = f2;
        }
    }

    public final void setV1$animation_core(float f2) {
        this.v1 = f2;
    }

    public final void setV2$animation_core(float f2) {
        this.v2 = f2;
    }

    public final void setV3$animation_core(float f2) {
        this.v3 = f2;
    }

    public final void setV4$animation_core(float f2) {
        this.v4 = f2;
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
    }
}
