package net.zetetic.database.sqlcipher;

import java.io.Closeable;

/* loaded from: classes5.dex */
public abstract class SQLiteClosable implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public int f41044a = 1;

    public final void a() {
        synchronized (this) {
            try {
                int i5 = this.f41044a;
                if (i5 <= 0) {
                    throw new IllegalStateException("attempt to re-open an already-closed object: " + this);
                }
                this.f41044a = i5 + 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final void d() {
        boolean z2;
        synchronized (this) {
            z2 = true;
            int i5 = this.f41044a - 1;
            this.f41044a = i5;
            if (i5 != 0) {
                z2 = false;
            }
        }
        if (z2) {
            b();
        }
    }
}
