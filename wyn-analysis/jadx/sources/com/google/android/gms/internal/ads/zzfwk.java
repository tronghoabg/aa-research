package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
final class zzfwk extends WebViewClient {
    final /* synthetic */ zzfwm zza;

    public zzfwk(zzfwm zzfwmVar) {
        Objects.requireNonNull(zzfwmVar);
        this.zza = zzfwmVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String string = renderProcessGoneDetail.toString();
        String strValueOf = String.valueOf(webView);
        Log.w("NativeBridge", AbstractC3256n.h(new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length()), "WebView renderer gone: ", string, "for WebView: ", strValueOf));
        zzfwm zzfwmVar = this.zza;
        if (zzfwmVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfwmVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
