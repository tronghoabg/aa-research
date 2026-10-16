package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.l;
import h.g.b.o;
import h.g.b.q;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;
    private final VectorizedAnimationSpec<AnimationVector1D> vectorizedSpec;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdatableAnimationState.this.animateToZero(null, null, this);
        }
    }

    public UpdatableAnimationState(AnimationSpec<Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(q.f48127a));
    }

    static final ab animateToZero$lambda$1(UpdatableAnimationState updatableAnimationState, float f2, l lVar, long j2) {
        long j3 = updatableAnimationState.lastFrameTime;
        if (j3 == Long.MIN_VALUE) {
            updatableAnimationState.lastFrameTime = j2;
            j3 = j2;
        }
        float f3 = updatableAnimationState.value;
        AnimationVector1D animationVector1D = new AnimationVector1D(f3);
        long durationNanos = f2 == 0.0f ? updatableAnimationState.vectorizedSpec.getDurationNanos(new AnimationVector1D(f3), ZeroVector, updatableAnimationState.lastVelocity) : a.d((j2 - j3) / f2);
        VectorizedAnimationSpec<AnimationVector1D> vectorizedAnimationSpec = updatableAnimationState.vectorizedSpec;
        AnimationVector1D animationVector1D2 = animationVector1D;
        AnimationVector1D animationVector1D3 = ZeroVector;
        float value = ((AnimationVector1D) vectorizedAnimationSpec.getValueFromNanos(durationNanos, animationVector1D2, animationVector1D3, updatableAnimationState.lastVelocity)).getValue();
        updatableAnimationState.lastVelocity = (AnimationVector1D) updatableAnimationState.vectorizedSpec.getVelocityFromNanos(durationNanos, animationVector1D2, animationVector1D3, updatableAnimationState.lastVelocity);
        updatableAnimationState.lastFrameTime = j2;
        float f4 = updatableAnimationState.value - value;
        updatableAnimationState.value = value;
        lVar.invoke(Float.valueOf(f4));
        return ab.f48028a;
    }

    static final ab animateToZero$lambda$2(UpdatableAnimationState updatableAnimationState, l lVar, long j2) {
        float f2 = updatableAnimationState.value;
        updatableAnimationState.value = 0.0f;
        lVar.invoke(Float.valueOf(f2));
        return ab.f48028a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r14, r0) != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:13:0x002e, B:43:0x00ba, B:18:0x0045, B:33:0x0092, B:28:0x0074, B:30:0x007e, B:39:0x009e, B:41:0x00a8), top: B:50:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8 A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:13:0x002e, B:43:0x00ba, B:18:0x0045, B:33:0x0092, B:28:0x0074, B:30:0x007e, B:39:0x009e, B:41:0x00a8), top: B:50:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008f -> B:33:0x0092). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToZero(h.g.a.l<? super java.lang.Float, h.ab> r12, h.g.a.a<h.ab> r13, h.c.e<? super h.ab> r14) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(h.g.a.l, h.g.a.a, h.c.e):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f2) {
        this.value = f2;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f2) {
            return Math.abs(f2) < 0.01f;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
