package k;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f50853a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f50854b;

    /* renamed from: c, reason: collision with root package name */
    private int f50855c;

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f50856d;

    /* renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f50857e;

    public n(boolean z, RandomAccessFile randomAccessFile) {
        h.g.b.x.f(randomAccessFile, "randomAccessFile");
        this.f50853a = z;
        this.f50856d = new ReentrantLock();
        this.f50857e = randomAccessFile;
    }

    public final long b() {
        ReentrantLock reentrantLock = this.f50856d;
        reentrantLock.lock();
        try {
            if (this.f50854b) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return i();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ReentrantLock c() {
        return this.f50856d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f50856d;
        reentrantLock.lock();
        try {
            if (!this.f50854b) {
                this.f50854b = true;
                if (this.f50855c == 0) {
                    reentrantLock.unlock();
                    j();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final am d(long j2) {
        ReentrantLock reentrantLock = this.f50856d;
        reentrantLock.lock();
        try {
            if (this.f50854b) {
                throw new IllegalStateException("closed");
            }
            this.f50855c++;
            reentrantLock.unlock();
            return new m(this, j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void f() {
        if (!this.f50853a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f50856d;
        reentrantLock.lock();
        try {
            if (this.f50854b) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            k();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected final synchronized int h(long j2, byte[] bArr, int i2, int i3) {
        h.g.b.x.f(bArr, "array");
        RandomAccessFile randomAccessFile = this.f50857e;
        randomAccessFile.seek(j2);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i5 = randomAccessFile.read(bArr, i2, i3 - i4);
            if (i5 != -1) {
                i4 += i5;
            } else if (i4 == 0) {
                return -1;
            }
        }
        return i4;
    }

    protected final synchronized long i() {
        return this.f50857e.length();
    }

    protected final synchronized void j() {
        this.f50857e.close();
    }

    protected final synchronized void k() {
        this.f50857e.getFD().sync();
    }

    protected final synchronized void l(long j2, byte[] bArr, int i2, int i3) {
        h.g.b.x.f(bArr, "array");
        RandomAccessFile randomAccessFile = this.f50857e;
        randomAccessFile.seek(j2);
        randomAccessFile.write(bArr, i2, i3);
    }

    public final al m() {
        if (!this.f50853a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f50856d;
        reentrantLock.lock();
        try {
            if (this.f50854b) {
                throw new IllegalStateException("closed");
            }
            this.f50855c++;
            reentrantLock.unlock();
            return new l(this);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
