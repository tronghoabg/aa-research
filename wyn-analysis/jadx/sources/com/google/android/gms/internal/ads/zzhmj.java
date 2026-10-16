package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public class zzhmj implements zzhea {
    final String zza;
    final Class zzb;
    final zzhta zzc;

    public zzhmj(String str, Class cls, zzhta zzhtaVar, zzigh zzighVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzhtaVar;
    }

    public static zzhea zze(String str, Class cls, zzhta zzhtaVar, zzigh zzighVar) {
        return new zzhmj(str, cls, zzhtaVar, zzighVar);
    }

    public static zzher zzf(String str, Class cls, zzigh zzighVar) {
        return new zzhmi(str, cls, zzighVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    public final Object zza(zzidl zzidlVar) throws GeneralSecurityException {
        return zzhnb.zza().zzd(zzhne.zza().zzg(zzhnz.zza(this.zza, zzidlVar, this.zzc, zzhtx.RAW, null), zzhdx.zza()), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    public final zzhtb zzd(zzidl zzidlVar) throws GeneralSecurityException {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza(this.zza);
        zzhtdVarZze.zzb(zzidlVar);
        zzhtdVarZze.zzc(zzhtx.RAW);
        zzhnz zzhnzVar = (zzhnz) zzhne.zza().zzh(zzhmv.zza().zzc(zzhne.zza().zzj(zzhoa.zzb((zzhte) zzhtdVarZze.zzbu())), null), zzhnz.class, zzhdx.zza());
        zzhsz zzhszVarZzd = zzhtb.zzd();
        zzhszVarZzd.zza(zzhnzVar.zzg());
        zzhszVarZzd.zzb(zzhnzVar.zzb());
        zzhszVarZzd.zzc(zzhnzVar.zzc());
        return (zzhtb) zzhszVarZzd.zzbu();
    }
}
