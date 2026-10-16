package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class rei {
    private static final ypf b = ols.R("CAR.AUDIO");
    public final ArrayDeque a;
    private final int c;

    public rei(int i) {
        b.l().ai(7910).w("Create AudioBufferQueue with buffer size: %d", i);
        this.c = i;
        this.a = new ArrayDeque(16);
    }

    public final synchronized int a() {
        return this.a.size();
    }

    public final synchronized void b() {
        while (true) {
            ArrayDeque arrayDeque = this.a;
            if (!arrayDeque.isEmpty()) {
                f((ajki) arrayDeque.poll());
            }
        }
    }

    public final ajki c() {
        return new ajki(this.c);
    }

    public final synchronized ajki d() {
        return (ajki) this.a.poll();
    }

    public final synchronized void e(ajki ajkiVar) {
        this.a.add(ajkiVar);
    }

    public final void f(ajki ajkiVar) {
        rvj.a.b((ByteBuffer) ajkiVar.b);
    }
}
