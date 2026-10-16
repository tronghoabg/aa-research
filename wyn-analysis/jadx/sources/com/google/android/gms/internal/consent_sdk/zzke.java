package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzke extends zzqm implements zzrr {
    private static final zzke zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzke zzkeVar = new zzke();
        zzb = zzkeVar;
        zzqm.zzz(zzke.class, zzkeVar);
    }

    private zzke() {
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
            return new zzke();
        }
        zzkz zzkzVar = null;
        if (i10 == 4) {
            return new zzkd(zzkzVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
