package com.google.android.gms.internal.auth;

import android.net.Uri;
import x.C4429v;

/* loaded from: classes3.dex */
public final class zzci {
    private final C4429v zza;

    public zzci(C4429v c4429v) {
        this.zza = c4429v;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        C4429v c4429v;
        if (uri != null) {
            c4429v = (C4429v) this.zza.get(uri.toString());
        } else {
            c4429v = null;
        }
        if (c4429v == null) {
            return null;
        }
        return (String) c4429v.get("".concat(str3));
    }
}
