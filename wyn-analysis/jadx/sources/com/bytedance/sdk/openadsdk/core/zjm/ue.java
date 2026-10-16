package com.bytedance.sdk.openadsdk.core.zjm;

import Va.M6;
import android.R;
import android.content.Context;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ue extends com.bytedance.sdk.component.adexpress.lw.uef {

    /* renamed from: ab, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.wk.moa.oa f25871ab;
    private com.bytedance.sdk.openadsdk.moa.cq bcc;
    com.bytedance.sdk.openadsdk.utils.uef bs;
    protected com.bytedance.sdk.openadsdk.moa.moa.lw cq;
    protected Context cz;
    private gzw.uef dhk;
    protected com.bytedance.sdk.openadsdk.core.model.gzw dj;
    protected oyt dz;
    private final Runnable gzw;
    private com.bytedance.sdk.component.adexpress.oa.xs oib;
    private final com.bytedance.sdk.component.bcc.oa.yo orq;
    private final Map<String, com.bytedance.sdk.openadsdk.tpx.uef.uef.yo> sy;
    private volatile int tpx;
    protected dj wk;
    protected JSONObject wrv;
    private String xs;
    protected String zjm;

    public ue(Context context, com.bytedance.sdk.component.adexpress.oa.cq cqVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.moa.moa.lw lwVar, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        super(context, cqVar, themeStatusBroadcastReceiver);
        this.sy = M6.v();
        this.tpx = 0;
        this.orq = new com.bytedance.sdk.component.bcc.oa.yo("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.zjm.ue.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.lw.uef) ue.this).ivm.get()) {
                    return;
                }
                ue ueVar = ue.this;
                ueVar.wrv = ueVar.cq().yo();
                ue ueVar2 = ue.this;
                ueVar2.uef(ueVar2.wrv);
                if (ue.this.tpx == 0) {
                    ue.this.bs();
                }
                com.bytedance.sdk.openadsdk.core.wk.yo().post(ue.this.gzw);
            }
        };
        this.gzw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.ue.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.lw.uef) ue.this).ivm.get() || ue.this.oib == null) {
                    return;
                }
                ue.this.wk();
                ue ueVar = ue.this;
                ue.super.uef(ueVar.oib);
            }
        };
        if (this.moa == null) {
            return;
        }
        this.cz = context;
        this.zjm = cqVar.moa();
        this.dj = gzwVar;
        this.cq = lwVar;
        themeStatusBroadcastReceiver.uef(this);
        bs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        if (this.moa.getWebView() == null || !km.ivm()) {
            this.tpx = 1;
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.ue.3
                @Override // java.lang.Runnable
                public void run() {
                    ue.this.sy();
                }
            });
        } else {
            sy();
        }
        if (!wk.oa(this.dj) || this.f24923oa) {
            return;
        }
        wk.uef(this.dj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sy() {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.moa;
        if (ivmVar == null || ivmVar.getWebView() == null || this.tpx == 2) {
            return;
        }
        this.xs = uef(this.dj);
        Log.d("TTAD.WebViewRender", "initWebViewRender: url = " + this.xs);
        this.moa.setDisplayZoomControls(false);
        uef(com.bytedance.sdk.openadsdk.utils.oyt.uef(this.xs));
        oib();
        oyt oytVar = new oyt(this.cz);
        this.dz = oytVar;
        oytVar.moa(true);
        dz();
        this.tpx = 2;
    }

    public void ab() {
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public void cz() {
        oyt oytVar = this.dz;
        if (oytVar == null) {
            return;
        }
        oytVar.uef("expressWebviewRecycle", (JSONObject) null);
    }

    public dj dhk() {
        return this.wk;
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public void dj() {
        super.dj();
        com.bytedance.sdk.openadsdk.utils.uef uefVarLw = com.bytedance.sdk.openadsdk.core.ab.uef().lw();
        this.bs = uefVarLw;
        uefVarLw.uef(this);
    }

    public void dz() {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.moa;
        if (ivmVar == null || ivmVar.getWebView() == null) {
            return;
        }
        this.moa.setBackgroundColor(0);
        this.moa.setBackgroundResource(R.color.transparent);
        uef(this.moa);
        if (moa() != null) {
            this.bcc = new com.bytedance.sdk.openadsdk.moa.cq(this.dj, moa().getWebView()).oa(false);
        }
        this.bcc.uef(this.cq);
        dj djVar = new dj(this.cz, this.dz, this.dj, this.bcc, cq());
        this.wk = djVar;
        this.moa.setWebViewClient(djVar);
        this.moa.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.uef.moa(this.dz, this.bcc));
        com.bytedance.sdk.component.adexpress.lw.lw.uef().uef(this.moa, this.dz);
    }

    public void oib() {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.dj;
        if (gzwVar == null || gzwVar.vep() == null) {
            return;
        }
        this.dhk = this.dj.vep();
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.uef
    public void onThemeChanged(int i5) throws JSONException {
        if (this.dz == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i5);
        } catch (JSONException unused) {
        }
        this.dz.uef("themeChange", jSONObject);
    }

    public oyt tpx() {
        return this.dz;
    }

    public void wk() {
        oyt oytVar;
        com.bytedance.sdk.component.cz.ivm ivmVar = this.moa;
        if (ivmVar == null || ivmVar.getWebView() == null || (oytVar = this.dz) == null) {
            return;
        }
        oytVar.oa(this.moa).uef(this.dj).yo(this.dj.iou()).moa(this.dj.em()).oa(gb.uef(this.zjm)).lw(this.dj.kid()).uef(this).uef(this.wrv).uef(this.moa).uef(this.cq);
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public void wrv() {
        super.wrv();
        com.bytedance.sdk.openadsdk.utils.uef uefVar = this.bs;
        if (uefVar != null) {
            uefVar.oa(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public void zjm() throws JSONException {
        super.zjm();
        if (this.dz == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.dz.uef("expressShow", jSONObject);
            this.dz.oa(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public void bcc() {
        if (moa() == null) {
            return;
        }
        try {
            moa().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public com.bytedance.sdk.component.cz.ivm moa() {
        return this.moa;
    }

    public void oa(int i5) {
        if (this.dz == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i5);
            this.dz.uef("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.WebViewRender", e7.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public void xs() {
        if (this.ivm.get()) {
            return;
        }
        super.xs();
        oyt oytVar = this.dz;
        if (oytVar != null) {
            oytVar.yo();
            this.dz.wrv();
            this.dz = null;
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.bcc;
        if (cqVar != null) {
            cqVar.moa(false);
        }
        com.bytedance.sdk.openadsdk.core.wk.yo().removeCallbacks(this.gzw);
        this.sy.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef, com.bytedance.sdk.component.adexpress.oa.moa
    public int yo() {
        return this.dj.ix();
    }

    public static String uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        return com.bytedance.sdk.component.adexpress.uef.oa.oa.moa((gzwVar == null || !gzwVar.uu()) ? null : "v3");
    }

    private void yo(boolean z2) throws JSONException {
        if (this.dz == null || this.moa == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z2);
            this.dz.uef("expressAdShow", jSONObject);
            this.dz.uef(z2);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef, com.bytedance.sdk.component.adexpress.oa.moa
    public void uef(com.bytedance.sdk.component.adexpress.oa.xs xsVar) {
        this.oib = xsVar;
        km.yo((Runnable) this.orq);
    }

    public static boolean oa(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    private void uef(com.bytedance.sdk.component.cz.ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(this.cz).uef(false).uef(ivmVar.getWebView());
            ivmVar.setVerticalScrollBarEnabled(false);
            ivmVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(ivmVar);
            ivmVar.dz();
            ivmVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.dhk.uef(ivmVar.getWebView(), BuildConfig.VERSION_CODE));
            ivmVar.setMixedContentMode(0);
            ivmVar.setJavaScriptEnabled(true);
            ivmVar.setJavaScriptCanOpenWindowsAutomatically(true);
            ivmVar.setDomStorageEnabled(true);
            ivmVar.setDatabaseEnabled(true);
            ivmVar.setAllowFileAccess(false);
            ivmVar.setSupportZoom(true);
            ivmVar.setBuiltInZoomControls(true);
            ivmVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            ivmVar.setUseWideViewPort(true);
            ivmVar.setCacheMode(-1);
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.WebViewRender", e7.toString());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef
    public void uef(int i5) {
        if (i5 == this.lw) {
            return;
        }
        this.lw = i5;
        yo(i5 == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.lw.uef, com.bytedance.sdk.component.adexpress.oa.dj
    public void uef(com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        super.uef(dzVar);
        if (this.yo) {
            com.bytedance.sdk.component.utils.cz.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.ue.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.lw.uef) ue.this).moa.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        this.f25871ab = oaVar;
        oyt oytVar = this.dz;
        if (oytVar != null) {
            oytVar.uef(oaVar);
        }
    }
}
