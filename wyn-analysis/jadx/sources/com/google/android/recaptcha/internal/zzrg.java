package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzrg extends zzks implements zzly {
    private static final zzrg zzb;
    private zzkz zzd = zzks.zzz();

    static {
        zzrg zzrgVar = new zzrg();
        zzb = zzrgVar;
        zzks.zzF(zzrg.class, zzrgVar);
    }

    private zzrg() {
    }

    public static zzrg zzg(byte[] bArr) throws zzlc {
        return (zzrg) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzrs.class});
        }
        if (i10 == 3) {
            return new zzrg();
        }
        zzqr zzqrVar = null;
        if (i10 == 4) {
            return new zzrf(zzqrVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzi() {
        return this.zzd;
    }
}
