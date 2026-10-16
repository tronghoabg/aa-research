package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimateAsStateKt$animateValueAsState$3$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ State<AnimationSpec> $animSpec$delegate;
    final /* synthetic */ Animatable $animatable;
    final /* synthetic */ o $channel;
    final /* synthetic */ State<l> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ State<AnimationSpec> $animSpec$delegate;
        final /* synthetic */ Animatable $animatable;
        final /* synthetic */ State<l> $listener$delegate;
        final /* synthetic */ Object $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Object obj, Animatable animatable, State<? extends AnimationSpec> state, State<? extends l> state2, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$newTarget = obj;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, eVar);
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
                if (!x.n(this.$newTarget, this.$animatable.getTargetValue())) {
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$animatable, this.$newTarget, AnimateAsStateKt.animateValueAsState$lambda$5(this.$animSpec$delegate), null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                }
                return ab.f48028a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            l lVarAnimateValueAsState$lambda$3 = AnimateAsStateKt.animateValueAsState$lambda$3(this.$listener$delegate);
            if (lVarAnimateValueAsState$lambda$3 != null) {
                lVarAnimateValueAsState$lambda$3.invoke(this.$animatable.getValue());
            }
            return ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnimateAsStateKt$animateValueAsState$3$1(o oVar, Animatable animatable, State<? extends AnimationSpec> state, State<? extends l> state2, e<? super AnimateAsStateKt$animateValueAsState$3$1> eVar) {
        super(2, eVar);
        this.$channel = oVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, eVar);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:12:0x003b). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r11.L$1
            kotlinx.coroutines.a.q r1 = (kotlinx.coroutines.a.q) r1
            java.lang.Object r3 = r11.L$0
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            e.b.c.b(r12)
            goto L3b
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1d:
            e.b.c.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.af r12 = (kotlinx.coroutines.af) r12
            kotlinx.coroutines.a.o r1 = r11.$channel
            kotlinx.coroutines.a.q r1 = r1.p()
            r3 = r12
        L2b:
            r12 = r11
            h.c.e r12 = (h.c.e) r12
            r11.L$0 = r3
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r12 = r1.a(r12)
            if (r12 != r0) goto L3b
            return r0
        L3b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L6a
            java.lang.Object r12 = r1.b()
            kotlinx.coroutines.a.o r4 = r11.$channel
            java.lang.Object r4 = r4.h()
            java.lang.Object r4 = kotlinx.coroutines.a.t.a(r4)
            if (r4 == 0) goto L55
            r6 = r4
            goto L56
        L55:
            r6 = r12
        L56:
            androidx.compose.animation.core.Animatable r7 = r11.$animatable
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec> r8 = r11.$animSpec$delegate
            androidx.compose.runtime.State<h.g.a.l> r9 = r11.$listener$delegate
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r5 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            h.g.a.p r5 = (h.g.a.p) r5
            r12 = 3
            r4 = 0
            kotlinx.coroutines.aj.z(r3, r4, r4, r5, r12)
            goto L2b
        L6a:
            h.ab r11 = h.ab.f48028a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
