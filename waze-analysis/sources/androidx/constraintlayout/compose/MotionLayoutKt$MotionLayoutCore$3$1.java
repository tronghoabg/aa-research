package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MotionLayoutKt$MotionLayoutCore$3$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableState<Boolean> $animateToEnd$delegate;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ o<ConstraintSet> $channel;
    final /* synthetic */ MutableState<ConstraintSet> $end$delegate;
    final /* synthetic */ a<ab> $finishedAnimationListener;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
    final /* synthetic */ MutableState<ConstraintSet> $start$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionLayoutKt$MotionLayoutCore$3$1(o<ConstraintSet> oVar, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, a<ab> aVar, MutableState<Boolean> mutableState, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, e<? super MotionLayoutKt$MotionLayoutCore$3$1> eVar) {
        super(2, eVar);
        this.$channel = oVar;
        this.$progress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = aVar;
        this.$animateToEnd$delegate = mutableState;
        this.$start$delegate = mutableState2;
        this.$end$delegate = mutableState3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new MotionLayoutKt$MotionLayoutCore$3$1(this.$channel, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$animateToEnd$delegate, this.$start$delegate, this.$end$delegate, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((MotionLayoutKt$MotionLayoutCore$3$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r16.$progress, new java.lang.Float(r6), r16.$animationSpec, null, null, r16, 12, null) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[PHI: r2 r5
  0x0041: PHI (r2v3 kotlinx.coroutines.a.q) = (r2v4 kotlinx.coroutines.a.q), (r2v7 kotlinx.coroutines.a.q) binds: [B:12:0x003d, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r5v0 java.lang.Object) = (r5v10 java.lang.Object), (r5v13 java.lang.Object) binds: [B:12:0x003d, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0083 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b1 -> B:35:0x00b3). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L29
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.a.q r2 = (kotlinx.coroutines.a.q) r2
            e.b.c.b(r17)
            goto Lb3
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.a.q r2 = (kotlinx.coroutines.a.q) r2
            e.b.c.b(r17)
            r5 = r17
            goto L41
        L29:
            e.b.c.b(r17)
            kotlinx.coroutines.a.o<androidx.constraintlayout.compose.ConstraintSet> r2 = r0.$channel
            kotlinx.coroutines.a.q r2 = r2.p()
        L32:
            r5 = r0
            h.c.e r5 = (h.c.e) r5
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r5 = r2.a(r5)
            if (r5 != r1) goto L41
            goto Lc6
        L41:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc7
            java.lang.Object r5 = r2.b()
            androidx.constraintlayout.compose.ConstraintSet r5 = (androidx.constraintlayout.compose.ConstraintSet) r5
            kotlinx.coroutines.a.o<androidx.constraintlayout.compose.ConstraintSet> r6 = r0.$channel
            java.lang.Object r6 = r6.h()
            java.lang.Object r6 = kotlinx.coroutines.a.t.a(r6)
            androidx.constraintlayout.compose.ConstraintSet r6 = (androidx.constraintlayout.compose.ConstraintSet) r6
            if (r6 == 0) goto L5e
            r5 = r6
        L5e:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r6 = r0.$animateToEnd$delegate
            boolean r6 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$14(r6)
            if (r4 == r6) goto L68
            r6 = 0
            goto L6a
        L68:
            r6 = 1065353216(0x3f800000, float:1.0)
        L6a:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r7 = r0.$animateToEnd$delegate
            boolean r7 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$14(r7)
            if (r7 == 0) goto L79
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r7 = r0.$start$delegate
            androidx.constraintlayout.compose.ConstraintSet r7 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$6(r7)
            goto L7f
        L79:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r7 = r0.$end$delegate
            androidx.constraintlayout.compose.ConstraintSet r7 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$9(r7)
        L7f:
            boolean r7 = h.g.b.x.n(r5, r7)
            if (r7 != 0) goto L32
            androidx.compose.runtime.MutableState<java.lang.Boolean> r7 = r0.$animateToEnd$delegate
            boolean r7 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$14(r7)
            if (r7 == 0) goto L93
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r7 = r0.$end$delegate
            androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$10(r7, r5)
            goto L98
        L93:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r7 = r0.$start$delegate
            androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$7(r7, r5)
        L98:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r8 = r0.$progress
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r6)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r10 = r0.$animationSpec
            r13 = r0
            h.c.e r13 = (h.c.e) r13
            r0.L$0 = r2
            r0.label = r3
            r14 = 12
            r15 = 0
            r11 = 0
            r12 = 0
            java.lang.Object r5 = androidx.compose.animation.core.Animatable.animateTo$default(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r5 == r1) goto Lc6
        Lb3:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r5 = r0.$animateToEnd$delegate
            boolean r6 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$14(r5)
            r6 = r6 ^ r4
            androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$15(r5, r6)
            h.g.a.a<h.ab> r5 = r0.$finishedAnimationListener
            if (r5 == 0) goto L32
            r5.invoke()
            goto L32
        Lc6:
            return r1
        Lc7:
            h.ab r0 = h.ab.f48028a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
