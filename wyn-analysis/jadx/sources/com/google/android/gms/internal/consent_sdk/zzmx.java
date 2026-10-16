package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzmx extends zzqm implements zzrr {
    private static final zzmx zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzmx zzmxVar = new zzmx();
        zzb = zzmxVar;
        zzqm.zzz(zzmx.class, zzmxVar);
    }

    private zzmx() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", zzoq.zza(), "zzi", zzmp.zza, zzmi.class, zzml.class, zzmv.class, zzmo.class, zzms.class});
        }
        if (i10 == 3) {
            return new zzmx();
        }
        zzmw zzmwVar = null;
        if (i10 == 4) {
            return new zzmf(zzmwVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
