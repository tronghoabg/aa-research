package com.applovin.impl;

import Va.M6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b7 {

    /* renamed from: a, reason: collision with root package name */
    private final a f21157a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f21158b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21159c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21160d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f21161e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i5) {
            return i5 != 0 ? i5 != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public b7(JSONObject jSONObject, String str) {
        this.f21160d = str;
        this.f21157a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f21158b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f21159c = JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, null);
    }

    public void a(Boolean bool) {
        this.f21161e = bool;
    }

    public String b() {
        return this.f21160d;
    }

    public String c() {
        return this.f21159c;
    }

    public Integer d() {
        return this.f21158b;
    }

    public String e() {
        Boolean bool = this.f21161e;
        return M6.t(new StringBuilder("\n"), this.f21160d, " - ", bool != null ? String.valueOf(bool) : AbstractC1656p0.b().a(com.applovin.impl.sdk.k.o()));
    }

    public a f() {
        return this.f21157a;
    }

    public Boolean a() {
        return this.f21161e;
    }
}
