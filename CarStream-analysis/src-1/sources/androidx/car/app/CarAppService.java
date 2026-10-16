package androidx.car.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.ThreadUtils;
import androidx.car.app.validation.HostValidator;
import defpackage.c0;
import defpackage.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class CarAppService extends Service {
    private static final String AUTO_DRIVE = "AUTO_DRIVE";
    public static final String CATEGORY_CALLING_APP = "androidx.car.app.category.CALLING";

    @Deprecated
    public static final String CATEGORY_CHARGING_APP = "androidx.car.app.category.CHARGING";

    @RequiresCarApi(6)
    public static final String CATEGORY_FEATURE_CLUSTER = "androidx.car.app.category.FEATURE_CLUSTER";
    public static final String CATEGORY_IOT_APP = "androidx.car.app.category.IOT";
    public static final String CATEGORY_MESSAGING_APP = "androidx.car.app.category.MESSAGING";
    public static final String CATEGORY_NAVIGATION_APP = "androidx.car.app.category.NAVIGATION";

    @Deprecated
    public static final String CATEGORY_PARKING_APP = "androidx.car.app.category.PARKING";
    public static final String CATEGORY_POI_APP = "androidx.car.app.category.POI";
    public static final String CATEGORY_SETTINGS_APP = "androidx.car.app.category.SETTINGS";
    public static final String CATEGORY_WEATHER_APP = "androidx.car.app.category.WEATHER";
    public static final String SERVICE_INTERFACE = "androidx.car.app.CarAppService";
    private AppInfo mAppInfo;
    private final Map<SessionInfo, CarAppBinder> mBinders = new HashMap();
    private HostInfo mHostInfo;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dump$1() {
        synchronized (this.mBinders) {
            try {
                for (CarAppBinder carAppBinder : this.mBinders.values()) {
                    if (Log.isLoggable(LogTags.TAG, 3)) {
                        Objects.toString(carAppBinder.getCurrentSessionInfo());
                    }
                    carAppBinder.onAutoDriveEnabled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnbind$0(SessionInfo sessionInfo) {
        synchronized (this.mBinders) {
            try {
                CarAppBinder carAppBinderRemove = this.mBinders.remove(sessionInfo);
                if (carAppBinderRemove != null) {
                    carAppBinderRemove.onDestroyLifecycle();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract HostValidator createHostValidator();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (AUTO_DRIVE.equals(str)) {
                ThreadUtils.runOnMain(new r(this, 1));
            }
        }
    }

    public AppInfo getAppInfo() {
        if (this.mAppInfo == null) {
            this.mAppInfo = AppInfo.create(this);
        }
        return this.mAppInfo;
    }

    @Deprecated
    public final Session getCurrentSession() {
        synchronized (this.mBinders) {
            try {
                for (Map.Entry<SessionInfo, CarAppBinder> entry : this.mBinders.entrySet()) {
                    if (entry.getKey().getDisplayType() == 0) {
                        return entry.getValue().getCurrentSession();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HostInfo getHostInfo() {
        return this.mHostInfo;
    }

    public final Session getSession(SessionInfo sessionInfo) {
        synchronized (this.mBinders) {
            try {
                CarAppBinder carAppBinder = this.mBinders.get(sessionInfo);
                if (carAppBinder == null) {
                    return null;
                }
                return carAppBinder.getCurrentSession();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        CarAppBinder carAppBinder;
        SessionInfo sessionInfoDecode = SessionInfoIntentEncoder.containsSessionInfo(intent) ? SessionInfoIntentEncoder.decode(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        synchronized (this.mBinders) {
            try {
                if (!this.mBinders.containsKey(sessionInfoDecode)) {
                    this.mBinders.put(sessionInfoDecode, new CarAppBinder(this, sessionInfoDecode));
                }
                CarAppBinder carAppBinder2 = this.mBinders.get(sessionInfoDecode);
                Objects.requireNonNull(carAppBinder2);
                carAppBinder = carAppBinder2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return carAppBinder;
    }

    public Session onCreateSession() {
        throw new RuntimeException("Please override and implement CarAppService#onCreateSession(SessionInfo).");
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.mBinders) {
            try {
                Iterator<CarAppBinder> it = this.mBinders.values().iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.mBinders.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Objects.toString(intent);
        }
        ThreadUtils.runOnMain(new c0(2, this, SessionInfoIntentEncoder.containsSessionInfo(intent) ? SessionInfoIntentEncoder.decode(intent) : SessionInfo.DEFAULT_SESSION_INFO));
        Log.isLoggable(LogTags.TAG, 3);
        return true;
    }

    public void setAppInfo(AppInfo appInfo) {
        this.mAppInfo = appInfo;
    }

    public void setBinder(SessionInfo sessionInfo, CarAppBinder carAppBinder) {
        if (carAppBinder == null) {
            this.mBinders.remove(sessionInfo);
        } else {
            this.mBinders.put(sessionInfo, carAppBinder);
        }
    }

    public void setHostInfo(HostInfo hostInfo) {
        this.mHostInfo = hostInfo;
    }

    @RequiresCarApi(6)
    public Session onCreateSession(SessionInfo sessionInfo) {
        return onCreateSession();
    }
}
