package com.bytedance.sdk.openadsdk.moa;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.uef.ivm;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cq {
    private static final int[] yo = {10, 30, 50, 75, 100};

    /* renamed from: ab, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.uef.ivm f25940ab;
    private boolean af;
    private volatile int au;
    private final AtomicBoolean bcc;
    private boolean bs;
    private final AtomicBoolean cop;
    private long cp;
    private String cq;
    private final AtomicBoolean cz;
    private boolean dhk;
    private int dj;
    private int dor;
    private final AtomicBoolean dv;
    private boolean dxx;
    private String dz;
    private volatile long etd;
    private long fz;
    private com.bytedance.sdk.openadsdk.moa.moa.lw gb;
    private final AtomicInteger gem;
    private String gr;
    private int gsd;
    private long gzw;
    private final AtomicBoolean hts;
    private int ivm;
    private WeakReference<WebView> km;
    private long ku;
    private long lw;
    private final boolean lz;
    private int moa;
    private long nkh;

    /* renamed from: oa, reason: collision with root package name */
    AtomicBoolean f25941oa;
    private cz oib;
    private long orq;
    private final int[] oyt;
    private boolean pu;
    private long pz;
    private volatile long rj;
    private volatile long rl;
    private final gzw rt;
    private wrv sk;
    private final AtomicInteger swd;
    private com.bytedance.sdk.openadsdk.orq.bcc sy;
    private int tpx;

    /* renamed from: ue, reason: collision with root package name */
    private long f25942ue;
    public ivm.uef uef;
    private volatile long uqx;
    private String vyg;
    private final Context wk;
    private boolean wrv;
    private boolean wxf;
    private final AtomicBoolean xs;
    private final AtomicBoolean zjm;
    private String zou;

    public static class uef {
        private final int[] uef;

        public uef(int[] iArr) {
            this.uef = iArr;
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int iIntValue;
            try {
                iIntValue = Float.valueOf(str).intValue();
            } catch (Throwable unused) {
            }
            if (iIntValue > 100) {
                iIntValue = 100;
            } else if (iIntValue < 0) {
                iIntValue = 0;
            }
            int[] iArr = this.uef;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            iArr[0] = iIntValue;
        }
    }

    public cq(gzw gzwVar, WebView webView, wrv wrvVar, int i5) {
        this(gzwVar, webView);
        this.sk = wrvVar;
        this.dor = i5;
    }

    private boolean cz() {
        gzw gzwVar;
        return this.af && (gzwVar = this.rt) != null && gzwVar.oyt();
    }

    private int zjm() {
        WeakReference<WebView> weakReference = this.km;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null) {
                    if (webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public void bcc() {
        if (("landingpage".equals(this.gr) || "landingpage_endcard".equals(this.gr) || "landingpage_split_screen".equals(this.gr) || "landingpage_direct".equals(this.gr) || "aggregate_page".equals(this.gr) || "landingpage_split_ceiling".equals(this.gr)) && this.ivm == 2) {
            if (this.pz > 0 || !yo()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.f25942ue, this.pz);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.ivm);
                    jSONObject.put("max_scroll_percent", this.oyt[0]);
                    jSONObject.put("jump_times", this.swd.getAndSet(0));
                    jSONObject.put("click_times", this.gem.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.zjm.set(true);
                uef("stay_page", jSONObject, Math.min(jCurrentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
                com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("landingPause", this.rt, this.vyg);
            }
        }
    }

    public void ivm() {
        if (cz() && this.uqx > 0 && this.rj > 0 && !this.dv.getAndSet(true)) {
            yo.oa(this.rj - this.uqx, this.rt, this.zou, (String) null);
        }
    }

    public void xs() {
        if (this.fz == 0) {
            this.fz = System.currentTimeMillis();
        }
        this.f25942ue = System.currentTimeMillis();
        if ("landingpage".equals(this.gr) || "landingpage_endcard".equals(this.gr) || "landingpage_split_screen".equals(this.gr) || "landingpage_direct".equals(this.gr) || "aggregate_page".equals(this.gr)) {
            if (this.hts.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("landingStart", this.rt, this.vyg);
            } else {
                com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("landingContinue", this.rt, this.vyg);
            }
        }
        if (dhk.bcc(this.rt) || dhk.oa(this.rt)) {
            uef(true, SystemClock.elapsedRealtime());
        }
    }

    public void lw() {
        if (cz()) {
            this.uqx = SystemClock.elapsedRealtime();
            ivm();
        }
    }

    public void moa() {
        if (cz()) {
            this.etd = SystemClock.elapsedRealtime();
            yo.uef(this.rt, this.zou);
        }
    }

    public com.bytedance.sdk.openadsdk.moa.moa.lw oa() {
        return this.gb;
    }

    public boolean yo() {
        return this.af;
    }

    public cq oa(boolean z2) {
        this.pu = z2;
        return this;
    }

    public void yo(boolean z2) {
        this.af = z2;
    }

    public cq(gzw gzwVar, WebView webView) {
        this(gzwVar, webView, false);
    }

    public void oa(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zou = str;
    }

    public gzw uef() {
        return this.rt;
    }

    public void yo(String str) throws JSONException {
        if (!this.pu || this.rt == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i5 = this.dor;
            if (i5 >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i5));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.rt.cc();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        uef("load_start", jSONObject);
    }

    public cq(gzw gzwVar, WebView webView, boolean z2) {
        this.moa = 0;
        this.lw = -1L;
        this.ivm = 1;
        this.xs = new AtomicBoolean(false);
        this.bcc = new AtomicBoolean(false);
        this.cz = new AtomicBoolean(false);
        this.zjm = new AtomicBoolean(false);
        this.dj = -1;
        this.dhk = false;
        this.tpx = 0;
        this.f25941oa = new AtomicBoolean(false);
        this.gr = "landingpage";
        this.f25942ue = 0L;
        this.pz = 0L;
        this.cp = 0L;
        this.ku = 0L;
        this.fz = 0L;
        this.dxx = false;
        this.lz = false;
        int[] iArr = {0};
        this.oyt = iArr;
        this.pu = false;
        this.af = false;
        this.rl = 0L;
        this.swd = new AtomicInteger(0);
        this.gem = new AtomicInteger(0);
        this.cop = new AtomicBoolean(false);
        this.au = 0;
        this.dor = -1;
        this.dv = new AtomicBoolean(false);
        this.hts = new AtomicBoolean(false);
        this.wxf = false;
        Context contextUef = com.bytedance.sdk.openadsdk.core.sy.uef();
        this.wk = contextUef;
        this.rt = gzwVar;
        if (webView == null) {
            return;
        }
        this.dhk = z2;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.km = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (gzwVar != null && gzwVar.meb()) {
            com.bytedance.sdk.openadsdk.core.widget.uef.ivm ivmVar = new com.bytedance.sdk.openadsdk.core.widget.uef.ivm(webView2, gzwVar, contextUef, this.dhk);
            this.f25940ab = ivmVar;
            this.uef = ivmVar.yo();
        }
        if (gzwVar != null && gzwVar.dy() && com.bytedance.sdk.openadsdk.core.settings.dj.oa().gsd()) {
            this.oib = new cz(gzwVar, webView, this.dhk);
        }
        if (webView instanceof com.bytedance.sdk.component.cz.lw) {
            this.nkh = ((com.bytedance.sdk.component.cz.lw) webView2).uef;
        } else {
            this.nkh = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new uef(iArr), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.uef("LandingPageLog", "addJavascriptInterface exception", e7);
        }
        if (gzwVar != null && gzwVar.zec() != null) {
            this.lw = gzwVar.zec().optLong("page_id", -1L);
        }
        this.vyg = String.valueOf(SystemClock.elapsedRealtime());
    }

    private String lw(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void moa(boolean z2) {
        WeakReference<WebView> weakReference = this.km;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.uef("LandingPageLog", "removeJavascriptInterface exception", e7);
            }
        }
        if (this.bcc.compareAndSet(false, true)) {
            uef(z2, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            if (this.pu) {
                yo.uef(this.rt, this.gr, System.currentTimeMillis() - this.fz, this.dor, zjm());
            }
        } else if (this.ivm == 2 && !this.zjm.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.ivm);
                jSONObject.put("max_scroll_percent", this.oyt[0]);
                jSONObject.put("jump_times", this.swd.getAndSet(0));
                jSONObject.put("click_times", this.gem.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            uef("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.gr) || "landingpage_endcard".equals(this.gr) || "landingpage_split_screen".equals(this.gr) || "landingpage_direct".equals(this.gr) || "aggregate_page".equals(this.gr) || "landingpage_split_ceiling".equals(this.gr)) {
            com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("landingFinish", this.rt, this.vyg);
        }
    }

    public void uef(boolean z2) {
        if (z2) {
            this.tpx = 1;
        }
    }

    public void lw(boolean z2) {
        this.wxf = z2;
    }

    public void oa(WebView webView, String str, boolean z2) {
        cz czVar = this.oib;
        if (czVar == null || !z2) {
            return;
        }
        czVar.uef(webView, str);
    }

    public void uef(wrv wrvVar) {
        this.sk = wrvVar;
    }

    public void uef(long j8) {
        this.pz = j8;
    }

    public void oa(int i5) {
        com.bytedance.sdk.openadsdk.core.widget.uef.ivm ivmVar = this.f25940ab;
        if (ivmVar == null || !this.bs) {
            return;
        }
        ivmVar.uef(i5);
    }

    public void uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.uef.ivm ivmVar = this.f25940ab;
        if (ivmVar != null) {
            ivmVar.uef(str);
        }
        cz czVar = this.oib;
        if (czVar != null) {
            czVar.yo(str);
        }
        this.gr = str;
    }

    public void uef(int i5) {
        this.dor = i5;
    }

    public void uef(com.bytedance.sdk.openadsdk.moa.moa.lw lwVar) {
        this.gb = lwVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.orq.bcc bccVar) {
        this.sy = bccVar;
    }

    public void uef(WebView webView, int i5) throws JSONException {
        if (webView == null) {
            return;
        }
        if (this.rl == 0) {
            this.rl = SystemClock.elapsedRealtime();
        }
        if (this.cp == 0 && i5 > 0) {
            this.cp = System.currentTimeMillis();
        } else if (this.ku == 0 && i5 == 100) {
            this.ku = System.currentTimeMillis();
        }
        if (this.moa != yo.length && ("landingpage".equals(this.gr) || "landingpage_endcard".equals(this.gr) || "landingpage_split_screen".equals(this.gr) || "landingpage_direct".equals(this.gr) || "aggregate_page".equals(this.gr))) {
            int i10 = this.moa;
            while (true) {
                int[] iArr = yo;
                if (i10 >= iArr.length || i5 < iArr[this.moa]) {
                    break;
                }
                int i11 = i10 + 1;
                this.moa = i11;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j8 = this.lw;
                    if (j8 != -1) {
                        jSONObject.put("page_id", j8);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i10]);
                } catch (Exception unused) {
                }
                uef("progress_load_finish", jSONObject);
                i10 = i11;
            }
        }
        if (i5 == 100) {
            uef(false, SystemClock.elapsedRealtime());
            uef(webView.getUrl(), "progress", Math.min(this.ku - this.cp, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    public void moa(String str) throws JSONException {
        if (!this.pu || this.rt == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i5 = this.dor;
            if (i5 >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i5));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.rt.cc();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        uef("progress_load_finish", jSONObject);
    }

    private void uef(String str, String str2, long j8) {
        if (this.cz.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i5 = 300;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i5 = iIndexOf;
                    }
                    str = str.substring(0, i5);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            uef("load_finish_progress", jSONObject, j8);
        }
    }

    public void uef(WebView webView, String str, Bitmap bitmap, boolean z2, int i5) throws JSONException {
        this.bs = z2;
        this.gsd++;
        com.bytedance.sdk.openadsdk.core.widget.uef.ivm ivmVar = this.f25940ab;
        if (ivmVar != null && z2) {
            ivmVar.oa(str);
            this.f25940ab.oa();
        }
        cz czVar = this.oib;
        if (czVar != null && z2) {
            czVar.uef(str, i5);
        }
        WeakReference<WebView> weakReference = this.km;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.au) {
                    this.swd.incrementAndGet();
                }
                this.au = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.uef("LandingPageLog", "copyBackForwardList exception", e7);
            }
        }
        if (this.rl == 0) {
            this.rl = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.gb;
        if (lwVar != null) {
            lwVar.moa();
        }
        if (this.xs.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i10 = this.dor;
                if (i10 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i10));
                }
            } catch (Exception unused) {
            }
            uef("load_start", jSONObject);
        }
    }

    public void uef(WebView webView, String str, boolean z2) throws JSONException {
        uef(false, SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.core.widget.uef.ivm ivmVar = this.f25940ab;
        if (ivmVar != null && z2) {
            ivmVar.uef();
        }
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.gb;
        if (lwVar != null) {
            lwVar.lw();
        }
        cz czVar = this.oib;
        if (czVar != null && z2) {
            czVar.uef(str);
        }
        if (webView != null && !this.dxx && this.pu) {
            this.dxx = true;
            com.bytedance.sdk.component.utils.dz.uef(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.bcc.compareAndSet(false, true)) {
            if (this.ivm != 3) {
                this.ivm = 2;
            }
            this.f25942ue = System.currentTimeMillis();
            boolean z10 = this.ivm == 2;
            int iZjm = zjm();
            if (z10) {
                long j8 = this.ku - this.cp;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.dj);
                    jSONObject.put("error_msg", this.cq);
                    jSONObject.put("error_url", this.dz);
                    int i5 = this.dor;
                    if (i5 >= 0) {
                        jSONObject.put("preload_status", i5);
                    }
                    jSONObject.put("first_page", iZjm);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.rt.cc());
                    jSONObject.put("preload_h5_type", this.rt.gb());
                } catch (Exception unused) {
                }
                uef(z2, "0");
                long jMin = Math.min(j8, TTAdConstant.AD_MAX_EVENT_TIME);
                uef("load_finish", jSONObject, jMin);
                if (cz()) {
                    this.rj = SystemClock.elapsedRealtime();
                    ivm();
                    yo.uef(this.rt, this.zou, this.rj - this.etd);
                }
                uef(str, "load_finish", jMin);
                wrv wrvVar = this.sk;
                if (wrvVar != null) {
                    wrvVar.uef(iZjm);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.dj);
                jSONObject2.put("error_msg", this.cq);
                jSONObject2.put("error_url", this.dz);
                jSONObject2.put("first_page", iZjm);
                int i10 = this.dor;
                if (i10 >= 0) {
                    jSONObject2.put("preload_status", i10);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.rt.cc());
                jSONObject2.put("preload_h5_type", this.rt.gb());
            } catch (Exception unused2) {
            }
            uef(z2, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
            uef("load_fail", jSONObject2);
            if (cz()) {
                yo.uef(this.rt, this.zou, SystemClock.elapsedRealtime() - this.etd, this.dj, this.cq, this.dz);
            }
            if (this.wrv) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                uef("load_fail_main", jSONObject2);
            }
        }
    }

    public void uef(WebView webView, int i5, String str, String str2, String str3, boolean z2) {
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.gb;
        if (lwVar != null) {
            lwVar.uef((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.ivm != 2) {
            this.ivm = 3;
        }
        this.dj = i5;
        this.cq = str;
        this.dz = str2;
        this.wrv = z2;
    }

    public void uef(com.bytedance.sdk.component.cz.ivm ivmVar) {
        int iOt;
        Bitmap bitmapUef;
        gzw gzwVar;
        if ((!"landingpage".equals(this.gr) && !"landingpage_endcard".equals(this.gr) && !"landingpage_split_screen".equals(this.gr) && !"landingpage_direct".equals(this.gr) && !"aggregate_page".equals(this.gr)) || (iOt = com.bytedance.sdk.openadsdk.core.sy.moa().ot()) == 0 || new Random().nextInt(100) + 1 > iOt || ivmVar == null || ivmVar.getWebView() == null || ivmVar.getVisibility() != 0 || (bitmapUef = af.uef(ivmVar)) == null || (gzwVar = this.rt) == null) {
            return;
        }
        af.uef(gzwVar, this.gr, "landing_page_blank", bitmapUef, ivmVar.getUrl(), this.lw);
    }

    private void uef(String str, JSONObject jSONObject) {
        uef(str, jSONObject, -1L);
    }

    private void uef(final String str, final JSONObject jSONObject, final long j8) {
        if (!this.pu || this.rt == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.orq.bcc bccVar = this.sy;
        final int iPu = bccVar != null ? bccVar.pu() : -1;
        yo.uef(System.currentTimeMillis(), this.rt, this.gr, str, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.cq.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j10 = j8;
                    if (j10 > 0) {
                        jSONObject2.put("duration", j10);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if ("load_start".equals(str) || "load_finish".equals(str) || "progress_load_finish".equals(str)) {
                        jSONObject2.put("is_reused", cq.this.wxf ? 1 : 0);
                    }
                    if (com.bytedance.sdk.openadsdk.dz.uef.yo(cq.this.rt)) {
                        jSONObject2.put("is_lp_pre_render", cq.this.tpx);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() throws JSONException {
                if (jSONObject != null) {
                    try {
                        boolean zOa = cp.oa(cq.this.rt);
                        int i5 = 0;
                        jSONObject.put("is_playable", zOa ? 1 : 0);
                        jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(cq.this.rt) ? 1 : 0);
                        if (zOa && ("load_finish".equals(str) || "load_fail".equals(str))) {
                            jSONObject.put("playable_has_show", iPu);
                        }
                        if ("stay_page".equals(str)) {
                            JSONObject jSONObject2 = jSONObject;
                            if (cq.this.gsd <= 1) {
                                i5 = 1;
                            }
                            jSONObject2.put("first_page", i5);
                        }
                    } catch (JSONException unused) {
                    }
                }
                String unused2 = cq.this.gr;
                return jSONObject;
            }
        });
    }

    public void uef(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.uef.ivm ivmVar = this.f25940ab;
        if (ivmVar != null && this.bs) {
            ivmVar.uef(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.rl != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.gem.incrementAndGet();
                this.gem.get();
                if (this.cop.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.rt.cc());
                } catch (JSONException unused) {
                }
                uef("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.rl, 0L));
            }
        }
    }

    public void uef(String str, boolean z2) {
        com.bytedance.sdk.openadsdk.core.widget.uef.ivm ivmVar = this.f25940ab;
        if (ivmVar != null && z2) {
            ivmVar.yo(str);
        }
        cz czVar = this.oib;
        if (czVar == null || !z2) {
            return;
        }
        czVar.oa(str);
    }

    private void uef(boolean z2, final String str) {
        if (z2) {
            final int iZjm = zjm();
            yo.uef(new com.bytedance.sdk.component.bcc.oa.yo("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.moa.cq.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.ivm ivmVarLz = com.bytedance.sdk.openadsdk.core.sy.moa().lz();
                        boolean zUef = cq.this.uef(ivmVarLz, str);
                        if (zUef) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.ivm.f25745oa)) {
                                cq.this.uef(iZjm, str);
                                return;
                            }
                            if (TextUtils.isEmpty(ivmVarLz.yo) || !zUef) {
                                return;
                            }
                            String str2 = ivmVarLz.yo;
                            com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
                            oaVarYo.yo(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            oaVarYo.moa(map);
                            oaVarYo.uef(9);
                            oaVarYo.oa("sendPrefLog");
                            oaVarYo.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.moa.cq.2.1
                                @Override // com.bytedance.sdk.component.xs.uef.uef
                                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.xs.uef.uef
                                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.ivm.f25745oa = oaVar.moa();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        cq.this.uef(iZjm, str);
                                    } catch (Exception e7) {
                                        com.bytedance.sdk.component.utils.dhk.uef("LandingPageLog", "TTWebViewClient : onPageFinished", e7);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.dhk.yo(th.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.ivm.f25745oa)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.ivm.f25745oa);
            jSONObject.putOpt("cid", uef().iou());
            jSONObject.putOpt("ad_id", uef().iou());
            jSONObject.put("log_extra", uef().em());
            gb.uef(sb2, "\"/** adInfo **/\"", jSONObject.toString());
            gb.uef(sb2, "\"/** first_page **/\"", String.valueOf(i5));
            gb.uef(sb2, "\"/** ix_to_externalurl **/\"", this.lw != -1 ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
            gb.uef(sb2, "\"/** preload_status **/\"", this.dor == 2 ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : "0");
            gb.uef(sb2, "\"/** scene_state **/\"", str);
            gb.uef(sb2, "\"/** web_init_time **/\"", String.valueOf(this.nkh));
            gb.uef(sb2, "\"/** channel_name **/\"", "\"" + uef().vup() + "\"");
            gb.uef(sb2, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            gb.uef(sb2, "\"/** web_url **/\"", "\"" + uef().cc() + "\"");
            String string = sb2.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strLw = lw(string);
            WeakReference<WebView> weakReference = this.km;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strLw) || webView == null) {
                return;
            }
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.cq.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.dz.uef(webView, strLw);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo(th.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(com.bytedance.sdk.openadsdk.core.settings.ivm ivmVar, String str) {
        str.getClass();
        switch (str) {
            case "0":
                return ivmVar.moa;
            case "1":
                return ivmVar.lw;
            case "2":
                return ivmVar.ivm;
            default:
                return false;
        }
    }

    public void uef(boolean z2, long j8) {
        if (z2) {
            this.orq = j8;
        } else {
            this.gzw = j8;
        }
        if (this.orq <= 0 || this.gzw <= 0 || !this.bs || !this.f25941oa.compareAndSet(false, true)) {
            return;
        }
        uef(this.rt, this.gr, this.gzw - this.orq, this.tpx, this.wxf);
    }

    public static void uef(final gzw gzwVar, final String str, final long j8, final int i5, final boolean z2) {
        yo.uef(System.currentTimeMillis(), gzwVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.cq.4
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j8);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i5);
                    jSONObject.put("meta_pre_render", gzwVar.kkq() ? 1 : 0);
                    com.bytedance.sdk.openadsdk.core.model.oib oibVarGr = gzwVar.gr();
                    if (oibVarGr == null) {
                        oibVarGr = new com.bytedance.sdk.openadsdk.core.model.oib();
                    }
                    jSONObject.put("pre_render_status", oibVarGr.yo());
                    jSONObject.put("pre_render_use_gecko", oibVarGr.oa());
                    jSONObject.put("pre_render_add_type", oibVarGr.uef());
                    jSONObject.put("is_reused", z2 ? 1 : 0);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public void uef(String str, long j8) throws JSONException {
        if (!this.pu || this.rt == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", this.dj);
            jSONObject.put("error_msg", this.cq);
            jSONObject.put("error_url", this.dz);
            int i5 = this.dor;
            if (i5 >= 0) {
                jSONObject.put("preload_status", i5);
            }
            jSONObject.put("first_page", zjm());
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            if (TextUtils.isEmpty(str)) {
                str = this.rt.cc();
            }
            jSONObject.put("url", str);
            jSONObject.put("preload_h5_type", this.rt.gb());
        } catch (Exception unused) {
        }
        uef("load_finish", jSONObject, Math.min(j8, TTAdConstant.AD_MAX_EVENT_TIME));
    }
}
