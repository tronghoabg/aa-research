package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposableSingletons$RecomposerKt {
    public static final ComposableSingletons$RecomposerKt INSTANCE = new ComposableSingletons$RecomposerKt();

    /* renamed from: lambda$-1091980426, reason: not valid java name */
    private static p<Composer, Integer, ab> f45lambda$1091980426 = ComposableLambdaKt.composableLambdaInstance(-1091980426, false, new p() { // from class: androidx.compose.runtime.ComposableSingletons$RecomposerKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$RecomposerKt.lambda__1091980426$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    static final ab lambda__1091980426$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091980426, i2, -1, "androidx.compose.runtime.ComposableSingletons$RecomposerKt.lambda$-1091980426.<anonymous> (Recomposer.kt:469)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-1091980426$runtime, reason: not valid java name */
    public final p<Composer, Integer, ab> m7287getLambda$1091980426$runtime() {
        return f45lambda$1091980426;
    }
}
