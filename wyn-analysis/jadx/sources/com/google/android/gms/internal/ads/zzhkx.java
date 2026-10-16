package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhkx {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhkw.zza, zzhiv.class, zzhoa.class);
        zzd = zzhni.zzd(zzhkt.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhku.zza, zzhip.class, zzhnz.class);
        zzf = zzhme.zzd(zzhkv.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    public static /* synthetic */ zzhoa zzb(zzhiv zzhivVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzhtdVarZze.zzb(zzhuz.zzc().zzaM());
        zzhtdVarZze.zzc(zzf(zzhivVar.zzc()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhiv zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            if (zzhuz.zzb(zzhoaVar.zzc().zzb(), zzidz.zzb()).zza() == 0) {
                return zzhiv.zzb(zzg(zzhoaVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhnz zzd(zzhip zzhipVar, zzhey zzheyVar) {
        zzhuw zzhuwVarZzd = zzhux.zzd();
        byte[] bArrZzc = zzhipVar.zze().zzc(zzheyVar);
        zzhuwVarZzd.zza(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhux) zzhuwVarZzd.zzbu()).zzaM(), zzhta.SYMMETRIC, zzf(zzhipVar.zzf().zzc()), zzhipVar.zzb());
    }

    public static /* synthetic */ zzhip zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhux zzhuxVarZzc = zzhux.zzc(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhuxVarZzc.zza() == 0) {
                return zzhip.zzd(zzg(zzhnzVar.zzd()), zzibm.zza(zzhuxVarZzc.zzb().zzA(), zzheyVar), zzhnzVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzifh unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzhtx zzf(zzhiu zzhiuVar) throws GeneralSecurityException {
        if (zzhiu.zza.equals(zzhiuVar)) {
            return zzhtx.TINK;
        }
        if (zzhiu.zzb.equals(zzhiuVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhiu.zzc.equals(zzhiuVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhiuVar.toString()));
    }

    private static zzhiu zzg(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhiu.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhiu.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhiu.zzb;
    }
}
