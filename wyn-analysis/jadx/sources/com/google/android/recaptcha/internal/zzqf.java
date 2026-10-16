package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzqf extends zzks implements zzly {
    private static final zzqf zzb;
    private int zzd;
    private long zzf;
    private int zzg;
    private String zze = "";
    private zzkz zzh = zzks.zzz();
    private zziv zzi = zziv.zzb;
    private String zzj = "";
    private String zzk = "";

    static {
        zzqf zzqfVar = new zzqf();
        zzb = zzqfVar;
        zzks.zzF(zzqf.class, zzqfVar);
    }

    private zzqf() {
    }

    public static zzqf zzi(InputStream inputStream) throws IOException {
        return (zzqf) zzks.zzu(zzb, inputStream);
    }

    public final zziv zzf() {
        return this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzqh.class, "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new zzqf();
        }
        zzqb zzqbVar = null;
        if (i10 == 4) {
            return new zzqe(zzqbVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzj() {
        return this.zze;
    }

    public final List zzk() {
        return this.zzh;
    }
}
