package com.google.firebase.remoteconfig;

import android.util.Log;
import com.google.android.gms.f.w;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;
import com.google.firebase.crashlytics.a.c.aw;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.v;
import com.google.firebase.remoteconfig.internal.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.abt.c f10602a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10603b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f10604c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f10605d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f10606e;

    /* renamed from: f, reason: collision with root package name */
    private final m f10607f;

    /* renamed from: g, reason: collision with root package name */
    private final n f10608g;

    /* renamed from: h, reason: collision with root package name */
    private final v f10609h;

    /* renamed from: i, reason: collision with root package name */
    private final o f10610i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.a.c f10611j;

    b(com.google.firebase.abt.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, m mVar, n nVar, v vVar, o oVar, com.google.firebase.remoteconfig.internal.a.c cVar2) {
        this.f10602a = cVar;
        this.f10603b = executor;
        this.f10604c = fVar;
        this.f10605d = fVar2;
        this.f10606e = fVar3;
        this.f10607f = mVar;
        this.f10608g = nVar;
        this.f10609h = vVar;
        this.f10610i = oVar;
        this.f10611j = cVar2;
    }

    public static /* synthetic */ boolean f(b bVar, t tVar) throws JSONException {
        if (!tVar.k()) {
            return false;
        }
        bVar.f10604c.e();
        com.google.firebase.remoteconfig.internal.h hVar = (com.google.firebase.remoteconfig.internal.h) tVar.g();
        if (hVar == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        com.google.firebase.abt.c cVar = bVar.f10602a;
        JSONArray jSONArrayF = hVar.f();
        if (cVar != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayF.length(); i2++) {
                    HashMap map = new HashMap();
                    JSONObject jSONObject = jSONArrayF.getJSONObject(i2);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject.getString(next));
                    }
                    arrayList.add(map);
                }
                cVar.a(arrayList);
            } catch (com.google.firebase.abt.a e2) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
            } catch (JSONException e3) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e3);
            }
        }
        bVar.f10611j.a(hVar);
        return true;
    }

    public static /* synthetic */ t h(b bVar) {
        t tVarA = bVar.f10604c.a();
        t tVarA2 = bVar.f10605d.a();
        return ag.e(tVarA, tVarA2).c(bVar.f10603b, new p(bVar, tVarA, tVarA2, 1));
    }

    public static /* synthetic */ t i(b bVar, t tVar, t tVar2) {
        com.google.firebase.remoteconfig.internal.h hVar;
        if (!tVar.k() || tVar.g() == null) {
            return ag.c(false);
        }
        com.google.firebase.remoteconfig.internal.h hVar2 = (com.google.firebase.remoteconfig.internal.h) tVar.g();
        return (tVar2.k() && (hVar = (com.google.firebase.remoteconfig.internal.h) tVar2.g()) != null && hVar2.d().equals(hVar.d())) ? ag.c(false) : bVar.f10605d.b(hVar2).b(bVar.f10603b, new aw(bVar, 4));
    }

    public final t a() {
        int i2 = 3;
        return this.f10607f.d().e(com.google.firebase.concurrent.v.a(), new w(i2)).e(this.f10603b, new com.google.firebase.appcheck.a.c(this, i2));
    }

    final com.google.firebase.remoteconfig.internal.a.c b() {
        return this.f10611j;
    }

    public final Map c() {
        return this.f10608g.a();
    }

    final void d(boolean z) {
        this.f10610i.a(z);
    }

    final void e() {
        this.f10605d.a();
        this.f10606e.a();
        this.f10604c.a();
    }

    public final y g() {
        return this.f10609h.q();
    }
}
