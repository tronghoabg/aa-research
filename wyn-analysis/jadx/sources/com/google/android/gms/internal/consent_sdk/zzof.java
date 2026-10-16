package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzof extends zzqm implements zzrr {
    private static final zzof zzb;
    private int zzd;
    private long zze;

    static {
        zzof zzofVar = new zzof();
        zzb = zzofVar;
        zzqm.zzz(zzof.class, zzofVar);
    }

    private zzof() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzof();
        }
        zzog zzogVar = null;
        if (i10 == 4) {
            return new zzoe(zzogVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
