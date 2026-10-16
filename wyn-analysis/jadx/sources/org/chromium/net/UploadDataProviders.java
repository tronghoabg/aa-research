package org.chromium.net;

import a2.C1323c;
import ad.L;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new d(new L(file, 18));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new d(new C1323c(parcelFileDescriptor, 20));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new b(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i5, int i10) {
        return new b(ByteBuffer.wrap(bArr, i5, i10).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
