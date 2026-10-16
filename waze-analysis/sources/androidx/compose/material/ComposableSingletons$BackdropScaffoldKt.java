package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposableSingletons$BackdropScaffoldKt {
    public static final ComposableSingletons$BackdropScaffoldKt INSTANCE = new ComposableSingletons$BackdropScaffoldKt();
    private static q<SnackbarHostState, Composer, Integer, ab> lambda$2057676608 = ComposableLambdaKt.composableLambdaInstance(2057676608, false, new q() { // from class: androidx.compose.material.ComposableSingletons$BackdropScaffoldKt$$ExternalSyntheticLambda0
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BackdropScaffoldKt.lambda_2057676608$lambda$0((SnackbarHostState) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    static final ab lambda_2057676608$lambda$0(SnackbarHostState snackbarHostState, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(snackbarHostState) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2057676608, i2, -1, "androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.lambda$2057676608.<anonymous> (BackdropScaffold.kt:350)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i2 & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public final q<SnackbarHostState, Composer, Integer, ab> getLambda$2057676608$material() {
        return lambda$2057676608;
    }
}
