package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ComposableSingletons$DialogNavigatorKt {
    public static final ComposableSingletons$DialogNavigatorKt INSTANCE = new ComposableSingletons$DialogNavigatorKt();

    /* renamed from: lambda$-1092249270, reason: not valid java name */
    private static q<NavBackStackEntry, Composer, Integer, ab> f50lambda$1092249270 = ComposableLambdaKt.composableLambdaInstance(-1092249270, false, new q() { // from class: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$$ExternalSyntheticLambda0
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DialogNavigatorKt.lambda__1092249270$lambda$0((NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    static final ab lambda__1092249270$lambda$0(NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092249270, i2, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda$-1092249270.<anonymous> (DialogNavigator.kt:58)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-1092249270$navigation_compose, reason: not valid java name */
    public final q<NavBackStackEntry, Composer, Integer, ab> m13222getLambda$1092249270$navigation_compose() {
        return f50lambda$1092249270;
    }
}
