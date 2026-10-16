package com.vungle.ads.internal.platform;

import Bf.r;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.iab.omid.library.vungle.internal.l;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.network.w;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.C2530n;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import j1.InterfaceC3073a;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33491a;

    /* renamed from: b, reason: collision with root package name */
    public final j f33492b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager f33493c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f33494d;

    /* renamed from: e, reason: collision with root package name */
    public Long f33495e;

    /* renamed from: f, reason: collision with root package name */
    public String f33496f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f33497g;

    /* renamed from: h, reason: collision with root package name */
    public i0 f33498h;

    /* renamed from: i, reason: collision with root package name */
    public String f33499i;

    public c(Context context, j uaExecutor, PowerManager powerManager, AudioManager audioManager) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(uaExecutor, "uaExecutor");
        AbstractC3340k.e(powerManager, "powerManager");
        AbstractC3340k.e(audioManager, "audioManager");
        this.f33491a = context;
        this.f33492b = uaExecutor;
        this.f33493c = powerManager;
        this.f33494d = audioManager;
        q();
    }

    public final void a(w consumer) {
        AbstractC3340k.e(consumer, "consumer");
        this.f33492b.execute(new C8.d(11, this, consumer));
    }

    public final String b() {
        return this.f33496f;
    }

    public final Integer c() {
        return this.f33497g;
    }

    public final long d() {
        return Build.TIME;
    }

    public final String e() {
        String strA = a.a(this.f33491a);
        AbstractC3340k.d(strA, "getCarrierName(context)");
        return strA;
    }

    public final String f() {
        String str = this.f33499i;
        if (str != null) {
            return str;
        }
        try {
            String str2 = (Build.VERSION.SDK_INT >= 33 ? this.f33491a.getPackageManager().getPackageInfo("com.android.vending", PackageManager.PackageInfoFlags.of(0L)) : this.f33491a.getPackageManager().getPackageInfo("com.android.vending", 0)).versionName;
            this.f33499i = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final long g() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public final long h() {
        Object objZ;
        try {
            objZ = Long.valueOf((Build.VERSION.SDK_INT >= 33 ? this.f33491a.getPackageManager().getPackageInfo("android", PackageManager.PackageInfoFlags.of(0L)) : this.f33491a.getPackageManager().getPackageInfo("android", 0)).firstInstallTime);
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            if (thA instanceof PackageManager.NameNotFoundException) {
                boolean z2 = u.f33874a;
                StringBuilder sbA = l.a("Error getting OS installation time: ");
                sbA.append(((PackageManager.NameNotFoundException) thA).getLocalizedMessage());
                t.b("AndroidPlatform", sbA.toString());
            }
            objZ = -1L;
        }
        return ((Number) objZ).longValue();
    }

    public final long i() {
        InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new b(this.f33491a));
        Long l10 = this.f33495e;
        if (l10 != null) {
            return l10.longValue();
        }
        long jA = ((FilePreferences) interfaceC2525iY.getValue()).a("sit", 0L);
        if (jA == 0) {
            jA = System.currentTimeMillis();
            ((FilePreferences) interfaceC2525iY.getValue()).b("sit", jA).b();
        }
        this.f33495e = Long.valueOf(jA);
        return jA;
    }

    public final String j() {
        return System.getProperty("http.agent");
    }

    public final float k() {
        try {
            float streamVolume = this.f33494d.getStreamVolume(3) / this.f33494d.getStreamMaxVolume(3);
            if (!Float.isNaN(streamVolume)) {
                if (!Float.isInfinite(streamVolume) && streamVolume >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (streamVolume > 1.0f) {
                        return 1.0f;
                    }
                    return streamVolume;
                }
            }
        } catch (Exception unused) {
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean l() {
        return this.f33493c.isPowerSaveMode();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m() {
        /*
            r5 = this;
            java.lang.String r0 = android.os.Build.HARDWARE
            if (r0 == 0) goto L10
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.AbstractC3340k.d(r0, r1)
            goto L12
        L10:
            java.lang.String r0 = ""
        L12:
            java.lang.String r1 = "exynos"
            r2 = 0
            boolean r1 = Bf.k.n0(r0, r1, r2)
            r3 = 1
            if (r1 == 0) goto L35
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r1 < r4) goto L33
            java.lang.String r1 = F5.i.k()
            java.lang.String r4 = "SOC_MANUFACTURER"
            kotlin.jvm.internal.AbstractC3340k.d(r1, r4)
            java.lang.String r4 = "samsung"
            boolean r1 = Bf.k.n0(r1, r4, r3)
            if (r1 == 0) goto L35
        L33:
            r1 = r3
            goto L36
        L35:
            r1 = r2
        L36:
            java.lang.String r4 = "mali"
            boolean r0 = Bf.k.n0(r0, r4, r2)
            if (r0 != 0) goto L43
            if (r1 == 0) goto L41
            goto L43
        L41:
            r0 = r2
            goto L44
        L43:
            r0 = r3
        L44:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r4 > r1) goto L50
            r4 = 34
            if (r1 >= r4) goto L50
            r1 = r3
            goto L51
        L50:
            r1 = r2
        L51:
            if (r0 == 0) goto L56
            if (r1 == 0) goto L56
            return r3
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.platform.c.m():boolean");
    }

    public final boolean n() {
        try {
            return AbstractC3340k.a(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            t.a("AndroidPlatform", "Acquiring external storage state failed", e7);
            return false;
        }
    }

    public final boolean o() {
        try {
            if (this.f33494d.getRingerMode() != 0) {
                if (this.f33494d.getRingerMode() != 1) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean p() {
        try {
            return this.f33494d.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public final void q() {
        String str = this.f33496f;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.f33491a);
                AbstractC3340k.d(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                AbstractC3340k.d(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new B8.b(this, 13));
            } catch (Exception e7) {
                boolean z2 = u.f33874a;
                StringBuilder sbA = l.a("Error getting AppSetID: ");
                sbA.append(e7.getLocalizedMessage());
                t.b("AndroidPlatform", sbA.toString());
            } catch (NoClassDefFoundError e10) {
                boolean z10 = u.f33874a;
                StringBuilder sbA2 = l.a("Required libs to get AppSetID Not available: ");
                sbA2.append(e10.getLocalizedMessage());
                t.b("AndroidPlatform", sbA2.toString());
            }
        }
    }

    public static final void a(c this$0, InterfaceC3073a consumer) {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(consumer, "$consumer");
        g.a(this$0.f33491a, consumer);
    }

    public final i0 a() {
        i0 i0Var;
        String strA;
        i0 i0Var2 = this.f33498h;
        if (i0Var2 != null && (strA = i0Var2.a()) != null && strA.length() != 0) {
            return i0Var2;
        }
        boolean z2 = true;
        if (r.c0(Build.MANUFACTURER, "Amazon", true)) {
            i0Var = new i0();
            try {
                ContentResolver contentResolver = this.f33491a.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                    z2 = false;
                }
                i0Var.f33224b = z2;
                i0Var.f33223a = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException e7) {
                boolean z10 = u.f33874a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info: Setting not found.", e7);
            } catch (Exception e10) {
                boolean z11 = u.f33874a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info", e10);
            }
        } else {
            i0 i0Var3 = new i0();
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f33491a);
                AbstractC3340k.d(advertisingIdInfo, "getAdvertisingIdInfo(context)");
                i0Var3.a(advertisingIdInfo.getId());
                i0Var3.a(advertisingIdInfo.isLimitAdTrackingEnabled());
            } catch (d7.g e11) {
                boolean z12 = u.f33874a;
                StringBuilder sbA = l.a("Play services Not available: ");
                sbA.append(e11.getLocalizedMessage());
                t.b("AndroidPlatform", sbA.toString());
            } catch (Exception e12) {
                boolean z13 = u.f33874a;
                StringBuilder sbA2 = l.a("Error getting Google advertising info: ");
                sbA2.append(e12.getLocalizedMessage());
                t.b("AndroidPlatform", sbA2.toString());
            } catch (NoClassDefFoundError e13) {
                boolean z14 = u.f33874a;
                StringBuilder sbA3 = l.a("Play services Not available: ");
                sbA3.append(e13.getLocalizedMessage());
                t.b("AndroidPlatform", sbA3.toString());
                i0Var3.a(Settings.Secure.getString(this.f33491a.getContentResolver(), "advertising_id"));
            }
            i0Var = i0Var3;
        }
        this.f33498h = i0Var;
        return i0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(Context context, j jVar) {
        Object systemService = context.getSystemService("power");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        Object systemService2 = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        AbstractC3340k.c(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        this(context, jVar, (PowerManager) systemService, (AudioManager) systemService2);
    }

    public static final void a(c this$0, AppSetIdInfo appSetIdInfo) {
        AbstractC3340k.e(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.f33496f = appSetIdInfo.getId();
            this$0.f33497g = Integer.valueOf(appSetIdInfo.getScope());
        }
    }
}
