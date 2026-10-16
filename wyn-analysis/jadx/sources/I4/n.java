package I4;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f5351b;

    /* renamed from: a, reason: collision with root package name */
    public Object f5352a;

    static {
        char[] cArr = Y4.m.f16700a;
        f5351b = new ArrayDeque(0);
    }

    public static n a(Object obj) {
        n nVar;
        ArrayDeque arrayDeque = f5351b;
        synchronized (arrayDeque) {
            nVar = (n) arrayDeque.poll();
        }
        if (nVar == null) {
            nVar = new n();
        }
        nVar.f5352a = obj;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        nVar.getClass();
        return this.f5352a.equals(nVar.f5352a);
    }

    public final int hashCode() {
        return this.f5352a.hashCode();
    }
}
