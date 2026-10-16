package com.bytedance.sdk.component.uef;

import A7.AbstractC0279p0;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import ka.AbstractC3256n;
import wg.b;

/* loaded from: classes.dex */
public class dhk extends uef {
    static final /* synthetic */ boolean zjm = true;
    protected String bcc;
    protected WebView cz;

    @Override // com.bytedance.sdk.component.uef.uef
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    public void moa() {
        this.cz.removeJavascriptInterface(this.bcc);
    }

    @Override // com.bytedance.sdk.component.uef.uef
    public void oa(cz czVar) {
        this.cz = czVar.uef;
        this.bcc = czVar.yo;
        if (czVar.cq) {
            return;
        }
        yo();
    }

    @Override // com.bytedance.sdk.component.uef.uef
    public Context uef(cz czVar) {
        Context context = czVar.lw;
        if (context != null) {
            return context;
        }
        WebView webView = czVar.uef;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    public void yo() {
        if (!zjm && this.cz == null) {
            throw new AssertionError();
        }
        this.cz.addJavascriptInterface(this, this.bcc);
    }

    @Override // com.bytedance.sdk.component.uef.uef
    public void oa() {
        super.oa();
        moa();
    }

    @Override // com.bytedance.sdk.component.uef.uef
    public String uef() {
        return this.cz.getUrl();
    }

    @Override // com.bytedance.sdk.component.uef.uef
    public void uef(String str, dz dzVar) {
        if (dzVar != null && !TextUtils.isEmpty(dzVar.bcc)) {
            String str2 = dzVar.bcc;
            uef(str, b.c(AbstractC0279p0.r("javascript:(function(){   const iframe = document.querySelector(atob('", Base64.encodeToString(("iframe[src=\"" + str2 + "\"").getBytes(), 2), "'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(", str, ", atob('"), Base64.encodeToString(str2.getBytes(), 2), "'));   }})()"));
            return;
        }
        super.uef(str, dzVar);
    }

    @Override // com.bytedance.sdk.component.uef.uef
    public void uef(String str) {
        uef(str, AbstractC3256n.h(new StringBuilder("javascript:"), this.bcc, "._handleMessageFromToutiao(", str, ")"));
    }

    private void uef(String str, final String str2) {
        if (this.ivm || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.uef.dhk.1
            @Override // java.lang.Runnable
            public void run() {
                if (dhk.this.ivm) {
                    return;
                }
                try {
                    dhk.this.cz.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.moa.post(runnable);
        } else {
            runnable.run();
        }
    }
}
