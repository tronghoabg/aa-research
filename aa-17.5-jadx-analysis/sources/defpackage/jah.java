package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class jah implements jaf {
    private final Object a = new Object();
    private final Queue b = new ArrayDeque();
    private jaf c = null;

    @Override // defpackage.jaf
    public final void a(izm izmVar) {
        synchronized (this.a) {
            jaf jafVar = this.c;
            if (jafVar != null) {
                jafVar.a(izmVar);
            } else {
                this.b.add(izmVar);
            }
        }
    }

    public final void b(jaf jafVar) {
        izm izmVar;
        Object obj = this.a;
        synchronized (obj) {
            if (this.c != null) {
                throw new IllegalStateException();
            }
        }
        while (true) {
            synchronized (obj) {
                izmVar = (izm) this.b.poll();
                if (izmVar == null) {
                    this.c = jafVar;
                    return;
                }
            }
            jafVar.a(izmVar);
        }
    }
}
