package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzlw extends zzqm implements zzrr {
    private static final zzlw zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzlw zzlwVar = new zzlw();
        zzb = zzlwVar;
        zzqm.zzz(zzlw.class, zzlwVar);
    }

    private zzlw() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzlw();
        }
        zzly zzlyVar = null;
        if (i10 == 4) {
            return new zzlv(zzlyVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
