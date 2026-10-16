package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AppBarColumnKt {
    public static final ComposableSingletons$AppBarColumnKt INSTANCE = new ComposableSingletons$AppBarColumnKt();
    private static q<AppBarMenuState, Composer, Integer, ab> lambda$479541071 = ComposableLambdaKt.composableLambdaInstance(479541071, false, new q() { // from class: androidx.compose.material3.ComposableSingletons$AppBarColumnKt$$ExternalSyntheticLambda0
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AppBarColumnKt.lambda_479541071$lambda$0((AppBarMenuState) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    static final ab lambda_479541071$lambda$0(AppBarMenuState appBarMenuState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(479541071, i2, -1, "androidx.compose.material3.ComposableSingletons$AppBarColumnKt.lambda$479541071.<anonymous> (AppBarColumn.kt:52)");
        }
        AppBarDslKt.AppBarOverflowIndicator(appBarMenuState, null, false, null, null, null, composer, i2 & 14, 62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    public final q<AppBarMenuState, Composer, Integer, ab> getLambda$479541071$material3() {
        return lambda$479541071;
    }
}
