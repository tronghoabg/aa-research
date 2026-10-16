package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzik extends zzqm implements zzrr {
    private static final zzik zzb;

    static {
        zzik zzikVar = new zzik();
        zzb = zzikVar;
        zzqm.zzz(zzik.class, zzikVar);
    }

    private zzik() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zziv zzivVar = null;
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new zzik();
        }
        if (i10 == 4) {
            return new zzij(zzivVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
