package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajod implements java.io.Closeable {
    public boolean a;
    public int b;
    public final java.util.concurrent.locks.ReentrantLock c = new java.util.concurrent.locks.ReentrantLock();
    private final java.io.RandomAccessFile d;

    public ajod(java.io.RandomAccessFile randomAccessFile) {
        this.d = randomAccessFile;
    }

    public final long a() throws java.io.IOException {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new java.lang.IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return d();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final defpackage.ajpc b(long j) throws java.io.IOException {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new java.lang.IllegalStateException("closed");
            }
            this.b++;
            reentrantLock.unlock();
            return new defpackage.ajoc(this, j);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected final synchronized int c(long j, byte[] bArr, int i, int i2) {
        java.io.RandomAccessFile randomAccessFile = this.d;
        randomAccessFile.seek(j);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = randomAccessFile.read(bArr, i, i2 - i3);
            if (i4 == -1) {
                if (i3 != 0) {
                    break;
                }
                return -1;
            }
            i3 += i4;
        }
        return i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (!this.a) {
                this.a = true;
                if (this.b == 0) {
                    reentrantLock.unlock();
                    e();
                    return;
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected final synchronized long d() {
        return this.d.length();
    }

    protected final synchronized void e() {
        this.d.close();
    }
}
