package androidx.constraintlayout.compose;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.e;
import h.g.a.l;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TransitionHandler {
    public static final int $stable = 8;
    private final MotionMeasurer motionMeasurer;
    private final MutableFloatState motionProgress;

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransitionHandler.this.updateProgressWhileTouchUp(this);
        }
    }

    public TransitionHandler(MotionMeasurer motionMeasurer, MutableFloatState mutableFloatState) {
        this.motionMeasurer = motionMeasurer;
        this.motionProgress = mutableFloatState;
    }

    private final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.motionMeasurer.getTransition();
    }

    static final ab onTouchUp_sF_c_tU$lambda$0(TransitionHandler transitionHandler, long j2, long j3) {
        transitionHandler.getTransition().setTouchUp(transitionHandler.motionProgress.getFloatValue(), j3, Velocity.m11406getXimpl(j2), Velocity.m11407getYimpl(j2));
        return ab.f48028a;
    }

    /* renamed from: onAcceptFirstDownForOnSwipe-k-4lQ0M, reason: not valid java name */
    public final boolean m11634onAcceptFirstDownForOnSwipek4lQ0M(long j2) {
        return getTransition().isFirstDownAccepted(Offset.m7980getXimpl(j2), Offset.m7981getYimpl(j2));
    }

    /* renamed from: onTouchUp-sF-c-tU, reason: not valid java name */
    public final Object m11635onTouchUpsFctU(final long j2, e<? super ab> eVar) {
        Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(new l() { // from class: androidx.constraintlayout.compose.TransitionHandler$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TransitionHandler.onTouchUp_sF_c_tU$lambda$0(this.f$0, j2, ((Long) obj).longValue());
            }
        }, eVar);
        return objWithFrameNanos == a.f48038a ? objWithFrameNanos : ab.f48028a;
    }

    public final boolean pendingProgressWhileTouchUp() {
        return getTransition().isTouchNotDone(this.motionProgress.getFloatValue());
    }

    /* renamed from: updateProgressOnDrag-k-4lQ0M, reason: not valid java name */
    public final void m11636updateProgressOnDragk4lQ0M(long j2) {
        MotionMeasurer motionMeasurer = this.motionMeasurer;
        this.motionProgress.setFloatValue(n.g(this.motionProgress.getFloatValue() + getTransition().dragToProgress(this.motionProgress.getFloatValue(), motionMeasurer.getLayoutCurrentWidth(), motionMeasurer.getLayoutCurrentHeight(), Offset.m7980getXimpl(j2), Offset.m7981getYimpl(j2)), 0.0f, 1.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateProgressWhileTouchUp(h.c.e<? super h.ab> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.constraintlayout.compose.TransitionHandler.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 r0 = (androidx.constraintlayout.compose.TransitionHandler.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 r0 = new androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            androidx.constraintlayout.compose.TransitionHandler$$ExternalSyntheticLambda0 r5 = new androidx.constraintlayout.compose.TransitionHandler$$ExternalSyntheticLambda0
            r5.<init>()
            r0.label = r3
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.runtime.MutableFloatState r4 = r4.motionProgress
            r4.setFloatValue(r5)
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.TransitionHandler.updateProgressWhileTouchUp(h.c.e):java.lang.Object");
    }
}
