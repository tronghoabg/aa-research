package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1671w0 extends C1669v0 {
    public C1671w0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public List f() {
        C1673x0 c1673x0A;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f23375b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i5, (JSONObject) null);
            if (jSONObject != null && (c1673x0A = C1673x0.a(jSONObject, this.f23374a)) != null) {
                arrayList.add(c1673x0A);
            }
        }
        return arrayList;
    }

    public String g() {
        return b(PglCryptUtils.KEY_MESSAGE);
    }

    public String h() {
        return b("title");
    }

    @Override // com.applovin.impl.C1669v0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", title=" + h() + ", message=" + g() + ", actions=" + f() + "}";
    }
}
