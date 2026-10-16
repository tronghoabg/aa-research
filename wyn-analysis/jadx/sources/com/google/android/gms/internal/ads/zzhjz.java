package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhjz {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhjy.zza, zzhgz.class, zzhoa.class);
        zzd = zzhni.zzd(zzhjv.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhjw.zza, zzhgu.class, zzhnz.class);
        zzf = zzhme.zzd(zzhjx.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    public static /* synthetic */ zzhoa zzb(zzhgz zzhgzVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzhtdVarZze.zzb(zzhsb.zzb().zzaM());
        zzhtdVarZze.zzc(zzf(zzhgzVar.zzc()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhgz zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhsb.zza(zzhoaVar.zzc().zzb(), zzidz.zzb());
            return zzhgz.zzb(zzg(zzhoaVar.zzc().zzc()));
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhnz zzd(zzhgu zzhguVar, zzhey zzheyVar) {
        zzhry zzhryVarZzd = zzhrz.zzd();
        byte[] bArrZzc = zzhguVar.zze().zzc(zzheyVar);
        zzhryVarZzd.zza(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhrz) zzhryVarZzd.zzbu()).zzaM(), zzhta.SYMMETRIC, zzf(zzhguVar.zzf().zzc()), zzhguVar.zzb());
    }

    public static /* synthetic */ zzhgu zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhrz zzhrzVarZzc = zzhrz.zzc(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhrzVarZzc.zza() == 0) {
                return zzhgu.zzd(zzg(zzhnzVar.zzd()), zzibm.zza(zzhrzVarZzc.zzb().zzA(), zzheyVar), zzhnzVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzifh unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzhtx zzf(zzhgy zzhgyVar) throws GeneralSecurityException {
        if (zzhgy.zza.equals(zzhgyVar)) {
            return zzhtx.TINK;
        }
        if (zzhgy.zzb.equals(zzhgyVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhgy.zzc.equals(zzhgyVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhgyVar.toString()));
    }

    private static zzhgy zzg(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhgy.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhgy.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return zzhgy.zzb;
    }
}
