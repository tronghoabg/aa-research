package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhvq extends zzhxu {
    private final zzhvw zza;
    private final zzibm zzb;

    private zzhvq(zzhvw zzhvwVar, zzibm zzibmVar) {
        this.zza = zzhvwVar;
        this.zzb = zzibmVar;
    }

    public static zzhvq zzc(zzhvw zzhvwVar, zzibm zzibmVar) throws GeneralSecurityException {
        if (zzibmVar.zzd() != 32) {
            int iZzd = zzibmVar.zzd();
            throw new GeneralSecurityException(N0.a.d(iZzd, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 65)));
        }
        if (Arrays.equals(zzhvwVar.zzd().zzc(), zzhlp.zza(zzhlp.zzb(zzibmVar.zzc(zzhdx.zza()))))) {
            return new zzhvq(zzhvwVar, zzibmVar);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhxu, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza.zzf();
    }

    public final zzhvp zzd() {
        return this.zza.zzf();
    }

    public final zzhvw zze() {
        return this.zza;
    }

    public final zzibm zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxu
    public final /* synthetic */ zzhxv zzg() {
        return this.zza;
    }
}
