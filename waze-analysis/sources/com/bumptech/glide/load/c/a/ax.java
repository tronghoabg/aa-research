package com.bumptech.glide.load.c.a;

import android.media.MediaDataSource;
import j$.util.Objects;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ax extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ByteBuffer f3334a;

    ax(ay ayVar, ByteBuffer byteBuffer) {
        this.f3334a = byteBuffer;
        Objects.requireNonNull(ayVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f3334a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i2, int i3) {
        ByteBuffer byteBuffer = this.f3334a;
        if (j2 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j2);
        int iMin = Math.min(i3, byteBuffer.remaining());
        byteBuffer.get(bArr, i2, iMin);
        return iMin;
    }
}
