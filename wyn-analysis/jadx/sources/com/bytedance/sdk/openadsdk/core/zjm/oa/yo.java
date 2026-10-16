package com.bytedance.sdk.openadsdk.core.zjm.oa;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.component.reward.yo.bcc;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.model.dxx;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.oib;
import com.bytedance.sdk.openadsdk.core.model.sy;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {

    /* renamed from: oa, reason: collision with root package name */
    private static String f25863oa = "";
    public static String uef = "https://pag_open_icon_id/appicon.png";

    public static JSONObject oa() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", cq.oa());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            oyt.oa(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e7) {
            dhk.yo("TemplateUtils", e7.getMessage());
            return jSONObject;
        }
    }

    public static String uef() {
        return f25863oa;
    }

    public static boolean yo() {
        return true;
    }

    public static JSONObject uef(float f10, float f11, boolean z2, gzw gzwVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z2) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", uef(false, gzwVar));
            jSONObject.put("template_Plugin", oa(gzwVar.vep()));
            jSONObject.put("diff_template_Plugin", uef(gzwVar.vep()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject yo(gzw gzwVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            oyt.uef(jSONObject, gzwVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String oa(gzw.uef uefVar) {
        com.bytedance.sdk.component.adexpress.uef.yo.oa oaVarYo;
        if (uefVar != null) {
            String strXs = uefVar.xs();
            return (!TextUtils.isEmpty(strXs) || (oaVarYo = com.bytedance.sdk.component.adexpress.uef.oa.oa.yo(uefVar.moa())) == null) ? strXs : oaVarYo.lw();
        }
        return "";
    }

    public static JSONObject uef(gzw gzwVar) {
        return uef(gzwVar, false, (JSONObject) null);
    }

    public static JSONObject uef(gzw gzwVar, boolean z2, JSONObject jSONObject) {
        JSONObject jSONObjectUef = null;
        if (gzwVar == null) {
            return null;
        }
        try {
            jSONObjectUef = uef(gzwVar, false, z2);
            if (jSONObjectUef == null) {
                jSONObjectUef = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            oyt.oa(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObjectUef.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectUef.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectOa = oyt.oa(gzwVar);
            jSONObjectOa.put("language", cq.oa());
            jSONObjectUef.put("xSetting", jSONObjectOa);
            return jSONObjectUef;
        } catch (Throwable th) {
            th.getMessage();
            return jSONObjectUef;
        }
    }

    public static Map<String, String> oa(gzw gzwVar) {
        HashMap map = null;
        if (gzwVar == null) {
            return null;
        }
        List<sy> listLpy = gzwVar.lpy();
        if (listLpy != null && listLpy.size() > 0) {
            map = new HashMap();
            for (sy syVar : listLpy) {
                if (syVar != null) {
                    map.put(syVar.uef(), syVar.xs());
                }
            }
            sy syVarIfk = gzwVar.ifk();
            if (syVarIfk != null) {
                map.put(syVarIfk.uef(), syVarIfk.xs());
            }
        }
        return map;
    }

    private static JSONObject uef(gzw gzwVar, boolean z2, boolean z10) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (gzwVar != null) {
            try {
                String strCd = gzwVar.cd();
                if (strCd != null) {
                    JSONObject jSONObject2 = new JSONObject(strCd);
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("creatives");
                    if (!z2 && !z10) {
                        jSONObject = new JSONObject();
                    } else {
                        JSONObject jSONObject3 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= gzwVar.yo() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(gzwVar.yo())) == null) ? null : new JSONObject(jSONObjectOptJSONObject.toString());
                        if (jSONObject3 == null) {
                            return null;
                        }
                        jSONObject = jSONObject3;
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th) {
                dhk.uef("TemplateUtils", "filterTemplateInfo", th);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject uef(float f10, float f11, boolean z2, gzw gzwVar, String str, com.bytedance.sdk.openadsdk.core.cq.xs.yo yoVar) throws JSONException {
        f25863oa = "";
        if (gzwVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectUef = uef(f10, f11, z2, gzwVar, str);
            if (yoVar != null) {
                yoVar.uef("adv3");
            }
            dxx dxxVarAje = gzwVar.aje();
            if (dxxVarAje != null) {
                String strMoa = dxxVarAje.moa();
                if (!TextUtils.isEmpty(strMoa)) {
                    jSONObjectUef.put("xTemplate", new JSONObject(strMoa));
                    f25863oa = "getTemplate success by local data";
                    if (yoVar != null) {
                        yoVar.oa(ServiceProvider.NAMED_LOCAL);
                        return jSONObjectUef;
                    }
                } else {
                    String strUef = com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef("adv3", dxxVarAje.uef(), dxxVarAje.oa());
                    if (!TextUtils.isEmpty(strUef)) {
                        jSONObjectUef.put("xTemplate", new JSONObject(strUef));
                        f25863oa = "getTemplate success by db data";
                        if (yoVar != null) {
                            yoVar.oa(ServiceProvider.NAMED_LOCAL);
                            return jSONObjectUef;
                        }
                    } else {
                        String str2 = "local db data is null id is " + dxxVarAje.uef() + " md5 is " + dxxVarAje.oa();
                        f25863oa = str2;
                        if (yoVar != null) {
                            yoVar.uef(3, str2, "net");
                        }
                    }
                }
            }
            return jSONObjectUef;
        } catch (Exception e7) {
            String str3 = "load template exception " + e7.getMessage();
            f25863oa = str3;
            if (yoVar != null) {
                yoVar.uef(3, str3, "net");
            }
            return null;
        }
    }

    public static JSONObject uef(float f10, float f11, boolean z2, gzw gzwVar, String str) {
        if (gzwVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectUef = uef(gzwVar, true, true);
            if (jSONObjectUef == null) {
                return null;
            }
            try {
                if (!bcc.uef(gzwVar)) {
                    uef(jSONObjectUef, gzwVar, str);
                }
                JSONObject jSONObjectOa = oyt.oa(gzwVar);
                jSONObjectOa.put("language", cq.oa());
                jSONObjectUef.put("xSetting", jSONObjectOa);
                jSONObjectUef.put("xAdInfo", uef(str, yo(gzwVar), gzwVar));
                JSONObject jSONObject = new JSONObject();
                oyt.oa(jSONObject);
                jSONObject.put("platform", "android");
                jSONObjectUef.put("xAppInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", f10);
                jSONObject2.put("height", f11);
                if (z2) {
                    jSONObject2.put("isLandscape", true);
                }
                jSONObjectUef.put("xSize", jSONObject2);
                return jSONObjectUef;
            } catch (Throwable unused) {
                return jSONObjectUef;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void uef(JSONObject jSONObject, gzw gzwVar, String str) throws JSONException {
        if (gzwVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = gzwVar.nj();
            if (oaVarNj != null) {
                JSONObject jSONObjectSy = oaVarNj.sy();
                jSONObjectSy.put("video_duration", oaVarNj.ivm() * oaVarNj.orq());
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, jSONObjectSy);
            } else if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("video_duration", com.bytedance.sdk.openadsdk.core.sy.moa().gsd(String.valueOf(gzwVar.jnk())));
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, jSONObject2);
            }
        } catch (Exception e7) {
            e7.getMessage();
        }
    }

    private static JSONObject uef(String str, JSONObject jSONObject, gzw gzwVar) throws JSONException {
        if (gzwVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", zjm.oa().bcc());
                    int iCz = zjm.oa().cz();
                    if (iCz != 0) {
                        int iIx = gzwVar.ix();
                        if (9 == iIx || 11 == iIx) {
                            jSONObject2.put("app_icon", uef);
                        } else if (10 == iIx) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(iCz)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject uef(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i5);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String uef(gzw.uef uefVar) {
        if (uefVar != null) {
            return uefVar.bcc();
        }
        return "";
    }

    public static JSONObject uef(boolean z2, gzw gzwVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", gzwVar.kik());
            if (gzwVar.ifk() != null) {
                if (gzwVar.ifk() != null && !TextUtils.isEmpty(gzwVar.ifk().uef())) {
                    jSONObject.put("icon", gzwVar.ifk().uef());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (gzwVar.lpy() != null) {
                for (int i5 = 0; i5 < gzwVar.lpy().size(); i5++) {
                    sy syVar = gzwVar.lpy().get(i5);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", syVar.yo());
                    jSONObject2.put("width", syVar.oa());
                    jSONObject2.put("url", syVar.uef());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", gzwVar.hw());
            jSONObject.put("interaction_type", gzwVar.ykf());
            jSONObject.put("interaction_method", gzwVar.hg());
            jSONObject.put("is_compliance_template", yo());
            jSONObject.put("title", gzwVar.xw());
            jSONObject.put("description", gzwVar.az());
            jSONObject.put("source", gzwVar.jp());
            JSONObject jSONObject3 = new JSONObject();
            oib oibVarGr = gzwVar.gr();
            if (oibVarGr == null) {
                oibVarGr = new oib();
            }
            jSONObject3.put("ceiling_time", oibVarGr.moa());
            jSONObject3.put("ceiling_ratio", oibVarGr.lw());
            jSONObject3.put("expand_ratio", oibVarGr.ivm());
            jSONObject.put("interaction_params", jSONObject3);
            if (gzwVar.no() != null) {
                jSONObject.put("comment_num", gzwVar.no().lw());
                jSONObject.put("score", gzwVar.no().moa());
                jSONObject.put("app_size", gzwVar.no().ivm());
                jSONObject.put("app", gzwVar.no().bcc());
            }
            com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = gzwVar.nj();
            if (oaVarNj != null) {
                JSONObject jSONObjectSy = oaVarNj.sy();
                jSONObjectSy.put("video_duration", oaVarNj.ivm() * oaVarNj.orq());
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, jSONObjectSy);
            }
            if (gzwVar.vep() != null) {
                jSONObject.put("dynamic_creative", gzwVar.vep().cz());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String uef(gzw gzwVar, String str) {
        List<sy> listLpy;
        if (gzwVar != null && (listLpy = gzwVar.lpy()) != null && listLpy.size() > 0) {
            for (sy syVar : listLpy) {
                if (syVar != null && TextUtils.equals(str, syVar.uef())) {
                    return syVar.xs();
                }
            }
        }
        return null;
    }
}
