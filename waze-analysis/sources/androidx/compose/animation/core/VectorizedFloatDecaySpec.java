package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(V v, V v2) {
        V v3 = this.velocityVector;
        if (v3 == null) {
            v3 = (V) AnimationVectorsKt.newInstance(v);
            this.velocityVector = v3;
        }
        if (v3 == null) {
            x.j("velocityVector");
            v3 = null;
        }
        int size$animation_core = v3.getSize$animation_core();
        long jMax = 0;
        for (int i2 = 0; i2 < size$animation_core; i2++) {
            jMax = Math.max(jMax, this.floatDecaySpec.getDurationNanos(v.get$animation_core(i2), v2.get$animation_core(i2)));
        }
        return jMax;
    }

    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getTargetValue(V v, V v2) {
        V v3;
        V v4 = this.targetVector;
        if (v4 == null) {
            v4 = (V) AnimationVectorsKt.newInstance(v);
            this.targetVector = v4;
        }
        if (v4 == null) {
            x.j("targetVector");
            v4 = null;
        }
        int size$animation_core = v4.getSize$animation_core();
        int i2 = 0;
        while (true) {
            v3 = this.targetVector;
            if (i2 >= size$animation_core) {
                break;
            }
            if (v3 == null) {
                x.j("targetVector");
                v3 = null;
            }
            v3.set$animation_core(i2, this.floatDecaySpec.getTargetValue(v.get$animation_core(i2), v2.get$animation_core(i2)));
            i2++;
        }
        if (v3 != null) {
            return v3;
        }
        x.j("targetVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getValueFromNanos(long j2, V v, V v2) {
        V v3;
        V v4 = this.valueVector;
        if (v4 == null) {
            v4 = (V) AnimationVectorsKt.newInstance(v);
            this.valueVector = v4;
        }
        if (v4 == null) {
            x.j("valueVector");
            v4 = null;
        }
        int size$animation_core = v4.getSize$animation_core();
        int i2 = 0;
        while (true) {
            v3 = this.valueVector;
            if (i2 >= size$animation_core) {
                break;
            }
            if (v3 == null) {
                x.j("valueVector");
                v3 = null;
            }
            v3.set$animation_core(i2, this.floatDecaySpec.getValueFromNanos(j2, v.get$animation_core(i2), v2.get$animation_core(i2)));
            i2++;
        }
        if (v3 != null) {
            return v3;
        }
        x.j("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getVelocityFromNanos(long j2, V v, V v2) {
        V v3;
        V v4 = this.velocityVector;
        if (v4 == null) {
            v4 = (V) AnimationVectorsKt.newInstance(v);
            this.velocityVector = v4;
        }
        if (v4 == null) {
            x.j("velocityVector");
            v4 = null;
        }
        int size$animation_core = v4.getSize$animation_core();
        int i2 = 0;
        while (true) {
            v3 = this.velocityVector;
            if (i2 >= size$animation_core) {
                break;
            }
            if (v3 == null) {
                x.j("velocityVector");
                v3 = null;
            }
            v3.set$animation_core(i2, this.floatDecaySpec.getVelocityFromNanos(j2, v.get$animation_core(i2), v2.get$animation_core(i2)));
            i2++;
        }
        if (v3 != null) {
            return v3;
        }
        x.j("velocityVector");
        return null;
    }
}
