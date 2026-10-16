package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import java.io.IOException;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public class zzat extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzat(String str, Throwable th, boolean z2, int i5) {
        super(str, th);
        this.zza = z2;
        this.zzb = i5;
    }

    public static zzat zza(String str, Throwable th) {
        return new zzat(str, th, true, 0);
    }

    public static zzat zzb(String str, Throwable th) {
        return new zzat(str, th, true, 1);
    }

    public static zzat zzc(String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(StringUtils.SPACE) : "";
        boolean z2 = this.zza;
        int i5 = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + String.valueOf(z2).length() + strConcat.length() + 20 + 11 + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z2);
        sb2.append(", dataType=");
        return AbstractC0279p0.j(i5, "}", sb2);
    }
}
