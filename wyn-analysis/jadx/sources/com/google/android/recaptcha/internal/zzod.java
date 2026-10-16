package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzod extends zzks implements zzly {
    private static final zzod zzb;
    private int zzf;
    private int zzi;
    private int zzj;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzod zzodVar = new zzod();
        zzb = zzodVar;
        zzks.zzF(zzod.class, zzodVar);
    }

    private zzod() {
    }

    public static /* synthetic */ void zzJ(zzod zzodVar, String str) {
        str.getClass();
        zzodVar.zzd = str;
    }

    public static zzoc zzg() {
        return (zzoc) zzb.zzp();
    }

    public static zzod zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zzd", "zzf", "zzh", "zzi", "zze", "zzg", "zzj"});
        }
        if (i10 == 3) {
            return new zzod();
        }
        zzob zzobVar = null;
        if (i10 == 4) {
            return new zzoc(zzobVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzk() {
        return this.zzd;
    }
}
