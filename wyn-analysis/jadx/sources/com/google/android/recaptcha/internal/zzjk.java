package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzjk extends zzko implements zzly {
    private static final zzjk zzd;
    private int zze;
    private boolean zzf;
    private zzjs zzg;
    private boolean zzh;
    private byte zzj = 2;
    private zzkz zzi = zzmh.zze();

    static {
        zzjk zzjkVar = new zzjk();
        zzd = zzjkVar;
        zzks.zzF(zzjk.class, zzjkVar);
    }

    private zzjk() {
    }

    public static zzjk zzg() {
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i10 == 2) {
            return new zzmi(zzd, "\u0001\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002ϧЛ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzjw.class});
        }
        if (i10 == 3) {
            return new zzjk();
        }
        zzji zzjiVar = null;
        if (i10 == 4) {
            return new zzjj(zzjiVar);
        }
        if (i10 == 5) {
            return zzd;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
