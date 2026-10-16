package com.carstream.tech.car;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.google.android.gms.car.CarActivityHost;
import com.google.android.gms.car.CarActivityServiceProxy;
import defpackage.c5;
import defpackage.w1;
import defpackage.z6;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class ProjectionService extends Service implements CarActivityServiceProxy.ServiceCallbacks {
    private static final String TAG = "CNMedia";
    private Configuration lastConfig;
    private CarActivityServiceProxy proxy;

    private boolean ensureProxy() {
        if (this.proxy != null) {
            return true;
        }
        try {
            CarActivityServiceProxy carActivityServiceProxyR = w1.r(this);
            this.proxy = carActivityServiceProxyR;
            carActivityServiceProxyR.onCreate(this, this);
            return true;
        } catch (Throwable th) {
            String.valueOf(th);
            return false;
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        CarActivityServiceProxy carActivityServiceProxy = this.proxy;
        if (carActivityServiceProxy != null) {
            carActivityServiceProxy.dump(fileDescriptor, printWriter, strArr);
        } else {
            printWriter.println("proxy chua khoi tao");
        }
    }

    @Override // com.google.android.gms.car.CarActivityServiceProxy.ServiceCallbacks
    public Class<? extends CarActivityHost.HostedCarActivity> getCarActivity() {
        return CarScreen.class;
    }

    @Override // com.google.android.gms.car.CarActivityServiceProxy.ServiceCallbacks
    public int getHandledConfigChanges() {
        return 512;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        z6.s("projection", true);
        if (ensureProxy()) {
            return this.proxy.onBind(intent);
        }
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        CarActivityServiceProxy carActivityServiceProxy;
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = this.lastConfig;
        int iDiff = configuration2 == null ? -1 : configuration2.diff(configuration);
        this.lastConfig = new Configuration(configuration);
        if (iDiff == 512 || (carActivityServiceProxy = this.proxy) == null) {
            return;
        }
        carActivityServiceProxy.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c5.d(this);
        this.lastConfig = new Configuration(getResources().getConfiguration());
        ensureProxy();
    }

    @Override // android.app.Service
    public void onDestroy() {
        z6.s("projection", false);
        CarActivityServiceProxy carActivityServiceProxy = this.proxy;
        if (carActivityServiceProxy != null) {
            carActivityServiceProxy.onDestroy();
            this.proxy = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        CarActivityServiceProxy carActivityServiceProxy = this.proxy;
        if (carActivityServiceProxy != null) {
            carActivityServiceProxy.onLowMemory();
        }
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        z6.s("projection", true);
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        z6.s("projection", false);
        CarActivityServiceProxy carActivityServiceProxy = this.proxy;
        if (carActivityServiceProxy == null) {
            return true;
        }
        carActivityServiceProxy.onUnbind(intent);
        return true;
    }
}
