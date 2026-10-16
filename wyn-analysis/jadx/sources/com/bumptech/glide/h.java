package com.bumptech.glide;

import A7.V;
import E5.C0441b;
import R4.i;
import R4.k;
import Y4.m;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ba.C1521a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class h implements ComponentCallbacks2, R4.e {

    /* renamed from: l, reason: collision with root package name */
    public static final U4.c f24248l;

    /* renamed from: a, reason: collision with root package name */
    public final b f24249a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f24250b;

    /* renamed from: c, reason: collision with root package name */
    public final R4.d f24251c;

    /* renamed from: d, reason: collision with root package name */
    public final C0441b f24252d;

    /* renamed from: e, reason: collision with root package name */
    public final i f24253e;

    /* renamed from: f, reason: collision with root package name */
    public final k f24254f;

    /* renamed from: g, reason: collision with root package name */
    public final V f24255g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f24256h;

    /* renamed from: i, reason: collision with root package name */
    public final R4.b f24257i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f24258j;
    public U4.c k;

    static {
        U4.c cVar = (U4.c) new U4.c().c(Bitmap.class);
        cVar.f12280m = true;
        f24248l = cVar;
        ((U4.c) new U4.c().c(P4.c.class)).f12280m = true;
    }

    public h(b bVar, R4.d dVar, i iVar, Context context) {
        U4.c cVar;
        C0441b c0441b = new C0441b();
        ya.b bVar2 = bVar.f24216g;
        this.f24254f = new k();
        V v2 = new V(this, 25);
        this.f24255g = v2;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f24256h = handler;
        this.f24249a = bVar;
        this.f24251c = dVar;
        this.f24253e = iVar;
        this.f24252d = c0441b;
        this.f24250b = context;
        Context applicationContext = context.getApplicationContext();
        C1521a c1521a = new C1521a(1, this, c0441b);
        bVar2.getClass();
        boolean z2 = Y0.e.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z2 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        R4.b cVar2 = z2 ? new R4.c(applicationContext, c1521a) : new R4.f();
        this.f24257i = cVar2;
        char[] cArr = m.f16700a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            dVar.f(this);
        } else {
            handler.post(v2);
        }
        dVar.f(cVar2);
        this.f24258j = new CopyOnWriteArrayList(bVar.f24212c.f24222d);
        c cVar3 = bVar.f24212c;
        synchronized (cVar3) {
            try {
                if (cVar3.f24226h == null) {
                    cVar3.f24221c.getClass();
                    U4.c cVar4 = new U4.c();
                    cVar4.f12280m = true;
                    cVar3.f24226h = cVar4;
                }
                cVar = cVar3.f24226h;
            } catch (Throwable th) {
                throw th;
            }
        }
        f(cVar);
        bVar.c(this);
    }

    @Override // R4.e
    public final synchronized void a() {
        d();
        this.f24254f.a();
    }

    @Override // R4.e
    public final synchronized void b() {
        e();
        this.f24254f.b();
    }

    public final void c(V4.a aVar) {
        if (aVar == null) {
            return;
        }
        boolean zG = g(aVar);
        U4.d dVar = aVar.f13017c;
        if (zG) {
            return;
        }
        b bVar = this.f24249a;
        synchronized (bVar.f24217h) {
            try {
                Iterator it = bVar.f24217h.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).g(aVar)) {
                        return;
                    }
                }
                if (dVar != null) {
                    aVar.f13017c = null;
                    dVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void d() {
        C0441b c0441b = this.f24252d;
        c0441b.f3290b = true;
        Iterator it = m.d((Set) c0441b.f3291c).iterator();
        while (it.hasNext()) {
            U4.d dVar = (U4.d) ((U4.b) it.next());
            if (dVar.g()) {
                dVar.m();
                ((ArrayList) c0441b.f3292d).add(dVar);
            }
        }
    }

    public final synchronized void e() {
        C0441b c0441b = this.f24252d;
        c0441b.f3290b = false;
        Iterator it = m.d((Set) c0441b.f3291c).iterator();
        while (it.hasNext()) {
            U4.d dVar = (U4.d) ((U4.b) it.next());
            if (!dVar.e() && !dVar.g()) {
                dVar.a();
            }
        }
        ((ArrayList) c0441b.f3292d).clear();
    }

    public final synchronized void f(U4.c cVar) {
        U4.c cVar2 = (U4.c) cVar.clone();
        if (cVar2.f12280m && !cVar2.f12281n) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        cVar2.f12281n = true;
        cVar2.f12280m = true;
        this.k = cVar2;
    }

    public final synchronized boolean g(V4.a aVar) {
        U4.d dVar = aVar.f13017c;
        if (dVar == null) {
            return true;
        }
        if (!this.f24252d.d(dVar)) {
            return false;
        }
        this.f24254f.f10255a.remove(aVar);
        aVar.f13017c = null;
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // R4.e
    public final synchronized void onDestroy() {
        try {
            this.f24254f.onDestroy();
            Iterator it = m.d(this.f24254f.f10255a).iterator();
            while (it.hasNext()) {
                c((V4.a) it.next());
            }
            this.f24254f.f10255a.clear();
            C0441b c0441b = this.f24252d;
            Iterator it2 = m.d((Set) c0441b.f3291c).iterator();
            while (it2.hasNext()) {
                c0441b.d((U4.b) it2.next());
            }
            ((ArrayList) c0441b.f3292d).clear();
            this.f24251c.e(this);
            this.f24251c.e(this.f24257i);
            this.f24256h.removeCallbacks(this.f24255g);
            this.f24249a.d(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f24252d + ", treeNode=" + this.f24253e + "}";
    }
}
