package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.C1666u;
import com.applovin.impl.Y;
import com.applovin.impl.a5;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.j5;
import com.applovin.impl.l1;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinAdType;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f22923a;

    /* renamed from: b, reason: collision with root package name */
    private final c f22924b;

    /* renamed from: c, reason: collision with root package name */
    private final List f22925c = DesugarCollections.synchronizedList(new ArrayList());

    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public d(k kVar) {
        this.f22923a = kVar;
        this.f22924b = new c(kVar);
    }

    private void e() {
        String str = (String) this.f22923a.q0().a(a5.f20935E);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            try {
                c.a aVarA = c.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f22923a);
                if (aVarA != null) {
                    if (a(aVarA)) {
                        long jC = aVarA.c() - SystemClock.elapsedRealtime();
                        this.f22923a.g().d(d2.f21302Y, CollectionUtils.map("details", "ttl = " + jC + "ms"));
                    } else {
                        this.f22925c.add(0, aVarA);
                    }
                }
            } catch (Throwable th) {
                this.f22923a.O();
                if (o.a()) {
                    this.f22923a.O().a("AdPersistenceManager", "Failed to deserialize persisted ad file path", th);
                }
                this.f22923a.D().a("AdPersistenceManager", "deserializePersistedAdFilePath", th);
            }
        }
    }

    private void f() {
        this.f22923a.r0().a((j5) new s6(this.f22923a, "loadPersistedAdFilesQueueAndCleanupAsync", new v(this, 0)), e6.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f22925c) {
            try {
                Iterator it = this.f22925c.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((c.a) it.next()).a());
                    } catch (Throwable th) {
                        this.f22923a.O();
                        if (o.a()) {
                            this.f22923a.O().a("AdPersistenceManager", "Failed to serialize persisted ad file path", th);
                        }
                        this.f22923a.D().a("AdPersistenceManager", "serializePersistedAdFilePath", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22923a.q0().b(a5.f20935E, new JSONArray((Collection) arrayList).toString());
    }

    public void g() {
        this.f22923a.r0().a((j5) new s6(this.f22923a, "resetManagerState", new v(this, 1)), e6.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(c.a aVar) {
        if (aVar == null) {
            this.f22923a.O();
            if (o.a()) {
                this.f22923a.O().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f22925c.add(aVar);
        if (((Boolean) this.f22923a.a(y4.f23775d1)).booleanValue()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f22923a.q0().b(a5.f20935E);
        this.f22924b.a();
    }

    public void a(C1666u c1666u, a aVar) {
        if (aVar == null) {
            this.f22923a.O();
            if (o.a()) {
                this.f22923a.O().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            l1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (c1666u == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f22923a.g().a(d2.f21296V, c1666u, (AppLovinError) null);
        c.a aVarA = a(c1666u.g());
        this.f22924b.a(aVarA, new Y(this, aVar, aVarA, c1666u));
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    private void d(c.a aVar) {
        if (aVar != null && this.f22925c.remove(aVar)) {
            this.f22924b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f22923a.g().a(d2.f21290S, bVar);
        this.f22924b.b(bVar, new S8.b(this, 26));
    }

    private boolean b(c.a aVar) {
        long jB = aVar.b();
        return (jB == 0 || jB == k.n()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, c.a aVar2, C1666u c1666u, com.applovin.impl.sdk.ad.b bVar, String str) {
        if (bVar != null && !StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, c1666u, str);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        d(c.a.a(bVar));
    }

    private c.a a(AppLovinAdType appLovinAdType) {
        c.a aVar;
        synchronized (this.f22925c) {
            try {
                Iterator it = this.f22925c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (c.a) it.next();
                    if (aVar.f().equals(appLovinAdType) && !a(aVar) && b(aVar)) {
                        break;
                    }
                }
                this.f22925c.remove(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private void a(a aVar, c.a aVar2, C1666u c1666u, String str) {
        if (aVar == null) {
            return;
        }
        this.f22923a.O();
        if (o.a()) {
            this.f22923a.O().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.f22924b.b(aVar2);
        this.f22923a.g().a(d2.f21300X, c1666u, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f22923a.O();
        if (o.a()) {
            this.f22923a.O().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.f22924b.b(aVar2);
        this.f22923a.g().a(d2.f21298W, bVar);
    }

    private boolean a(c.a aVar) {
        return ((Long) this.f22923a.a(y4.f1)).longValue() + SystemClock.elapsedRealtime() >= aVar.c();
    }

    private void a() {
        synchronized (this.f22925c) {
            this.f22924b.a(new ArrayList(this.f22925c));
        }
    }
}
