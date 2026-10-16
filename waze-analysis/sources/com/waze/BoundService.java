package com.waze;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.waze.config.ConfigValues;
import com.waze.sdk.SdkConfiguration;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class BoundService extends Service {

    /* renamed from: a, reason: collision with root package name */
    static String f13534a = null;

    /* renamed from: b, reason: collision with root package name */
    static PendingIntent f13535b = null;

    /* renamed from: c, reason: collision with root package name */
    static boolean f13536c = false;

    /* renamed from: d, reason: collision with root package name */
    static boolean f13537d = false;

    /* renamed from: e, reason: collision with root package name */
    static String f13538e = null;

    /* renamed from: f, reason: collision with root package name */
    static String f13539f = null;

    /* renamed from: g, reason: collision with root package name */
    static Messenger f13540g = null;

    /* renamed from: h, reason: collision with root package name */
    static SdkConfiguration f13541h = null;

    /* renamed from: i, reason: collision with root package name */
    static int f13542i = -1;

    /* renamed from: j, reason: collision with root package name */
    static String f13543j;

    /* renamed from: l, reason: collision with root package name */
    private static BoundService f13544l;

    /* renamed from: k, reason: collision with root package name */
    final Messenger f13545k = new Messenger(new ae(this));

    public static BoundService a() {
        return f13544l;
    }

    public static lg b(PackageManager packageManager) {
        String str = f13534a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        lg lgVar = new lg();
        try {
            lgVar.f25143c = packageManager.getApplicationIcon(str);
            lgVar.f25142b = f13535b;
            lgVar.f25141a = f13534a;
            lgVar.f25144d = f13536c;
            lgVar.f25145e = f13537d;
            lgVar.f25146f = f13538e;
            lgVar.f25147g = f13539f;
            lgVar.f25148h = f13542i == -1;
            return lgVar;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final byte[] c(String str) {
        String str2;
        if (f13542i < 0 || (str2 = f13543j) == null || str == null) {
            return null;
        }
        return lh.b(str, str2);
    }

    public static final void d(int i2, SdkConfiguration sdkConfiguration) {
        f13542i = i2;
        f13541h = sdkConfiguration;
    }

    public static final void e() {
        if (f13540g != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("AGREEMENT", c(Boolean.toString(true)));
            Message messageObtain = Message.obtain((Handler) null, 7);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void f(int i2, String str) throws RemoteException {
        if (p() && SdkConfiguration.shouldSendTurnsAndEta(f13541h.Scopes[f13542i])) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("DISTANCE_METERS", c(Integer.toString(i2)));
            bundle.putByteArray("DISTANCE_DISPLAY", c(str));
            Message messageObtain = Message.obtain((Handler) null, 1);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void g(int i2) throws RemoteException {
        if (p() && SdkConfiguration.shouldSendTurnsAndEta(f13541h.Scopes[f13542i])) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("ETA_DISTANCE", c(Integer.toString(i2)));
            Message messageObtain = Message.obtain((Handler) null, 11);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void h(int i2) throws RemoteException {
        if (p() && SdkConfiguration.shouldSendTurnsAndEta(f13541h.Scopes[f13542i])) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("ETA_MINUTES", c(Integer.toString(i2)));
            Message messageObtain = Message.obtain((Handler) null, 2);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void i(int i2) throws RemoteException {
        if (p() && SdkConfiguration.shouldSendTurnsAndEta(f13541h.Scopes[f13542i])) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("INSTRUCTION_EXIT", c(Integer.toString(i2)));
            Message messageObtain = Message.obtain((Handler) null, 6);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void j(boolean z) throws RemoteException {
        if (p() && SdkConfiguration.shouldSendTurnsAndEta(f13541h.Scopes[f13542i])) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("LEFT_LANE", c(Boolean.toString(z)));
            Message messageObtain = Message.obtain((Handler) null, 10);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void k(boolean z) {
        if (p() && SdkConfiguration.shouldSendTurnsAndEta(f13541h.Scopes[f13542i])) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("IS_NAVIGATING", c(Boolean.toString(z)));
            Message messageObtain = Message.obtain((Handler) null, 12);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void l(int i2) throws RemoteException {
        if (p() && SdkConfiguration.shouldSendTurnsAndEta(f13541h.Scopes[f13542i])) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("INSTRUCTION", c(Integer.toString(i2)));
            Message messageObtain = Message.obtain((Handler) null, 3);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void m(String str) throws RemoteException {
        if (p() && SdkConfiguration.shouldSendFullRouteGeometry(f13541h.Scopes[f13542i])) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("GeoJson", c(str));
            Message messageObtain = Message.obtain((Handler) null, 0);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void n() {
        if (f13540g != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("CONNECTION", c(Boolean.toString(false)));
            Message messageObtain = Message.obtain((Handler) null, 9);
            messageObtain.setData(bundle);
            try {
                f13540g.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void o(String str) {
        String str2 = f13534a;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        n();
        f13534a = null;
        d(-1, null);
    }

    private static final boolean p() {
        return (ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_TRANSPORTATION_DISABLE_DATA_BACK) || f13540g == null || f13541h == null || f13542i < 0) ? false : true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Log.v("BoundService", "in onBind");
        return this.f13545k.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("BoundService", "in onCreate");
        f13544l = this;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Log.v("BoundService", "in onDestroy");
        if (f13534a != null) {
            com.waze.sdk.bd.d();
            com.waze.sdk.bi.d().n(f13534a);
        }
        f13544l = null;
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        Log.v("BoundService", "in onRebind");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        Log.v("BoundService", "in onUnbind");
        return true;
    }
}
