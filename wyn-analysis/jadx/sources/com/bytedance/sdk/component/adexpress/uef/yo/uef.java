package com.bytedance.sdk.component.adexpress.uef.yo;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef {
    private String ivm;
    private oa lw;
    private List<C0057uef> moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f24950oa;
    private String uef;
    private Map<String, uef> xs = new ConcurrentHashMap();
    private String yo;

    public static class oa {

        /* renamed from: oa, reason: collision with root package name */
        private String f24951oa;
        private String uef;
        private List<Pair<String, String>> yo;

        public void oa(String str) {
            this.f24951oa = str;
        }

        public String uef() {
            return this.uef;
        }

        public List<Pair<String, String>> oa() {
            return this.yo;
        }

        public void uef(String str) {
            this.uef = str;
        }

        public void uef(List<Pair<String, String>> list) {
            this.yo = list;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.uef.yo.uef$uef, reason: collision with other inner class name */
    public static class C0057uef {

        /* renamed from: oa, reason: collision with root package name */
        private String f24952oa;
        private String uef;
        private int yo;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0057uef)) {
                return super.equals(obj);
            }
            String str2 = this.uef;
            if (str2 != null) {
                C0057uef c0057uef = (C0057uef) obj;
                if (str2.equals(c0057uef.uef()) && (str = this.f24952oa) != null && str.equals(c0057uef.oa())) {
                    return true;
                }
            }
            return false;
        }

        public String oa() {
            return this.f24952oa;
        }

        public String uef() {
            return this.uef;
        }

        public int yo() {
            return this.yo;
        }

        public void oa(String str) {
            this.f24952oa = str;
        }

        public void uef(String str) {
            this.uef = str;
        }

        public void uef(int i5) {
            this.yo = i5;
        }
    }

    public boolean bcc() {
        return (TextUtils.isEmpty(moa()) || TextUtils.isEmpty(yo()) || TextUtils.isEmpty(oa())) ? false : true;
    }

    public JSONObject cz() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(MediationMetaData.KEY_NAME, oa());
            jSONObject.putOpt("version", yo());
            jSONObject.putOpt("main", moa());
            if (!TextUtils.isEmpty(this.ivm)) {
                jSONObject.put("template_fetch_url", this.ivm);
            }
            JSONArray jSONArray = new JSONArray();
            if (ivm() != null) {
                for (C0057uef c0057uef : ivm()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0057uef.uef());
                    jSONObject2.putOpt("md5", c0057uef.oa());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0057uef.yo()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.xs.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z2 = false;
                for (String str : this.xs.keySet()) {
                    uef uefVar = this.xs.get(str);
                    if (uefVar != null) {
                        jSONObject3.put(str, uefVar.cz());
                        z2 = true;
                    }
                }
                if (z2) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            oa oaVarLw = lw();
            if (oaVarLw != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", oaVarLw.uef);
                jSONObject4.put("md5", oaVarLw.f24951oa);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listOa = oaVarLw.oa();
                if (listOa != null) {
                    for (Pair<String, String> pair : listOa) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<C0057uef> ivm() {
        if (this.moa == null) {
            this.moa = new ArrayList();
        }
        return this.moa;
    }

    public oa lw() {
        return this.lw;
    }

    public String moa() {
        return this.yo;
    }

    public String oa() {
        return this.uef;
    }

    public Map<String, uef> uef() {
        return this.xs;
    }

    public String xs() {
        return this.ivm;
    }

    public String yo() {
        return this.f24950oa;
    }

    public String zjm() {
        JSONObject jSONObjectCz;
        if (!bcc() || (jSONObjectCz = cz()) == null) {
            return null;
        }
        return jSONObjectCz.toString();
    }

    public static uef lw(String str) {
        if (str == null) {
            return null;
        }
        try {
            return uef(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void moa(String str) {
        this.ivm = str;
    }

    public void oa(String str) {
        this.f24950oa = str;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void yo(String str) {
        this.yo = str;
    }

    public void uef(oa oaVar) {
        this.lw = oaVar;
    }

    public void uef(List<C0057uef> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.moa = list;
    }

    public static uef uef(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        uef uefVar = new uef();
        uefVar.uef(jSONObject.optString(MediationMetaData.KEY_NAME));
        uefVar.oa(jSONObject.optString("version"));
        uefVar.yo(jSONObject.optString("main"));
        uefVar.moa(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i5);
                C0057uef c0057uef = new C0057uef();
                c0057uef.uef(jSONObjectOptJSONObject2.optString("url"));
                c0057uef.oa(jSONObjectOptJSONObject2.optString("md5"));
                c0057uef.uef(jSONObjectOptJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(c0057uef);
            }
        }
        uefVar.uef(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    uef uefVarUef = uef(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (uefVarUef != null) {
                        uefVar.uef().put(next, uefVarUef);
                    }
                }
            }
        } catch (Exception e7) {
            e7.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            oa oaVar = new oa();
            oaVar.uef(jSONObjectOptJSONObject.optString("url"));
            oaVar.oa(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                oaVar.uef(arrayList2);
            }
            uefVar.uef(oaVar);
        }
        if (uefVar.bcc()) {
            return uefVar;
        }
        return null;
    }
}
