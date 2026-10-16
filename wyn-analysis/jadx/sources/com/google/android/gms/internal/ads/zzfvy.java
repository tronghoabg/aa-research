package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfvy implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    public zzfvy(zzfvz zzfvzVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        Objects.requireNonNull(zzfvzVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvz.zzk(this.zza, this.zzb);
    }
}
