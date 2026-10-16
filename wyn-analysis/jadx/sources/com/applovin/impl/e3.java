package com.applovin.impl;

import android.text.TextUtils;
import cb.AbstractC1593a;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e3 implements Comparable, AppLovinCommunicatorSubscriber {

    /* renamed from: A, reason: collision with root package name */
    private final List f21424A;

    /* renamed from: B, reason: collision with root package name */
    private final List f21425B;

    /* renamed from: C, reason: collision with root package name */
    private final List f21426C;

    /* renamed from: D, reason: collision with root package name */
    private final List f21427D;

    /* renamed from: E, reason: collision with root package name */
    private final Map f21428E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f21429F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f21430G;

    /* renamed from: H, reason: collision with root package name */
    private final b7 f21431H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f21432I;

    /* renamed from: J, reason: collision with root package name */
    private final String f21433J;

    /* renamed from: K, reason: collision with root package name */
    private final Map f21434K;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21435a;

    /* renamed from: b, reason: collision with root package name */
    private final a f21436b;

    /* renamed from: c, reason: collision with root package name */
    private int f21437c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21438d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21439e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21440f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21441g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21442h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21443i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f21444j;
    private final boolean k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f21445l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f21446m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f21447n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f21448o;

    /* renamed from: p, reason: collision with root package name */
    private final String f21449p;

    /* renamed from: q, reason: collision with root package name */
    private final String f21450q;

    /* renamed from: r, reason: collision with root package name */
    private String f21451r;

    /* renamed from: s, reason: collision with root package name */
    private String f21452s;

    /* renamed from: t, reason: collision with root package name */
    private final String f21453t;

    /* renamed from: u, reason: collision with root package name */
    private final String f21454u;

    /* renamed from: v, reason: collision with root package name */
    private final String f21455v;

    /* renamed from: w, reason: collision with root package name */
    private final String f21456w;

    /* renamed from: x, reason: collision with root package name */
    private final int f21457x;

    /* renamed from: y, reason: collision with root package name */
    private final List f21458y;

    /* renamed from: z, reason: collision with root package name */
    private final List f21459z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: a, reason: collision with root package name */
        private final String f21465a;

        a(String str) {
            this.f21465a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f21465a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* renamed from: a, reason: collision with root package name */
        private final String f21472a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21473b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21474c;

        b(String str, int i5, String str2) {
            this.f21472a = str;
            this.f21473b = i5;
            this.f21474c = str2;
        }

        public String b() {
            return this.f21474c;
        }

        public String c() {
            return this.f21472a;
        }

        public int d() {
            return this.f21473b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:26|96|27|92|28|98|29|(2:31|(4:33|(1:39)(1:36)|94|40)(0))(1:44)|(3:102|45|46)|100|54) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x020e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x020f, code lost:
    
        r23.O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0216, code lost:
    
        if (com.applovin.impl.sdk.o.a() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0218, code lost:
    
        r23.O().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0221, code lost:
    
        r0 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c9  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e3(org.json.JSONObject r22, com.applovin.impl.sdk.k r23) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e3.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    private a a() {
        a aVar = this.f21438d ? this.f21439e ? a.COMPLETE : this.f21441g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.f21439e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f21459z.iterator();
        while (it.hasNext()) {
            if (!((p4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.f21424A.iterator();
        while (it2.hasNext()) {
            if (!((k1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f21448o || com.applovin.impl.sdk.k.G0()) ? F() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f21439e;
    }

    public boolean B() {
        return this.f21440f;
    }

    public boolean C() {
        return this.f21442h;
    }

    public boolean D() {
        return this.f21432I;
    }

    public boolean E() {
        return this.f21448o;
    }

    public boolean F() {
        if (!this.f21447n || !StringUtils.isValidString(this.f21452s)) {
            return false;
        }
        return !o7.d(this.f21452s).equals(o7.a(this.f21453t, this.f21452s.split("\\.").length));
    }

    public boolean G() {
        return this.f21438d;
    }

    public boolean H() {
        return this.f21436b == a.MISSING && this.k;
    }

    public boolean I() {
        return this.f21430G;
    }

    public boolean J() {
        return this.f21445l;
    }

    public boolean K() {
        return this.f21446m;
    }

    public String b() {
        return this.f21451r;
    }

    public String c() {
        return this.f21453t;
    }

    public Map d() {
        return this.f21434K;
    }

    public String e() {
        return this.f21433J;
    }

    public List f() {
        return this.f21424A;
    }

    public String g() {
        return this.f21450q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f21457x;
    }

    public int i() {
        return this.f21437c;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder("\n---------- ");
        sb2.append(this.f21449p);
        sb2.append(" ----------\nStatus  - ");
        sb2.append(this.f21436b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f21438d || TextUtils.isEmpty(this.f21452s)) ? "UNAVAILABLE" : this.f21452s);
        sb2.append("\nAdapter - ");
        if (this.f21439e && !TextUtils.isEmpty(this.f21453t)) {
            str = this.f21453t;
        }
        sb2.append(str);
        for (p4 p4Var : n()) {
            if (!p4Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(p4Var.b());
                sb2.append(": ");
                sb2.append(p4Var.a());
            }
        }
        for (k1 k1Var : f()) {
            if (!k1Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(k1Var.b());
                sb2.append(": ");
                sb2.append(k1Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.f21454u;
    }

    public List l() {
        return this.f21426C;
    }

    public String m() {
        return this.f21449p;
    }

    public List n() {
        return this.f21459z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f21435a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f21451r.equals(string)) {
            this.f21437c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = w3.a(string, this.f21435a);
            if (maxAdapterA != null) {
                String strA = w3.a(maxAdapterA);
                if (this.f21452s.equals(strA)) {
                    return;
                }
                this.f21452s = strA;
                this.f21435a.t().a(this.f21452s, string);
            }
        }
    }

    public String p() {
        return this.f21452s;
    }

    public a q() {
        return this.f21436b;
    }

    public List r() {
        return this.f21458y;
    }

    public List s() {
        return this.f21425B;
    }

    public b7 t() {
        return this.f21431H;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediatedNetwork{name=");
        sb2.append(this.f21449p);
        sb2.append(", displayName=");
        sb2.append(this.f21450q);
        sb2.append(", sdkAvailable=");
        sb2.append(this.f21438d);
        sb2.append(", sdkVersion=");
        sb2.append(this.f21452s);
        sb2.append(", adapterAvailable=");
        sb2.append(this.f21439e);
        sb2.append(", adapterVersion=");
        return wg.b.c(sb2, this.f21453t, "}");
    }

    public List u() {
        return this.f21427D;
    }

    public String v() {
        return this.f21455v;
    }

    public String w() {
        return this.f21456w;
    }

    public Map x() {
        return this.f21428E;
    }

    public b y() {
        if (!this.f21443i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f21436b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && G() && A())) ? !this.f21435a.t0().c() ? b.DISABLED : (this.f21444j && (this.f21437c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f21437c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.f21429F;
    }

    private List a(MaxAdapter maxAdapter, boolean z2) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z2) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f21451r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            p4 p4Var = new p4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.o());
            if (p4Var.c()) {
                arrayList.add(p4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new p4(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayM = AbstractC1593a.m("dependencies", jSONObject);
        JSONArray jSONArrayM2 = AbstractC1593a.m("dependencies_v2", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayM2.length() + jSONArrayM.length());
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new k1(jSONObject2, kVar));
            }
        }
        for (int i10 = 0; i10 < jSONArrayM2.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayM2, i10, (JSONObject) null);
            if (jSONObject3 != null && k1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new k1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e3 e3Var) {
        return this.f21450q.compareToIgnoreCase(e3Var.f21450q);
    }
}
