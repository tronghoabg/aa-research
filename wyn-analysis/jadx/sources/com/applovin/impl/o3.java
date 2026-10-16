package com.applovin.impl;

import A7.AbstractC0279p0;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C1627b0;
import com.applovin.impl.b7;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* loaded from: classes.dex */
public class o3 extends s2 implements AppLovinCommunicatorSubscriber, C1627b0.a {

    /* renamed from: A, reason: collision with root package name */
    private List f22377A;

    /* renamed from: B, reason: collision with root package name */
    private List f22378B;

    /* renamed from: C, reason: collision with root package name */
    private List f22379C;

    /* renamed from: D, reason: collision with root package name */
    private List f22380D;

    /* renamed from: E, reason: collision with root package name */
    private List f22381E;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f22382e;

    /* renamed from: f, reason: collision with root package name */
    private List f22383f;

    /* renamed from: g, reason: collision with root package name */
    private List f22384g;

    /* renamed from: h, reason: collision with root package name */
    private List f22385h;

    /* renamed from: i, reason: collision with root package name */
    private List f22386i;

    /* renamed from: j, reason: collision with root package name */
    private String f22387j;
    private String k;

    /* renamed from: l, reason: collision with root package name */
    private String f22388l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22389m;

    /* renamed from: n, reason: collision with root package name */
    private final StringBuilder f22390n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f22391o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22392p;

    /* renamed from: q, reason: collision with root package name */
    private List f22393q;

    /* renamed from: r, reason: collision with root package name */
    private List f22394r;

    /* renamed from: s, reason: collision with root package name */
    private List f22395s;

    /* renamed from: t, reason: collision with root package name */
    private List f22396t;

    /* renamed from: u, reason: collision with root package name */
    private List f22397u;

    /* renamed from: v, reason: collision with root package name */
    private List f22398v;

    /* renamed from: w, reason: collision with root package name */
    private List f22399w;

    /* renamed from: x, reason: collision with root package name */
    private List f22400x;

    /* renamed from: y, reason: collision with root package name */
    private List f22401y;

    /* renamed from: z, reason: collision with root package name */
    private List f22402z;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22403a;

