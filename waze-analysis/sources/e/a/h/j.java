package e.a.h;

import e.a.eh;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f47776a = new ArrayBlockingQueue(3);

    /* renamed from: b, reason: collision with root package name */
    private final m f47777b = new i(this);

    /* renamed from: c, reason: collision with root package name */
    private final e.a.k f47778c;

    /* renamed from: d, reason: collision with root package name */
    private Object f47779d;

    j(e.a.k kVar) {
        this.f47778c = kVar;
    }

    final m b() {
        return this.f47777b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() throws java.lang.Throwable {
        /*
            r4 = this;
        L0:
            java.lang.Object r0 = r4.f47779d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L30
        L6:
            java.util.concurrent.BlockingQueue r0 = r4.f47776a     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L1b
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L1b
            if (r1 == 0) goto L15
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L15:
            r4.f47779d = r0
            goto L0
        L18:
            r4 = move-exception
            r2 = r1
            goto L26
        L1b:
            r0 = move-exception
            e.a.k r1 = r4.f47778c     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "Thread interrupted"
            r1.a(r3, r0)     // Catch: java.lang.Throwable -> L25
            r1 = r2
            goto L6
        L25:
            r4 = move-exception
        L26:
            if (r2 == 0) goto L2f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L2f:
            throw r4
        L30:
            boolean r3 = r0 instanceof e.a.eh
            if (r3 != 0) goto L38
            if (r0 == r4) goto L37
            return r2
        L37:
            return r1
        L38:
            e.a.eh r0 = (e.a.eh) r0
            e.a.ee r4 = r0.b()
            e.a.cm r0 = r0.a()
            e.a.eh r1 = new e.a.eh
            r1.<init>(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.h.j.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final T next() {
        Object obj = this.f47779d;
        if (!(obj instanceof eh) && obj != this) {
            this.f47778c.c(1);
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T t = (T) this.f47779d;
        this.f47779d = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
