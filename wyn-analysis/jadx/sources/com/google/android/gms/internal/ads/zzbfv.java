package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbfv implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbfn zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbfx zze;

    public zzbfv(zzbfx zzbfxVar, final zzbfn zzbfnVar, final WebView webView, final boolean z2) {
        this.zzb = zzbfnVar;
        this.zzc = webView;
        this.zzd = z2;
        Objects.requireNonNull(zzbfxVar);
        this.zze = zzbfxVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbfu
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzbfnVar, webView, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
