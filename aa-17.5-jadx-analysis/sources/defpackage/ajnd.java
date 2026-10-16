package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class ajnd implements Closeable {
    public boolean a;
    public int b;
    public final ReentrantLock c = new ReentrantLock();
    private final RandomAccessFile d;

    public ajnd(RandomAccessFile randomAccessFile) {
        this.d = randomAccessFile;
    }

    public final long a() throws IOException {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ajoc b(long j) throws IOException {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new IllegalStateException("closed");
            }
            this.b++;
            reentrantLock.unlock();
            return new ajnc(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected final synchronized int c(long j, byte[] bArr, int i, int i2) {
        RandomAccessFile randomAccessFile = this.d;
        randomAccessFile.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = randomAccessFile.read(bArr, i, i2 - i3);
            if (i4 != -1) {
                i3 += i4;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (!this.a) {
                this.a = true;
                if (this.b == 0) {
                    reentrantLock.unlock();
                    e();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    protected final synchronized long d() {
        return this.d.length();
    }

    protected final synchronized void e() {
        this.d.close();
    }
}
