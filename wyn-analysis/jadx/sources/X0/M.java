package X0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.AbstractBinderC1534b;
import c.C1533a;
import c.InterfaceC1535c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public final class M implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15802a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f15803b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15804c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f15805d = new HashSet();

    public M(Context context) {
        this.f15802a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f15803b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(L l10) {
        boolean z2;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = l10.f15797a;
        if (zIsLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + l10.f15800d.size() + " queued tasks");
        }
        if (l10.f15800d.isEmpty()) {
            return;
        }
        if (l10.f15798b) {
            z2 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f15802a;
            boolean zBindService = context.bindService(component, this, 33);
            l10.f15798b = zBindService;
            if (zBindService) {
                l10.f15801e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z2 = l10.f15798b;
        }
        if (!z2 || l10.f15799c == null) {
            b(l10);
            return;
        }
        while (true) {
            arrayDeque = l10.f15800d;
            J j8 = (J) arrayDeque.peek();
            if (j8 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + j8);
                }
                j8.a(l10.f15799c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e7) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e7);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(l10);
    }

    public final void b(L l10) {
        Handler handler = this.f15803b;
        ComponentName componentName = l10.f15797a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i5 = l10.f15801e;
        int i10 = i5 + 1;
        l10.f15801e = i10;
        if (i10 <= 6) {
            int i11 = (1 << i5) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = l10.f15800d;
        sb2.append(arrayDeque.size());
        sb2.append(" tasks to ");
        sb2.append(componentName);
        sb2.append(" after ");
        sb2.append(l10.f15801e);
        sb2.append(" retries");
        Log.w("NotifManCompat", sb2.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i5 = message.what;
        InterfaceC1535c interfaceC1535c = null;
        if (i5 == 0) {
            J j8 = (J) message.obj;
            String string = Settings.Secure.getString(this.f15802a.getContentResolver(), "enabled_notification_listeners");
            synchronized (N.f15806c) {
                if (string != null) {
                    try {
                        if (!string.equals(N.f15807d)) {
                            String[] strArrSplit = string.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            N.f15808e = hashSet2;
                            N.f15807d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = N.f15808e;
            }
            if (!hashSet.equals(this.f15805d)) {
                this.f15805d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f15802a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f15804c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f15804c.put(componentName2, new L(componentName2));
                    }
                }
                Iterator it2 = this.f15804c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        L l10 = (L) entry.getValue();
                        if (l10.f15798b) {
                            this.f15802a.unbindService(this);
                            l10.f15798b = false;
                        }
                        l10.f15799c = null;
                        it2.remove();
                    }
                }
            }
            for (L l11 : this.f15804c.values()) {
                l11.f15800d.add(j8);
                a(l11);
            }
        } else if (i5 == 1) {
            K k = (K) message.obj;
            ComponentName componentName3 = k.f15795a;
            IBinder iBinder = k.f15796b;
            L l12 = (L) this.f15804c.get(componentName3);
            if (l12 != null) {
                int i10 = AbstractBinderC1534b.f19485a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1535c.f19486V8);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1535c)) {
                        C1533a c1533a = new C1533a();
                        c1533a.f19484a = iBinder;
                        interfaceC1535c = c1533a;
                    } else {
                        interfaceC1535c = (InterfaceC1535c) iInterfaceQueryLocalInterface;
                    }
                }
                l12.f15799c = interfaceC1535c;
                l12.f15801e = 0;
                a(l12);
                return true;
            }
        } else if (i5 == 2) {
            L l13 = (L) this.f15804c.get((ComponentName) message.obj);
            if (l13 != null) {
                if (l13.f15798b) {
                    this.f15802a.unbindService(this);
                    l13.f15798b = false;
                }
                l13.f15799c = null;
                return true;
            }
        } else {
            if (i5 != 3) {
                return false;
            }
            L l14 = (L) this.f15804c.get((ComponentName) message.obj);
            if (l14 != null) {
                a(l14);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f15803b.obtainMessage(1, new K(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f15803b.obtainMessage(2, componentName).sendToTarget();
    }
}
