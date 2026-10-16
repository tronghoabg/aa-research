package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class xue {
    public static final woy e = new woy();
    private final xue a;
    public final aat c;
    public boolean d = false;

    public xue(xue xueVar, aat aatVar) {
        if (xueVar != null && !xueVar.d) {
            throw new IllegalArgumentException();
        }
        this.a = xueVar;
        this.c = aatVar;
    }

    public static xuc b() {
        return new xud(xud.a, new aat(0));
    }

    public static xue c(Set set) {
        if (set.isEmpty()) {
            return xud.a;
        }
        if (set.size() == 1) {
            return (xue) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            xue xueVar = (xue) it.next();
            do {
                i += xueVar.c.d;
                xueVar = xueVar.a;
            } while (xueVar != null);
        }
        if (i == 0) {
            return xud.a;
        }
        aat aatVar = new aat(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            xue xueVar2 = (xue) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    aat aatVar2 = xueVar2.c;
                    if (i2 >= aatVar2.d) {
                        break;
                    }
                    woy.S(aatVar.put((woy) aatVar2.d(i2), aatVar2.g(i2)) == null, "Duplicate bindings: %s", aatVar2.d(i2));
                    i2++;
                }
                xueVar2 = xueVar2.a;
            } while (xueVar2 != null);
        }
        return new xud(null, aatVar).e();
    }

    public static xue d(xue xueVar, xue xueVar2) {
        return xueVar.f() ? xueVar2 : xueVar2.f() ? xueVar : c(ygr.p(xueVar, xueVar2));
    }

    public final xue e() {
        if (this.d) {
            throw new IllegalStateException("Already frozen");
        }
        this.d = true;
        xue xueVar = this.a;
        return (xueVar == null || !this.c.isEmpty()) ? this : xueVar;
    }

    public final boolean f() {
        return this == xud.a;
    }

    public final Object g(woy woyVar) {
        xue xueVar;
        woy.Z(this.d);
        Object obj = this.c.get(woyVar);
        return (obj != null || (xueVar = this.a) == null) ? obj : xueVar.g(woyVar);
    }

    final boolean h(woy woyVar) {
        if (this.c.containsKey(woyVar)) {
            return true;
        }
        xue xueVar = this.a;
        return xueVar != null && xueVar.h(woyVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (xue xueVar = this; xueVar != null; xueVar = xueVar.a) {
            for (int i = 0; i < xueVar.c.d; i++) {
                sb.append("[");
                sb.append(this.c.g(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
