package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhyl {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzibk zzc;
    private static final zzhnl zzd;
    private static final zzhni zze;
    private static final zzhmh zzf;
    private static final zzhme zzg;
    private static final zzhmh zzh;
    private static final zzhme zzi;
    private static final zzhlv zzj;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zzibkVarZza;
        zzibk zzibkVarZza2 = zzhok.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zzibkVarZza2;
        zzd = zzhnl.zzd(zzhyk.zza, zzhvp.class, zzhoa.class);
        zze = zzhni.zzd(zzhyf.zza, zzibkVarZza, zzhoa.class);
        zzf = zzhmh.zzd(zzhyg.zza, zzhvw.class, zzhnz.class);
        zzg = zzhme.zzd(zzhyh.zza, zzibkVarZza2, zzhnz.class);
        zzh = zzhmh.zzd(zzhyi.zza, zzhvq.class, zzhnz.class);
        zzi = zzhme.zzd(zzhyj.zza, zzibkVarZza, zzhnz.class);
        zzhlu zzhluVarZza = zzhlv.zza();
        zzhluVarZza.zza(zzhtx.RAW, zzhvo.zzd);
        zzhluVarZza.zza(zzhtx.TINK, zzhvo.zza);
        zzhluVarZza.zza(zzhtx.CRUNCHY, zzhvo.zzb);
        zzhluVarZza.zza(zzhtx.LEGACY, zzhvo.zzc);
        zzj = zzhluVarZza.zzb();
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzd);
        zzhneVar.zze(zze);
        zzhneVar.zzb(zzf);
        zzhneVar.zzc(zzg);
        zzhneVar.zzb(zzh);
        zzhneVar.zzc(zzi);
    }

    public static /* synthetic */ zzhoa zzb(zzhvp zzhvpVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzhtdVarZze.zzb(zzhsm.zzc().zzaM());
        zzhtdVarZze.zzc((zzhtx) zzj.zzb(zzhvpVar.zzc()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhvp zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            if (zzhsm.zzb(zzhoaVar.zzc().zzb(), zzidz.zzb()).zza() == 0) {
                return zzhvp.zzb((zzhvo) zzj.zzc(zzhoaVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhvw zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhnzVar.zzg())));
        }
        try {
            zzhsq zzhsqVarZzc = zzhsq.zzc(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhsqVarZzc.zza() == 0) {
                return zzhvw.zzc((zzhvo) zzj.zzc(zzhnzVar.zzd()), zzibk.zza(zzhsqVarZzc.zzb().zzA()), zzhnzVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzifh unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    public static /* synthetic */ zzhnz zzf(zzhvq zzhvqVar, zzhey zzheyVar) {
        zzhsn zzhsnVarZze = zzhso.zze();
        zzhsnVarZze.zzb(zzh(zzhvqVar.zze()));
        byte[] bArrZzc = zzhvqVar.zzf().zzc(zzheyVar);
        zzhsnVarZze.zza(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((zzhso) zzhsnVarZze.zzbu()).zzaM(), zzhta.ASYMMETRIC_PRIVATE, (zzhtx) zzj.zzb(zzhvqVar.zzd().zzc()), zzhvqVar.zze().zzb());
    }

    public static /* synthetic */ zzhvq zzg(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhnzVar.zzg())));
        }
        try {
            zzhso zzhsoVarZzd = zzhso.zzd(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhsoVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhsq zzhsqVarZzc = zzhsoVarZzd.zzc();
            if (zzhsqVarZzc.zza() == 0) {
                return zzhvq.zzc(zzhvw.zzc((zzhvo) zzj.zzc(zzhnzVar.zzd()), zzibk.zza(zzhsqVarZzc.zzb().zzA()), zzhnzVar.zze()), zzibm.zza(zzhsoVarZzd.zzb().zzA(), zzheyVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzifh unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static zzhsq zzh(zzhvw zzhvwVar) {
        zzhsp zzhspVarZzd = zzhsq.zzd();
        byte[] bArrZzc = zzhvwVar.zzd().zzc();
        zzhspVarZzd.zza(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        return (zzhsq) zzhspVarZzd.zzbu();
    }
}
