package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final /* synthetic */ class zzhmu implements zzhma {
    static final /* synthetic */ zzhmu zza = new zzhmu();

    private /* synthetic */ zzhmu() {
    }

    @Override // com.google.android.gms.internal.ads.zzhma
    public final /* synthetic */ zzhdz zza(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        int i5 = zzhmv.zza;
        zzhte zzhteVarZzc = ((zzhmn) zzheqVar).zzb().zzc();
        zzhea zzheaVarZzd = zzhmb.zza().zzd(zzhteVarZzc.zza());
        if (!zzhmb.zza().zze(zzhteVarZzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhtb zzhtbVarZzd = zzheaVarZzd.zzd(zzhteVarZzc.zzb());
        return new zzhmm(zzhnz.zza(zzhtbVarZzd.zza(), zzhtbVarZzd.zzb(), zzhtbVarZzd.zzc(), zzhteVarZzc.zzc(), num), zzhdx.zza());
    }
}
