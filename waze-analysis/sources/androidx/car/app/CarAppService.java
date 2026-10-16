package androidx.car.app;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.ThreadUtils;
import androidx.car.app.validation.HostValidator;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class CarAppService extends Service {
    private static final String AUTO_DRIVE = "AUTO_DRIVE";
    public static final String CATEGORY_CALLING_APP = "androidx.car.app.category.CALLING";

    @Deprecated
    public static final String CATEGORY_CHARGING_APP = "androidx.car.app.category.CHARGING";

    @RequiresCarApi(6)
    public static final String CATEGORY_FEATURE_CLUSTER = "androidx.car.app.category.FEATURE_CLUSTER";

    @RequiresCarApi(6)
    public static final String CATEGORY_IOT_APP = "androidx.car.app.category.IOT";

    @RequiresCarApi(8)
    public static final String CATEGORY_MEDIA_APP = "androidx.car.app.category.MEDIA";
    public static final String CATEGORY_MESSAGING_APP = "androidx.car.app.category.MESSAGING";
    public static final String CATEGORY_NAVIGATION_APP = "androidx.car.app.category.NAVIGATION";

    @Deprecated
    public static final String CATEGORY_PARKING_APP = "androidx.car.app.category.PARKING";
    public static final String CATEGORY_POI_APP = "androidx.car.app.category.POI";

    @RequiresCarApi(6)
    public static final String CATEGORY_SETTINGS_APP = "androidx.car.app.category.SETTINGS";

    @RequiresCarApi(7)
    public static final String CATEGORY_WEATHER_APP = "androidx.car.app.category.WEATHER";
    public static final String SERVICE_INTERFACE = "androidx.car.app.CarAppService";
    private AppInfo mAppInfo;
    private final Map<SessionInfo, CarAppBinder> mBinders = new HashMap();
    private HostInfo mHostInfo;

    public abstract HostValidator createHostValidator();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (strArr != null) {
            for (String str : strArr) {
                if (AUTO_DRIVE.equals(str)) {
                    ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.CarAppService$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m1578lambda$dump$1$androidxcarappCarAppService();
                        }
                    });
                }
            }
        }
    }

    AppInfo getAppInfo() throws PackageManager.NameNotFoundException {
        AppInfo appInfo = this.mAppInfo;
        if (appInfo != null) {
            return appInfo;
        }
        AppInfo appInfoCreate = AppInfo.create(this);
        this.mAppInfo = appInfoCreate;
        return appInfoCreate;
    }

    @Deprecated
    public final Session getCurrentSession() {
        synchronized (this.mBinders) {
            for (Map.Entry<SessionInfo, CarAppBinder> entry : this.mBinders.entrySet()) {
                if (entry.getKey().getDisplayType() == 0) {
                    return entry.getValue().getCurrentSession();
                }
            }
            return null;
        }
    }

    public final HostInfo getHostInfo() {
        return this.mHostInfo;
    }

    public final Session getSession(SessionInfo sessionInfo) {
        synchronized (this.mBinders) {
            CarAppBinder carAppBinder = this.mBinders.get(sessionInfo);
            if (carAppBinder == null) {
                return null;
            }
            return carAppBinder.getCurrentSession();
        }
    }

    /* renamed from: lambda$dump$1$androidx-car-app-CarAppService, reason: not valid java name */
    /* synthetic */ void m1578lambda$dump$1$androidxcarappCarAppService() {
        synchronized (this.mBinders) {
            for (CarAppBinder carAppBinder : this.mBinders.values()) {
                if (Log.isLoggable(LogTags.TAG, 3)) {
                    Log.d(LogTags.TAG, "Executing onAutoDriveEnabled for " + carAppBinder.getCurrentSessionInfo());
                }
                carAppBinder.onAutoDriveEnabled();
            }
        }
    }

    /* renamed from: lambda$onUnbind$0$androidx-car-app-CarAppService, reason: not valid java name */
    /* synthetic */ void m1579lambda$onUnbind$0$androidxcarappCarAppService(SessionInfo sessionInfo) {
        synchronized (this.mBinders) {
            CarAppBinder carAppBinderRemove = this.mBinders.remove(sessionInfo);
            if (carAppBinderRemove != null) {
                carAppBinderRemove.onDestroyLifecycle();
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder iBinder;
        SessionInfo sessionInfoDecode = SessionInfoIntentEncoder.containsSessionInfo(intent) ? SessionInfoIntentEncoder.decode(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        synchronized (this.mBinders) {
            if (!this.mBinders.containsKey(sessionInfoDecode)) {
                this.mBinders.put(sessionInfoDecode, new CarAppBinder(this, sessionInfoDecode));
            }
            iBinder = (IBinder) Objects.requireNonNull(this.mBinders.get(sessionInfoDecode));
        }
        return iBinder;
    }

    public Session onCreateSession() {
        throw new RuntimeException("Please override and implement CarAppService#onCreateSession(SessionInfo).");
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.mBinders) {
            Iterator<CarAppBinder> it = this.mBinders.values().iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.mBinders.clear();
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (Log.isLoggable(LogTags.TAG, 3)) {
            java.util.Objects.toString(intent);
            Log.d(LogTags.TAG, "onUnbind intent: ".concat(String.valueOf(intent)));
        }
        final SessionInfo sessionInfoDecode = SessionInfoIntentEncoder.containsSessionInfo(intent) ? SessionInfoIntentEncoder.decode(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.CarAppService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1579lambda$onUnbind$0$androidxcarappCarAppService(sessionInfoDecode);
            }
        });
        if (!Log.isLoggable(LogTags.TAG, 3)) {
            return true;
        }
        Log.d(LogTags.TAG, "onUnbind completed");
        return true;
    }

    void setAppInfo(AppInfo appInfo) {
        this.mAppInfo = appInfo;
    }

    void setBinder(SessionInfo sessionInfo, CarAppBinder carAppBinder) {
        Map<SessionInfo, CarAppBinder> map = this.mBinders;
        if (carAppBinder == null) {
            map.remove(sessionInfo);
        } else {
            map.put(sessionInfo, carAppBinder);
        }
    }

    void setHostInfo(HostInfo hostInfo) {
        this.mHostInfo = hostInfo;
    }

    @RequiresCarApi(6)
    public Session onCreateSession(SessionInfo sessionInfo) {
        return onCreateSession();
    }
}
