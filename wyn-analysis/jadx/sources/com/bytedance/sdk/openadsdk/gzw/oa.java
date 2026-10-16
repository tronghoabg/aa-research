package com.bytedance.sdk.openadsdk.gzw;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface oa {
    public static final uef<JSONObject> uef = new uef<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.gzw.oa.1
        @Override // com.bytedance.sdk.openadsdk.gzw.oa.uef
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public JSONObject oa(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
    };

    public interface uef<T> {
        T oa(String str);
    }
}
