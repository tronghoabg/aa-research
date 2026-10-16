package com.bytedance.adsdk.ugeno.moa;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.moa.ivm;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wrv {
    public static ivm.uef uef(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ivm.uef uefVar = new ivm.uef();
        String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(str, jSONObject);
        if (strUef.contains("#")) {
            strUef = strUef.replace("#", "%23");
        }
        Uri uri = Uri.parse(strUef);
        if (uri == null) {
            return null;
        }
        uefVar.yo(strUef);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            uefVar.uef(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        uefVar.oa(authority);
        uefVar.moa(uefVar.uef() + "://" + uefVar.oa());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.yo.oa.uef(uri.getQueryParameter(str2), jSONObject));
            }
        }
        uefVar.uef(map);
        return uefVar;
    }

    public static ivm.uef uef(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        ivm.uef uefVar = new ivm.uef();
        String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("protocol"), jSONObject2);
        uefVar.oa(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString(MediationMetaData.KEY_NAME), jSONObject2));
        if (TextUtils.isEmpty(strUef)) {
            uefVar.uef("global");
        } else {
            uefVar.uef(strUef);
        }
        uefVar.moa(uefVar.uef() + "://" + uefVar.oa());
        uefVar.yo(String.valueOf(jSONObject.hashCode()));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("args");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObjectOptJSONObject.opt(next), jSONObject2));
            }
        }
        uefVar.uef(map);
        return uefVar;
    }
}
