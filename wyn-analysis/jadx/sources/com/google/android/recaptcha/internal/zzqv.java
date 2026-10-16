package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzqv extends zzks implements zzly {
    private static final zzqv zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzqv zzqvVar = new zzqv();
        zzb = zzqvVar;
        zzks.zzF(zzqv.class, zzqvVar);
    }

    private zzqv() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzqv();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzqu(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
