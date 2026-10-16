package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.pu;
import com.bytedance.sdk.openadsdk.core.zjm.yo;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm extends com.bytedance.sdk.component.cz.ivm implements yo.InterfaceC0115yo {

    /* renamed from: ab, reason: collision with root package name */
    private long f25859ab;
    private gr bcc;
    private List<String> cq;
    private yo cz;
    private String dj;
    private oa dz;
    AtomicBoolean ivm;
    protected boolean lw;
    protected boolean moa;
    private int wk;
    private int wrv;
    AtomicBoolean xs;
    private com.bytedance.sdk.openadsdk.core.model.gzw zjm;

    public interface oa {
        void oa();

        View uef();

        void uef(int i5, int i10);

        void uef(View view, int i5);
    }

    public static class uef extends ivm.uef {
        public static final Set<String> uef = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.zjm.ivm.uef.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };

        /* renamed from: oa, reason: collision with root package name */
        yo.InterfaceC0115yo f25860oa;

        public uef(yo.InterfaceC0115yo interfaceC0115yo) {
            this.f25860oa = interfaceC0115yo;
        }

        private void uef(String str) {
            int iLastIndexOf;
            yo.InterfaceC0115yo interfaceC0115yo;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!uef.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0115yo = this.f25860oa) == null) {
                    return;
                }
                interfaceC0115yo.oa(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            yo.InterfaceC0115yo interfaceC0115yo = this.f25860oa;
            if (interfaceC0115yo != null) {
                interfaceC0115yo.uef();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i5, String str, String str2) {
            super.onReceivedError(webView, i5, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                uef(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            uef(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f25860oa.uef(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            uef(webResourceRequest.getUrl().toString());
        }

        private void uef(String str, int i5, String str2) {
            yo.InterfaceC0115yo interfaceC0115yo = this.f25860oa;
            if (interfaceC0115yo != null) {
                interfaceC0115yo.uef(106, i5);
            }
        }
    }

    public ivm(Context context) {
        super(context, ivm.yo.DSP);
        this.moa = false;
        this.lw = false;
        this.ivm = new AtomicBoolean(false);
        this.xs = new AtomicBoolean(false);
        this.wrv = 0;
    }

    private void tpx() {
        if (this.cq == null) {
            com.bytedance.sdk.openadsdk.moa.yo.oa(this.zjm, this.dj, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.moa.yo.uef(new com.bytedance.sdk.component.bcc.oa.yo("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.zjm.ivm.3
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        if (ivm.this.cq != null && ivm.this.xs.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = ivm.this.cq.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.moa.yo.oa(ivm.this.zjm, ivm.this.dj, "dsp_html_error_url", jSONObject);
                            ivm.this.cq = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.cz.ivm
    public void ab() {
        this.cz.oa();
        super.ab();
    }

    public void dhk() {
        this.ivm.set(false);
        String strWze = this.zjm.wze();
        if (TextUtils.isEmpty(strWze)) {
            return;
        }
        String strUef = com.bytedance.sdk.openadsdk.core.dz.lw.uef(strWze);
        String str = TextUtils.isEmpty(strUef) ? strWze : strUef;
        this.wrv = 0;
        uef(null, str, "text/html", "UTF-8", null);
        this.f25859ab = SystemClock.elapsedRealtime();
    }

    public void oib() {
        oa oaVar = this.dz;
        if (oaVar != null) {
            oaVar.oa();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.f25859ab);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.zjm, this.dj, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.component.cz.ivm, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.moa) {
            this.cz.uef(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.cz.ivm, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.cz.uef();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.wk / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.zjm, this.dj, "load_rate", jSONObject);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i5) {
        super.onVisibilityChanged(view, i5);
        boolean z2 = i5 == 0;
        this.lw = z2;
        this.cz.uef(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.yo.InterfaceC0115yo
    public void oa(String str) {
        if (this.cq == null) {
            this.cq = new ArrayList();
        }
        this.cq.add(str);
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, oa oaVar, String str) {
        this.dz = oaVar;
        this.zjm = gzwVar;
        this.dj = str;
        this.cz = new yo();
        this.bcc = new gr(getContext());
        setWebViewClient(new uef(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.zjm.ivm.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i5) {
                ivm.this.wk = i5;
                super.onProgressChanged(webView, i5);
                if (i5 >= 100) {
                    ivm.this.uef();
                }
            }
        });
        com.bytedance.sdk.component.utils.cz.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.ivm.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = ivm.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.zjm.ivm.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            ivm.this.bcc.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public static class yo {
        protected int uef = 0;

        /* renamed from: oa, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.core.dz.ivm f25861oa = com.bytedance.sdk.openadsdk.core.dz.ivm.uef();

        public void oa() {
            uef();
        }

        public void uef(WebView webView) {
            if (webView != null && this.uef == 0) {
                if (this.f25861oa == null) {
                    this.f25861oa = com.bytedance.sdk.openadsdk.core.dz.ivm.uef();
                }
                this.f25861oa.uef(webView);
                this.f25861oa.oa();
                this.uef = 1;
            }
        }

        public void uef(boolean z2) {
            com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar;
            if (this.uef == 1 && z2 && (ivmVar = this.f25861oa) != null) {
                ivmVar.yo();
                this.uef = 3;
            }
        }

        public void uef(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar = this.f25861oa;
            if (ivmVar != null) {
                ivmVar.uef(view, friendlyObstructionPurpose);
            }
        }

        public void uef() {
            com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar;
            int i5 = this.uef;
            if (i5 != 0 && i5 != 4 && (ivmVar = this.f25861oa) != null) {
                ivmVar.moa();
            }
            this.uef = 4;
            this.f25861oa = null;
        }
    }

    public void uef(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.cz.uef(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.yo.InterfaceC0115yo
    public void uef(String str) {
        boolean zUef;
        if (TextUtils.isEmpty(str) || this.zjm == null || !this.bcc.oa()) {
            return;
        }
        int iUef = gb.uef(this.dj);
        View viewUef = null;
        if (!com.bytedance.sdk.component.utils.sy.uef(str) && (this.zjm.agr() == null || TextUtils.isEmpty(this.zjm.agr().uef()))) {
            com.bytedance.sdk.openadsdk.core.model.cq cqVar = new com.bytedance.sdk.openadsdk.core.model.cq();
            cqVar.uef(str);
            this.zjm.uef(cqVar);
            str = null;
        }
        this.zjm.moa(true);
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.zjm;
        if (gzwVar == null || gzwVar.agr() == null || TextUtils.isEmpty(this.zjm.agr().uef())) {
            zUef = false;
        } else {
            zUef = pu.uef(getContext(), this.zjm, iUef, this.dj, true, (Map<String, Object>) null);
            if (!zUef && !TextUtils.isEmpty(this.zjm.agr().oa())) {
                str = this.zjm.agr().oa();
                com.bytedance.sdk.openadsdk.moa.yo.uef(this.zjm, this.dj, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!zUef) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                pu.uef(getContext(), this.zjm, iUef, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.moa.uef) null, this.dj, true, str2);
            }
        }
        if (this.bcc != null) {
            oa oaVar = this.dz;
            if (oaVar != null) {
                viewUef = oaVar.uef();
                this.dz.uef(this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.wrv wrvVarUef = this.bcc.uef(getContext(), viewUef);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.moa.yo.uef("click", this.zjm, wrvVarUef, this.dj, true, (Map<String, Object>) map, this.bcc.oa() ? 1 : 2);
        }
        gr grVar = this.bcc;
        if (grVar != null) {
            grVar.uef();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.yo.InterfaceC0115yo
    public void uef(int i5, int i10) {
        oa oaVar = this.dz;
        if (oaVar != null) {
            oaVar.uef(i5, i10);
        }
        this.wrv = i10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i10);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.f25859ab);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.zjm, this.dj, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.yo.InterfaceC0115yo
    public void uef() {
        if (this.ivm.compareAndSet(false, true)) {
            this.moa = true;
            this.cz.uef(getWebView());
            this.cz.uef(this.lw);
            oib();
            tpx();
        }
    }
}