        static {
            int[] iArr = new int[C1627b0.b.values().length];
            f22403a = iArr;
            try {
                iArr[C1627b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22403a[C1627b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22403a[C1627b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22403a[C1627b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22403a[C1627b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        MICRO_SDK_PARTNER_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public o3(Context context) {
        super(context);
        this.f22390n = new StringBuilder("");
        this.f22391o = new AtomicBoolean();
        this.f22393q = new ArrayList();
        this.f22394r = new ArrayList();
        this.f22395s = new ArrayList();
        this.f22396t = new ArrayList();
        this.f22397u = new ArrayList();
        this.f22398v = new ArrayList();
        this.f22399w = new ArrayList();
        this.f22400x = new ArrayList();
        this.f22401y = new ArrayList();
        this.f22402z = new ArrayList();
        this.f22377A = new ArrayList();
        this.f22378B = new ArrayList();
        this.f22379C = new ArrayList();
        this.f22380D = new ArrayList();
        this.f22381E = new ArrayList();
    }

    private List g() {
        boolean zC = this.f22382e.t0().c();
        List listB = this.f22382e.t0().b();
        return zC ? a((String) null, a(listB, false)) : a(a(listB, true), (String) null);
    }

    private List j() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f22761a.getPackageManager().getPackageInfo(this.f22761a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(r2.a().d("Package Name").c(this.f22761a.getPackageName()).a());
        r2.b bVarD = r2.a().d("App Version");
        boolean zIsValidString = StringUtils.isValidString(str);
        String strV = OfficeOpenXMLExtended.SECURITY_NONE;
        if (!zIsValidString) {
            str = OfficeOpenXMLExtended.SECURITY_NONE;
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(r2.a().d("OS").c(o7.d()).a());
        arrayList.add(r2.a().d("Account").c(StringUtils.isValidString(this.f22388l) ? this.f22388l : OfficeOpenXMLExtended.SECURITY_NONE).a());
        r2.b bVarD2 = r2.a().d("Mediation Provider");
        if (StringUtils.isValidString(this.f22382e.V())) {
            strV = this.f22382e.V();
        }
        arrayList.add(bVarD2.c(strV).a());
        arrayList.add(r2.a().d("OM SDK Version").c(this.f22382e.e0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.G0()));
        return arrayList;
    }

    private r2 l() {
        String strD = this.f22382e.s0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.f22382e.s0().j());
        r2.b bVarD = r2.a(r2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : OfficeOpenXMLExtended.SECURITY_NONE;
        }
        r2.b bVarC = bVarD.c(strD);
        if (this.f22389m) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f22761a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z2 = this.f22382e.v().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z2 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(AbstractC1650m0.a(z2 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f22761a));
            }
        }
        return bVarC.a();
    }

    private r2 m() {
        return r2.a().d("MAX Terms and Privacy Policy Flow").a(this.f22761a).a(true).a();
    }

    private r2 n() {
        boolean zHasSupportedCmp = this.f22382e.s().hasSupportedCmp();
        return r2.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(AbstractC1650m0.a(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f22761a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private List q() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(r2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f22382e.a(y4.f23676Q3);
        r2.b bVarD = r2.a().d("Plugin Version");
        boolean zIsValidString = StringUtils.isValidString(str);
        String str2 = OfficeOpenXMLExtended.SECURITY_NONE;
        if (!zIsValidString) {
            str = OfficeOpenXMLExtended.SECURITY_NONE;
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(e());
        if (this.f22382e.I0()) {
            String strA = o7.a(this.f22382e.o0());
            if (StringUtils.isValidString(strA)) {
                str2 = strA;
            }
            arrayList.add(b("Unity Version", str2));
        }
        if (this.f22382e.x().j()) {
            arrayList.add(m());
            arrayList.add(n());
            return arrayList;
        }
        if (this.f22382e.x().l()) {
            arrayList.add(u());
        }
        return arrayList;
    }

    private r2 r() {
        return r2.a().d("Network Consent Statuses").a(this.f22761a).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.f22382e.s0().j())) {
            arrayList.add(r());
        } else {
            arrayList.add(new s4(AbstractC1656p0.b(), false, this.f22761a));
        }
        arrayList.add(new s4(AbstractC1656p0.a(), true, this.f22761a));
        return arrayList;
    }

    private r2 u() {
        return r2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(AbstractC1650m0.a(R.color.applovin_sdk_xmarkColor, this.f22761a)).b("Terms Flow has been replaced").a(this.f22382e.x().g()).a(true).a();
    }

    private void z() {
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + o7.c(this.f22382e));
        sb2.append("\nTest Mode - ".concat(this.f22382e.t0().c() ? "enabled" : "disabled"));
        sb2.append("\nTarget SDK - " + this.f22382e.A().F().get("target_sdk"));
        sb2.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f22382e.a(y4.f23676Q3);
        String strB = C1643j.b();
        sb2.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder("\nPlugin Version - ");
        boolean zIsValidString = StringUtils.isValidString(str2);
        String str3 = OfficeOpenXMLExtended.SECURITY_NONE;
        if (!zIsValidString) {
            str2 = OfficeOpenXMLExtended.SECURITY_NONE;
        }
        sb3.append(str2);
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb4.append(strB);
        sb2.append(sb4.toString());
        if (this.f22382e.I0()) {
            String strA = o7.a(this.f22382e.o0());
            StringBuilder sb5 = new StringBuilder("\nUnity Version - ");
            if (StringUtils.isValidString(strA)) {
                str3 = strA;
            }
            sb5.append(str3);
            sb2.append(sb5.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(AbstractC1656p0.a(this.f22761a));
        sb2.append(this.f22382e.x().e());
        sb2.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb2.append(this.f22382e.s0().i());
        sb2.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb2.append(((b7) it.next()).e());
        }
        sb2.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f22394r.iterator();
        while (it2.hasNext()) {
            a(sb2, ((e3) it2.next()).j());
        }
        Iterator it3 = this.f22395s.iterator();
        while (it3.hasNext()) {
            a(sb2, ((e3) it3.next()).j());
        }
        Iterator it4 = this.f22393q.iterator();
        while (it4.hasNext()) {
            a(sb2, ((e3) it4.next()).j());
        }
        sb2.append("\n========== AD UNITS ==========");
        Iterator it5 = this.f22384g.iterator();
        while (it5.hasNext()) {
            a(sb2, ((C1651n) it5.next()).e());
        }
        sb2.append("\n========== END ==========");
        com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", sb2.toString());
        this.f22390n.append(sb2.toString());
    }

    public boolean a(r2 r2Var) {
        if (r2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(r2Var.k().toString());
    }

    public void b(boolean z2) {
        this.f22392p = z2;
    }

    @Override // com.applovin.impl.s2
    public List c(int i5) {
        return i5 == e.APP_INFO.ordinal() ? this.f22400x : i5 == e.MAX.ordinal() ? this.f22401y : i5 == e.PRIVACY.ordinal() ? this.f22402z : i5 == e.ADS.ordinal() ? this.f22377A : i5 == e.INCOMPLETE_NETWORKS.ordinal() ? this.f22378B : i5 == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? this.f22379C : i5 == e.COMPLETED_NETWORKS.ordinal() ? this.f22380D : this.f22381E;
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f22383f.iterator();
        while (it.hasNext()) {
            arrayList.add(((e3) it.next()).t());
        }
        String strK = this.f22382e.s0().k();
        if (strK != null) {
            String strC = this.f22382e.s0().c();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                b7 b7Var = (b7) it2.next();
                if (b7Var.f() == b7.a.TCF_VENDOR && b7Var.d() != null) {
                    b7Var.a(Boolean.valueOf(d7.a(strK, b7Var.d().intValue() - 1)));
                } else if (b7Var.f() == b7.a.ATP_NETWORK && b7Var.d() != null) {
                    b7Var.a(d7.a(b7Var.d().intValue(), strC));
                }
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((b7) it3.next()).a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i5) {
        return i5 == e.APP_INFO.ordinal() ? new w4("APP INFO") : i5 == e.MAX.ordinal() ? new w4("MAX") : i5 == e.PRIVACY.ordinal() ? new w4("PRIVACY") : i5 == e.ADS.ordinal() ? new w4("ADS") : i5 == e.INCOMPLETE_NETWORKS.ordinal() ? new w4("INCOMPLETE SDK INTEGRATIONS") : i5 == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? new w4("APPLOVIN MICRO SDK PARTNERS") : i5 == e.COMPLETED_NETWORKS.ordinal() ? new w4("COMPLETED SDK INTEGRATIONS") : new w4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.f22384g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.k;
    }

    public String i() {
        return this.f22387j;
    }

    public List k() {
        return this.f22397u;
    }

    public List o() {
        return this.f22385h;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f22402z = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f22378B = a(this.f22393q);
            this.f22379C = a(this.f22394r);
            this.f22380D = a(this.f22395s);
            c();
            return;
        }
        if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f22377A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f22377A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public String p() {
        return this.f22390n.toString();
    }

    public com.applovin.impl.sdk.k t() {
        return this.f22382e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f22391o.get() + "}";
    }

    public List v() {
        return this.f22399w;
    }

    public List w() {
        return this.f22398v;
    }

    public boolean x() {
        return this.f22392p;
    }

    public boolean y() {
        return this.f22391o.get();
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1653o c1653oF = ((C1651n) it.next()).f();
            Iterator it2 = c1653oF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((j8) it2.next()).b());
            }
            Iterator it3 = c1653oF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((j8) it3.next()).b());
            }
        }
        this.f22397u = new ArrayList(hashSet);
        this.f22398v = new ArrayList(hashSet2);
        Collections.sort(this.f22397u);
        Collections.sort(this.f22398v);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z2, com.applovin.impl.sdk.k kVar) {
        this.f22382e = kVar;
        this.f22383f = list;
        this.f22384g = list2;
        this.f22385h = list3;
        this.f22386i = list4;
        this.f22387j = str;
        this.k = str2;
        this.f22388l = str3;
        this.f22389m = z2;
        if (list != null && this.f22391o.compareAndSet(false, true)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.f22395s);
            this.f22400x.addAll(j());
            this.f22401y.addAll(q());
            this.f22402z.addAll(s());
            this.f22377A.addAll(g());
            this.f22378B = a(this.f22393q);
            this.f22379C = a(this.f22394r);
            this.f22380D = a(this.f22395s);
            this.f22381E = a(this.f22396t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f22761a).subscribe(this, arrayList);
            z();
        }
        AppLovinSdkUtils.runOnUiThread(new D0(this, 12));
    }

    @Override // com.applovin.impl.s2
    public int d(int i5) {
        if (i5 == e.APP_INFO.ordinal()) {
            return this.f22400x.size();
        }
        if (i5 == e.MAX.ordinal()) {
            return this.f22401y.size();
        }
        if (i5 == e.PRIVACY.ordinal()) {
            return this.f22402z.size();
        }
        if (i5 == e.ADS.ordinal()) {
            return this.f22377A.size();
        }
        if (i5 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f22378B.size();
        }
        if (i5 == e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return this.f22379C.size();
        }
        if (i5 == e.COMPLETED_NETWORKS.ordinal()) {
            return this.f22380D.size();
        }
        return this.f22381E.size();
    }

    private r2 b(String str, String str2) {
        r2.b bVarD = r2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(AbstractC1650m0.a(R.color.applovin_sdk_xmarkColor, this.f22761a));
        }
        return bVarD.a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (!e3Var.H()) {
                if (e3Var.q() != e3.a.INCOMPLETE_INTEGRATION && e3Var.q() != e3.a.INVALID_INTEGRATION) {
                    if (e3Var.q() == e3.a.COMPLETE) {
                        if (e3Var.z()) {
                            this.f22394r.add(e3Var);
                        } else {
                            this.f22395s.add(e3Var);
                        }
                    } else if (e3Var.q() == e3.a.MISSING) {
                        this.f22396t.add(e3Var);
                    }
                } else if (e3Var.z()) {
                    this.f22394r.add(e3Var);
                } else {
                    this.f22393q.add(e3Var);
                }
            }
        }
    }

    private r2 e() {
        String strC;
        r2.b bVarD = r2.a().d("Ad Review Version");
        String strB = C1643j.b();
        if (StringUtils.isValidString(strB)) {
            String strA = C1643j.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.f22382e.j0())) {
                strC = null;
            } else {
                strC = wg.b.c(new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your "), this.f22382e.I0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated", " from the correct account.");
            }
        } else {
            strC = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (strC != null) {
            bVarD.b("MAX Ad Review").a(strC).a(R.drawable.applovin_ic_x_mark).b(AbstractC1650m0.a(R.color.applovin_sdk_xmarkColor, this.f22761a)).a(true);
        } else {
            bVarD.c(strB);
        }
        return bVarD.a();
    }

