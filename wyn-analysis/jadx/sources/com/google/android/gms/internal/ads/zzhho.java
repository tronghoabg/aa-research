package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class zzhho {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhhn.zza, zzhhj.class, zzhoa.class);
        zzd = zzhni.zzd(zzhhk.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhhl.zza, zzhhh.class, zzhnz.class);
        zzf = zzhme.zzd(zzhhm.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    public static /* synthetic */ zzhoa zzb(zzhhj zzhhjVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhtr zzhtrVarZzc = zzhts.zzc();
        zzhtrVarZzc.zza(zzhhjVar.zzc());
        zzhtdVarZze.zzb(((zzhts) zzhtrVarZzc.zzbu()).zzaM());
        zzhtdVarZze.zzc(zzf(zzhhjVar.zzd()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhhj zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            return zzhhj.zzb(zzhts.zzb(zzhoaVar.zzc().zzb(), zzidz.zzb()).zza(), zzg(zzhoaVar.zzc().zzc()));
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e7);
        }
    }

    public static /* synthetic */ zzhnz zzd(zzhhh zzhhhVar, zzhey zzheyVar) {
        zzhtp zzhtpVarZzd = zzhtq.zzd();
        zzhtr zzhtrVarZzc = zzhts.zzc();
        zzhtrVarZzc.zza(zzhhhVar.zze().zzc());
        zzhtpVarZzd.zza((zzhts) zzhtrVarZzc.zzbu());
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhtq) zzhtpVarZzd.zzbu()).zzaM(), zzhta.REMOTE, zzf(zzhhhVar.zze().zzd()), zzhhhVar.zzb());
    }

    public static /* synthetic */ zzhhh zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhtq zzhtqVarZzc = zzhtq.zzc(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhtqVarZzc.zza() == 0) {
                return zzhhh.zzd(zzhhj.zzb(zzhtqVarZzc.zzb().zza(), zzg(zzhnzVar.zzd())), zzhnzVar.zze());
            }
            String strValueOf = String.valueOf(zzhtqVarZzc);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
            sb2.append("KmsAeadKey are only accepted with version 0, got ");
            sb2.append(strValueOf);
            throw new GeneralSecurityException(sb2.toString());
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e7);
        }
    }

    private static zzhtx zzf(zzhhi zzhhiVar) throws GeneralSecurityException {
        if (zzhhi.zza.equals(zzhhiVar)) {
            return zzhtx.TINK;
        }
        if (zzhhi.zzb.equals(zzhhiVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhhiVar.toString()));
    }

    private static zzhhi zzg(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhhi.zza;
        }
        if (iOrdinal == 3) {
            return zzhhi.zzb;
        }
        int iZza = zzhtxVar.zza();
        throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }
}
