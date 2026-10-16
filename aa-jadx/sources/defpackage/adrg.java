package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adrg extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    public final android.os.Parcelable.Creator a;
    public final boolean b;
    public final android.os.Parcelable c;
    java.io.InputStream d;
    android.os.Parcelable e;

    public adrg(android.os.Parcelable.Creator creator, android.os.Parcelable parcelable, boolean z) {
        this.a = creator;
        this.c = parcelable;
        this.b = z;
        boolean z2 = true;
        if (creator == null && !z) {
            z2 = false;
        }
        defpackage.ysr.aX(z2);
    }

    private final java.io.InputStream b() {
        if (this.d == null) {
            android.os.Parcelable parcelable = this.c;
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            parcelObtain.writeParcelable(parcelable, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            this.d = new java.io.ByteArrayInputStream(bArrMarshall);
        }
        return this.d;
    }

    final int a(android.os.Parcel parcel) {
        android.os.Parcelable parcelable = this.c;
        int iDataPosition = parcel.dataPosition();
        parcel.writeParcelable(parcelable, parcelable.describeContents());
        return parcel.dataPosition() - iDataPosition;
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        return b().available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.io.InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        java.io.InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        return b().read();
    }

    @Override // java.io.InputStream
    public final void reset() throws java.io.IOException {
        java.io.InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        if (j <= 0) {
            return 0L;
        }
        return b().skip(j);
    }

    public final java.lang.String toString() {
        return "ParcelableInputStream[V: " + java.lang.String.valueOf(this.c) + "]";
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        return b().read(bArr, i, i2);
    }
}
