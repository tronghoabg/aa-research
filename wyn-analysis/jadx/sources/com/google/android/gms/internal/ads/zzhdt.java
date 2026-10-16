package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class zzhdt implements zzhem {
    private final InputStream zza;

    private zzhdt(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzhem zza(byte[] bArr) {
        return new zzhdt(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.zzhem
    public final zzhtk zzb() throws IOException {
        try {
            return zzhtk.zzg(this.zza, zzidz.zzb());
        } finally {
            this.zza.close();
        }
    }
}
