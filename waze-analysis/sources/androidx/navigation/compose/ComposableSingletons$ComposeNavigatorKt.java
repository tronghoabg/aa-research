package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import h.ab;
import h.g.a.r;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ComposeNavigatorKt {
    public static final ComposableSingletons$ComposeNavigatorKt INSTANCE = new ComposableSingletons$ComposeNavigatorKt();
    private static r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, ab> lambda$127448943 = ComposableLambdaKt.composableLambdaInstance(127448943, false, new r() { // from class: androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt$$ExternalSyntheticLambda0
        @Override // h.g.a.r
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ComposableSingletons$ComposeNavigatorKt.lambda_127448943$lambda$0((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    });

    static final ab lambda_127448943$lambda$0(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(127448943, i2, -1, "androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt.lambda$127448943.<anonymous> (ComposeNavigator.kt:61)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    public final r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, ab> getLambda$127448943$navigation_compose() {
        return lambda$127448943;
    }
}
