package kg;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kd.C3293D;

/* loaded from: classes5.dex */
public abstract class c extends FilterInputStream {
    private final jg.c afterRead;
    private boolean closed;
    private final jg.a exceptionHandler;

    public c(InputStream inputStream) {
        super(inputStream);
        this.exceptionHandler = new C3293D(25);
        this.afterRead = jg.c.f38762a9;
    }

    public void afterRead(int i5) {
        this.afterRead.getClass();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (((FilterInputStream) this).in == null || isClosed()) {
            return 0;
        }
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e7) {
            handleIOException(e7);
            return 0;
        }
    }

    public void checkOpen() throws IOException {
        if (isClosed()) {
            throw new IOException("Closed");
        }
    }

    public void handleIOException(IOException iOException) {
        this.exceptionHandler.accept(iOException);
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i5) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i5);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i5 = 1;
        try {
            beforeRead(1);
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 == -1) {
                i5 = -1;
            }
            afterRead(i5);
            return i10;
        } catch (IOException e7) {
            handleIOException(e7);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e7) {
            handleIOException(e7);
        }
    }

    public c setReference(InputStream inputStream) {
        ((FilterInputStream) this).in = inputStream;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) {
        try {
            return ((FilterInputStream) this).in.skip(j8);
        } catch (IOException e7) {
            handleIOException(e7);
            return 0L;
        }
    }

    public InputStream unwrap() {
        return ((FilterInputStream) this).in;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            byte[] bArr2 = gg.c.f35914a;
            beforeRead(bArr == null ? 0 : bArr.length);
            int i5 = ((FilterInputStream) this).in.read(bArr);
            afterRead(i5);
            return i5;
        } catch (IOException e7) {
            handleIOException(e7);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i5, int i10) throws IOException {
        try {
            beforeRead(i10);
            int i11 = ((FilterInputStream) this).in.read(bArr, i5, i10);
            afterRead(i11);
            return i11;
        } catch (IOException e7) {
            handleIOException(e7);
            return -1;
        }
    }

    public void beforeRead(int i5) throws IOException {
    }
}
