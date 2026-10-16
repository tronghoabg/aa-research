package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class sof implements ServiceConnection, sog {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final sob e;
    public ComponentName f;
    public final /* synthetic */ soc g;

    public sof(soc socVar, sob sobVar) {
        this.g = socVar;
        this.e = sobVar;
    }

    public final ConnectionResult a(String str, Executor executor) throws sor, RemoteException {
        Intent component;
        Bundle bundleCall;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        ConnectionResult connectionResult;
        try {
            Context context = this.g.c;
            sob sobVar = this.e;
            Uri uri = sot.a;
            String str2 = sobVar.a;
            if (str2 == null) {
                component = new Intent().setComponent(sobVar.c);
            } else {
                Intent intent = null;
                if (sobVar.e) {
                    Bundle bundle = new Bundle();
                    bundle.putString("serviceActionBundleKey", str2);
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(sot.a);
                    } catch (RemoteException | IllegalArgumentException e) {
                        Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                        bundleCall = null;
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new RemoteException("Failed to acquire ContentProviderClient");
                    }
                    try {
                        bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        if (bundleCall != null) {
                            Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                            if (intent2 != null) {
                                intent = intent2;
                            } else {
                                PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                                if (pendingIntent != null) {
                                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str2 + " but has possible resolution");
                                    throw new sor(new ConnectionResult(1, 25, pendingIntent, null, null));
                                }
                            }
                        }
                        if (intent == null) {
                            Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str2));
                        }
                    } catch (Throwable th) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th;
                    }
                }
                component = intent;
                if (component == null) {
                    component = new Intent(str2).setPackage(sobVar.b);
                }
            }
            Intent intent3 = component;
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (spu.d()) {
                StrictMode.setVmPolicy(spu.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                soc socVar = this.g;
                spi spiVar = socVar.e;
                Context context2 = socVar.c;
                sob sobVar2 = this.e;
                boolean zE = spiVar.e(context2, str, intent3, this, sobVar2.d, true, executor);
                this.c = zE;
                if (zE) {
                    socVar.d.sendMessageDelayed(socVar.d.obtainMessage(1, sobVar2), socVar.f);
                    connectionResult = ConnectionResult.a;
                } else {
                    this.b = 2;
                    try {
                        spiVar.b(context2, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    connectionResult = new ConnectionResult(1, 16, null, null, null);
                }
                return connectionResult;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (sor e2) {
            return e2.a;
        }
    }

    public final boolean b(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, new soe(serviceConnection2));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        soc socVar = this.g;
        synchronized (socVar.b) {
            socVar.d.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        soc socVar = this.g;
        synchronized (socVar.b) {
            socVar.d.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
