package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class wet extends wfo {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public wet(OutputStream outputStream, List list) {
        super(outputStream);
        this.b = list;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((wfy) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // defpackage.wfo, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        for (wfy wfyVar : this.b) {
            int length = bArr.length;
            wfyVar.a();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.out.write(i);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wfy) it.next()).a();
        }
    }

    @Override // defpackage.wfo, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wfy) it.next()).a();
        }
    }
}
