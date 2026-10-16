package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzio extends zzqm implements zzrr {
    private static final zzio zzb;

    static {
        zzio zzioVar = new zzio();
        zzb = zzioVar;
        zzqm.zzz(zzio.class, zzioVar);
    }

    private zzio() {
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
            return new zzio();
        }
        if (i10 == 4) {
            return new zzin(zzivVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
