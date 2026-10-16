package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class zzhdu {
    private final OutputStream zza;

    private zzhdu(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzhdu zzb(OutputStream outputStream) {
        return new zzhdu(outputStream);
    }

    public final void zza(zzhtk zzhtkVar) throws IOException {
        try {
            zzhtkVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
