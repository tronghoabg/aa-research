package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzgy extends zzqm implements zzrr {
    private static final zzgy zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzgy zzgyVar = new zzgy();
        zzb = zzgyVar;
        zzqm.zzz(zzgy.class, zzgyVar);
    }

    private zzgy() {
    }

    public static zzgx zza() {
        return (zzgx) zzb.zzp();
    }

    public static /* synthetic */ void zzd(zzgy zzgyVar, String str) {
        zzgyVar.zzd |= 2;
        zzgyVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzgy zzgyVar, long j8) {
        zzgyVar.zzd |= 4;
        zzgyVar.zzg = j8;
    }

    public static /* synthetic */ void zzf(zzgy zzgyVar, int i5) {
        zzgyVar.zze = i5 - 2;
        zzgyVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzgy();
        }
        zzhb zzhbVar = null;
        if (i10 == 4) {
            return new zzgx(zzhbVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
