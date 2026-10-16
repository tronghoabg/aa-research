package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzok extends zzqm implements zzrr {
    private static final zzok zzb;
    private int zzd;
    private int zze;

    static {
        zzok zzokVar = new zzok();
        zzb = zzokVar;
        zzqm.zzz(zzok.class, zzokVar);
    }

    private zzok() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzok();
        }
        zzoj zzojVar = null;
        if (i10 == 4) {
            return new zzoi(zzojVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
