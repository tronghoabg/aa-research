package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzpo extends zzks implements zzly {
    private static final zzpo zzb;
    private zziv zzd = zziv.zzb;

    static {
        zzpo zzpoVar = new zzpo();
        zzb = zzpoVar;
        zzks.zzF(zzpo.class, zzpoVar);
    }

    private zzpo() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zzd"});
        }
        if (i10 == 3) {
            return new zzpo();
        }
        zzpk zzpkVar = null;
        if (i10 == 4) {
            return new zzpn(zzpkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
