package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzhx extends zzqm implements zzrr {
    private static final zzhx zzb;
    private int zzd;
    private zzhw zze;
    private zzhp zzf;

    static {
        zzhx zzhxVar = new zzhx();
        zzb = zzhxVar;
        zzqm.zzz(zzhx.class, zzhxVar);
    }

    private zzhx() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzhx();
        }
        zzib zzibVar = null;
        if (i10 == 4) {
            return new zzhn(zzibVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
