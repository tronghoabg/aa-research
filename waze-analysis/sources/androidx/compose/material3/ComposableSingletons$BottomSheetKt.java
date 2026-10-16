package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableSingletons$BottomSheetKt {
    public static final ComposableSingletons$BottomSheetKt INSTANCE = new ComposableSingletons$BottomSheetKt();

    /* renamed from: lambda$-1568572631, reason: not valid java name */
    private static p<Composer, Integer, ab> f31lambda$1568572631 = ComposableLambdaKt.composableLambdaInstance(-1568572631, false, new p() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BottomSheetKt.lambda__1568572631$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static p<Composer, Integer, ab> lambda$412247037 = ComposableLambdaKt.composableLambdaInstance(412247037, false, new p() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetKt$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BottomSheetKt.lambda_412247037$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    static final ab lambda_412247037$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(412247037, i2, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetKt.lambda$412247037.<anonymous> (BottomSheet.kt:199)");
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

    static final ab lambda__1568572631$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1568572631, i2, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetKt.lambda$-1568572631.<anonymous> (BottomSheet.kt:123)");
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

    /* renamed from: getLambda$-1568572631$material3, reason: not valid java name */
    public final p<Composer, Integer, ab> m4624getLambda$1568572631$material3() {
        return f31lambda$1568572631;
    }

    public final p<Composer, Integer, ab> getLambda$412247037$material3() {
        return lambda$412247037;
    }
}
