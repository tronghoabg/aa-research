package com.bytedance.sdk.openadsdk.wrv.uef;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.gb;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dhk extends com.bytedance.sdk.component.uef.sy<JSONObject, JSONObject> {
    public static final HashSet<String> uef = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));

    /* renamed from: oa, reason: collision with root package name */
    private gzw f26175oa;

    public dhk(gzw gzwVar) {
        this.f26175oa = gzwVar;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, gzw gzwVar) {
        wkVar.uef(uef, new dhk(gzwVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        String strOq;
        JSONObject jSONObject2;
        String str2;
        gzw gzwVar = this.f26175oa;
        if (gzwVar == null || (strOq = gzwVar.oq()) == null) {
            return null;
        }
        jSONObject2 = new JSONObject();
        str.getClass();
        str2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        switch (str) {
            case "getStorageItem":
                String strOptString = jSONObject.optString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
                if (!TextUtils.isEmpty(strOptString) && gb.uef().oa(strOq, strOptString)) {
                    jSONObject2.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, gb.uef().uef(strOq, strOptString));
                    jSONObject2.put("code", "0");
                    break;
                } else {
                    jSONObject2.put("code", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    break;
                }
            case "removeAllStorage":
                gb.uef().uef(strOq);
                jSONObject2.put("code", "0");
                break;
            case "setStorageItem":
                String strOptString2 = jSONObject.optString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
                String strOptString3 = jSONObject.optString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                if (strOptString2 != null) {
                    gb.uef().uef(strOq, strOptString2, strOptString3);
                    jSONObject2.put("code", "0");
                    break;
                } else {
                    jSONObject2.put("code", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    break;
                }
            case "removeStorageItem":
                String strOptString4 = jSONObject.optString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
                if (!TextUtils.isEmpty(strOptString4)) {
                    if (gb.uef().yo(strOq, strOptString4)) {
                        str2 = "0";
                    }
                    jSONObject2.put("code", str2);
                    break;
                } else {
                    jSONObject2.put("code", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    break;
                }
        }
        return null;
    }
}
