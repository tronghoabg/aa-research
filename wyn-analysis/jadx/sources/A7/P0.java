package A7;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import c8.C1581e;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zzpn;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Comparator;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import y3.C4552j;

/* loaded from: classes4.dex */
public final class P0 extends Y {

    /* renamed from: c, reason: collision with root package name */
    public C0241c1 f650c;

    /* renamed from: d, reason: collision with root package name */
    public K0 f651d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f652e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f653f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f654g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f655h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f656i;

    /* renamed from: j, reason: collision with root package name */
    public int f657j;
    public X0 k;

    /* renamed from: l, reason: collision with root package name */
    public PriorityQueue f658l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f659m;

    /* renamed from: n, reason: collision with root package name */
    public F0 f660n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicLong f661o;

    /* renamed from: p, reason: collision with root package name */
    public long f662p;

    /* renamed from: q, reason: collision with root package name */
    public final Y9.c f663q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f664r;

    /* renamed from: s, reason: collision with root package name */
    public X0 f665s;

    /* renamed from: t, reason: collision with root package name */
    public U0 f666t;

    /* renamed from: u, reason: collision with root package name */
    public X0 f667u;

    /* renamed from: v, reason: collision with root package name */
    public final C4552j f668v;

    public P0(C0273n0 c0273n0) {
        super(c0273n0);
        this.f652e = new CopyOnWriteArraySet();
        this.f655h = new Object();
        this.f656i = false;
        this.f657j = 1;
        this.f664r = true;
        this.f668v = new C4552j(this, 3);
        this.f654g = new AtomicReference();
        this.f660n = F0.f490c;
        this.f662p = -1L;
        this.f661o = new AtomicLong(0L);
        this.f663q = new Y9.c(c0273n0, 5);
    }

    public static void p0(P0 p02, F0 f02, long j8, boolean z2, boolean z10) {
        p02.c0();
        p02.h0();
        F0 f0N0 = p02.a0().n0();
        long j10 = p02.f662p;
        int i5 = f02.f492b;
        if (j8 <= j10 && F0.h(f0N0.f492b, i5)) {
            p02.zzj().f610l.d("Dropped out-of-date consent setting, proposed settings", f02);
            return;
        }
        Z zA0 = p02.a0();
        zA0.c0();
        if (!F0.h(i5, zA0.l0().getInt("consent_source", 100))) {
            N nZzj = p02.zzj();
            nZzj.f610l.d("Lower precedence consent source ignored, proposed source", Integer.valueOf(i5));
            return;
        }
        SharedPreferences.Editor editorEdit = zA0.l0().edit();
        editorEdit.putString("consent_settings", f02.m());
        editorEdit.putInt("consent_source", i5);
        editorEdit.apply();
        p02.zzj().f612n.d("Setting storage consent(FE)", f02);
        p02.f662p = j8;
        C0273n0 c0273n0 = (C0273n0) p02.f421a;
        C0271m1 c0271m1H = AbstractC0279p0.h(c0273n0);
        if (c0271m1H.t0() && c0271m1H.b0().i1() < 241200) {
            c0273n0.m().o0(z2);
        } else {
            C0271m1 c0271m1H2 = AbstractC0279p0.h(c0273n0);
            boolean zZza = zznm.zza();
            C0273n0 c0273n02 = (C0273n0) c0271m1H2.f421a;
            if ((!zZza || !c0273n02.f979g.o0(null, AbstractC0304y.f1162X0)) && z2) {
                c0273n02.k().m0();
            }
            RunnableC0268l1 runnableC0268l1 = new RunnableC0268l1(0);
            runnableC0268l1.f948b = c0271m1H2;
            c0271m1H2.m0(runnableC0268l1);
        }
        if (z10) {
            c0273n0.m().n0(new AtomicReference());
        }
    }

