package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class sbp implements java.io.Closeable {
    private final android.os.ParcelFileDescriptor a;
    private final android.os.ParcelFileDescriptor b;

    public sbp(android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.ParcelFileDescriptor parcelFileDescriptor2) {
        this.a = parcelFileDescriptor;
        this.b = parcelFileDescriptor2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.a.close();
        this.b.close();
        throw new java.lang.UnsupportedOperationException();
    }
}
