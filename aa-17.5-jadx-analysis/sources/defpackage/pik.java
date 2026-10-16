package defpackage;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class pik implements uyl {
    public final int b;
    public final ArrayDeque a = new ArrayDeque();
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicInteger e = new AtomicInteger(0);
    public final AtomicInteger f = new AtomicInteger(0);

    public pik(int i) {
        this.b = i;
    }

    public final pij a() {
        ArrayDeque arrayDeque = this.a;
        synchronized (arrayDeque) {
            pij pijVar = (pij) arrayDeque.poll();
            return pijVar != null ? pijVar : new pij(this, this.b);
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}
