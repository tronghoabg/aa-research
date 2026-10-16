package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzey extends zzqm implements zzrr {
    private static final zzey zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzey zzeyVar = new zzey();
        zzb = zzeyVar;
        zzqm.zzz(zzey.class, zzeyVar);
    }

    private zzey() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", zzel.zza, "zzf"});
        }
        if (i10 == 3) {
            return new zzey();
        }
        zzez zzezVar = null;
        if (i10 == 4) {
            return new zzex(zzezVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
