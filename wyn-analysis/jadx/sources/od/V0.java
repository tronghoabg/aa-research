package od;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import md.AbstractC3541i;

/* loaded from: classes5.dex */
public final class V0 extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final int f41816a;

    /* renamed from: b, reason: collision with root package name */
    public final W1 f41817b;

    /* renamed from: c, reason: collision with root package name */
    public long f41818c;

    /* renamed from: d, reason: collision with root package name */
    public long f41819d;

    /* renamed from: e, reason: collision with root package name */
    public long f41820e;

    public V0(InputStream inputStream, int i5, W1 w12) {
        super(inputStream);
        this.f41820e = -1L;
        this.f41816a = i5;
        this.f41817b = w12;
    }

    public final void a() {
        long j8 = this.f41819d;
        long j10 = this.f41818c;
        if (j8 > j10) {
            long j11 = j8 - j10;
            for (AbstractC3541i abstractC3541i : this.f41817b.f41842a) {
                abstractC3541i.f(j11);
            }
            this.f41818c = this.f41819d;
        }
    }

    public final void b() {
        long j8 = this.f41819d;
        int i5 = this.f41816a;
        if (j8 <= i5) {
            return;
        }
        throw md.k0.k.h("Decompressed gRPC message exceeds maximum size " + i5).a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        ((FilterInputStream) this).in.mark(i5);
        this.f41820e = this.f41819d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i5 = ((FilterInputStream) this).in.read();
        if (i5 != -1) {
            this.f41819d++;
        }
        b();
        a();
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f41820e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f41819d = this.f41820e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j8);
        this.f41819d += jSkip;
        b();
        a();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = ((FilterInputStream) this).in.read(bArr, i5, i10);
        if (i11 != -1) {
            this.f41819d += i11;
        }
        b();
        a();
        return i11;
    }
}
