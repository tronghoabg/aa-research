package com.applovin.impl.sdk.network;

import A7.AbstractC0279p0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v4;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f23201a;

    /* renamed from: b, reason: collision with root package name */
    private String f23202b;

    /* renamed from: c, reason: collision with root package name */
    private String f23203c;

    /* renamed from: d, reason: collision with root package name */
    private String f23204d;

    /* renamed from: e, reason: collision with root package name */
    private Map f23205e;

    /* renamed from: f, reason: collision with root package name */
    private Map f23206f;

    /* renamed from: g, reason: collision with root package name */
    private Map f23207g;

    /* renamed from: h, reason: collision with root package name */
    private v4.a f23208h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23209i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23210j;
    private boolean k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23211l;

    /* renamed from: m, reason: collision with root package name */
    private String f23212m;

    /* renamed from: n, reason: collision with root package name */
    private int f23213n;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f23214a;

        /* renamed from: b, reason: collision with root package name */
        private String f23215b;

        /* renamed from: c, reason: collision with root package name */
        private String f23216c;

        /* renamed from: d, reason: collision with root package name */
        private String f23217d;

        /* renamed from: e, reason: collision with root package name */
        private Map f23218e;

        /* renamed from: f, reason: collision with root package name */
        private Map f23219f;

        /* renamed from: g, reason: collision with root package name */
        private Map f23220g;

        /* renamed from: h, reason: collision with root package name */
        private v4.a f23221h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f23222i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f23223j;
        private boolean k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f23224l;

        public b a(String str) {
            this.f23217d = str;
            return this;
        }

        public b b(String str) {
            this.f23214a = str;
            return this;
        }

        public b c(String str) {
            this.f23215b = str;
            return this;
        }

        public b d(String str) {
            this.f23216c = str;
            return this;
        }

        public b a(Map map) {
            this.f23219f = map;
            return this;
        }

        public b b(Map map) {
            this.f23218e = map;
            return this;
        }

        public b c(Map map) {
            this.f23220g = map;
            return this;
        }

        public b d(boolean z2) {
            this.k = z2;
            return this;
        }

        public b a(v4.a aVar) {
            this.f23221h = aVar;
            return this;
        }

        public b b(boolean z2) {
            this.f23224l = z2;
            return this;
        }

        public b c(boolean z2) {
            this.f23223j = z2;
            return this;
        }

        public b a(boolean z2) {
            this.f23222i = z2;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public static b b() {
        return new b();
    }

    public void a() {
        Map map = CollectionUtils.map(this.f23205e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f23205e = map;
    }

    public int c() {
        return this.f23213n;
    }

    public String d() {
        return this.f23204d;
    }

    public String e() {
        return this.f23212m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f23201a.equals(((d) obj).f23201a);
    }

    public v4.a f() {
        return this.f23208h;
    }

    public Map g() {
        return this.f23206f;
    }

    public String h() {
        return this.f23202b;
    }

    public int hashCode() {
        return this.f23201a.hashCode();
    }

    public Map i() {
        return this.f23205e;
    }

    public Map j() {
        return this.f23207g;
    }

    public String k() {
        return this.f23203c;
    }

    public void l() {
        this.f23213n++;
    }

    public boolean m() {
        return this.k;
    }

    public boolean n() {
        return this.f23209i;
    }

    public boolean o() {
        return this.f23210j;
    }

    public boolean p() {
        return this.f23211l;
    }

    public JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f23201a);
        jSONObject.put("communicatorRequestId", this.f23212m);
        jSONObject.put("httpMethod", this.f23202b);
        jSONObject.put("targetUrl", this.f23203c);
        jSONObject.put("backupUrl", this.f23204d);
        jSONObject.put("encodingType", this.f23208h);
        jSONObject.put("isEncodingEnabled", this.f23209i);
        jSONObject.put("gzipBodyEncoding", this.f23210j);
        jSONObject.put("isAllowedPreInitEvent", this.k);
        jSONObject.put("attemptNumber", this.f23213n);
        if (this.f23205e != null) {
            jSONObject.put("parameters", new JSONObject(this.f23205e));
        }
        if (this.f23206f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f23206f));
        }
        if (this.f23207g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f23207g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostbackRequest{uniqueId='");
        sb2.append(this.f23201a);
        sb2.append("', communicatorRequestId='");
        sb2.append(this.f23212m);
        sb2.append("', httpMethod='");
        sb2.append(this.f23202b);
        sb2.append("', targetUrl='");
        sb2.append(this.f23203c);
        sb2.append("', backupUrl='");
        sb2.append(this.f23204d);
        sb2.append("', attemptNumber=");
        sb2.append(this.f23213n);
        sb2.append(", isEncodingEnabled=");
        sb2.append(this.f23209i);
        sb2.append(", isGzipBodyEncoding=");
        sb2.append(this.f23210j);
        sb2.append(", isAllowedPreInitEvent=");
        sb2.append(this.k);
        sb2.append(", shouldFireInWebView=");
        return AbstractC0279p0.p(sb2, this.f23211l, '}');
    }

    public d(JSONObject jSONObject, k kVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i5 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? DesugarCollections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? DesugarCollections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? DesugarCollections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f23201a = string;
        this.f23202b = string3;
        this.f23212m = string2;
        this.f23203c = string4;
        this.f23204d = string5;
        this.f23205e = mapSynchronizedMap;
        this.f23206f = mapSynchronizedMap2;
        this.f23207g = mapSynchronizedMap3;
        this.f23208h = v4.a.a(jSONObject.optInt("encodingType", v4.a.DEFAULT.b()));
        this.f23209i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f23210j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f23211l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f23213n = i5;
    }

    private d(b bVar) {
        this.f23201a = UUID.randomUUID().toString();
        this.f23202b = bVar.f23215b;
        this.f23203c = bVar.f23216c;
        this.f23204d = bVar.f23217d;
        this.f23205e = bVar.f23218e;
        this.f23206f = bVar.f23219f;
        this.f23207g = bVar.f23220g;
        this.f23208h = bVar.f23221h;
        this.f23209i = bVar.f23222i;
        this.f23210j = bVar.f23223j;
        this.k = bVar.k;
        this.f23211l = bVar.f23224l;
        this.f23212m = bVar.f23214a;
        this.f23213n = 0;
    }
}
