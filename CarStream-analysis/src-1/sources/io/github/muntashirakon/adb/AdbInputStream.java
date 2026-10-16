package io.github.muntashirakon.adb;

import java.io.InputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class AdbInputStream extends InputStream {
    public AdbStream mAdbStream;

    public AdbInputStream(AdbStream adbStream) {
        this.mAdbStream = adbStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.mAdbStream.available();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.mAdbStream.isClosed()) {
            return -1;
        }
        return this.mAdbStream.read(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
