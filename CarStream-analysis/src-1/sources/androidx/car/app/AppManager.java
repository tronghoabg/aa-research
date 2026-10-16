package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.HandlerThread;
import android.os.RemoteException;
import androidx.car.app.AppManager;
import androidx.car.app.IAppHost;
import androidx.car.app.IAppManager;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.managers.Manager;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.model.Alert;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import androidx.core.location.LocationListenerCompat;
import androidx.lifecycle.Lifecycle;
import defpackage.m0;
import defpackage.n0;
import defpackage.o0;
import defpackage.p0;
import defpackage.s0;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class AppManager implements Manager {
    private static final int LOCATION_UPDATE_MIN_DISTANCE_METER = 1;
    private static final int LOCATION_UPDATE_MIN_INTERVAL_MILLIS = 1000;
    private final IAppManager.Stub mAppManager;
    private final CarContext mCarContext;
    private final HostDispatcher mHostDispatcher;
    private final Lifecycle mLifecycle;
    final HandlerThread mLocationUpdateHandlerThread = new HandlerThread("LocationUpdateThread");
    private final LocationListenerCompat mLocationListener = new LocationListenerCompat() { // from class: q0
        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            this.a.lambda$new$7(location);
        }
    };

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    /* renamed from: androidx.car.app.AppManager$1, reason: invalid class name */
    public class AnonymousClass1 extends IAppManager.Stub {
        final /* synthetic */ CarContext val$carContext;

        public AnonymousClass1(CarContext carContext) {
            this.val$carContext = carContext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$onBackPressed$0(CarContext carContext) {
            carContext.getOnBackPressedDispatcher().onBackPressed();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$startLocationUpdates$1(CarContext carContext) {
            ((AppManager) carContext.getCarService(AppManager.class)).startLocationUpdates();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$stopLocationUpdates$2(CarContext carContext) {
            ((AppManager) carContext.getCarService(AppManager.class)).stopLocationUpdates();
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
            Lifecycle lifecycle = AppManager.this.getLifecycle();
            ScreenManager screenManager = (ScreenManager) this.val$carContext.getCarService(ScreenManager.class);
            Objects.requireNonNull(screenManager);
            RemoteUtils.dispatchCallFromHost(lifecycle, iOnDoneCallback, "getTemplate", new m0(screenManager, 2));
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(AppManager.this.getLifecycle(), iOnDoneCallback, "onBackPressed", new a(this.val$carContext, 0));
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            PackageManager packageManager = this.val$carContext.getPackageManager();
            boolean z = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", this.val$carContext.getPackageName()) == -1;
            boolean z2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName()) == -1;
            if (z && z2) {
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "startLocationUpdates", new SecurityException("Location permission(s) not granted."));
            }
            RemoteUtils.dispatchCallFromHost(AppManager.this.getLifecycle(), iOnDoneCallback, "startLocationUpdates", new a(this.val$carContext, 2));
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(AppManager.this.getLifecycle(), iOnDoneCallback, "stopLocationUpdates", new a(this.val$carContext, 1));
        }
    }

    public AppManager(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        this.mCarContext = carContext;
        this.mHostDispatcher = hostDispatcher;
        this.mLifecycle = lifecycle;
        this.mAppManager = new AnonymousClass1(carContext);
    }

    public static AppManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new AppManager(carContext, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$dismissAlert$4(int i, IAppHost iAppHost) {
        iAppHost.dismissAlert(i);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$invalidate$1(IAppHost iAppHost) {
        iAppHost.invalidate();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$6(Location location, IAppHost iAppHost) {
        iAppHost.sendLocation(location);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$7(Location location) {
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "sendLocation", new m0(location, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OpenMicrophoneResponse lambda$openMicrophone$5(OpenMicrophoneRequest openMicrophoneRequest, IAppHost iAppHost) {
        try {
            Bundleable bundleableOpenMicrophone = iAppHost.openMicrophone(Bundleable.create(openMicrophoneRequest));
            if (bundleableOpenMicrophone == null) {
                return null;
            }
            return (OpenMicrophoneResponse) bundleableOpenMicrophone.get();
        } catch (BundlerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setSurfaceCallback$0(SurfaceCallback surfaceCallback, IAppHost iAppHost) {
        iAppHost.setSurfaceCallback(RemoteUtils.stubSurfaceCallback(this.mLifecycle, surfaceCallback));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$showAlert$3(Bundleable bundleable, IAppHost iAppHost) {
        iAppHost.showAlert(bundleable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$showToast$2(CharSequence charSequence, int i, IAppHost iAppHost) {
        iAppHost.showToast(charSequence, i);
        return null;
    }

    @RequiresCarApi(5)
    public void dismissAlert(int i) {
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "dismissAlert", new o0(i, 0));
    }

    public IAppManager.Stub getIInterface() {
        return this.mAppManager;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycle;
    }

    public void invalidate() {
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "invalidate", new n0(0));
    }

    public OpenMicrophoneResponse openMicrophone(OpenMicrophoneRequest openMicrophoneRequest) {
        try {
            return (OpenMicrophoneResponse) this.mHostDispatcher.dispatchForResult(CarContext.APP_SERVICE, "openMicrophone", new m0(openMicrophoneRequest, 0));
        } catch (RemoteException unused) {
            return null;
        }
    }

    public void setSurfaceCallback(SurfaceCallback surfaceCallback) {
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "setSurfaceListener", new p0(this, surfaceCallback));
    }

    @RequiresCarApi(5)
    public void showAlert(Alert alert) {
        Objects.requireNonNull(alert);
        try {
            this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "showAlert", new s0(Bundleable.create(alert), 0));
        } catch (BundlerException e) {
            throw new IllegalArgumentException("Serialization failure", e);
        }
    }

    public void showToast(final CharSequence charSequence, final int i) {
        Objects.requireNonNull(charSequence);
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "showToast", new HostCall() { // from class: r0
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                return AppManager.lambda$showToast$2(charSequence, i, (IAppHost) obj);
            }
        });
    }

    public void startLocationUpdates() {
        stopLocationUpdates();
        ((LocationManager) this.mCarContext.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, this.mLocationListener, this.mLocationUpdateHandlerThread.getLooper());
    }

    public void stopLocationUpdates() {
        ((LocationManager) this.mCarContext.getSystemService("location")).removeUpdates(this.mLocationListener);
    }
}
