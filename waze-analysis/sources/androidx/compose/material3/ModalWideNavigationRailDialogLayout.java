package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.media3.common.PlaybackException;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ModalWideNavigationRailDialogLayout extends AbstractComposeView implements DialogWindowProvider {
    private Object backCallback;
    private final MutableState content$delegate;
    private final LayoutDirection layoutDirection;
    private final a<ab> onDismissRequest;
    private final l<Float, ab> onPredictiveBack;
    private final a<ab> onPredictiveBackCancelled;
    private final RailPredictiveBackState predictiveBackState;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final boolean shouldDismissOnBackPress;
    private final Window window;

    /* compiled from: WazeSource */
    final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public static final OnBackInvokedCallback createBackCallback(final a<ab> aVar) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.ModalWideNavigationRailDialogLayout$Api33Impl$$ExternalSyntheticLambda0
                public final void onBackInvoked() {
                    aVar.invoke();
                }
            };
        }

        public static final void maybeRegisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(PlaybackException.CUSTOM_ERROR_CODE_BASE, (OnBackInvokedCallback) obj);
        }

        public static final void maybeUnregisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final OnBackAnimationCallback createBackCallback(final a<ab> aVar, final l<? super Float, ab> lVar, final a<ab> aVar2, final RailPredictiveBackState railPredictiveBackState, final LayoutDirection layoutDirection) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalWideNavigationRailDialogLayout$Api34Impl$createBackCallback$1
                public void onBackCancelled() {
                    aVar2.invoke();
                }

                public void onBackInvoked() {
                    aVar.invoke();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    railPredictiveBackState.update(backEvent.getSwipeEdge() == 0, layoutDirection == LayoutDirection.Rtl);
                    lVar.invoke(Float.valueOf(PredictiveBack.INSTANCE.transform$material3(backEvent.getProgress())));
                }

                public void onBackStarted(BackEvent backEvent) {
                    railPredictiveBackState.update(backEvent.getSwipeEdge() == 0, layoutDirection == LayoutDirection.Rtl);
                    lVar.invoke(Float.valueOf(PredictiveBack.INSTANCE.transform$material3(backEvent.getProgress())));
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModalWideNavigationRailDialogLayout(Context context, Window window, boolean z, a<ab> aVar, l<? super Float, ab> lVar, a<ab> aVar2, RailPredictiveBackState railPredictiveBackState, LayoutDirection layoutDirection) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.shouldDismissOnBackPress = z;
        this.onDismissRequest = aVar;
        this.onPredictiveBack = lVar;
        this.onPredictiveBackCancelled = aVar2;
        this.predictiveBackState = railPredictiveBackState;
        this.layoutDirection = layoutDirection;
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$WideNavigationRail_androidKt.INSTANCE.getLambda$2011757776$material3(), null, 2, null);
    }

    static final ab Content$lambda$0(ModalWideNavigationRailDialogLayout modalWideNavigationRailDialogLayout, int i2, Composer composer, int i3) {
        modalWideNavigationRailDialogLayout.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private final p<Composer, Integer, ab> getContent() {
        return (p) this.content$delegate.getValue();
    }

    private final void maybeRegisterBackCallback() {
        if (!this.shouldDismissOnBackPress || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            int i2 = Build.VERSION.SDK_INT;
            a<ab> aVar = this.onDismissRequest;
            this.backCallback = i2 >= 34 ? Api34Impl.createBackCallback(aVar, this.onPredictiveBack, this.onPredictiveBackCancelled, this.predictiveBackState, this.layoutDirection) : Api33Impl.createBackCallback(aVar);
        }
        Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-640057148);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-640057148, i3, -1, "androidx.compose.material3.ModalWideNavigationRailDialogLayout.Content (WideNavigationRail.android.kt:202)");
            }
            getContent().invoke(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ModalWideNavigationRailDialogLayout$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ModalWideNavigationRailDialogLayout.Content$lambda$0(this.f$0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeUnregisterBackCallback();
    }

    public final void setContent(CompositionContext compositionContext, p<? super Composer, ? super Integer, ab> pVar) {
        setParentCompositionContext(compositionContext);
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    private final void setContent(p<? super Composer, ? super Integer, ab> pVar) {
        this.content$delegate.setValue(pVar);
    }
}
