package Y4;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16676a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f16677b = 1073741824;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16678c;

    public a(InputStream inputStream) {
        this.f16678c = inputStream;
    }

    private final synchronized void a(int i5) {
        this.f16677b = ((ByteBuffer) this.f16678c).position();
    }

    private final synchronized void b() {
        int i5 = this.f16677b;
        if (i5 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        ((ByteBuffer) this.f16678c).position(i5);
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f16676a) {
            case 0:
                return ((ByteBuffer) this.f16678c).remaining();
            default:
                return this.f16677b;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f16676a) {
            case 1:
                ((InputStream) this.f16678c).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        switch (this.f16676a) {
            case 0:
                a(i5);
                break;
            default:
                super.mark(i5);
                break;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.f16676a) {
            case 0:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f16676a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f16678c;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & ForkServer.ERROR;
                }
                return -1;
            default:
                int i5 = ((InputStream) this.f16678c).read();
                if (i5 == -1) {
                    this.f16677b = 0;
                }
                return i5;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f16676a) {
            case 0:
                b();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j8) {
        switch (this.f16676a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f16678c;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long jMin = Math.min(j8, byteBuffer.remaining());
                byteBuffer.position((int) (byteBuffer.position() + jMin));
                return jMin;
            default:
                return ((InputStream) this.f16678c).skip(j8);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f16678c = byteBuffer;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        switch (this.f16676a) {
            case 1:
                int i5 = ((InputStream) this.f16678c).read(bArr);
                if (i5 == -1) {
                    this.f16677b = 0;
                }
                return i5;
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        switch (this.f16676a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f16678c;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i10, byteBuffer.remaining());
                byteBuffer.get(bArr, i5, iMin);
                return iMin;
            default:
                int i11 = ((InputStream) this.f16678c).read(bArr, i5, i10);
                if (i11 == -1) {
                    this.f16677b = 0;
                }
                return i11;
        }
    }
}
