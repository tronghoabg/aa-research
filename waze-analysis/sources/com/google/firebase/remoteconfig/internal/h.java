package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10675a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Date f10676b = new Date(0);

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f10677c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f10678d;

    /* renamed from: e, reason: collision with root package name */
    private Date f10679e;

    /* renamed from: f, reason: collision with root package name */
    private JSONArray f10680f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f10681g;

    /* renamed from: h, reason: collision with root package name */
    private long f10682h;

    /* renamed from: i, reason: collision with root package name */
    private JSONArray f10683i;

    private h(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j2, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j2);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f10678d = jSONObject;
        this.f10679e = date;
        this.f10680f = jSONArray;
        this.f10681g = jSONObject2;
        this.f10682h = j2;
        this.f10683i = jSONArray2;
        this.f10677c = jSONObject3;
    }

    static h b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new h(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private final Map j() throws JSONException {
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < this.f10683i.length(); i2++) {
            JSONObject jSONObject = this.f10683i.getJSONObject(i2);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String string3 = jSONArray.getString(i3);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    public final long a() {
        return this.f10682h;
    }

    public final Date d() {
        return this.f10679e;
    }

    public final Set e(h hVar) throws JSONException {
        JSONObject jSONObject = b(new JSONObject(hVar.f10677c.toString())).f10678d;
        Map mapJ = j();
        Map mapJ2 = hVar.j();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = this.f10678d.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!hVar.f10678d.has(next)) {
                hashSet.add(next);
            } else if (!this.f10678d.get(next).equals(hVar.f10678d.get(next))) {
                hashSet.add(next);
            } else if ((this.f10681g.has(next) && !hVar.f10681g.has(next)) || (!this.f10681g.has(next) && hVar.f10681g.has(next))) {
                hashSet.add(next);
            } else if (this.f10681g.has(next) && hVar.f10681g.has(next) && !this.f10681g.getJSONObject(next).toString().equals(hVar.f10681g.getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapJ.containsKey(next) != mapJ2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapJ.containsKey(next) && mapJ2.containsKey(next) && !((Map) mapJ.get(next)).equals(mapJ2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObject.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObject.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f10677c.toString().equals(((h) obj).toString());
        }
        return false;
    }

    public final JSONArray f() {
        return this.f10680f;
    }

    public final JSONArray g() {
        return this.f10683i;
    }

    public final JSONObject h() {
        return this.f10678d;
    }

    public final int hashCode() {
        return this.f10677c.hashCode();
    }

    public final JSONObject i() {
        return this.f10681g;
    }

    public final String toString() {
        return this.f10677c.toString();
    }

    /* synthetic */ h(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j2, JSONArray jSONArray2, byte[] bArr) {
        this(jSONObject, date, jSONArray, jSONObject2, j2, jSONArray2);
    }
}
