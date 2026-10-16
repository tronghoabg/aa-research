package com.vungle.ads.internal.privacy;

import E5.Q;
import Fe.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.model.n2;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.v;
import ef.C2529m;
import ef.C2530n;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/privacy/PrivacyManager;", "", "Lcom/vungle/ads/internal/privacy/PrivacyConsent;", "consent", "Lef/C;", "updateCcpaConsent", "(Lcom/vungle/ads/internal/privacy/PrivacyConsent;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class PrivacyManager {

    @NotNull
    public static final PrivacyManager INSTANCE = new PrivacyManager();

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f33583a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f33584b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f33585c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static String f33586d;

    /* renamed from: e, reason: collision with root package name */
    public static String f33587e;

    /* renamed from: f, reason: collision with root package name */
    public static String f33588f;

    /* renamed from: g, reason: collision with root package name */
    public static Long f33589g;

    /* renamed from: h, reason: collision with root package name */
    public static PrivacyConsent f33590h;

    /* renamed from: i, reason: collision with root package name */
    public static FilePreferences f33591i;

    /* renamed from: j, reason: collision with root package name */
    public static SharedPreferences f33592j;

    public static String b() {
        String str = f33586d;
        return str == null ? "unknown" : str;
    }

    public static COPPA c() {
        AtomicReference atomicReference = f33584b;
        return atomicReference.get() == null ? COPPA.COPPA_NOTSET : AbstractC3340k.a(atomicReference.get(), Boolean.TRUE) ? COPPA.COPPA_ENABLED : AbstractC3340k.a(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    public static Boolean d() {
        Object objZ;
        String string;
        try {
            SharedPreferences sharedPreferences = f33592j;
            objZ = sharedPreferences != null ? Integer.valueOf(sharedPreferences.getInt("IABTCF_gdprApplies", -1)) : null;
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        if (C2530n.a(objZ) != null) {
            try {
                SharedPreferences sharedPreferences2 = f33592j;
                objZ = (sharedPreferences2 == null || (string = sharedPreferences2.getString("IABTCF_gdprApplies", "-1")) == null) ? null : Integer.valueOf(Integer.parseInt(string));
            } catch (Throwable th2) {
                objZ = e.z(th2);
            }
        }
        if (objZ instanceof C2529m) {
            objZ = null;
        }
        Integer num = (Integer) objZ;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static boolean e() {
        int iA = v.a(a());
        if (iA != 0) {
            if (iA == 1) {
                return false;
            }
            if (iA != 2) {
                throw new Q((byte) 0, 9);
            }
        }
        Boolean bool = (Boolean) f33583a.get();
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f() {
        /*
            java.lang.Boolean r0 = d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.AbstractC3340k.a(r0, r1)
            if (r0 == 0) goto L6d
            com.vungle.ads.internal.ConfigManager r0 = com.vungle.ads.internal.ConfigManager.INSTANCE
            r0.getClass()
            com.vungle.ads.internal.model.n2 r0 = com.vungle.ads.internal.ConfigManager.n()
            r1 = -1
            if (r0 != 0) goto L1a
            r0 = r1
            goto L22
        L1a:
            int[] r2 = com.vungle.ads.internal.privacy.a.f33593a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L22:
            r2 = 1
            if (r0 == r1) goto L37
            if (r0 == r2) goto L6c
            r1 = 2
            if (r0 == r1) goto L6c
            r1 = 3
            if (r0 != r1) goto L2e
            goto L37
        L2e:
            E5.Q r0 = new E5.Q
            r1 = 9
            r2 = 0
            r0.<init>(r2, r1)
            throw r0
        L37:
            android.content.SharedPreferences r0 = com.vungle.ads.internal.privacy.PrivacyManager.f33592j
            r1 = 0
            java.lang.String r3 = ""
            if (r0 == 0) goto L45
            java.lang.String r4 = "IABTCF_TCString"
            java.lang.String r0 = r0.getString(r4, r3)
            goto L46
        L45:
            r0 = r1
        L46:
            if (r0 != 0) goto L49
            goto L4a
        L49:
            r3 = r0
        L4a:
            com.vungle.ads.internal.persistence.FilePreferences r0 = com.vungle.ads.internal.privacy.PrivacyManager.f33591i
            if (r0 == 0) goto L52
            java.lang.String r1 = r0.c()
        L52:
            boolean r0 = kotlin.jvm.internal.AbstractC3340k.a(r1, r3)
            if (r0 != 0) goto L6d
            int r0 = r3.length()
            if (r0 != 0) goto L5f
            goto L6c
        L5f:
            com.vungle.ads.internal.persistence.FilePreferences r0 = com.vungle.ads.internal.privacy.PrivacyManager.f33591i
            if (r0 == 0) goto L6c
            java.lang.String r1 = "previous_tcf_token"
            com.vungle.ads.internal.persistence.FilePreferences r0 = r0.a(r1, r3)
            r0.b()
        L6c:
            return r2
        L6d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.privacy.PrivacyManager.f():boolean");
    }

    public final synchronized void a(Context context) {
        AbstractC3340k.e(context, "context");
        AtomicBoolean atomicBoolean = f33585c;
        if (atomicBoolean.get()) {
            boolean z2 = u.f33874a;
            t.c("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        f33592j = PreferenceManager.getDefaultSharedPreferences(context);
        FilePreferences filePreferences = (FilePreferences) ServiceLocator.f32912d.a(context).getService(FilePreferences.class);
        f33591i = filePreferences;
        AtomicReference atomicReference = f33583a;
        Boolean bool = (Boolean) atomicReference.get();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            FilePreferences filePreferences2 = f33591i;
            if (filePreferences2 != null) {
                filePreferences2.a(zBooleanValue, "disable_ad_id").b();
            }
        } else {
            Boolean boolA = filePreferences.a("disable_ad_id");
            if (boolA != null) {
                atomicReference.set(boolA);
            }
        }
        String str = f33586d;
        if (str != null) {
            String str2 = f33587e;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = f33588f;
            if (str3 == null) {
                str3 = "";
            }
            Long l10 = f33589g;
            long jLongValue = l10 != null ? l10.longValue() : 0L;
            FilePreferences filePreferences3 = f33591i;
            if (filePreferences3 != null) {
                filePreferences3.a("gdpr_status", str).a("gdpr_source", str2).a("gdpr_message_version", str3).b("gdpr_timestamp", jLongValue).b();
            }
        } else {
            String string = filePreferences.getString("gdpr_status");
            PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
            if (AbstractC3340k.a(string, privacyConsent.getValue())) {
                string = privacyConsent.getValue();
            } else {
                PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                if (AbstractC3340k.a(string, privacyConsent2.getValue())) {
                    string = privacyConsent2.getValue();
                }
            }
            f33586d = string;
            f33587e = filePreferences.getString("gdpr_source");
            f33588f = filePreferences.getString("gdpr_message_version");
            f33589g = Long.valueOf(filePreferences.a("gdpr_timestamp", 0L));
        }
        PrivacyConsent privacyConsent3 = f33590h;
        if (privacyConsent3 != null) {
            FilePreferences filePreferences4 = f33591i;
            if (filePreferences4 != null) {
                filePreferences4.a("ccpa_status", privacyConsent3.getValue()).b();
            }
        } else {
            String string2 = filePreferences.getString("ccpa_status");
            PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
            if (!AbstractC3340k.a(privacyConsent4.getValue(), string2)) {
                privacyConsent4 = PrivacyConsent.OPT_IN;
            }
            f33590h = privacyConsent4;
        }
        AtomicReference atomicReference2 = f33584b;
        Boolean bool2 = (Boolean) atomicReference2.get();
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            FilePreferences filePreferences5 = f33591i;
            if (filePreferences5 != null) {
                filePreferences5.a(zBooleanValue2, "is_coppa").b();
            }
        } else {
            Boolean boolA2 = filePreferences.a("is_coppa");
            if (boolA2 != null) {
                atomicReference2.set(boolA2);
            }
        }
        atomicBoolean.set(true);
    }

    public final void updateCcpaConsent(@NotNull PrivacyConsent consent) {
        AbstractC3340k.e(consent, "consent");
        f33590h = consent;
        FilePreferences filePreferences = f33591i;
        if (filePreferences != null) {
            filePreferences.a("ccpa_status", consent.getValue()).b();
        }
    }

    public static void a(String consent, String source, String str) {
        AbstractC3340k.e(consent, "consent");
        AbstractC3340k.e(source, "source");
        f33586d = consent;
        f33587e = source;
        f33588f = str;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        f33589g = Long.valueOf(jCurrentTimeMillis);
        String str2 = f33588f;
        if (str2 == null) {
            str2 = "";
        }
        FilePreferences filePreferences = f33591i;
        if (filePreferences != null) {
            filePreferences.a("gdpr_status", consent).a("gdpr_source", source).a("gdpr_message_version", str2).b("gdpr_timestamp", jCurrentTimeMillis).b();
        }
    }

    public static void a(boolean z2) {
        f33583a.set(Boolean.valueOf(z2));
        FilePreferences filePreferences = f33591i;
        if (filePreferences != null) {
            filePreferences.a(z2, "disable_ad_id").b();
        }
    }

    public static int a() {
        Boolean boolD = d();
        if (!AbstractC3340k.a(boolD, Boolean.TRUE)) {
            return boolD == null ? 3 : 1;
        }
        ConfigManager.INSTANCE.getClass();
        n2 n2VarN = ConfigManager.n();
        int i5 = n2VarN == null ? -1 : a.f33593a[n2VarN.ordinal()];
        if (i5 != -1) {
            if (i5 == 1) {
                return 2;
            }
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new Q((byte) 0, 9);
                }
            }
        }
    }
}
