package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzfh extends zzqm implements zzrr {
    private static final zzfh zzb;
    private int zzd;
    private zzff zze;
    private zzlj zzf;
    private int zzg;

    static {
        zzfh zzfhVar = new zzfh();
        zzb = zzfhVar;
        zzqm.zzz(zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003᠌\u0002\u0004ဉ\u0001", new Object[]{"zzd", "zze", "zzg", zzig.zza, "zzf"});
        }
        if (i10 == 3) {
            return new zzfh();
        }
        zzfg zzfgVar = null;
        if (i10 == 4) {
            return new zzfb(zzfgVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
