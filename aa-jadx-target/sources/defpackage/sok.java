package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class sok {
    private static final com.google.android.gms.common.Feature[] a = new com.google.android.gms.common.Feature[0];
    public final android.content.Context b;
    final android.os.Handler c;
    protected defpackage.sof f;
    public final int i;
    public volatile java.lang.String j;
    public volatile defpackage.sqw k;
    public defpackage.sph q;
    defpackage.xzd r;
    public final defpackage.wyz s;
    public final defpackage.wyz t;
    private final defpackage.sox v;
    private android.os.IInterface w;
    private defpackage.sog x;
    private final java.lang.String y;
    private volatile java.lang.String u = null;
    public final java.lang.Object d = new java.lang.Object();
    public final java.lang.Object e = new java.lang.Object();
    public final java.util.ArrayList g = new java.util.ArrayList();
    public int h = 1;
    public com.google.android.gms.common.ConnectionResult l = null;
    public boolean m = false;
    public volatile com.google.android.gms.common.internal.ConnectionInfo n = null;
    protected final java.util.concurrent.atomic.AtomicInteger o = new java.util.concurrent.atomic.AtomicInteger(0);
    public volatile int p = -1;

    protected sok(android.content.Context context, android.os.Looper looper, defpackage.sox soxVar, defpackage.sks sksVar, int i, defpackage.wyz wyzVar, defpackage.wyz wyzVar2, java.lang.String str) {
        if (context == null) {
            throw new java.lang.NullPointerException("Context must not be null");
        }
        this.b = context;
        if (looper == null) {
            throw new java.lang.NullPointerException("Looper must not be null");
        }
        if (soxVar == null) {
            throw new java.lang.NullPointerException("Supervisor must not be null");
        }
        this.v = soxVar;
        if (sksVar == null) {
            throw new java.lang.NullPointerException("API availability must not be null");
        }
        this.c = new defpackage.sod(this, looper);
        this.i = i;
        this.t = wyzVar;
        this.s = wyzVar2;
        this.y = str;
    }

    protected final void A(int i, android.os.Bundle bundle, int i2) {
        defpackage.soj sojVar = new defpackage.soj(this, i, bundle);
        android.os.Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, sojVar));
    }

    public final boolean B() {
        return this.n != null;
    }

    public boolean C() {
        return true;
    }

    public com.google.android.gms.common.Feature[] D() {
        throw null;
    }

    protected void E() {
        java.lang.System.currentTimeMillis();
    }

    public final boolean F(int i, int i2, android.os.IInterface iInterface) {
        synchronized (this.d) {
            if (this.h != i) {
                return false;
            }
            G(i2, iInterface);
            return true;
        }
    }

    public final void G(int i, android.os.IInterface iInterface) {
        defpackage.xzd xzdVar;
        if ((i == 4) != (iInterface != null)) {
            throw new java.lang.IllegalArgumentException();
        }
        synchronized (this.d) {
            this.h = i;
            this.w = iInterface;
            android.os.Bundle bundle = null;
            if (i == 1) {
                defpackage.sog sogVar = this.x;
                if (sogVar != null) {
                    defpackage.sox soxVar = this.v;
                    defpackage.xzd xzdVar2 = this.r;
                    java.lang.Object obj = xzdVar2.d;
                    java.lang.Object obj2 = xzdVar2.c;
                    int i2 = xzdVar2.b;
                    w();
                    soxVar.e(new defpackage.sow((java.lang.String) obj, i2, this.r.a), sogVar);
                    this.x = null;
                }
            } else if (i == 2 || i == 3) {
                defpackage.sog sogVar2 = this.x;
                if (sogVar2 != null && (xzdVar = this.r) != null) {
                    android.util.Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((java.lang.String) xzdVar.d) + " on " + ((java.lang.String) xzdVar.c));
                    defpackage.sox soxVar2 = this.v;
                    defpackage.xzd xzdVar3 = this.r;
                    java.lang.Object obj3 = xzdVar3.d;
                    java.lang.Object obj4 = xzdVar3.c;
                    int i3 = xzdVar3.b;
                    w();
                    soxVar2.e(new defpackage.sow((java.lang.String) obj3, i3, this.r.a), sogVar2);
                    this.o.incrementAndGet();
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger = this.o;
                defpackage.sog sogVar3 = new defpackage.sog(this, atomicInteger.get());
                this.x = sogVar3;
                defpackage.xzd xzdVar4 = new defpackage.xzd(d(), j(), e());
                this.r = xzdVar4;
                if (xzdVar4.a && a() < 17895000) {
                    throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat((java.lang.String) xzdVar4.d));
                }
                defpackage.sox soxVar3 = this.v;
                java.lang.Object obj5 = xzdVar4.d;
                java.lang.Object obj6 = xzdVar4.c;
                com.google.android.gms.common.ConnectionResult connectionResultD = soxVar3.d(new defpackage.sow((java.lang.String) obj5, xzdVar4.b, this.r.a), sogVar3, w(), x());
                if (!connectionResultD.c()) {
                    defpackage.xzd xzdVar5 = this.r;
                    android.util.Log.w("GmsClient", "unable to connect to service: " + ((java.lang.String) xzdVar5.d) + " on " + ((java.lang.String) xzdVar5.c));
                    int i4 = connectionResultD.c;
                    if (i4 == -1) {
                        i4 = 16;
                    }
                    android.app.PendingIntent pendingIntent = connectionResultD.d;
                    if (pendingIntent != null) {
                        bundle = new android.os.Bundle();
                        bundle.putParcelable("pendingIntent", pendingIntent);
                    }
                    A(i4, bundle, atomicInteger.get());
                }
            } else if (i == 4) {
                if (iInterface == null) {
                    throw new java.lang.NullPointerException("null reference");
                }
                java.lang.System.currentTimeMillis();
            }
        }
    }

    public int a() {
        throw null;
    }

    protected abstract android.os.IInterface b(android.os.IBinder iBinder);

    protected abstract java.lang.String c();

    protected abstract java.lang.String d();

    protected boolean e() {
        return a() >= 211700000;
    }

    public boolean f() {
        return false;
    }

    public com.google.android.gms.common.Feature[] g() {
        return a;
    }

    protected android.os.Bundle h() {
        return new android.os.Bundle();
    }

    public boolean i() {
        return false;
    }

    protected int j() {
        return 4225;
    }

    public final java.lang.String k() {
        defpackage.xzd xzdVar;
        if (!p() || (xzdVar = this.r) == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
        return (java.lang.String) xzdVar.c;
    }

    public final java.lang.String l() {
        return this.u;
    }

    public final void n(defpackage.sof sofVar) {
        this.f = sofVar;
        G(2, null);
    }

    public final void o(java.lang.String str) {
        this.u = str;
        y();
    }

    public final boolean p() {
        boolean z;
        synchronized (this.d) {
            z = this.h == 4;
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.d) {
            int i = this.h;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final com.google.android.gms.common.Feature[] r() {
        com.google.android.gms.common.internal.ConnectionInfo connectionInfo = this.n;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void s(spc spcVar, java.util.Set set) {
        android.content.AttributionSource attributionSource;
        android.os.Bundle bundleH = h();
        java.lang.String strM = (android.os.Build.VERSION.SDK_INT < 31 || this.k == null || (attributionSource = this.k.a) == null || a$.ExternalSyntheticApiModelOutline0.m(attributionSource) == null) ? this.j : a$.ExternalSyntheticApiModelOutline0.m(attributionSource);
        java.lang.String str = strM;
        int i = this.i;
        int i2 = defpackage.sks.c;
        com.google.android.gms.common.api.Scope[] scopeArr = com.google.android.gms.common.internal.GetServiceRequest.a;
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.common.Feature[] featureArr = com.google.android.gms.common.internal.GetServiceRequest.b;
        com.google.android.gms.common.internal.GetServiceRequest getServiceRequest = new com.google.android.gms.common.internal.GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f = this.b.getPackageName();
        getServiceRequest.i = bundleH;
        if (set != null) {
            getServiceRequest.h = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (i()) {
            android.accounts.Account accountU = u();
            if (accountU == null) {
                accountU = new android.accounts.Account("<<default account>>", "com.google");
            }
            getServiceRequest.j = accountU;
            if (spcVar != null) {
                getServiceRequest.g = spcVar.asBinder();
            }
        }
        getServiceRequest.k = D();
        getServiceRequest.l = g();
        if (f()) {
            getServiceRequest.o = true;
        }
        try {
            synchronized (this.e) {
                defpackage.sph sphVar = this.q;
                if (sphVar != null) {
                    defpackage.spg spgVar = new defpackage.spg(this, this.o.get());
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        parcelObtain.writeStrongBinder(spgVar);
                        parcelObtain.writeInt(1);
                        defpackage.smf.a(getServiceRequest, parcelObtain, 0);
                        sphVar.a.transact(46, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (java.lang.Throwable th) {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } else {
                    android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (android.os.DeadObjectException e) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            android.os.Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(6, this.o.get(), 3));
        } catch (android.os.RemoteException e2) {
            e = e2;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.o.get());
        } catch (java.lang.SecurityException e3) {
            throw e3;
        } catch (java.lang.RuntimeException e4) {
            e = e4;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.o.get());
        }
    }

    public final void t(defpackage.xei xeiVar) {
        ((defpackage.snb) xeiVar.a).l.q.post(new defpackage.sho(xeiVar, 11, null));
    }

    public android.accounts.Account u() {
        throw null;
    }

    public final android.os.IInterface v() throws android.os.DeadObjectException {
        android.os.IInterface iInterface;
        synchronized (this.d) {
            if (this.h == 5) {
                throw new android.os.DeadObjectException();
            }
            if (!p()) {
                throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.w;
            if (iInterface == null) {
                throw new java.lang.NullPointerException("Client is connected but service is null");
            }
        }
        return iInterface;
    }

    protected final java.lang.String w() {
        java.lang.String str = this.y;
        return str == null ? this.b.getClass().getName() : str;
    }

    protected java.util.concurrent.Executor x() {
        throw null;
    }

    public void y() {
        this.o.incrementAndGet();
        java.util.ArrayList arrayList = this.g;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.soe) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.e) {
            this.q = null;
        }
        G(1, null);
    }

    protected final void z(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        defpackage.soi soiVar = new defpackage.soi(this, i, iBinder, bundle);
        android.os.Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, soiVar));
    }
}
