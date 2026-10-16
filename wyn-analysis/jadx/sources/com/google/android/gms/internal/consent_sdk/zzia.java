package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzia extends zzqm implements zzrr {
    private static final zzia zzb;
    private int zzd;
    private int zze;

    static {
        zzia zziaVar = new zzia();
        zzb = zziaVar;
        zzqm.zzz(zzia.class, zziaVar);
    }

    private zzia() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0000", new Object[]{"zzd", "zze", zzhz.zza});
        }
        if (i10 == 3) {
            return new zzia();
        }
        zzib zzibVar = null;
        if (i10 == 4) {
            return new zzhy(zzibVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
