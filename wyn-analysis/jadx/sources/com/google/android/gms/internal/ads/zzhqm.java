package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhqm extends zzhqp {
    private final zzhqn zza;
    private final zzibm zzb;

    private zzhqm(zzhqn zzhqnVar, zzibm zzibmVar) {
        this.zza = zzhqnVar;
        this.zzb = zzibmVar;
    }

    public static zzhqm zzc(zzhqn zzhqnVar, zzibm zzibmVar) throws GeneralSecurityException {
        if (zzhqnVar.zzc() == zzibmVar.zzd()) {
            return new zzhqm(zzhqnVar, zzibmVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhqp, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Integer zzb() {
        return null;
    }

    public final zzibm zzd() {
        return this.zzb;
    }
}
