package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class wes extends wfn {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public wes(InputStream inputStream, List list) {
        super(inputStream);
        this.b = list;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((wfx) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @ResultIgnorabilityUnspecified
    public final int read() throws IOException {
        int i = this.in.read();
        if (i != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((wfx) it.next()).a();
            }
        }
        return i;
    }

    @Override // defpackage.wfn, java.io.FilterInputStream, java.io.InputStream
    @ResultIgnorabilityUnspecified
    public final int read(byte[] bArr) throws IOException {
        int i = this.in.read(bArr);
        if (i != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((wfx) it.next()).a();
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @ResultIgnorabilityUnspecified
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((wfx) it.next()).a();
            }
        }
        return i3;
    }
}
