package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.IAppManager;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.managers.Manager;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.model.Alert;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.RemoteUtils;
import androidx.core.location.LocationListenerCompat;
import androidx.lifecycle.Lifecycle;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AppManager implements Manager {
    private static final int LOCATION_UPDATE_MIN_DISTANCE_METER = 1;
    private static final int LOCATION_UPDATE_MIN_INTERVAL_MILLIS = 1000;
    private final IAppManager.Stub mAppManager;
    private final CarContext mCarContext;
    private final HostDispatcher mHostDispatcher;
    private final Lifecycle mLifecycle;
    final HandlerThread mLocationUpdateHandlerThread = new HandlerThread("LocationUpdateThread");
    private final LocationListenerCompat mLocationListener = new LocationListenerCompat() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda5
        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            this.f$0.m1567lambda$new$7$androidxcarappAppManager(location);
        }

        @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
        public /* synthetic */ void onLocationChanged(List list) {
            LocationListenerCompat.CC.$default$onLocationChanged(this, list);
        }

        @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
        public /* synthetic */ void onFlushComplete(int i2) {
        }

        @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
        public /* synthetic */ void onProviderDisabled(String str) {
        }

        @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
        public /* synthetic */ void onProviderEnabled(String str) {
        }

        @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
        public /* synthetic */ void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.AppManager$1, reason: invalid class name */
    class AnonymousClass1 extends IAppManager.Stub {
        final /* synthetic */ CarContext val$carContext;

        AnonymousClass1(CarContext carContext) {
            this.val$carContext = carContext;
        }

        static /* synthetic */ Object lambda$onBackPressed$0(CarContext carContext) {
            carContext.getOnBackPressedDispatcher().onBackPressed();
            return null;
        }

        static /* synthetic */ Object lambda$startLocationUpdates$1(CarContext carContext) {
            ((AppManager) carContext.getCarService(AppManager.class)).startLocationUpdates();
            return null;
        }

        static /* synthetic */ Object lambda$stopLocationUpdates$2(CarContext carContext) {
            ((AppManager) carContext.getCarService(AppManager.class)).stopLocationUpdates();
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
            CarContext carContext = this.val$carContext;
            Lifecycle lifecycle = AppManager.this.getLifecycle();
            final ScreenManager screenManager = (ScreenManager) carContext.getCarService(ScreenManager.class);
            Objects.requireNonNull(screenManager);
            RemoteUtils.dispatchCallFromHost(lifecycle, iOnDoneCallback, "getTemplate", new RemoteUtils.HostCall() { // from class: androidx.car.app.AppManager$1$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return screenManager.getTopTemplate();
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
            Lifecycle lifecycle = AppManager.this.getLifecycle();
            final CarContext carContext = this.val$carContext;
            RemoteUtils.dispatchCallFromHost(lifecycle, iOnDoneCallback, "onBackPressed", new RemoteUtils.HostCall() { // from class: androidx.car.app.AppManager$1$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    AppManager.AnonymousClass1.lambda$onBackPressed$0(carContext);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            CarContext carContext = this.val$carContext;
            PackageManager packageManager = carContext.getPackageManager();
            int iCheckPermission = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", carContext.getPackageName());
            int iCheckPermission2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName());
            if (iCheckPermission == -1 && iCheckPermission2 == -1) {
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "startLocationUpdates", new SecurityException("Location permission(s) not granted."));
            }
            AppManager appManager = AppManager.this;
            final CarContext carContext2 = this.val$carContext;
            RemoteUtils.dispatchCallFromHost(appManager.getLifecycle(), iOnDoneCallback, "startLocationUpdates", new RemoteUtils.HostCall() { // from class: androidx.car.app.AppManager$1$$ExternalSyntheticLambda3
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    AppManager.AnonymousClass1.lambda$startLocationUpdates$1(carContext2);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            Lifecycle lifecycle = AppManager.this.getLifecycle();
            final CarContext carContext = this.val$carContext;
            RemoteUtils.dispatchCallFromHost(lifecycle, iOnDoneCallback, "stopLocationUpdates", new RemoteUtils.HostCall() { // from class: androidx.car.app.AppManager$1$$ExternalSyntheticLambda2
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    AppManager.AnonymousClass1.lambda$stopLocationUpdates$2(carContext);
                    return null;
                }
            });
        }
    }

    protected AppManager(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        this.mCarContext = carContext;
        this.mHostDispatcher = hostDispatcher;
        this.mLifecycle = lifecycle;
        this.mAppManager = new AnonymousClass1(carContext);
    }

    static AppManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new AppManager(carContext, hostDispatcher, lifecycle);
    }

    static /* synthetic */ Object lambda$dismissAlert$4(int i2, IAppHost iAppHost) {
        iAppHost.dismissAlert(i2);
        return null;
    }

    static /* synthetic */ Object lambda$invalidate$1(IAppHost iAppHost) {
        iAppHost.invalidate();
        return null;
    }

    static /* synthetic */ Object lambda$new$6(Location location, IAppHost iAppHost) {
        iAppHost.sendLocation(location);
        return null;
    }

    static /* synthetic */ OpenMicrophoneResponse lambda$openMicrophone$5(OpenMicrophoneRequest openMicrophoneRequest, IAppHost iAppHost) {
        try {
            Bundleable bundleableOpenMicrophone = iAppHost.openMicrophone(Bundleable.create(openMicrophoneRequest));
            if (bundleableOpenMicrophone == null) {
                return null;
            }
            return (OpenMicrophoneResponse) bundleableOpenMicrophone.get();
        } catch (BundlerException e2) {
            Log.e(LogTags.TAG, "Cannot open microphone", e2);
            return null;
        }
    }

    static /* synthetic */ Object lambda$showAlert$3(Bundleable bundleable, IAppHost iAppHost) {
        iAppHost.showAlert(bundleable);
        return null;
    }

    static /* synthetic */ Object lambda$showToast$2(CharSequence charSequence, int i2, IAppHost iAppHost) {
        iAppHost.showToast(charSequence, i2);
        return null;
    }

    @RequiresCarApi(5)
    public void dismissAlert(final int i2) {
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "dismissAlert", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda2
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                AppManager.lambda$dismissAlert$4(i2, (IAppHost) obj);
                return null;
            }
        });
    }

    IAppManager.Stub getIInterface() {
        return this.mAppManager;
    }

    Lifecycle getLifecycle() {
        return this.mLifecycle;
    }

    public void invalidate() {
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "invalidate", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda1
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                AppManager.lambda$invalidate$1((IAppHost) obj);
                return null;
            }
        });
    }

    /* renamed from: lambda$new$7$androidx-car-app-AppManager, reason: not valid java name */
    /* synthetic */ void m1567lambda$new$7$androidxcarappAppManager(final Location location) {
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "sendLocation", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda4
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                AppManager.lambda$new$6(location, (IAppHost) obj);
                return null;
            }
        });
    }

    /* renamed from: lambda$setSurfaceCallback$0$androidx-car-app-AppManager, reason: not valid java name */
    /* synthetic */ Object m1568lambda$setSurfaceCallback$0$androidxcarappAppManager(SurfaceCallback surfaceCallback, IAppHost iAppHost) {
        iAppHost.setSurfaceCallback(RemoteUtils.stubSurfaceCallback(this.mLifecycle, surfaceCallback));
        return null;
    }

    public OpenMicrophoneResponse openMicrophone(final OpenMicrophoneRequest openMicrophoneRequest) {
        try {
            return (OpenMicrophoneResponse) this.mHostDispatcher.dispatchForResult(CarContext.APP_SERVICE, "openMicrophone", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda0
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    return AppManager.lambda$openMicrophone$5(openMicrophoneRequest, (IAppHost) obj);
                }
            });
        } catch (RemoteException e2) {
            Log.e(LogTags.TAG, "Error getting microphone bytes from host", e2);
            return null;
        }
    }

    public void setSurfaceCallback(final SurfaceCallback surfaceCallback) {
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "setSurfaceListener", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda3
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                return this.f$0.m1568lambda$setSurfaceCallback$0$androidxcarappAppManager(surfaceCallback, (IAppHost) obj);
            }
        });
    }

    @RequiresCarApi(5)
    public void showAlert(Alert alert) {
        Objects.requireNonNull(alert);
        try {
            final Bundleable bundleableCreate = Bundleable.create(alert);
            this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "showAlert", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda7
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    AppManager.lambda$showAlert$3(bundleableCreate, (IAppHost) obj);
                    return null;
                }
            });
        } catch (BundlerException e2) {
            throw new IllegalArgumentException("Serialization failure", e2);
        }
    }

    public void showToast(final CharSequence charSequence, final int i2) {
        Objects.requireNonNull(charSequence);
        this.mHostDispatcher.dispatch(CarContext.APP_SERVICE, "showToast", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda6
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                AppManager.lambda$showToast$2(charSequence, i2, (IAppHost) obj);
                return null;
            }
        });
    }

    void startLocationUpdates() {
        stopLocationUpdates();
        ((LocationManager) this.mCarContext.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, this.mLocationListener, this.mLocationUpdateHandlerThread.getLooper());
    }

    void stopLocationUpdates() {
        ((LocationManager) this.mCarContext.getSystemService("location")).removeUpdates(this.mLocationListener);
    }
}
