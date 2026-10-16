package com.google.android.gms.internal.ads;

import Va.M6;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class zzgzz extends zzgzq {
    private final File zza;

    public /* synthetic */ zzgzz(File file, byte[] bArr) {
        this.zza = file;
    }

    public final String toString() {
        String string = this.zza.toString();
        return M6.t(new StringBuilder(string.length() + 20), "Files.asByteSource(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final /* bridge */ /* synthetic */ InputStream zza() throws IOException {
        return new FileInputStream(this.zza);
    }
}
