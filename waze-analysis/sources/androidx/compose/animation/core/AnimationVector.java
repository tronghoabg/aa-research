package androidx.compose.animation.core;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class AnimationVector {
    public static final int $stable = 0;

    private AnimationVector() {
    }

    public abstract float get$animation_core(int i2);

    public abstract int getSize$animation_core();

    public abstract AnimationVector newVector$animation_core();

    public abstract void reset$animation_core();

    public abstract void set$animation_core(int i2, float f2);

    public /* synthetic */ AnimationVector(o oVar) {
        this();
    }
}
