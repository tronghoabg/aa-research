package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzog extends zzks implements zzly {
    private static final zzog zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzog zzogVar = new zzog();
        zzb = zzogVar;
        zzks.zzF(zzog.class, zzogVar);
    }

    private zzog() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzog();
        }
        zzoe zzoeVar = null;
        if (i10 == 4) {
            return new zzof(zzoeVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
