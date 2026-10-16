package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class sas implements Closeable {
    private final ParcelFileDescriptor a;
    private final ParcelFileDescriptor b;

    public sas(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        this.a = parcelFileDescriptor;
        this.b = parcelFileDescriptor2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        this.b.close();
        throw new UnsupportedOperationException();
    }
}
