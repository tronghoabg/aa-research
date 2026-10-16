package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.graphics.shapes.Morph;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableIntState $currentMorphIndex$delegate;
    final /* synthetic */ SpringSpec<Float> $morphAnimationSpec;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $morphProgress;
    final /* synthetic */ MutableFloatState $morphRotationTargetAngle$delegate;
    final /* synthetic */ List<Morph> $morphSequence;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1(Animatable<Float, AnimationVector1D> animatable, SpringSpec<Float> springSpec, List<Morph> list, MutableIntState mutableIntState, MutableFloatState mutableFloatState, e<? super LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1> eVar) {
        super(2, eVar);
        this.$morphProgress = animatable;
        this.$morphAnimationSpec = springSpec;
        this.$morphSequence = list;
        this.$currentMorphIndex$delegate = mutableIntState;
        this.$morphRotationTargetAngle$delegate = mutableFloatState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1(this.$morphProgress, this.$morphAnimationSpec, this.$morphSequence, this.$currentMorphIndex$delegate, this.$morphRotationTargetAngle$delegate, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r12.$morphProgress.snapTo(new java.lang.Float(0.0f), r12) == r0) goto L20;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r13)
            goto L6c
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L18:
            e.b.c.b(r13)
            goto L3d
        L1c:
            e.b.c.b(r13)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$morphProgress
            java.lang.Float r5 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r13)
            androidx.compose.animation.core.SpringSpec<java.lang.Float> r13 = r12.$morphAnimationSpec
            r6 = r13
            androidx.compose.animation.core.AnimationSpec r6 = (androidx.compose.animation.core.AnimationSpec) r6
            r9 = r12
            h.c.e r9 = (h.c.e) r9
            r12.label = r3
            r10 = 12
            r11 = 0
            r7 = 0
            r8 = 0
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 == r0) goto L7e
        L3d:
            androidx.compose.animation.core.AnimationResult r13 = (androidx.compose.animation.core.AnimationResult) r13
            androidx.compose.animation.core.AnimationEndReason r13 = r13.getEndReason()
            androidx.compose.animation.core.AnimationEndReason r1 = androidx.compose.animation.core.AnimationEndReason.Finished
            if (r13 != r1) goto L7b
            androidx.compose.runtime.MutableIntState r13 = r12.$currentMorphIndex$delegate
            int r1 = androidx.compose.material3.LoadingIndicatorKt.access$LoadingIndicatorImpl_eopBjH0$lambda$9(r13)
            int r1 = r1 + r3
            java.util.List<androidx.graphics.shapes.Morph> r3 = r12.$morphSequence
            int r3 = r3.size()
            int r1 = r1 % r3
            androidx.compose.material3.LoadingIndicatorKt.access$LoadingIndicatorImpl_eopBjH0$lambda$10(r13, r1)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$morphProgress
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            r3 = r12
            h.c.e r3 = (h.c.e) r3
            r12.label = r2
            java.lang.Object r13 = r13.snapTo(r1, r3)
            if (r13 != r0) goto L6c
            goto L7e
        L6c:
            androidx.compose.runtime.MutableFloatState r12 = r12.$morphRotationTargetAngle$delegate
            float r13 = androidx.compose.material3.LoadingIndicatorKt.access$LoadingIndicatorImpl_eopBjH0$lambda$5(r12)
            r0 = 1119092736(0x42b40000, float:90.0)
            float r13 = r13 + r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r13 = r13 % r0
            androidx.compose.material3.LoadingIndicatorKt.access$LoadingIndicatorImpl_eopBjH0$lambda$6(r12, r13)
        L7b:
            h.ab r12 = h.ab.f48028a
            return r12
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
