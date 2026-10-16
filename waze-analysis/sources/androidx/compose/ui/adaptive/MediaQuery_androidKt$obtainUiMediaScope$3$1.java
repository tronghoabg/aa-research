package androidx.compose.ui.adaptive;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.core.view.ViewCompat;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MediaQuery_androidKt$obtainUiMediaScope$3$1 extends y implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ UiMediaScopeImpl $scope;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaQuery_androidKt$obtainUiMediaScope$3$1(View view, UiMediaScopeImpl uiMediaScopeImpl) {
        super(1);
        this.$view = view;
        this.$scope = uiMediaScopeImpl;
    }

    @Override // h.g.a.l
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final UiMediaScopeImpl uiMediaScopeImpl = this.$scope;
        final View view = this.$view;
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$3$1$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                uiMediaScopeImpl.setImeVisible(MediaQuery_androidKt.isImeVisible(ViewCompat.getRootWindowInsets(view)));
            }
        };
        this.$view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        final View view2 = this.$view;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }
}
