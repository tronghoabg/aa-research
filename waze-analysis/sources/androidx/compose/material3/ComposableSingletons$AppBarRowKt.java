package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AppBarRowKt {
    public static final ComposableSingletons$AppBarRowKt INSTANCE = new ComposableSingletons$AppBarRowKt();
    private static q<AppBarMenuState, Composer, Integer, ab> lambda$1581062749 = ComposableLambdaKt.composableLambdaInstance(1581062749, false, new q() { // from class: androidx.compose.material3.ComposableSingletons$AppBarRowKt$$ExternalSyntheticLambda0
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AppBarRowKt.lambda_1581062749$lambda$0((AppBarMenuState) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    static final ab lambda_1581062749$lambda$0(AppBarMenuState appBarMenuState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1581062749, i2, -1, "androidx.compose.material3.ComposableSingletons$AppBarRowKt.lambda$1581062749.<anonymous> (AppBarRow.kt:54)");
        }
        AppBarDslKt.AppBarOverflowIndicator(appBarMenuState, null, false, null, null, null, composer, i2 & 14, 62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    public final q<AppBarMenuState, Composer, Integer, ab> getLambda$1581062749$material3() {
        return lambda$1581062749;
    }
}