    public static void q0(P0 p02, F0 f02, F0 f03) {
        boolean z2;
        if (zznm.zza() && ((C0273n0) p02.f421a).f979g.o0(null, AbstractC0304y.f1162X0)) {
            return;
        }
        E0 e02 = E0.ANALYTICS_STORAGE;
        E0 e03 = E0.AD_STORAGE;
        E0[] e0Arr = {e02, e03};
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                z2 = false;
                break;
            }
            E0 e04 = e0Arr[i5];
            if (!f03.i(e04) && f02.i(e04)) {
                z2 = true;
                break;
            }
            i5++;
        }
        boolean zK = f02.k(f03, e02, e03);
        if (z2 || zK) {
            ((C0273n0) p02.f421a).j().m0();
        }
    }

    public final void A0() {
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if (!(c0273n0.f973a.getApplicationContext() instanceof Application) || this.f650c == null) {
            return;
        }
        ((Application) c0273n0.f973a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f650c);
    }

    public final void B0() {
        if (zzpn.zza() && ((C0273n0) this.f421a).f979g.o0(null, AbstractC0304y.f1133I0)) {
            if (zzl().o0()) {
                zzj().f605f.c("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C1581e.e()) {
                zzj().f605f.c("Cannot get trigger URIs from main thread");
                return;
            }
            h0();
            zzj().f612n.c("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C0264k0 c0264k0Zzl = zzl();
            Q0 q02 = new Q0();
            q02.f676c = this;
            q02.f675b = atomicReference;
            c0264k0Zzl.i0(atomicReference, 5000L, "get trigger URIs", q02);
            List list = (List) atomicReference.get();
            if (list == null) {
                zzj().f605f.c("Timed out waiting for get trigger URIs");
                return;
            }
            C0264k0 c0264k0Zzl2 = zzl();
            RunnableC0278p runnableC0278p = new RunnableC0278p(4);
            runnableC0278p.f1018b = this;
            runnableC0278p.f1019c = list;
            c0264k0Zzl2.m0(runnableC0278p);
        }
    }

    public final void C0() {
        String string;
        int i5;
        int i10;
        int i11;
        String string2;
        int i12;
        int i13;
        Bundle bundle;
        String str;
        Bundle bundle2;
        c0();
        zzj().f611m.c("Handle tcf update.");
        SharedPreferences sharedPreferencesK0 = a0().k0();
        HashMap map = new HashMap();
        try {
            string = sharedPreferencesK0.getString("IABTCF_VendorConsents", WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        } catch (ClassCastException unused) {
            string = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
        }
        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i5 = sharedPreferencesK0.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i5 = -1;
        }
        if (i5 != -1) {
            map.put("gdprApplies", String.valueOf(i5));
        }
        try {
            i10 = sharedPreferencesK0.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i10 = -1;
        }
        if (i10 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i10));
        }
        try {
            i11 = sharedPreferencesK0.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i11 = -1;
        }
        if (i11 != -1) {
            map.put("PolicyVersion", String.valueOf(i11));
        }
        try {
            string2 = sharedPreferencesK0.getString("IABTCF_PurposeConsents", WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        } catch (ClassCastException unused5) {
            string2 = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
        }
        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i12 = sharedPreferencesK0.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i12 = -1;
        }
        if (i12 != -1) {
            map.put("CmpSdkID", String.valueOf(i12));
        }
        D1 d12 = new D1(map);
        zzj().f612n.d("Tcf preferences read", d12);
        Z zA0 = a0();
        zA0.c0();
        String string3 = zA0.l0().getString("stored_tcf_param", "");
        String strA = d12.a();
        if (strA.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = zA0.l0().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        HashMap map2 = d12.f437a;
        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map2.get("GoogleConsent")) && UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map2.get("gdprApplies")) && UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iB = d12.b();
            if (iB < 0) {
                bundle2 = Bundle.EMPTY;
            } else {
                String str2 = (String) map2.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    bundle2 = Bundle.EMPTY;
                } else {
                    bundle = new Bundle();
                    String str3 = "denied";
                    if (str2.length() > 0) {
                        bundle.putString("ad_storage", str2.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str2.length() > 3) {
                        bundle.putString("ad_personalization", (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                    }
                    if (str2.length() <= 6 || iB < 4) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                            str3 = "granted";
                        }
                        bundle.putString("ad_user_data", str3);
                    }
                }
            }
            bundle = bundle2;
            i13 = 0;
        } else {
            i13 = 0;
            bundle = Bundle.EMPTY;
        }
        zzj().f612n.d("Consent generated from Tcf", bundle);
        if (bundle != Bundle.EMPTY) {
            ((C0273n0) this.f421a).f985n.getClass();
            r0(bundle, -30, System.currentTimeMillis());
        }
        Bundle bundle3 = new Bundle();
        StringBuilder sb2 = new StringBuilder(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        try {
            str = (String) map2.get("CmpSdkID");
        } catch (NumberFormatException unused7) {
        }
        int i14 = !TextUtils.isEmpty(str) ? Integer.parseInt(str) : -1;
        if (i14 < 0 || i14 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i14 >> 6) & 63));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i14 & 63));
        }
        int iB2 = d12.b();
        if (iB2 < 0 || iB2 > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iB2));
        }
        int i15 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map2.get("gdprApplies")) ? 2 : i13;
        int i16 = i15 | 4;
        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map2.get("EnableAdvertiserConsentMode"))) {
            i16 = i15 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16));
        bundle3.putString("_tcfd", sb2.toString());
        H0("auto", "_tcf", bundle3);
    }

    public final void D0() {
        E1 e12;
        c0();
        this.f659m = false;
        if (y0().isEmpty() || this.f656i || (e12 = (E1) y0().poll()) == null) {
            return;
        }
        U1 u1B0 = b0();
        if (u1B0.f718f == null) {
            u1B0.f718f = e3.e.a(((C0273n0) u1B0.f421a).f973a);
        }
        e3.d dVar = u1B0.f718f;
        if (dVar == null) {
            return;
        }
        this.f656i = true;
        P p10 = zzj().f612n;
        String str = e12.f487a;
        p10.d("Registering trigger URI", str);
        p8.p pVarE = dVar.e(Uri.parse(str));
        if (pVarE == null) {
            this.f656i = false;
            y0().add(e12);
            return;
        }
        if (!((C0273n0) this.f421a).f979g.o0(null, AbstractC0304y.f1142N0)) {
            SparseArray sparseArrayM0 = a0().m0();
            sparseArrayM0.put(e12.f489c, Long.valueOf(e12.f488b));
            a0().h0(sparseArrayM0);
        }
        pVarE.addListener(new L7.b(24, pVarE, new S3.e(2, this, e12)), new V0(this, 0));
    }

    public final void E0() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        P0 p02;
        c0();
        String strU = a0().f773n.u();
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if (strU == null) {
            p02 = this;
        } else if ("unset".equals(strU)) {
            c0273n0.f985n.getClass();
            p02 = this;
            p02.k0(System.currentTimeMillis(), null, "app", "_npa");
        } else {
            Long lValueOf = Long.valueOf("true".equals(strU) ? 1L : 0L);
            c0273n0.f985n.getClass();
            k0(System.currentTimeMillis(), lValueOf, "app", "_npa");
            p02 = this;
        }
        if (c0273n0.e() && p02.f664r) {
            zzj().f611m.c("Recording app launch after enabling measurement for the first time (FE)");
            z0();
            g0().f1114e.r();
            zzl().m0(new RunnableC0284r0(this));
            return;
        }
        zzj().f611m.c("Updating Scion state (FE)");
        C0271m1 c0271m1M = c0273n0.m();
        c0271m1M.c0();
        c0271m1M.h0();
        c0271m1M.m0(new RunnableC0283q1(c0271m1M, c0271m1M.w0(true), 3));
    }

    public final void F0(Bundle bundle, long j8) {
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().f608i.c("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        I0.a(bundle2, "app_id", String.class, null);
        I0.a(bundle2, "origin", String.class, null);
        I0.a(bundle2, MediationMetaData.KEY_NAME, String.class, null);
        I0.a(bundle2, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Object.class, null);
        I0.a(bundle2, "trigger_event_name", String.class, null);
        I0.a(bundle2, "trigger_timeout", Long.class, 0L);
        I0.a(bundle2, "timed_out_event_name", String.class, null);
        I0.a(bundle2, "timed_out_event_params", Bundle.class, null);
        I0.a(bundle2, "triggered_event_name", String.class, null);
        I0.a(bundle2, "triggered_event_params", Bundle.class, null);
        I0.a(bundle2, "time_to_live", Long.class, 0L);
        I0.a(bundle2, "expired_event_name", String.class, null);
        I0.a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC1732v.f(bundle2.getString(MediationMetaData.KEY_NAME));
        AbstractC1732v.f(bundle2.getString("origin"));
        AbstractC1732v.i(bundle2.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
        bundle2.putLong("creation_timestamp", j8);
        String string = bundle2.getString(MediationMetaData.KEY_NAME);
        Object obj = bundle2.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        int iW0 = b0().W0(string);
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if (iW0 != 0) {
            N nZzj = zzj();
            nZzj.f605f.d("Invalid conditional user property name", c0273n0.f984m.g(string));
            return;
        }
        if (b0().h0(obj, string) != 0) {
            N nZzj2 = zzj();
            nZzj2.f605f.b(c0273n0.f984m.g(string), "Invalid conditional user property value", obj);
            return;
        }
        Object objC1 = b0().c1(obj, string);
        if (objC1 == null) {
            N nZzj3 = zzj();
            nZzj3.f605f.b(c0273n0.f984m.g(string), "Unable to normalize conditional user property value", obj);
            return;
        }
        I0.g(objC1, bundle2);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
            N nZzj4 = zzj();
            nZzj4.f605f.b(c0273n0.f984m.g(string), "Invalid conditional user property timeout", Long.valueOf(j10));
            return;
        }
        long j11 = bundle2.getLong("time_to_live");
        if (j11 <= 15552000000L && j11 >= 1) {
            zzl().m0(new S0(this, bundle2, 2));
            return;
        }
        N nZzj5 = zzj();
        nZzj5.f605f.b(c0273n0.f984m.g(string), "Invalid conditional user property time to live", Long.valueOf(j11));
    }

    public final void G0(String str) {
        this.f654g.set(str);
    }

    public final void H0(String str, String str2, Bundle bundle) {
        c0();
        ((C0273n0) this.f421a).f985n.getClass();
        v0(str, str2, bundle, System.currentTimeMillis());
    }

    @Override // A7.Y
    public final boolean j0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(long r10, java.lang.Object r12, java.lang.String r13, java.lang.String r14) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.AbstractC1732v.f(r13)
            com.google.android.gms.common.internal.AbstractC1732v.f(r14)
            r9.c0()
            r9.h0()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L67
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L4c
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4c
            java.util.Locale r12 = java.util.Locale.ENGLISH
            java.lang.String r12 = r0.toLowerCase(r12)
            java.lang.String r14 = "false"
            boolean r12 = r14.equals(r12)
            r2 = 1
            if (r12 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            A7.Z r0 = r9.a0()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L45
            java.lang.String r14 = "true"
        L45:
            A7.b0 r0 = r0.f773n
            r0.v(r14)
        L4a:
            r14 = r1
            goto L5a
        L4c:
            if (r12 != 0) goto L5a
            A7.Z r14 = r9.a0()
            A7.b0 r14 = r14.f773n
            java.lang.String r0 = "unset"
            r14.v(r0)
            goto L4a
        L5a:
            A7.N r0 = r9.zzj()
            java.lang.String r1 = "non_personalized_ads(_npa)"
            A7.P r0 = r0.f612n
            java.lang.String r2 = "Setting user property(FE)"
            r0.b(r1, r2, r12)
        L67:
            r6 = r12
            r7 = r14
            java.lang.Object r12 = r9.f421a
            A7.n0 r12 = (A7.C0273n0) r12
            boolean r14 = r12.e()
            if (r14 != 0) goto L7f
            A7.N r10 = r9.zzj()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            A7.P r10 = r10.f612n
            r10.c(r11)
            return
        L7f:
            boolean r14 = r12.f()
            if (r14 != 0) goto L86
            return
        L86:
            A7.R1 r3 = new A7.R1
            r4 = r10
            r8 = r13
            r3.<init>(r4, r6, r7, r8)
            A7.m1 r1 = A7.AbstractC0279p0.h(r12)
            java.lang.Object r10 = r1.f421a
            A7.n0 r10 = (A7.C0273n0) r10
            A7.H r10 = r10.k()
            r10.getClass()
            android.os.Parcel r11 = android.os.Parcel.obtain()
            r12 = 0
            r3.writeToParcel(r11, r12)
            byte[] r13 = r11.marshall()
            r11.recycle()
            int r11 = r13.length
            r14 = 131072(0x20000, float:1.83671E-40)
            r0 = 1
            if (r11 <= r14) goto Lbd
            A7.N r10 = r10.zzj()
            java.lang.String r11 = "User property too long for local database. Sending directly to service"
            A7.P r10 = r10.f606g
            r10.c(r11)
            goto Lc1
        Lbd:
            boolean r12 = r10.l0(r0, r13)
        Lc1:
            A7.N1 r2 = r1.w0(r0)
            A7.p1 r0 = new A7.p1
            r5 = 0
            r4 = r3
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r1.m0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.P0.k0(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void l0(long j8, boolean z2) throws JSONException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c0();
        h0();
        zzj().f611m.c("Resetting analytics data (FE)");
        C0303x1 c0303x1G0 = g0();
        c0303x1G0.c0();
        B1 b12 = c0303x1G0.f1115f;
        ((C1) b12.f425d).a();
        C0303x1 c0303x1 = (C0303x1) b12.f426e;
        if (((C0273n0) c0303x1.f421a).f979g.o0(null, AbstractC0304y.f1171b1)) {
            ((C0273n0) c0303x1.f421a).f985n.getClass();
            b12.f423b = SystemClock.elapsedRealtime();
        } else {
            b12.f423b = 0L;
        }
        b12.f424c = b12.f423b;
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        c0273n0.j().m0();
        boolean zE = c0273n0.e();
        Z zA0 = a0();
        zA0.f767g.f(j8);
        if (!TextUtils.isEmpty(zA0.a0().f782w.u())) {
            zA0.f782w.v(null);
        }
        zA0.f776q.f(0L);
        zA0.f777r.f(0L);
        Boolean boolM0 = ((C0273n0) zA0.f421a).f979g.m0("firebase_analytics_collection_deactivated");
        if (boolM0 == null || !boolM0.booleanValue()) {
            zA0.j0(!zE);
        }
        zA0.f783x.v(null);
        zA0.f784y.f(0L);
        zA0.f785z.p(null);
        if (z2) {
            C0271m1 c0271m1H = AbstractC0279p0.h(c0273n0);
            N1 n1W0 = c0271m1H.w0(false);
            ((C0273n0) c0271m1H.f421a).k().m0();
            c0271m1H.m0(new RunnableC0283q1(c0271m1H, n1W0, 0));
        }
        g0().f1114e.r();
        this.f664r = !zE;
    }

    public final void m0(C0275o c0275o, boolean z2) {
        RunnableC0278p runnableC0278p = new RunnableC0278p(8, this, c0275o);
        if (!z2) {
            zzl().m0(runnableC0278p);
        } else {
            c0();
            runnableC0278p.run();
        }
    }

    public final void n0(F0 f02) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c0();
        boolean z2 = (f02.i(E0.ANALYTICS_STORAGE) && f02.i(E0.AD_STORAGE)) || ((C0273n0) this.f421a).m().s0();
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        C0264k0 c0264k0 = c0273n0.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        if (z2 != c0273n0.f968D) {
            C0273n0 c0273n02 = (C0273n0) this.f421a;
            C0264k0 c0264k02 = c0273n02.f982j;
            C0273n0.d(c0264k02);
            c0264k02.c0();
            c0273n02.f968D = z2;
            Z zA0 = a0();
            zA0.c0();
            Boolean boolValueOf = zA0.l0().contains("measurement_enabled_from_api") ? Boolean.valueOf(zA0.l0().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z2 || boolValueOf == null || boolValueOf.booleanValue()) {
                s0(Boolean.valueOf(z2), false);
            }
        }
    }

    public final void o0(F0 f02, long j8, boolean z2) {
        F0 f03;
        boolean z10;
        F0 f0J;
        boolean zK;
        boolean z11;
        h0();
        int i5 = f02.f492b;
        if (i5 != -10) {
            H0 h02 = (H0) f02.f491a.get(E0.AD_STORAGE);
            if (h02 == null) {
                h02 = H0.UNINITIALIZED;
            }
            H0 h03 = H0.UNINITIALIZED;
            if (h02 == h03) {
                H0 h04 = (H0) f02.f491a.get(E0.ANALYTICS_STORAGE);
                if (h04 == null) {
                    h04 = h03;
                }
                if (h04 == h03) {
                    zzj().k.c("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f655h) {
            try {
                f03 = this.f660n;
                z10 = false;
                if (F0.h(i5, f03.f492b)) {
                    zK = f02.k(this.f660n, (E0[]) f02.f491a.keySet().toArray(new E0[0]));
                    E0 e02 = E0.ANALYTICS_STORAGE;
                    if (f02.i(e02) && !this.f660n.i(e02)) {
                        z10 = true;
                    }
                    f0J = f02.j(this.f660n);
                    this.f660n = f0J;
                    z11 = z10;
                    z10 = true;
                } else {
                    f0J = f02;
                    zK = false;
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            zzj().f610l.d("Ignoring lower-priority consent settings, proposed settings", f0J);
            return;
        }
        long andIncrement = this.f661o.getAndIncrement();
        if (zK) {
            G0(null);
            RunnableC0238b1 runnableC0238b1 = new RunnableC0238b1(this, f0J, j8, andIncrement, z11, f03);
            if (!z2) {
                zzl().n0(runnableC0238b1);
                return;
            } else {
                c0();
                runnableC0238b1.run();
                return;
            }
        }
        RunnableC0244d1 runnableC0244d1 = new RunnableC0244d1(this, f0J, andIncrement, z11, f03);
        if (z2) {
            c0();
            runnableC0244d1.run();
        } else if (i5 == 30 || i5 == -10) {
            zzl().n0(runnableC0244d1);
        } else {
            zzl().m0(runnableC0244d1);
        }
    }

    public final void r0(Bundle bundle, int i5, long j8) {
        String string;
        H0 h02;
        h0();
        F0 f02 = F0.f490c;
        E0[] e0Arr = G0.STORAGE.f499a;
        int length = e0Arr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                string = null;
                break;
            }
            E0 e02 = e0Arr[i10];
            if (bundle.containsKey(e02.f486a) && (string = bundle.getString(e02.f486a)) != null) {
                if ((string.equals("granted") ? Boolean.TRUE : string.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i10++;
        }
        if (string != null) {
            zzj().k.d("Ignoring invalid consent setting", string);
            zzj().k.c("Valid consent values are 'granted', 'denied'");
        }
        boolean zO0 = zzl().o0();
        F0 f0B = F0.b(i5, bundle);
        Iterator it = f0B.f491a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            h02 = H0.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((H0) it.next()) != h02) {
                o0(f0B, j8, zO0);
                break;
            }
        }
        C0275o c0275oA = C0275o.a(i5, bundle);
        Iterator it2 = c0275oA.f1005e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((H0) it2.next()) != h02) {
                m0(c0275oA, zO0);
                break;
            }
        }
        Boolean boolC = C0275o.c(bundle);
        if (boolC != null) {
            String str = i5 == -30 ? "tcf" : "app";
            if (((C0273n0) this.f421a).f979g.o0(null, AbstractC0304y.f1152S0) && zO0) {
                k0(j8, boolC.toString(), str, "allow_personalized_ads");
            } else {
                x0(str, "allow_personalized_ads", boolC.toString(), false, j8);
            }
        }
    }

    public final void s0(Boolean bool, boolean z2) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c0();
        h0();
        zzj().f611m.d("Setting app measurement enabled (FE)", bool);
        Z zA0 = a0();
        zA0.c0();
        SharedPreferences.Editor editorEdit = zA0.l0().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z2) {
            Z zA02 = a0();
            zA02.c0();
            SharedPreferences.Editor editorEdit2 = zA02.l0().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        C0264k0 c0264k0 = c0273n0.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        if (c0273n0.f968D || !(bool == null || bool.booleanValue())) {
            E0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.P0.t0(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    public final void u0(String str, String str2, Bundle bundle) {
        ((C0273n0) this.f421a).f985n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC1732v.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().m0(new S0(this, bundle2, 1));
    }

    public final void v0(String str, String str2, Bundle bundle, long j8) {
        c0();
        t0(str, str2, j8, bundle, true, this.f651d == null || U1.j1(str2), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r3 > 500) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r4 > 500) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(java.lang.String r16, java.lang.String r17, android.os.Bundle r18, boolean r19, boolean r20, long r21) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.P0.w0(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            r11 = this;
            if (r12 != 0) goto L5
            java.lang.String r2 = "app"
            goto L6
        L5:
            r2 = r12
        L6:
            r4 = 0
            r5 = 24
            if (r15 == 0) goto L14
            A7.U1 r6 = r11.b0()
            int r6 = r6.W0(r13)
            goto L37
        L14:
            A7.U1 r6 = r11.b0()
            java.lang.String r7 = "user property"
            boolean r8 = r6.e1(r7, r13)
            r9 = 6
            if (r8 != 0) goto L23
        L21:
            r6 = r9
            goto L37
        L23:
            java.lang.String[] r8 = A7.I0.f527e
            r10 = 0
            boolean r8 = r6.S0(r7, r8, r10, r13)
            if (r8 != 0) goto L2f
            r6 = 15
            goto L37
        L2f:
            boolean r6 = r6.J0(r5, r7, r13)
            if (r6 != 0) goto L36
            goto L21
        L36:
            r6 = r4
        L37:
            y3.j r7 = r11.f668v
            java.lang.Object r8 = r11.f421a
            A7.n0 r8 = (A7.C0273n0) r8
            r9 = 1
            if (r6 == 0) goto L5f
            r11.b0()
            java.lang.String r0 = A7.U1.s0(r13, r5, r9)
            if (r13 == 0) goto L4d
            int r4 = r13.length()
        L4d:
            r8.n()
            r2 = 0
            java.lang.String r3 = "_ev"
            r16 = r0
            r13 = r2
            r15 = r3
            r17 = r4
            r14 = r6
            r12 = r7
            A7.U1.H0(r12, r13, r14, r15, r16, r17)
            return
        L5f:
            r6 = r7
            if (r14 == 0) goto Lb1
            A7.U1 r7 = r11.b0()
            int r7 = r7.h0(r14, r13)
            if (r7 == 0) goto L95
            r11.b0()
            java.lang.String r2 = A7.U1.s0(r13, r5, r9)
            boolean r3 = r14 instanceof java.lang.String
            if (r3 != 0) goto L7b
            boolean r3 = r14 instanceof java.lang.CharSequence
            if (r3 == 0) goto L83
        L7b:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r4 = r0.length()
        L83:
            r8.n()
            r0 = 0
            java.lang.String r3 = "_ev"
            r13 = r0
            r16 = r2
            r15 = r3
            r17 = r4
            r12 = r6
            r14 = r7
            A7.U1.H0(r12, r13, r14, r15, r16, r17)
            return
        L95:
            A7.U1 r4 = r11.b0()
            java.lang.Object r4 = r4.c1(r14, r13)
            if (r4 == 0) goto Lb0
            A7.k0 r8 = r11.zzl()
            A7.v0 r0 = new A7.v0
            r7 = 1
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r8.m0(r0)
        Lb0:
            return
        Lb1:
            A7.k0 r8 = r11.zzl()
            A7.v0 r0 = new A7.v0
            r4 = 0
            r7 = 1
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r8.m0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.P0.x0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final PriorityQueue y0() {
        if (this.f658l == null) {
            this.f658l = O0.k(Comparator.CC.comparing(new M0(), new R0(0)));
        }
        return this.f658l;
    }

    public final void z0() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c0();
        h0();
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if (c0273n0.f()) {
            Boolean boolM0 = c0273n0.f979g.m0("google_analytics_deferred_deep_link_enabled");
            if (boolM0 != null && boolM0.booleanValue()) {
                zzj().f611m.c("Deferred Deep Link feature enabled.");
                C0264k0 c0264k0Zzl = zzl();
                RunnableC0284r0 runnableC0284r0 = new RunnableC0284r0(1);
                runnableC0284r0.f1037b = this;
                c0264k0Zzl.m0(runnableC0284r0);
            }
            C0271m1 c0271m1H = AbstractC0279p0.h(c0273n0);
            N1 n1W0 = c0271m1H.w0(true);
            ((C0273n0) c0271m1H.f421a).k().l0(3, new byte[0]);
            c0271m1H.m0(new RunnableC0283q1(c0271m1H, n1W0, 1));
            this.f664r = false;
            Z zA0 = a0();
            zA0.c0();
            String string = zA0.l0().getString("previous_os_version", null);
            ((C0273n0) zA0.f421a).i().e0();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zA0.l0().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c0273n0.i().e0();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            H0("auto", "_ou", bundle);
        }
    }
}
