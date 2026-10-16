package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzqz extends zzks implements zzly {
    private static final zzqz zzb;
    private int zzd;

    static {
        zzqz zzqzVar = new zzqz();
        zzb = zzqzVar;
        zzks.zzF(zzqz.class, zzqzVar);
    }

    private zzqz() {
    }

    public static zzqz zzg(byte[] bArr) throws zzlc {
        return (zzqz) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        }
        if (i10 == 3) {
            return new zzqz();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzqy(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzrc zzi() {
        zzrc zzrcVarZzb = zzrc.zzb(this.zzd);
        return zzrcVarZzb == null ? zzrc.UNRECOGNIZED : zzrcVarZzb;
    }
}
