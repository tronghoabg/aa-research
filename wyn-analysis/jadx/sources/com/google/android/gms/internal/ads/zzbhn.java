package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes3.dex */
final class zzbhn extends PushbackInputStream {
    final /* synthetic */ zzbhq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbhn(zzbhq zzbhqVar, InputStream inputStream, int i5) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbhqVar);
        this.zza = zzbhqVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zza.zzc.zzb();
        super.close();
    }
}
