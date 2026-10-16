package defpackage;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.car.libraries.apphost.external.model.WebViewTemplate;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class kcb extends WebViewClient {
    final /* synthetic */ WebViewTemplate a;
    final /* synthetic */ kcc b;

    public kcb(kcc kccVar, WebViewTemplate webViewTemplate) {
        this.a = webViewTemplate;
        this.b = kccVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        ((ype) ((ype) kcc.a.f()).ai(2909)).R("Error connecting to %s - error: %d %s", str2, Integer.valueOf(i), str);
        kcc kccVar = this.b;
        kccVar.b.setVisibility(8);
        geu geuVar = kccVar.c;
        geb gebVarF = geuVar.f();
        gdp gdpVar = new gdp();
        gdpVar.b = geuVar.getString(R.string.internet_connection_issue);
        gebVarF.a(new gdq(gdpVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String strAr;
        ygr ygrVar;
        xtb xtbVar = new xtb(new xtb(this.a.getUrlsToOpenOnPhone(), false).a, true);
        try {
            zcz zczVarN = zeb.n(webResourceRequest.getUrl().toString());
            zczVarN.a();
            strAr = woy.ar(zczVarN.a().a);
            ygrVar = xtbVar.a;
        } catch (IllegalStateException unused) {
        }
        if (!ygrVar.contains(strAr)) {
            if (xtbVar.b) {
                yno it = ygrVar.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (strAr.length() <= str.length() || !strAr.endsWith(str) || strAr.charAt((strAr.length() - str.length()) - 1) != '.') {
                    }
                }
            }
            return false;
        }
        Intent intentAddFlags = new Intent("android.intent.action.VIEW").addFlags(335544320);
        intentAddFlags.setData(webResourceRequest.getUrl());
        geu geuVar = this.b.c;
        geuVar.startActivity(intentAddFlags);
        geuVar.y().a(geuVar.getString(R.string.view_link_on_phone), 1);
        return true;
    }
}
