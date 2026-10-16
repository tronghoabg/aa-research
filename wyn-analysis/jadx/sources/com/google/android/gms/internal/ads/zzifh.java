package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzifh extends IOException {
    private boolean zza;

    public zzifh(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzifh(String str) {
        super(str);
    }

    public zzifh(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
