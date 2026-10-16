package com.bytedance.sdk.component.adexpress.dynamic.lw;

import A7.AbstractC0279p0;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.lw.lw;
import com.bytedance.sdk.component.adexpress.oa.cq;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ivm {
    private static HashMap<String, String> xs;
    private com.bytedance.sdk.component.adexpress.dynamic.moa.moa ivm;
    private yo lw;
    private uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private JSONObject f24839oa;
    private JSONObject uef;
    private com.bytedance.sdk.component.adexpress.dynamic.moa.yo yo;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        float f24840oa;
        float uef;
        boolean yo;

        public static uef uef(JSONObject jSONObject) {
            uef uefVar = new uef();
            if (jSONObject != null) {
                uefVar.uef = (float) jSONObject.optDouble("width");
                uefVar.f24840oa = (float) jSONObject.optDouble("height");
                uefVar.yo = jSONObject.optBoolean("isLandscape");
            }
            return uefVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        xs = map;
        map.put("subtitle", "description");
        xs.put("source", "source|app.app_name");
        xs.put("screenshot", "dynamic_creative.screenshot");
    }

    public ivm(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.uef = jSONObject;
        this.f24839oa = jSONObject2;
        this.yo = new com.bytedance.sdk.component.adexpress.dynamic.moa.yo(jSONObject2);
        this.moa = uef.uef(jSONObject3);
        this.ivm = com.bytedance.sdk.component.adexpress.dynamic.moa.moa.uef(jSONObject4);
    }

    private void oa(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        com.bytedance.sdk.component.adexpress.dynamic.moa.yo yoVar;
        Object objUef;
        Object objUef2;
        Object objUef3;
        Object objUef4;
        if (bccVar == null || (yoVar = this.yo) == null || (objUef = yoVar.uef("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objUef);
        if (TextUtils.isEmpty(strValueOf) || (objUef2 = this.yo.uef("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objUef2);
        if (TextUtils.isEmpty(strValueOf2) || (objUef3 = this.yo.uef("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objUef3);
        if (TextUtils.isEmpty(strValueOf3) || (objUef4 = this.yo.uef("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objUef4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objUef5 = this.yo.uef("app.app_name");
        Object objUef6 = this.yo.uef("source");
        if (objUef5 == null && objUef6 == null) {
            return;
        }
        if (objUef5 == null) {
            objUef5 = objUef6;
        }
        String strValueOf5 = String.valueOf(objUef5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        bccVar.uef("imageUrl", strValueOf);
        bccVar.uef("title", strValueOf2);
        bccVar.uef("description", strValueOf3);
        bccVar.uef("icon", strValueOf4);
        bccVar.uef("app_name", strValueOf5);
        bccVar.uef(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.moa.bcc uef(double d3, int i5, double d5, String str, cq cqVar) throws JSONException {
        JSONObject jSONObject;
        this.yo.uef();
        try {
            jSONObject = new JSONObject(this.ivm.f24863oa);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVarUef = uef(moa.uef(this.uef, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc) null);
        uef(bccVarUef);
        lw lwVar = new lw(d3, i5, d5, str, cqVar);
        lw.uef uefVar = new lw.uef();
        uef uefVar2 = this.moa;
        uefVar.uef = uefVar2.uef;
        uefVar.f24842oa = uefVar2.f24840oa;
        uefVar.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lwVar.uef(uefVar);
        lwVar.uef(bccVarUef, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        lwVar.uef();
        com.bytedance.sdk.component.adexpress.dynamic.moa.oa oaVar = lwVar.uef;
        if (oaVar.moa == 65536.0f) {
            return null;
        }
        return oaVar.ivm;
    }

    private void uef(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        int iUef;
        if (bccVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo() != null) {
            iUef = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().ab();
        } else {
            iUef = com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef());
        }
        int iOa = com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef(), iUef);
        uef uefVar = this.moa;
        float fMin = uefVar.yo ? uefVar.uef : Math.min(uefVar.uef, iOa);
        if (this.moa.f24840oa == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            bccVar.lw(fMin);
            bccVar.zjm().lw().zjm("auto");
            bccVar.ivm(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            bccVar.lw(fMin);
            int iOa2 = com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef(), com.bytedance.sdk.component.adexpress.moa.xs.oa(com.bytedance.sdk.component.adexpress.moa.uef()));
            uef uefVar2 = this.moa;
            bccVar.ivm(uefVar2.yo ? uefVar2.f24840oa : Math.min(uefVar2.f24840oa, iOa2));
            bccVar.zjm().lw().zjm("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.moa.bcc uef(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) throws JSONException {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.ivm != null) {
                yo yoVar = new yo();
                this.lw = yoVar;
                JSONObject jSONObjectUef = yoVar.uef(this.ivm.uef, iOptInt, jSONObject);
                if (jSONObjectUef != null) {
                    jSONObject = jSONObjectUef;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVarUef = uef(jSONObject);
        bccVarUef.uef(bccVar);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            bccVarUef.uef((List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>) null);
            return bccVarUef;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i5);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = bccVarUef.zjm().lw().jkf();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i10 = 0; i10 < length; i10++) {
                    com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVarUef2 = uef(jSONArrayOptJSONArray2.optJSONObject(i10), bccVarUef);
                    if (com.bytedance.sdk.component.adexpress.moa.oa() && "skip-with-time".equals(bccVarUef.zjm().oa()) && !"transparent".equals(bccVarUef.gzw()) && !TextUtils.isEmpty(bccVarUef.gzw())) {
                        bccVarUef2.yo(bccVarUef.gzw());
                    }
                    arrayList.add(bccVarUef2);
                    arrayList3.add(bccVarUef2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            bccVarUef.uef(arrayList);
        }
        if (arrayList2.size() > 0) {
            bccVarUef.oa(arrayList2);
        }
        return bccVarUef;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.moa.bcc uef(JSONObject jSONObject) throws JSONException {
        String strUef;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        cz.uef(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectUef = cz.uef(strOptString, cz.uef(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar = new com.bytedance.sdk.component.adexpress.dynamic.moa.bcc();
        if (TextUtils.isEmpty(strOptString2)) {
            bccVar.oa(String.valueOf(bccVar.hashCode()));
        } else {
            bccVar.oa(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            oa(bccVar);
            bccVar.yo((float) jSONObjectOptJSONObject.optDouble("x"));
            bccVar.moa((float) jSONObjectOptJSONObject.optDouble("y"));
            bccVar.lw((float) jSONObjectOptJSONObject.optDouble("width"));
            bccVar.ivm((float) jSONObjectOptJSONObject.optDouble("height"));
            bccVar.xs(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.moa.lw lwVar = new com.bytedance.sdk.component.adexpress.dynamic.moa.lw();
            lwVar.uef(strOptString);
            lwVar.oa(jSONObjectOptJSONObject.optString(JsonStorageKeyNames.DATA_KEY));
            lwVar.yo(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarUef = com.bytedance.sdk.component.adexpress.dynamic.moa.ivm.uef(jSONObjectOptJSONObject);
            lwVar.uef(ivmVarUef);
            com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarUef2 = com.bytedance.sdk.component.adexpress.dynamic.moa.ivm.uef(jSONObjectUef);
            if (ivmVarUef2 == null) {
                lwVar.oa(ivmVarUef);
            } else {
                lwVar.oa(ivmVarUef2);
            }
            uef(ivmVarUef);
            uef(ivmVarUef2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.f24839oa) != null) {
                uef(lwVar, jSONObject2.optInt("image_mode"));
            }
            String strOa = lwVar.oa();
            com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw = lwVar.lw();
            if (xs.containsKey(strOa) && !ivmVarLw.dv()) {
                ivmVarLw.dhk(xs.get(strOa));
            }
            if (ivmVarLw.dv()) {
                strUef = lwVar.yo();
            } else {
                strUef = uef(lwVar.yo());
            }
            if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                if (TextUtils.equals(strOa, "star") || TextUtils.equals(strOa, "text_star")) {
                    strUef = uef("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strOa, "score-count") || TextUtils.equals(strOa, "score-count-type-1") || TextUtils.equals(strOa, "score-count-type-2")) {
                    strUef = uef("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strOa) && ivmVarUef.ykf()) {
                    strUef = uef("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(uef()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                StringBuilder sbQ = AbstractC0279p0.q(strUef, "adx:");
                sbQ.append(uef());
                lwVar.oa(sbQ.toString());
            } else {
                lwVar.oa(strUef);
            }
            bccVar.uef(lwVar);
        }
        return bccVar;
    }

    private void uef(com.bytedance.sdk.component.adexpress.dynamic.moa.lw lwVar, int i5) throws JSONException {
        int iLastIndexOf;
        if (i5 != 5 && i5 != 15 && i5 != 50 && i5 != 154) {
            lwVar.uef("image");
            String strUef = cz.uef("image");
            com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw = lwVar.lw();
            ivmVarLw.dhk(strUef);
            lwVar.xs().dhk(strUef);
            String strUef2 = cz.uef("image", "clickArea");
            if (!TextUtils.isEmpty(strUef2)) {
                ivmVarLw.wk(strUef2);
                lwVar.xs().wk(strUef2);
            }
            JSONObject jSONObjectLpy = ivmVarLw.lpy();
            if (jSONObjectLpy != null) {
                ivmVarLw.gzw(jSONObjectLpy.optString("imageLottieTosPath"));
                ivmVarLw.wrv(jSONObjectLpy.optBoolean("animationsLoop"));
                ivmVarLw.gr(jSONObjectLpy.optInt("lottieAppNameMaxLength"));
                ivmVarLw.pz(jSONObjectLpy.optInt("lottieAdDescMaxLength"));
                ivmVarLw.ue(jSONObjectLpy.optInt("lottieAdTitleMaxLength"));
            }
            lwVar.oa(strUef);
            if (strUef != null && (iLastIndexOf = strUef.lastIndexOf(".")) > 0) {
                String strSubstring = strUef.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", uef(strSubstring + ".width"));
                    jSONObject.put("height", uef(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                lwVar.yo(jSONObject.toString());
            }
            ivmVarLw.uxr();
            return;
        }
        lwVar.uef(MimeTypes.BASE_TYPE_VIDEO);
        String strUef3 = cz.uef(MimeTypes.BASE_TYPE_VIDEO);
        lwVar.lw().dhk(strUef3);
        String strUef4 = cz.uef(MimeTypes.BASE_TYPE_VIDEO, "clickArea");
        if (!TextUtils.isEmpty(strUef4)) {
            lwVar.lw().wk(strUef4);
            lwVar.xs().wk(strUef4);
        }
        lwVar.xs().dhk(strUef3);
        lwVar.oa(strUef3);
        lwVar.lw().df();
    }

    private String uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.yo.oa(str2)) {
                String strValueOf = String.valueOf(this.yo.uef(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String uef() {
        Object objUef;
        com.bytedance.sdk.component.adexpress.dynamic.moa.yo yoVar = this.yo;
        return (yoVar == null || (objUef = yoVar.uef("adx_name")) == null) ? "" : String.valueOf(objUef);
    }

    private void uef(com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        String strCp = ivmVar.cp();
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            String strYo = com.bytedance.sdk.component.adexpress.moa.xs.yo(com.bytedance.sdk.component.adexpress.moa.uef());
            if ("zh".equals(strYo)) {
                strYo = "cn";
            }
            if (!TextUtils.isEmpty(strYo) && ivmVar.ivm() != null) {
                String strOptString = ivmVar.ivm().optString(strYo);
                if (!TextUtils.isEmpty(strOptString)) {
                    strCp = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strCp)) {
            return;
        }
        int iIndexOf = strCp.indexOf("{{");
        int iIndexOf2 = strCp.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strUef = uef(strCp.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb2 = new StringBuilder(strCp.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strUef)) {
                sb2.append(strUef);
            }
            sb2.append(strCp.substring(iIndexOf2 + 2));
            ivmVar.wrv(sb2.toString());
            return;
        }
        ivmVar.wrv(strCp);
    }
}
