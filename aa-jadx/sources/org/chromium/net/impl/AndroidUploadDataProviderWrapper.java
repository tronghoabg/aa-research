package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
class AndroidUploadDataProviderWrapper extends android.net.http.UploadDataProvider {
    private final org.chromium.net.UploadDataProvider a;

    public AndroidUploadDataProviderWrapper(org.chromium.net.UploadDataProvider uploadDataProvider) {
        uploadDataProvider.getClass();
        this.a = uploadDataProvider;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.a.close();
    }

    public final long getLength() throws java.io.IOException {
        return this.a.getLength();
    }

    public final void read(android.net.http.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        this.a.read(new org.chromium.net.impl.AndroidUploadDataSinkWrapper(uploadDataSink), byteBuffer);
    }

    public final void rewind(android.net.http.UploadDataSink uploadDataSink) throws java.io.IOException {
        this.a.rewind(new org.chromium.net.impl.AndroidUploadDataSinkWrapper(uploadDataSink));
    }
}
