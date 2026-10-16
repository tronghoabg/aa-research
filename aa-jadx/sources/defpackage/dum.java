package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dum implements android.os.Handler.Callback, android.content.ServiceConnection {
    public final android.os.Handler a;
    private final android.content.Context b;
    private final android.os.HandlerThread c;
    private final java.util.Map d = new java.util.HashMap();
    private java.util.Set e = new java.util.HashSet();

    public dum(android.content.Context context) {
        this.b = context;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new android.os.Handler(handlerThread.getLooper(), this);
    }

    private final void a(defpackage.dul dulVar) {
        if (dulVar.b) {
            this.b.unbindService(this);
            dulVar.b = false;
        }
        dulVar.e = null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076 A[LOOP:0: B:19:0x0076->B:28:0x00c3, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:24:0x0086 A[Catch: RemoteException -> 0x00d7, DeadObjectException -> 0x00eb, TryCatch #3 {DeadObjectException -> 0x00eb, RemoteException -> 0x00d7, blocks: (B:22:0x0080, B:24:0x0086, B:25:0x009a, B:28:0x00c3, B:33:0x00d3, B:34:0x00d6), top: B:48:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c3 A[Catch: RemoteException -> 0x00d7, DeadObjectException -> 0x00eb, LOOP:0: B:19:0x0076->B:28:0x00c3, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #3 {DeadObjectException -> 0x00eb, RemoteException -> 0x00d7, blocks: (B:22:0x0080, B:24:0x0086, B:25:0x009a, B:28:0x00c3, B:33:0x00d3, B:34:0x00d6), top: B:48:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0103 A[EDGE_INSN: B:50:0x0103->B:40:0x0103 BREAK  A[LOOP:0: B:19:0x0076->B:28:0x00c3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0086, please report this as an issue */
    private final void b(defpackage.dul dulVar) {
        defpackage.duk dukVar;
        defpackage.dsw dswVar;
        android.os.Parcel parcelObtain;
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            android.util.Log.d("NotifManCompat", "Processing component " + dulVar.a + ", " + dulVar.c.size() + " queued tasks");
        }
        java.util.ArrayDeque arrayDeque = dulVar.c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (!dulVar.b) {
            android.content.Intent intent = new android.content.Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
            android.content.ComponentName componentName = dulVar.a;
            android.content.Intent component = intent.setComponent(componentName);
            android.content.Context context = this.b;
            boolean zBindService = context.bindService(component, this, 33);
            dulVar.b = zBindService;
            if (zBindService) {
                dulVar.d = 0;
            } else {
                java.util.Objects.toString(componentName);
                android.util.Log.w("NotifManCompat", "Unable to bind to listener ".concat(java.lang.String.valueOf(componentName)));
                context.unbindService(this);
            }
            if (dulVar.b) {
                if (dulVar.e != null) {
                    while (true) {
                        dukVar = (defpackage.duk) arrayDeque.peek();
                        if (dukVar == null) {
                            break;
                            break;
                        }
                        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                            android.util.Log.d("NotifManCompat", "Sending task " + dukVar);
                        }
                        dswVar = dulVar.e;
                        android.app.Notification notification = dukVar.d;
                        java.lang.String str = dukVar.c;
                        int i = dukVar.b;
                        java.lang.String str2 = dukVar.a;
                        parcelObtain = android.os.Parcel.obtain();
                        parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                        parcelObtain.writeString(str2);
                        parcelObtain.writeInt(i);
                        parcelObtain.writeString(str);
                        parcelObtain.writeTypedObject(notification, 0);
                        if (dswVar.a.transact(1, parcelObtain, null, 1)) {
                            throw new android.os.RemoteException("Method notify is unimplemented.");
                        }
                        parcelObtain.recycle();
                        arrayDeque.remove();
                    }
                    if (dulVar.c.isEmpty()) {
                        return;
                    }
                    c(dulVar);
                    return;
                }
            }
        } else if (dulVar.e != null) {
            while (true) {
                dukVar = (defpackage.duk) arrayDeque.peek();
                if (dukVar == null) {
                    break;
                }
                try {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        android.util.Log.d("NotifManCompat", "Sending task " + dukVar);
                    }
                    dswVar = dulVar.e;
                    android.app.Notification notification2 = dukVar.d;
                    java.lang.String str3 = dukVar.c;
                    int i2 = dukVar.b;
                    java.lang.String str4 = dukVar.a;
                    parcelObtain = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                        parcelObtain.writeString(str4);
                        parcelObtain.writeInt(i2);
                        parcelObtain.writeString(str3);
                        parcelObtain.writeTypedObject(notification2, 0);
                        if (dswVar.a.transact(1, parcelObtain, null, 1)) {
                            throw new android.os.RemoteException("Method notify is unimplemented.");
                        }
                        parcelObtain.recycle();
                        arrayDeque.remove();
                    } catch (java.lang.Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (android.os.DeadObjectException unused) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        android.content.ComponentName componentName2 = dulVar.a;
                        java.util.Objects.toString(componentName2);
                        android.util.Log.d("NotifManCompat", "Remote service has died: ".concat(java.lang.String.valueOf(componentName2)));
                    }
                } catch (android.os.RemoteException e) {
                    android.content.ComponentName componentName3 = dulVar.a;
                    java.util.Objects.toString(componentName3);
                    android.util.Log.w("NotifManCompat", "RemoteException communicating with ".concat(java.lang.String.valueOf(componentName3)), e);
                }
            }
            if (dulVar.c.isEmpty()) {
                c(dulVar);
                return;
            }
            return;
        }
        c(dulVar);
    }

    private final void c(defpackage.dul dulVar) {
        android.content.ComponentName componentName = dulVar.a;
        android.os.Handler handler = this.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = dulVar.d;
        int i2 = i + 1;
        dulVar.d = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                android.util.Log.d("NotifManCompat", defpackage.a.bm(i3, "Scheduling retry for ", " ms"));
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Giving up on delivering ");
        java.util.ArrayDeque arrayDeque = dulVar.c;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(dulVar.d);
        sb.append(" retries");
        android.util.Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [android.os.IBinder, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        java.util.Set set;
        defpackage.dsw dswVar;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    defpackage.dul dulVar = (defpackage.dul) this.d.get((android.content.ComponentName) message.obj);
                    if (dulVar != null) {
                        a(dulVar);
                    }
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                defpackage.dul dulVar2 = (defpackage.dul) this.d.get((android.content.ComponentName) message.obj);
                if (dulVar2 != null) {
                    b(dulVar2);
                }
                return true;
            }
            defpackage.se seVar = (defpackage.se) message.obj;
            java.lang.Object obj = seVar.b;
            ?? r11 = seVar.a;
            defpackage.dul dulVar3 = (defpackage.dul) this.d.get(obj);
            if (dulVar3 != null) {
                if (r11 == 0) {
                    dswVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = r11.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    dswVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof defpackage.dsw)) ? new defpackage.dsw(r11) : (defpackage.dsw) iInterfaceQueryLocalInterface;
                }
                dulVar3.e = dswVar;
                dulVar3.d = 0;
                b(dulVar3);
            }
            return true;
        }
        defpackage.duk dukVar = (defpackage.duk) message.obj;
        android.content.Context context = this.b;
        java.lang.Object obj2 = defpackage.dun.a;
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (defpackage.dun.a) {
            if (string != null) {
                if (!string.equals(defpackage.dun.b)) {
                    java.lang.String[] strArrSplit = string.split(":", -1);
                    java.util.HashSet hashSet = new java.util.HashSet(strArrSplit.length);
                    for (java.lang.String str : strArrSplit) {
                        android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    defpackage.dun.c = hashSet;
                    defpackage.dun.b = string;
                }
                set = defpackage.dun.c;
            } else {
                set = defpackage.dun.c;
            }
            throw th;
        }
        if (!set.equals(this.e)) {
            this.e = set;
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = this.b.getPackageManager().queryIntentServices(new android.content.Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            java.util.HashSet<android.content.ComponentName> hashSet2 = new java.util.HashSet();
            for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentServices) {
                if (set.contains(resolveInfo.serviceInfo.packageName)) {
                    android.content.ComponentName componentName = new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        android.util.Log.w("NotifManCompat", defpackage.a.bl(componentName, "Permission present on component ", ", not adding listener record."));
                    } else {
                        hashSet2.add(componentName);
                    }
                }
            }
            for (android.content.ComponentName componentName2 : hashSet2) {
                java.util.Map map = this.d;
                if (!map.containsKey(componentName2)) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        java.util.Objects.toString(componentName2);
                        android.util.Log.d("NotifManCompat", "Adding listener record for ".concat(java.lang.String.valueOf(componentName2)));
                    }
                    map.put(componentName2, new defpackage.dul(componentName2));
                }
            }
            java.util.Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        java.lang.Object key = entry.getKey();
                        java.util.Objects.toString(key);
                        android.util.Log.d("NotifManCompat", "Removing listener record for ".concat(java.lang.String.valueOf(key)));
                    }
                    a((defpackage.dul) entry.getValue());
                    it.remove();
                }
            }
        }
        for (defpackage.dul dulVar4 : this.d.values()) {
            dulVar4.c.add(dukVar);
            b(dulVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            java.util.Objects.toString(componentName);
            android.util.Log.d("NotifManCompat", "Connected to service ".concat(java.lang.String.valueOf(componentName)));
        }
        this.a.obtainMessage(1, new defpackage.se(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            java.util.Objects.toString(componentName);
            android.util.Log.d("NotifManCompat", "Disconnected from service ".concat(java.lang.String.valueOf(componentName)));
        }
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
