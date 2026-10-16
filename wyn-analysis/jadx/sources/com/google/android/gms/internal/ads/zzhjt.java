package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhjt {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhjs.zza, zzhgt.class, zzhoa.class);
        zzd = zzhni.zzd(zzhjp.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhjq.zza, zzhgm.class, zzhnz.class);
        zzf = zzhme.zzd(zzhjr.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    public static /* synthetic */ zzhoa zzb(zzhgt zzhgtVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzhrw zzhrwVarZzd = zzhrx.zzd();
        zzhrwVarZzd.zza(zzhgtVar.zzc());
        zzhtdVarZze.zzb(((zzhrx) zzhrwVarZzd.zzbu()).zzaM());
        zzhtdVarZze.zzc(zzf(zzhgtVar.zzd()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhgt zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhrx zzhrxVarZzc = zzhrx.zzc(zzhoaVar.zzc().zzb(), zzidz.zzb());
            if (zzhrxVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhgr zzhgrVarZzb = zzhgt.zzb();
            zzhgrVarZzb.zza(zzhrxVarZzc.zza());
            zzhgrVarZzb.zzb(zzg(zzhoaVar.zzc().zzc()));
            return zzhgrVarZzb.zzc();
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhnz zzd(zzhgm zzhgmVar, zzhey zzheyVar) {
        zzhru zzhruVarZzd = zzhrv.zzd();
        byte[] bArrZzc = zzhgmVar.zze().zzc(zzheyVar);
        zzhruVarZzd.zza(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhrv) zzhruVarZzd.zzbu()).zzaM(), zzhta.SYMMETRIC, zzf(zzhgmVar.zzf().zzd()), zzhgmVar.zzb());
    }

    public static /* synthetic */ zzhgm zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhrv zzhrvVarZzc = zzhrv.zzc(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhrvVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhgr zzhgrVarZzb = zzhgt.zzb();
            zzhgrVarZzb.zza(zzhrvVarZzc.zzb().zzb());
            zzhgrVarZzb.zzb(zzg(zzhnzVar.zzd()));
            zzhgt zzhgtVarZzc = zzhgrVarZzb.zzc();
            zzhgl zzhglVarZzd = zzhgm.zzd();
            zzhglVarZzd.zza(zzhgtVarZzc);
            zzhglVarZzd.zzb(zzibm.zza(zzhrvVarZzc.zzb().zzA(), zzheyVar));
            zzhglVarZzd.zzc(zzhnzVar.zze());
            return zzhglVarZzd.zzd();
        } catch (zzifh unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhtx zzf(zzhgs zzhgsVar) throws GeneralSecurityException {
        if (zzhgs.zza.equals(zzhgsVar)) {
            return zzhtx.TINK;
        }
        if (zzhgs.zzb.equals(zzhgsVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhgs.zzc.equals(zzhgsVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhgsVar)));
    }

    private static zzhgs zzg(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhgs.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhgs.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhgs.zzb;
    }
}
