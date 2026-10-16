package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zdw {
    static final zdw a = new zdt();
    public static final zdw b = new zdu();

    /* JADX WARN: Multi-variable type inference failed */
    private final int e(Object obj, Map map) {
        Integer num = (Integer) map.get(obj);
        if (num != null) {
            return num.intValue();
        }
        boolean zIsInterface = a(obj).isInterface();
        Iterator it = b(obj).iterator();
        int iMax = zIsInterface;
        while (it.hasNext()) {
            iMax = Math.max(iMax, e(it.next(), map));
        }
        Object objC = c(obj);
        int iMax2 = iMax;
        if (objC != null) {
            iMax2 = Math.max(iMax, e(objC, map));
        }
        int i = iMax2 + 1;
        map.put(obj, Integer.valueOf(i));
        return i;
    }

    public abstract Class a(Object obj);

    public abstract Iterable b(Object obj);

    public abstract Object c(Object obj);

    public final yfq d(Iterable iterable) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            e(it.next(), map);
        }
        return yfq.z(new zdv(ymd.a, map), map.keySet());
    }
}
