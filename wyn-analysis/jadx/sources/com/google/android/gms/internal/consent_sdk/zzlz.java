package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzlz extends zzqm implements zzrr {
    private static final zzlz zzb;
    private int zzd;
    private zzlx zze;
    private zzej zzf;
    private String zzg = "";

    static {
        zzlz zzlzVar = new zzlz();
        zzb = zzlzVar;
        zzqm.zzz(zzlz.class, zzlzVar);
    }

    private zzlz() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzlz();
        }
        zzly zzlyVar = null;
        if (i10 == 4) {
            return new zzlp(zzlyVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
