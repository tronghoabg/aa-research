package com.bytedance.adsdk.uef;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lw implements zjm {
    @Override // com.bytedance.adsdk.uef.zjm
    public Object uef(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && !TextUtils.equals(strValueOf, "null")) {
                    return strValueOf;
                }
            }
        }
        return null;
    }
}
