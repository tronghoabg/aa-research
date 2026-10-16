package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhyw {
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
    private static final zzhlv zzk;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zzibkVarZza;
        zzibk zzibkVarZza2 = zzhok.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zzibkVarZza2;
        zzd = zzhnl.zzd(zzhyv.zza, zzhwx.class, zzhoa.class);
        zze = zzhni.zzd(zzhyq.zza, zzibkVarZza, zzhoa.class);
        zzf = zzhmh.zzd(zzhyr.zza, zzhxb.class, zzhnz.class);
        zzg = zzhme.zzd(zzhys.zza, zzibkVarZza2, zzhnz.class);
        zzh = zzhmh.zzd(zzhyt.zza, zzhwz.class, zzhnz.class);
        zzi = zzhme.zzd(zzhyu.zza, zzibkVarZza, zzhnz.class);
        zzhlu zzhluVarZza = zzhlv.zza();
        zzhluVarZza.zza(zzhtx.RAW, zzhww.zzd);
        zzhluVarZza.zza(zzhtx.TINK, zzhww.zza);
        zzhluVarZza.zza(zzhtx.CRUNCHY, zzhww.zzb);
        zzhluVarZza.zza(zzhtx.LEGACY, zzhww.zzc);
        zzj = zzhluVarZza.zzb();
        zzhlu zzhluVarZza2 = zzhlv.zza();
        zzhluVarZza2.zza(zzhss.SHA256, zzhwv.zza);
        zzhluVarZza2.zza(zzhss.SHA384, zzhwv.zzb);
        zzhluVarZza2.zza(zzhss.SHA512, zzhwv.zzc);
        zzk = zzhluVarZza2.zzb();
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzd);
        zzhneVar.zze(zze);
        zzhneVar.zzb(zzf);
        zzhneVar.zzc(zzg);
        zzhneVar.zzb(zzh);
        zzhneVar.zzc(zzi);
    }

    public static /* synthetic */ zzhoa zzb(zzhwx zzhwxVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzhua zzhuaVarZze = zzhub.zze();
        zzhuaVarZze.zza(zzh(zzhwxVar));
        zzhuaVarZze.zzb(zzhwxVar.zzc());
        byte[] bArrZza = zzhlh.zza(zzhwxVar.zzd());
        zzidl zzidlVar = zzidl.zza;
        zzhuaVarZze.zzc(zzidl.zzt(bArrZza, 0, bArrZza.length));
        zzhtdVarZze.zzb(((zzhub) zzhuaVarZze.zzbu()).zzaM());
        zzhtdVarZze.zzc((zzhtx) zzj.zzb(zzhwxVar.zze()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhwx zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhub zzhubVarZzd = zzhub.zzd(zzhoaVar.zzc().zzb(), zzidz.zzb());
            zzhwu zzhwuVarZzb = zzhwx.zzb();
            zzhwuVarZzb.zzd((zzhwv) zzk.zzc(zzhubVarZzd.zza().zza()));
            zzhwuVarZzb.zzb(new BigInteger(1, zzhubVarZzd.zzc().zzA()));
            zzhwuVarZzb.zza(zzhubVarZzd.zzb());
            zzhwuVarZzb.zzc((zzhww) zzj.zzc(zzhoaVar.zzc().zzc()));
            return zzhwuVarZzb.zze();
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhxb zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhnzVar.zzg())));
        }
        try {
            zzhuh zzhuhVarZze = zzhuh.zze(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhuhVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhuhVarZze.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            zzhwu zzhwuVarZzb = zzhwx.zzb();
            zzhwuVarZzb.zzd((zzhwv) zzk.zzc(zzhuhVarZze.zzb().zza()));
            zzhwuVarZzb.zzb(new BigInteger(1, zzhuhVarZze.zzd().zzA()));
            zzhwuVarZzb.zza(iBitLength);
            zzhwuVarZzb.zzc((zzhww) zzj.zzc(zzhnzVar.zzd()));
            zzhwx zzhwxVarZze = zzhwuVarZzb.zze();
            zzhxa zzhxaVarZzc = zzhxb.zzc();
            zzhxaVarZzc.zza(zzhwxVarZze);
            zzhxaVarZzc.zzb(bigInteger);
            zzhxaVarZzc.zzc(zzhnzVar.zze());
            return zzhxaVarZzc.zzd();
        } catch (zzifh | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static /* synthetic */ zzhnz zzf(zzhwz zzhwzVar, zzhey zzheyVar) {
        zzhue zzhueVarZzk = zzhuf.zzk();
        zzhueVarZzk.zza(0);
        zzhueVarZzk.zzb(zzi(zzhwzVar.zze()));
        byte[] bArrZza = zzhlh.zza(zzhwzVar.zzi().zzb(zzheyVar));
        zzidl zzidlVar = zzidl.zza;
        zzhueVarZzk.zzc(zzidl.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhlh.zza(zzhwzVar.zzf().zzb(zzheyVar));
        zzhueVarZzk.zzd(zzidl.zzt(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhlh.zza(zzhwzVar.zzh().zzb(zzheyVar));
        zzhueVarZzk.zze(zzidl.zzt(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhlh.zza(zzhwzVar.zzj().zzb(zzheyVar));
        zzhueVarZzk.zzf(zzidl.zzt(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhlh.zza(zzhwzVar.zzk().zzb(zzheyVar));
        zzhueVarZzk.zzg(zzidl.zzt(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhlh.zza(zzhwzVar.zzl().zzb(zzheyVar));
        zzhueVarZzk.zzh(zzidl.zzt(bArrZza6, 0, bArrZza6.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzhuf) zzhueVarZzk.zzbu()).zzaM(), zzhta.ASYMMETRIC_PRIVATE, (zzhtx) zzj.zzb(zzhwzVar.zzd().zze()), zzhwzVar.zze().zzb());
    }

    public static /* synthetic */ zzhwz zzg(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhnzVar.zzg())));
        }
        try {
            zzhuf zzhufVarZzj = zzhuf.zzj(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhufVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhuh zzhuhVarZzb = zzhufVarZzj.zzb();
            if (zzhuhVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhuhVarZzb.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhuhVarZzb.zzd().zzA());
            zzhwu zzhwuVarZzb = zzhwx.zzb();
            zzhwuVarZzb.zzd((zzhwv) zzk.zzc(zzhuhVarZzb.zzb().zza()));
            zzhwuVarZzb.zzb(bigInteger2);
            zzhwuVarZzb.zza(iBitLength);
            zzhwuVarZzb.zzc((zzhww) zzj.zzc(zzhnzVar.zzd()));
            zzhwx zzhwxVarZze = zzhwuVarZzb.zze();
            zzhxa zzhxaVarZzc = zzhxb.zzc();
            zzhxaVarZzc.zza(zzhwxVarZze);
            zzhxaVarZzc.zzb(bigInteger);
            zzhxaVarZzc.zzc(zzhnzVar.zze());
            zzhxb zzhxbVarZzd = zzhxaVarZzc.zzd();
            zzhwy zzhwyVarZzc = zzhwz.zzc();
            zzhwyVarZzc.zza(zzhxbVarZzd);
            zzhwyVarZzc.zzb(zzj(zzhufVarZzj.zzd(), zzheyVar), zzj(zzhufVarZzj.zze(), zzheyVar));
            zzhwyVarZzc.zzc(zzj(zzhufVarZzj.zzc(), zzheyVar));
            zzhwyVarZzc.zzd(zzj(zzhufVarZzj.zzg(), zzheyVar), zzj(zzhufVarZzj.zzh(), zzheyVar));
            zzhwyVarZzc.zze(zzj(zzhufVarZzj.zzi(), zzheyVar));
            return zzhwyVarZzc.zzf();
        } catch (zzifh | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static zzhud zzh(zzhwx zzhwxVar) throws GeneralSecurityException {
        zzhuc zzhucVarZzb = zzhud.zzb();
        zzhucVarZzb.zza((zzhss) zzk.zzb(zzhwxVar.zzf()));
        return (zzhud) zzhucVarZzb.zzbu();
    }

    private static zzhuh zzi(zzhxb zzhxbVar) throws GeneralSecurityException {
        zzhug zzhugVarZzg = zzhuh.zzg();
        zzhugVarZzg.zza(zzh(zzhxbVar.zzf()));
        byte[] bArrZza = zzhlh.zza(zzhxbVar.zzd());
        zzidl zzidlVar = zzidl.zza;
        zzhugVarZzg.zzb(zzidl.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhlh.zza(zzhxbVar.zzf().zzd());
        zzhugVarZzg.zzc(zzidl.zzt(bArrZza2, 0, bArrZza2.length));
        return (zzhuh) zzhugVarZzg.zzbu();
    }

    private static zzibl zzj(zzidl zzidlVar, zzhey zzheyVar) {
        return zzibl.zza(new BigInteger(1, zzidlVar.zzA()), zzheyVar);
    }
}
