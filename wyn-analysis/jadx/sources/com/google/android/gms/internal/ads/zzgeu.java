package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzgeu implements zzgeo {
    private final int zza;
    private final byte[] zzb;

    public zzgeu(int i5, byte[] bArr) {
        this.zza = i5;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgeo
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgeo
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
