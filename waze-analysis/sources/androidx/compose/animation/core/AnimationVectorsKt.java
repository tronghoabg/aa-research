package androidx.compose.animation.core;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f2) {
        return new AnimationVector1D(f2);
    }

    public static final <T extends AnimationVector> T copy(T t) {
        T t2 = (T) newInstance(t);
        int size$animation_core = t2.getSize$animation_core();
        for (int i2 = 0; i2 < size$animation_core; i2++) {
            t2.set$animation_core(i2, t.get$animation_core(i2));
        }
        return t2;
    }

    public static final <T extends AnimationVector> void copyFrom(T t, T t2) {
        int size$animation_core = t.getSize$animation_core();
        for (int i2 = 0; i2 < size$animation_core; i2++) {
            t.set$animation_core(i2, t2.get$animation_core(i2));
        }
    }

    public static final <T extends AnimationVector> T newInstance(T t) {
        T t2 = (T) t.newVector$animation_core();
        x.d(t2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t2;
    }

    public static final AnimationVector2D AnimationVector(float f2, float f3) {
        return new AnimationVector2D(f2, f3);
    }

    public static final AnimationVector3D AnimationVector(float f2, float f3, float f4) {
        return new AnimationVector3D(f2, f3, f4);
    }

    public static final AnimationVector4D AnimationVector(float f2, float f3, float f4, float f5) {
        return new AnimationVector4D(f2, f3, f4, f5);
    }
}
