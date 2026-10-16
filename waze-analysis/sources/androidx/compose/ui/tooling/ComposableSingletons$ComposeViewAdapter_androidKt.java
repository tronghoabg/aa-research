package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ComposeViewAdapter_androidKt {
    public static final ComposableSingletons$ComposeViewAdapter_androidKt INSTANCE = new ComposableSingletons$ComposeViewAdapter_androidKt();

    /* renamed from: lambda$-1163195098, reason: not valid java name */
    private static p<Composer, Integer, ab> f47lambda$1163195098 = ComposableLambdaKt.composableLambdaInstance(-1163195098, false, new p() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ComposeViewAdapter_androidKt.lambda__1163195098$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static p<Composer, Integer, ab> lambda$2086912010 = ComposableLambdaKt.composableLambdaInstance(2086912010, false, new p() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ComposeViewAdapter_androidKt.lambda_2086912010$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    static final ab lambda_2086912010$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2086912010, i2, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda$2086912010.<anonymous> (ComposeViewAdapter.android.kt:164)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab lambda__1163195098$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1163195098, i2, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda$-1163195098.<anonymous> (ComposeViewAdapter.android.kt:83)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-1163195098$ui_tooling, reason: not valid java name */
    public final p<Composer, Integer, ab> m11073getLambda$1163195098$ui_tooling() {
        return f47lambda$1163195098;
    }

    public final p<Composer, Integer, ab> getLambda$2086912010$ui_tooling() {
        return lambda$2086912010;
    }
}
