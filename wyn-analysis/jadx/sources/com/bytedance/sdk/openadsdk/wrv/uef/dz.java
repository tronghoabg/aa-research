package com.bytedance.sdk.openadsdk.wrv.uef;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.uef.yo;
import com.bytedance.sdk.openadsdk.core.gsd;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dz extends com.bytedance.sdk.component.uef.yo<JSONObject, JSONObject> {
    private final WeakReference<oyt> uef;

    public dz(oyt oytVar) {
        this.uef = new WeakReference<>(oytVar);
    }

    public String oa(String str) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme != null) {
                return scheme.toLowerCase();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private Pair<Boolean, JSONObject> oa(JSONObject jSONObject) {
        JSONObject jSONObject2;
        boolean z2;
        if (jSONObject == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (jSONObject.has("cypher") && jSONObject.has(PglCryptUtils.KEY_MESSAGE)) {
            String strUef = gsd.uef(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            if (TextUtils.isEmpty(strUef)) {
                jSONObject2 = jSONObject;
                z2 = false;
            } else {
                try {
                    jSONObject2 = new JSONObject(strUef);
                    z2 = true;
                } catch (JSONException e7) {
                    com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", null, -3, "decryptBody error" + e7.getMessage(), null, null);
                }
            }
            return new Pair<>(Boolean.valueOf(z2), jSONObject2);
        }
        return new Pair<>(Boolean.FALSE, jSONObject);
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, final oyt oytVar) {
        wkVar.uef("request", new yo.oa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.dz.1
            @Override // com.bytedance.sdk.component.uef.yo.oa
            public com.bytedance.sdk.component.uef.yo uef() {
                return new dz(oytVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.uef.yo
    public void uef(JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        oyt oytVar = this.uef.get();
        final JSONObject jSONObject2 = new JSONObject();
        if (oytVar == null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("net_code", Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            jSONObject3.put("msg", "ttAndroidObject is null");
            jSONObject2.put("code", 0);
            jSONObject2.put(JsonStorageKeyNames.DATA_KEY, jSONObject3);
            uef((dz) jSONObject2);
            com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "ttAndroidObject is null", null, null);
            return;
        }
        if (jSONObject == null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("net_code", Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            jSONObject4.put("msg", "params is null");
            jSONObject2.put("code", 0);
            jSONObject2.put(JsonStorageKeyNames.DATA_KEY, jSONObject4);
            uef((dz) jSONObject2);
            com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "params is null", null, null);
            return;
        }
        if (jSONObject.has("url") && jSONObject.has("method")) {
            uef(jSONObject, new com.bytedance.sdk.openadsdk.cq.ivm() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.dz.3
                @Override // com.bytedance.sdk.openadsdk.cq.ivm
                public void uef(int i5, int i10, String str, JSONObject jSONObject5, Object obj, int i11) throws JSONException {
                    try {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("net_code", i10);
                        if (str != null && !str.isEmpty()) {
                            jSONObject6.put("msg", str);
                        }
                        jSONObject6.put("header", jSONObject5);
                        if (obj != null) {
                            jSONObject6.put("response", obj);
                            jSONObject6.put("decode", i11);
                        }
                        jSONObject2.put("code", i5);
                        jSONObject2.put(JsonStorageKeyNames.DATA_KEY, jSONObject6);
                        dz.this.uef((dz) jSONObject2);
                        Objects.toString(obj);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.cq.ivm
                public void uef(int i5, int i10, String str) throws JSONException {
                    try {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("net_code", i10);
                        jSONObject5.put("msg", str);
                        jSONObject2.put("code", i5);
                        jSONObject2.put(JsonStorageKeyNames.DATA_KEY, jSONObject5);
                        dz.this.uef((dz) jSONObject2);
                    } catch (Exception unused) {
                    }
                }
            });
            return;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("net_code", Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
        jSONObject5.put("msg", "url or method is empty");
        jSONObject2.put("code", 0);
        jSONObject2.put(JsonStorageKeyNames.DATA_KEY, jSONObject5);
        uef((dz) jSONObject2);
        com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "url or method is empty", null, null);
    }

    public void uef(JSONObject jSONObject, com.bytedance.sdk.openadsdk.cq.ivm ivmVar) {
        com.bytedance.sdk.openadsdk.cq.ivm ivmVar2;
        Exception exc;
        com.bytedance.sdk.openadsdk.cq.ivm ivmVar3;
        JSONArray jSONArrayOptJSONArray;
        String path;
        try {
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("method");
            Object objOpt = jSONObject.opt("bodyParams");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("header");
            Boolean boolValueOf = Boolean.TRUE;
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("fallbackUrls");
                    if (jSONObjectOptJSONObject.has("encrypt")) {
                        boolValueOf = Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("encrypt"));
                    }
                } catch (Exception e7) {
                    exc = e7;
                    ivmVar3 = ivmVar;
                    try {
                        ivmVar3.uef(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, exc.getMessage());
                    } catch (JSONException e10) {
                        com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "JSONException: " + e10.getMessage(), null, null);
                        return;
                    }
                }
            } else {
                jSONArrayOptJSONArray = null;
            }
            Boolean bool = boolValueOf;
            Map<String, String> mapUef = uef(jSONObjectOptJSONObject2, bool.booleanValue());
            List<String> arrayList = new ArrayList<>();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                arrayList = uef(jSONArrayOptJSONArray);
            }
            List<String> list = arrayList;
            try {
                path = new URL(strOptString).getPath();
            } catch (Exception unused) {
                path = "param is null";
            }
            String str = path;
            try {
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    if (bool.booleanValue() && objOpt != null && !(objOpt instanceof JSONObject)) {
                        ivmVar.uef(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "bodyParams must be JSONObject when encrypt is true");
                        com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", strOptString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "bodyParams must be JSONObject when encrypt is true", str, list);
                        return;
                    }
                    if (!HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(oa(strOptString))) {
                        ivmVar.uef(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "non-https url is not allowed");
                        com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", strOptString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "non-https url is not allowed", str, list);
                        return;
                    }
                    if ("GET".equalsIgnoreCase(strOptString2)) {
                        com.bytedance.sdk.openadsdk.cq.ivm ivmVar4 = ivmVar;
                        uef(strOptString, mapUef, list, str, bool, ivmVar4);
                        ivmVar2 = ivmVar4;
                    } else {
                        com.bytedance.sdk.openadsdk.cq.ivm ivmVar5 = ivmVar;
                        if ("POST".equalsIgnoreCase(strOptString2)) {
                            String str2 = str;
                            try {
                                uef(strOptString, mapUef, list, objOpt, bool, str2, ivmVar5);
                                ivmVar2 = str2;
                            } catch (Exception e11) {
                                e = e11;
                                ivmVar2 = ivmVar5;
                                exc = e;
                                ivmVar3 = ivmVar2;
                                ivmVar3.uef(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, exc.getMessage());
                            }
                        } else {
                            String strConcat = "unsupported method: ".concat(String.valueOf(strOptString2));
                            ivmVar5.uef(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, strConcat);
                            com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", strOptString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, strConcat, str, list);
                            ivmVar2 = ivmVar5;
                        }
                    }
                } else {
                    com.bytedance.sdk.openadsdk.cq.ivm ivmVar6 = ivmVar;
                    ivmVar6.uef(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "null url or method");
                    com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", strOptString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "null url or method", str, list);
                    ivmVar2 = ivmVar6;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            ivmVar2 = ivmVar;
        }
    }

    private Map<String, String> uef(JSONObject jSONObject, boolean z2) {
        HashMap map = new HashMap();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    String strOptString = jSONObject.optString(next, "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        map.put(next, strOptString);
                    }
                }
            }
        }
        if (z2 && !map.containsKey("x-pgli18n")) {
            map.put("x-pgli18n", "4");
        }
        return map;
    }

    private List<String> uef(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                if (HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(oa(jSONArray.optString(i5)))) {
                    arrayList.add(jSONArray.optString(i5));
                }
            }
        }
        return arrayList;
    }

    private JSONObject uef(JSONObject jSONObject) {
        return gsd.uef(PangleEncryptConstant.CryptDataScene.JSB_REQUEST, jSONObject);
    }

    private void uef(final String str, Map<String, String> map, final List<String> list, final String str2, final Boolean bool, final com.bytedance.sdk.openadsdk.cq.ivm ivmVar) {
        com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
        uef(oaVarYo, "jsb_request", str2);
        oaVarYo.yo(str);
        if (map != null && !map.isEmpty()) {
            oaVarYo.moa(map);
        }
        if (com.bytedance.sdk.openadsdk.utils.oa.oa() && !list.isEmpty()) {
            oaVarYo.uef(list);
            oaVarYo.uef(60L, TimeUnit.SECONDS);
        }
        oaVarYo.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.dz.4
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) throws JSONException {
                dz.this.uef(oaVar, str2, bool, ivmVar);
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                dz.this.uef(iOException.getMessage(), str2, ivmVar);
                com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", str, iOException.hashCode(), iOException.getMessage(), str2, list);
            }
        });
    }

    private void uef(final String str, Map<String, String> map, final List<String> list, Object obj, final Boolean bool, final String str2, final com.bytedance.sdk.openadsdk.cq.ivm ivmVar) {
        String str3;
        String str4;
        List<String> list2;
        Exception exc;
        JSONObject jSONObjectUef;
        try {
            com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
            uef(moaVarOa, "jsb_request", str2);
            moaVarOa.yo(str);
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        moaVarOa.moa(map);
                    }
                } catch (Exception e7) {
                    str3 = str;
                    exc = e7;
                    str4 = str2;
                    list2 = list;
                    com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", str3, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "executePostRequest error" + exc.getMessage(), str4, list2);
                }
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    if (bool.booleanValue()) {
                        jSONObjectUef = uef((JSONObject) obj);
                    } else {
                        jSONObjectUef = (JSONObject) obj;
                    }
                    moaVarOa.uef(jSONObjectUef);
                } else {
                    moaVarOa.uef(new JSONObject(obj.toString()));
                }
            } else {
                moaVarOa.uef(new JSONObject());
            }
            if (com.bytedance.sdk.openadsdk.utils.oa.oa() && !list.isEmpty()) {
                moaVarOa.uef(list);
                moaVarOa.uef(60L, TimeUnit.SECONDS);
            }
            try {
                com.bytedance.sdk.component.xs.uef.uef uefVar = new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.dz.5
                    @Override // com.bytedance.sdk.component.xs.uef.uef
                    public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) throws JSONException {
                        dz.this.uef(oaVar, str2, bool, ivmVar);
                    }

                    @Override // com.bytedance.sdk.component.xs.uef.uef
                    public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                        dz.this.uef(iOException.getMessage(), str2, ivmVar);
                        com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", str, iOException.hashCode(), iOException.getMessage(), str2, list);
                    }
                };
                str4 = str2;
                str3 = str;
                list2 = list;
                try {
                    moaVarOa.oa(uefVar);
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", str3, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "executePostRequest error" + exc.getMessage(), str4, list2);
                }
            } catch (Exception e11) {
                e = e11;
                str4 = str2;
                str3 = str;
                list2 = list;
            }
        } catch (Exception e12) {
            e = e12;
            str3 = str;
            str4 = str2;
            list2 = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2 A[Catch: Exception -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0041, blocks: (B:8:0x0019, B:9:0x0021, B:11:0x0027, B:14:0x003d, B:21:0x004e, B:27:0x0063, B:29:0x0069, B:30:0x006e, B:32:0x007c, B:34:0x0080, B:41:0x008f, B:49:0x00a2), top: B:80:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(com.bytedance.sdk.component.xs.oa r11, final java.lang.String r12, java.lang.Boolean r13, com.bytedance.sdk.openadsdk.cq.ivm r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.wrv.uef.dz.uef(com.bytedance.sdk.component.xs.oa, java.lang.String, java.lang.Boolean, com.bytedance.sdk.openadsdk.cq.ivm):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str, final String str2, com.bytedance.sdk.openadsdk.cq.ivm ivmVar) {
        if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
            com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.dz.9
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("jsb_request");
                    if (!TextUtils.isEmpty(str2)) {
                        uefVarF.xs(str2);
                    }
                    return uefVarF;
                }
            });
        }
        try {
            ivmVar.uef(1, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, str);
        } catch (JSONException e7) {
            com.bytedance.sdk.openadsdk.ab.uef.lw.oa("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "JSONException: " + e7.getMessage(), null, null);
        }
    }

    private void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, final String str, final String str2) {
        if (!com.bytedance.sdk.openadsdk.utils.oa.uef()) {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.dz.10
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                    uefVar.oa(str);
                    if (!TextUtils.isEmpty(str2)) {
                        uefVar.xs(str2);
                    }
                    return uefVar;
                }
            });
        } else {
            yoVar.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.dz.2
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                    uefVar.oa(str);
                    if (!TextUtils.isEmpty(str2)) {
                        uefVar.xs(str2);
                    }
                    return uefVar;
                }
            });
        }
    }
}
