package e.a.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    InputStream f46332a;

    /* renamed from: b, reason: collision with root package name */
    Parcelable f46333b;

    /* renamed from: c, reason: collision with root package name */
    private final Parcelable.Creator f46334c;

    /* renamed from: d, reason: collision with root package name */
    private final Parcelable f46335d;

    al(Parcelable.Creator creator, Parcelable parcelable) {
        this.f46334c = creator;
        this.f46335d = parcelable;
        com.google.d.b.an.l(creator != null);
    }

    private final InputStream c() {
        if (this.f46332a == null) {
            Parcelable parcelable = this.f46335d;
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeParcelable(parcelable, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            this.f46332a = new ByteArrayInputStream(bArrMarshall);
        }
        return this.f46332a;
    }

    final int a(Parcel parcel) {
        Parcelable parcelable = this.f46335d;
        int iDataPosition = parcel.dataPosition();
        parcel.writeParcelable(parcelable, parcelable.describeContents());
        return parcel.dataPosition() - iDataPosition;
    }

    @Override // java.io.InputStream
    public final int available() {
        return c().available();
    }

    final Parcelable b() {
        Parcelable parcelable = this.f46333b;
        if (parcelable != null) {
            return parcelable;
        }
        Parcelable parcelable2 = this.f46335d;
        Parcelable.Creator creator = this.f46334c;
        com.google.d.b.an.B(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelable2.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        Parcelable parcelable3 = (Parcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        this.f46333b = parcelable3;
        return parcelable3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f46332a;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        InputStream inputStream = this.f46332a;
        if (inputStream != null) {
            inputStream.mark(i2);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        return c().read();
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        InputStream inputStream = this.f46332a;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return c().skip(j2);
    }

    public final String toString() {
        return "ParcelableInputStream[V: " + String.valueOf(this.f46335d) + "]";
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        return c().read(bArr, i2, i3);
    }
}
