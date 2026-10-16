package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zfc {
    static final defpackage.zfc a = new defpackage.zez();
    public static final defpackage.zfc b = new defpackage.zfa();

    /* JADX WARN: Multi-variable type inference failed */
    private final int e(java.lang.Object obj, java.util.Map map) {
        java.lang.Integer num = (java.lang.Integer) map.get(obj);
        if (num != null) {
            return num.intValue();
        }
        boolean zIsInterface = a(obj).isInterface();
        java.util.Iterator it = b(obj).iterator();
        int iMax = zIsInterface;
        while (it.hasNext()) {
            iMax = java.lang.Math.max(iMax, e(it.next(), map));
        }
        java.lang.Object objC = c(obj);
        int iMax2 = iMax;
        if (objC != null) {
            iMax2 = java.lang.Math.max(iMax, e(objC, map));
        }
        int i = iMax2 + 1;
        map.put(obj, java.lang.Integer.valueOf(i));
        return i;
    }

    public abstract java.lang.Class a(java.lang.Object obj);

    public abstract java.lang.Iterable b(java.lang.Object obj);

    public abstract java.lang.Object c(java.lang.Object obj);

    public final defpackage.ygw d(java.lang.Iterable iterable) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            e(it.next(), map);
        }
        return defpackage.ygw.z(new defpackage.zfb(defpackage.yni.a, map), map.keySet());
    }
}
