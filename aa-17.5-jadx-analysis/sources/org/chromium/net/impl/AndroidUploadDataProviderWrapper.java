package org.chromium.net.impl;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
class AndroidUploadDataProviderWrapper extends UploadDataProvider {
    private final org.chromium.net.UploadDataProvider a;

    public AndroidUploadDataProviderWrapper(org.chromium.net.UploadDataProvider uploadDataProvider) {
        uploadDataProvider.getClass();
        this.a = uploadDataProvider;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final long getLength() throws IOException {
        return this.a.getLength();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        this.a.read(new AndroidUploadDataSinkWrapper(uploadDataSink), byteBuffer);
    }

    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.a.rewind(new AndroidUploadDataSinkWrapper(uploadDataSink));
    }
}
