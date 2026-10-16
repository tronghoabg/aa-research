package com.bytedance.adsdk.uef.oa.oa.uef;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes.dex */
public class orq implements com.bytedance.adsdk.uef.oa.oa.uef {
    private final String uef;

    public orq(String str) {
        this.uef = str;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public String oa() {
        return this.uef;
    }

    public String toString() {
        return b.c(new StringBuilder("VariableNode [literals="), this.uef, "]");
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        Object objUef;
        if (map == null || map.size() <= 0 || (objUef = uef(this.uef, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objUef;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public com.bytedance.adsdk.uef.oa.moa.lw uef() {
        return com.bytedance.adsdk.uef.oa.moa.ivm.VARIABLE;
    }

    public Object uef(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return uef(str.split("\\."), 0, jSONObject);
    }

    private Object uef(String[] strArr, int i5, JSONObject jSONObject) throws NumberFormatException {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i5 < strArr.length && jSONObject != null) {
            String str = strArr[i5];
            int iIndexOf = str.indexOf("[");
            int iIndexOf2 = str.indexOf("]");
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i10 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i10) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i5 == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return uef(strArr, i5 + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return uef(strArr, i5 + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
