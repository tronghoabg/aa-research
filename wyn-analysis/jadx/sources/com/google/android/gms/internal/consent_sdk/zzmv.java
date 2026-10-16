package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzmv extends zzqm implements zzrr {
    private static final zzmv zzb;
    private int zzd;
    private int zze;

    static {
        zzmv zzmvVar = new zzmv();
        zzb = zzmvVar;
        zzqm.zzz(zzmv.class, zzmvVar);
    }

    private zzmv() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzmu.zza});
        }
        if (i10 == 3) {
            return new zzmv();
        }
        zzmw zzmwVar = null;
        if (i10 == 4) {
            return new zzmt(zzmwVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
