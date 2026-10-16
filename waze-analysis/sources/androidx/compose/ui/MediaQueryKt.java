package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MediaQueryKt {
    private static final ProvidableCompositionLocal<UiMediaScope> LocalUiMediaScope = CompositionLocalKt.staticCompositionLocalOf(MediaQueryKt$LocalUiMediaScope$1.INSTANCE);

    public static final <T> State<T> derivedMediaQuery(l<? super UiMediaScope, ? extends T> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-287752256, i2, -1, "androidx.compose.ui.derivedMediaQuery (MediaQuery.kt:253)");
        }
        UiMediaScope uiMediaScope = (UiMediaScope) composer.consume(LocalUiMediaScope);
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        boolean zChanged = composer.changed(uiMediaScope);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new MediaQueryKt$derivedMediaQuery$1$1(uiMediaScope, stateRememberUpdatedState));
            composer.updateRememberedValue(objRememberedValue);
        }
        State<T> state = (State) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> l<UiMediaScope, T> derivedMediaQuery$lambda$0(State<? extends l<? super UiMediaScope, ? extends T>> state) {
        return state.getValue();
    }

    public static final ProvidableCompositionLocal<UiMediaScope> getLocalUiMediaScope() {
        return LocalUiMediaScope;
    }

    public static final <T> T mediaQuery(CompositionLocalAccessorScope compositionLocalAccessorScope, l<? super UiMediaScope, ? extends T> lVar) {
        return lVar.invoke(compositionLocalAccessorScope.getCurrentValue(getLocalUiMediaScope()));
    }

    public static /* synthetic */ void getLocalUiMediaScope$annotations() {
    }

    public static final <T> T mediaQuery(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, l<? super UiMediaScope, ? extends T> lVar) {
        return lVar.invoke(CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, getLocalUiMediaScope()));
    }

    public static final <T> T mediaQuery(l<? super UiMediaScope, ? extends T> lVar, Composer composer, int i2) {
        return lVar.invoke(composer.consume(getLocalUiMediaScope()));
    }
}
