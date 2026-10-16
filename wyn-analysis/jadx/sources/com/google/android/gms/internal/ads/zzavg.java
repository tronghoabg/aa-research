package com.google.android.gms.internal.ads;

import j$.util.Optional;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzavg extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzavg(zzavf zzavfVar, zzavd zzavdVar, long j8) {
        int i5 = (((((~2143124030) & 85005376) | 430547086) + ((2143124030 & 878451808) | 1894615585)) - (-2031609844)) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i5];
        objArr[0] = Long.valueOf(zzavfVar.zza());
        objArr[1] = Long.valueOf(zzavdVar.zza());
        int i10 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        Long lValueOf = Long.valueOf(j8);
        objArr[i10] = lValueOf;
        super(String.format(locale, zzavv.zza("bk3t6gFTc30="), objArr));
        Optional.of(zzavdVar);
        Optional.of(lValueOf);
    }

    public zzavg(zzavf zzavfVar, Throwable th) {
        super(String.format(Locale.US, zzavv.zza("bk0="), Long.valueOf(zzavfVar.zza())), th);
        Optional.empty();
        Optional.empty();
    }
}
