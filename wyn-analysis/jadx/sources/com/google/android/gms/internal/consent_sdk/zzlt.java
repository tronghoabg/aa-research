package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzlt extends zzqm implements zzrr {
    private static final zzlt zzb;

    static {
        zzlt zzltVar = new zzlt();
        zzb = zzltVar;
        zzqm.zzz(zzlt.class, zzltVar);
    }

    private zzlt() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zzly zzlyVar = null;
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new zzlt();
        }
        if (i10 == 4) {
            return new zzls(zzlyVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
