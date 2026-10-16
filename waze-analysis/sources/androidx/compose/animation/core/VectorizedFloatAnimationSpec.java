package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int i2) {
                return floatAnimationSpec;
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        int size$animation_core = v.getSize$animation_core();
        long jMax = 0;
        for (int i2 = 0; i2 < size$animation_core; i2++) {
            jMax = Math.max(jMax, this.anims.get(i2).getDurationNanos(v.get$animation_core(i2), v2.get$animation_core(i2), v3.get$animation_core(i2)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V v, V v2, V v3) {
        V v4;
        V v5 = this.endVelocityVector;
        if (v5 == null) {
            v5 = (V) AnimationVectorsKt.newInstance(v3);
            this.endVelocityVector = v5;
        }
        if (v5 == null) {
            x.j("endVelocityVector");
            v5 = null;
        }
        int size$animation_core = v5.getSize$animation_core();
        int i2 = 0;
        while (true) {
            v4 = this.endVelocityVector;
            if (i2 >= size$animation_core) {
                break;
            }
            if (v4 == null) {
                x.j("endVelocityVector");
                v4 = null;
            }
            v4.set$animation_core(i2, this.anims.get(i2).getEndVelocity(v.get$animation_core(i2), v2.get$animation_core(i2), v3.get$animation_core(i2)));
            i2++;
        }
        if (v4 != null) {
            return v4;
        }
        x.j("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v, V v2, V v3) {
        V v4;
        V v5 = this.valueVector;
        if (v5 == null) {
            v5 = (V) AnimationVectorsKt.newInstance(v);
            this.valueVector = v5;
        }
        if (v5 == null) {
            x.j("valueVector");
            v5 = null;
        }
        int size$animation_core = v5.getSize$animation_core();
        int i2 = 0;
        while (true) {
            v4 = this.valueVector;
            if (i2 >= size$animation_core) {
                break;
            }
            if (v4 == null) {
                x.j("valueVector");
                v4 = null;
            }
            v4.set$animation_core(i2, this.anims.get(i2).getValueFromNanos(j2, v.get$animation_core(i2), v2.get$animation_core(i2), v3.get$animation_core(i2)));
            i2++;
        }
        if (v4 != null) {
            return v4;
        }
        x.j("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v, V v2, V v3) {
        V v4;
        V v5 = this.velocityVector;
        if (v5 == null) {
            v5 = (V) AnimationVectorsKt.newInstance(v3);
            this.velocityVector = v5;
        }
        if (v5 == null) {
            x.j("velocityVector");
            v5 = null;
        }
        int size$animation_core = v5.getSize$animation_core();
        int i2 = 0;
        while (true) {
            v4 = this.velocityVector;
            if (i2 >= size$animation_core) {
                break;
            }
            if (v4 == null) {
                x.j("velocityVector");
                v4 = null;
            }
            v4.set$animation_core(i2, this.anims.get(i2).getVelocityFromNanos(j2, v.get$animation_core(i2), v2.get$animation_core(i2), v3.get$animation_core(i2)));
            i2++;
        }
        if (v4 != null) {
            return v4;
        }
        x.j("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return false;
    }

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.anims = animations;
    }
}
