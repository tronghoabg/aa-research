package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yhp {
    public java.util.Map a;

    public defpackage.ygl d(int i) {
        int i2 = defpackage.ygw.d;
        defpackage.ysr.aL(i, "expectedSize");
        return new defpackage.ygr(i);
    }

    final java.util.Map e() {
        java.util.Map map = this.a;
        if (map != null) {
            return map;
        }
        defpackage.yed yedVar = new defpackage.yed();
        this.a = yedVar;
        return yedVar;
    }

    public final void f(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ysr.aJ(obj, obj2);
        defpackage.ygl yglVarD = (defpackage.ygl) e().get(obj);
        if (yglVarD == null) {
            yglVarD = d(4);
            e().put(obj, yglVarD);
        }
        yglVarD.c(obj2);
    }

    public final void g(java.lang.Object obj, java.lang.Iterable iterable) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=".concat(defpackage.ysr.ap(iterable)));
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            defpackage.ygl yglVarD = (defpackage.ygl) e().get(obj);
            if (yglVarD == null) {
                yglVarD = d(h(iterable));
                e().put(obj, yglVarD);
            }
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                defpackage.ysr.aJ(obj, next);
                yglVarD.c(next);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int h(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return java.lang.Math.max(4, iterable.size());
        }
        return 4;
    }
}
