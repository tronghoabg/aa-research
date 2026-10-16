package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzhi extends zzqm implements zzrr {
    private static final zzhi zzb;

    static {
        zzhi zzhiVar = new zzhi();
        zzb = zzhiVar;
        zzqm.zzz(zzhi.class, zzhiVar);
    }

    private zzhi() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zzhk zzhkVar = null;
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new zzhi();
        }
        if (i10 == 4) {
            return new zzhh(zzhkVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
