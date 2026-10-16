package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzjv extends zzks implements zzly {
    private static final zzjv zzb;
    private int zzd;
    private boolean zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzjv zzjvVar = new zzjv();
        zzb = zzjvVar;
        zzks.zzF(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i10 == 2) {
            return new zzmi(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzjv();
        }
        zzji zzjiVar = null;
        if (i10 == 4) {
            return new zzju(zzjiVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
