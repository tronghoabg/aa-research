package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzod extends zzqm implements zzrr {
    private static final zzod zzb;
    private int zzd;
    private zzqr zze = zzqm.zzt();
    private zzsn zzf;

    static {
        zzod zzodVar = new zzod();
        zzb = zzodVar;
        zzqm.zzz(zzod.class, zzodVar);
    }

    private zzod() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", zzoa.class, "zzf"});
        }
        if (i10 == 3) {
            return new zzod();
        }
        zzog zzogVar = null;
        if (i10 == 4) {
            return new zzny(zzogVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
