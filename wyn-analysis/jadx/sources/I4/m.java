package I4;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class m extends W1.r {
    @Override // W1.r
    public final void d(Object obj, Object obj2) {
        n nVar = (n) obj;
        nVar.getClass();
        ArrayDeque arrayDeque = n.f5351b;
        synchronized (arrayDeque) {
            arrayDeque.offer(nVar);
        }
    }
}
