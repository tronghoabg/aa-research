package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes3.dex */
public final class zzibc implements zzhev {
    static final zzhlv zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        zzhlu zzhluVarZza = zzhlv.zza();
        zzhluVarZza.zza(zziat.SHA256, zzhwv.zza);
        zzhluVarZza.zza(zziat.SHA384, zzhwv.zzb);
        zzhluVarZza.zza(zziat.SHA512, zzhwv.zzc);
        zza = zzhluVarZza.zzb();
    }

    public static zzhev zzb(zzhxb zzhxbVar) throws GeneralSecurityException {
        try {
            return zzhyy.zzd(zzhxbVar);
        } catch (NoSuchProviderException unused) {
            return new zzibb((RSAPublicKey) ((KeyFactory) zziak.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhxbVar.zzd(), zzhxbVar.zzf().zzd())), (zziat) zza.zzb(zzhxbVar.zzf().zzf()), zzhxbVar.zze().zzc(), zzhxbVar.zzf().zze().equals(zzhww.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
