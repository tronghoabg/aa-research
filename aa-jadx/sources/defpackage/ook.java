package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ook extends defpackage.jri {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.PrototypeCarActivity");

    @Override // defpackage.jri, defpackage.ovs, defpackage.qso, defpackage.qsk, defpackage.qrd
    public final void a(android.os.Bundle bundle) {
        super.a(bundle);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 6085)).u("onCreate");
        v(com.google.android.projection.gearhead.R.layout.prototype);
        android.webkit.WebView webView = (android.webkit.WebView) B(com.google.android.projection.gearhead.R.id.web_view);
        webView.getSettings().setBlockNetworkLoads(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(defpackage.aczd.c());
    }
}
