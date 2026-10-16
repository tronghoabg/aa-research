package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.navigation.NavBackStackEntry;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class NavHostKt$NavHost$21$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ SeekableTransitionState<NavBackStackEntry> $transitionState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostKt$NavHost$21$1(SeekableTransitionState<NavBackStackEntry> seekableTransitionState, NavBackStackEntry navBackStackEntry, Transition<NavBackStackEntry> transition, e<? super NavHostKt$NavHost$21$1> eVar) {
        super(2, eVar);
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = navBackStackEntry;
        this.$transition = transition;
    }

    static final ab invokeSuspend$lambda$0(af afVar, SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, float f2, float f3) {
        aj.z(afVar, null, null, new NavHostKt$NavHost$21$1$1$1(f2, seekableTransitionState, navBackStackEntry, null), 3);
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        NavHostKt$NavHost$21$1 navHostKt$NavHost$21$1 = new NavHostKt$NavHost$21$1(this.$transitionState, this.$backStackEntry, this.$transition, eVar);
        navHostKt$NavHost$21$1.L$0 = obj;
        return navHostKt$NavHost$21$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((NavHostKt$NavHost$21$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r13.$transitionState, r13.$backStackEntry, null, r13, 2, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(r5, 0.0f, 0.0f, r8, new androidx.navigation.compose.NavHostKt$NavHost$21$1$$ExternalSyntheticLambda0(r14, r1, r3), r13, 4, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        return r0;
     */
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
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L15:
            e.b.c.b(r14)
            goto L7b
        L19:
            e.b.c.b(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.af r14 = (kotlinx.coroutines.af) r14
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r1 = r13.$transitionState
            androidx.navigation.NavBackStackEntry r4 = r13.$backStackEntry
            java.lang.Object r1 = r1.getCurrentState()
            boolean r1 = h.g.b.x.n(r1, r4)
            if (r1 != 0) goto L41
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r4 = r13.$transitionState
            androidx.navigation.NavBackStackEntry r5 = r13.$backStackEntry
            r7 = r13
            h.c.e r7 = (h.c.e) r7
            r13.label = r3
            r8 = 2
            r9 = 0
            r6 = 0
            java.lang.Object r13 = androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L7b
            goto L7a
        L41:
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r1 = r13.$transition
            long r3 = r1.getTotalDurationNanos()
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r1 = r13.$transitionState
            float r5 = r1.getFraction()
            float r1 = r1.getFraction()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            r3 = 0
            r4 = 6
            r6 = 0
            androidx.compose.animation.core.TweenSpec r1 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r1, r3, r6, r4, r6)
            r8 = r1
            androidx.compose.animation.core.AnimationSpec r8 = (androidx.compose.animation.core.AnimationSpec) r8
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r1 = r13.$transitionState
            androidx.navigation.NavBackStackEntry r3 = r13.$backStackEntry
            androidx.navigation.compose.NavHostKt$NavHost$21$1$$ExternalSyntheticLambda0 r9 = new androidx.navigation.compose.NavHostKt$NavHost$21$1$$ExternalSyntheticLambda0
            r9.<init>()
            r10 = r13
            h.c.e r10 = (h.c.e) r10
            r13.label = r2
            r11 = 4
            r12 = 0
            r6 = 0
            r7 = 0
            java.lang.Object r13 = androidx.compose.animation.core.SuspendAnimationKt.animate$default(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r0) goto L7b
        L7a:
            return r0
        L7b:
            h.ab r13 = h.ab.f48028a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$21$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
