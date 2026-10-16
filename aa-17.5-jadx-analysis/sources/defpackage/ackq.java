package defpackage;

/* loaded from: classes.dex */
public final class ackq implements acku, ackk {
    private static final Object a = new Object();
    private volatile acku b;
    private volatile Object c = a;

    private ackq(acku ackuVar) {
        this.b = ackuVar;
    }

    public static ackk b(acku ackuVar) {
        if (ackuVar instanceof ackk) {
            return (ackk) ackuVar;
        }
        ackuVar.getClass();
        return new ackq(ackuVar);
    }

    public static acku c(acku ackuVar) {
        return ackuVar instanceof ackq ? ackuVar : new ackq(ackuVar);
    }

    private final synchronized Object d() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        Object objA = this.b.a();
        Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != objA) {
            throw new IllegalStateException(a.bw(objA, obj3, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
        }
        this.c = objA;
        this.b = null;
        return objA;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final Object a() {
        Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
