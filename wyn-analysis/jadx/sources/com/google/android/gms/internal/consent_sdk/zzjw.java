package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzjw extends zzqm implements zzrr {
    private static final zzjw zzb;

    static {
        zzjw zzjwVar = new zzjw();
        zzb = zzjwVar;
        zzqm.zzz(zzjw.class, zzjwVar);
    }

    private zzjw() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zzkb zzkbVar = null;
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new zzjw();
        }
        if (i10 == 4) {
            return new zzjv(zzkbVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
