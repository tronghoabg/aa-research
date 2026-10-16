package Y4;

import L4.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f16686c;

    /* renamed from: a, reason: collision with root package name */
    public t f16687a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f16688b;

    static {
        char[] cArr = m.f16700a;
        f16686c = new ArrayDeque(0);
    }

    public final void a() {
        this.f16688b = null;
        this.f16687a = null;
        ArrayDeque arrayDeque = f16686c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f16687a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16687a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i5) {
        this.f16687a.mark(i5);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f16687a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f16687a.read(bArr);
        } catch (IOException e7) {
            this.f16688b = e7;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f16687a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j8) {
        try {
            return this.f16687a.skip(j8);
        } catch (IOException e7) {
            this.f16688b = e7;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) {
        try {
            return this.f16687a.read(bArr, i5, i10);
        } catch (IOException e7) {
            this.f16688b = e7;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f16687a.read();
        } catch (IOException e7) {
            this.f16688b = e7;
            return -1;
        }
    }
}
