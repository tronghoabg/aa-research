package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.ahlb;
import defpackage.akbo;
import defpackage.akbp;
import defpackage.akbr;
import java.io.File;
import java.nio.ByteBuffer;

@Deprecated
/* loaded from: classes2.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new akbr(new akbo(parcelFileDescriptor, 0));
    }

    public static UploadDataProvider create(File file) {
        return new akbr(new akbo(file, 1));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new akbp(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return ahlb.a(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return ahlb.a(bArr, i, i2);
    }
}
