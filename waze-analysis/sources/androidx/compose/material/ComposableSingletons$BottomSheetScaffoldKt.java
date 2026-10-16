package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();
    private static q<SnackbarHostState, Composer, Integer, ab> lambda$937349512 = ComposableLambdaKt.composableLambdaInstance(937349512, false, new q() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$$ExternalSyntheticLambda0
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BottomSheetScaffoldKt.lambda_937349512$lambda$0((SnackbarHostState) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-505419337, reason: not valid java name */
    private static p<Composer, Integer, ab> f6lambda$505419337 = ComposableLambdaKt.composableLambdaInstance(-505419337, false, new p() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BottomSheetScaffoldKt.lambda__505419337$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static p<Composer, Integer, ab> lambda$687232378 = ComposableLambdaKt.composableLambdaInstance(687232378, false, new p() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$$ExternalSyntheticLambda2
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BottomSheetScaffoldKt.lambda_687232378$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    static final ab lambda_687232378$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(687232378, i2, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$687232378.<anonymous> (BottomSheetScaffold.kt:476)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab lambda_937349512$lambda$0(SnackbarHostState snackbarHostState, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(snackbarHostState) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(937349512, i2, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$937349512.<anonymous> (BottomSheetScaffold.kt:324)");
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

    static final ab lambda__505419337$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-505419337, i2, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$-505419337.<anonymous> (BottomSheetScaffold.kt:473)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-505419337$material, reason: not valid java name */
    public final p<Composer, Integer, ab> m4050getLambda$505419337$material() {
        return f6lambda$505419337;
    }

    public final p<Composer, Integer, ab> getLambda$687232378$material() {
        return lambda$687232378;
    }

    public final q<SnackbarHostState, Composer, Integer, ab> getLambda$937349512$material() {
        return lambda$937349512;
    }
}
