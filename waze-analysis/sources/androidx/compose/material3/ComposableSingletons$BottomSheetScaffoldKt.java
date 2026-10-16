package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();
    private static p<Composer, Integer, ab> lambda$1392012807 = ComposableLambdaKt.composableLambdaInstance(1392012807, false, new p() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BottomSheetScaffoldKt.lambda_1392012807$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static q<SnackbarHostState, Composer, Integer, ab> lambda$1768941633 = ComposableLambdaKt.composableLambdaInstance(1768941633, false, new q() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$$ExternalSyntheticLambda1
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BottomSheetScaffoldKt.lambda_1768941633$lambda$0((SnackbarHostState) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-788244078, reason: not valid java name */
    private static p<Composer, Integer, ab> f32lambda$788244078 = ComposableLambdaKt.composableLambdaInstance(-788244078, false, new p() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$$ExternalSyntheticLambda2
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BottomSheetScaffoldKt.lambda__788244078$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    static final ab lambda_1392012807$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1392012807, i2, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$1392012807.<anonymous> (BottomSheetScaffold.kt:126)");
            }
            BottomSheetDefaults.INSTANCE.m4388DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, 196608, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab lambda_1768941633$lambda$0(SnackbarHostState snackbarHostState, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(snackbarHostState) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1768941633, i2, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$1768941633.<anonymous> (BottomSheetScaffold.kt:129)");
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

    static final ab lambda__788244078$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-788244078, i2, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$-788244078.<anonymous> (BottomSheetScaffold.kt:440)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-788244078$material3, reason: not valid java name */
    public final p<Composer, Integer, ab> m4625getLambda$788244078$material3() {
        return f32lambda$788244078;
    }

    public final p<Composer, Integer, ab> getLambda$1392012807$material3() {
        return lambda$1392012807;
    }

    public final q<SnackbarHostState, Composer, Integer, ab> getLambda$1768941633$material3() {
        return lambda$1768941633;
    }
}
