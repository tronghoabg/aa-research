package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzqx extends zzks implements zzly {
    private static final zzqx zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzqx zzqxVar = new zzqx();
        zzb = zzqxVar;
        zzks.zzF(zzqx.class, zzqxVar);
    }

    private zzqx() {
    }

    public static zzqw zzf() {
        return (zzqw) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzqx zzqxVar, String str) {
        str.getClass();
        zzqxVar.zzd = str;
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
            return new zzqx();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzqw(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
