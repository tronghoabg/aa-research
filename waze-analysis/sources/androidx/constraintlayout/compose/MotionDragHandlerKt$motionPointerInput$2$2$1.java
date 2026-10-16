package androidx.constraintlayout.compose;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MotionDragHandlerKt$motionPointerInput$2$2$1 extends g implements p<PointerInputScope, e<? super ab>, Object> {
    final /* synthetic */ o<MotionDragState> $dragChannel;
    final /* synthetic */ TransitionHandler $swipeHandler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionDragHandlerKt$motionPointerInput$2$2$1(TransitionHandler transitionHandler, o<MotionDragState> oVar, e<? super MotionDragHandlerKt$motionPointerInput$2$2$1> eVar) {
        super(2, eVar);
        this.$swipeHandler = transitionHandler;
        this.$dragChannel = oVar;
    }

    static final ab invokeSuspend$lambda$1(VelocityTracker velocityTracker, Offset offset) {
        velocityTracker.resetTracking();
        return ab.f48028a;
    }

    static final ab invokeSuspend$lambda$2(o oVar, VelocityTracker velocityTracker) {
        oVar.i(MotionDragState.Companion.m11577onDragEndTH1AsA0(velocityTracker.m9714calculateVelocity9UxMQ8M()));
        return ab.f48028a;
    }

    static final ab invokeSuspend$lambda$3(o oVar, VelocityTracker velocityTracker) {
        oVar.i(MotionDragState.Companion.m11577onDragEndTH1AsA0(velocityTracker.m9714calculateVelocity9UxMQ8M()));
        return ab.f48028a;
    }

    static final ab invokeSuspend$lambda$4(VelocityTracker velocityTracker, o oVar, PointerInputChange pointerInputChange, Offset offset) {
        VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
        oVar.i(MotionDragState.Companion.m11576onDragk4lQ0M(offset.m7990unboximpl()));
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        MotionDragHandlerKt$motionPointerInput$2$2$1 motionDragHandlerKt$motionPointerInput$2$2$1 = new MotionDragHandlerKt$motionPointerInput$2$2$1(this.$swipeHandler, this.$dragChannel, eVar);
        motionDragHandlerKt$motionPointerInput$2$2$1.L$0 = obj;
        return motionDragHandlerKt$motionPointerInput$2$2$1;
    }

    @Override // h.g.a.p
    public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        return ((MotionDragHandlerKt$motionPointerInput$2$2$1) create(pointerInputScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final VelocityTracker velocityTracker = new VelocityTracker();
            final TransitionHandler transitionHandler = this.$swipeHandler;
            l lVar = new l() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(transitionHandler.m11634onAcceptFirstDownForOnSwipek4lQ0M(((Offset) obj2).m7990unboximpl()));
                }
            };
            l lVar2 = new l() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return MotionDragHandlerKt$motionPointerInput$2$2$1.invokeSuspend$lambda$1(velocityTracker, (Offset) obj2);
                }
            };
            final o<MotionDragState> oVar = this.$dragChannel;
            this.label = 1;
            if (MotionDragHandlerKt.detectDragGesturesWhenNeeded(pointerInputScope, lVar, lVar2, new h.g.a.a() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return MotionDragHandlerKt$motionPointerInput$2$2$1.invokeSuspend$lambda$2(oVar, velocityTracker);
                }
            }, new h.g.a.a() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return MotionDragHandlerKt$motionPointerInput$2$2$1.invokeSuspend$lambda$3(oVar, velocityTracker);
                }
            }, new p() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return MotionDragHandlerKt$motionPointerInput$2$2$1.invokeSuspend$lambda$4(velocityTracker, oVar, (PointerInputChange) obj2, (Offset) obj3);
                }
            }, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
