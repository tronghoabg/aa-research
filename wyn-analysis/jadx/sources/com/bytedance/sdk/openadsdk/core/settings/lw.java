package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.dhk;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface lw {
    public static final oa<JSONObject> uef = new oa<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.lw.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.lw.oa
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public JSONObject oa(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e7) {
                dhk.uef("ISettingsDataRepository", "", e7);
                return null;
            }
        }
    };

    /* renamed from: oa, reason: collision with root package name */
    public static final oa<Set<String>> f25746oa = new oa<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.lw.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.lw.oa
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public Set<String> oa(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    hashSet.add(jSONArray.getString(i5));
                }
            } catch (Exception e7) {
                dhk.uef("ISettingsDataRepository", "", e7);
            }
            return hashSet;
        }
    };

    public interface oa<T> {
        T oa(String str);
    }

    public interface uef {
        uef uef(String str);

        uef uef(String str, float f10);

        uef uef(String str, int i5);

        uef uef(String str, long j8);

        uef uef(String str, String str2);

        uef uef(String str, boolean z2);

        void uef();
    }

    void uef(JSONObject jSONObject);
}
