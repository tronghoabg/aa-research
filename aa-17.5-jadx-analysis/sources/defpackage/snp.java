package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class snp {
    private static final Feature[] a = new Feature[0];
    public final Context b;
    final Handler c;
    protected snk f;
    public final int i;
    public volatile String j;
    public volatile spy k;
    public som q;
    xxx r;
    public final wyd s;
    public final wyd t;
    private final soc v;
    private IInterface w;
    private snl x;
    private final String y;
    private volatile String u = null;
    public final Object d = new Object();
    public final Object e = new Object();
    public final ArrayList g = new ArrayList();
    public int h = 1;
    public ConnectionResult l = null;
    public boolean m = false;
    public volatile ConnectionInfo n = null;
    protected final AtomicInteger o = new AtomicInteger(0);
    public volatile int p = -1;

    protected snp(Context context, Looper looper, soc socVar, sjw sjwVar, int i, wyd wydVar, wyd wydVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.b = context;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        if (socVar == null) {
            throw new NullPointerException("Supervisor must not be null");
        }
        this.v = socVar;
        if (sjwVar == null) {
            throw new NullPointerException("API availability must not be null");
        }
        this.c = new sni(this, looper);
        this.i = i;
        this.t = wydVar;
        this.s = wydVar2;
        this.y = str;
    }

    protected final void A(int i, Bundle bundle, int i2) {
        sno snoVar = new sno(this, i, bundle);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, snoVar));
    }

    public final boolean B() {
        return this.n != null;
    }

    public boolean C() {
        return true;
    }

    public Feature[] D() {
        throw null;
    }

    protected void E() {
        System.currentTimeMillis();
    }

    public final boolean F(int i, int i2, IInterface iInterface) {
        synchronized (this.d) {
            if (this.h != i) {
                return false;
            }
            G(i2, iInterface);
            return true;
        }
    }

    public final void G(int i, IInterface iInterface) {
        xxx xxxVar;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.d) {
            this.h = i;
            this.w = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                snl snlVar = this.x;
                if (snlVar != null) {
                    soc socVar = this.v;
                    xxx xxxVar2 = this.r;
                    Object obj = xxxVar2.d;
                    Object obj2 = xxxVar2.c;
                    int i2 = xxxVar2.b;
                    w();
                    socVar.e(new sob((String) obj, i2, this.r.a), snlVar);
                    this.x = null;
                }
            } else if (i == 2 || i == 3) {
                snl snlVar2 = this.x;
                if (snlVar2 != null && (xxxVar = this.r) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) xxxVar.d) + " on " + ((String) xxxVar.c));
                    soc socVar2 = this.v;
                    xxx xxxVar3 = this.r;
                    Object obj3 = xxxVar3.d;
                    Object obj4 = xxxVar3.c;
                    int i3 = xxxVar3.b;
                    w();
                    socVar2.e(new sob((String) obj3, i3, this.r.a), snlVar2);
                    this.o.incrementAndGet();
                }
                AtomicInteger atomicInteger = this.o;
                snl snlVar3 = new snl(this, atomicInteger.get());
                this.x = snlVar3;
                xxx xxxVar4 = new xxx(d(), j(), e());
                this.r = xxxVar4;
                if (xxxVar4.a && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat((String) xxxVar4.d));
                }
                soc socVar3 = this.v;
                Object obj5 = xxxVar4.d;
                Object obj6 = xxxVar4.c;
                ConnectionResult connectionResultD = socVar3.d(new sob((String) obj5, xxxVar4.b, this.r.a), snlVar3, w(), x());
                if (!connectionResultD.c()) {
                    xxx xxxVar5 = this.r;
                    Log.w("GmsClient", "unable to connect to service: " + ((String) xxxVar5.d) + " on " + ((String) xxxVar5.c));
                    int i4 = connectionResultD.c;
                    if (i4 == -1) {
                        i4 = 16;
                    }
                    PendingIntent pendingIntent = connectionResultD.d;
                    if (pendingIntent != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", pendingIntent);
                    }
                    A(i4, bundle, atomicInteger.get());
                }
            } else if (i == 4) {
                if (iInterface == null) {
                    throw new NullPointerException("null reference");
                }
                System.currentTimeMillis();
            }
        }
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    protected boolean e() {
        return a() >= 211700000;
    }

    public boolean f() {
        return false;
    }

    public Feature[] g() {
        return a;
    }

    protected Bundle h() {
        return new Bundle();
    }

    public boolean i() {
        return false;
    }

    protected int j() {
        return 4225;
    }

    public final String k() {
        xxx xxxVar;
        if (!p() || (xxxVar = this.r) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) xxxVar.c;
    }

    public final String l() {
        return this.u;
    }

    public final void n(snk snkVar) {
        this.f = snkVar;
        G(2, null);
    }

    public final void o(String str) {
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

    public final Feature[] r() {
        ConnectionInfo connectionInfo = this.n;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void s(soh sohVar, Set set) {
        AttributionSource attributionSource;
        Bundle bundleH = h();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.k == null || (attributionSource = this.k.a) == null || attributionSource.getAttributionTag() == null) ? this.j : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.i;
        int i2 = sjw.c;
        Scope[] scopeArr = GetServiceRequest.a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.b;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f = this.b.getPackageName();
        getServiceRequest.i = bundleH;
        if (set != null) {
            getServiceRequest.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (i()) {
            Account accountU = u();
            if (accountU == null) {
                accountU = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.j = accountU;
            if (sohVar != null) {
                getServiceRequest.g = sohVar.asBinder();
            }
        }
        getServiceRequest.k = D();
        getServiceRequest.l = g();
        if (f()) {
            getServiceRequest.o = true;
        }
        try {
            synchronized (this.e) {
                som somVar = this.q;
                if (somVar != null) {
                    sol solVar = new sol(this, this.o.get());
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        parcelObtain.writeStrongBinder(solVar);
                        parcelObtain.writeInt(1);
                        snf.a(getServiceRequest, parcelObtain, 0);
                        somVar.a.transact(46, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Throwable th) {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(6, this.o.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.o.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.o.get());
        }
    }

    public final void t(ykd ykdVar) {
        ((sme) ykdVar.a).k.o.post(new shd(ykdVar, 3, null));
    }

    public Account u() {
        throw null;
    }

    public final IInterface v() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.d) {
            if (this.h == 5) {
                throw new DeadObjectException();
            }
            if (!p()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.w;
            if (iInterface == null) {
                throw new NullPointerException("Client is connected but service is null");
            }
        }
        return iInterface;
    }

    protected final String w() {
        String str = this.y;
        return str == null ? this.b.getClass().getName() : str;
    }

    protected Executor x() {
        throw null;
    }

    public void y() {
        this.o.incrementAndGet();
        ArrayList arrayList = this.g;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((snj) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.e) {
            this.q = null;
        }
        G(1, null);
    }

    protected final void z(int i, IBinder iBinder, Bundle bundle, int i2) {
        snn snnVar = new snn(this, i, iBinder, bundle);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, snnVar));
    }
}
