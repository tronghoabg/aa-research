package androidx.compose.material3;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.i;
import java.util.Objects;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ModalWideNavigationRailDialogWrapper extends ComponentDialog implements ViewRootForInspector {
    private final View composeView;
    private final ModalWideNavigationRailDialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private a<ab> onDismissRequest;
    private ModalWideNavigationRailProperties properties;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ModalWideNavigationRailDialogWrapper(a<ab> aVar, ModalWideNavigationRailProperties modalWideNavigationRailProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid, l<? super Float, ab> lVar, a<ab> aVar2, RailPredictiveBackState railPredictiveBackState, boolean z) {
        super(new ContextThemeWrapper(view.getContext(), com.waze.R.style.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, null);
        this.onDismissRequest = aVar;
        this.properties = modalWideNavigationRailProperties;
        this.composeView = view;
        this.maxSupportedElevation = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        ModalWideNavigationRailDialogLayout modalWideNavigationRailDialogLayout = new ModalWideNavigationRailDialogLayout(getContext(), window, this.properties.getShouldDismissOnBackPress(), this.onDismissRequest, lVar, aVar2, railPredictiveBackState, layoutDirection);
        Objects.toString(uuid);
        modalWideNavigationRailDialogLayout.setTag(com.waze.R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        modalWideNavigationRailDialogLayout.setClipChildren(false);
        modalWideNavigationRailDialogLayout.setElevation(density.mo2127toPx0680j_4(8.0f));
        modalWideNavigationRailDialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material3.ModalWideNavigationRailDialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = modalWideNavigationRailDialogLayout;
        setContentView(modalWideNavigationRailDialogLayout);
        ViewTreeLifecycleOwner.set(modalWideNavigationRailDialogLayout, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(modalWideNavigationRailDialogLayout, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(modalWideNavigationRailDialogLayout, ViewTreeSavedStateRegistryOwner.get(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        boolean z2 = !z;
        insetsController.setAppearanceLightStatusBars(z2);
        insetsController.setAppearanceLightNavigationBars(z2);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new l() { // from class: androidx.compose.material3.ModalWideNavigationRailDialogWrapper$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ModalWideNavigationRailDialogWrapper._init_$lambda$2(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    static final ab _init_$lambda$2(ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper, OnBackPressedCallback onBackPressedCallback) {
        if (modalWideNavigationRailDialogWrapper.properties.getShouldDismissOnBackPress()) {
            modalWideNavigationRailDialogWrapper.onDismissRequest.invoke();
        }
        return ab.f48028a;
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        int i2;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i2 = 1;
            if (iOrdinal != 1) {
                throw new i();
            }
        } else {
            i2 = 0;
        }
        this.dialogLayout.setLayoutDirection(i2);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        boolean zShouldApplySecureFlag = BasicEdgeToEdgeDialog_androidKt.shouldApplySecureFlag(secureFlagPolicy, ModalBottomSheet_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        x.c(window);
        window.setFlags(true != zShouldApplySecureFlag ? -8193 : 8192, 8192);
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.onDismissRequest.invoke();
        }
        return zOnTouchEvent;
    }

    public final void setContent(CompositionContext compositionContext, p<? super Composer, ? super Integer, ab> pVar) {
        this.dialogLayout.setContent(compositionContext, pVar);
    }

    public final void updateParameters(a<ab> aVar, ModalWideNavigationRailProperties modalWideNavigationRailProperties, LayoutDirection layoutDirection) {
        this.onDismissRequest = aVar;
        this.properties = modalWideNavigationRailProperties;
        setSecurePolicy(modalWideNavigationRailProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
