package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhye implements zzhev {
    static final zzhlv zza;
    static final zzhlv zzb;
    static final zzhlv zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zziad zzi;
    private final byte[] zzj;
    private final byte[] zzk;
    private final Provider zzl;

    static {
        zzhlu zzhluVarZza = zzhlv.zza();
        zzhluVarZza.zza(zziat.SHA256, zzhvc.zza);
        zzhluVarZza.zza(zziat.SHA384, zzhvc.zzb);
        zzhluVarZza.zza(zziat.SHA512, zzhvc.zzc);
        zza = zzhluVarZza.zzb();
        zzhlu zzhluVarZza2 = zzhlv.zza();
        zzhluVarZza2.zza(zziad.IEEE_P1363, zzhvd.zza);
        zzhluVarZza2.zza(zziad.DER, zzhvd.zzb);
        zzb = zzhluVarZza2.zzb();
        zzhlu zzhluVarZza3 = zzhlv.zza();
        zzhluVarZza3.zza(zziac.NIST_P256, zzhvb.zza);
        zzhluVarZza3.zza(zziac.NIST_P384, zzhvb.zzb);
        zzhluVarZza3.zza(zziac.NIST_P521, zzhvb.zzc);
        zzc = zzhluVarZza3.zzb();
    }

    private zzhye(ECPublicKey eCPublicKey, zziat zziatVar, zziad zziadVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhle.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = zzibh.zza(zziatVar);
        this.zzg = eCPublicKey;
        this.zzi = zziadVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzhev zzb(zzhvj zzhvjVar, Provider provider) throws GeneralSecurityException {
        return new zzhye((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zziak.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhvjVar.zzd(), zziae.zzb((zziac) zzc.zzb(zzhvjVar.zzf().zzd())))), (zziat) zza.zzb(zzhvjVar.zzf().zze()), (zziad) zzb.zzb(zzhvjVar.zzf().zzc()), zzhvjVar.zze().zzc(), zzhvjVar.zzf().zzf().equals(zzhve.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzc(byte[] r12, byte[] r13) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhye.zzc(byte[], byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhok.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
