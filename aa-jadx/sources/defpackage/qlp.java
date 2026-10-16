package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qlp {
    public static final java.lang.Object a = new java.lang.Object();
    public static volatile defpackage.qlp b;
    public defpackage.skn c;
    boolean d;
    public final java.lang.Object e = new java.lang.Object();
    public defpackage.qln f;
    public final long g;
    public defpackage.qlr h;
    private final android.content.Context i;

    public qlp(android.content.Context context) {
        defpackage.sqs.aA(context);
        this.i = context.getApplicationContext();
        this.d = false;
        this.g = 30000L;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static final void c(defpackage.qlo qloVar, long j, java.lang.Throwable th) {
        if (java.lang.Math.random() <= 0.0d) {
            java.util.HashMap map = new java.util.HashMap();
            java.lang.String str = com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE;
            map.put("app_context", com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE);
            if (qloVar != null) {
                if (true != qloVar.b) {
                    str = com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.DBG_VALUE;
                }
                map.put("limit_ad_tracking", str);
                java.lang.String str2 = qloVar.a;
                if (str2 != null) {
                    map.put("ad_id_size", java.lang.Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", java.lang.Long.toString(j));
            new defpackage.qlm(map).start();
        }
    }

    public final void a() {
        defpackage.sqs.au("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            android.content.Context context = this.i;
            if (context == null || this.c == null) {
                return;
            }
            try {
                if (this.d) {
                    defpackage.sqf.a().b(context, this.c);
                }
            } catch (java.lang.Throwable th) {
                android.util.Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.d = false;
            this.h = null;
            this.c = null;
        }
    }

    public final synchronized void b() throws java.io.IOException {
        if (!this.d) {
            try {
                android.util.Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                defpackage.sqs.au("Calling this from your main thread can lead to deadlock");
                synchronized (this) {
                    if (!this.d) {
                        android.content.Context context = this.i;
                        try {
                            context.getPackageManager().getPackageInfo("com.android.vending", 0);
                            int iL = defpackage.sks.d.l(context, 12451000);
                            if (iL != 0 && iL != 2) {
                                throw new java.io.IOException("Google Play services not available");
                            }
                            defpackage.skn sknVar = new defpackage.skn();
                            android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
                            intent.setPackage("com.google.android.gms");
                            try {
                                if (!defpackage.sqf.a().d(context, intent, sknVar, 1)) {
                                    throw new java.io.IOException("Connection failure");
                                }
                                this.c = sknVar;
                                try {
                                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                                    defpackage.sqs.au("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                                    if (sknVar.a) {
                                        throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
                                    }
                                    sknVar.a = true;
                                    android.os.IBinder iBinder = (android.os.IBinder) sknVar.b.poll(10000L, timeUnit);
                                    if (iBinder == null) {
                                        throw new java.util.concurrent.TimeoutException("Timed out waiting for the service connection");
                                    }
                                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                    this.h = iInterfaceQueryLocalInterface instanceof defpackage.qlr ? (defpackage.qlr) iInterfaceQueryLocalInterface : new defpackage.qlr(iBinder);
                                    this.d = true;
                                } catch (java.lang.InterruptedException unused) {
                                    throw new java.io.IOException("Interrupted exception");
                                } catch (java.lang.Throwable th) {
                                    throw new java.io.IOException(th);
                                }
                            } catch (java.lang.Throwable th2) {
                                throw new java.io.IOException(th2);
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                            throw new defpackage.slg(9);
                        }
                    }
                    android.util.Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.d) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
            } catch (java.lang.Exception e) {
                throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e);
            }
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        a();
        super.finalize();
    }
}
