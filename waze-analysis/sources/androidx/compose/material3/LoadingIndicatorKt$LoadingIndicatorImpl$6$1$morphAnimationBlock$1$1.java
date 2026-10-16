package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
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
final class LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableIntState $currentMorphIndex$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $morphProgress;
    final /* synthetic */ MutableFloatState $morphRotationTargetAngle$delegate;
    final /* synthetic */ List<Morph> $morphSequence;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1(Animatable<Float, AnimationVector1D> animatable, List<Morph> list, MutableIntState mutableIntState, MutableFloatState mutableFloatState, e<? super LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1> eVar) {
        super(2, eVar);
        this.$morphProgress = animatable;
        this.$morphSequence = list;
        this.$currentMorphIndex$delegate = mutableIntState;
        this.$morphRotationTargetAngle$delegate = mutableFloatState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1 loadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1 = new LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1(this.$morphProgress, this.$morphSequence, this.$currentMorphIndex$delegate, this.$morphRotationTargetAngle$delegate, eVar);
        loadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1.L$0 = obj;
        return loadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[PHI: r5 r8
  0x004d: PHI (r5v3 kotlinx.coroutines.af) = (r5v2 kotlinx.coroutines.af), (r5v4 kotlinx.coroutines.af) binds: [B:15:0x0084, B:11:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r8v1 androidx.compose.animation.core.SpringSpec) = (r8v0 androidx.compose.animation.core.SpringSpec), (r8v2 androidx.compose.animation.core.SpringSpec) binds: [B:15:0x0084, B:11:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[PHI: r1 r5 r8
  0x0075: PHI (r1v4 kotlinx.coroutines.am) = (r1v5 kotlinx.coroutines.am), (r1v8 kotlinx.coroutines.am) binds: [B:13:0x0073, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r5v2 kotlinx.coroutines.af) = (r5v3 kotlinx.coroutines.af), (r5v7 kotlinx.coroutines.af) binds: [B:13:0x0073, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r8v0 androidx.compose.animation.core.SpringSpec) = (r8v1 androidx.compose.animation.core.SpringSpec), (r8v3 androidx.compose.animation.core.SpringSpec) binds: [B:13:0x0073, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0084 -> B:12:0x004d). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r13.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L33
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r13.L$1
            androidx.compose.animation.core.SpringSpec r1 = (androidx.compose.animation.core.SpringSpec) r1
            java.lang.Object r5 = r13.L$0
            kotlinx.coroutines.af r5 = (kotlinx.coroutines.af) r5
            e.b.c.b(r14)
            goto L4c
        L19:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L21:
            java.lang.Object r1 = r13.L$2
            kotlinx.coroutines.am r1 = (kotlinx.coroutines.am) r1
            java.lang.Object r5 = r13.L$1
            androidx.compose.animation.core.SpringSpec r5 = (androidx.compose.animation.core.SpringSpec) r5
            java.lang.Object r6 = r13.L$0
            kotlinx.coroutines.af r6 = (kotlinx.coroutines.af) r6
            e.b.c.b(r14)
            r8 = r5
            r5 = r6
            goto L75
        L33:
            e.b.c.b(r14)
            java.lang.Object r14 = r13.L$0
            r5 = r14
            kotlinx.coroutines.af r5 = (kotlinx.coroutines.af) r5
            java.lang.Float r14 = new java.lang.Float
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r14.<init>(r1)
            r1 = 1058642330(0x3f19999a, float:0.6)
            r6 = 1128792064(0x43480000, float:200.0)
            androidx.compose.animation.core.SpringSpec r1 = androidx.compose.animation.core.AnimationSpecKt.spring(r1, r6, r14)
        L4c:
            r8 = r1
        L4d:
            java.util.List<androidx.graphics.shapes.Morph> r9 = r13.$morphSequence
            androidx.compose.material3.LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1 r6 = new androidx.compose.material3.LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1
            androidx.compose.runtime.MutableIntState r10 = r13.$currentMorphIndex$delegate
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7 = r13.$morphProgress
            androidx.compose.runtime.MutableFloatState r11 = r13.$morphRotationTargetAngle$delegate
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            h.g.a.p r6 = (h.g.a.p) r6
            r14 = 3
            kotlinx.coroutines.am r1 = kotlinx.coroutines.aj.y(r5, r4, r4, r6, r14)
            r14 = r13
            h.c.e r14 = (h.c.e) r14
            r13.L$0 = r5
            r13.L$1 = r8
            r13.L$2 = r1
            r13.label = r3
            r6 = 650(0x28a, double:3.21E-321)
            java.lang.Object r14 = kotlinx.coroutines.aj.q(r6, r14)
            if (r14 == r0) goto L87
        L75:
            r14 = r13
            h.c.e r14 = (h.c.e) r14
            r13.L$0 = r5
            r13.L$1 = r8
            r13.L$2 = r4
            r13.label = r2
            java.lang.Object r14 = r1.c(r14)
            if (r14 == r0) goto L87
            goto L4d
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
