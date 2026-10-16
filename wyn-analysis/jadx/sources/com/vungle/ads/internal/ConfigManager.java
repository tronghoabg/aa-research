package com.vungle.ads.internal;

import android.content.Context;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\r²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/ConfigManager;", "", "", "getAdsEndpoint", "getConfigExtension", "<init>", "()V", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "Lcom/vungle/ads/internal/executor/a;", "sdkExecutors", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class ConfigManager {

    /* renamed from: a, reason: collision with root package name */
    public static com.vungle.ads.internal.model.v2 f32903a;

    /* renamed from: b, reason: collision with root package name */
    public static com.vungle.ads.internal.model.h2 f32904b;

    /* renamed from: c, reason: collision with root package name */
    public static List f32905c;

    /* renamed from: d, reason: collision with root package name */
    public static String f32906d;

    /* renamed from: f, reason: collision with root package name */
    public static String f32908f;

    @NotNull
    public static final ConfigManager INSTANCE = new ConfigManager();

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC2525i f32907e = Fe.c.y(EnumC2526j.f34667a, w0.f33882a);

    private ConfigManager() {
    }

    public static void a(Context context, String ext) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(ext, "ext");
        f32906d = ext;
        ((FilePreferences) Fe.c.y(EnumC2526j.f34667a, new x0(context)).getValue()).a("config_extension", ext).b();
    }

    public static void b(String applicationId) {
        AbstractC3340k.e(applicationId, "applicationId");
        f32908f = applicationId;
    }

    public static String c() {
        com.vungle.ads.internal.model.h2 h2Var = f32904b;
        String str = null;
        String str2 = h2Var != null ? h2Var.f33193e : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.f32909a : str;
    }

    public static int d() {
        com.vungle.ads.internal.model.a2 a2Var;
        Integer num;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (a2Var = v2Var.f33335a) == null || (num = a2Var.f33090b) == null) {
            return 3;
        }
        return num.intValue();
    }

    public static long e() {
        com.vungle.ads.internal.model.a2 a2Var;
        Long l10;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (a2Var = v2Var.f33335a) == null || (l10 = a2Var.f33089a) == null) {
            return 1048576000L;
        }
        long jLongValue = l10.longValue();
        long j8 = Segment.SHARE_MINIMUM;
        return jLongValue * j8 * j8;
    }

    public static String f() {
        com.vungle.ads.internal.model.h2 h2Var = f32904b;
        String str = null;
        String str2 = h2Var != null ? h2Var.f33191c : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.f32910b : str;
    }

    public static String g() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (u2Var = v2Var.f33340f) == null || (k2Var = u2Var.f33329a) == null) {
            return null;
        }
        return k2Var.f33243e;
    }

    public static String h() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (u2Var = v2Var.f33340f) == null || (k2Var = u2Var.f33329a) == null) {
            return null;
        }
        return k2Var.f33244f;
    }

    public static String i() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (u2Var = v2Var.f33340f) == null || (k2Var = u2Var.f33329a) == null) {
            return null;
        }
        return k2Var.f33241c;
    }

    public static String j() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (u2Var = v2Var.f33340f) == null || (k2Var = u2Var.f33329a) == null) {
            return null;
        }
        return k2Var.f33240b;
    }

    public static boolean k() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (u2Var = v2Var.f33340f) == null || (k2Var = u2Var.f33329a) == null || (bool = k2Var.f33239a) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static String l() {
        com.vungle.ads.internal.model.h2 h2Var = f32904b;
        String str = null;
        String str2 = h2Var != null ? h2Var.f33192d : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.f32911c : str;
    }

    public static String m() {
        com.vungle.ads.internal.model.h2 h2Var = f32904b;
        if (h2Var != null) {
            return h2Var.f33190b;
        }
        return null;
    }

    public static com.vungle.ads.internal.model.n2 n() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.o2 o2Var;
        LinkedHashMap linkedHashMap = com.vungle.ads.internal.model.n2.f33266b;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        return (com.vungle.ads.internal.model.n2) com.vungle.ads.internal.model.n2.f33266b.get((v2Var == null || (u2Var = v2Var.f33340f) == null || (o2Var = u2Var.f33330b) == null) ? null : o2Var.f33272a);
    }

    public static boolean o() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (bool = v2Var.f33343i) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean p() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (bool = v2Var.f33351r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static boolean q() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (bool = v2Var.f33348o) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean r() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (bool = v2Var.f33346m) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @NotNull
    public final String getAdsEndpoint() {
        com.vungle.ads.internal.model.h2 h2Var = f32904b;
        String str = null;
        String str2 = h2Var != null ? h2Var.f33189a : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    @NotNull
    public final String getConfigExtension() {
        String str = f32906d;
        return str == null ? "" : str;
    }

    public static boolean b() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (bool = v2Var.f33347n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static i3 a(String str) {
        List list = f32905c;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC3340k.a(((i3) next).b(), str)) {
                obj = next;
                break;
            }
        }
        return (i3) obj;
    }

    public static long a() {
        Long l10;
        com.vungle.ads.internal.model.v2 v2Var = f32903a;
        if (v2Var == null || (l10 = v2Var.f33349p) == null) {
            return -1L;
        }
        return l10.longValue();
    }

    public static com.vungle.ads.internal.model.v2 a(FilePreferences filePreferences, String appId) {
        Long lA;
        AbstractC3340k.e(filePreferences, "filePreferences");
        AbstractC3340k.e(appId, "appId");
        try {
            String string = filePreferences.getString("config_app_id");
            if (string != null && string.length() != 0 && string.equalsIgnoreCase(appId)) {
                String string2 = filePreferences.getString("config_response");
                if (string2 == null) {
                    return null;
                }
                long jA = filePreferences.a("config_update_time", 0L);
                INSTANCE.getClass();
                Xf.c cVar = (Xf.c) f32907e.getValue();
                com.vungle.ads.internal.model.v2 v2Var = (com.vungle.ads.internal.model.v2) cVar.a(string2, H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(com.vungle.ads.internal.model.v2.class)));
                com.vungle.ads.internal.model.e2 e2VarC = v2Var.c();
                if (((e2VarC == null || (lA = e2VarC.a()) == null) ? -1L : lA.longValue()) + jA < System.currentTimeMillis()) {
                    boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                    com.vungle.ads.internal.util.t.c("ConfigManager", "cache config expired. re-config");
                    return null;
                }
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.c("ConfigManager", "use cache config.");
                return v2Var;
            }
            boolean z11 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.c("ConfigManager", "app id mismatch, re-config");
            return null;
        } catch (Exception e7) {
            boolean z12 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Error while parsing cached config: ");
            sbA.append(e7.getMessage());
            com.vungle.ads.internal.util.t.b("ConfigManager", sbA.toString());
            return null;
        }
    }

    public static void a(com.vungle.ads.internal.model.v2 config, FilePreferences filePreferences) {
        AbstractC3340k.e(config, "config");
        AbstractC3340k.e(filePreferences, "filePreferences");
        try {
            String str = f32908f;
            if (str != null) {
                filePreferences.a("config_app_id", str);
                filePreferences.b("config_update_time", System.currentTimeMillis());
                Xf.c cVar = (Xf.c) f32907e.getValue();
                filePreferences.a("config_response", cVar.b(H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(com.vungle.ads.internal.model.v2.class)), config));
                filePreferences.b();
                return;
            }
            AbstractC3340k.m("applicationId");
            throw null;
        } catch (Exception e7) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Exception: ");
            sbA.append(e7.getMessage());
            sbA.append(" for updating cached config");
            com.vungle.ads.internal.util.t.b("ConfigManager", sbA.toString());
        }
    }

    public static void a(Context context, q2 onComplete) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(onComplete, "onComplete");
        try {
            com.vungle.ads.internal.network.m mVarA = ((VungleApiClient) Fe.c.y(EnumC2526j.f34667a, new q0(context)).getValue()).a();
            if (mVarA != null) {
                mVarA.a(new r0(context, onComplete));
            }
        } catch (Throwable th) {
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Config unknown: ");
                sbA.append(th.getMessage());
                new NetworkUnreachable(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("Config: ");
                sbA2.append(th.getMessage());
                new NetworkUnreachable(sbA2.toString()).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(Boolean.FALSE);
        }
    }

    public final synchronized void a(Context context, com.vungle.ads.internal.model.v2 v2Var, boolean z2, m2 m2Var) {
        Long l10;
        char c10;
        Boolean bool;
        com.vungle.ads.internal.model.r2 r2Var;
        Boolean bool2;
        com.vungle.ads.internal.model.r2 r2Var2;
        Integer num;
        try {
            AbstractC3340k.e(context, "context");
            EnumC2526j enumC2526j = EnumC2526j.f34667a;
            InterfaceC2525i interfaceC2525iY = Fe.c.y(enumC2526j, new s0(context));
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = true;
            if (v2Var == null || (l10 = v2Var.f33349p) == null || l10.longValue() == -1) {
                c10 = 0;
            } else {
                c10 = v2Var.f33337c == null ? (char) 1 : (char) 2;
            }
            if (c10 == 0) {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.b("ConfigManager", "Config is not available.");
                return;
            }
            if (c10 == 1) {
                if (!z2 && v2Var != null) {
                    Long lB = v2Var.b();
                    long jLongValue = lB != null ? lB.longValue() : -1L;
                    com.vungle.ads.internal.model.v2 v2Var2 = f32903a;
                    if (v2Var2 != null) {
                        v2Var2.a(Long.valueOf(jLongValue));
                    }
                    com.vungle.ads.internal.model.v2 v2Var3 = f32903a;
                    if (v2Var3 != null) {
                        ConfigManager configManager = INSTANCE;
                        FilePreferences filePreferences = (FilePreferences) interfaceC2525iY.getValue();
                        configManager.getClass();
                        a(v2Var3, filePreferences);
                    }
                }
                return;
            }
            f32903a = v2Var;
            f32904b = v2Var != null ? v2Var.d() : null;
            f32905c = v2Var != null ? v2Var.e() : null;
            com.vungle.ads.internal.model.v2 v2Var4 = f32903a;
            int iIntValue = (v2Var4 == null || (r2Var2 = v2Var4.f33338d) == null || (num = r2Var2.f33302a) == null) ? 1 : num.intValue();
            com.vungle.ads.internal.model.v2 v2Var5 = f32903a;
            if (v2Var5 != null && (r2Var = v2Var5.f33338d) != null && (bool2 = r2Var.f33303b) != null) {
                zBooleanValue = bool2.booleanValue();
            }
            InterfaceC2525i interfaceC2525iY2 = Fe.c.y(enumC2526j, new t0(context));
            InterfaceC2525i interfaceC2525iY3 = Fe.c.y(enumC2526j, new u0(context));
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            analyticsClient.a((VungleApiClient) interfaceC2525iY2.getValue(), ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) interfaceC2525iY3.getValue())).e(), iIntValue, zBooleanValue);
            if (!z2 && v2Var != null) {
                a(v2Var, (FilePreferences) interfaceC2525iY.getValue());
                String strA = v2Var.a();
                if (strA != null) {
                    INSTANCE.getClass();
                    a(context, strA);
                }
            }
            if (m2Var != null) {
                AnalyticsClient.a(analyticsClient, m2Var, (com.vungle.ads.internal.util.s) null, 6);
            }
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            com.vungle.ads.internal.model.v2 v2Var6 = f32903a;
            if (v2Var6 != null && (bool = v2Var6.f33342h) != null) {
                zBooleanValue2 = bool.booleanValue();
            }
            privacyManager.getClass();
            PrivacyManager.a(zBooleanValue2);
        } catch (Exception e7) {
            boolean z11 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Error while validating config: ");
            sbA.append(e7.getMessage());
            com.vungle.ads.internal.util.t.b("ConfigManager", sbA.toString());
        } finally {
        }
    }
}
