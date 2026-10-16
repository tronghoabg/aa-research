package com.applovin.sdk;

import A7.AbstractC0279p0;
import R8.v;
import Va.M6;
import android.content.Context;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.applovin.impl.C1667u0;
import com.applovin.impl.d2;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f24159a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24160b;

    /* renamed from: e, reason: collision with root package name */
    private String f24163e;

    /* renamed from: f, reason: collision with root package name */
    private String f24164f;

    /* renamed from: g, reason: collision with root package name */
    private String f24165g;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f24168j;
    private k k;

    /* renamed from: l, reason: collision with root package name */
    private String f24169l;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24162d = true;

    /* renamed from: h, reason: collision with root package name */
    private final Map f24166h = M6.v();

    /* renamed from: i, reason: collision with root package name */
    private final Map f24167i = M6.v();

    /* renamed from: c, reason: collision with root package name */
    private boolean f24161c = true;

    public AppLovinSdkSettings(Context context) {
        this.f24169l = "";
        if (context == null) {
            o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = o7.e(context);
        this.f24159a = o7.m(contextE);
        this.f24168j = C1667u0.a(contextE);
        this.f24169l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = o7.a(identifier, context, (k) null);
        this.f24166h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(k kVar) {
        this.k = kVar;
        if (StringUtils.isValidString(this.f24163e)) {
            kVar.t0().a(Arrays.asList(this.f24163e.split(",")));
            this.f24163e = null;
        }
        if (this.f24164f != null) {
            kVar.O();
            if (o.a()) {
                AbstractC1593a.w(new StringBuilder("Setting user id: "), this.f24164f, kVar.O(), "AppLovinSdkSettings");
            }
            kVar.x0().a(this.f24164f);
            this.f24164f = null;
        }
        if (StringUtils.isValidString(this.f24165g)) {
            l.a(this.f24165g, kVar);
            this.f24165g = null;
        }
        for (Map.Entry entry : this.f24167i.entrySet()) {
            kVar.w0().a(d2.f21323j, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + ((String) entry.getValue())));
        }
        this.f24167i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f24166h) {
            map = CollectionUtils.map(this.f24166h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f24168j;
    }

    public String getUserIdentifier() {
        k kVar = this.k;
        return kVar == null ? this.f24164f : kVar.x0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f24161c;
    }

    public boolean isMuted() {
        return this.f24160b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f24159a;
    }

    public void setCreativeDebuggerEnabled(boolean z2) {
        o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z2 + ")");
        if (this.f24161c == z2) {
            return;
        }
        this.f24161c = z2;
        k kVar = this.k;
        if (kVar == null) {
            return;
        }
        if (z2) {
            kVar.y().l();
        } else {
            kVar.y().k();
        }
    }

    public void setExtraParameter(String str, String str2) {
        o.e("AppLovinSdkSettings", v.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.k == null) {
                this.f24163e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.k.t0().a(Arrays.asList(strTrim.split(",")));
            } else {
                this.k.t0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f24169l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            o.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            k kVar = this.k;
            if (kVar != null) {
                l.a(strTrim, kVar);
            } else {
                this.f24165g = strTrim;
            }
        }
        if (this.k != null) {
            this.k.w0().a(d2.f21323j, "postInitExtraParameter", CollectionUtils.hashMap("details", str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2));
        } else {
            this.f24167i.put(str, strTrim);
        }
        this.f24166h.put(str, strTrim);
    }

    public void setMuted(boolean z2) {
        o.e("AppLovinSdkSettings", "setMuted(muted=" + z2 + ")");
        this.f24160b = z2;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z2) {
        o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z2 + ")");
        this.f24162d = z2;
    }

    public void setUserIdentifier(String str) {
        o.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > o7.d(8)) {
            o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + o7.d(8) + " maximum)");
        }
        k kVar = this.k;
        if (kVar == null) {
            this.f24164f = str;
            return;
        }
        kVar.O();
        if (o.a()) {
            AbstractC1593a.s("Setting user id: ", str, this.k.O(), "AppLovinSdkSettings");
        }
        this.k.x0().a(str);
    }

    public void setVerboseLogging(boolean z2) {
        o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z2 + ")");
        if (!o7.k()) {
            this.f24159a = z2;
            return;
        }
        o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (o7.m(null) != z2) {
            o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f24162d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sb2.append(this.f24159a);
        sb2.append(", muted=");
        sb2.append(this.f24160b);
        sb2.append(", creativeDebuggerEnabled=");
        return AbstractC0279p0.p(sb2, this.f24161c, '}');
    }
}
