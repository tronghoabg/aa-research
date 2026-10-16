package com.carstream.tech.apps.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.carstream.tech.phone.ModeActivity;
import defpackage.d8;
import defpackage.dd;
import defpackage.ec;
import defpackage.h6;
import defpackage.k1;
import defpackage.l0;
import defpackage.w1;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class LoginActivity extends Activity {
    private static final String EXTRA_APP_ID = "app_id";
    private dd app;
    private WebView web;

    public static Intent intentFor(Context context, dd ddVar) {
        Intent intent = new Intent(context, (Class<?>) LoginActivity.class);
        intent.putExtra(EXTRA_APP_ID, ddVar.a);
        return intent;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.web;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.web.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String strReplace;
        super.onCreate(bundle);
        k1.s(this);
        boolean zNamNgang = ModeActivity.namNgang(this);
        if (ec.l(this) || zNamNgang) {
            try {
                setRequestedOrientation(0);
            } catch (Throwable unused) {
            }
        }
        dd ddVarA = l0.a(getIntent().getStringExtra(EXTRA_APP_ID));
        this.app = ddVarA;
        if (ddVarA == null || ddVarA.f == null) {
            finish();
            return;
        }
        WebView webView = new WebView(this);
        this.web = webView;
        webView.setBackgroundColor(d8.e());
        setContentView(this.web);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(this.web, true);
        WebSettings settings = this.web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setDomStorageEnabled(true);
        if (this.app.g) {
            strReplace = w1.i(settings.getUserAgentString());
        } else {
            String userAgentString = settings.getUserAgentString();
            strReplace = userAgentString == null ? "" : userAgentString.replace("; wv", "").replace("Version/4.0 ", "");
        }
        settings.setUserAgentString(strReplace);
        this.web.setWebViewClient(new h6(this));
        dd ddVar = this.app;
        String str = ddVar.a;
        this.web.loadUrl((String) ddVar.f.a);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        CookieManager.getInstance().flush();
        WebView webView = this.web;
        if (webView != null) {
            webView.destroy();
            this.web = null;
        }
        super.onDestroy();
    }
}
