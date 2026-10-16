package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollableStateKt {
    public static final ScrollableState ScrollableState(l<? super Float, Float> lVar) {
        return new DefaultScrollableState(lVar);
    }

    public static final ScrollableState rememberScrollableState(l<? super Float, Float> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180460798, i2, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:169)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = ScrollableState(new l() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Float.valueOf(ScrollableStateKt.rememberScrollableState$lambda$0$0(stateRememberUpdatedState, ((Float) obj).floatValue()));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrollableState scrollableState = (ScrollableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rememberScrollableState$lambda$0$0(State state, float f2) {
        return ((Number) ((l) state.getValue()).invoke(Float.valueOf(f2))).floatValue();
    }
}
