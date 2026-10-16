package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt {
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = new ComposableSingletons$CoreTextFieldKt();
    private static q<p<? super Composer, ? super Integer, ab>, Composer, Integer, ab> lambda$559628295 = ComposableLambdaKt.composableLambdaInstance(559628295, false, new q() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$$ExternalSyntheticLambda0
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CoreTextFieldKt.lambda_559628295$lambda$0((p) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    static final ab lambda_559628295$lambda$0(p pVar, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changedInstance(pVar) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(559628295, i2, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda$559628295.<anonymous> (CoreTextField.kt:209)");
            }
            pVar.invoke(composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public final q<p<? super Composer, ? super Integer, ab>, Composer, Integer, ab> getLambda$559628295$foundation() {
        return lambda$559628295;
    }
}
