package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzjs extends zzko implements zzly {
    private static final zzjs zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private byte zzl = 2;

    static {
        zzjs zzjsVar = new zzjs();
        zzd = zzjsVar;
        zzks.zzF(zzjs.class, zzjsVar);
    }

    private zzjs() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i10 == 2) {
            return new zzmi(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zze", "zzf", zzjn.zza, "zzg", zzjm.zza, "zzh", zzjq.zza, "zzi", zzjr.zza, "zzj", zzjp.zza, "zzk", zzjo.zza});
        }
        if (i10 == 3) {
            return new zzjs();
        }
        zzji zzjiVar = null;
        if (i10 == 4) {
            return new zzjl(zzjiVar);
        }
        if (i10 == 5) {
            return zzd;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
