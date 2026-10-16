package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzctw implements zzhcc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcuc zzb;

    public zzctw(zzcuc zzcucVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcucVar);
        this.zzb = zzcucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzcuc zzcucVar = this.zzb;
        zzcucVar.zzu().zza(zzcucVar.zzt().zzb(zzcucVar.zzr(), zzcucVar.zzs(), false, this.zza, null, zzcucVar.zzp(), zzcucVar.zzw(), zzcucVar.zzx()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzcuc zzcucVar = this.zzb;
        zzcucVar.zzu().zza(zzcucVar.zzt().zzb(zzcucVar.zzr(), zzcucVar.zzs(), false, str, str2, zzcucVar.zzp(), zzcucVar.zzw(), zzcucVar.zzx()), zzcucVar.zzv());
    }
}
