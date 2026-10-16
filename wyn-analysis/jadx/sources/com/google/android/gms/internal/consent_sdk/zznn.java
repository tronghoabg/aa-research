package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zznn extends zzqm implements zzrr {
    private static final zznn zzb;
    private zzqq zzd = zzqm.zzs();

    static {
        zznn zznnVar = new zznn();
        zzb = zznnVar;
        zzqm.zzz(zznn.class, zznnVar);
    }

    private zznn() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", zznd.zza});
        }
        if (i10 == 3) {
            return new zznn();
        }
        zzno zznoVar = null;
        if (i10 == 4) {
            return new zznm(zznoVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
