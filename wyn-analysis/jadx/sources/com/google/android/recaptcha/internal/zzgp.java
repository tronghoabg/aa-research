package com.google.android.recaptcha.internal;

import Ef.C0514u;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ef.InterfaceC2519c;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzgp extends WebViewClient {
    final /* synthetic */ zzgv zza;

    public zzgp(zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(@NotNull WebView webView, @NotNull String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@NotNull WebView webView, @NotNull String str) {
        long jZza = this.zza.zzj.zza(TimeUnit.MICROSECONDS);
        int i5 = zzbq.zza;
        zzbq.zza(zzbr.zzg.zza(), jZza);
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC2519c
    public final void onReceivedError(@NotNull WebView webView, int i5, @NotNull String str, @NotNull String str2) {
        super.onReceivedError(webView, i5, str, str2);
        zzbh zzbhVar = zzbh.zzc;
        zzbg zzbgVar = (zzbg) this.zza.zzh.get(Integer.valueOf(i5));
        if (zzbgVar == null) {
            zzbgVar = zzbg.zzM;
        }
        zzbj zzbjVar = new zzbj(zzbhVar, zzbgVar, null);
        this.zza.zzu().hashCode();
        zzbjVar.getMessage();
        ((C0514u) this.zza.zzu()).Y(zzbjVar);
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC2519c
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView webView, @NotNull String str) {
        Uri uri = Uri.parse(str);
        int i5 = zzdt.zza;
        AbstractC3340k.b(uri);
        if (!zzdt.zzc(uri) || zzdt.zza(uri)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzQ, null);
        this.zza.zzu().hashCode();
        uri.toString();
        ((C0514u) this.zza.zzu()).Y(zzbjVar);
        return new WebResourceResponse(MimeTypes.PLAIN_TEXT, "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
