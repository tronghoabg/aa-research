package com.google.android.libraries.assistant.appintegration.api.standard.callback;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager;
import com.google.android.libraries.assistant.appintegration.shared.AssistantConstants;
import com.google.d.b.aa;
import com.google.d.b.t;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SystemUiManager {
    private static final String TAG = "SystemUiManager";
    private final Context context;
    private final AtomicBoolean wasSystemNavBarHidden = new AtomicBoolean(false);
    private aa<Activity> activityOptional = aa.g();
    private aa<ClientAppWindow> activityWindow = aa.g();
    private aa<ClientAppWindow> popupWindow = aa.g();
    private aa<Integer> lastTopInsetHeight = aa.g();
    private aa<Integer> lastSystemUiOptions = aa.g();

    /* compiled from: WazeSource */
    class ClientAppWindow {
        private aa<Integer> defaultContentViewTopMargin;
        final /* synthetic */ SystemUiManager this$0;
        private final Window window;

        public static /* synthetic */ WindowInsets $r8$lambda$CJF6VtOG1Tb_x7BM6Oo65hJozL8(ClientAppWindow clientAppWindow, View view, WindowInsets windowInsets) {
            clientAppWindow.lambda$registerOnApplyWindowInsetsListener$1(view, windowInsets);
            return windowInsets;
        }

        private ClientAppWindow(SystemUiManager systemUiManager, Window window) {
            Objects.requireNonNull(systemUiManager);
            this.this$0 = systemUiManager;
            this.defaultContentViewTopMargin = aa.g();
            this.window = window;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Window getWindow() {
            return this.window;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$maybeRegisterOnSystemUiVisibilityChangeListener$0(View view) {
            view.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda7
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i2) {
                    this.f$0.lambda$maybeRegisterOnSystemUiVisibilityChangeListener$1(i2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$maybeRegisterOnSystemUiVisibilityChangeListener$1(int i2) {
            if (!this.this$0.lastSystemUiOptions.f() || ((Integer) this.this$0.lastSystemUiOptions.b()).intValue() == i2) {
                return;
            }
            Log.d(SystemUiManager.TAG, String.format("#OnSystemUiVisibilityChange(): restore SystemUiVisibility from %d to %d.", Integer.valueOf(i2), this.this$0.lastSystemUiOptions.b()));
            setSystemUiVisibility(((Integer) this.this$0.lastSystemUiOptions.b()).intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$maybeUnregisterOnSystemUiVisibilityChangeListener$0() {
            this.window.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda3
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i2) {
                }
            });
        }

        static /* synthetic */ void lambda$maybeUnregisterOnSystemUiVisibilityChangeListener$1(int i2) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$registerOnApplyWindowInsetsListener$0(View view) {
            view.findViewById(R.id.content).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda10
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    SystemUiManager.ClientAppWindow.$r8$lambda$CJF6VtOG1Tb_x7BM6Oo65hJozL8(this.f$0, view2, windowInsets);
                    return windowInsets;
                }
            });
        }

        private /* synthetic */ WindowInsets lambda$registerOnApplyWindowInsetsListener$1(View view, WindowInsets windowInsets) {
            Log.d(SystemUiManager.TAG, "#OnApplyWindowInsets(): top inset height = " + windowInsets.getSystemWindowInsetTop());
            this.this$0.lastTopInsetHeight = aa.i(Integer.valueOf(windowInsets.getSystemWindowInsetTop()));
            updateContentViewTopMargin();
            return windowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reinstateContentViewTopMargin$0() {
            ((ViewGroup.MarginLayoutParams) this.window.getDecorView().findViewById(R.id.content).getLayoutParams()).topMargin = ((Integer) this.defaultContentViewTopMargin.d(0)).intValue();
            this.defaultContentViewTopMargin = aa.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reinstateSystemUiVisibility$0(boolean z) {
            int systemUiVisibility = this.window.getDecorView().getSystemUiVisibility() & (~this.this$0.getMaestroVisibilityFlags(z));
            Log.d(SystemUiManager.TAG, String.format("ClientAppWindow#reinstateSystemUiVisibility():visibility = %d, restoreSystemNavBar = %b", Integer.valueOf(systemUiVisibility), Boolean.valueOf(z)));
            this.window.getDecorView().setSystemUiVisibility(systemUiVisibility);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setSystemUiVisibility$0(int i2) {
            Log.d(SystemUiManager.TAG, String.format("ClientAppWindow#setSystemUiVisibility: window = %s, uiOptions = %d", this.window, Integer.valueOf(i2)));
            this.window.getDecorView().setSystemUiVisibility(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$unregisterOnApplyWindowInsetsListener$0() {
            this.window.getDecorView().findViewById(R.id.content).setOnApplyWindowInsetsListener(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updateContentViewTopMargin$0() {
            ((ViewGroup.MarginLayoutParams) this.window.getDecorView().findViewById(R.id.content).getLayoutParams()).topMargin = ((Integer) this.defaultContentViewTopMargin.b()).intValue() + ((Integer) this.this$0.lastTopInsetHeight.b()).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeRegisterOnSystemUiVisibilityChangeListener() {
            Log.d(SystemUiManager.TAG, "ClientAppWindow#maybeRegisterOnSystemUiVisibilityChangeListener()");
            if (this.this$0.activityOptional.f()) {
                this.window.getDecorView();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeUnregisterOnSystemUiVisibilityChangeListener() {
            Log.d(SystemUiManager.TAG, "ClientAppWindow#maybeUnregisterOnSystemUiVisibilityChangeListener()");
            this.this$0.activityOptional.f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void registerOnApplyWindowInsetsListener() {
            Log.d(SystemUiManager.TAG, "ClientAppWindow#registerOnApplyWindowInsetsListener()");
            if (this.this$0.activityOptional.f()) {
                final View decorView = this.window.getDecorView();
                this.defaultContentViewTopMargin = aa.i(Integer.valueOf(((ViewGroup.MarginLayoutParams) decorView.findViewById(R.id.content).getLayoutParams()).topMargin));
                ((Activity) this.this$0.activityOptional.b()).runOnUiThread(new Runnable() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$registerOnApplyWindowInsetsListener$0(decorView);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reinstateContentViewTopMargin() {
            Log.d(SystemUiManager.TAG, "ClientAppWindow#reinstateContentViewTopMargin()");
            if (this.this$0.activityOptional.f()) {
                ((Activity) this.this$0.activityOptional.b()).runOnUiThread(new Runnable() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$reinstateContentViewTopMargin$0();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reinstateSystemUiVisibility() {
            final boolean z = this.this$0.wasSystemNavBarHidden.get();
            Log.d(SystemUiManager.TAG, String.format("ClientAppWindow#reinstateSystemUiVisibility(): wasSystemBarHidden = %b", Boolean.valueOf(z)));
            if (this.this$0.activityOptional.f()) {
                ((Activity) this.this$0.activityOptional.b()).runOnUiThread(new Runnable() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$reinstateSystemUiVisibility$0(z);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemUiVisibility(final int i2) {
            Log.d(SystemUiManager.TAG, String.format("ClientAppWindow#setSystemUiVisibility(%d): activityOptional.isPresent() = %b", Integer.valueOf(i2), Boolean.valueOf(this.this$0.activityOptional.f())));
            if (this.this$0.activityOptional.f()) {
                ((Activity) this.this$0.activityOptional.b()).runOnUiThread(new Runnable() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$setSystemUiVisibility$0(i2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void unregisterOnApplyWindowInsetsListener() {
            Log.d(SystemUiManager.TAG, "ClientAppWindow#unregisterOnApplyWindowInsetsListener()");
            if (this.this$0.activityOptional.f()) {
                ((Activity) this.this$0.activityOptional.b()).runOnUiThread(new Runnable() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$unregisterOnApplyWindowInsetsListener$0();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateContentViewTopMargin() {
            Log.d(SystemUiManager.TAG, "ClientAppWindow#updateContentViewTopMargin()");
            if (this.this$0.activityOptional.f() && this.defaultContentViewTopMargin.f() && this.this$0.lastTopInsetHeight.f()) {
                ((Activity) this.this$0.activityOptional.b()).runOnUiThread(new Runnable() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$updateContentViewTopMargin$0();
                    }
                });
            }
        }
    }

    public SystemUiManager(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ClientAppWindow lambda$setActivityOptional$0(Activity activity) {
        return new ClientAppWindow(activity.getWindow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ClientAppWindow lambda$setPopupWindowOptional$0(Window window) {
        return new ClientAppWindow(window);
    }

    private void updateClientAppWindowSystemUi(ClientAppWindow clientAppWindow) {
        if (shouldReserveSpaceForTopInset()) {
            clientAppWindow.registerOnApplyWindowInsetsListener();
            if (this.lastTopInsetHeight.f()) {
                clientAppWindow.updateContentViewTopMargin();
            }
        }
        clientAppWindow.maybeRegisterOnSystemUiVisibilityChangeListener();
        if (this.lastSystemUiOptions.f()) {
            clientAppWindow.setSystemUiVisibility(((Integer) this.lastSystemUiOptions.b()).intValue());
        }
    }

    private void updateSystemUiVisibility(int i2) {
        Log.d(TAG, String.format("#updateSystemUiVisibility(%d)", Integer.valueOf(i2)));
        if (this.activityWindow.f()) {
            ((ClientAppWindow) this.activityWindow.b()).setSystemUiVisibility(i2);
        }
        if (this.popupWindow.f()) {
            ((ClientAppWindow) this.popupWindow.b()).setSystemUiVisibility(i2);
        }
    }

    public void adjustSystemNavigationUi(boolean z) {
        Log.d(TAG, String.format("#adjustSystemNavigationUi(%b)", Boolean.valueOf(z)));
        if (this.activityWindow.f()) {
            ((ClientAppWindow) this.activityWindow.b()).maybeRegisterOnSystemUiVisibilityChangeListener();
            if (shouldReserveSpaceForTopInset()) {
                ((ClientAppWindow) this.activityWindow.b()).registerOnApplyWindowInsetsListener();
            }
        }
        if (this.popupWindow.f()) {
            ((ClientAppWindow) this.popupWindow.b()).maybeRegisterOnSystemUiVisibilityChangeListener();
            if (shouldReserveSpaceForTopInset()) {
                ((ClientAppWindow) this.popupWindow.b()).registerOnApplyWindowInsetsListener();
            }
        }
        int maestroVisibilityFlags = getMaestroVisibilityFlags(z);
        this.wasSystemNavBarHidden.compareAndSet(false, z);
        updateSystemUiVisibility(maestroVisibilityFlags);
        this.lastSystemUiOptions = aa.i(Integer.valueOf(maestroVisibilityFlags));
    }

    public aa<Activity> getActivityOptional() {
        return this.activityOptional;
    }

    int getMaestroVisibilityFlags(boolean z) {
        return z ? 4866 : 768;
    }

    public aa<Window> getPopupWindowOptional() {
        return this.popupWindow.a(new t() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$$ExternalSyntheticLambda2
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return ((SystemUiManager.ClientAppWindow) obj).window;
            }
        });
    }

    public void reinstateActivitySystemUi() {
        Log.d(TAG, String.format("#reinstateActivitySystemUi(): activityWindow.isPresent() = %b", Boolean.valueOf(this.activityWindow.f())));
        if (!this.activityWindow.f()) {
            Log.d(TAG, "#reinstateActivitySystemUi(): activityWindow not present");
            return;
        }
        if (shouldReserveSpaceForTopInset()) {
            ((ClientAppWindow) this.activityWindow.b()).unregisterOnApplyWindowInsetsListener();
            ((ClientAppWindow) this.activityWindow.b()).reinstateContentViewTopMargin();
        }
        ((ClientAppWindow) this.activityWindow.b()).maybeUnregisterOnSystemUiVisibilityChangeListener();
        ((ClientAppWindow) this.activityWindow.b()).reinstateSystemUiVisibility();
    }

    public void reinstatePopupWindowSystemUi() {
        Log.d(TAG, String.format("#reinstatePopupWindowSystemUi(): popupWindow.isPresent() = %b", Boolean.valueOf(this.popupWindow.f())));
        if (this.popupWindow.f()) {
            if (shouldReserveSpaceForTopInset()) {
                ((ClientAppWindow) this.popupWindow.b()).unregisterOnApplyWindowInsetsListener();
                ((ClientAppWindow) this.popupWindow.b()).reinstateContentViewTopMargin();
            }
            ((ClientAppWindow) this.popupWindow.b()).maybeUnregisterOnSystemUiVisibilityChangeListener();
            ((ClientAppWindow) this.popupWindow.b()).reinstateSystemUiVisibility();
        }
    }

    public void reinstateSystemUi() {
        Log.d(TAG, "#reinstateSystemUi()");
        reinstatePopupWindowSystemUi();
        reinstateActivitySystemUi();
        this.lastSystemUiOptions = aa.g();
        this.lastTopInsetHeight = aa.g();
        this.wasSystemNavBarHidden.set(false);
    }

    public void setActivityOptional(aa<Activity> aaVar) {
        this.activityOptional = aaVar;
        aa<ClientAppWindow> aaVarA = aaVar.a(new t() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$$ExternalSyntheticLambda1
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return this.f$0.lambda$setActivityOptional$0((Activity) obj);
            }
        });
        this.activityWindow = aaVarA;
        if (aaVarA.f()) {
            Log.d(TAG, String.format("#setActivityOptional(): set new activity window = %s", ((ClientAppWindow) this.activityWindow.b()).getWindow()));
        } else {
            Log.w(TAG, "#setActivityOptional(): activity window not present");
        }
    }

    public void setPopupWindowOptional(aa<Window> aaVar) {
        this.popupWindow = aaVar.a(new t() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager$$ExternalSyntheticLambda0
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return this.f$0.lambda$setPopupWindowOptional$0((Window) obj);
            }
        });
    }

    boolean shouldReserveSpaceForTopInset() {
        return !AssistantConstants.ORDERED_GMM_PACKAGES.contains(this.context.getPackageName());
    }

    public void updateActivitySystemUi() {
        Log.d(TAG, String.format("#updateActivitySystemUi(): activityWindow.isPresent() = %b", Boolean.valueOf(this.activityWindow.f())));
        if (this.activityWindow.f()) {
            updateClientAppWindowSystemUi((ClientAppWindow) this.activityWindow.b());
        }
    }

    public void updatePopupWindowSystemUi() {
        Log.d(TAG, String.format("#updatePopupWindowSystemUi(): popupWindowOptional.isPresent() = %b", Boolean.valueOf(this.popupWindow.f())));
        if (this.popupWindow.f()) {
            updateClientAppWindowSystemUi((ClientAppWindow) this.popupWindow.b());
        }
    }
}
