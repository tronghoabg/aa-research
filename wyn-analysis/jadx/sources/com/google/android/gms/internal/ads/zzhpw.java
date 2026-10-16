package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhpw {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhpv.zza, zzhot.class, zzhoa.class);
        zzd = zzhni.zzd(zzhps.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhpt.zza, zzhom.class, zzhnz.class);
        zzf = zzhme.zzd(zzhpu.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    public static /* synthetic */ zzhoa zzb(zzhot zzhotVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzhqw zzhqwVarZzd = zzhqx.zzd();
        zzhqwVarZzd.zzb(zzh(zzhotVar));
        zzhqwVarZzd.zza(zzhotVar.zzc());
        zzhtdVarZze.zzb(((zzhqx) zzhqwVarZzd.zzbu()).zzaM());
        zzhtdVarZze.zzc(zzf(zzhotVar.zzf()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhot zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhqx zzhqxVarZzc = zzhqx.zzc(zzhoaVar.zzc().zzb(), zzidz.zzb());
            zzhor zzhorVarZzb = zzhot.zzb();
            zzhorVarZzb.zza(zzhqxVarZzc.zza());
            zzhorVarZzb.zzb(zzhqxVarZzc.zzb().zza());
            zzhorVarZzb.zzc(zzg(zzhoaVar.zzc().zzc()));
            return zzhorVarZzb.zzd();
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhnz zzd(zzhom zzhomVar, zzhey zzheyVar) {
        zzhqu zzhquVarZze = zzhqv.zze();
        zzhquVarZze.zzb(zzh(zzhomVar.zzf()));
        byte[] bArrZzc = zzhomVar.zzd().zzc(zzheyVar);
        zzhquVarZze.zza(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhqv) zzhquVarZze.zzbu()).zzaM(), zzhta.SYMMETRIC, zzf(zzhomVar.zzf().zzf()), zzhomVar.zzb());
    }

    public static /* synthetic */ zzhom zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhqv zzhqvVarZzd = zzhqv.zzd(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhqvVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhor zzhorVarZzb = zzhot.zzb();
            zzhorVarZzb.zza(zzhqvVarZzd.zzb().zzb());
            zzhorVarZzb.zzb(zzhqvVarZzd.zzc().zza());
            zzhorVarZzb.zzc(zzg(zzhnzVar.zzd()));
            zzhot zzhotVarZzd = zzhorVarZzb.zzd();
            zzhol zzholVarZzc = zzhom.zzc();
            zzholVarZzc.zza(zzhotVarZzd);
            zzholVarZzc.zzb(zzibm.zza(zzhqvVarZzd.zzb().zzA(), zzheyVar));
            zzholVarZzc.zzc(zzhnzVar.zze());
            return zzholVarZzc.zzd();
        } catch (zzifh | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhtx zzf(zzhos zzhosVar) throws GeneralSecurityException {
        if (zzhos.zza.equals(zzhosVar)) {
            return zzhtx.TINK;
        }
        if (zzhos.zzb.equals(zzhosVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhos.zzd.equals(zzhosVar)) {
            return zzhtx.RAW;
        }
        if (zzhos.zzc.equals(zzhosVar)) {
            return zzhtx.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhosVar)));
    }

    private static zzhos zzg(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhos.zza;
        }
        if (iOrdinal == 2) {
            return zzhos.zzc;
        }
        if (iOrdinal == 3) {
            return zzhos.zzd;
        }
        if (iOrdinal == 4) {
            return zzhos.zzb;
        }
        int iZza = zzhtxVar.zza();
        throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }

    private static zzhqz zzh(zzhot zzhotVar) {
        zzhqy zzhqyVarZzb = zzhqz.zzb();
        zzhqyVarZzb.zza(zzhotVar.zzd());
        return (zzhqz) zzhqyVarZzb.zzbu();
    }
}
