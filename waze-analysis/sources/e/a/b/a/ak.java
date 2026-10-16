package e.a.b.a;

import android.os.Parcel;
import java.io.Closeable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private Parcel f46331a;

    public ak(Parcel parcel) {
        this.f46331a = parcel;
    }

    public static ak c() {
        return new ak(Parcel.obtain());
    }

    public final Parcel a() {
        com.google.d.b.an.v(this.f46331a != null, "get() after close()/release()");
        return this.f46331a;
    }

    public final Parcel b() {
        Parcel parcelA = a();
        this.f46331a = null;
        return parcelA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.f46331a;
        if (parcel != null) {
            parcel.recycle();
            this.f46331a = null;
        }
    }
}
