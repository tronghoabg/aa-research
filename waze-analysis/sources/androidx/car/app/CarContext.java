package androidx.car.app;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
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
import h.g.b.x;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
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

    @RequiresCarApi(8)
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
    private VirtualDisplay mVirtualDisplay;

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.CarContext$1, reason: invalid class name */
    class AnonymousClass1 extends IOnRequestPermissionsListener.Stub {
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ Lifecycle val$lifecycle;
        final /* synthetic */ OnRequestPermissionsListener val$listener;

        AnonymousClass1(Lifecycle lifecycle, Executor executor, OnRequestPermissionsListener onRequestPermissionsListener) {
            this.val$lifecycle = lifecycle;
            this.val$executor = executor;
            this.val$listener = onRequestPermissionsListener;
        }

        @Override // androidx.car.app.IOnRequestPermissionsListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.IOnRequestPermissionsListener
        public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
            if (this.val$lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                final List listAsList = Arrays.asList(strArr);
                final List listAsList2 = Arrays.asList(strArr2);
                Executor executor = this.val$executor;
                final OnRequestPermissionsListener onRequestPermissionsListener = this.val$listener;
                executor.execute(new Runnable() { // from class: androidx.car.app.CarContext$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        onRequestPermissionsListener.onRequestPermissionsResult(listAsList, listAsList2);
                    }
                });
            }
        }
    }

    /* compiled from: WazeSource */
    class Api26Impl {
        private Api26Impl() {
        }

        static Bundle makeBasicActivityOptionsBundle() {
            return ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle();
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarServiceType {
    }

    protected CarContext(final Lifecycle lifecycle, final HostDispatcher hostDispatcher) {
        super(null);
        ManagerCache managerCache = new ManagerCache();
        this.mManagers = managerCache;
        this.mVirtualDisplay = null;
        this.mCarAppApiLevel = 0;
        this.mHostInfo = null;
        this.mHostDispatcher = hostDispatcher;
        managerCache.addFactory(AppManager.class, APP_SERVICE, new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda1
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                return this.f$0.m1584lambda$new$3$androidxcarappCarContext(hostDispatcher, lifecycle);
            }
        });
        managerCache.addFactory(NavigationManager.class, "navigation", new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda2
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                return this.f$0.m1585lambda$new$4$androidxcarappCarContext(hostDispatcher, lifecycle);
            }
        });
        managerCache.addFactory(ScreenManager.class, SCREEN_SERVICE, new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda3
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                return this.f$0.m1586lambda$new$5$androidxcarappCarContext(lifecycle);
            }
        });
        managerCache.addFactory(ConstraintManager.class, CONSTRAINT_SERVICE, new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda4
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                return this.f$0.m1587lambda$new$6$androidxcarappCarContext(hostDispatcher);
            }
        });
        managerCache.addFactory(CarHardwareManager.class, HARDWARE_SERVICE, new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda5
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                return this.f$0.m1588lambda$new$7$androidxcarappCarContext(hostDispatcher);
            }
        });
        managerCache.addFactory(ResultManager.class, null, new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda6
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                return this.f$0.m1589lambda$new$8$androidxcarappCarContext();
            }
        });
        managerCache.addFactory(SuggestionManager.class, SUGGESTION_SERVICE, new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda7
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                return this.f$0.m1590lambda$new$9$androidxcarappCarContext(hostDispatcher, lifecycle);
            }
        });
        managerCache.addFactory(MediaPlaybackManager.class, MEDIA_PLAYBACK_SERVICE, new ManagerFactory() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda8
            @Override // androidx.car.app.managers.ManagerFactory
            public final Manager create() {
                return this.f$0.m1582lambda$new$10$androidxcarappCarContext(hostDispatcher, lifecycle);
            }
        });
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1583lambda$new$11$androidxcarappCarContext();
            }
        });
        this.mLifecycle = lifecycle;
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.CarContext.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                hostDispatcher.resetHosts();
                if (CarContext.this.mVirtualDisplay != null) {
                    CarContext.this.mVirtualDisplay.release();
                    CarContext.this.mVirtualDisplay = null;
                }
                lifecycleOwner.getLifecycle().removeObserver(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }
        });
    }

    public static CarContext create(Lifecycle lifecycle) {
        return new CarContext(lifecycle, new HostDispatcher());
    }

    static /* synthetic */ Object lambda$finishCarApp$2(ICarHost iCarHost) {
        iCarHost.finish();
        return null;
    }

    static /* synthetic */ Object lambda$startCarApp$0(Intent intent, ICarHost iCarHost) {
        iCarHost.startCarApp(intent);
        return null;
    }

    static /* synthetic */ Object lambda$startCarApp$1(IStartCarApp iStartCarApp, Intent intent) {
        iStartCarApp.startCarApp(intent);
        return null;
    }

    @Deprecated
    public static void startCarApp(Intent intent, final Intent intent2) {
        Objects.requireNonNull(intent);
        Objects.requireNonNull(intent2);
        Bundle extras = intent.getExtras();
        IBinder binder = extras != null ? extras.getBinder(EXTRA_START_CAR_APP_BINDER_KEY) : null;
        if (binder == null) {
            throw new IllegalArgumentException("Notification intent missing expected extra");
        }
        final IStartCarApp iStartCarApp = (IStartCarApp) Objects.requireNonNull(IStartCarApp.Stub.asInterface(binder));
        RemoteUtils.dispatchCallToHost("startCarApp from notification", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda10
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                CarContext.lambda$startCarApp$1(iStartCarApp, intent2);
                return null;
            }
        });
    }

    void attachBaseContext(Context context, Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (getBaseContext() == null) {
            VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) Objects.requireNonNull(context.getSystemService("display"))).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8);
            this.mVirtualDisplay = virtualDisplayCreateVirtualDisplay;
            attachBaseContext(context.createDisplayContext(virtualDisplayCreateVirtualDisplay.getDisplay()).createConfigurationContext(configuration));
        }
        onCarConfigurationChanged(configuration);
    }

    public void finishCarApp() {
        this.mHostDispatcher.dispatch(CAR_SERVICE, "finish", new HostCall() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda11
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                CarContext.lambda$finishCarApp$2((ICarHost) obj);
                return null;
            }
        });
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
        int i2 = this.mCarAppApiLevel;
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalStateException("Car App API level hasn't been established yet");
    }

    public <T> T getCarService(Class<T> cls) {
        Objects.requireNonNull(cls);
        return (T) this.mManagers.getOrCreate(cls);
    }

    public String getCarServiceName(Class<?> cls) {
        Objects.requireNonNull(cls);
        return this.mManagers.getName(cls);
    }

    public HostInfo getHostInfo() {
        return this.mHostInfo;
    }

    ManagerCache getManagers() {
        return this.mManagers;
    }

    public OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public boolean isDarkMode() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: lambda$new$10$androidx-car-app-CarContext, reason: not valid java name */
    /* synthetic */ MediaPlaybackManager m1582lambda$new$10$androidxcarappCarContext(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return MediaPlaybackManager.create(this, hostDispatcher, lifecycle);
    }

    /* renamed from: lambda$new$11$androidx-car-app-CarContext, reason: not valid java name */
    /* synthetic */ void m1583lambda$new$11$androidxcarappCarContext() {
        ((ScreenManager) getCarService(ScreenManager.class)).pop();
    }

    /* renamed from: lambda$new$3$androidx-car-app-CarContext, reason: not valid java name */
    /* synthetic */ AppManager m1584lambda$new$3$androidxcarappCarContext(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return AppManager.create(this, hostDispatcher, lifecycle);
    }

    /* renamed from: lambda$new$4$androidx-car-app-CarContext, reason: not valid java name */
    /* synthetic */ NavigationManager m1585lambda$new$4$androidxcarappCarContext(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return NavigationManager.create(this, hostDispatcher, lifecycle);
    }

    /* renamed from: lambda$new$5$androidx-car-app-CarContext, reason: not valid java name */
    /* synthetic */ ScreenManager m1586lambda$new$5$androidxcarappCarContext(Lifecycle lifecycle) {
        return ScreenManager.create(this, lifecycle);
    }

    /* renamed from: lambda$new$6$androidx-car-app-CarContext, reason: not valid java name */
    /* synthetic */ ConstraintManager m1587lambda$new$6$androidxcarappCarContext(HostDispatcher hostDispatcher) {
        return ConstraintManager.create(this, hostDispatcher);
    }

    /* renamed from: lambda$new$7$androidx-car-app-CarContext, reason: not valid java name */
    /* synthetic */ CarHardwareManager m1588lambda$new$7$androidxcarappCarContext(HostDispatcher hostDispatcher) {
        return CarHardwareManager.CC.create(this, hostDispatcher);
    }

    /* renamed from: lambda$new$8$androidx-car-app-CarContext, reason: not valid java name */
    /* synthetic */ ResultManager m1589lambda$new$8$androidxcarappCarContext() {
        return ResultManager.CC.create(this);
    }

    /* renamed from: lambda$new$9$androidx-car-app-CarContext, reason: not valid java name */
    /* synthetic */ SuggestionManager m1590lambda$new$9$androidxcarappCarContext(HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        return SuggestionManager.create(this, hostDispatcher, lifecycle);
    }

    void onCarConfigurationChanged(Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Log.d(LogTags.TAG, "Car configuration changed, configuration: " + configuration + ", displayMetrics: " + getResources().getDisplayMetrics());
        }
        getResources().updateConfiguration((Configuration) Objects.requireNonNull(configuration), getResources().getDisplayMetrics());
    }

    public void requestPermissions(List<String> list, Executor executor, OnRequestPermissionsListener onRequestPermissionsListener) {
        Objects.requireNonNull(executor);
        Objects.requireNonNull(list);
        Objects.requireNonNull(onRequestPermissionsListener);
        ComponentName componentName = new ComponentName(this, (Class<?>) CarAppPermissionActivity.class);
        Bundle bundle = new Bundle(2);
        bundle.putBinder(EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY, new AnonymousClass1(this.mLifecycle, executor, onRequestPermissionsListener));
        bundle.putStringArray(EXTRA_PERMISSIONS_KEY, (String[]) list.toArray(new String[0]));
        startActivity(new Intent(REQUEST_PERMISSIONS_ACTION).setComponent(componentName).putExtras(bundle).addFlags(268435456), Api26Impl.makeBasicActivityOptionsBundle());
    }

    @RequiresCarApi(2)
    public void setCarAppResult(int i2, Intent intent) {
        ((ResultManager) getCarService(ResultManager.class)).setCarAppResult(i2, intent);
    }

    public void setCarHost(ICarHost iCarHost) {
        ThreadUtils.checkMainThread();
        this.mHostDispatcher.setCarHost((ICarHost) Objects.requireNonNull(iCarHost));
    }

    public void updateHandshakeInfo(HandshakeInfo handshakeInfo) {
        this.mCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
    }

    void updateHostInfo(HostInfo hostInfo) {
        this.mHostInfo = hostInfo;
    }

    public Object getCarService(String str) {
        Objects.requireNonNull(str);
        return this.mManagers.getOrCreate(str);
    }

    public void startCarApp(final Intent intent) {
        Objects.requireNonNull(intent);
        this.mHostDispatcher.dispatch(CAR_SERVICE, "startCarApp", new HostCall() { // from class: androidx.car.app.CarContext$$ExternalSyntheticLambda0
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                CarContext.lambda$startCarApp$0(intent, (ICarHost) obj);
                return null;
            }
        });
    }

    public void requestPermissions(List<String> list, OnRequestPermissionsListener onRequestPermissionsListener) {
        requestPermissions(list, ContextCompat.getMainExecutor(this), onRequestPermissionsListener);
    }
}
