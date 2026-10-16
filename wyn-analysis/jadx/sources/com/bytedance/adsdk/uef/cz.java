package com.bytedance.adsdk.uef;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class cz implements zjm {
    @Override // com.bytedance.adsdk.uef.zjm
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public Boolean uef(JSONObject jSONObject, Object[] objArr) throws NumberFormatException {
        if (objArr == null || objArr.length <= 0) {
            return Boolean.FALSE;
        }
        try {
            Double.parseDouble(String.valueOf(objArr[0]));
            return Boolean.TRUE;
        } catch (NumberFormatException unused) {
            return Boolean.FALSE;
        }
    }
}
