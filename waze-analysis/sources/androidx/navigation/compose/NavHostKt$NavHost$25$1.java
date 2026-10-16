package androidx.navigation.compose;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class NavHostKt$NavHost$25$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;
    final /* synthetic */ MutableObjectFloatMap<String> $zIndices;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavHostKt$NavHost$25$1(Transition<NavBackStackEntry> transition, NavHostController navHostController, NavBackStackEntry navBackStackEntry, MutableObjectFloatMap<String> mutableObjectFloatMap, State<? extends List<NavBackStackEntry>> state, ComposeNavigator composeNavigator, e<? super NavHostKt$NavHost$25$1> eVar) {
        super(2, eVar);
        this.$transition = transition;
        this.$navController = navHostController;
        this.$backStackEntry = navBackStackEntry;
        this.$zIndices = mutableObjectFloatMap;
        this.$visibleEntries$delegate = state;
        this.$composeNavigator = composeNavigator;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new NavHostKt$NavHost$25$1(this.$transition, this.$navController, this.$backStackEntry, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((NavHostKt$NavHost$25$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r0 = r14.label
            if (r0 != 0) goto Lb0
            e.b.c.b(r15)
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r15 = r14.$transition
            java.lang.Object r0 = r15.getCurrentState()
            java.lang.Object r15 = r15.getTargetState()
            boolean r15 = h.g.b.x.n(r0, r15)
            if (r15 == 0) goto Lad
            androidx.navigation.NavHostController r15 = r14.$navController
            androidx.navigation.NavBackStackEntry r15 = r15.getCurrentBackStackEntry()
            if (r15 == 0) goto L2f
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r15 = r14.$transition
            androidx.navigation.NavBackStackEntry r0 = r14.$backStackEntry
            java.lang.Object r15 = r15.getTargetState()
            boolean r15 = h.g.b.x.n(r15, r0)
            if (r15 == 0) goto Lad
        L2f:
            androidx.compose.runtime.State<java.util.List<androidx.navigation.NavBackStackEntry>> r15 = r14.$visibleEntries$delegate
            java.util.List r15 = androidx.navigation.compose.NavHostKt.access$NavHost$lambda$32(r15)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            androidx.navigation.compose.ComposeNavigator r0 = r14.$composeNavigator
            java.util.Iterator r15 = r15.iterator()
        L3d:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r15.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            r0.onTransitionComplete(r1)
            goto L3d
        L4d:
            androidx.collection.MutableObjectFloatMap<java.lang.String> r15 = r14.$zIndices
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r14 = r14.$transition
            r0 = r15
            androidx.collection.ObjectFloatMap r0 = (androidx.collection.ObjectFloatMap) r0
            long[] r0 = r0.metadata
            int r1 = r0.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto Lad
            r2 = 0
            r3 = r2
        L5d:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto La8
            int r6 = r3 - r1
            r7 = r2
        L70:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto La6
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto La2
            int r8 = r3 << 3
            int r8 = r8 + r7
            java.lang.Object[] r10 = r15.keys
            r10 = r10[r8]
            float[] r11 = r15.values
            r11 = r11[r8]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r14.getTargetState()
            androidx.navigation.NavBackStackEntry r11 = (androidx.navigation.NavBackStackEntry) r11
            java.lang.String r11 = r11.getId()
            boolean r10 = h.g.b.x.n(r10, r11)
            if (r10 != 0) goto La2
            r15.removeValueAt(r8)
        La2:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L70
        La6:
            if (r8 != r9) goto Lad
        La8:
            if (r3 == r1) goto Lad
            int r3 = r3 + 1
            goto L5d
        Lad:
            h.ab r14 = h.ab.f48028a
            return r14
        Lb0:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$25$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
