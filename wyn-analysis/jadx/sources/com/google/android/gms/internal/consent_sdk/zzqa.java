package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzqa extends zzqm implements zzrr {
    private static final zzqa zzb;
    private long zzd;
    private int zze;

    static {
        zzqa zzqaVar = new zzqa();
        zzb = zzqaVar;
        zzqm.zzz(zzqa.class, zzqaVar);
    }

    private zzqa() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new zzrz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzqa();
        }
        zzpz zzpzVar = null;
        if (i10 == 4) {
            return new zzpy(zzpzVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
