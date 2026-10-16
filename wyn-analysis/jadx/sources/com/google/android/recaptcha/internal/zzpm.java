package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzpm extends zzks implements zzly {
    private static final zzpm zzb;
    private int zzd;
    private String zze = "";

    static {
        zzpm zzpmVar = new zzpm();
        zzb = zzpmVar;
        zzks.zzF(zzpm.class, zzpmVar);
    }

    private zzpm() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzpm();
        }
        zzpk zzpkVar = null;
        if (i10 == 4) {
            return new zzpl(zzpkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
