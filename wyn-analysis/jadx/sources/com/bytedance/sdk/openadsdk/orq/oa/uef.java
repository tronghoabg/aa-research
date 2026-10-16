package com.bytedance.sdk.openadsdk.orq.oa;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private List<C0132uef> f26074oa;
    private String uef;
    private List<C0132uef> yo;

    /* renamed from: com.bytedance.sdk.openadsdk.orq.oa.uef$uef, reason: collision with other inner class name */
    public static class C0132uef {

        /* renamed from: oa, reason: collision with root package name */
        private String f26075oa;
        private String uef;
        private int yo;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0132uef)) {
                return super.equals(obj);
            }
            String str2 = this.uef;
            if (str2 != null) {
                C0132uef c0132uef = (C0132uef) obj;
                if (str2.equals(c0132uef.uef) && (str = this.f26075oa) != null && str.equals(c0132uef.f26075oa)) {
                    return true;
                }
            }
            return false;
        }

        public static C0132uef uef(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0132uef c0132uef = new C0132uef();
            c0132uef.uef = jSONObject.optString("url");
            c0132uef.f26075oa = jSONObject.optString("md5");
            c0132uef.yo = jSONObject.optInt("type");
            return c0132uef;
        }

        public String uef() {
            return this.uef;
        }
    }

    public void oa(List<C0132uef> list) {
        this.yo = list;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public List<C0132uef> yo() {
        return this.yo;
    }

    public List<C0132uef> oa() {
        return this.f26074oa;
    }

    public void uef(List<C0132uef> list) {
        this.f26074oa = list;
    }

    public static uef oa(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            uef uefVar = new uef();
            uefVar.uef(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    C0132uef c0132uefUef = C0132uef.uef(jSONArrayOptJSONArray.optJSONObject(i5));
                    if (c0132uefUef != null) {
                        if (c0132uefUef.yo != 1) {
                            if (c0132uefUef.yo == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0132uefUef);
                            }
                        } else {
                            arrayList.add(c0132uefUef);
                        }
                    }
                }
            }
            uefVar.uef(arrayList);
            uefVar.oa(arrayList2);
            return uefVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String uef() {
        return this.uef;
    }
}
