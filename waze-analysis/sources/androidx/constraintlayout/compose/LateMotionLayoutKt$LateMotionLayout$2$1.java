package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class LateMotionLayoutKt$LateMotionLayout$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatableProgress;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ o<ConstraintSet> $channel;
    final /* synthetic */ Ref<CompositionSource> $compositionSource;
    final /* synthetic */ MutableIntState $direction;
    final /* synthetic */ MutableState<ConstraintSet> $end;
    final /* synthetic */ a<ab> $finishedAnimationListener;
    final /* synthetic */ MutableState<ConstraintSet> $start;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LateMotionLayoutKt$LateMotionLayout$2$1(o<ConstraintSet> oVar, MutableIntState mutableIntState, MutableState<ConstraintSet> mutableState, MutableState<ConstraintSet> mutableState2, Ref<CompositionSource> ref, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, a<ab> aVar, e<? super LateMotionLayoutKt$LateMotionLayout$2$1> eVar) {
        super(2, eVar);
        this.$channel = oVar;
        this.$direction = mutableIntState;
        this.$start = mutableState;
        this.$end = mutableState2;
        this.$compositionSource = ref;
        this.$animatableProgress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = aVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new LateMotionLayoutKt$LateMotionLayout$2$1(this.$channel, this.$direction, this.$start, this.$end, this.$compositionSource, this.$animatableProgress, this.$animationSpec, this.$finishedAnimationListener, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LateMotionLayoutKt$LateMotionLayout$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r14.$animatableProgress, new java.lang.Float(r14.$direction.getIntValue()), r14.$animationSpec, null, null, r14, 12, null) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b1 -> B:7:0x0013). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00cd -> B:12:0x002f). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r14.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.a.q r1 = (kotlinx.coroutines.a.q) r1
            e.b.c.b(r15)
        L13:
            r15 = r1
            goto Lb5
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L1e:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.a.q r1 = (kotlinx.coroutines.a.q) r1
            e.b.c.b(r15)
            goto L41
        L26:
            e.b.c.b(r15)
            kotlinx.coroutines.a.o<androidx.constraintlayout.compose.ConstraintSet> r15 = r14.$channel
            kotlinx.coroutines.a.q r15 = r15.p()
        L2f:
            r1 = r14
            h.c.e r1 = (h.c.e) r1
            r14.L$0 = r15
            r14.label = r3
            java.lang.Object r1 = r15.a(r1)
            if (r1 != r0) goto L3e
            goto Lcc
        L3e:
            r13 = r1
            r1 = r15
            r15 = r13
        L41:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Ld0
            java.lang.Object r15 = r1.b()
            androidx.constraintlayout.compose.ConstraintSet r15 = (androidx.constraintlayout.compose.ConstraintSet) r15
            kotlinx.coroutines.a.o<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$channel
            java.lang.Object r4 = r4.h()
            java.lang.Object r4 = kotlinx.coroutines.a.t.a(r4)
            androidx.constraintlayout.compose.ConstraintSet r4 = (androidx.constraintlayout.compose.ConstraintSet) r4
            if (r4 == 0) goto L5e
            r15 = r4
        L5e:
            androidx.compose.runtime.MutableIntState r4 = r14.$direction
            int r4 = r4.getIntValue()
            if (r4 != r3) goto L69
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$start
            goto L6b
        L69:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$end
        L6b:
            java.lang.Object r4 = r4.getValue()
            androidx.constraintlayout.compose.ConstraintSet r4 = (androidx.constraintlayout.compose.ConstraintSet) r4
            boolean r4 = h.g.b.x.n(r15, r4)
            if (r4 != 0) goto Lcd
            androidx.compose.runtime.MutableIntState r4 = r14.$direction
            int r4 = r4.getIntValue()
            if (r4 != r3) goto L85
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$end
            r4.setValue(r15)
            goto L8a
        L85:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$start
            r4.setValue(r15)
        L8a:
            androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> r15 = r14.$compositionSource
            androidx.constraintlayout.compose.CompositionSource r4 = androidx.constraintlayout.compose.CompositionSource.Content
            r15.setValue(r4)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r5 = r14.$animatableProgress
            androidx.compose.runtime.MutableIntState r15 = r14.$direction
            int r15 = r15.getIntValue()
            float r15 = (float) r15
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r15)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r7 = r14.$animationSpec
            r10 = r14
            h.c.e r10 = (h.c.e) r10
            r14.L$0 = r1
            r14.label = r2
            r11 = 12
            r12 = 0
            r8 = 0
            r9 = 0
            java.lang.Object r15 = androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r15 == r0) goto Lcc
            goto L13
        Lb5:
            androidx.compose.runtime.MutableIntState r1 = r14.$direction
            int r4 = r1.getIntValue()
            if (r4 != r3) goto Lbf
            r4 = 0
            goto Lc0
        Lbf:
            r4 = r3
        Lc0:
            r1.setIntValue(r4)
            h.g.a.a<h.ab> r1 = r14.$finishedAnimationListener
            if (r1 == 0) goto L2f
            r1.invoke()
            goto L2f
        Lcc:
            return r0
        Lcd:
            r15 = r1
            goto L2f
        Ld0:
            h.ab r14 = h.ab.f48028a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
