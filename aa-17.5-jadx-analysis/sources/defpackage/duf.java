package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
final class duf implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public duf(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(due dueVar) {
        if (dueVar.b) {
            this.b.unbindService(this);
            dueVar.b = false;
        }
        dueVar.e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        throw new android.os.RemoteException("Method notify is unimplemented.");
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(defpackage.due r12) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duf.b(due):void");
    }

    private final void c(due dueVar) {
        ComponentName componentName = dueVar.a;
        Handler handler = this.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = dueVar.d;
        int i2 = i + 1;
        dueVar.d = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", a.bn(i3, "Scheduling retry for ", " ms"));
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = dueVar.c;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(dueVar.d);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [android.os.IBinder, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Set set;
        dsp dspVar;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    due dueVar = (due) this.d.get((ComponentName) message.obj);
                    if (dueVar != null) {
                        a(dueVar);
                    }
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                due dueVar2 = (due) this.d.get((ComponentName) message.obj);
                if (dueVar2 != null) {
                    b(dueVar2);
                }
                return true;
            }
            rz rzVar = (rz) message.obj;
            Object obj = rzVar.b;
            ?? r11 = rzVar.a;
            due dueVar3 = (due) this.d.get(obj);
            if (dueVar3 != null) {
                if (r11 == 0) {
                    dspVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = r11.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    dspVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dsp)) ? new dsp(r11) : (dsp) iInterfaceQueryLocalInterface;
                }
                dueVar3.e = dspVar;
                dueVar3.d = 0;
                b(dueVar3);
            }
            return true;
        }
        dud dudVar = (dud) message.obj;
        Context context = this.b;
        Object obj2 = dug.a;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (dug.a) {
            if (string != null) {
                if (!string.equals(dug.b)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    dug.c = hashSet;
                    dug.b = string;
                }
                set = dug.c;
            } else {
                set = dug.c;
            }
        }
        if (!set.equals(this.e)) {
            this.e = set;
            List<ResolveInfo> listQueryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (set.contains(resolveInfo.serviceInfo.packageName)) {
                    ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", a.bm(componentName, "Permission present on component ", ", not adding listener record."));
                    } else {
                        hashSet2.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet2) {
                Map map = this.d;
                if (!map.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName2);
                        Log.d("NotifManCompat", "Adding listener record for ".concat(String.valueOf(componentName2)));
                    }
                    map.put(componentName2, new due(componentName2));
                }
            }
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Object key = entry.getKey();
                        Objects.toString(key);
                        Log.d("NotifManCompat", "Removing listener record for ".concat(String.valueOf(key)));
                    }
                    a((due) entry.getValue());
                    it.remove();
                }
            }
        }
        for (due dueVar4 : this.d.values()) {
            dueVar4.c.add(dudVar);
            b(dueVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            Log.d("NotifManCompat", "Connected to service ".concat(String.valueOf(componentName)));
        }
        this.a.obtainMessage(1, new rz(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            Log.d("NotifManCompat", "Disconnected from service ".concat(String.valueOf(componentName)));
        }
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
