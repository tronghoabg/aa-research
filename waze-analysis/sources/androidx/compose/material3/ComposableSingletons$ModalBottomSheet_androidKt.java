package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableSingletons$ModalBottomSheet_androidKt {
    public static final ComposableSingletons$ModalBottomSheet_androidKt INSTANCE = new ComposableSingletons$ModalBottomSheet_androidKt();

    /* renamed from: lambda$-91331245, reason: not valid java name */
    private static p<Composer, Integer, ab> f35lambda$91331245 = ComposableLambdaKt.composableLambdaInstance(-91331245, false, new p() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ModalBottomSheet_androidKt.lambda__91331245$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    static final ab lambda__91331245$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-91331245, i2, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda$-91331245.<anonymous> (ModalBottomSheet.android.kt:278)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-91331245$material3, reason: not valid java name */
    public final p<Composer, Integer, ab> m4628getLambda$91331245$material3() {
        return f35lambda$91331245;
    }
}
