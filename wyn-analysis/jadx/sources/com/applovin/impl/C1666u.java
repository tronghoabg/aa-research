package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.qonversion.android.sdk.internal.Constants;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1666u {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f23308e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f23309f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f23310a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23311b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f23312c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdType f23313d;

    private C1666u(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z2, boolean z10) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f23312c = appLovinAdSize;
        this.f23313d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + Constants.USER_ID_SEPARATOR + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        lowerCase = z2 ? N0.a.f(lowerCase, "_bidding") : lowerCase;
        this.f23311b = z10 ? N0.a.f(lowerCase, "_direct_sold") : lowerCase;
    }

    public static C1666u a(String str) {
        return a(null, null, str);
    }

    public static C1666u b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static C1666u c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static C1666u h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static C1666u j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static C1666u k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static C1666u l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static C1666u m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize appLovinAdSizeF = f();
        if (appLovinAdSizeF == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeF != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeF == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (g() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (g() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (g() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    public String e() {
        return this.f23311b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1666u.class != obj.getClass()) {
            return false;
        }
        return this.f23311b.equalsIgnoreCase(((C1666u) obj).f23311b);
    }

    public AppLovinAdSize f() {
        if (this.f23312c == null && JsonUtils.valueExists(this.f23310a, "ad_size")) {
            this.f23312c = AppLovinAdSize.fromString(JsonUtils.getString(this.f23310a, "ad_size", null));
        }
        return this.f23312c;
    }

    public AppLovinAdType g() {
        if (this.f23313d == null && JsonUtils.valueExists(this.f23310a, "ad_type")) {
            this.f23313d = AppLovinAdType.fromString(JsonUtils.getString(this.f23310a, "ad_type", null));
        }
        return this.f23313d;
    }

    public int hashCode() {
        return this.f23311b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f23311b + ", zoneObject=" + this.f23310a + '}';
    }

    public static C1666u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static C1666u b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static C1666u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static C1666u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z2, boolean z10) {
        C1666u c1666u = new C1666u(appLovinAdSize, appLovinAdType, str, z2, z10);
        synchronized (f23309f) {
            try {
                String str2 = c1666u.f23311b;
                Map map = f23308e;
                if (map.containsKey(str2)) {
                    c1666u = (C1666u) map.get(str2);
                } else {
                    map.put(str2, c1666u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1666u;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f23309f) {
                try {
                    C1666u c1666u = (C1666u) f23308e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                    if (c1666u != null) {
                        c1666u.f23312c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                        c1666u.f23313d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return DesugarCollections.unmodifiableSet(linkedHashSet);
    }
}
