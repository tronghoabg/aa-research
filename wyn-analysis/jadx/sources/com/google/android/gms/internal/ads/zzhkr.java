package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhkr {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhkq.zza, zzhio.class, zzhoa.class);
        zzd = zzhni.zzd(zzhkn.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhko.zza, zzhij.class, zzhnz.class);
        zzf = zzhme.zzd(zzhkp.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    public static /* synthetic */ zzhoa zzb(zzhio zzhioVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzhus zzhusVarZzd = zzhut.zzd();
        zzhuu zzhuuVarZzb = zzhuv.zzb();
        zzhuuVarZzb.zza(zzhioVar.zzd());
        zzhusVarZzd.zza((zzhuv) zzhuuVarZzb.zzbu());
        zzhtdVarZze.zzb(((zzhut) zzhusVarZzd.zzbu()).zzaM());
        zzhtdVarZze.zzc(zzf(zzhioVar.zzc()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhio zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhut zzhutVarZzc = zzhut.zzc(zzhoaVar.zzc().zzb(), zzidz.zzb());
            if (zzhutVarZzc.zza() == 0) {
                return zzhio.zzb(zzg(zzhoaVar.zzc().zzc()), zzhutVarZzc.zzb().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhnz zzd(zzhij zzhijVar, zzhey zzheyVar) {
        zzhuq zzhuqVarZze = zzhur.zze();
        byte[] bArrZzc = zzhijVar.zze().zzc(zzheyVar);
        zzhuqVarZze.zzb(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        zzhuu zzhuuVarZzb = zzhuv.zzb();
        zzhuuVarZzb.zza(zzhijVar.zzf().zzd());
        zzhuqVarZze.zza((zzhuv) zzhuuVarZzb.zzbu());
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhur) zzhuqVarZze.zzbu()).zzaM(), zzhta.SYMMETRIC, zzf(zzhijVar.zzf().zzc()), zzhijVar.zzb());
    }

    public static /* synthetic */ zzhij zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzhur zzhurVarZzd = zzhur.zzd(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhurVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhurVarZzd.zzc().zzb() == 32) {
                return zzhij.zzd(zzhio.zzb(zzg(zzhnzVar.zzd()), zzhurVarZzd.zzb().zza()), zzibm.zza(zzhurVarZzd.zzc().zzA(), zzheyVar), zzhnzVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzifh unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzhtx zzf(zzhin zzhinVar) throws GeneralSecurityException {
        if (Objects.equals(zzhinVar, zzhin.zza)) {
            return zzhtx.TINK;
        }
        if (Objects.equals(zzhinVar, zzhin.zzb)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhinVar.toString()));
    }

    private static zzhin zzg(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhin.zza;
        }
        if (iOrdinal == 3) {
            return zzhin.zzb;
        }
        int iZza = zzhtxVar.zza();
        throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }
}
