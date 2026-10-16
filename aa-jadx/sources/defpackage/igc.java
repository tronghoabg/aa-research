package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class igc {
    private final java.util.Map a = new java.util.LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public igc(long j) {
        this.b = j;
    }

    protected int a(java.lang.Object obj) {
        return 1;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized java.lang.Object f(java.lang.Object obj) {
        defpackage.acku ackuVar = (defpackage.acku) this.a.get(obj);
        if (ackuVar == null) {
            return null;
        }
        return ackuVar.b;
    }

    public final synchronized java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        int iA = a(obj2);
        long j = iA;
        long j2 = this.b;
        if (j >= j2) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        defpackage.acku ackuVar = (defpackage.acku) this.a.put(obj, obj2 == null ? null : new defpackage.acku(obj2, iA));
        if (ackuVar != null) {
            this.c -= (long) ackuVar.a;
            java.lang.Object obj3 = ackuVar.b;
            if (!obj3.equals(obj2)) {
                c(obj, obj3);
            }
        }
        i(j2);
        if (ackuVar != null) {
            return ackuVar.b;
        }
        return null;
    }

    public final synchronized java.lang.Object h(java.lang.Object obj) {
        defpackage.acku ackuVar = (defpackage.acku) this.a.remove(obj);
        if (ackuVar == null) {
            return null;
        }
        this.c -= (long) ackuVar.a;
        return ackuVar.b;
    }

    public final synchronized void i(long j) {
        while (this.c > j) {
            java.util.Iterator it = this.a.entrySet().iterator();
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            defpackage.acku ackuVar = (defpackage.acku) entry.getValue();
            this.c -= (long) ackuVar.a;
            java.lang.Object key = entry.getKey();
            it.remove();
            c(key, ackuVar.b);
        }
    }

    protected void c(java.lang.Object obj, java.lang.Object obj2) {
    }
}
