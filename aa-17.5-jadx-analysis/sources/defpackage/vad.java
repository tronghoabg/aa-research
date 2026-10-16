package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public abstract class vad {
    public final ThreadLocal b = new vab();
    public final ReadWriteLock c = new ReentrantReadWriteLock();
    public final Map d = new LinkedHashMap();
    public final ThreadLocal e = new vac();

    public final int a() {
        this.c.readLock().lock();
        try {
            return this.d.size();
        } finally {
            this.c.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zgp b();

    protected void i() {
        throw null;
    }

    protected void j() {
        throw null;
    }

    public final void o(vaf vafVar, Executor executor) {
        vafVar.getClass();
        executor.getClass();
        ReadWriteLock readWriteLock = this.c;
        readWriteLock.writeLock().lock();
        try {
            Map map = this.d;
            if (map.containsKey(vafVar)) {
                throw new IllegalArgumentException("Observer already added");
            }
            map.put(vafVar, new vag(vafVar, executor));
            readWriteLock.writeLock().unlock();
            j();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    public final void p(boolean z) {
        this.e.set(Boolean.valueOf(z));
    }
}
