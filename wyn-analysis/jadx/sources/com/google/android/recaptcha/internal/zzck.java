package com.google.android.recaptcha.internal;

import Ef.E;
import Ef.H;
import Ef.L0;
import Fe.e;
import android.app.Application;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzck extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzdc zze;
    final /* synthetic */ zzbl zzf;
    final /* synthetic */ zzdq zzg;
    final /* synthetic */ zzbv zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzck(long j8, Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = j8;
        this.zzc = application;
        this.zzd = str;
        this.zze = zzdcVar;
        this.zzf = zzblVar;
        this.zzg = zzdqVar;
        this.zzh = zzbvVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzck(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws zzbj {
        zzbj zzbjVar;
        a aVar = a.f39711a;
        try {
            if (this.zza != 0) {
                e.U(obj);
            } else {
                e.U(obj);
                long j8 = this.zzb;
                zzcj zzcjVar = new zzcj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, null);
                this.zza = 1;
                obj = H.Q(j8, zzcjVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzpq) obj;
        } catch (Exception e7) {
            zzco zzcoVar = zzco.zza;
            if (e7 instanceof L0) {
                zzbjVar = new zzbj(zzbh.zzc, zzbg.zzb, e7.getMessage());
            } else {
                if (e7 instanceof zzbj) {
                    throw ((zzbj) e7);
                }
                zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e7.getMessage());
            }
            throw zzbjVar;
        }
    }
}
