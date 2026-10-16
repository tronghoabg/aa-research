package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Scrollable2DStateKt {
    public static final Scrollable2DState Scrollable2DState(l<? super Offset, Offset> lVar) {
        return new DefaultScrollable2DState(lVar);
    }

    public static final Scrollable2DState rememberScrollable2DState(l<? super Offset, Offset> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1315827064, i2, -1, "androidx.compose.foundation.gestures.rememberScrollable2DState (Scrollable2DState.kt:122)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = Scrollable2DState(new l() { // from class: androidx.compose.foundation.gestures.Scrollable2DStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Scrollable2DStateKt.rememberScrollable2DState$lambda$0$0(stateRememberUpdatedState, (Offset) obj);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        Scrollable2DState scrollable2DState = (Scrollable2DState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollable2DState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset rememberScrollable2DState$lambda$0$0(State state, Offset offset) {
        return (Offset) ((l) state.getValue()).invoke(offset);
    }
}
