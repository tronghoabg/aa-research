package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.tika.metadata.Office;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes.dex */
public class xs {
    private float bcc;
    private float cz;
    private JSONObject ivm;
    private String lw;
    private JSONObject moa;

    /* renamed from: oa, reason: collision with root package name */
    private JSONObject f24694oa;
    private JSONObject uef;
    private boolean xs;
    private String yo;
    private boolean zjm;

    public static class uef {
        private String bcc;
        private boolean cz;
        private boolean dj;
        private uef ivm;
        private LinkedList<uef> lw;
        private JSONObject moa;

        /* renamed from: oa, reason: collision with root package name */
        private String f24695oa;
        private String uef;
        private String xs;
        private JSONObject yo;
        private boolean zjm;

        public List<uef> ivm() {
            return this.lw;
        }

        public JSONObject lw() {
            return this.yo;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("UGNode{id='");
            sb2.append(this.uef);
            sb2.append("', name='");
            return b.c(sb2, this.f24695oa, "'}");
        }

        public JSONObject xs() {
            return this.moa;
        }

        public String moa() {
            return this.f24695oa;
        }

        public String oa() {
            return this.xs;
        }

        public boolean yo() {
            return this.cz;
        }

        public void oa(boolean z2) {
            this.dj = z2;
        }

        public void oa(uef uefVar) {
            if (this.lw == null) {
                this.lw = new LinkedList<>();
            }
            this.lw.addLast(uefVar);
        }

        public String uef() {
            return this.uef;
        }

        public void uef(String str) {
            this.f24695oa = str;
        }

        public void uef(boolean z2) {
            this.zjm = z2;
        }

        public void uef(uef uefVar) {
            if (this.lw == null) {
                this.lw = new LinkedList<>();
            }
            this.lw.add(uefVar);
        }

        public void uef(int i5, uef uefVar) {
            if (this.lw == null) {
                this.lw = new LinkedList<>();
            }
            this.lw.add(i5, uefVar);
        }
    }

    public xs(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    private uef lw() throws JSONException {
        if (!moa()) {
            return uef(this.uef, (uef) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f10 = this.bcc;
            if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jSONObject.put("width", f10);
            }
            float f11 = this.cz;
            if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jSONObject.put("height", f11);
            }
            JSONObject jSONObject2 = this.moa;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        uef uefVar = new uef();
        uefVar.f24695oa = "View";
        uefVar.uef = "virtualNode";
        uefVar.yo = jSONObject;
        uefVar.ivm = null;
        uefVar.xs = this.yo;
        uefVar.cz = this.zjm;
        uefVar.bcc = this.lw;
        uefVar.uef(uef(this.uef, uefVar));
        return uefVar;
    }

    public boolean moa() {
        return this.xs;
    }

    public String oa() {
        return this.yo;
    }

    public uef uef() {
        return lw();
    }

    public List<uef> yo() throws JSONException {
        if (this.f24694oa == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.f24694oa.keys();
        while (itKeys.hasNext()) {
            uef uefVarUef = uef(this.f24694oa.optJSONObject(itKeys.next()), (uef) null);
            if (uefVarUef != null) {
                arrayList.add(uefVarUef);
            }
        }
        return arrayList;
    }

    public xs(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.zjm = true;
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.uef = jSONObject.optJSONObject("body");
            } else {
                this.uef = jSONObject.optJSONObject("main_template");
            }
            this.f24694oa = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has(Office.PREFIX_DOC_META) ? jSONObject.optJSONObject(Office.PREFIX_DOC_META) : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.xs = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.yo = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.yo = "3.0";
                    }
                } else {
                    this.yo = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.lw = jSONObjectOptJSONObject.optString("adType");
                }
                if (jSONObjectOptJSONObject.has("gestureThrough")) {
                    this.zjm = com.bytedance.adsdk.ugeno.xs.yo.uef(jSONObjectOptJSONObject.optString("gestureThrough"), true);
                }
            } else if (jSONObject.has("body")) {
                this.yo = "3.0";
                this.xs = true;
            }
            this.moa = jSONObject2;
            this.ivm = jSONObject3;
        }
    }

    public static boolean moa(uef uefVar) {
        return (uefVar == null || uefVar.yo == null) ? false : true;
    }

    public boolean oa(uef uefVar) {
        JSONObject jSONObjectLw;
        if (uefVar == null || (jSONObjectLw = uefVar.lw()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectLw.optString("height"), "match_parent");
    }

    public void uef(float f10, float f11) {
        this.bcc = f10;
        this.cz = f11;
    }

    private uef uef(JSONObject jSONObject, uef uefVar) throws JSONException {
        String strOptString;
        String strOptString2;
        uef uefVarUef;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            strOptString = jSONObject.optString("type");
        } else {
            strOptString = jSONObject.optString(MediationMetaData.KEY_NAME);
        }
        String strOptString3 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        uef uefVar2 = new uef();
        uefVar2.uef = strOptString3;
        if (!this.xs || !TextUtils.equals("Video", strOptString)) {
            uefVar2.f24695oa = strOptString;
        } else {
            uefVar2.f24695oa = strOptString + "V3";
        }
        uefVar2.yo = jSONObject2;
        uefVar2.ivm = uefVar;
        uefVar2.xs = this.yo;
        uefVar2.cz = this.zjm;
        uefVar2.bcc = this.lw;
        if (jSONObject2.has("i18n")) {
            uefVar2.moa = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            uef(jSONObject, uefVar2.yo);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i5 = 0;
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject.has("type")) {
                    strOptString2 = jSONObject.optString("type");
                } else {
                    strOptString2 = jSONObject.optString(MediationMetaData.KEY_NAME);
                }
                String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObjectOptJSONObject.optString("id"), this.moa);
                if (TextUtils.equals(strOptString2, "Template")) {
                    JSONObject jSONObject3 = this.f24694oa;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strUef);
                        uefVarUef = uef(jSONObjectOptJSONObject, uefVar2);
                    } else {
                        uefVarUef = null;
                    }
                } else {
                    uefVarUef = uef(jSONObjectOptJSONObject, uefVar2);
                }
                if (uefVarUef != null) {
                    uefVarUef.oa(oa(uefVarUef));
                    uefVarUef.uef(uef(uefVarUef));
                }
                if (yo(uefVarUef)) {
                    i5++;
                    uefVar2.oa(uefVarUef);
                } else if (uefVarUef != null) {
                    uefVar2.uef(i10 - i5, uefVarUef);
                }
            }
        }
        return uefVar2;
    }

    public boolean yo(uef uefVar) {
        JSONObject jSONObjectLw;
        if (uefVar == null || (jSONObjectLw = uefVar.lw()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectLw.optString("position"), "absolute");
    }

    public boolean uef(uef uefVar) {
        JSONObject jSONObjectLw;
        if (uefVar == null || (jSONObjectLw = uefVar.lw()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectLw.optString("width"), "match_parent");
    }

    private void uef(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (this.ivm == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.ivm.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.xs.oa.uef(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }
}
