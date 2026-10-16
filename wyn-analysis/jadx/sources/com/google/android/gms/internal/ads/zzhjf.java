package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhjf {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhje.zza, zzhgb.class, zzhoa.class);
        zzd = zzhni.zzd(zzhjb.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhjc.zza, zzhfv.class, zzhnz.class);
        zzf = zzhme.zzd(zzhjd.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    public static /* synthetic */ zzhoa zzb(zzhgb zzhgbVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzhrm zzhrmVarZzd = zzhrn.zzd();
        zzhrmVarZzd.zza(zzh(zzhgbVar));
        zzhrmVarZzd.zzb(zzhgbVar.zzc());
        zzhtdVarZze.zzb(((zzhrn) zzhrmVarZzd.zzbu()).zzaM());
        zzhtdVarZze.zzc(zzf(zzhgbVar.zze()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhgb zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhrn zzhrnVarZzc = zzhrn.zzc(zzhoaVar.zzc().zzb(), zzidz.zzb());
            zzhfz zzhfzVarZzb = zzhgb.zzb();
            zzhfzVarZzb.zza(zzhrnVarZzc.zzb());
            zzhfzVarZzb.zzb(zzhrnVarZzc.zza().zza());
            zzhfzVarZzb.zzc(16);
            zzhfzVarZzb.zzd(zzg(zzhoaVar.zzc().zzc()));
            return zzhfzVarZzb.zze();
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhnz zzd(zzhfv zzhfvVar, zzhey zzheyVar) {
        zzhrk zzhrkVarZze = zzhrl.zze();
        zzhrkVarZze.zza(zzh(zzhfvVar.zzf()));
        byte[] bArrZzc = zzhfvVar.zze().zzc(zzheyVar);
        zzhrkVarZze.zzb(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhrl) zzhrkVarZze.zzbu()).zzaM(), zzhta.SYMMETRIC, zzf(zzhfvVar.zzf().zze()), zzhfvVar.zzb());
    }

    public static /* synthetic */ zzhfv zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzhrl zzhrlVarZzd = zzhrl.zzd(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhrlVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhfz zzhfzVarZzb = zzhgb.zzb();
            zzhfzVarZzb.zza(zzhrlVarZzd.zzc().zzb());
            zzhfzVarZzb.zzb(zzhrlVarZzd.zzb().zza());
            zzhfzVarZzb.zzc(16);
            zzhfzVarZzb.zzd(zzg(zzhnzVar.zzd()));
            zzhgb zzhgbVarZze = zzhfzVarZzb.zze();
            zzhfu zzhfuVarZzd = zzhfv.zzd();
            zzhfuVarZzd.zza(zzhgbVarZze);
            zzhfuVarZzd.zzb(zzibm.zza(zzhrlVarZzd.zzc().zzA(), zzheyVar));
            zzhfuVarZzd.zzc(zzhnzVar.zze());
            return zzhfuVarZzd.zzd();
        } catch (zzifh unused) {
            throw new GeneralSecurityException("Parsing AesEaxKey failed");
        }
    }

    private static zzhtx zzf(zzhga zzhgaVar) throws GeneralSecurityException {
        if (zzhga.zza.equals(zzhgaVar)) {
            return zzhtx.TINK;
        }
        if (zzhga.zzb.equals(zzhgaVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhga.zzc.equals(zzhgaVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhgaVar)));
    }

    private static zzhga zzg(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhga.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhga.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhga.zzb;
    }

    private static zzhrp zzh(zzhgb zzhgbVar) throws GeneralSecurityException {
        zzhro zzhroVarZzb = zzhrp.zzb();
        zzhroVarZzb.zza(zzhgbVar.zzd());
        return (zzhrp) zzhroVarZzb.zzbu();
    }
}
