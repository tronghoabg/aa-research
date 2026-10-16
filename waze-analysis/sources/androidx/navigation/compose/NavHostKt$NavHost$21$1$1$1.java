package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.navigation.NavBackStackEntry;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class NavHostKt$NavHost$21$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ SeekableTransitionState<NavBackStackEntry> $transitionState;
    final /* synthetic */ float $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostKt$NavHost$21$1$1$1(float f2, SeekableTransitionState<NavBackStackEntry> seekableTransitionState, NavBackStackEntry navBackStackEntry, e<? super NavHostKt$NavHost$21$1$1$1> eVar) {
        super(2, eVar);
        this.$value = f2;
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = navBackStackEntry;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new NavHostKt$NavHost$21$1$1$1(this.$value, this.$transitionState, this.$backStackEntry, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((NavHostKt$NavHost$21$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r10.$transitionState.snapTo(r10.$backStackEntry, r10) != r0) goto L21;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r10.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            e.b.c.b(r11)
            goto L4f
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L19:
            e.b.c.b(r11)
            goto L38
        L1d:
            e.b.c.b(r11)
            float r5 = r10.$value
            int r11 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r11 <= 0) goto L38
            r11 = r4
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r4 = r10.$transitionState
            r7 = r10
            h.c.e r7 = (h.c.e) r7
            r10.label = r11
            r8 = 2
            r9 = 0
            r6 = 0
            java.lang.Object r11 = androidx.compose.animation.core.SeekableTransitionState.seekTo$default(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L38
            goto L4e
        L38:
            float r11 = r10.$value
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L4f
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r11 = r10.$transitionState
            androidx.navigation.NavBackStackEntry r1 = r10.$backStackEntry
            r2 = r10
            h.c.e r2 = (h.c.e) r2
            r10.label = r3
            java.lang.Object r10 = r11.snapTo(r1, r2)
            if (r10 == r0) goto L4e
            goto L4f
        L4e:
            return r0
        L4f:
            h.ab r10 = h.ab.f48028a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$21$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
