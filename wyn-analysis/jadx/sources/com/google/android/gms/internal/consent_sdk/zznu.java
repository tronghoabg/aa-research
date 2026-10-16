package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zznu extends zzqm implements zzrr {
    private static final zznu zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zznu zznuVar = new zznu();
        zzb = zznuVar;
        zzqm.zzz(zznu.class, zznuVar);
    }

    private zznu() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zznr.zza, "zzf", zzns.zza});
        }
        if (i10 == 3) {
            return new zznu();
        }
        zznt zzntVar = null;
        if (i10 == 4) {
            return new zznq(zzntVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
