package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzhp extends zzqm implements zzrr {
    private static final zzhp zzb;

    static {
        zzhp zzhpVar = new zzhp();
        zzb = zzhpVar;
        zzqm.zzz(zzhp.class, zzhpVar);
    }

    private zzhp() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zzib zzibVar = null;
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new zzhp();
        }
        if (i10 == 4) {
            return new zzho(zzibVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
