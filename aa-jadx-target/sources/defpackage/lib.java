package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lib<R, T> implements defpackage.afhl<R, T> {
    public volatile java.lang.Object a = defpackage.lic.a;
    public final java.lang.Object b = this;
    private final defpackage.affc c;
    private final defpackage.lhw d;

    public lib(defpackage.affc affcVar, defpackage.lhw lhwVar) {
        this.c = affcVar;
        this.d = lhwVar;
        if (!(lhwVar instanceof defpackage.lhu) || ((defpackage.lhu) lhwVar).a) {
            ((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).fV(new defpackage.lia(this));
        }
    }

    @Override // defpackage.afhl
    public final T getValue(R r, defpackage.afja<?> afjaVar) {
        T t;
        afjaVar.getClass();
        T t2 = (T) this.a;
        defpackage.lic licVar = defpackage.lic.a;
        if (t2 != licVar) {
            return t2;
        }
        synchronized (this.b) {
            if (this.a != licVar) {
                t = (T) this.a;
            } else {
                defpackage.lhw lhwVar = this.d;
                if ((lhwVar == defpackage.lhv.b && !((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).fY()) || (lhwVar == defpackage.lhv.a && !((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).g())) {
                    throw new lhz("Attempting to access before lifetime started");
                }
                if (!((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).i()) {
                    java.lang.Object objInvoke = this.c.invoke(r);
                    this.a = objInvoke;
                    t = (T) objInvoke;
                } else {
                    if (!(lhwVar instanceof defpackage.lhu)) {
                        throw new lhz("Attempted to access when stopping or after lifetime stopped");
                    }
                    t = (T) this.c.invoke(r);
                }
            }
        }
        return t;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.a);
    }
}
