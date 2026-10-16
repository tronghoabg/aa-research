package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
abstract class hxd {
    private final Queue a;

    public hxd() {
        char[] cArr = ify.a;
        this.a = new ArrayDeque(20);
    }

    public abstract hxo a();

    final hxo b() {
        hxo hxoVar = (hxo) this.a.poll();
        return hxoVar == null ? a() : hxoVar;
    }

    public final void c(hxo hxoVar) {
        Queue queue = this.a;
        if (queue.size() < 20) {
            queue.offer(hxoVar);
        }
    }
}
