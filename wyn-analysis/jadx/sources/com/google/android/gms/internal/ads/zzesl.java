package com.google.android.gms.internal.ads;

import D6.C0369e0;
import D6.InterfaceC0407y;
import D6.x1;
import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzesl extends D6.G {
    final zzflf zza;
    final zzdqk zzb;
    private final Context zzc;
    private final zzcnq zzd;
    private InterfaceC0407y zze;

    public zzesl(zzcnq zzcnqVar, Context context, String str) {
        zzflf zzflfVar = new zzflf();
        this.zza = zzflfVar;
        this.zzb = new zzdqk();
        this.zzd = zzcnqVar;
        zzflfVar.zzg(str);
        this.zzc = context;
    }

    @Override // D6.H
    public final D6.E zze() {
        zzdql zzdqlVarZzg = this.zzb.zzg();
        ArrayList arrayListZzh = zzdqlVarZzg.zzh();
        zzflf zzflfVar = this.zza;
        zzflfVar.zzm(arrayListZzh);
        zzflfVar.zzn(zzdqlVarZzg.zzi());
        if (zzflfVar.zzf() == null) {
            zzflfVar.zzc(x1.V());
        }
        return new zzesm(this.zzc, this.zzd, zzflfVar, zzdqlVarZzg, this.zze);
    }

    @Override // D6.H
    public final void zzf(InterfaceC0407y interfaceC0407y) {
        this.zze = interfaceC0407y;
    }

    @Override // D6.H
    public final void zzg(zzbng zzbngVar) {
        this.zzb.zzb(zzbngVar);
    }

    @Override // D6.H
    public final void zzh(zzbnj zzbnjVar) {
        this.zzb.zza(zzbnjVar);
    }

    @Override // D6.H
    public final void zzi(String str, zzbnp zzbnpVar, zzbnm zzbnmVar) {
        this.zzb.zzf(str, zzbnpVar, zzbnmVar);
    }

    @Override // D6.H
    public final void zzj(zzbma zzbmaVar) {
        this.zza.zzo(zzbmaVar);
    }

    @Override // D6.H
    public final void zzk(zzbnt zzbntVar, x1 x1Var) {
        this.zzb.zzd(zzbntVar);
        this.zza.zzc(x1Var);
    }

    @Override // D6.H
    public final void zzl(A6.g gVar) {
        this.zza.zzr(gVar);
    }

    @Override // D6.H
    public final void zzm(zzbnw zzbnwVar) {
        this.zzb.zzc(zzbnwVar);
    }

    @Override // D6.H
    public final void zzn(zzbsi zzbsiVar) {
        this.zza.zzq(zzbsiVar);
    }

    @Override // D6.H
    public final void zzo(zzbsr zzbsrVar) {
        this.zzb.zze(zzbsrVar);
    }

    @Override // D6.H
    public final void zzp(A6.a aVar) {
        this.zza.zzs(aVar);
    }

    @Override // D6.H
    public final void zzq(C0369e0 c0369e0) {
        this.zza.zzab(c0369e0);
    }
}
