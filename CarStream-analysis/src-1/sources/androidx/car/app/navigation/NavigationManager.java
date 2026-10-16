package androidx.car.app.navigation;

import android.util.Log;
import androidx.car.app.CarContext;
import androidx.car.app.HostDispatcher;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.managers.Manager;
import androidx.car.app.navigation.INavigationManager;
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
import defpackage.n0;
import defpackage.r;
import defpackage.s0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class NavigationManager implements Manager {
    private final CarContext mCarContext;
    private final HostDispatcher mHostDispatcher;
    private boolean mIsAutoDriveEnabled;
    private boolean mIsNavigating;
    private final INavigationManager.Stub mNavigationManager;
    private NavigationManagerCallback mNavigationManagerCallback;
    private Executor mNavigationManagerCallbackExecutor;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    /* renamed from: androidx.car.app.navigation.NavigationManager$1, reason: invalid class name */
    public class AnonymousClass1 extends INavigationManager.Stub {
        final /* synthetic */ Lifecycle val$lifecycle;

        public AnonymousClass1(Lifecycle lifecycle) {
            this.val$lifecycle = lifecycle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onStopNavigation$0() {
            NavigationManager.this.onStopNavigation();
            return null;
        }

        @Override // androidx.car.app.navigation.INavigationManager
        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new RemoteUtils.HostCall() { // from class: androidx.car.app.navigation.a
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.a.lambda$onStopNavigation$0();
                }
            });
        }
    }

    public NavigationManager(CarContext carContext, HostDispatcher hostDispatcher, final Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        this.mCarContext = carContext;
        Objects.requireNonNull(hostDispatcher);
        this.mHostDispatcher = hostDispatcher;
        this.mNavigationManager = new AnonymousClass1(lifecycle);
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.navigation.NavigationManager.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                NavigationManager.this.onStopNavigation();
                lifecycle.removeObserver(this);
            }
        });
    }

    public static NavigationManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new NavigationManager(carContext, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$navigationEnded$2(INavigationHost iNavigationHost) {
        iNavigationHost.navigationEnded();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$navigationStarted$1(INavigationHost iNavigationHost) {
        iNavigationHost.navigationStarted();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStopNavigation$3() {
        NavigationManagerCallback navigationManagerCallback = this.mNavigationManagerCallback;
        if (navigationManagerCallback != null) {
            navigationManagerCallback.onStopNavigation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$updateTrip$0(Bundleable bundleable, INavigationHost iNavigationHost) {
        iNavigationHost.updateTrip(bundleable);
        return null;
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

    public void navigationEnded() {
        ThreadUtils.checkMainThread();
        if (this.mIsNavigating) {
            this.mIsNavigating = false;
            this.mHostDispatcher.dispatch("navigation", "navigationEnded", new n0(3));
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
        this.mHostDispatcher.dispatch("navigation", "navigationStarted", new n0(4));
    }

    public void onAutoDriveEnabled() {
        ThreadUtils.checkMainThread();
        Log.isLoggable(LogTags.TAG_NAVIGATION_MANAGER, 3);
        this.mIsAutoDriveEnabled = true;
        NavigationManagerCallback navigationManagerCallback = this.mNavigationManagerCallback;
        Executor executor = this.mNavigationManagerCallbackExecutor;
        if (navigationManagerCallback == null || executor == null) {
            return;
        }
        executor.execute(new r(navigationManagerCallback, 7));
    }

    public void onStopNavigation() {
        ThreadUtils.checkMainThread();
        if (this.mIsNavigating) {
            this.mIsNavigating = false;
            Executor executor = this.mNavigationManagerCallbackExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new r(this, 8));
        }
    }

    public void setNavigationManagerCallback(NavigationManagerCallback navigationManagerCallback) {
        ThreadUtils.checkMainThread();
        setNavigationManagerCallback(ContextCompat.getMainExecutor(this.mCarContext), navigationManagerCallback);
    }

    public void updateTrip(Trip trip) {
        ThreadUtils.checkMainThread();
        if (!this.mIsNavigating) {
            throw new IllegalStateException("Navigation is not started");
        }
        try {
            this.mHostDispatcher.dispatch("navigation", "updateTrip", new s0(Bundleable.create(trip), 2));
        } catch (BundlerException e) {
            throw new IllegalArgumentException("Serialization failure", e);
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
}
