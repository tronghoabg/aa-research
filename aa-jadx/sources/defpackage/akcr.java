package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akcr extends org.chromium.net.UploadDataProvider {
    private volatile java.nio.channels.FileChannel a;
    private final defpackage.akcq b;
    private final java.lang.Object c = new java.lang.Object();

    public akcr(defpackage.akcq akcqVar) {
        this.b = akcqVar;
    }

    private final java.nio.channels.FileChannel a() throws java.io.IOException {
        if (this.a == null) {
            synchronized (this.c) {
                if (this.a == null) {
                    this.a = this.b.a();
                }
            }
        }
        return this.a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.nio.channels.FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() throws java.io.IOException {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i;
        if (!byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        java.nio.channels.FileChannel fileChannelA = a();
        do {
            i = fileChannelA.read(byteBuffer);
            if (i == -1) {
                break;
            }
        } while (i == 0);
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(org.chromium.net.UploadDataSink uploadDataSink) throws java.io.IOException {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
