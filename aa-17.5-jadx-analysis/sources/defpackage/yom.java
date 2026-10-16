package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class yom {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected yom() {
    }

    protected abstract Object a();

    public final Object b(yol yolVar, ypt yptVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(yolVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(yolVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((yog) yptVar).b;
        xab xabVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (yof.f.equals(yptVar.c(i2))) {
                Object objE = yptVar.e(i2);
                if (objE instanceof yoq) {
                    if (xabVar == null) {
                        xabVar = new xab(this, yolVar, 4);
                    }
                    ((yoq) objE).a();
                }
            }
        }
        return objA;
    }
}
