package S1;

import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final h f10864a;

    /* renamed from: b, reason: collision with root package name */
    public final k f10865b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10867d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10868e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10866c = new byte[1];

    public j(h hVar, k kVar) {
        this.f10864a = hVar;
        this.f10865b = kVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10868e) {
            return;
        }
        this.f10864a.close();
        this.f10868e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f10866c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) {
        Q1.k.g(!this.f10868e);
        boolean z2 = this.f10867d;
        h hVar = this.f10864a;
        if (!z2) {
            hVar.y(this.f10865b);
            this.f10867d = true;
        }
        int i11 = hVar.read(bArr, i5, i10);
        if (i11 == -1) {
            return -1;
        }
        return i11;
    }
}
