package Z9;

import Va.Y7;
import Va.Za;
import aa.n;
import aa.p;
import aa.q;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t8.C4149c;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f17049m = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f17050a;

    /* renamed from: b, reason: collision with root package name */
    public final C4149c f17051b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f17052c;

    /* renamed from: d, reason: collision with root package name */
    public final aa.c f17053d;

    /* renamed from: e, reason: collision with root package name */
    public final aa.c f17054e;

    /* renamed from: f, reason: collision with root package name */
    public final aa.c f17055f;

    /* renamed from: g, reason: collision with root package name */
    public final aa.h f17056g;

    /* renamed from: h, reason: collision with root package name */
    public final aa.i f17057h;

    /* renamed from: i, reason: collision with root package name */
    public final aa.k f17058i;

    /* renamed from: j, reason: collision with root package name */
    public final P9.d f17059j;
    public final Y7 k;

    /* renamed from: l, reason: collision with root package name */
    public final Za f17060l;

    public d(Context context, P9.d dVar, C4149c c4149c, Executor executor, aa.c cVar, aa.c cVar2, aa.c cVar3, aa.h hVar, aa.i iVar, aa.k kVar, Y7 y72, Za za2) {
        this.f17050a = context;
        this.f17059j = dVar;
        this.f17051b = c4149c;
        this.f17052c = executor;
        this.f17053d = cVar;
        this.f17054e = cVar2;
        this.f17055f = cVar3;
        this.f17056g = hVar;
        this.f17057h = iVar;
        this.f17058i = kVar;
        this.k = y72;
        this.f17060l = za2;
    }

    public static ArrayList e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task a() {
        aa.h hVar = this.f17056g;
        aa.k kVar = hVar.f17443g;
        long j8 = kVar.f17454a.getLong("minimum_fetch_interval_in_seconds", aa.h.f17435i);
        HashMap map = new HashMap(hVar.f17444h);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return hVar.f17441e.b().continueWithTask(hVar.f17439c, new A5.j(hVar, j8, map)).onSuccessTask(M8.i.f7556a, new V1.c(14));
    }

    public final HashMap b() throws JSONException {
        String string;
        q qVar;
        aa.i iVar = this.f17057h;
        HashSet hashSet = new HashSet();
        hashSet.addAll(aa.i.b(iVar.f17448c));
        hashSet.addAll(aa.i.b(iVar.f17449d));
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            aa.e eVarC = iVar.f17448c.c();
            String string2 = null;
            if (eVarC == null) {
                string = null;
            } else {
                try {
                    string = eVarC.f17423b.getString(str);
                } catch (JSONException unused) {
                }
            }
            if (string != null) {
                aa.e eVarC2 = iVar.f17448c.c();
                if (eVarC2 != null) {
                    synchronized (iVar.f17446a) {
                        try {
                            Iterator it2 = iVar.f17446a.iterator();
                            while (it2.hasNext()) {
                                iVar.f17447b.execute(new Ab.a((i) it2.next(), str, eVarC2, 17));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                qVar = new q(string, 2);
            } else {
                aa.e eVarC3 = iVar.f17449d.c();
                if (eVarC3 != null) {
                    try {
                        string2 = eVarC3.f17423b.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    qVar = new q(string2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
                    qVar = new q("", 0);
                }
            }
            map.put(str, qVar);
        }
        return map;
    }

    public final p c() {
        p pVar;
        aa.k kVar = this.f17058i;
        synchronized (kVar.f17455b) {
            try {
                long j8 = kVar.f17454a.getLong("last_fetch_time_in_millis", -1L);
                int i5 = kVar.f17454a.getInt("last_fetch_status", 0);
                C8.j jVar = new C8.j(1);
                long j10 = kVar.f17454a.getLong("fetch_timeout_in_seconds", 60L);
                if (j10 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
                }
                jVar.f1944a = j10;
                jVar.a(kVar.f17454a.getLong("minimum_fetch_interval_in_seconds", aa.h.f17435i));
                pVar = new p(j8, i5, new C8.j(jVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public final void d(boolean z2) {
        Y7 y72 = this.k;
        synchronized (y72) {
            ((n) y72.f13868b).f17467e = z2;
            if (!z2) {
                y72.c();
            }
        }
    }
}
