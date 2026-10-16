package com.bytedance.adsdk.uef;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class wk implements zjm {
    @Override // com.bytedance.adsdk.uef.zjm
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public String uef(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        return null;
    }
}
