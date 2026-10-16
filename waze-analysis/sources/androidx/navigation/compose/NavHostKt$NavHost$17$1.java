package androidx.navigation.compose;

import androidx.activity.BackEventCompat;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class NavHostKt$NavHost$17$1 extends g implements p<k<? extends BackEventCompat>, e<? super ab>, Object> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ State<List<NavBackStackEntry>> $currentBackStack$delegate;
    final /* synthetic */ MutableState<Boolean> $inPredictiveBack$delegate;
    final /* synthetic */ MutableFloatState $progress$delegate;
    final /* synthetic */ MutableIntState $swipeEdge$delegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavHostKt$NavHost$17$1(ComposeNavigator composeNavigator, State<? extends List<NavBackStackEntry>> state, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState, MutableIntState mutableIntState, e<? super NavHostKt$NavHost$17$1> eVar) {
        super(2, eVar);
        this.$composeNavigator = composeNavigator;
        this.$currentBackStack$delegate = state;
        this.$progress$delegate = mutableFloatState;
        this.$inPredictiveBack$delegate = mutableState;
        this.$swipeEdge$delegate = mutableIntState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        NavHostKt$NavHost$17$1 navHostKt$NavHost$17$1 = new NavHostKt$NavHost$17$1(this.$composeNavigator, this.$currentBackStack$delegate, this.$progress$delegate, this.$inPredictiveBack$delegate, this.$swipeEdge$delegate, eVar);
        navHostKt$NavHost$17$1.L$0 = obj;
        return navHostKt$NavHost$17$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(k<BackEventCompat> kVar, e<? super ab> eVar) {
        return ((NavHostKt$NavHost$17$1) create(kVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r9.collect(androidx.navigation.compose.NavHostKt$NavHost$17$1.AnonymousClass1.INSTANCE, r8) == r0) goto L28;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.label
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L25
            if (r1 == r2) goto L21
            if (r1 != r4) goto L19
            java.lang.Object r0 = r8.L$0
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L16
            goto L98
        L16:
            r9 = move-exception
            goto La6
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L21:
            e.b.c.b(r9)
            goto L48
        L25:
            e.b.c.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.b.k r9 = (kotlinx.coroutines.b.k) r9
            androidx.compose.runtime.State<java.util.List<androidx.navigation.NavBackStackEntry>> r1 = r8.$currentBackStack$delegate
            java.util.List r1 = androidx.navigation.compose.NavHostKt.access$NavHost$lambda$18(r1)
            int r1 = r1.size()
            if (r1 >= r4) goto L4b
            androidx.navigation.compose.NavHostKt$NavHost$17$1$1<T> r1 = new kotlinx.coroutines.b.l() { // from class: androidx.navigation.compose.NavHostKt$NavHost$17$1.1
                static {
                    /*
                        androidx.navigation.compose.NavHostKt$NavHost$17$1$1 r0 = new androidx.navigation.compose.NavHostKt$NavHost$17$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.navigation.compose.NavHostKt$NavHost$17$1$1<T>) androidx.navigation.compose.NavHostKt$NavHost$17$1.1.INSTANCE androidx.navigation.compose.NavHostKt$NavHost$17$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$17$1.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$17$1.AnonymousClass1.<init>():void");
                }

                @Override // kotlinx.coroutines.b.l
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, h.c.e r2) {
                    /*
                        r0 = this;
                        androidx.activity.BackEventCompat r1 = (androidx.activity.BackEventCompat) r1
                        java.lang.Object r0 = r0.emit(r1, r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$17$1.AnonymousClass1.emit(java.lang.Object, h.c.e):java.lang.Object");
                }

                public final java.lang.Object emit(androidx.activity.BackEventCompat r1, h.c.e<? super h.ab> r2) {
                    /*
                        r0 = this;
                        h.ab r0 = h.ab.f48028a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$17$1.AnonymousClass1.emit(androidx.activity.BackEventCompat, h.c.e):java.lang.Object");
                }
            }
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            r3 = r8
            h.c.e r3 = (h.c.e) r3
            r8.label = r2
            java.lang.Object r8 = r9.collect(r1, r3)
            if (r8 != r0) goto L48
            goto La5
        L48:
            h.ab r8 = h.ab.f48028a
            return r8
        L4b:
            androidx.compose.runtime.MutableFloatState r1 = r8.$progress$delegate
            r2 = 0
            androidx.navigation.compose.NavHostKt.access$NavHost$lambda$21(r1, r2)
            androidx.compose.runtime.State<java.util.List<androidx.navigation.NavBackStackEntry>> r1 = r8.$currentBackStack$delegate
            java.util.List r1 = androidx.navigation.compose.NavHostKt.access$NavHost$lambda$18(r1)
            java.lang.Object r1 = h.a.i.T(r1)
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.compose.ComposeNavigator r2 = r8.$composeNavigator
            r2.prepareForTransition(r1)
            androidx.compose.runtime.State<java.util.List<androidx.navigation.NavBackStackEntry>> r2 = r8.$currentBackStack$delegate
            java.util.List r5 = androidx.navigation.compose.NavHostKt.access$NavHost$lambda$18(r2)
            java.util.List r2 = androidx.navigation.compose.NavHostKt.access$NavHost$lambda$18(r2)
            int r2 = r2.size()
            int r2 = r2 + (-2)
            java.lang.Object r2 = r5.get(r2)
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.navigation.compose.ComposeNavigator r5 = r8.$composeNavigator
            r5.prepareForTransition(r2)
            androidx.navigation.compose.NavHostKt$NavHost$17$1$2 r2 = new androidx.navigation.compose.NavHostKt$NavHost$17$1$2     // Catch: java.lang.Throwable -> L16
            androidx.compose.runtime.MutableState<java.lang.Boolean> r5 = r8.$inPredictiveBack$delegate     // Catch: java.lang.Throwable -> L16
            androidx.compose.runtime.MutableFloatState r6 = r8.$progress$delegate     // Catch: java.lang.Throwable -> L16
            androidx.compose.runtime.MutableIntState r7 = r8.$swipeEdge$delegate     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2     // Catch: java.lang.Throwable -> L16
            r5 = r8
            h.c.e r5 = (h.c.e) r5     // Catch: java.lang.Throwable -> L16
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L16
            r8.label = r4     // Catch: java.lang.Throwable -> L16
            java.lang.Object r9 = r9.collect(r2, r5)     // Catch: java.lang.Throwable -> L16
            if (r9 == r0) goto La5
            r0 = r1
        L98:
            androidx.navigation.compose.ComposeNavigator r9 = r8.$composeNavigator     // Catch: java.lang.Throwable -> L16
            r9.popBackStack(r0, r3)     // Catch: java.lang.Throwable -> L16
            androidx.compose.runtime.MutableState<java.lang.Boolean> r8 = r8.$inPredictiveBack$delegate
            androidx.navigation.compose.NavHostKt.access$NavHost$lambda$24(r8, r3)
            h.ab r8 = h.ab.f48028a
            return r8
        La5:
            return r0
        La6:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r8 = r8.$inPredictiveBack$delegate
            androidx.navigation.compose.NavHostKt.access$NavHost$lambda$24(r8, r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$17$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(k<? extends BackEventCompat> kVar, e<? super ab> eVar) {
        return invoke2((k<BackEventCompat>) kVar, eVar);
    }
}
