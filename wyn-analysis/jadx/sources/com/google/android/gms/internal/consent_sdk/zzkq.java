package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzkq extends zzqm implements zzrr {
    private static final zzkq zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzkq zzkqVar = new zzkq();
        zzb = zzkqVar;
        zzqm.zzz(zzkq.class, zzkqVar);
    }

    private zzkq() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzkp.zza, "zzf", zzkn.zza});
        }
        if (i10 == 3) {
            return new zzkq();
        }
        zzkz zzkzVar = null;
        if (i10 == 4) {
            return new zzko(zzkzVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
