package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class uru implements Closeable {
    private final tqt a;
    private final urt b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public uru(tqt tqtVar, urt urtVar) {
        this.a = tqtVar;
        this.b = urtVar;
    }

    public final tqt a() {
        woy.Z(!this.c.get());
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tqt tqtVar;
        if (!this.c.compareAndSet(false, true)) {
            ((ynz) urv.a.a(uys.a).ai((char) 9625)).u("StyleCollectionImpl.close() called twice; this represents a usage error.");
            return;
        }
        urt urtVar = this.b;
        synchronized (urtVar) {
            int i = urtVar.b - 1;
            urtVar.b = i;
            tqtVar = null;
            if (i == 0) {
                tqt tqtVar2 = urtVar.c;
                tqtVar2.getClass();
                urtVar.c = null;
                tqtVar = tqtVar2;
            }
        }
        if (tqtVar != null) {
            urtVar.a.f(tqtVar);
        }
    }
}
