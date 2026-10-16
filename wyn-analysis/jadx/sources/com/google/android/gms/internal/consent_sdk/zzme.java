package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzme extends zzqm implements zzrr {
    private static final zzme zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzqq zzi = zzqm.zzs();
    private String zzj = "";
    private zzmc zzk;

    static {
        zzme zzmeVar = new zzme();
        zzb = zzmeVar;
        zzqm.zzz(zzme.class, zzmeVar);
    }

    private zzme() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ࠬ\u0006ဉ\u0005\u0007ለ\u0004", new Object[]{"zzd", "zze", "zzf", zzos.zza(), "zzg", zzow.zza(), "zzh", zzou.zza(), "zzi", zzoq.zza(), "zzk", "zzj"});
        }
        if (i10 == 3) {
            return new zzme();
        }
        zzmd zzmdVar = null;
        if (i10 == 4) {
            return new zzma(zzmdVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
