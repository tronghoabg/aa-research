package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzpy extends zzks implements zzly {
    private static final zzpy zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzpy zzpyVar = new zzpy();
        zzb = zzpyVar;
        zzks.zzF(zzpy.class, zzpyVar);
    }

    private zzpy() {
    }

    public static zzpx zzf() {
        return (zzpx) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzpy zzpyVar, String str) {
        str.getClass();
        zzpyVar.zzd |= 1;
        zzpyVar.zze = str;
    }

    public static /* synthetic */ void zzj(zzpy zzpyVar, String str) {
        str.getClass();
        zzpyVar.zzd |= 2;
        zzpyVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzpy();
        }
        zzpk zzpkVar = null;
        if (i10 == 4) {
            return new zzpx(zzpkVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
