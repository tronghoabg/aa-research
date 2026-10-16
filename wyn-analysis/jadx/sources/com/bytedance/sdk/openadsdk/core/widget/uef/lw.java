package com.bytedance.sdk.openadsdk.core.widget.uef;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.oa;
import com.bytedance.sdk.component.utils.sy;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.wrv;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.moa.cq;
import com.bytedance.sdk.openadsdk.moa.oa;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.gsd;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw extends ivm.uef {
    private static final HashSet<String> tpx;

    /* renamed from: ab, reason: collision with root package name */
    private boolean f25773ab;
    protected boolean bcc;
    private TTCeilingLandingPageActivity.uef bs;
    private com.bytedance.sdk.openadsdk.common.lw cq;
    protected boolean cz;
    private gzw dhk;
    private Map<String, Object> dj;
    private String dz;
    protected cq ivm;
    protected final String lw;
    protected final Context moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25774oa;
    private JSONObject oib;
    private com.bytedance.sdk.openadsdk.core.wk.moa.oa sy;
    private final boolean uef;
    private final Stack<String> wk;
    private boolean wrv;
    protected boolean xs;
    protected final oyt yo;
    private wrv zjm;

    static {
        HashSet<String> hashSet = new HashSet<>();
        tpx = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public lw(Context context, oyt oytVar, String str, com.bytedance.sdk.openadsdk.common.lw lwVar, cq cqVar, boolean z2, boolean z10, TTCeilingLandingPageActivity.uef uefVar) {
        this(context, oytVar, str, lwVar, cqVar, z2);
        this.f25773ab = z10;
        this.bs = uefVar;
    }

    private boolean lw(String str) {
        if (dhk.zjm(this.dhk)) {
            return TextUtils.equals(this.dhk.xvd(), str);
        }
        return false;
    }

    public static String moa(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !tpx.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    public cq oa() {
        return this.ivm;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        cq cqVar = this.ivm;
        if (cqVar != null) {
            cqVar.uef(webView, str, this.uef);
        }
        com.bytedance.sdk.openadsdk.common.lw lwVar = this.cq;
        if (lwVar != null) {
            lwVar.oa(webView, str, this.uef);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        String str2;
        gzw gzwVar;
        super.onPageStarted(webView, str, bitmap);
        gzw gzwVar2 = this.dhk;
        int iUef = (gzwVar2 != null && gzwVar2.dy() && com.bytedance.sdk.openadsdk.gzw.lw.uef("opt_web_index", false)) ? gb.uef(webView) : -1;
        cq cqVar = this.ivm;
        if (cqVar != null) {
            webView2 = webView;
            str2 = str;
            cqVar.uef(webView2, str2, bitmap, this.uef, iUef);
        } else {
            webView2 = webView;
            str2 = str;
        }
        com.bytedance.sdk.openadsdk.common.lw lwVar = this.cq;
        if (lwVar != null) {
            lwVar.yo(webView2, str2, this.uef);
        }
        if (this.uef && (gzwVar = this.dhk) != null && gzwVar.dy() && this.dhk.rt().oa() >= 2) {
            if (!TextUtils.isEmpty(str2) && !str2.equals(this.dz)) {
                if (this.wk.contains(str2)) {
                    while (!str2.equals(this.wk.peek())) {
                        this.wk.pop();
                    }
                } else {
                    this.wk.push(str2);
                }
            }
            this.dz = str2;
        }
        if (!this.bcc || this.cz) {
            return;
        }
        this.cz = true;
        yo.uef(this.moa).uef(true).oa(webView2.getSettings().getBuiltInZoomControls()).uef(webView2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i5, String str, String str2) {
        super.onReceivedError(webView, i5, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.ivm == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.ivm.uef(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.ivm != null) {
            int primaryError = 0;
            String strConcat = "SslError: unknown";
            String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str = url;
            this.ivm.uef(webView, primaryError, strConcat, str, moa(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.cz.ivm.uef, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.lw.lw.uef().oa();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, final String str) {
        lw lwVar;
        String str2;
        oyt oytVar;
        Uri uri;
        final String lowerCase;
        Intent uri2;
        cq cqVar = this.ivm;
        if (cqVar != null) {
            cqVar.uef(str, this.uef);
        }
        com.bytedance.sdk.openadsdk.common.lw lwVar2 = this.cq;
        if (lwVar2 != null) {
            lwVar2.uef(webView, str, this.uef);
        }
        if (uef(webView, str)) {
            return true;
        }
        gzw gzwVar = this.dhk;
        if (gzwVar != null && gzwVar.sy() == 1 && ((com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.uef(str, this.dhk) || com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.uef(this.dhk, str)) && com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.oa(this.dhk, this.moa, true))) {
            return true;
        }
        try {
            uri = Uri.parse(str);
            lowerCase = uri.getScheme().toLowerCase();
        } catch (Throwable unused) {
            lwVar = this;
            str2 = str;
            oytVar = lwVar.yo;
            if (oytVar != null && oytVar.lw()) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str2);
        }
        if ("bytedance".equals(lowerCase)) {
            com.bytedance.sdk.openadsdk.utils.dhk.uef(uri, this.yo);
            return true;
        }
        if (yo(str)) {
            return true;
        }
        if (sy.uef(str)) {
            str2 = str;
            return super.shouldOverrideUrlLoading(webView, str2);
        }
        if (dhk.zjm(this.dhk)) {
            uef(lowerCase, str);
            return true;
        }
        try {
            if (str.startsWith("intent:")) {
                uri2 = Intent.parseUri(str, 1);
            } else if (str.startsWith("android-app:")) {
                uri2 = Intent.parseUri(str, 2);
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                uri2 = intent;
            }
            uri2.addFlags(268435456);
            com.bytedance.sdk.component.utils.oa.uef(this.moa, uri2, new oa.InterfaceC0066oa() { // from class: com.bytedance.sdk.openadsdk.core.widget.uef.lw.1
                @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
                public void uef() {
                    lw.this.uef(lowerCase, true, 0, "", str);
                }

                @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
                public void uef(Throwable th) {
                    lw.this.uef(lowerCase, false, 2, th.getMessage(), str);
                }
            });
            lwVar = this;
            str2 = str;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef("WebChromeClient", "parseUri", th);
            lwVar = this;
            str2 = str;
            try {
                lwVar.uef(lowerCase, false, 1, th.getMessage(), str2);
            } catch (Throwable unused2) {
                oytVar = lwVar.yo;
                if (oytVar != null) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str2);
            }
        }
        com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar = lwVar.sy;
        if (oaVar != null) {
            oaVar.hg();
        }
        return true;
    }

    public void yo() {
        if (TextUtils.isEmpty(this.f25774oa) || !dhk.cz(this.dhk) || this.wrv) {
            return;
        }
        wrv wrvVar = this.zjm;
        if (wrvVar != null) {
            com.bytedance.sdk.openadsdk.moa.yo.uef("click", this.dhk, wrvVar, this.f25774oa, true, this.dj, 1);
            this.wrv = true;
            return;
        }
        JSONObject jSONObject = this.oib;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(this.dhk, this.f25774oa, "click", jSONObject);
            this.wrv = true;
        }
    }

    public boolean oa(String str) {
        String strYo;
        String strUef;
        if (this.moa == null) {
            return false;
        }
        gzw gzwVar = this.dhk;
        if (gzwVar == null || gzwVar.no() == null) {
            strYo = "";
            strUef = "";
        } else {
            strYo = this.dhk.no().yo();
            strUef = this.dhk.no().uef();
        }
        Context context = this.moa;
        gzw gzwVar2 = this.dhk;
        return com.bytedance.sdk.openadsdk.tpx.uef.uef.uef.uef(context, str, gzwVar2, gb.oa(gzwVar2), null, true) || com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.uef(this.dhk, strYo, this.moa, this.f25774oa, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.uef(this.moa, strUef, strYo, this.f25774oa, this.dhk);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.ivm == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.ivm.uef(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        cq cqVar = this.ivm;
        if (cqVar != null) {
            cqVar.oa(webView, str, this.uef);
        }
        com.bytedance.sdk.openadsdk.common.lw lwVar = this.cq;
        if (lwVar != null) {
            lwVar.uef(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public void uef(wrv wrvVar) {
        this.zjm = wrvVar;
    }

    public void uef(Map<String, Object> map) {
        this.dj = map;
    }

    public lw(Context context, oyt oytVar, String str, com.bytedance.sdk.openadsdk.common.lw lwVar, cq cqVar, boolean z2) {
        this(context, oytVar, str, cqVar, z2);
        this.cq = lwVar;
    }

    public void uef(JSONObject jSONObject) {
        this.oib = jSONObject;
    }

    public void uef(String str) {
        this.f25774oa = str;
    }

    public lw(Context context, oyt oytVar, String str, cq cqVar, boolean z2) {
        this.xs = true;
        this.bcc = true;
        this.cz = false;
        this.moa = context;
        this.yo = oytVar;
        this.lw = str;
        this.ivm = cqVar;
        this.uef = z2;
        this.wk = new Stack<>();
    }

    public void uef(gzw gzwVar) {
        this.dhk = gzwVar;
    }

    private void uef(String str, String str2) {
        if ((lw(str) || "market".equals(str)) && ((this.zjm != null || this.oib != null) && oa(str2))) {
            yo();
        }
        this.zjm = null;
        this.oib = null;
    }

    public boolean yo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (dhk.zjm(this.dhk) && this.oib == null && this.zjm == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.moa instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.moa.startActivity(intent);
                yo();
                this.oib = null;
                this.zjm = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean uef(WebView webView, String str) {
        if (!gb.moa(this.dhk) || this.dhk.rt() == null || webView == null) {
            return false;
        }
        int iOa = this.dhk.rt().oa();
        int size = this.wk.size();
        if (this.f25773ab) {
            size++;
        }
        if (size + 1 != iOa) {
            return false;
        }
        gsd.uef(this.moa, str, this.dhk, oa.uef.moa, true);
        TTCeilingLandingPageActivity.uef uefVar = this.bs;
        if (uefVar != null) {
            uefVar.uef();
        }
        return true;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar) {
        this.sy = oaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final String str, final boolean z2, final int i5, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), this.dhk, this.f25774oa, "lp_not_http_open", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.widget.uef.lw.2
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z2);
                    jSONObject.put("error_type", i5);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
