package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzkc extends zzqm implements zzrr {
    private static final zzkc zzb;
    private int zzd;
    private zzka zze;
    private zzlj zzf;
    private int zzg;

    static {
        zzkc zzkcVar = new zzkc();
        zzb = zzkcVar;
        zzqm.zzz(zzkc.class, zzkcVar);
    }

    private zzkc() {
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
            return new zzkc();
        }
        zzkb zzkbVar = null;
        if (i10 == 4) {
            return new zzjp(zzkbVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
