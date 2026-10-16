package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhqf {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhlv zzc;
    private static final zzhlv zzd;
    private static final zzhnl zze;
    private static final zzhni zzf;
    private static final zzhmh zzg;
    private static final zzhme zzh;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzibkVarZza;
        zzhlu zzhluVarZza = zzhlv.zza();
        zzhluVarZza.zza(zzhtx.RAW, zzhpf.zzd);
        zzhluVarZza.zza(zzhtx.TINK, zzhpf.zza);
        zzhluVarZza.zza(zzhtx.LEGACY, zzhpf.zzc);
        zzhluVarZza.zza(zzhtx.CRUNCHY, zzhpf.zzb);
        zzc = zzhluVarZza.zzb();
        zzhlu zzhluVarZza2 = zzhlv.zza();
        zzhluVarZza2.zza(zzhss.SHA1, zzhpe.zza);
        zzhluVarZza2.zza(zzhss.SHA224, zzhpe.zzb);
        zzhluVarZza2.zza(zzhss.SHA256, zzhpe.zzc);
        zzhluVarZza2.zza(zzhss.SHA384, zzhpe.zzd);
        zzhluVarZza2.zza(zzhss.SHA512, zzhpe.zze);
        zzd = zzhluVarZza2.zzb();
        zze = zzhnl.zzd(zzhqe.zza, zzhpg.class, zzhoa.class);
        zzf = zzhni.zzd(zzhqb.zza, zzibkVarZza, zzhoa.class);
        zzg = zzhmh.zzd(zzhqc.zza, zzhox.class, zzhnz.class);
        zzh = zzhme.zzd(zzhqd.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zze);
        zzhneVar.zze(zzf);
        zzhneVar.zzb(zzg);
        zzhneVar.zzc(zzh);
    }

    public static /* synthetic */ zzhoa zzb(zzhpg zzhpgVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhsv zzhsvVarZze = zzhsw.zze();
        zzhsvVarZze.zza(zzf(zzhpgVar));
        zzhsvVarZze.zzb(zzhpgVar.zzc());
        zzhtdVarZze.zzb(((zzhsw) zzhsvVarZze.zzbu()).zzaM());
        zzhtdVarZze.zzc((zzhtx) zzc.zzb(zzhpgVar.zzf()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    public static /* synthetic */ zzhpg zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhoaVar.zzc().zza())));
        }
        try {
            zzhsw zzhswVarZzd = zzhsw.zzd(zzhoaVar.zzc().zzb(), zzidz.zzb());
            if (zzhswVarZzd.zzc() != 0) {
                int iZzc = zzhswVarZzd.zzc();
                throw new GeneralSecurityException(N0.a.d(iZzc, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(iZzc).length() + 47)));
            }
            zzhpd zzhpdVarZzb = zzhpg.zzb();
            zzhpdVarZzb.zza(zzhswVarZzd.zzb());
            zzhpdVarZzb.zzb(zzhswVarZzd.zza().zzb());
            zzhpdVarZzb.zzd((zzhpe) zzd.zzc(zzhswVarZzd.zza().zza()));
            zzhpdVarZzb.zzc((zzhpf) zzc.zzc(zzhoaVar.zzc().zzc()));
            return zzhpdVarZzb.zze();
        } catch (zzifh e7) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzhnz zzd(zzhox zzhoxVar, zzhey zzheyVar) {
        zzhst zzhstVarZze = zzhsu.zze();
        zzhstVarZze.zza(zzf(zzhoxVar.zzf()));
        byte[] bArrZzc = zzhoxVar.zzd().zzc(zzheyVar);
        zzhstVarZze.zzb(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhsu) zzhstVarZze.zzbu()).zzaM(), zzhta.SYMMETRIC, (zzhtx) zzc.zzb(zzhoxVar.zzf().zzf()), zzhoxVar.zzb());
    }

    public static /* synthetic */ zzhox zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhsu zzhsuVarZzd = zzhsu.zzd(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhsuVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhpd zzhpdVarZzb = zzhpg.zzb();
            zzhpdVarZzb.zza(zzhsuVarZzd.zzc().zzb());
            zzhpdVarZzb.zzb(zzhsuVarZzd.zzb().zzb());
            zzhpdVarZzb.zzd((zzhpe) zzd.zzc(zzhsuVarZzd.zzb().zza()));
            zzhpdVarZzb.zzc((zzhpf) zzc.zzc(zzhnzVar.zzd()));
            zzhpg zzhpgVarZze = zzhpdVarZzb.zze();
            zzhow zzhowVarZzc = zzhox.zzc();
            zzhowVarZzc.zza(zzhpgVarZze);
            zzhowVarZzc.zzb(zzibm.zza(zzhsuVarZzd.zzc().zzA(), zzheyVar));
            zzhowVarZzc.zzc(zzhnzVar.zze());
            return zzhowVarZzc.zzd();
        } catch (zzifh | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhsy zzf(zzhpg zzhpgVar) throws GeneralSecurityException {
        zzhsx zzhsxVarZzc = zzhsy.zzc();
        zzhsxVarZzc.zzb(zzhpgVar.zzd());
        zzhsxVarZzc.zza((zzhss) zzd.zzb(zzhpgVar.zzg()));
        return (zzhsy) zzhsxVarZzc.zzbu();
    }
}
