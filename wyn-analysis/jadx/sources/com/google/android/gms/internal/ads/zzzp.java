package com.google.android.gms.internal.ads;

import Va.M6;
import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzzp extends zzat {
    public final zzgwt zzc;

    public zzzp(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzgwt.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzgwt zzgwtVar = this.zzc;
        String message = super.getMessage();
        if (zzgwtVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgwtVar);
        return M6.t(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}
