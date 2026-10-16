package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzfe extends zzqm implements zzrr {
    private static final zzfe zzb;

    static {
        zzfe zzfeVar = new zzfe();
        zzb = zzfeVar;
        zzqm.zzz(zzfe.class, zzfeVar);
    }

    private zzfe() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zzfg zzfgVar = null;
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new zzfe();
        }
        if (i10 == 4) {
            return new zzfd(zzfgVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
