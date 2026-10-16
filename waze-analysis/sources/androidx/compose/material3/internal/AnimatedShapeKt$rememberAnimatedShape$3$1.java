package androidx.compose.material3.internal;

import androidx.compose.foundation.shape.RoundedCornerShape;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AnimatedShapeKt$rememberAnimatedShape$3$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ o<RoundedCornerShape> $channel;
    final /* synthetic */ AnimatedShapeState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ RoundedCornerShape $newTarget;
        final /* synthetic */ AnimatedShapeState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnimatedShapeState animatedShapeState, RoundedCornerShape roundedCornerShape, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$state = animatedShapeState;
            this.$newTarget = roundedCornerShape;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$state, this.$newTarget, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.$state.animateToShape(this.$newTarget, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedShapeKt$rememberAnimatedShape$3$1(o<RoundedCornerShape> oVar, AnimatedShapeState animatedShapeState, e<? super AnimatedShapeKt$rememberAnimatedShape$3$1> eVar) {
        super(2, eVar);
        this.$channel = oVar;
        this.$state = animatedShapeState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        AnimatedShapeKt$rememberAnimatedShape$3$1 animatedShapeKt$rememberAnimatedShape$3$1 = new AnimatedShapeKt$rememberAnimatedShape$3$1(this.$channel, this.$state, eVar);
        animatedShapeKt$rememberAnimatedShape$3$1.L$0 = obj;
        return animatedShapeKt$rememberAnimatedShape$3$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((AnimatedShapeKt$rememberAnimatedShape$3$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:12:0x003b). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.a.q r1 = (kotlinx.coroutines.a.q) r1
            java.lang.Object r3 = r7.L$0
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            e.b.c.b(r8)
            goto L3b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1d:
            e.b.c.b(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.af r8 = (kotlinx.coroutines.af) r8
            kotlinx.coroutines.a.o<androidx.compose.foundation.shape.RoundedCornerShape> r1 = r7.$channel
            kotlinx.coroutines.a.q r1 = r1.p()
            r3 = r8
        L2b:
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r7.L$0 = r3
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r8 = r1.a(r8)
            if (r8 != r0) goto L3b
            return r0
        L3b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L67
            java.lang.Object r8 = r1.b()
            androidx.compose.foundation.shape.RoundedCornerShape r8 = (androidx.compose.foundation.shape.RoundedCornerShape) r8
            kotlinx.coroutines.a.o<androidx.compose.foundation.shape.RoundedCornerShape> r4 = r7.$channel
            java.lang.Object r4 = r4.h()
            java.lang.Object r4 = kotlinx.coroutines.a.t.a(r4)
            androidx.compose.foundation.shape.RoundedCornerShape r4 = (androidx.compose.foundation.shape.RoundedCornerShape) r4
            if (r4 == 0) goto L58
            r8 = r4
        L58:
            androidx.compose.material3.internal.AnimatedShapeState r4 = r7.$state
            androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1 r5 = new androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1
            r6 = 0
            r5.<init>(r4, r8, r6)
            h.g.a.p r5 = (h.g.a.p) r5
            r8 = 3
            kotlinx.coroutines.aj.z(r3, r6, r6, r5, r8)
            goto L2b
        L67:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
