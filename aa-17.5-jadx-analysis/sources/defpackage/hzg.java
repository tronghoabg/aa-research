package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class hzg {
    private static final Queue a;
    private int b;
    private int c;
    private Object d;

    static {
        char[] cArr = ify.a;
        a = new ArrayDeque(0);
    }

    private hzg() {
    }

    public static hzg b(Object obj) {
        hzg hzgVar;
        Queue queue = a;
        synchronized (queue) {
            hzgVar = (hzg) queue.poll();
        }
        if (hzgVar == null) {
            hzgVar = new hzg();
        }
        hzgVar.d = obj;
        hzgVar.c = 0;
        hzgVar.b = 0;
        return hzgVar;
    }

    public final void a() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hzg) {
            hzg hzgVar = (hzg) obj;
            int i = hzgVar.c;
            int i2 = hzgVar.b;
            if (this.d.equals(hzgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
