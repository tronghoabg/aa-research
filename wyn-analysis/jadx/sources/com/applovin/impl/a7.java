package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class a7 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20976a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f20977b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f20978c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f20979d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f20980e;

    /* renamed from: f, reason: collision with root package name */
    private String f20981f;

    /* renamed from: g, reason: collision with root package name */
    private String f20982g;

    /* renamed from: h, reason: collision with root package name */
    private String f20983h;

    /* renamed from: i, reason: collision with root package name */
    private String f20984i;

    /* renamed from: j, reason: collision with root package name */
    private String f20985j;

    public a7(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o());
        this.f20977b = defaultSharedPreferences;
        this.f20976a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f20978c = a(a5.f20967u.a());
        this.f20979d = a(a5.f20968v.a());
        this.f20980e = h();
        this.f20981f = (String) b5.a(a5.f20970x, (Object) null, defaultSharedPreferences, false);
        this.f20982g = (String) b5.a(a5.f20971y, (Object) null, defaultSharedPreferences, false);
        this.f20983h = (String) b5.a(a5.f20972z, (Object) null, defaultSharedPreferences, false);
        this.f20984i = (String) b5.a(a5.f20932B, (Object) null, defaultSharedPreferences, false);
        this.f20985j = (String) b5.a(a5.f20934D, (Object) null, defaultSharedPreferences, false);
        b(this.f20982g);
    }

    private Integer h() {
        String strA = a5.f20969w.a();
        if (this.f20977b.contains(strA)) {
            Integer num = (Integer) b5.a(strA, null, Integer.class, this.f20977b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f20976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20976a.O().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l10 = (Long) b5.a(strA, null, Long.class, this.f20977b, false);
            if (l10 != null) {
                if (l10.longValue() == 1 || l10.longValue() == 0) {
                    return Integer.valueOf(l10.intValue());
                }
                this.f20976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20976a.O().b("TcfManager", "Long value (" + l10 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) b5.a(strA, null, Boolean.class, this.f20977b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) b5.a(strA, null, String.class, this.f20977b, false);
            if (str != null) {
                if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f20976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20976a.O().b("TcfManager", R8.v.g("String value (", str, ") for ", strA, " is invalid - setting GDPR Applies to null"));
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i5) {
        return d7.a(i5, this.f20982g);
    }

    public boolean b() {
        return d7.a(this.f20982g);
    }

    public String c() {
        return this.f20982g;
    }

    public String d() {
        return y6.a(this.f20978c);
    }

    public Integer e() {
        return this.f20978c;
    }

    public Integer f() {
        return this.f20979d;
    }

    public Integer g() {
        return this.f20980e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f20978c) + a("CMP SDK Version", this.f20979d) + a(a5.f20969w.a(), this.f20980e) + a(a5.f20970x.a(), this.f20981f) + a(a5.f20971y.a(), this.f20982g);
    }

    public String j() {
        return this.f20981f;
    }

    public String k() {
        return this.f20983h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20976a.O().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(a5.f20967u.a())) {
            this.f20978c = a(str);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = this.f20976a.O();
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("SharedPreferences entry updated - key: ", str, ", value: ");
                sbW.append(this.f20978c);
                oVarO.a("TcfManager", sbW.toString());
            }
            this.f20976a.S0();
            return;
        }
        if (str.equals(a5.f20968v.a())) {
            this.f20979d = a(str);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO2 = this.f20976a.O();
                StringBuilder sbW2 = com.google.android.gms.internal.consent_sdk.a.w("SharedPreferences entry updated - key: ", str, ", value: ");
                sbW2.append(this.f20979d);
                oVarO2.a("TcfManager", sbW2.toString());
                return;
            }
            return;
        }
        if (str.equals(a5.f20969w.a())) {
            this.f20980e = h();
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO3 = this.f20976a.O();
                StringBuilder sbW3 = com.google.android.gms.internal.consent_sdk.a.w("SharedPreferences entry updated - key: ", str, ", value: ");
                sbW3.append(this.f20980e);
                oVarO3.a("TcfManager", sbW3.toString());
                return;
            }
            return;
        }
        if (str.equals(a5.f20970x.a())) {
            this.f20981f = (String) b5.a(str, (Object) null, String.class, sharedPreferences);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.w(com.google.android.gms.internal.consent_sdk.a.w("SharedPreferences entry updated - key: ", str, ", value: "), this.f20981f, this.f20976a.O(), "TcfManager");
            }
            this.f20976a.S0();
            return;
        }
        if (str.equals(a5.f20971y.a())) {
            this.f20982g = (String) b5.a(str, (Object) null, String.class, sharedPreferences);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.w(com.google.android.gms.internal.consent_sdk.a.w("SharedPreferences entry updated - key: ", str, ", value: "), this.f20982g, this.f20976a.O(), "TcfManager");
            }
            b(this.f20982g);
            return;
        }
        if (str.equals(a5.f20972z.a())) {
            this.f20983h = (String) b5.a(str, (Object) null, String.class, sharedPreferences);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.w(com.google.android.gms.internal.consent_sdk.a.w("SharedPreferences entry updated - key: ", str, ", value: "), this.f20983h, this.f20976a.O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(a5.f20931A.a())) {
            String str2 = (String) b5.a(str, (Object) null, String.class, sharedPreferences);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20976a.O().a("TcfManager", N0.a.h("SharedPreferences entry updated - key: ", str, ", value: ", str2));
                return;
            }
            return;
        }
        if (str.equals(a5.f20932B.a())) {
            this.f20984i = (String) b5.a(str, (Object) null, String.class, sharedPreferences);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.w(com.google.android.gms.internal.consent_sdk.a.w("SharedPreferences entry updated - key: ", str, ", value: "), this.f20984i, this.f20976a.O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(a5.f20933C.a())) {
            String str3 = (String) b5.a(str, (Object) null, String.class, sharedPreferences);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20976a.O().a("TcfManager", N0.a.h("SharedPreferences entry updated - key: ", str, ", value: ", str3));
                return;
            }
            return;
        }
        if (str.equals(a5.f20934D.a())) {
            this.f20985j = (String) b5.a(str, (Object) null, String.class, sharedPreferences);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.w(com.google.android.gms.internal.consent_sdk.a.w("SharedPreferences entry updated - key: ", str, ", value: "), this.f20985j, this.f20976a.O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) b5.a(str, (Object) null, String.class, sharedPreferences);
            this.f20976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20976a.O().a("TcfManager", N0.a.h("SharedPreferences entry updated - key: ", str, ", value: ", str4));
            }
        }
    }

    private Integer a(String str) {
        if (this.f20977b.contains(str)) {
            Integer num = (Integer) b5.a(str, null, Integer.class, this.f20977b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) b5.a(str, null, Long.class, this.f20977b, false);
            if (l10 != null && l10.longValue() >= -2147483648L && l10.longValue() <= 2147483647L) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) b5.a(str, null, String.class, this.f20977b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f20976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20976a.O().b("TcfManager", R8.v.g("String value (", str2, ") for ", str, " is not numeric - storing value as null"));
                }
            }
        }
        return null;
    }

    public Boolean b(int i5) {
        String str = this.f20984i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(d7.a(str, i5 - 1));
    }

    public Boolean c(int i5) {
        String str = this.f20985j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(d7.a(str, i5 - 1));
    }

    public Boolean d(int i5) {
        String str = this.f20983h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(d7.a(str, i5 - 1));
    }

    private void b(String str) {
        this.f20976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            AbstractC1593a.s("Attempting to update consent from Additional Consent string: ", str, this.f20976a.O(), "TcfManager");
        }
        Boolean boolA = d7.a(1301, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f20976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20976a.O().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                AbstractC1656p0.b(true, com.applovin.impl.sdk.k.o());
            } else {
                this.f20976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20976a.O().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                AbstractC1656p0.b(false, com.applovin.impl.sdk.k.o());
            }
            this.f20976a.S0();
            return;
        }
        this.f20976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f20976a.O().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f20978c = null;
        this.f20980e = null;
        this.f20981f = null;
        this.f20982g = null;
        this.f20983h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("\n", str, " - ");
        sbW.append(obj != null ? obj.toString() : "No value set");
        return sbW.toString();
    }
}
