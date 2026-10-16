package defpackage;

/* loaded from: classes2.dex */
public final class psr implements ackk {
    final xyc a;
    volatile transient boolean b;
    transient Object c;

    public psr(xyc xycVar) {
        this.a = xycVar;
    }

    public static psr b(Object obj) {
        return new psr(new xyf(obj));
    }

    @Override // defpackage.ackk
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object objGu = this.a.gu();
                    this.c = objGu;
                    this.b = true;
                    return objGu;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        return "LazySingleton.of(" + this.a.toString() + ")";
    }
}
