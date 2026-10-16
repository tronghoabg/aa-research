package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.e6;
import com.applovin.impl.j5;
import com.applovin.impl.mediation.ads.f;
import com.applovin.impl.o7;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f23186a;

    /* renamed from: b, reason: collision with root package name */
    private final o f23187b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23188c;

    /* renamed from: d, reason: collision with root package name */
    private final c f23189d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f23190e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final List f23191f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f23192g;

    /* renamed from: h, reason: collision with root package name */
    private final List f23193h;

    public class a implements AppLovinPostbackListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f23194a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f23195b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f23194a = dVar;
            this.f23195b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i5) {
            o unused = b.this.f23187b;
            if (o.a()) {
                b.this.f23187b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f23194a + " with error code: " + i5 + "; will retry later...");
            }
            b.this.d(this.f23194a);
            t2.a(this.f23195b, str, i5);
            if (this.f23194a.c() == 1) {
                b.this.f23186a.D().a("dispatchPostback", str, i5, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f23194a);
            o unused = b.this.f23187b;
            if (o.a()) {
                b.this.f23187b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f23194a);
            }
            b.this.c();
            t2.a(this.f23195b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f23191f = arrayList;
        this.f23192g = new HashSet();
        this.f23193h = new ArrayList();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f23186a = kVar;
        this.f23187b = kVar.O();
        int iIntValue = ((Integer) kVar.a(y4.f23660O2)).intValue();
        this.f23188c = iIntValue;
        if (!((Boolean) kVar.a(y4.f23683R2)).booleanValue()) {
            this.f23189d = null;
            return;
        }
        c cVar = new c(this, kVar);
        this.f23189d = cVar;
        arrayList.addAll(cVar.a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f23186a.r0().a((j5) this.f23189d, e6.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f23190e) {
            while (this.f23191f.size() > this.f23188c) {
                try {
                    this.f23191f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f23191f.add(dVar);
        }
        if (o.a()) {
            this.f23187b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f23190e) {
            try {
                if (((Boolean) this.f23186a.a(y4.f23675Q2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f23193h.size());
                    arrayList.addAll(this.f23193h);
                } else {
                    arrayList.ensureCapacity(this.f23191f.size());
                    arrayList.addAll(this.f23191f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f23190e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f23190e) {
            try {
                Iterator it = new ArrayList(this.f23191f).iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, boolean z2) {
        a(dVar, z2, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z2, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f23187b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z2) {
                dVar.a();
            }
            a(new f(this, dVar, appLovinPostbackListener, 3), o7.h(), dVar.m());
        }
    }

    public void b() {
        a((Runnable) new com.applovin.adview.a(this, 6), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f23190e) {
            try {
                Iterator it = this.f23193h.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f23193h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f23190e) {
            this.f23191f.clear();
            this.f23193h.clear();
        }
        this.f23186a.r0().a((j5) this.f23189d, e6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f23190e) {
            this.f23192g.remove(dVar);
            this.f23193h.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (o.a()) {
            this.f23187b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f23186a.F0() && !dVar.m()) {
            if (o.a()) {
                this.f23187b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f23187b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f23190e) {
            try {
                if (this.f23192g.contains(dVar)) {
                    if (o.a()) {
                        this.f23187b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f23186a.a(y4.f23652N2);
                if (dVar.c() > num.intValue()) {
                    if (o.a()) {
                        this.f23187b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f23190e) {
                    this.f23192g.add(dVar);
                }
                e eVarB = e.b(this.f23186a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (o.a()) {
                    this.f23187b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f23186a.g0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f23190e) {
            this.f23192g.remove(dVar);
            this.f23191f.remove(dVar);
        }
        if (o.a()) {
            this.f23187b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z2, boolean z10) {
        if (z2) {
            this.f23186a.r0().a((j5) new s6(this.f23186a, z10, "runPostbackTask", runnable), e6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
