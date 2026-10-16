package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposableSingletons$AppBarKt {
    public static final ComposableSingletons$AppBarKt INSTANCE = new ComposableSingletons$AppBarKt();
    private static q<RowScope, Composer, Integer, ab> lambda$269254275 = ComposableLambdaKt.composableLambdaInstance(269254275, false, new q() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$$ExternalSyntheticLambda0
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AppBarKt.lambda_269254275$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static q<RowScope, Composer, Integer, ab> lambda$1260131259 = ComposableLambdaKt.composableLambdaInstance(1260131259, false, new q() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$$ExternalSyntheticLambda1
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AppBarKt.lambda_1260131259$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    static final ab lambda_1260131259$lambda$0(RowScope rowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1260131259, i2, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda$1260131259.<anonymous> (AppBar.kt:164)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab lambda_269254275$lambda$0(RowScope rowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(269254275, i2, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda$269254275.<anonymous> (AppBar.kt:88)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public final q<RowScope, Composer, Integer, ab> getLambda$1260131259$material() {
        return lambda$1260131259;
    }

    public final q<RowScope, Composer, Integer, ab> getLambda$269254275$material() {
        return lambda$269254275;
    }
}
