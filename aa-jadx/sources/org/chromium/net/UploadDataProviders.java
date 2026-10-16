package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static org.chromium.net.UploadDataProvider create(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return new defpackage.akcr(new defpackage.akco(parcelFileDescriptor, 0));
    }

    public static org.chromium.net.UploadDataProvider create(java.io.File file) {
        return new defpackage.akcr(new defpackage.akco(file, 1));
    }

    public static org.chromium.net.UploadDataProvider create(java.nio.ByteBuffer byteBuffer) {
        return new defpackage.akcp(byteBuffer.slice());
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr) {
        return defpackage.agwr.a(bArr, 0, bArr.length);
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr, int i, int i2) {
        return defpackage.agwr.a(bArr, i, i2);
    }
}
