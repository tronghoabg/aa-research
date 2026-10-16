package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzqh extends zzks implements zzly {
    private static final zzqh zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzqh zzqhVar = new zzqh();
        zzb = zzqhVar;
        zzks.zzF(zzqh.class, zzqhVar);
    }

    private zzqh() {
    }

    public final String zzg() {
        return this.zze;
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
            return new zzqh();
        }
        zzqb zzqbVar = null;
        if (i10 == 4) {
            return new zzqg(zzqbVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzi() {
        return this.zzf;
    }
}
