package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableSingletons$SearchBarKt {
    public static final ComposableSingletons$SearchBarKt INSTANCE = new ComposableSingletons$SearchBarKt();
    private static p<Composer, Integer, ab> lambda$1165377840 = ComposableLambdaKt.composableLambdaInstance(1165377840, false, new p() { // from class: androidx.compose.material3.ComposableSingletons$SearchBarKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SearchBarKt.lambda_1165377840$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static p<Composer, Integer, ab> lambda$1464724888 = ComposableLambdaKt.composableLambdaInstance(1464724888, false, new p() { // from class: androidx.compose.material3.ComposableSingletons$SearchBarKt$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SearchBarKt.lambda_1464724888$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    static final ab lambda_1165377840$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1165377840, i2, -1, "androidx.compose.material3.ComposableSingletons$SearchBarKt.lambda$1165377840.<anonymous> (SearchBar.kt:3100)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab lambda_1464724888$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1464724888, i2, -1, "androidx.compose.material3.ComposableSingletons$SearchBarKt.lambda$1464724888.<anonymous> (SearchBar.kt:3530)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public final p<Composer, Integer, ab> getLambda$1165377840$material3() {
        return lambda$1165377840;
    }

    public final p<Composer, Integer, ab> getLambda$1464724888$material3() {
        return lambda$1464724888;
    }
}
