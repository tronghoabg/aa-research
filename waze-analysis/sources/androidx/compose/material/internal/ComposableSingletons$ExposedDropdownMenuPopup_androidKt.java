package androidx.compose.material.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableSingletons$ExposedDropdownMenuPopup_androidKt {
    public static final ComposableSingletons$ExposedDropdownMenuPopup_androidKt INSTANCE = new ComposableSingletons$ExposedDropdownMenuPopup_androidKt();

    /* renamed from: lambda$-1578637197, reason: not valid java name */
    private static p<Composer, Integer, ab> f13lambda$1578637197 = ComposableLambdaKt.composableLambdaInstance(-1578637197, false, new p() { // from class: androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ExposedDropdownMenuPopup_androidKt.lambda__1578637197$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    static final ab lambda__1578637197$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1578637197, i2, -1, "androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopup_androidKt.lambda$-1578637197.<anonymous> (ExposedDropdownMenuPopup.android.kt:287)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-1578637197$material, reason: not valid java name */
    public final p<Composer, Integer, ab> m4283getLambda$1578637197$material() {
        return f13lambda$1578637197;
    }
}
