package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
final class InputStreamChannel implements java.nio.channels.ReadableByteChannel {
    private final java.io.InputStream a;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(true);

    private InputStreamChannel(java.io.InputStream inputStream) {
        this.a = inputStream;
    }

    static java.nio.channels.ReadableByteChannel a(java.io.InputStream inputStream) {
        return inputStream instanceof java.io.FileInputStream ? j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((java.io.FileInputStream) inputStream).getChannel()) : new org.chromium.net.impl.InputStreamChannel(inputStream);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        boolean zHasArray = byteBuffer.hasArray();
        java.io.InputStream inputStream = this.a;
        if (zHasArray) {
            int i = inputStream.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (i > 0) {
            }
            return i;
        }
        byte[] bArr = new byte[java.lang.Math.min(16384, java.lang.Math.min(java.lang.Math.max(inputStream.available(), 4096), byteBuffer.remaining()))];
        int i2 = inputStream.read(bArr);
        if (i2 <= 0) {
            return i2;
        }
        byteBuffer.put(bArr, 0, i2);
        return i2;
    }
}
