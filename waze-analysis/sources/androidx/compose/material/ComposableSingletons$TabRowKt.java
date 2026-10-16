package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposableSingletons$TabRowKt {
    public static final ComposableSingletons$TabRowKt INSTANCE = new ComposableSingletons$TabRowKt();

    /* renamed from: lambda$-1216856915, reason: not valid java name */
    private static p<Composer, Integer, ab> f11lambda$1216856915 = ComposableLambdaKt.composableLambdaInstance(-1216856915, false, new p() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TabRowKt.lambda__1216856915$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-222041980, reason: not valid java name */
    private static p<Composer, Integer, ab> f12lambda$222041980 = ComposableLambdaKt.composableLambdaInstance(-222041980, false, new p() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TabRowKt.lambda__222041980$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    static final ab lambda__1216856915$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1216856915, i2, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda$-1216856915.<anonymous> (TabRow.kt:143)");
            }
            TabRowDefaults.INSTANCE.m4238Divider9IZ8Weo(null, 0.0f, 0L, composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab lambda__222041980$lambda$0(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222041980, i2, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda$-222041980.<anonymous> (TabRow.kt:234)");
            }
            TabRowDefaults.INSTANCE.m4238Divider9IZ8Weo(null, 0.0f, 0L, composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-1216856915$material, reason: not valid java name */
    public final p<Composer, Integer, ab> m4055getLambda$1216856915$material() {
        return f11lambda$1216856915;
    }

    /* renamed from: getLambda$-222041980$material, reason: not valid java name */
    public final p<Composer, Integer, ab> m4056getLambda$222041980$material() {
        return f12lambda$222041980;
    }
}
