package androidx.car.app.navigation;

import android.util.Log;
import androidx.car.app.CarContext;
import androidx.car.app.HostCall;
import androidx.car.app.HostDispatcher;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.managers.Manager;
import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.navigation.model.NavigationVoiceAssistantCapabilities;
import androidx.car.app.navigation.model.Trip;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.RemoteUtils;
import androidx.car.app.utils.ThreadUtils;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import h.g.b.x;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class NavigationManager implements Manager {
    private final CarContext mCarContext;
    private final HostDispatcher mHostDispatcher;
    private boolean mIsAutoDriveEnabled;
    private boolean mIsNavigating;
    private final INavigationManager.Stub mNavigationManager;
    private NavigationManagerCallback mNavigationManagerCallback;
    private Executor mNavigationManagerCallbackExecutor;

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.navigation.NavigationManager$1, reason: invalid class name */
    class AnonymousClass1 extends INavigationManager.Stub {
        final /* synthetic */ Lifecycle val$lifecycle;

        AnonymousClass1(Lifecycle lifecycle) {
            this.val$lifecycle = lifecycle;
        }

        @Override // androidx.car.app.navigation.INavigationManager
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onStopNavigation$0$androidx-car-app-navigation-NavigationManager$1, reason: not valid java name */
        /* synthetic */ Object m1661xb1216230() {
            NavigationManager.this.onStopNavigation();
            return null;
        }

        @Override // androidx.car.app.navigation.INavigationManager
        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new RemoteUtils.HostCall() { // from class: androidx.car.app.navigation.NavigationManager$1$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1661xb1216230();
                }
            });
        }
    }

    protected NavigationManager(CarContext carContext, HostDispatcher hostDispatcher, final Lifecycle lifecycle) {
        this.mCarContext = (CarContext) Objects.requireNonNull(carContext);
        this.mHostDispatcher = (HostDispatcher) Objects.requireNonNull(hostDispatcher);
        this.mNavigationManager = new AnonymousClass1(lifecycle);
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.navigation.NavigationManager.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                NavigationManager.this.onStopNavigation();
                lifecycle.removeObserver(this);
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

    public static NavigationManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new NavigationManager(carContext, hostDispatcher, lifecycle);
    }

    static /* synthetic */ Object lambda$navigationEnded$3(INavigationHost iNavigationHost) {
        iNavigationHost.navigationEnded();
        return null;
    }

    static /* synthetic */ Object lambda$navigationStarted$2(INavigationHost iNavigationHost) {
        iNavigationHost.navigationStarted();
        return null;
    }

    static /* synthetic */ Object lambda$setVoiceAssistantCapabilities$1(Bundleable bundleable, INavigationHost iNavigationHost) {
        iNavigationHost.setVoiceAssistantCapabilities(bundleable);
        return null;
    }

    static /* synthetic */ Object lambda$updateTrip$0(Bundleable bundleable, INavigationHost iNavigationHost) {
        iNavigationHost.updateTrip(bundleable);
        return null;
    }

    @RequiresCarApi(9)
    public boolean canSetVoiceAssistantCapabilities() {
        if (this.mCarContext.getCarAppApiLevel() < 9) {
            return false;
        }
        return this.mCarContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public void clearNavigationManagerCallback() {
        ThreadUtils.checkMainThread();
        if (this.mIsNavigating) {
            throw new IllegalStateException("Removing callback while navigating");
        }
        this.mNavigationManagerCallbackExecutor = null;
        this.mNavigationManagerCallback = null;
    }

    public INavigationManager.Stub getIInterface() {
        return this.mNavigationManager;
    }

    /* renamed from: lambda$onStopNavigation$4$androidx-car-app-navigation-NavigationManager, reason: not valid java name */
    /* synthetic */ void m1660x41fb0367() {
        NavigationManagerCallback navigationManagerCallback = this.mNavigationManagerCallback;
        if (navigationManagerCallback != null) {
            navigationManagerCallback.onStopNavigation();
        }
    }

    public void navigationEnded() {
        ThreadUtils.checkMainThread();
        if (this.mIsNavigating) {
            this.mIsNavigating = false;
            this.mHostDispatcher.dispatch("navigation", "navigationEnded", new HostCall() { // from class: androidx.car.app.navigation.NavigationManager$$ExternalSyntheticLambda2
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    NavigationManager.lambda$navigationEnded$3((INavigationHost) obj);
                    return null;
                }
            });
        }
    }

    public void navigationStarted() {
        ThreadUtils.checkMainThread();
        if (this.mIsNavigating) {
            return;
        }
        if (this.mNavigationManagerCallback == null) {
            throw new IllegalStateException("No callback has been set");
        }
        this.mIsNavigating = true;
        this.mHostDispatcher.dispatch("navigation", "navigationStarted", new HostCall() { // from class: androidx.car.app.navigation.NavigationManager$$ExternalSyntheticLambda3
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                NavigationManager.lambda$navigationStarted$2((INavigationHost) obj);
                return null;
            }
        });
    }

    public void onAutoDriveEnabled() {
        ThreadUtils.checkMainThread();
        if (Log.isLoggable(LogTags.TAG_NAVIGATION_MANAGER, 3)) {
            Log.d(LogTags.TAG_NAVIGATION_MANAGER, "Executing onAutoDriveEnabled");
        }
        this.mIsAutoDriveEnabled = true;
        final NavigationManagerCallback navigationManagerCallback = this.mNavigationManagerCallback;
        Executor executor = this.mNavigationManagerCallbackExecutor;
        if (navigationManagerCallback == null || executor == null) {
            Log.w(LogTags.TAG_NAVIGATION_MANAGER, "NavigationManagerCallback not set, skipping onAutoDriveEnabled");
        } else {
            Objects.requireNonNull(navigationManagerCallback);
            executor.execute(new Runnable() { // from class: androidx.car.app.navigation.NavigationManager$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    navigationManagerCallback.onAutoDriveEnabled();
                }
            });
        }
    }

    public void onStopNavigation() {
        ThreadUtils.checkMainThread();
        if (this.mIsNavigating) {
            this.mIsNavigating = false;
            Executor executor = this.mNavigationManagerCallbackExecutor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.car.app.navigation.NavigationManager$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1660x41fb0367();
                    }
                });
            }
        }
    }

    public void setNavigationManagerCallback(Executor executor, NavigationManagerCallback navigationManagerCallback) {
        ThreadUtils.checkMainThread();
        this.mNavigationManagerCallbackExecutor = executor;
        this.mNavigationManagerCallback = navigationManagerCallback;
        if (this.mIsAutoDriveEnabled) {
            onAutoDriveEnabled();
        }
    }

    @RequiresCarApi(9)
    public void setVoiceAssistantCapabilities(NavigationVoiceAssistantCapabilities navigationVoiceAssistantCapabilities) {
        ThreadUtils.checkMainThread();
        Objects.requireNonNull(navigationVoiceAssistantCapabilities);
        if (!canSetVoiceAssistantCapabilities()) {
            throw new IllegalStateException("VoiceAssistantCapabilities are not supported on this host");
        }
        try {
            final Bundleable bundleableCreate = Bundleable.create(navigationVoiceAssistantCapabilities);
            this.mHostDispatcher.dispatch("navigation", "setVoiceAssistantCapabilities", new HostCall() { // from class: androidx.car.app.navigation.NavigationManager$$ExternalSyntheticLambda1
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    NavigationManager.lambda$setVoiceAssistantCapabilities$1(bundleableCreate, (INavigationHost) obj);
                    return null;
                }
            });
        } catch (BundlerException e2) {
            throw new IllegalArgumentException("Serialization failure", e2);
        }
    }

    public void updateTrip(Trip trip) {
        ThreadUtils.checkMainThread();
        if (!this.mIsNavigating) {
            throw new IllegalStateException("Navigation is not started");
        }
        try {
            final Bundleable bundleableCreate = Bundleable.create(trip);
            this.mHostDispatcher.dispatch("navigation", "updateTrip", new HostCall() { // from class: androidx.car.app.navigation.NavigationManager$$ExternalSyntheticLambda0
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    NavigationManager.lambda$updateTrip$0(bundleableCreate, (INavigationHost) obj);
                    return null;
                }
            });
        } catch (BundlerException e2) {
            throw new IllegalArgumentException("Serialization failure", e2);
        }
    }

    public void setNavigationManagerCallback(NavigationManagerCallback navigationManagerCallback) {
        ThreadUtils.checkMainThread();
        setNavigationManagerCallback(ContextCompat.getMainExecutor(this.mCarContext), navigationManagerCallback);
    }
}
