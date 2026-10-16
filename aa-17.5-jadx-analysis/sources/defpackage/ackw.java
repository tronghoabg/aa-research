package defpackage;

/* loaded from: classes.dex */
public final class ackw implements acku {
    private static final Object a = new Object();
    private volatile acku b;
    private volatile Object c = a;

    private ackw(acku ackuVar) {
        this.b = ackuVar;
    }

    public static acku b(acku ackuVar) {
        return ((ackuVar instanceof ackw) || (ackuVar instanceof ackq)) ? ackuVar : new ackw(ackuVar);
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final Object a() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        acku ackuVar = this.b;
        if (ackuVar == null) {
            return this.c;
        }
        Object objA = ackuVar.a();
        this.c = objA;
        this.b = null;
        return objA;
    }
}
