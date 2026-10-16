package defpackage;

import android.os.Bundle;
import android.webkit.WebView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class ont extends jrh {
    private static final yph a = yph.c("GH.PrototypeCarActivity");

    @Override // defpackage.jrh, defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void a(Bundle bundle) {
        super.a(bundle);
        ((ype) ((ype) a.f()).ai((char) 6059)).u("onCreate");
        v(R.layout.prototype);
        WebView webView = (WebView) B(R.id.web_view);
        webView.getSettings().setBlockNetworkLoads(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(acyb.c());
    }
}
