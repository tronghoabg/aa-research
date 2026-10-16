package io.flutter.plugins.urllauncher;

import A7.V1;
import Va.wb;
import Y0.e;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import gd.C2752g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class WebViewActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f37184e = 0;

    /* renamed from: c, reason: collision with root package name */
    public WebView f37187c;

    /* renamed from: a, reason: collision with root package name */
    public final V1 f37185a = new V1(this, 10);

    /* renamed from: b, reason: collision with root package name */
    public final wb f37186b = new wb(2);

    /* renamed from: d, reason: collision with root package name */
    public final IntentFilter f37188d = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f37187c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap map2 = new HashMap();
            for (String str : bundleExtra.keySet()) {
                map2.put(str, bundleExtra.getString(str));
            }
            map = map2;
        }
        this.f37187c.loadUrl(stringExtra, map);
        this.f37187c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f37187c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f37187c.setWebViewClient(this.f37186b);
        this.f37187c.getSettings().setSupportMultipleWindows(true);
        this.f37187c.setWebChromeClient(new C2752g(this));
        e.registerReceiver(this, this.f37185a, this.f37188d, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f37185a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (i5 != 4 || !this.f37187c.canGoBack()) {
            return super.onKeyDown(i5, keyEvent);
        }
        this.f37187c.goBack();
        return true;
    }
}
