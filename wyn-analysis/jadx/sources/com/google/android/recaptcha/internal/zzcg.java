package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import android.app.Application;
import android.webkit.WebView;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzcg extends AbstractC3471j implements p {
    final /* synthetic */ WebView zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ zzbv zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ zzbo zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcg(WebView webView, Application application, zzbv zzbvVar, zzdc zzdcVar, zzbo zzboVar, zzdq zzdqVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zza = webView;
        this.zzb = application;
        this.zzc = zzbvVar;
        this.zzd = zzdcVar;
        this.zzf = zzboVar;
        this.zze = zzdqVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzcg(this.zza, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcg) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        e.U(obj);
        WebView webView = this.zza;
        return new zzgv(webView == null ? new WebView(this.zzb) : webView, this.zzb, this.zzc, this.zzd, this.zzf, this.zze);
    }
}
