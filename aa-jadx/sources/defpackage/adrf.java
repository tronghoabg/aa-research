package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adrf implements java.io.Closeable {
    private android.os.Parcel a;

    public adrf(android.os.Parcel parcel) {
        this.a = parcel;
    }

    public static defpackage.adrf c() {
        return new defpackage.adrf(android.os.Parcel.obtain());
    }

    public final android.os.Parcel a() {
        defpackage.ysr.bk(this.a != null, "get() after close()/release()");
        return this.a;
    }

    public final android.os.Parcel b() {
        android.os.Parcel parcelA = a();
        this.a = null;
        return parcelA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        android.os.Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
