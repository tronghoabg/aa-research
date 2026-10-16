package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21800a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21801b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21802c;

    public k1(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f21800a = JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, "");
        this.f21801b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f21802c = o7.a(list);
        } else {
            this.f21802c = o7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f21801b;
    }

    public String b() {
        return this.f21800a;
    }

    public boolean c() {
        return this.f21802c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || o7.a(str2, str) != 1) {
            return str3 == null || o7.a(str3, str) != -1;
        }
        return false;
    }
}
