package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzom extends zzks implements zzly {
    private static final zzom zzb;
    private int zzd;
    private int zzf;
    private int zzh;
    private int zzj;
    private String zze = "";
    private String zzg = "";
    private String zzi = "";

    static {
        zzom zzomVar = new zzom();
        zzb = zzomVar;
        zzks.zzF(zzom.class, zzomVar);
    }

    private zzom() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new zzom();
        }
        zzok zzokVar = null;
        if (i10 == 4) {
            return new zzol(zzokVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
