package cg;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19930a;

    /* renamed from: b, reason: collision with root package name */
    public int f19931b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f19932c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f19933d;

    public t(RandomAccessFile randomAccessFile) {
        this.f19933d = randomAccessFile;
    }

    public final long a() {
        long length;
        ReentrantLock reentrantLock = this.f19932c;
        reentrantLock.lock();
        try {
            if (this.f19930a) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f19933d.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final l b(long j8) {
        ReentrantLock reentrantLock = this.f19932c;
        reentrantLock.lock();
        try {
            if (this.f19930a) {
                throw new IllegalStateException("closed");
            }
            this.f19931b++;
            reentrantLock.unlock();
            return new l(this, j8);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f19932c;
        reentrantLock.lock();
        try {
            if (this.f19930a) {
                return;
            }
            this.f19930a = true;
            if (this.f19931b != 0) {
                return;
            }
            synchronized (this) {
                this.f19933d.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
