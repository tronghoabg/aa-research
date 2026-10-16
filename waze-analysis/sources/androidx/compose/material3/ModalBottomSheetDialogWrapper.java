package androidx.compose.material3;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
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
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.Objects;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ModalBottomSheetDialogWrapper extends ComponentDialog implements ViewRootForInspector {
    private final View composeView;
    private long contentColor;
    private final ModalBottomSheetDialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private a<ab> onDismissRequest;
    private ModalBottomSheetProperties properties;

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

    private ModalBottomSheetDialogWrapper(a<ab> aVar, ModalBottomSheetProperties modalBottomSheetProperties, long j2, View view, LayoutDirection layoutDirection, Density density, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), com.waze.R.style.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, null);
        this.onDismissRequest = aVar;
        this.properties = modalBottomSheetProperties;
        this.contentColor = j2;
        this.composeView = view;
        this.maxSupportedElevation = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window);
        Objects.toString(uuid);
        modalBottomSheetDialogLayout.setTag(com.waze.R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(density.mo2127toPx0680j_4(8.0f));
        modalBottomSheetDialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material3.ModalBottomSheetDialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = modalBottomSheetDialogLayout;
        setContentView(modalBottomSheetDialogLayout);
        ViewTreeLifecycleOwner.set(modalBottomSheetDialogLayout, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(modalBottomSheetDialogLayout, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(modalBottomSheetDialogLayout, ViewTreeSavedStateRegistryOwner.get(view));
        m5231updateParameters9LQNqLg(this.onDismissRequest, this.properties, this.contentColor, layoutDirection);
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

    /* renamed from: updateParameters-9LQNqLg, reason: not valid java name */
    public final void m5231updateParameters9LQNqLg(a<ab> aVar, ModalBottomSheetProperties modalBottomSheetProperties, long j2, LayoutDirection layoutDirection) {
        this.onDismissRequest = aVar;
        this.properties = modalBottomSheetProperties;
        this.contentColor = j2;
        setSecurePolicy(modalBottomSheetProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
        Window window3 = getWindow();
        x.c(window3);
        Window window4 = getWindow();
        x.c(window4);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window3, window4.getDecorView());
        Boolean boolIsAppearanceLightStatusBars$material3 = modalBottomSheetProperties.isAppearanceLightStatusBars$material3();
        insetsController.setAppearanceLightStatusBars(boolIsAppearanceLightStatusBars$material3 != null ? boolIsAppearanceLightStatusBars$material3.booleanValue() : ModalBottomSheet_androidKt.m5241isDark8_81llA(j2));
        Boolean boolIsAppearanceLightNavigationBars$material3 = modalBottomSheetProperties.isAppearanceLightNavigationBars$material3();
        insetsController.setAppearanceLightNavigationBars(boolIsAppearanceLightNavigationBars$material3 != null ? boolIsAppearanceLightNavigationBars$material3.booleanValue() : ModalBottomSheet_androidKt.m5241isDark8_81llA(j2));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public /* synthetic */ ModalBottomSheetDialogWrapper(a aVar, ModalBottomSheetProperties modalBottomSheetProperties, long j2, View view, LayoutDirection layoutDirection, Density density, UUID uuid, o oVar) {
        this(aVar, modalBottomSheetProperties, j2, view, layoutDirection, density, uuid);
    }
}
