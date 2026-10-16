package com.bytedance.sdk.openadsdk.orq.uef;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.uef.wk;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.cz;
import com.bytedance.sdk.openadsdk.core.widget.uef.lw;
import com.bytedance.sdk.openadsdk.core.widget.zjm;
import com.bytedance.sdk.openadsdk.cq.xs;
import com.bytedance.sdk.openadsdk.moa.oib;
import com.bytedance.sdk.openadsdk.orq.bcc;
import com.bytedance.sdk.openadsdk.orq.xs;
import com.bytedance.sdk.openadsdk.utils.dhk;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: ab, reason: collision with root package name */
    private AtomicBoolean f26080ab;
    private String bcc;
    private AtomicBoolean bs;
    private volatile boolean cq;
    private final String cz;
    private oa dhk;
    private xs dj;
    private volatile boolean dz;
    private InterfaceC0133uef gr;
    private long gsd;
    private int gzw;
    private zjm ivm;
    private final FrameLayout lw;
    private final int moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Context f26081oa;
    private com.bytedance.sdk.openadsdk.core.yo.uef oib;
    private int orq;
    private StringBuilder rt;
    private cz sy;
    private boolean tpx;
    protected ivm uef;
    private int wk;
    private boolean wrv;
    private oyt xs;
    private final gzw yo;
    private bcc zjm;

    public interface oa {
        void uef();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.orq.uef.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0133uef {
        void uef(int i5);
    }

    public uef(Context context, gzw gzwVar, int i5, boolean z2, FrameLayout frameLayout) {
        this(context, gzwVar, i5, z2, frameLayout, false);
    }

    public uef(Context context, gzw gzwVar, int i5, boolean z2, FrameLayout frameLayout, boolean z10) {
        this(context, gzwVar, i5, z2, frameLayout, z10, 0);
    }

    private void bcc() {
        this.uef.setWebViewClient(new lw(sy.uef(), this.xs, this.yo.iou(), null, true) { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) throws JSONException {
                super.onPageFinished(webView, str);
                if (uef.this.zjm != null) {
                    uef.this.zjm.cz(str);
                }
                if (uef.this.wrv) {
                    uef.this.uef(0, 0);
                    com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), uef.this.yo, uef.this.bcc, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i5, String str, String str2) {
                super.onReceivedError(webView, i5, str, str2);
                uef.this.wrv = false;
                if (uef.this.zjm != null) {
                    uef.this.zjm.ivm(com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(uef.this.yo));
                    uef.this.zjm.uef(i5, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    uef.this.wrv = false;
                    if (uef.this.zjm != null) {
                        uef.this.zjm.ivm(com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(uef.this.yo));
                        uef.this.zjm.uef(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (uef.this.yo.nj() != null && !TextUtils.isEmpty(uef.this.yo.nj().cq())) {
                        if (uef.this.zjm != null) {
                            uef.this.zjm.zjm(str);
                        }
                        String strWrv = cp.wrv(uef.this.yo);
                        WebResourceResponse webResourceResponseUef = com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(uef.this.yo.nj().cq(), strWrv, str);
                        if (webResourceResponseUef == null) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        if (uef.this.zjm != null) {
                            uef.this.zjm.dj(str);
                        }
                        return webResourceResponseUef;
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    uef.this.wrv = false;
                    if (uef.this.zjm == null || webResourceError == null) {
                        return;
                    }
                    uef.this.zjm.ivm(com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(uef.this.yo));
                    uef.this.zjm.uef(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.uef.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.uef.moa(this.xs) { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.moa, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.moa, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i5) {
                super.onProgressChanged(webView, i5);
                if (uef.this.ivm == null || uef.this.ivm.getVisibility() != 0) {
                    return;
                }
                uef.this.ivm.setProgress(i5);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(this.f26081oa).uef(false).oa(false).uef(this.uef.getWebView());
        ivm ivmVar = this.uef;
        ivmVar.setUserAgentString(dhk.uef(ivmVar.getWebView(), BuildConfig.VERSION_CODE));
        this.uef.setMixedContentMode(0);
    }

    private void yo(boolean z2) {
        wk wkVarOa;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.yo.iou());
            jSONObject.put("log_extra", this.yo.em());
        } catch (Throwable unused) {
        }
        if (com.bytedance.sdk.openadsdk.core.zjm.oa().wk()) {
            com.bytedance.sdk.openadsdk.orq.xs.uef(new xs.uef() { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.1
            });
        }
        bcc bccVarUef = bcc.uef(sy.uef(), this.uef.getWebView(), new com.bytedance.sdk.openadsdk.orq.yo() { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.2
            @Override // com.bytedance.sdk.openadsdk.orq.yo
            public void uef(String str, JSONObject jSONObject2) {
                if (uef.this.xs != null) {
                    uef.this.xs.uef(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.orq.uef() { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.3
            @Override // com.bytedance.sdk.openadsdk.orq.uef
            public void oa() {
                uef.this.xs.yo(true);
                if (uef.this.dj != null) {
                    uef.this.dj.uef();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.orq.uef
            public com.bytedance.sdk.openadsdk.orq.moa uef() {
                String strBcc = com.bytedance.sdk.openadsdk.common.yo.bcc();
                strBcc.getClass();
                switch (strBcc) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.orq.moa.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.orq.moa.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.orq.moa.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.orq.moa.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.orq.moa.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.orq.moa.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.orq.uef
            public void yo() {
                if (uef.this.xs.dz() != null) {
                    uef.this.xs.dz().uef(true);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.orq.uef
            public void uef(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), uef.this.yo, uef.this.bcc, "playable_track", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.3.1
                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject uef() throws JSONException {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (!uef.this.yo.nuo()) {
                                return jSONObject3;
                            }
                            jSONObject3.put("is_pre_render", 1);
                            return jSONObject3;
                        } catch (JSONException e7) {
                            com.bytedance.sdk.component.utils.dhk.yo("PlayableManager", e7.getMessage());
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject yo() {
                        return jSONObject2;
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.orq.uef
            public void uef(int i5, String str) throws JSONException {
                uef.this.wrv = false;
                if (i5 == 2 || i5 == 3 || i5 == 4) {
                    uef.this.uef(2, i5);
                } else if (i5 == 5) {
                    uef.this.uef(3, i5);
                } else {
                    uef.this.uef(1, 0);
                }
            }
        });
        this.zjm = bccVarUef;
        bccVarUef.xs(this.cz).lw(com.bytedance.sdk.openadsdk.common.yo.uef(sy.uef())).oa(com.bytedance.sdk.openadsdk.common.yo.xs()).uef(com.bytedance.sdk.openadsdk.common.yo.uef()).moa(com.bytedance.sdk.openadsdk.common.yo.ivm()).yo(jSONObject).yo(cp.zjm(this.yo)).moa(true).uef(z2).yo(false).uef(cp.bs(this.yo)).oa(cp.bs(this.yo)).uef("sdkEdition", com.bytedance.sdk.openadsdk.common.yo.yo()).lw(cp.ivm(this.yo)).ivm(this.bcc);
        this.zjm.uef(com.bytedance.sdk.openadsdk.orq.lw.oa(this.f26081oa));
        Set<String> setDj = this.zjm.dj();
        final WeakReference weakReference = new WeakReference(this.zjm);
        for (String str : setDj) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (wkVarOa = this.xs.oa()) != null) {
                wkVarOa.uef(str, new com.bytedance.sdk.component.uef.moa<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.4
                    @Override // com.bytedance.sdk.component.uef.moa
                    public JSONObject uef(String str2, JSONObject jSONObject2, com.bytedance.sdk.component.uef.lw lwVar) {
                        try {
                            bcc bccVar = (bcc) weakReference.get();
                            if (bccVar == null) {
                                return null;
                            }
                            return bccVar.moa(uef(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    public boolean ivm() {
        oyt oytVar = this.xs;
        if (oytVar != null) {
            return oytVar.ivm();
        }
        return false;
    }

    public boolean lw() {
        return this.cq;
    }

    public void moa() {
        bcc bccVar = this.zjm;
        if (bccVar != null) {
            bccVar.km();
        }
        ivm ivmVar = this.uef;
        if (ivmVar != null) {
            ivmVar.ab();
        }
        oyt oytVar = this.xs;
        if (oytVar != null) {
            oytVar.wrv();
        }
        this.gsd = System.currentTimeMillis();
        this.rt = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb2 = this.rt;
                sb2.append(stackTraceElement);
                sb2.append("\n");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef("PlayableManager", "onDestroy() error", th);
        }
        this.uef = null;
    }

    public void oa() throws JSONException {
        bcc bccVar;
        if (!this.f26080ab.get() || (bccVar = this.zjm) == null) {
            return;
        }
        bccVar.yo(true);
    }

    public oyt xs() {
        return this.xs;
    }

    public uef(Context context, gzw gzwVar, int i5, boolean z2, FrameLayout frameLayout, boolean z10, int i10) throws JSONException {
        this.wrv = true;
        this.f26080ab = new AtomicBoolean(false);
        this.bs = new AtomicBoolean(false);
        this.gzw = 0;
        this.gsd = 0L;
        this.f26081oa = context;
        this.yo = gzwVar;
        this.orq = i10;
        if (gzwVar != null && gzwVar.moa() != null && gzwVar.moa().lw() != null) {
            this.gzw = gzwVar.moa().lw().size();
        }
        this.moa = i5;
        String strYo = gb.yo(gzwVar.cl().getDurationSlotType());
        this.bcc = strYo;
        int iUef = gb.uef(strYo);
        this.tpx = z10;
        if (z10) {
            this.bcc = gb.oa(iUef);
        }
        this.cz = cp.wrv(gzwVar);
        this.lw = frameLayout;
        uef(frameLayout);
        uef(iUef);
        yo(z2);
        bcc();
    }

    public void uef(InterfaceC0133uef interfaceC0133uef) {
        this.gr = interfaceC0133uef;
    }

    private void uef(FrameLayout frameLayout) {
        ivm ivmVar = new ivm(this.f26081oa, true, ivm.yo.PLAYABLE);
        this.uef = ivmVar;
        ivmVar.lw();
        this.uef.setLayerType(2, null);
        this.uef.setVisibility(4);
        this.uef.setBackgroundColor(-16777216);
        this.uef.setEnabled(true);
        this.uef.setTag(this.bcc);
        this.uef.setMaterialMeta(this.yo.cuu());
        this.uef.setLandingPage(true);
        frameLayout.addView(this.uef, new FrameLayout.LayoutParams(-1, -1));
        cz czVar = new cz(this.f26081oa);
        this.sy = czVar;
        czVar.uef(this.yo, this.bcc, this.oib, this.tpx);
        frameLayout.addView(this.sy, new FrameLayout.LayoutParams(-1, -1));
        if (this.yo.hve()) {
            zjm zjmVar = new zjm(this.f26081oa);
            this.ivm = zjmVar;
            zjmVar.oa();
            frameLayout.addView(this.ivm, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void oa(boolean z2) {
        bcc bccVar = this.zjm;
        if (bccVar != null) {
            bccVar.lw(z2);
        }
    }

    private void uef(int i5) throws JSONException {
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.xs = new oyt(this.f26081oa);
        String strKid = this.yo.kid();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", this.yo.gem());
            jSONObject.put("currentIndex", this.orq);
            jSONObject.put("totalAdCount", this.gzw);
        } catch (JSONException unused) {
        }
        this.xs.oa(this.uef).uef(this.yo).uef(com.bytedance.sdk.openadsdk.core.zjm.oa.yo.uef(this.yo, true, jSONObject)).yo(this.yo.iou()).moa(this.yo.em()).oa(i5).lw(strKid).uef(this.uef).oa(this.bcc).uef(map).uef(new oib(3, this.bcc, this.yo));
    }

    public void yo() throws JSONException {
        bcc bccVar;
        if (!this.f26080ab.get() || (bccVar = this.zjm) == null) {
            return;
        }
        bccVar.yo(false);
    }

    public void uef(boolean z2, com.bytedance.sdk.openadsdk.cq.xs xsVar) {
        this.dj = xsVar;
        this.zjm.oa(z2);
        com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().oa(this.yo);
        this.uef.a_(this.cz);
        bcc bccVar = this.zjm;
        if (bccVar != null) {
            bccVar.ivm(com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(this.yo));
            this.zjm.bcc(this.cz);
        }
    }

    public void uef() throws JSONException {
        zjm zjmVar;
        final boolean z2 = true;
        if (this.f26080ab.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.lw;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (!this.dz && (zjmVar = this.ivm) != null) {
            zjmVar.oa(this.yo, this.moa);
            bcc bccVar = this.zjm;
            if (bccVar != null) {
                bccVar.ku();
            }
        } else {
            this.zjm.yo(true);
            oyt oytVar = this.xs;
            if (oytVar != null && oytVar.dz() != null) {
                this.xs.dz().lw();
            }
            InterfaceC0133uef interfaceC0133uef = this.gr;
            if (interfaceC0133uef != null) {
                interfaceC0133uef.uef(this.wk);
            }
            z2 = false;
        }
        if (this.zjm != null) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), this.yo, this.bcc, "playable_track", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.7
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject uef() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", uef.this.zjm.af());
                        jSONObject.put("has_loading", z2);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject yo() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
            this.zjm.ivm(com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(this.yo));
        }
        ivm ivmVar = this.uef;
        if (ivmVar != null) {
            ivmVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.ab.moa.uef("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.8
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    if (uef.this.rt != null) {
                        jSONObject.put("destroy_stack_trace", uef.this.rt.toString());
                    }
                    jSONObject.put("destroy_ts", uef.this.gsd);
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("plb_npe_crash").oa(jSONObject.toString());
                }
            });
        }
    }

    public void uef(final int i5, final int i10) throws JSONException {
        InterfaceC0133uef interfaceC0133uef;
        bcc bccVar;
        oa oaVar;
        if (this.dz) {
            return;
        }
        this.dz = true;
        this.wk = i5;
        if (i5 == 2) {
            this.cq = true;
            this.zjm.uef(3);
        } else if (i5 == 1) {
            this.cq = true;
            this.zjm.uef(2);
        } else if (i5 == 3) {
            this.cq = true;
            this.zjm.uef(4);
        } else if (i5 == 0) {
            this.zjm.uef(1);
        }
        if (this.cq && (oaVar = this.dhk) != null) {
            oaVar.uef();
        }
        if (this.f26080ab.get() && (bccVar = this.zjm) != null) {
            bccVar.yo(true);
        }
        oyt oytVar = this.xs;
        if (oytVar != null && oytVar.dz() != null) {
            this.xs.dz().lw();
        }
        if (!this.cq && (interfaceC0133uef = this.gr) != null) {
            interfaceC0133uef.uef(i5);
        }
        zjm zjmVar = this.ivm;
        if (zjmVar != null) {
            zjmVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.9
                @Override // java.lang.Runnable
                public void run() {
                    if (uef.this.cq) {
                        uef.this.sy.setVisibility(0);
                        if (uef.this.gr != null) {
                            uef.this.gr.uef(i5);
                        }
                        uef.this.uef(true);
                    }
                    uef.this.zjm.xs(uef.this.cq);
                    uef.this.ivm.yo();
                    if (uef.this.f26080ab.get()) {
                        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), uef.this.yo, uef.this.bcc, "playable_track", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.orq.uef.uef.9.1
                            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                            public JSONObject uef() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i5);
                                    jSONObject.put("remove_loading_page_reason", i10);
                                    jSONObject.put("playable_url", uef.this.cz);
                                    jSONObject.put("duration", uef.this.ivm.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                            public JSONObject yo() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }
                        });
                    }
                }
            });
        }
    }

    public void uef(boolean z2) {
        bcc bccVar = this.zjm;
        if (bccVar != null) {
            bccVar.uef(z2);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.uef uefVar) {
        this.oib = uefVar;
        zjm zjmVar = this.ivm;
        if (zjmVar != null && zjmVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.ivm.bcc downloadButton = this.ivm.getDownloadButton();
            downloadButton.setOnClickListener(uefVar);
            downloadButton.setOnTouchListener(uefVar);
        }
        cz czVar = this.sy;
        if (czVar != null) {
            czVar.setClickListener(uefVar);
        }
    }

    public void uef(oa oaVar) {
        this.dhk = oaVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        oyt oytVar = this.xs;
        if (oytVar != null) {
            oytVar.uef(oaVar);
        }
    }
}
