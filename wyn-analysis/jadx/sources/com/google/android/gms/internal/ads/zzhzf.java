package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhzf {
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
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zzibkVarZza;
        zzibk zzibkVarZza2 = zzhok.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zzibkVarZza2;
        zzd = zzhnl.zzd(zzhze.zza, zzhxj.class, zzhoa.class);
        zze = zzhni.zzd(zzhyz.zza, zzibkVarZza, zzhoa.class);
        zzf = zzhmh.zzd(zzhza.zza, zzhxn.class, zzhnz.class);
        zzg = zzhme.zzd(zzhzb.zza, zzibkVarZza2, zzhnz.class);
        zzh = zzhmh.zzd(zzhzc.zza, zzhxl.class, zzhnz.class);
        zzi = zzhme.zzd(zzhzd.zza, zzibkVarZza, zzhnz.class);
        zzhlu zzhluVarZza = zzhlv.zza();
        zzhluVarZza.zza(zzhtx.RAW, zzhxi.zzd);
        zzhluVarZza.zza(zzhtx.TINK, zzhxi.zza);
        zzhluVarZza.zza(zzhtx.CRUNCHY, zzhxi.zzb);
        zzhluVarZza.zza(zzhtx.LEGACY, zzhxi.zzc);
        zzj = zzhluVarZza.zzb();
        zzhlu zzhluVarZza2 = zzhlv.zza();
        zzhluVarZza2.zza(zzhss.SHA256, zzhxh.zza);
        zzhluVarZza2.zza(zzhss.SHA384, zzhxh.zzb);
        zzhluVarZza2.zza(zzhss.SHA512, zzhxh.zzc);
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

    public static /* synthetic */ zzhoa zzb(zzhxj zzhxjVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzhui zzhuiVarZze = zzhuj.zze();
        zzhuiVarZze.zza(zzh(zzhxjVar));
        zzhuiVarZze.zzb(zzhxjVar.zzc());
        byte[] bArrZza = zzhlh.zza(zzhxjVar.zzd());
        zzidl zzidlVar = zzidl.zza;
        zzhuiVarZze.zzc(zzidl.zzt(bArrZza, 0, bArrZza.length));
        zzhtdVarZze.zzb(((zzhuj) zzhuiVarZze.zzbu()).zzaM());
        zzhtdVarZze.zzc((zzhtx) zzj.zzb(zzhxjVar.zze()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhxj zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhuj zzhujVarZzd = zzhuj.zzd(zzhoaVar.zzc().zzb(), zzidz.zzb());
            zzhxg zzhxgVarZzb = zzhxj.zzb();
            zzhlv zzhlvVar = zzk;
            zzhxgVarZzb.zzd((zzhxh) zzhlvVar.zzc(zzhujVarZzd.zza().zza()));
            zzhxgVarZzb.zze((zzhxh) zzhlvVar.zzc(zzhujVarZzd.zza().zzb()));
            zzhxgVarZzb.zzb(new BigInteger(1, zzhujVarZzd.zzc().zzA()));
            zzhxgVarZzb.zza(zzhujVarZzd.zzb());
            zzhxgVarZzb.zzf(zzhujVarZzd.zza().zzc());
            zzhxgVarZzb.zzc((zzhxi) zzj.zzc(zzhoaVar.zzc().zzc()));
            return zzhxgVarZzb.zzg();
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhxn zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhnzVar.zzg())));
        }
        try {
            zzhup zzhupVarZze = zzhup.zze(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhupVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhupVarZze.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            zzhxg zzhxgVarZzb = zzhxj.zzb();
            zzhlv zzhlvVar = zzk;
            zzhxgVarZzb.zzd((zzhxh) zzhlvVar.zzc(zzhupVarZze.zzb().zza()));
            zzhxgVarZzb.zze((zzhxh) zzhlvVar.zzc(zzhupVarZze.zzb().zzb()));
            zzhxgVarZzb.zzb(new BigInteger(1, zzhupVarZze.zzd().zzA()));
            zzhxgVarZzb.zza(iBitLength);
            zzhxgVarZzb.zzf(zzhupVarZze.zzb().zzc());
            zzhxgVarZzb.zzc((zzhxi) zzj.zzc(zzhnzVar.zzd()));
            zzhxj zzhxjVarZzg = zzhxgVarZzb.zzg();
            zzhxm zzhxmVarZzc = zzhxn.zzc();
            zzhxmVarZzc.zza(zzhxjVarZzg);
            zzhxmVarZzc.zzb(bigInteger);
            zzhxmVarZzc.zzc(zzhnzVar.zze());
            return zzhxmVarZzc.zzd();
        } catch (zzifh | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static /* synthetic */ zzhnz zzf(zzhxl zzhxlVar, zzhey zzheyVar) {
        zzhum zzhumVarZzk = zzhun.zzk();
        zzhumVarZzk.zza(0);
        zzhumVarZzk.zzb(zzi(zzhxlVar.zze()));
        byte[] bArrZza = zzhlh.zza(zzhxlVar.zzi().zzb(zzheyVar));
        zzidl zzidlVar = zzidl.zza;
        zzhumVarZzk.zzc(zzidl.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhlh.zza(zzhxlVar.zzf().zzb(zzheyVar));
        zzhumVarZzk.zzd(zzidl.zzt(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhlh.zza(zzhxlVar.zzh().zzb(zzheyVar));
        zzhumVarZzk.zze(zzidl.zzt(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhlh.zza(zzhxlVar.zzj().zzb(zzheyVar));
        zzhumVarZzk.zzf(zzidl.zzt(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhlh.zza(zzhxlVar.zzk().zzb(zzheyVar));
        zzhumVarZzk.zzg(zzidl.zzt(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhlh.zza(zzhxlVar.zzl().zzb(zzheyVar));
        zzhumVarZzk.zzh(zzidl.zzt(bArrZza6, 0, bArrZza6.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzhun) zzhumVarZzk.zzbu()).zzaM(), zzhta.ASYMMETRIC_PRIVATE, (zzhtx) zzj.zzb(zzhxlVar.zzd().zze()), zzhxlVar.zze().zzb());
    }

    public static /* synthetic */ zzhxl zzg(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhnzVar.zzg())));
        }
        try {
            zzhun zzhunVarZzj = zzhun.zzj(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhunVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhup zzhupVarZzb = zzhunVarZzj.zzb();
            if (zzhupVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhupVarZzb.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhupVarZzb.zzd().zzA());
            zzhxg zzhxgVarZzb = zzhxj.zzb();
            zzhlv zzhlvVar = zzk;
            zzhxgVarZzb.zzd((zzhxh) zzhlvVar.zzc(zzhupVarZzb.zzb().zza()));
            zzhxgVarZzb.zze((zzhxh) zzhlvVar.zzc(zzhupVarZzb.zzb().zzb()));
            zzhxgVarZzb.zzb(bigInteger2);
            zzhxgVarZzb.zza(iBitLength);
            zzhxgVarZzb.zzf(zzhupVarZzb.zzb().zzc());
            zzhxgVarZzb.zzc((zzhxi) zzj.zzc(zzhnzVar.zzd()));
            zzhxj zzhxjVarZzg = zzhxgVarZzb.zzg();
            zzhxm zzhxmVarZzc = zzhxn.zzc();
            zzhxmVarZzc.zza(zzhxjVarZzg);
            zzhxmVarZzc.zzb(bigInteger);
            zzhxmVarZzc.zzc(zzhnzVar.zze());
            zzhxn zzhxnVarZzd = zzhxmVarZzc.zzd();
            zzhxk zzhxkVarZzc = zzhxl.zzc();
            zzhxkVarZzc.zza(zzhxnVarZzd);
            zzhxkVarZzc.zzb(zzj(zzhunVarZzj.zzd(), zzheyVar), zzj(zzhunVarZzj.zze(), zzheyVar));
            zzhxkVarZzc.zzc(zzj(zzhunVarZzj.zzc(), zzheyVar));
            zzhxkVarZzc.zzd(zzj(zzhunVarZzj.zzg(), zzheyVar), zzj(zzhunVarZzj.zzh(), zzheyVar));
            zzhxkVarZzc.zze(zzj(zzhunVarZzj.zzi(), zzheyVar));
            return zzhxkVarZzc.zzf();
        } catch (zzifh | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static zzhul zzh(zzhxj zzhxjVar) throws GeneralSecurityException {
        zzhuk zzhukVarZzd = zzhul.zzd();
        zzhlv zzhlvVar = zzk;
        zzhukVarZzd.zza((zzhss) zzhlvVar.zzb(zzhxjVar.zzf()));
        zzhukVarZzd.zzb((zzhss) zzhlvVar.zzb(zzhxjVar.zzg()));
        zzhukVarZzd.zzc(zzhxjVar.zzh());
        return (zzhul) zzhukVarZzd.zzbu();
    }

    private static zzhup zzi(zzhxn zzhxnVar) throws GeneralSecurityException {
        zzhuo zzhuoVarZzg = zzhup.zzg();
        zzhuoVarZzg.zzb(zzh(zzhxnVar.zzf()));
        byte[] bArrZza = zzhlh.zza(zzhxnVar.zzd());
        zzidl zzidlVar = zzidl.zza;
        zzhuoVarZzg.zzc(zzidl.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhlh.zza(zzhxnVar.zzf().zzd());
        zzhuoVarZzg.zzd(zzidl.zzt(bArrZza2, 0, bArrZza2.length));
        zzhuoVarZzg.zza(0);
        return (zzhup) zzhuoVarZzg.zzbu();
    }

    private static zzibl zzj(zzidl zzidlVar, zzhey zzheyVar) {
        return zzibl.zza(new BigInteger(1, zzidlVar.zzA()), zzheyVar);
    }
}
