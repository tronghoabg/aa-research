package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes3.dex */
public final class zzhyc {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzibk zzc;
    private static final zzhnl zzd;
    private static final zzhni zze;
    private static final zzhmh zzf;
    private static final zzhme zzg;
    private static final zzhmh zzh;
    private static final zzhme zzi;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzb = zzibkVarZza;
        zzibk zzibkVarZza2 = zzhok.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        zzc = zzibkVarZza2;
        zzd = zzhnl.zzd(zzhyb.zza, zzhvf.class, zzhoa.class);
        zze = zzhni.zzd(zzhxw.zza, zzibkVarZza, zzhoa.class);
        zzf = zzhmh.zzd(zzhxx.zza, zzhvj.class, zzhnz.class);
        zzg = zzhme.zzd(zzhxy.zza, zzibkVarZza2, zzhnz.class);
        zzh = zzhmh.zzd(zzhxz.zza, zzhvh.class, zzhnz.class);
        zzi = zzhme.zzd(zzhya.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzd);
        zzhneVar.zze(zze);
        zzhneVar.zzb(zzf);
        zzhneVar.zzc(zzg);
        zzhneVar.zzb(zzh);
        zzhneVar.zzc(zzi);
    }

    public static /* synthetic */ zzhoa zzb(zzhvf zzhvfVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzhsc zzhscVarZzc = zzhsd.zzc();
        zzhscVarZzc.zza(zzl(zzhvfVar));
        zzhtdVarZze.zzb(((zzhsd) zzhscVarZzc.zzbu()).zzaM());
        zzhtdVarZze.zzc(zzh(zzhvfVar.zzf()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhvf zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhsd zzhsdVarZzb = zzhsd.zzb(zzhoaVar.zzc().zzb(), zzidz.zzb());
            zzhva zzhvaVarZzb = zzhvf.zzb();
            zzhvaVarZzb.zzc(zzi(zzhsdVarZzb.zza().zza()));
            zzhvaVarZzb.zza(zzo(zzhsdVarZzb.zza().zzh()));
            zzhvaVarZzb.zzb(zzn(zzhsdVarZzb.zza().zzg()));
            zzhvaVarZzb.zzd(zzj(zzhoaVar.zzc().zzc()));
            return zzhvaVarZzb.zze();
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhvj zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhnzVar.zzg())));
        }
        try {
            zzhsj zzhsjVarZze = zzhsj.zze(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhsjVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhva zzhvaVarZzb = zzhvf.zzb();
            zzhvaVarZzb.zzc(zzi(zzhsjVarZze.zzb().zza()));
            zzhvaVarZzb.zza(zzo(zzhsjVarZze.zzb().zzh()));
            zzhvaVarZzb.zzb(zzn(zzhsjVarZze.zzb().zzg()));
            zzhvaVarZzb.zzd(zzj(zzhnzVar.zzd()));
            zzhvf zzhvfVarZze = zzhvaVarZzb.zze();
            zzhvi zzhviVarZzc = zzhvj.zzc();
            zzhviVarZzc.zza(zzhvfVarZze);
            zzhviVarZzc.zzb(new ECPoint(new BigInteger(1, zzhsjVarZze.zzc().zzA()), new BigInteger(1, zzhsjVarZze.zzd().zzA())));
            zzhviVarZzc.zzc(zzhnzVar.zze());
            return zzhviVarZzc.zzd();
        } catch (zzifh | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static /* synthetic */ zzhnz zzf(zzhvh zzhvhVar, zzhey zzheyVar) throws GeneralSecurityException {
        int iZzk = zzk(zzhvhVar.zzd().zzd());
        zzhsg zzhsgVarZze = zzhsh.zze();
        zzhsgVarZze.zza(zzm(zzhvhVar.zze()));
        byte[] bArrZzb = zzhlh.zzb(zzhvhVar.zzf().zzb(zzheyVar), iZzk);
        zzidl zzidlVar = zzidl.zza;
        zzhsgVarZze.zzb(zzidl.zzt(bArrZzb, 0, bArrZzb.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((zzhsh) zzhsgVarZze.zzbu()).zzaM(), zzhta.ASYMMETRIC_PRIVATE, zzh(zzhvhVar.zzd().zzf()), zzhvhVar.zze().zzb());
    }

    public static /* synthetic */ zzhvh zzg(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhnzVar.zzg())));
        }
        try {
            zzhsh zzhshVarZzd = zzhsh.zzd(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhshVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhsj zzhsjVarZzb = zzhshVarZzd.zzb();
            if (zzhsjVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhva zzhvaVarZzb = zzhvf.zzb();
            zzhvaVarZzb.zzc(zzi(zzhsjVarZzb.zzb().zza()));
            zzhvaVarZzb.zza(zzo(zzhsjVarZzb.zzb().zzh()));
            zzhvaVarZzb.zzb(zzn(zzhsjVarZzb.zzb().zzg()));
            zzhvaVarZzb.zzd(zzj(zzhnzVar.zzd()));
            zzhvf zzhvfVarZze = zzhvaVarZzb.zze();
            zzhvi zzhviVarZzc = zzhvj.zzc();
            zzhviVarZzc.zza(zzhvfVarZze);
            zzhviVarZzc.zzb(new ECPoint(new BigInteger(1, zzhsjVarZzb.zzc().zzA()), new BigInteger(1, zzhsjVarZzb.zzd().zzA())));
            zzhviVarZzc.zzc(zzhnzVar.zze());
            zzhvj zzhvjVarZzd = zzhviVarZzc.zzd();
            zzhvg zzhvgVarZzc = zzhvh.zzc();
            zzhvgVarZzc.zza(zzhvjVarZzd);
            zzhvgVarZzc.zzb(zzibl.zza(new BigInteger(1, zzhshVarZzd.zzc().zzA()), zzheyVar));
            return zzhvgVarZzc.zzc();
        } catch (zzifh | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static zzhtx zzh(zzhve zzhveVar) throws GeneralSecurityException {
        if (zzhve.zza.equals(zzhveVar)) {
            return zzhtx.TINK;
        }
        if (zzhve.zzb.equals(zzhveVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhve.zzd.equals(zzhveVar)) {
            return zzhtx.RAW;
        }
        if (zzhve.zzc.equals(zzhveVar)) {
            return zzhtx.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhveVar.toString()));
    }

    private static zzhvc zzi(zzhss zzhssVar) throws GeneralSecurityException {
        int iOrdinal = zzhssVar.ordinal();
        if (iOrdinal == 2) {
            return zzhvc.zzb;
        }
        if (iOrdinal == 3) {
            return zzhvc.zza;
        }
        if (iOrdinal == 4) {
            return zzhvc.zzc;
        }
        int iZza = zzhssVar.zza();
        throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iZza).length() + 26)));
    }

    private static zzhve zzj(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhve.zza;
        }
        if (iOrdinal == 2) {
            return zzhve.zzc;
        }
        if (iOrdinal == 3) {
            return zzhve.zzd;
        }
        if (iOrdinal == 4) {
            return zzhve.zzb;
        }
        int iZza = zzhtxVar.zza();
        throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }

    private static int zzk(zzhvb zzhvbVar) throws GeneralSecurityException {
        if (zzhvb.zza.equals(zzhvbVar)) {
            return 33;
        }
        if (zzhvb.zzb.equals(zzhvbVar)) {
            return 49;
        }
        if (zzhvb.zzc.equals(zzhvbVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhvbVar.toString()));
    }

    private static zzhsf zzl(zzhvf zzhvfVar) throws GeneralSecurityException {
        zzhss zzhssVar;
        int i5;
        zzhse zzhseVarZzb = zzhsf.zzb();
        zzhvc zzhvcVarZze = zzhvfVar.zze();
        if (zzhvc.zza.equals(zzhvcVarZze)) {
            zzhssVar = zzhss.SHA256;
        } else if (zzhvc.zzb.equals(zzhvcVarZze)) {
            zzhssVar = zzhss.SHA384;
        } else {
            if (!zzhvc.zzc.equals(zzhvcVarZze)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zzhvcVarZze.toString()));
            }
            zzhssVar = zzhss.SHA512;
        }
        zzhseVarZzb.zza(zzhssVar);
        zzhvb zzhvbVarZzd = zzhvfVar.zzd();
        int i10 = 4;
        if (zzhvb.zza.equals(zzhvbVarZzd)) {
            i5 = 4;
        } else if (zzhvb.zzb.equals(zzhvbVarZzd)) {
            i5 = 5;
        } else {
            if (!zzhvb.zzc.equals(zzhvbVarZzd)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhvbVarZzd.toString()));
            }
            i5 = 6;
        }
        zzhseVarZzb.zzb(i5);
        zzhvd zzhvdVarZzc = zzhvfVar.zzc();
        if (zzhvd.zza.equals(zzhvdVarZzc)) {
            i10 = 3;
        } else if (!zzhvd.zzb.equals(zzhvdVarZzc)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzhvdVarZzc.toString()));
        }
        zzhseVarZzb.zzc(i10);
        return (zzhsf) zzhseVarZzb.zzbu();
    }

    private static zzhsj zzm(zzhvj zzhvjVar) throws GeneralSecurityException {
        int iZzk = zzk(zzhvjVar.zzf().zzd());
        ECPoint eCPointZzd = zzhvjVar.zzd();
        zzhsi zzhsiVarZzg = zzhsj.zzg();
        zzhsiVarZzg.zza(zzl(zzhvjVar.zzf()));
        byte[] bArrZzb = zzhlh.zzb(eCPointZzd.getAffineX(), iZzk);
        zzidl zzidlVar = zzidl.zza;
        zzhsiVarZzg.zzb(zzidl.zzt(bArrZzb, 0, bArrZzb.length));
        byte[] bArrZzb2 = zzhlh.zzb(eCPointZzd.getAffineY(), iZzk);
        zzhsiVarZzg.zzc(zzidl.zzt(bArrZzb2, 0, bArrZzb2.length));
        return (zzhsj) zzhsiVarZzg.zzbu();
    }

    private static zzhvb zzn(int i5) throws GeneralSecurityException {
        int i10 = i5 - 2;
        if (i10 == 2) {
            return zzhvb.zza;
        }
        if (i10 == 3) {
            return zzhvb.zzb;
        }
        if (i10 == 4) {
            return zzhvb.zzc;
        }
        int iZza = zzhsr.zza(i5);
        throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(iZza).length() + 35)));
    }

    private static zzhvd zzo(int i5) throws GeneralSecurityException {
        int i10 = i5 - 2;
        if (i10 == 1) {
            return zzhvd.zza;
        }
        if (i10 == 2) {
            return zzhvd.zzb;
        }
        int iZza = zzhsk.zza(i5);
        throw new GeneralSecurityException(N0.a.d(iZza, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(iZza).length() + 40)));
    }
}
