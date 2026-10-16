package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.an;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class InfiniteTransition$run$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$1$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, e<? super InfiniteTransition$run$1$1> eVar) {
        super(2, eVar);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    static final ab invokeSuspend$lambda$0(MutableState mutableState, InfiniteTransition infiniteTransition, an anVar, af afVar, long j2) {
        State state = (State) mutableState.getValue();
        long jLongValue = state != null ? ((Number) state.getValue()).longValue() : j2;
        if (infiniteTransition.startTimeNanos == Long.MIN_VALUE || anVar.f48102a != SuspendAnimationKt.getDurationScale(afVar.getCoroutineContext())) {
            infiniteTransition.startTimeNanos = j2;
            MutableVector mutableVector = infiniteTransition._animations;
            Object[] objArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                ((InfiniteTransition.TransitionAnimationState) objArr[i2]).reset$animation_core();
            }
            anVar.f48102a = SuspendAnimationKt.getDurationScale(afVar.getCoroutineContext());
        }
        if (anVar.f48102a == 0.0f) {
            MutableVector mutableVector2 = infiniteTransition._animations;
            Object[] objArr2 = mutableVector2.content;
            int size2 = mutableVector2.getSize();
            for (int i3 = 0; i3 < size2; i3++) {
                ((InfiniteTransition.TransitionAnimationState) objArr2[i3]).skipToEnd$animation_core();
            }
        } else {
            infiniteTransition.onFrame((long) ((jLongValue - infiniteTransition.startTimeNanos) / anVar.f48102a));
        }
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.$toolingOverride, this.this$0, eVar);
        infiniteTransition$run$1$1.L$0 = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((InfiniteTransition$run$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Path cross not found for [B:11:0x003d, B:15:0x005c], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:15:0x005c, B:11:0x003d], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[PHI: r1 r4
  0x0055: PHI (r1v2 h.g.b.an) = (r1v3 h.g.b.an), (r1v5 h.g.b.an) binds: [B:12:0x0053, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r4v2 kotlinx.coroutines.af) = (r4v3 kotlinx.coroutines.af), (r4v5 kotlinx.coroutines.af) binds: [B:12:0x0053, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005a -> B:11:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007a -> B:11:0x003d). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r7.L$1
            h.g.b.an r1 = (h.g.b.an) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.af r4 = (kotlinx.coroutines.af) r4
            e.b.c.b(r8)
            goto L3d
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L20:
            java.lang.Object r1 = r7.L$1
            h.g.b.an r1 = (h.g.b.an) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.af r4 = (kotlinx.coroutines.af) r4
            e.b.c.b(r8)
            goto L55
        L2c:
            e.b.c.b(r8)
            java.lang.Object r8 = r7.L$0
            r4 = r8
            kotlinx.coroutines.af r4 = (kotlinx.coroutines.af) r4
            h.g.b.an r1 = new h.g.b.an
            r1.<init>()
            r8 = 1065353216(0x3f800000, float:1.0)
            r1.f48102a = r8
        L3d:
            androidx.compose.animation.core.InfiniteTransition$run$1$1$$ExternalSyntheticLambda0 r8 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$$ExternalSyntheticLambda0
            androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r5 = r7.$toolingOverride
            androidx.compose.animation.core.InfiniteTransition r6 = r7.this$0
            r8.<init>()
            r5 = r7
            h.c.e r5 = (h.c.e) r5
            r7.L$0 = r4
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r8 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r8, r5)
            if (r8 == r0) goto L7c
        L55:
            float r8 = r1.f48102a
            r5 = 0
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L3d
            androidx.compose.animation.core.InfiniteTransition$run$1$1$$ExternalSyntheticLambda1 r8 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$$ExternalSyntheticLambda1
            r8.<init>()
            kotlinx.coroutines.b.k r8 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r8)
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r6 = 0
            r5.<init>(r6)
            h.g.a.p r5 = (h.g.a.p) r5
            r6 = r7
            h.c.e r6 = (h.c.e) r6
            r7.L$0 = r4
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.b.ai.i(r8, r5, r6)
            if (r8 != r0) goto L3d
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<Float, e<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass3(e<? super AnonymousClass3> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(eVar);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        public final Object invoke(float f2, e<? super Boolean> eVar) {
            return ((AnonymousClass3) create(Float.valueOf(f2), eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return Boolean.valueOf(this.F$0 > 0.0f);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Float f2, e<? super Boolean> eVar) {
            return invoke(f2.floatValue(), eVar);
        }
    }
}
