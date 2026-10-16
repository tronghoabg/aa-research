package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhja {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhiz.zza, zzhft.class, zzhoa.class);
        zzd = zzhni.zzd(zzhiw.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhix.zza, zzhfl.class, zzhnz.class);
        zzf = zzhme.zzd(zzhiy.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    public static /* synthetic */ zzhoa zzb(zzhft zzhftVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzhrc zzhrcVarZzd = zzhrd.zzd();
        zzhrg zzhrgVarZzc = zzhrh.zzc();
        zzhri zzhriVarZzb = zzhrj.zzb();
        zzhriVarZzb.zza(zzhftVar.zzf());
        zzhrgVarZzc.zza((zzhrj) zzhriVarZzb.zzbu());
        zzhrgVarZzc.zzb(zzhftVar.zzc());
        zzhrcVarZzd.zza((zzhrh) zzhrgVarZzc.zzbu());
        zzhsv zzhsvVarZze = zzhsw.zze();
        zzhsvVarZze.zza(zzi(zzhftVar));
        zzhsvVarZze.zzb(zzhftVar.zzd());
        zzhrcVarZzd.zzb((zzhsw) zzhsvVarZze.zzbu());
        zzhtdVarZze.zzb(((zzhrd) zzhrcVarZzd.zzbu()).zzaM());
        zzhtdVarZze.zzc(zzf(zzhftVar.zzg()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhft zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhrd zzhrdVarZzc = zzhrd.zzc(zzhoaVar.zzc().zzb(), zzidz.zzb());
            if (zzhrdVarZzc.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhfq zzhfqVarZzb = zzhft.zzb();
            zzhfqVarZzb.zza(zzhrdVarZzc.zza().zzb());
            zzhfqVarZzb.zzb(zzhrdVarZzc.zzb().zzb());
            zzhfqVarZzb.zzc(zzhrdVarZzc.zza().zza().zza());
            zzhfqVarZzb.zzd(zzhrdVarZzc.zzb().zza().zzb());
            zzhfqVarZzb.zzf(zzh(zzhrdVarZzc.zzb().zza().zza()));
            zzhfqVarZzb.zze(zzg(zzhoaVar.zzc().zzc()));
            return zzhfqVarZzb.zzg();
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhnz zzd(zzhfl zzhflVar, zzhey zzheyVar) {
        zzhra zzhraVarZze = zzhrb.zze();
        zzhre zzhreVarZzd = zzhrf.zzd();
        zzhri zzhriVarZzb = zzhrj.zzb();
        zzhriVarZzb.zza(zzhflVar.zzg().zzf());
        zzhreVarZzd.zza((zzhrj) zzhriVarZzb.zzbu());
        byte[] bArrZzc = zzhflVar.zze().zzc(zzheyVar);
        zzhreVarZzd.zzb(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        zzhraVarZze.zza((zzhrf) zzhreVarZzd.zzbu());
        zzhst zzhstVarZze = zzhsu.zze();
        zzhstVarZze.zza(zzi(zzhflVar.zzg()));
        byte[] bArrZzc2 = zzhflVar.zzf().zzc(zzheyVar);
        zzhstVarZze.zzb(zzidl.zzt(bArrZzc2, 0, bArrZzc2.length));
        zzhraVarZze.zzb((zzhsu) zzhstVarZze.zzbu());
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhrb) zzhraVarZze.zzbu()).zzaM(), zzhta.SYMMETRIC, zzf(zzhflVar.zzg().zzg()), zzhflVar.zzb());
    }

    public static /* synthetic */ zzhfl zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhrb zzhrbVarZzd = zzhrb.zzd(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhrbVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhrbVarZzd.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzhrbVarZzd.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzhfq zzhfqVarZzb = zzhft.zzb();
            zzhfqVarZzb.zza(zzhrbVarZzd.zzb().zzc().zzb());
            zzhfqVarZzb.zzb(zzhrbVarZzd.zzc().zzc().zzb());
            zzhfqVarZzb.zzc(zzhrbVarZzd.zzb().zzb().zza());
            zzhfqVarZzb.zzd(zzhrbVarZzd.zzc().zzb().zzb());
            zzhfqVarZzb.zzf(zzh(zzhrbVarZzd.zzc().zzb().zza()));
            zzhfqVarZzb.zze(zzg(zzhnzVar.zzd()));
            zzhft zzhftVarZzg = zzhfqVarZzb.zzg();
            zzhfk zzhfkVarZzd = zzhfl.zzd();
            zzhfkVarZzd.zza(zzhftVarZzg);
            zzhfkVarZzd.zzb(zzibm.zza(zzhrbVarZzd.zzb().zzc().zzA(), zzheyVar));
            zzhfkVarZzd.zzc(zzibm.zza(zzhrbVarZzd.zzc().zzc().zzA(), zzheyVar));
            zzhfkVarZzd.zzd(zzhnzVar.zze());
            return zzhfkVarZzd.zze();
        } catch (zzifh unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhtx zzf(zzhfs zzhfsVar) throws GeneralSecurityException {
        if (zzhfs.zza.equals(zzhfsVar)) {
            return zzhtx.TINK;
        }
        if (zzhfs.zzb.equals(zzhfsVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhfs.zzc.equals(zzhfsVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhfsVar)));
    }

    private static zzhfs zzg(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhfs.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhfs.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhfs.zzb;
    }

    private static zzhfr zzh(zzhss zzhssVar) throws GeneralSecurityException {
        int iOrdinal = zzhssVar.ordinal();
        if (iOrdinal == 1) {
            return zzhfr.zza;
        }
        if (iOrdinal == 2) {
            return zzhfr.zzd;
        }
        if (iOrdinal == 3) {
            return zzhfr.zzc;
        }
        if (iOrdinal == 4) {
            return zzhfr.zze;
        }
        if (iOrdinal == 5) {
            return zzhfr.zzb;
        }
        int iZza = zzhssVar.zza();
        throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iZza).length() + 26)));
    }

    private static zzhsy zzi(zzhft zzhftVar) throws GeneralSecurityException {
        zzhss zzhssVar;
        zzhsx zzhsxVarZzc = zzhsy.zzc();
        zzhsxVarZzc.zzb(zzhftVar.zze());
        zzhfr zzhfrVarZzh = zzhftVar.zzh();
        if (zzhfr.zza.equals(zzhfrVarZzh)) {
            zzhssVar = zzhss.SHA1;
        } else if (zzhfr.zzb.equals(zzhfrVarZzh)) {
            zzhssVar = zzhss.SHA224;
        } else if (zzhfr.zzc.equals(zzhfrVarZzh)) {
            zzhssVar = zzhss.SHA256;
        } else if (zzhfr.zzd.equals(zzhfrVarZzh)) {
            zzhssVar = zzhss.SHA384;
        } else {
            if (!zzhfr.zze.equals(zzhfrVarZzh)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzhfrVarZzh)));
            }
            zzhssVar = zzhss.SHA512;
        }
        zzhsxVarZzc.zza(zzhssVar);
        return (zzhsy) zzhsxVarZzc.zzbu();
    }
}
