package com.bytedance.sdk.openadsdk.core.widget.uef;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.moa.cq;
import com.bytedance.sdk.openadsdk.utils.dhk;

/* loaded from: classes3.dex */
public class moa extends WebChromeClient {
    private static final String uef = "WebChromeClient";
    private com.bytedance.sdk.openadsdk.common.lw moa;

    /* renamed from: oa, reason: collision with root package name */
    private final oyt f25777oa;
    private cq yo;

    public moa(oyt oytVar) {
        this.f25777oa = oytVar;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i5, String str2) {
        if (!TextUtils.isEmpty(str)) {
            uef(str);
        }
        super.onConsoleMessage(str, i5, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i5) {
        super.onProgressChanged(webView, i5);
        cq cqVar = this.yo;
        if (cqVar != null) {
            cqVar.uef(webView, i5);
        }
        com.bytedance.sdk.openadsdk.common.lw lwVar = this.moa;
        if (lwVar != null) {
            lwVar.uef(webView, i5);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean uef(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                wk.yo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.uef.moa.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dhk.uef(Uri.parse(str), moa.this.f25777oa);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public moa(oyt oytVar, cq cqVar, com.bytedance.sdk.openadsdk.common.lw lwVar) {
        this(oytVar, cqVar);
        this.moa = lwVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !uef(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public moa(oyt oytVar, cq cqVar) {
        this.f25777oa = oytVar;
        this.yo = cqVar;
    }
}
