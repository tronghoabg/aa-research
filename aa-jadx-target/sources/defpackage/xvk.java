package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class xvk {
    public static final defpackage.ysr e = new defpackage.ysr(null);
    private final defpackage.xvk a;
    public final defpackage.aba c;
    public boolean d = false;

    public xvk(defpackage.xvk xvkVar, defpackage.aba abaVar) {
        if (xvkVar != null && !xvkVar.d) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = xvkVar;
        this.c = abaVar;
    }

    public static defpackage.xvi b() {
        return new defpackage.xvj(defpackage.xvj.a, new defpackage.aba(0));
    }

    public static defpackage.xvk c(java.util.Set set) {
        if (set.isEmpty()) {
            return defpackage.xvj.a;
        }
        if (set.size() == 1) {
            return (defpackage.xvk) set.iterator().next();
        }
        java.util.Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            defpackage.xvk xvkVar = (defpackage.xvk) it.next();
            do {
                i += xvkVar.c.d;
                xvkVar = xvkVar.a;
            } while (xvkVar != null);
        }
        if (i == 0) {
            return defpackage.xvj.a;
        }
        defpackage.aba abaVar = new defpackage.aba(i);
        java.util.Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            defpackage.xvk xvkVar2 = (defpackage.xvk) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    defpackage.aba abaVar2 = xvkVar2.c;
                    if (i2 >= abaVar2.d) {
                        break;
                    }
                    defpackage.ysr.bc(abaVar.put((defpackage.ysr) abaVar2.d(i2), abaVar2.g(i2)) == null, "Duplicate bindings: %s", abaVar2.d(i2));
                    i2++;
                }
                xvkVar2 = xvkVar2.a;
            } while (xvkVar2 != null);
        }
        return new defpackage.xvj(null, abaVar).e();
    }

    public static defpackage.xvk d(defpackage.xvk xvkVar, defpackage.xvk xvkVar2) {
        if (xvkVar.f()) {
            return xvkVar2;
        }
        return xvkVar2.f() ? xvkVar : c(defpackage.yhx.p(xvkVar, xvkVar2));
    }

    public final defpackage.xvk e() {
        if (this.d) {
            throw new java.lang.IllegalStateException("Already frozen");
        }
        this.d = true;
        defpackage.xvk xvkVar = this.a;
        return (xvkVar == null || !this.c.isEmpty()) ? this : xvkVar;
    }

    public final boolean f() {
        return this == defpackage.xvj.a;
    }

    public final java.lang.Object g(defpackage.ysr ysrVar) {
        defpackage.xvk xvkVar;
        defpackage.ysr.bj(this.d);
        java.lang.Object obj = this.c.get(ysrVar);
        return (obj != null || (xvkVar = this.a) == null) ? obj : xvkVar.g(ysrVar);
    }

    final boolean h(defpackage.ysr ysrVar) {
        if (this.c.containsKey(ysrVar)) {
            return true;
        }
        defpackage.xvk xvkVar = this.a;
        return xvkVar != null && xvkVar.h(ysrVar);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpanExtras<");
        for (defpackage.xvk xvkVar = this; xvkVar != null; xvkVar = xvkVar.a) {
            for (int i = 0; i < xvkVar.c.d; i++) {
                sb.append("[");
                sb.append(this.c.g(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
