package com.google.android.recaptcha.internal;

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
final class zzce extends AbstractC3471j implements p {
    int zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Application zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzbv zzf;
    final /* synthetic */ zzbo zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzce(String str, Application application, long j8, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzc = str;
        this.zzd = application;
        this.zze = j8;
        this.zzf = zzbvVar;
        this.zzg = zzboVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        zzce zzceVar = new zzce(this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, interfaceC3103c);
        zzceVar.zzb = obj;
        return zzceVar;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzce) create((zzdc) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        a aVar = a.f39711a;
        int i5 = this.zza;
        e.U(obj);
        if (i5 != 0) {
            return obj;
        }
        zzdc zzdcVar = (zzdc) this.zzb;
        String str = this.zzc;
        zzco zzcoVar = zzco.zza;
        zzcx zzcxVarZza = zzco.zza(zzcoVar, str);
        if (zzcxVarZza != null) {
            return zzcxVarZza;
        }
        Application application = this.zzd;
        if (this.zze < 5000) {
            throw new zzbj(zzbh.zzj, zzbg.zzI, null);
        }
        if (Y0.e.checkSelfPermission(application, "android.permission.INTERNET") != 0) {
            throw new zzbj(zzbh.zzc, zzbg.zzap, null);
        }
        Application application2 = this.zzd;
        String str2 = this.zzc;
        long j8 = this.zze;
        zzbv zzbvVar = this.zzf;
        zzbo zzboVar = this.zzg;
        this.zza = 1;
        Object objZzm = zzcoVar.zzm(application2, str2, j8, zzbvVar, null, null, zzboVar, zzdcVar, this);
        return objZzm == aVar ? aVar : objZzm;
    }
}
