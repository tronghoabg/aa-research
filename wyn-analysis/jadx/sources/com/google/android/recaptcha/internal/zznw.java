package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zznw extends zzks implements zzly {
    private static final zznw zzb;
    private int zzd;
    private zzka zze;
    private int zzf;

    static {
        zznw zznwVar = new zznw();
        zzb = zznwVar;
        zzks.zzF(zznw.class, zznwVar);
    }

    private zznw() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zznw();
        }
        zznu zznuVar = null;
        if (i10 == 4) {
            return new zznv(zznuVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
