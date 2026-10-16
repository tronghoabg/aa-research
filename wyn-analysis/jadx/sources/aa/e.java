package aa;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f17421h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f17422a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f17423b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f17424c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f17425d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f17426e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17427f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f17428g;

    public e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j8, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j8);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f17423b = jSONObject;
        this.f17424c = date;
        this.f17425d = jSONArray;
        this.f17426e = jSONObject2;
        this.f17427f = j8;
        this.f17428g = jSONArray2;
        this.f17422a = jSONObject3;
    }

    public static e a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static d c() {
        d dVar = new d();
        dVar.f17415a = new JSONObject();
        dVar.f17416b = f17421h;
        dVar.f17417c = new JSONArray();
        dVar.f17418d = new JSONObject();
        dVar.f17419e = 0L;
        dVar.f17420f = new JSONArray();
        return dVar;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i5 = 0;
        while (true) {
            JSONArray jSONArray = this.f17428g;
            if (i5 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String string3 = jSONArray2.getString(i10);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f17422a.toString().equals(((e) obj).f17422a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f17422a.hashCode();
    }

    public final String toString() {
        return this.f17422a.toString();
    }
}
