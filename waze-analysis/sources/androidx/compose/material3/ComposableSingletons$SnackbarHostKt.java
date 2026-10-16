package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* renamed from: lambda$-1548712596, reason: not valid java name */
    private static q<SnackbarData, Composer, Integer, ab> f38lambda$1548712596 = ComposableLambdaKt.composableLambdaInstance(-1548712596, false, new q() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$$ExternalSyntheticLambda0
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SnackbarHostKt.lambda__1548712596$lambda$0((SnackbarData) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    static final ab lambda__1548712596$lambda$0(SnackbarData snackbarData, Composer composer, int i2) {
        SnackbarData snackbarData2;
        int i3;
        if ((i2 & 6) == 0) {
            snackbarData2 = snackbarData;
            i3 = i2 | (true != composer.changed(snackbarData2) ? 2 : 4);
        } else {
            snackbarData2 = snackbarData;
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548712596, i3, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda$-1548712596.<anonymous> (SnackbarHost.kt:219)");
            }
            SnackbarKt.m5631SnackbarsDKtq54(snackbarData2, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i3 & 14, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-1548712596$material3, reason: not valid java name */
    public final q<SnackbarData, Composer, Integer, ab> m4631getLambda$1548712596$material3() {
        return f38lambda$1548712596;
    }
}
