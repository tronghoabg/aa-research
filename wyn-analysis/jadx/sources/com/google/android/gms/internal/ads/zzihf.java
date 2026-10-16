package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzihf extends zzihd {
    @Override // com.google.android.gms.internal.ads.zzihd
    public final /* bridge */ /* synthetic */ void zza(Object obj, int i5, long j8) {
        ((zzihe) obj).zzk(i5 << 3, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    public final /* bridge */ /* synthetic */ void zzb(Object obj, int i5, int i10) {
        ((zzihe) obj).zzk((i5 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i5, long j8) {
        ((zzihe) obj).zzk((i5 << 3) | 1, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i5, zzidl zzidlVar) {
        ((zzihe) obj).zzk((i5 << 3) | 2, zzidlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i5, Object obj2) {
        ((zzihe) obj).zzk((i5 << 3) | 3, (zzihe) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    public final /* synthetic */ Object zzf() {
        return zzihe.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    public final /* synthetic */ Object zzg(Object obj) {
        zzihe zziheVar = (zzihe) obj;
        zziheVar.zzd();
        return zziheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    public final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zziep zziepVar = (zziep) obj;
        zzihe zziheVar = zziepVar.zzt;
        if (zziheVar != zzihe.zza()) {
            return zziheVar;
        }
        zzihe zziheVarZzb = zzihe.zzb();
        zziepVar.zzt = zziheVarZzb;
        return zziheVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zziep) obj).zzt = (zzihe) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    public final void zzj(Object obj) {
        ((zziep) obj).zzt.zzd();
    }
}
