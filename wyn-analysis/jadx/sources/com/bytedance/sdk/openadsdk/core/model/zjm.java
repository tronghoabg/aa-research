package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zjm {

    /* renamed from: oa, reason: collision with root package name */
    private List<String> f25720oa;
    private String uef;

    public zjm(String str) {
        this.uef = "";
        this.f25720oa = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : uef(str);
        try {
            this.uef = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.f25720oa = new ArrayList();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                this.f25720oa.add(jSONArray.optString(i5));
            }
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.yo("AutoTestModel", e7.getMessage());
        }
    }

    public List<String> oa() {
        return this.f25720oa;
    }

    public String uef() {
        return this.uef;
    }

    private static final HashMap<String, Object> uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                map.put(jSONObjectOptJSONObject.optString(MediationMetaData.KEY_NAME), jSONObjectOptJSONObject.optString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
