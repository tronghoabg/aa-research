package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import android.app.Application;
import android.os.Build;
import com.google.android.recaptcha.RecaptchaException;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzcj extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzbl zze;
    final /* synthetic */ zzdq zzf;
    final /* synthetic */ zzbv zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcj(Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = application;
        this.zzc = str;
        this.zzd = zzdcVar;
        this.zze = zzblVar;
        this.zzf = zzdqVar;
        this.zzg = zzbvVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzcj(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws RecaptchaException {
        a aVar = a.f39711a;
        int i5 = this.zza;
        e.U(obj);
        if (i5 != 0) {
            return obj;
        }
        Application application = this.zzb;
        int i10 = zzbz.zza;
        String str = this.zzc;
        zzdc zzdcVar = this.zzd;
        zzbl zzblVar = this.zze;
        int iZza = zzbz.zza(application);
        String packageName = application.getPackageName();
        String strZzd = zzdcVar.zzd();
        int i11 = Build.VERSION.SDK_INT;
        String strZza = zzblVar.zza();
        zzqs zzqsVarZzf = zzqt.zzf();
        zzqsVarZzf.zzs(str);
        zzqsVarZzf.zzp(packageName);
        zzqsVarZzf.zzt(iZza);
        zzqsVarZzf.zzq("18.5.1");
        zzqsVarZzf.zzr(strZzd);
        zzqsVarZzf.zze(String.valueOf(i11));
        zzqsVarZzf.zzd(strZza);
        zzqt zzqtVar = (zzqt) zzqsVarZzf.zzj();
        zzdq zzdqVar = this.zzf;
        zzbv zzbvVar = this.zzg;
        zzdc zzdcVar2 = this.zzd;
        String strZzb = zzbvVar.zzb();
        this.zza = 1;
        Object objZza = zzdqVar.zza(strZzb, zzqtVar, zzdcVar2, this);
        return objZza == aVar ? aVar : objZza;
    }
}
