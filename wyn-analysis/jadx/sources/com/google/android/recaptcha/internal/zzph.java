package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzph extends zzks implements zzly {
    private static final zzph zzb;
    private zzkz zzd = zzks.zzz();

    static {
        zzph zzphVar = new zzph();
        zzb = zzphVar;
        zzks.zzF(zzph.class, zzphVar);
    }

    private zzph() {
    }

    public static zzph zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        }
        if (i10 == 3) {
            return new zzph();
        }
        zzpf zzpfVar = null;
        if (i10 == 4) {
            return new zzpg(zzpfVar);
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
