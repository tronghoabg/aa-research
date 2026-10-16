package org.chromium.net;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes5.dex */
public final class d extends UploadDataProvider {

    /* renamed from: a, reason: collision with root package name */
    public volatile FileChannel f42954a;

    /* renamed from: b, reason: collision with root package name */
    public final c f42955b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f42956c = new Object();

    public d(c cVar) {
        this.f42955b = cVar;
    }

    public final FileChannel a() {
        if (this.f42954a == null) {
            synchronized (this.f42956c) {
                try {
                    if (this.f42954a == null) {
                        this.f42954a = this.f42955b.g();
                    }
                } finally {
                }
            }
        }
        return this.f42954a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f42954a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelA = a();
        int i5 = 0;
        while (i5 == 0) {
            int i10 = fileChannelA.read(byteBuffer);
            if (i10 == -1) {
                break;
            } else {
                i5 += i10;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
