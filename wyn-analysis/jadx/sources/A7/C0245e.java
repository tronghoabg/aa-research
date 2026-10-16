package A7;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import p7.C3773c;

/* renamed from: A7.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0245e extends B0 {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f851b;

    /* renamed from: c, reason: collision with root package name */
    public String f852c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0248f f853d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f854e;

    public final double e0(String str, D d3) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) d3.a(null)).doubleValue();
        }
        String strA = this.f853d.a(str, d3.f430a);
        if (TextUtils.isEmpty(strA)) {
            return ((Double) d3.a(null)).doubleValue();
        }
        try {
            return ((Double) d3.a(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) d3.a(null)).doubleValue();
        }
    }

    public final String f0(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC1732v.i(str2);
            return str2;
        } catch (ClassNotFoundException e7) {
            zzj().f605f.d("Could not find SystemProperties class", e7);
            return "";
        } catch (IllegalAccessException e10) {
            zzj().f605f.d("Could not access SystemProperties.get()", e10);
            return "";
        } catch (NoSuchMethodException e11) {
            zzj().f605f.d("Could not find SystemProperties.get() method", e11);
            return "";
        } catch (InvocationTargetException e12) {
            zzj().f605f.d("SystemProperties.get() threw an exception", e12);
            return "";
        }
    }

    public final boolean g0(D d3) {
        return o0(null, d3);
    }

    public final Bundle h0() {
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        try {
            if (c0273n0.f973a.getPackageManager() == null) {
                zzj().f605f.c("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = C3773c.a(c0273n0.f973a).a(128, c0273n0.f973a.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            zzj().f605f.c("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            zzj().f605f.d("Failed to load metadata: Package name not found", e7);
            return null;
        }
    }

    public final int i0(String str, D d3) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) d3.a(null)).intValue();
        }
        String strA = this.f853d.a(str, d3.f430a);
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) d3.a(null)).intValue();
        }
        try {
            return ((Integer) d3.a(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) d3.a(null)).intValue();
        }
    }

    public final long j0(String str, D d3) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) d3.a(null)).longValue();
        }
        String strA = this.f853d.a(str, d3.f430a);
        if (TextUtils.isEmpty(strA)) {
            return ((Long) d3.a(null)).longValue();
        }
        try {
            return ((Long) d3.a(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) d3.a(null)).longValue();
        }
    }

    public final H0 k0(String str, boolean z2) {
        Object obj;
        AbstractC1732v.f(str);
        Bundle bundleH0 = h0();
        if (bundleH0 == null) {
            zzj().f605f.c("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleH0.get(str);
        }
        H0 h02 = H0.UNINITIALIZED;
        if (obj == null) {
            return h02;
        }
        if (Boolean.TRUE.equals(obj)) {
            return H0.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return H0.DENIED;
        }
        if (z2 && "eu_consent_policy".equals(obj)) {
            return H0.POLICY;
        }
        zzj().f608i.d("Invalid manifest metadata for", str);
        return h02;
    }

    public final String l0(String str, D d3) {
        return TextUtils.isEmpty(str) ? (String) d3.a(null) : (String) d3.a(this.f853d.a(str, d3.f430a));
    }

    public final Boolean m0(String str) {
        AbstractC1732v.f(str);
        Bundle bundleH0 = h0();
        if (bundleH0 == null) {
            zzj().f605f.c("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleH0.containsKey(str)) {
            return Boolean.valueOf(bundleH0.getBoolean(str));
        }
        return null;
    }

    public final boolean n0(String str, D d3) {
        return o0(str, d3);
    }

    public final boolean o0(String str, D d3) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) d3.a(null)).booleanValue();
        }
        String strA = this.f853d.a(str, d3.f430a);
        return TextUtils.isEmpty(strA) ? ((Boolean) d3.a(null)).booleanValue() : ((Boolean) d3.a(Boolean.valueOf(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(strA)))).booleanValue();
    }

    public final boolean p0(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(this.f853d.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean q0() {
        Boolean boolM0 = m0("google_analytics_automatic_screen_reporting_enabled");
        return boolM0 == null || boolM0.booleanValue();
    }

    public final boolean r0() {
        if (this.f851b == null) {
            Boolean boolM0 = m0("app_measurement_lite");
            this.f851b = boolM0;
            if (boolM0 == null) {
                this.f851b = Boolean.FALSE;
            }
        }
        return this.f851b.booleanValue() || !((C0273n0) this.f421a).f977e;
    }
}
