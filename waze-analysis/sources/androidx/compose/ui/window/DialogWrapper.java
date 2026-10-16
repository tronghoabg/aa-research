package androidx.compose.ui.window;

import android.graphics.Outline;
import android.os.Build;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.waze.R;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.g.b.y;
import h.i;
import java.util.Objects;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {
    private final View composeView;
    private final DialogLayout dialogLayout;
    private boolean isPressOutside;
    private final float maxSupportedElevation;
    private a<ab> onDismissRequest;
    private DialogProperties properties;

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

    /* JADX WARN: Multi-variable type inference failed */
    public DialogWrapper(a<ab> aVar, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), true != dialogProperties.getDecorFitsSystemWindows() ? R.style.FloatingDialogWindowTheme : R.style.DialogWindowTheme), 0, 2, 0 == true ? 1 : 0);
        this.onDismissRequest = aVar;
        this.properties = dialogProperties;
        this.composeView = view;
        this.maxSupportedElevation = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        applyWindowTypeAndToken(this.properties);
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.setDecorFitsSystemWindows(window, this.properties.getDecorFitsSystemWindows());
        window.setGravity(17);
        if (!this.properties.getDecorFitsSystemWindows()) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            Api28Impl.INSTANCE.setLayoutInDisplayCutout(attributes);
            if (Build.VERSION.SDK_INT >= 30) {
                Api30Impl.INSTANCE.setFitInsetsSides(attributes, 0);
                Api30Impl.INSTANCE.setFitInsetsTypes(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        setTitle(this.properties.getWindowTitle());
        Objects.toString(uuid);
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.mo2127toPx0680j_4(8.0f));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.set(dialogLayout, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(dialogLayout, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(dialogLayout, ViewTreeSavedStateRegistryOwner.get(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new AnonymousClass2(), 2, null);
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void applyWindowTypeAndToken(DialogProperties dialogProperties) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.type = dialogProperties.getWindowType();
            IBinder windowToken = dialogProperties.getWindowToken();
            if (windowToken != null) {
                attributes.token = windowToken;
            }
            window.setAttributes(attributes);
        }
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
        boolean zShouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        x.c(window);
        window.setFlags(true != zShouldApplySecureFlag ? -8193 : 8192, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
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

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (!this.properties.getDismissOnBackPress() || !keyEvent.isTracking() || keyEvent.isCanceled() || i2 != 111) {
            return super.onKeyUp(i2, keyEvent);
        }
        this.onDismissRequest.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r6 != 3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r6 != 3) goto L21;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.onTouchEvent(r6)
            androidx.compose.ui.window.DialogProperties r1 = r5.properties
            boolean r1 = r1.getDismissOnClickOutside()
            r2 = 0
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L31
            androidx.compose.ui.window.DialogLayout r1 = r5.dialogLayout
            boolean r1 = r1.isInsideContent(r6)
            if (r1 != 0) goto L31
            int r6 = r6.getActionMasked()
            if (r6 == 0) goto L2e
            if (r6 == r4) goto L22
            if (r6 == r3) goto L3c
            goto L3b
        L22:
            boolean r6 = r5.isPressOutside
            if (r6 == 0) goto L3b
            h.g.a.a<h.ab> r6 = r5.onDismissRequest
            r6.invoke()
            r5.isPressOutside = r2
            return r4
        L2e:
            r5.isPressOutside = r4
            return r4
        L31:
            int r6 = r6.getActionMasked()
            if (r6 == 0) goto L3c
            if (r6 == r4) goto L3c
            if (r6 == r3) goto L3c
        L3b:
            return r0
        L3c:
            r5.isPressOutside = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.DialogWrapper.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setContent(CompositionContext compositionContext, p<? super Composer, ? super Integer, ab> pVar) {
        this.dialogLayout.setContent(compositionContext, pVar);
    }

    public final void updateParameters(a<ab> aVar, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        this.onDismissRequest = aVar;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        boolean decorFitsSystemWindows = dialogProperties.getDecorFitsSystemWindows();
        this.dialogLayout.updateProperties(dialogProperties.getUsePlatformDefaultWidth(), decorFitsSystemWindows);
        setCanceledOnTouchOutside(dialogProperties.getDismissOnClickOutside());
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(decorFitsSystemWindows ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.DialogWrapper$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements l<OnBackPressedCallback, ab> {
        AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OnBackPressedCallback onBackPressedCallback) {
            if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                DialogWrapper.this.onDismissRequest.invoke();
            }
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(OnBackPressedCallback onBackPressedCallback) {
            invoke2(onBackPressedCallback);
            return ab.f48028a;
        }
    }
}
