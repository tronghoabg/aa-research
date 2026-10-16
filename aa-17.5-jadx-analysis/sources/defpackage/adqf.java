package defpackage;

import android.os.Parcel;
import java.io.Closeable;

/* loaded from: classes3.dex */
final class adqf implements Closeable {
    private Parcel a;

    public adqf(Parcel parcel) {
        this.a = parcel;
    }

    public static adqf c() {
        return new adqf(Parcel.obtain());
    }

    public final Parcel a() {
        woy.aa(this.a != null, "get() after close()/release()");
        return this.a;
    }

    public final Parcel b() {
        Parcel parcelA = a();
        this.a = null;
        return parcelA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
