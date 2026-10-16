package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzff extends zzqm implements zzrr {
    private static final zzff zzb;
    private int zzd;
    private zzfe zze;

    static {
        zzff zzffVar = new zzff();
        zzb = zzffVar;
        zzqm.zzz(zzff.class, zzffVar);
    }

    private zzff() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzff();
        }
        zzfg zzfgVar = null;
        if (i10 == 4) {
            return new zzfc(zzfgVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
