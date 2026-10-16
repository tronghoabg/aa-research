package androidx.car.app;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.car.app.CarContext;
import androidx.car.app.HostDispatcher;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.car.app.IStartCarApp;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.constraints.ConstraintManager;
import androidx.car.app.hardware.CarHardwareManager;
import androidx.car.app.managers.Manager;
import androidx.car.app.managers.ManagerCache;
import androidx.car.app.managers.ManagerFactory;
import androidx.car.app.managers.ResultManager;
import androidx.car.app.media.MediaPlaybackManager;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.suggestion.SuggestionManager;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.RemoteUtils;
import androidx.car.app.utils.ThreadUtils;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import defpackage.a2;
import defpackage.m0;
import defpackage.n0;
import defpackage.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class CarContext extends ContextWrapper {
    public static final String ACTION_NAVIGATE = "androidx.car.app.action.NAVIGATE";
    public static final String APP_SERVICE = "app";
    public static final String CAR_SERVICE = "car";

    @RequiresCarApi(2)
    public static final String CONSTRAINT_SERVICE = "constraints";
    static final String EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY = "androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY";
    static final String EXTRA_PERMISSIONS_KEY = "androidx.car.app.action.EXTRA_PERMISSIONS_KEY";
    public static final String EXTRA_START_CAR_APP_BINDER_KEY = "androidx.car.app.extra.START_CAR_APP_BINDER_KEY";

    @RequiresCarApi(3)
    public static final String HARDWARE_SERVICE = "hardware";
    public static final String MEDIA_PLAYBACK_SERVICE = "media_playback";
    public static final String NAVIGATION_SERVICE = "navigation";
    static final String REQUEST_PERMISSIONS_ACTION = "androidx.car.app.action.REQUEST_PERMISSIONS";
    public static final String SCREEN_SERVICE = "screen";
    public static final String SUGGESTION_SERVICE = "suggestion";
    private int mCarAppApiLevel;
    private final HostDispatcher mHostDispatcher;
    private HostInfo mHostInfo;
    private final Lifecycle mLifecycle;
    private final ManagerCache mManagers;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    /* renamed from: androidx.car.app.CarContext$1, reason: invalid class name */
    public class AnonymousClass1 extends IOnRequestPermissionsListener.Stub {
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ Lifecycle val$lifecycle;
        final /* synthetic */ OnRequestPermissionsListener val$listener;

        public AnonymousClass1(Lifecycle lifecycle, Executor executor, OnRequestPermissionsListener onRequestPermissionsListener) {
            this.val$lifecycle = lifecycle;
            this.val$executor = executor;
            this.val$listener = onRequestPermissionsListener;
        }

        @Override // androidx.car.app.IOnRequestPermissionsListener
        public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
            if (this.val$lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                this.val$executor.execute(new e(this.val$listener, Arrays.asList(strArr), Arrays.asList(strArr2), 1));
            }
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static Bundle makeBasicActivityOptionsBundle() {
            return ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle();
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarServiceType {
    }

    public CarContext(final Lifecycle lifecycle, final HostDispatcher hostDispatcher) {
        super(null);
        ManagerCache managerCache = new ManagerCache();
        this.mManagers = managerCache;
        this.mCarAppApiLevel = 0;
        this.mHostInfo = null;
        this.mHostDispatcher = hostDispatcher;
        final int i = 0;
        managerCache.addFactory(AppManager.class, APP_SERVICE, new ManagerFactory(this) { // from class: d2
            public final /* synthetic */ CarContext b;

            {
                this.b = this;
            }

            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                switch (i) {
                    case 0:
                        return this.b.lambda$new$3(hostDispatcher, lifecycle);
                    case 1:
                        return this.b.lambda$new$4(hostDispatcher, lifecycle);
                    case 2:
                        return this.b.lambda$new$9(hostDispatcher, lifecycle);
                    default:
                        return this.b.lambda$new$10(hostDispatcher, lifecycle);
                }
            }
        });
        final int i2 = 1;
        managerCache.addFactory(NavigationManager.class, "navigation", new ManagerFactory(this) { // from class: d2
            public final /* synthetic */ CarContext b;

            {
                this.b = this;
            }

            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                switch (i2) {
                    case 0:
                        return this.b.lambda$new$3(hostDispatcher, lifecycle);
                    case 1:
                        return this.b.lambda$new$4(hostDispatcher, lifecycle);
                    case 2:
                        return this.b.lambda$new$9(hostDispatcher, lifecycle);
                    default:
                        return this.b.lambda$new$10(hostDispatcher, lifecycle);
                }
            }
        });
        final int i3 = 2;
        managerCache.addFactory(ScreenManager.class, SCREEN_SERVICE, new ManagerFactory(this) { // from class: e2
            public final /* synthetic */ CarContext b;

            {
                this.b = this;
            }

            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                switch (i3) {
                    case 0:
                        return this.b.lambda$new$6((HostDispatcher) lifecycle);
                    case 1:
                        return this.b.lambda$new$7((HostDispatcher) lifecycle);
                    default:
                        return this.b.lambda$new$5((Lifecycle) lifecycle);
                }
            }
        });
        final int i4 = 0;
        managerCache.addFactory(ConstraintManager.class, CONSTRAINT_SERVICE, new ManagerFactory(this) { // from class: e2
            public final /* synthetic */ CarContext b;

            {
                this.b = this;
            }

            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                switch (i4) {
                    case 0:
                        return this.b.lambda$new$6((HostDispatcher) hostDispatcher);
                    case 1:
                        return this.b.lambda$new$7((HostDispatcher) hostDispatcher);
                    default:
                        return this.b.lambda$new$5((Lifecycle) hostDispatcher);
                }
            }
        });
        final int i5 = 1;
        managerCache.addFactory(CarHardwareManager.class, HARDWARE_SERVICE, new ManagerFactory(this) { // from class: e2
            public final /* synthetic */ CarContext b;

            {
                this.b = this;
            }

            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                switch (i5) {
                    case 0:
                        return this.b.lambda$new$6((HostDispatcher) hostDispatcher);
                    case 1:
                        return this.b.lambda$new$7((HostDispatcher) hostDispatcher);
                    default:
                        return this.b.lambda$new$5((Lifecycle) hostDispatcher);
                }
            }
        });
        managerCache.addFactory(ResultManager.class, null, new ManagerFactory() { // from class: f2
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                return this.a.lambda$new$8();
            }
        });
        final int i6 = 2;
        managerCache.addFactory(SuggestionManager.class, SUGGESTION_SERVICE, new ManagerFactory(this) { // from class: d2
            public final /* synthetic */ CarContext b;

            {
                this.b = this;
            }

            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                switch (i6) {
                    case 0:
                        return this.b.lambda$new$3(hostDispatcher, lifecycle);
                    case 1:
                        return this.b.lambda$new$4(hostDispatcher, lifecycle);
                    case 2:
                        return this.b.lambda$new$9(hostDispatcher, lifecycle);
                    default:
                        return this.b.lambda$new$10(hostDispatcher, lifecycle);
                }
            }
        });
        final int i7 = 3;
        managerCache.addFactory(MediaPlaybackManager.class, MEDIA_PLAYBACK_SERVICE, new ManagerFactory(this) { // from class: d2
            public final /* synthetic */ CarContext b;

            {
                this.b = this;
            }

            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                switch (i7) {
                    case 0:
                        return this.b.lambda$new$3(hostDispatcher, lifecycle);
                    case 1:
                        return this.b.lambda$new$4(hostDispatcher, lifecycle);
                    case 2:
                        return this.b.lambda$new$9(hostDispatcher, lifecycle);
                    default:
                        return this.b.lambda$new$10(hostDispatcher, lifecycle);
                }
            }
        });
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new r(this, 2));
        this.mLifecycle = lifecycle;
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.CarContext.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                hostDispatcher.resetHosts();
                lifecycleOwner.getLifecycle().removeObserver(this);
            }
        });
    }

    public static CarContext create(Lifecycle lifecycle) {
        return new CarContext(lifecycle, new HostDispatcher());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$finishCarApp$2(ICarHost iCarHost) {
        iCarHost.finish();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MediaPlaybackManager lambda$new$10(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return MediaPlaybackManager.create(this, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$11() {
        ((ScreenManager) getCarService(ScreenManager.class)).pop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AppManager lambda$new$3(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return AppManager.create(this, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NavigationManager lambda$new$4(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return NavigationManager.create(this, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScreenManager lambda$new$5(Lifecycle lifecycle) {
        return ScreenManager.create(this, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ConstraintManager lambda$new$6(HostDispatcher hostDispatcher) {
        return ConstraintManager.create(this, hostDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CarHardwareManager lambda$new$7(HostDispatcher hostDispatcher) {
        return CarHardwareManager.create(this, hostDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ResultManager lambda$new$8() {
        return ResultManager.create(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SuggestionManager lambda$new$9(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return SuggestionManager.create(this, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$startCarApp$0(Intent intent, ICarHost iCarHost) {
        iCarHost.startCarApp(intent);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$startCarApp$1(IStartCarApp iStartCarApp, Intent intent) {
        iStartCarApp.startCarApp(intent);
        return null;
    }

    public void attachBaseContext(Context context, Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (getBaseContext() == null) {
            Object systemService = context.getSystemService("display");
            Objects.requireNonNull(systemService);
            attachBaseContext(context.createDisplayContext(((DisplayManager) systemService).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8).getDisplay()).createConfigurationContext(configuration));
        }
        onCarConfigurationChanged(configuration);
    }

    public void finishCarApp() {
        this.mHostDispatcher.dispatch(CAR_SERVICE, "finish", new n0(1));
    }

    @RequiresCarApi(2)
    public ComponentName getCallingComponent() {
        try {
            return ((ResultManager) getCarService(ResultManager.class)).getCallingComponent();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public int getCarAppApiLevel() {
        int i = this.mCarAppApiLevel;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Car App API level hasn't been established yet");
    }

    public Object getCarService(String str) {
        Objects.requireNonNull(str);
        return this.mManagers.getOrCreate(str);
    }

    public String getCarServiceName(Class<?> cls) {
        Objects.requireNonNull(cls);
        return this.mManagers.getName(cls);
    }

    public HostInfo getHostInfo() {
        return this.mHostInfo;
    }

    public ManagerCache getManagers() {
        return this.mManagers;
    }

    public OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public boolean isDarkMode() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    public void onCarConfigurationChanged(Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Objects.toString(configuration);
            Objects.toString(getResources().getDisplayMetrics());
        }
        Resources resources = getResources();
        Objects.requireNonNull(configuration);
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }

    public void requestPermissions(List<String> list, OnRequestPermissionsListener onRequestPermissionsListener) {
        requestPermissions(list, ContextCompat.getMainExecutor(this), onRequestPermissionsListener);
    }

    @RequiresCarApi(2)
    public void setCarAppResult(int i, Intent intent) {
        ((ResultManager) getCarService(ResultManager.class)).setCarAppResult(i, intent);
    }

    public void setCarHost(ICarHost iCarHost) {
        ThreadUtils.checkMainThread();
        HostDispatcher hostDispatcher = this.mHostDispatcher;
        Objects.requireNonNull(iCarHost);
        hostDispatcher.setCarHost(iCarHost);
    }

    public void startCarApp(Intent intent) {
        Objects.requireNonNull(intent);
        this.mHostDispatcher.dispatch(CAR_SERVICE, "startCarApp", new m0(intent, 3));
    }

    public void updateHandshakeInfo(HandshakeInfo handshakeInfo) {
        this.mCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
    }

    public void updateHostInfo(HostInfo hostInfo) {
        this.mHostInfo = hostInfo;
    }

    public void requestPermissions(List<String> list, Executor executor, OnRequestPermissionsListener onRequestPermissionsListener) {
        Objects.requireNonNull(executor);
        Objects.requireNonNull(list);
        Objects.requireNonNull(onRequestPermissionsListener);
        ComponentName componentName = new ComponentName(this, (Class<?>) CarAppPermissionActivity.class);
        Lifecycle lifecycle = this.mLifecycle;
        Bundle bundle = new Bundle(2);
        bundle.putBinder(EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY, new AnonymousClass1(lifecycle, executor, onRequestPermissionsListener).asBinder());
        bundle.putStringArray(EXTRA_PERMISSIONS_KEY, (String[]) list.toArray(new String[0]));
        startActivity(new Intent(REQUEST_PERMISSIONS_ACTION).setComponent(componentName).putExtras(bundle).addFlags(268435456), Api26Impl.makeBasicActivityOptionsBundle());
    }

    @Deprecated
    public static void startCarApp(Intent intent, Intent intent2) {
        Objects.requireNonNull(intent);
        Objects.requireNonNull(intent2);
        Bundle extras = intent.getExtras();
        IBinder binder = extras != null ? extras.getBinder(EXTRA_START_CAR_APP_BINDER_KEY) : null;
        if (binder != null) {
            IStartCarApp iStartCarAppAsInterface = IStartCarApp.Stub.asInterface(binder);
            Objects.requireNonNull(iStartCarAppAsInterface);
            RemoteUtils.dispatchCallToHost("startCarApp from notification", new a2(iStartCarAppAsInterface, intent2, 1));
            return;
        }
        throw new IllegalArgumentException("Notification intent missing expected extra");
    }

    public <T> T getCarService(Class<T> cls) {
        Objects.requireNonNull(cls);
        return (T) this.mManagers.getOrCreate(cls);
    }
}
