package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.common.f[] f5053e = new com.google.android.gms.common.f[0];

    /* renamed from: a, reason: collision with root package name */
    an f5054a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f5055b;

    /* renamed from: c, reason: collision with root package name */
    protected f f5056c;

    /* renamed from: g, reason: collision with root package name */
    private final Context f5059g;

    /* renamed from: h, reason: collision with root package name */
    private final aj f5060h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.common.i f5061i;

    /* renamed from: l, reason: collision with root package name */
    private au f5064l;
    private IInterface m;
    private h o;
    private final b q;
    private final c r;
    private final int s;
    private final String t;
    private volatile String u;
    private volatile com.google.android.gms.common.d.a v;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f5058f = null;

    /* renamed from: j, reason: collision with root package name */
    private final Object f5062j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private final Object f5063k = new Object();
    private final ArrayList n = new ArrayList();
    private int p = 1;
    private com.google.android.gms.common.d w = null;
    private boolean x = false;
    private volatile t y = null;

    /* renamed from: d, reason: collision with root package name */
    protected final AtomicInteger f5057d = new AtomicInteger(0);

    protected m(Context context, Looper looper, aj ajVar, com.google.android.gms.common.i iVar, int i2, b bVar, c cVar, String str) {
        com.google.android.gms.common.api.internal.av.n(context, "Context must not be null");
        this.f5059g = context;
        com.google.android.gms.common.api.internal.av.n(looper, "Looper must not be null");
        com.google.android.gms.common.api.internal.av.n(ajVar, "Supervisor must not be null");
        this.f5060h = ajVar;
        com.google.android.gms.common.api.internal.av.n(iVar, "API availability must not be null");
        this.f5061i = iVar;
        this.f5055b = new d(this, looper);
        this.s = i2;
        this.q = bVar;
        this.r = cVar;
        this.t = str;
    }

    static /* bridge */ /* synthetic */ void L(m mVar, t tVar) {
        mVar.y = tVar;
        if (mVar.g()) {
            u uVar = tVar.f5092d;
            bf.a().c(uVar == null ? null : uVar.b());
        }
    }

    static /* bridge */ /* synthetic */ boolean T(m mVar, int i2, int i3, IInterface iInterface) {
        synchronized (mVar.f5062j) {
            if (mVar.p != i2) {
                return false;
            }
            mVar.i(i3, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean U(m mVar) throws ClassNotFoundException {
        if (mVar.x || TextUtils.isEmpty(mVar.d()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(mVar.d());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static /* bridge */ /* synthetic */ void Z(m mVar) {
        int i2;
        int i3;
        synchronized (mVar.f5062j) {
            i2 = mVar.p;
        }
        if (i2 == 3) {
            mVar.x = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = mVar.f5055b;
        handler.sendMessage(handler.obtainMessage(i3, mVar.f5057d.get(), 16));
    }

    protected static final void aa(com.google.android.gms.common.d dVar) {
        dVar.a();
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i2, IInterface iInterface) {
        an anVar;
        com.google.android.gms.common.api.internal.av.c((i2 == 4) == (iInterface != null));
        synchronized (this.f5062j) {
            this.p = i2;
            this.m = iInterface;
            Bundle bundle = null;
            if (i2 == 1) {
                h hVar = this.o;
                if (hVar != null) {
                    aj ajVar = this.f5060h;
                    String strB = this.f5054a.b();
                    String str = strB;
                    this.f5054a.a();
                    F();
                    ajVar.i(new ai(strB, this.f5054a.c()), hVar);
                    this.o = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                h hVar2 = this.o;
                if (hVar2 != null && (anVar = this.f5054a) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + anVar.b() + " on " + anVar.a());
                    aj ajVar2 = this.f5060h;
                    String strB2 = this.f5054a.b();
                    String str2 = strB2;
                    this.f5054a.a();
                    F();
                    ajVar2.i(new ai(strB2, this.f5054a.c(), null), hVar2);
                    this.f5057d.incrementAndGet();
                }
                AtomicInteger atomicInteger = this.f5057d;
                h hVar3 = new h(this, atomicInteger.get());
                this.o = hVar3;
                an anVar2 = new an(e(), f());
                this.f5054a = anVar2;
                if (anVar2.c() && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(this.f5054a.b()));
                }
                aj ajVar3 = this.f5060h;
                String strB3 = this.f5054a.b();
                String str3 = strB3;
                this.f5054a.a();
                com.google.android.gms.common.d dVarC = ajVar3.c(new ai(strB3, this.f5054a.c()), hVar3, F(), I());
                if (!dVarC.g()) {
                    Log.w("GmsClient", "unable to connect to service: " + this.f5054a.b() + " on " + this.f5054a.a());
                    int iA = dVarC.a() == -1 ? 16 : dVarC.a();
                    if (dVarC.b() != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", dVarC.b());
                    }
                    P(iA, bundle, atomicInteger.get());
                }
            } else if (i2 == 4) {
                com.google.android.gms.common.api.internal.av.m(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public final u C() {
        t tVar = this.y;
        if (tVar == null) {
            return null;
        }
        return tVar.f5092d;
    }

    public final v D() {
        t tVar = this.y;
        if (tVar == null) {
            return null;
        }
        return tVar.f5093e;
    }

    protected final String F() {
        String str = this.t;
        return str == null ? this.f5059g.getClass().getName() : str;
    }

    protected Set H() {
        return Collections.EMPTY_SET;
    }

    protected Executor I() {
        return null;
    }

    public final void M() throws PackageManager.NameNotFoundException {
        int iM = this.f5061i.m(this.f5059g, a());
        if (iM == 0) {
            l(new i(this));
            return;
        }
        i(1, null);
        this.f5056c = new i(this);
        Handler handler = this.f5055b;
        handler.sendMessage(handler.obtainMessage(3, this.f5057d.get(), iM, null));
    }

    public final void N() {
        this.f5057d.incrementAndGet();
        ArrayList arrayList = this.n;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((e) arrayList.get(i2)).e();
            }
            arrayList.clear();
        }
        synchronized (this.f5063k) {
            this.f5064l = null;
        }
        i(1, null);
    }

    protected final void O(int i2, IBinder iBinder, Bundle bundle, int i3) {
        j jVar = new j(this, i2, iBinder, bundle);
        Handler handler = this.f5055b;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, jVar));
    }

    protected final void P(int i2, Bundle bundle, int i3) {
        k kVar = new k(this, i2, bundle);
        Handler handler = this.f5055b;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, kVar));
    }

    public final void Q(com.google.android.gms.common.d.a aVar) {
        this.v = aVar;
    }

    public final void R(String str) {
        this.u = str;
    }

    public final boolean V() {
        return this.y != null;
    }

    public boolean W() {
        return true;
    }

    public com.google.android.gms.common.f[] X() {
        return f5053e;
    }

    public int a() {
        throw null;
    }

    protected void ab() {
        System.currentTimeMillis();
    }

    protected Bundle b() {
        return new Bundle();
    }

    protected abstract IInterface c(IBinder iBinder);

    protected abstract String d();

    protected abstract String e();

    protected boolean f() {
        return a() >= 211700000;
    }

    public boolean g() {
        return false;
    }

    public com.google.android.gms.common.f[] h() {
        return f5053e;
    }

    public final String j() {
        return this.f5058f;
    }

    public final void l(f fVar) {
        this.f5056c = fVar;
        i(2, null);
    }

    public final void m(String str) {
        this.f5058f = str;
        N();
    }

    public final void n(l lVar) {
        lVar.a();
    }

    public final boolean o() {
        boolean z;
        synchronized (this.f5062j) {
            z = this.p == 4;
        }
        return z;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.f5062j) {
            int i2 = this.p;
            z = true;
            if (i2 != 2 && i2 != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean q() {
        return false;
    }

    public final com.google.android.gms.common.f[] r() {
        t tVar = this.y;
        if (tVar == null) {
            return null;
        }
        return tVar.f5090b;
    }

    public final void s() {
        if (!o() || this.f5054a == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void t() {
    }

    public final void u(ao aoVar, Set set) {
        AttributionSource attributionSourceA;
        Bundle bundleB = b();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.v == null || (attributionSourceA = this.v.a()) == null || attributionSourceA.getAttributionTag() == null) ? this.u : attributionSourceA.getAttributionTag();
        String str = attributionTag;
        int i2 = this.s;
        int i3 = com.google.android.gms.common.i.f4949a;
        Scope[] scopeArr = z.f5105a;
        Bundle bundle = new Bundle();
        com.google.android.gms.common.f[] fVarArr = z.f5106b;
        z zVar = new z(6, i2, i3, null, null, scopeArr, bundle, null, fVarArr, fVarArr, true, 0, false, str);
        zVar.f5110f = this.f5059g.getPackageName();
        zVar.f5113i = bundleB;
        if (set != null) {
            zVar.f5112h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (q()) {
            Account accountW = w();
            if (accountW == null) {
                accountW = new Account("<<default account>>", "com.google");
            }
            zVar.f5114j = accountW;
            if (aoVar != null) {
                zVar.f5111g = aoVar.asBinder();
            }
        }
        zVar.f5115k = X();
        zVar.f5116l = h();
        if (g()) {
            zVar.o = true;
        }
        try {
            synchronized (this.f5063k) {
                au auVar = this.f5064l;
                if (auVar != null) {
                    auVar.a(new g(this, this.f5057d.get()), zVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.f5055b;
            handler.sendMessage(handler.obtainMessage(6, this.f5057d.get(), 3));
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            O(8, null, null, this.f5057d.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            O(8, null, null, this.f5057d.get());
        }
    }

    public final int v() {
        return this.s;
    }

    public Account w() {
        return null;
    }

    public final Context x() {
        return this.f5059g;
    }

    public final IInterface y() {
        IInterface iInterface;
        synchronized (this.f5062j) {
            if (this.p == 5) {
                throw new DeadObjectException();
            }
            if (!o()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.m;
            com.google.android.gms.common.api.internal.av.n(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }
}
