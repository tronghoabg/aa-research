package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzoj extends zzks implements zzly {
    private static final zzoj zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzoj zzojVar = new zzoj();
        zzb = zzojVar;
        zzks.zzF(zzoj.class, zzojVar);
    }

    private zzoj() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzoj();
        }
        zzoh zzohVar = null;
        if (i10 == 4) {
            return new zzoi(zzohVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
