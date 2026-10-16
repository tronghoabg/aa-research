package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
final class zzasm implements zzasl {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzasm(FileChannel fileChannel, long j8, long j10) {
        this.zza = fileChannel;
        this.zzb = j8;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zzb(MessageDigest[] messageDigestArr, long j8, int i5) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j8, i5);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
