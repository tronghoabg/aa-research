package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class spa implements android.content.ServiceConnection, defpackage.spb {
    public final java.util.Map a = new java.util.HashMap();
    public int b = 2;
    public boolean c;
    public android.os.IBinder d;
    public final defpackage.sow e;
    public android.content.ComponentName f;
    public final /* synthetic */ defpackage.sox g;

    public spa(defpackage.sox soxVar, defpackage.sow sowVar) {
        this.g = soxVar;
        this.e = sowVar;
    }

    public final com.google.android.gms.common.ConnectionResult a(java.lang.String str, java.util.concurrent.Executor executor) {
        android.content.Intent component;
        android.os.Bundle bundleCall;
        com.google.android.gms.common.ConnectionResult connectionResult;
        try {
            android.content.Context context = this.g.c;
            defpackage.sow sowVar = this.e;
            android.net.Uri uri = defpackage.spo.a;
            java.lang.String str2 = sowVar.a;
            if (str2 == null) {
                component = new android.content.Intent().setComponent(sowVar.c);
            } else {
                android.content.Intent intent = null;
                if (sowVar.e) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("serviceActionBundleKey", str2);
                    try {
                        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(defpackage.spo.a);
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new android.os.RemoteException("Failed to acquire ContentProviderClient");
                        }
                        try {
                            bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            if (bundleCall != null) {
                                android.content.Intent intent2 = (android.content.Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                                if (intent2 != null) {
                                    intent = intent2;
                                } else {
                                    android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                                    if (pendingIntent != null) {
                                        android.util.Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str2 + " but has possible resolution");
                                        throw new defpackage.spm(new com.google.android.gms.common.ConnectionResult(1, 25, pendingIntent, null, null));
                                    }
                                }
                            }
                            if (intent == null) {
                                android.util.Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str2));
                            }
                        } catch (java.lang.Throwable th) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            throw th;
                        }
                    } catch (android.os.RemoteException | java.lang.IllegalArgumentException e) {
                        android.util.Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                        bundleCall = null;
                    }
                }
                component = intent;
                if (component == null) {
                    component = new android.content.Intent(str2).setPackage(sowVar.b);
                }
            }
            android.content.Intent intent3 = component;
            this.b = 3;
            android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
            if (defpackage.sqs.f()) {
                android.os.StrictMode.setVmPolicy(defpackage.sqs.c(new android.os.StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                defpackage.sox soxVar = this.g;
                defpackage.sqf sqfVar = soxVar.e;
                android.content.Context context2 = soxVar.c;
                defpackage.sow sowVar2 = this.e;
                boolean zE = sqfVar.e(context2, str, intent3, this, sowVar2.d, true, executor);
                this.c = zE;
                if (zE) {
                    soxVar.d.sendMessageDelayed(soxVar.d.obtainMessage(1, sowVar2), soxVar.f);
                    connectionResult = com.google.android.gms.common.ConnectionResult.a;
                } else {
                    this.b = 2;
                    try {
                        sqfVar.b(context2, this);
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                    connectionResult = new com.google.android.gms.common.ConnectionResult(1, 16, null, null, null);
                }
                return connectionResult;
            } finally {
                android.os.StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (defpackage.spm e2) {
            return e2.a;
        }
    }

    public final boolean b(android.content.ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final void d(android.content.ServiceConnection serviceConnection, android.content.ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, new defpackage.soz(serviceConnection2));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.sox soxVar = this.g;
        synchronized (soxVar.b) {
            soxVar.d.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            java.util.Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((android.content.ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        defpackage.sox soxVar = this.g;
        synchronized (soxVar.b) {
            soxVar.d.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            java.util.Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((android.content.ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
