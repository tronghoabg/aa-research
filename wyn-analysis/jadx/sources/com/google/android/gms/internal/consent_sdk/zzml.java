package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzml extends zzqm implements zzrr {
    private static final zzml zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzml zzmlVar = new zzml();
        zzb = zzmlVar;
        zzqm.zzz(zzml.class, zzmlVar);
    }

    private zzml() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", zzmj.zza, "zzf"});
        }
        if (i10 == 3) {
            return new zzml();
        }
        zzmw zzmwVar = null;
        if (i10 == 4) {
            return new zzmk(zzmwVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
