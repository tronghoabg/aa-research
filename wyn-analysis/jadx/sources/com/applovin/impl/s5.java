package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class s5 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    protected final C1666u f22779g;

    /* renamed from: h, reason: collision with root package name */
    private final String f22780h;

    public s5(C1666u c1666u, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f22779g = c1666u;
        this.f22780h = kVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f22779g.e());
        if (this.f22779g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f22779g.f().getLabel());
        }
        if (this.f22779g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f22779g.g().getLabel());
        }
        return map;
    }

    public abstract j5 a(JSONObject jSONObject);

    public void a(int i5, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "Unable to fetch " + this.f22779g + " ad: server returned " + i5);
        }
        this.f21766a.g().a(d2.f21351y, this.f22779g, new AppLovinError(i5, str));
    }

    public void b(JSONObject jSONObject) {
        AbstractC1659r0.c(jSONObject, this.f21766a);
        AbstractC1659r0.b(jSONObject, this.f21766a);
        AbstractC1659r0.a(jSONObject, this.f21766a);
        C1666u.a(jSONObject);
        this.f21766a.r0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap map = new HashMap(4);
        map.put("zone_id", this.f22779g.e());
        if (this.f22779g.f() != null) {
            map.put("size", this.f22779g.f().getLabel());
        }
        if (this.f22779g.g() != null) {
            map.put("require", this.f22779g.g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        v4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Fetching next ad of zone: " + this.f22779g);
        }
        if (((Boolean) this.f21766a.a(y4.f23739Y3)).booleanValue() && o7.j() && com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "User is connected to a VPN");
        }
        o7.a(this.f21766a, this.f21767b);
        this.f21766a.g().a(d2.f21347w, this.f22779g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f21766a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f21766a.a(y4.f23851m3)).booleanValue()) {
                aVarA = v4.a.a(((Integer) this.f21766a.a(y4.f23912t5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f21766a.A().a(h(), false, true));
                HashMap map2 = new HashMap();
                if (!((Boolean) this.f21766a.a(y4.f23586E5)).booleanValue() && !((Boolean) this.f21766a.a(y4.f23556A5)).booleanValue()) {
                    map2.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f21766a.a(y4.f23844l5)).booleanValue()) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21766a.j0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
                map = map2;
            } else {
                v4.a aVarA2 = v4.a.a(((Integer) this.f21766a.a(y4.f23920u5)).intValue());
                Map mapA = o7.a(this.f21766a.A().a(h(), false, false));
                if (!((Boolean) this.f21766a.a(y4.f23656N6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (o7.h(a()) || o7.j(a())) {
                map.putAll(this.f21766a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f22780h)) {
                map.put("sts", this.f22780h);
            }
            a.C0023a c0023aF = com.applovin.impl.sdk.network.a.a(this.f21766a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f21766a.a(y4.f23760b3)).intValue()).c(((Boolean) this.f21766a.a(y4.f23768c3)).booleanValue()).d(((Boolean) this.f21766a.a(y4.d3)).booleanValue()).c(((Integer) this.f21766a.a(y4.f23753a3)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0023aF.a(andResetCustomPostBody);
                c0023aF.b(((Boolean) this.f21766a.a(y4.f23662O5)).booleanValue());
            }
            a aVar = new a(c0023aF.a(), this.f21766a);
            aVar.c(y4.f23883q0);
            aVar.b(y4.f23891r0);
            this.f21766a.r0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Unable to fetch ad for zone id: " + this.f22779g, th);
            }
            a(0, th.getMessage());
        }
    }

    public class a extends m6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            if (i5 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f21935l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f21935l.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i5), map);
                CollectionUtils.putStringIfValid("ad_zone_id", s5.this.f22779g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f21935l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f21935l.b()), map);
                this.f21766a.g().d(d2.f21349x, map);
                s5.this.b(jSONObject);
                return;
            }
            s5.this.a(i5, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            s5.this.a(i5, str2);
            this.f21766a.D().a("fetchAd", str, i5, str2);
        }
    }
}
