package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzsn extends zzqm implements zzrr {
    private static final zzsn zzb;
    private long zzd;
    private int zze;

    static {
        zzsn zzsnVar = new zzsn();
        zzb = zzsnVar;
        zzqm.zzz(zzsn.class, zzsnVar);
    }

    private zzsn() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new zzrz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzsn();
        }
        zzsm zzsmVar = null;
        if (i10 == 4) {
            return new zzsl(zzsmVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
