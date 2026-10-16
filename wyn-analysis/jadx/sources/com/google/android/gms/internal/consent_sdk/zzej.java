package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzej extends zzqm implements zzrr {
    private static final zzej zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        zzej zzejVar = new zzej();
        zzb = zzejVar;
        zzqm.zzz(zzej.class, zzejVar);
    }

    private zzej() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzej();
        }
        zzei zzeiVar = null;
        if (i10 == 4) {
            return new zzeh(zzeiVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
