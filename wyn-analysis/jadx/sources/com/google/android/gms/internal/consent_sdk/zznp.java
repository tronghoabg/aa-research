package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zznp extends zzqm implements zzrr {
    private static final zznp zzb;
    private int zzd;
    private zznl zze;
    private zznn zzf;
    private zznh zzg;
    private int zzh;

    static {
        zznp zznpVar = new zznp();
        zzb = zznpVar;
        zzqm.zzz(zznp.class, zznpVar);
    }

    private zznp() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000\u0005᠌\u0003", new Object[]{"zzd", "zzf", "zzg", "zze", "zzh", zzoy.zza()});
        }
        if (i10 == 3) {
            return new zznp();
        }
        zzno zznoVar = null;
        if (i10 == 4) {
            return new zznc(zznoVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
