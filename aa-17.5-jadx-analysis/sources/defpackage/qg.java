package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.AppInfo;
import androidx.car.app.CarAppBinder;
import androidx.car.app.SessionInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class qg extends Service {
    public final Map a = new HashMap();
    public qt b;
    private AppInfo c;

    public final AppInfo a() {
        AppInfo appInfo = this.c;
        if (appInfo != null) {
            return appInfo;
        }
        AppInfo appInfoCreate = AppInfo.create(this);
        this.c = appInfoCreate;
        return appInfoCreate;
    }

    public qz b() {
        throw new RuntimeException("Please override and implement CarAppService#onCreateSession(SessionInfo).");
    }

    public qz c(SessionInfo sessionInfo) {
        return b();
    }

    public abstract yk d();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (strArr != null) {
            for (String str : strArr) {
                if ("AUTO_DRIVE".equals(str)) {
                    yj.b(new lh(this, 7, null));
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        CarAppBinder carAppBinder;
        SessionInfo sessionInfoG = mt.i(intent) ? mt.g(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        Map map = this.a;
        synchronized (map) {
            if (!map.containsKey(sessionInfoG)) {
                map.put(sessionInfoG, new CarAppBinder(this, sessionInfoG));
            }
            carAppBinder = (CarAppBinder) map.get(sessionInfoG);
            carAppBinder.getClass();
        }
        return carAppBinder;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Map map = this.a;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((CarAppBinder) it.next()).destroy();
            }
            map.clear();
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
            Log.d("CarApp", "onUnbind intent: ".concat(String.valueOf(intent)));
        }
        yj.b(new af((Object) this, (Object) (mt.i(intent) ? mt.g(intent) : SessionInfo.DEFAULT_SESSION_INFO), 13, (byte[]) null));
        if (!Log.isLoggable("CarApp", 3)) {
            return true;
        }
        Log.d("CarApp", "onUnbind completed");
        return true;
    }
}
