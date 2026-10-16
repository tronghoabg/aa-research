package com.google.android.gms.car;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.google.android.gms.car.CarActivityHost;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface CarActivityServiceProxy {

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface ServiceCallbacks {
        Class<? extends CarActivityHost.HostedCarActivity> getCarActivity();

        int getHandledConfigChanges();
    }

    void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    Object getActivityInstance();

    IBinder onBind(Intent intent);

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Service service, ServiceCallbacks serviceCallbacks);

    void onDestroy();

    void onLowMemory();

    boolean onUnbind(Intent intent);

    void relinquishVideoFocus();

    void requestVideoFocus();

    void setCrashReportingEnabled(boolean z);
}
