package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzrb extends zzks implements zzly {
    private static final zzrb zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzrb zzrbVar = new zzrb();
        zzb = zzrbVar;
        zzks.zzF(zzrb.class, zzrbVar);
    }

    private zzrb() {
    }

    public static zzrb zzg(byte[] bArr) throws zzlc {
        return (zzrb) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzrb();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzra(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzrc zzi() {
        zzrc zzrcVarZzb = zzrc.zzb(this.zzf);
        return zzrcVarZzb == null ? zzrc.UNRECOGNIZED : zzrcVarZzb;
    }
}