    private r2 b(String str) {
        r2.b bVarA = r2.a();
        if (this.f22382e.t0().c()) {
            bVarA.a(this.f22761a);
        }
        r2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f22382e.t0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.y() == e3.b.READY) {
                this.f22399w.add(e3Var);
            }
        }
    }

    @Override // com.applovin.impl.C1627b0.a
    public void a(C1676z c1676z, String str) {
        String strA;
        c cVarA;
        c cVar;
        String strL;
        List<C1624a0> listA = C1627b0.a(c1676z, this.f22386i);
        if (listA.isEmpty()) {
            strL = AbstractC0279p0.l("All required entries found at ", str, ".");
            cVar = c.SUCCESS;
        } else {
            C1624a0 c1624a0 = null;
            for (C1624a0 c1624a02 : listA) {
                this.f22382e.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = this.f22382e.O();
                    StringBuilder sbQ = AbstractC0279p0.q(str, " is missing a required entry: ");
                    sbQ.append(c1624a02.d());
                    oVarO.b("MediationDebuggerListAdapter", sbQ.toString());
                }
                if (c1624a02.g()) {
                    c1624a0 = c1624a02;
                }
            }
            if (c1624a0 != null) {
                C1627b0.b bVar = C1627b0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, c1624a0.d());
                cVarA = a(bVar);
            } else {
                C1627b0.b bVar2 = C1627b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str2 = strA;
            cVar = cVarA;
            strL = str2;
        }
        this.f22401y.add(a(strL, cVar));
        c();
    }

    @Override // com.applovin.impl.C1627b0.a
    public void a(C1627b0.b bVar, String str) {
        if (bVar == C1627b0.b.APP_DETAILS_NOT_FOUND) {
            this.f22382e.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f22382e.O().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f22401y.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb2, String str) {
        String string = sb2.toString();
        if (str.length() + string.length() >= ((Integer) this.f22382e.a(y4.f23890r)).intValue()) {
            com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", string);
            this.f22390n.append(string);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(r2.a().d("View Ad Units (" + this.f22384g.size() + ")").a(this.f22761a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f22385h.isEmpty()) {
            arrayList.add(r2.a().d("Selective Init Ad Units (" + this.f22385h.size() + ")").a(this.f22761a).a(true).a());
        }
        arrayList.add(r2.a().d("Test Mode Enabled").c(String.valueOf(this.f22382e.t0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new z3((e3) it.next(), this.f22761a));
        }
        return arrayList;
    }

    private r2 a(String str) {
        r2.b bVarA = r2.a();
        if (!this.f22382e.t0().c()) {
            bVarA.a(this.f22761a);
        }
        r2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f22382e.t0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private r2 a(boolean z2) {
        return r2.a().d("Java 8").a(z2 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(AbstractC1650m0.a(z2 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f22761a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://support.axon.ai/en/max/android/overview/integration").a(!z2).a();
    }

    private r2 a(String str, c cVar) {
        int i5;
        int iA;
        if (cVar == c.SUCCESS) {
            i5 = R.drawable.applovin_ic_check_mark_bordered;
            iA = AbstractC1650m0.a(R.color.applovin_sdk_checkmarkColor, this.f22761a);
        } else if (cVar == c.WARNING) {
            i5 = R.drawable.applovin_ic_warning;
            iA = AbstractC1650m0.a(R.color.applovin_sdk_warningColor, this.f22761a);
        } else {
            i5 = R.drawable.applovin_ic_x_mark;
            iA = AbstractC1650m0.a(R.color.applovin_sdk_xmarkColor, this.f22761a);
        }
        return r2.a().d("app-ads.txt").a(i5).b(iA).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(C1627b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i5 = a.f22403a[bVar.ordinal()];
        if (i5 == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i5 == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i5 == 3) {
            return AbstractC0279p0.l("Unable to find app-ads.txt file or parse entries of the file at ", str, ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i5 == 4) {
            return R8.v.g("Text file at ", str, " is missing the required AppLovin line:\n\n", str2, "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i5 != 5) {
            return "";
        }
        return AbstractC0279p0.l("Text file at ", str, " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    private c a(C1627b0.b bVar) {
        int i5 = a.f22403a[bVar.ordinal()];
        if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) {
            return c.ERROR;
        }
        if (i5 != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z2) {
            for (u2 u2Var : this.f22397u) {
                if (list.equals(u2Var.b())) {
                    return u2Var.a();
                }
            }
            for (u2 u2Var2 : this.f22398v) {
                if (list.equals(u2Var2.b())) {
                    return u2Var2.a();
                }
            }
        } else {
            for (e3 e3Var : this.f22399w) {
                if (list.equals(e3Var.u())) {
                    return e3Var.g();
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ",");
            }
        }
        return sb2.toString();
    }
}
