package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ypr {
    public final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    protected ypr() {
    }

    protected abstract java.lang.Object a();

    public final java.lang.Object b(defpackage.ypq ypqVar, defpackage.yqy yqyVar) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        java.lang.Object obj = concurrentHashMap.get(ypqVar);
        if (obj != null) {
            return obj;
        }
        java.lang.Object objA = a();
        java.lang.Object objPutIfAbsent = concurrentHashMap.putIfAbsent(ypqVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((defpackage.ypl) yqyVar).b;
        defpackage.wla wlaVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (defpackage.ypk.f.equals(yqyVar.c(i2))) {
                java.lang.Object objE = yqyVar.e(i2);
                if (objE instanceof defpackage.ypv) {
                    if (wlaVar == null) {
                        wlaVar = new defpackage.wla(this, ypqVar, 8);
                    }
                    ((defpackage.ypv) objE).a();
                }
            }
        }
        return objA;
    }
}
