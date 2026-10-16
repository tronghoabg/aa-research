package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class urr implements Closeable {
    public final yfq a;
    private final urs b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public urr(yfq yfqVar, urs ursVar) {
        this.a = yfqVar;
        this.b = ursVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yfq yfqVar;
        if (!this.c.compareAndSet(false, true)) {
            ((ynz) urv.a.a(uys.a).ai((char) 9624)).u("CvoStylesRef.close() called twice; this represents a usage error.");
            return;
        }
        urs ursVar = this.b;
        synchronized (ursVar) {
            int i = ursVar.a - 1;
            ursVar.a = i;
            yfqVar = null;
            if (i == 0) {
                yfq yfqVar2 = ursVar.b;
                ursVar.b = null;
                ursVar.c = null;
                yfqVar = yfqVar2;
            }
        }
        if (yfqVar != null) {
            int size = yfqVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ConcurrentHashMap) ursVar.d.b).remove((String) yfqVar.get(i2));
            }
        }
    }
}
