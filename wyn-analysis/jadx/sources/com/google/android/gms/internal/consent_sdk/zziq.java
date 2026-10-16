package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zziq extends zzqm implements zzrr {
    private static final zziq zzb;
    private int zzd;
    private int zze;
    private zzik zzf;
    private zzip zzg;

    static {
        zziq zziqVar = new zziq();
        zzb = zziqVar;
        zzqm.zzz(zziq.class, zziqVar);
    }

    private zziq() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzil.zza, "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zziq();
        }
        zziv zzivVar = null;
        if (i10 == 4) {
            return new zzii(zzivVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
