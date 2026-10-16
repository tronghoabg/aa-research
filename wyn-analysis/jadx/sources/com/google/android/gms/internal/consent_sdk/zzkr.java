package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzkr extends zzqm implements zzrr {
    private static final zzkr zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private boolean zzg;

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzqm.zzz(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzkm.class, zzkq.class});
        }
        if (i10 == 3) {
            return new zzkr();
        }
        zzkz zzkzVar = null;
        if (i10 == 4) {
            return new zzkk(zzkzVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
