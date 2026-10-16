package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final /* synthetic */ class zzhgf implements zzhma {
    static final /* synthetic */ zzhgf zza = new zzhgf();

    private /* synthetic */ zzhgf() {
    }

    @Override // com.google.android.gms.internal.ads.zzhma
    public final /* synthetic */ zzhdz zza(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        zzhgk zzhgkVar = (zzhgk) zzheqVar;
        int i5 = zzhgh.zza;
        if (zzhgkVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhgc zzhgcVar = new zzhgc(null);
        zzhgcVar.zza(zzhgkVar);
        zzhgcVar.zzc(num);
        zzhgcVar.zzb(zzibm.zzb(zzhgkVar.zzc()));
        return zzhgcVar.zzd();
    }
}
