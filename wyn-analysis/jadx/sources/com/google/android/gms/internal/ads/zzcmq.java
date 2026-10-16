package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class zzcmq extends zzcmp {
    public zzcmq(zzclb zzclbVar, zzbhw zzbhwVar, boolean z2, zzekz zzekzVar) {
        super(zzclbVar, zzbhwVar, z2, zzekzVar);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zza.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
