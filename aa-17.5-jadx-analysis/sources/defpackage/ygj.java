package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class ygj {
    public Map a;

    public yff d(int i) {
        int i2 = yfq.d;
        wub.G(i, "expectedSize");
        return new yfl(i);
    }

    final Map e() {
        Map map = this.a;
        if (map != null) {
            return map;
        }
        ycx ycxVar = new ycx();
        this.a = ycxVar;
        return ycxVar;
    }

    public final void f(Object obj, Object obj2) {
        wub.E(obj, obj2);
        yff yffVarD = (yff) e().get(obj);
        if (yffVarD == null) {
            yffVarD = d(4);
            e().put(obj, yffVarD);
        }
        yffVarD.c(obj2);
    }

    public final void g(Object obj, Iterable iterable) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(yrm.ap(iterable)));
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            yff yffVarD = (yff) e().get(obj);
            if (yffVarD == null) {
                yffVarD = d(h(iterable));
                e().put(obj, yffVarD);
            }
            while (it.hasNext()) {
                Object next = it.next();
                wub.E(obj, next);
                yffVarD.c(next);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int h(Iterable iterable) {
        if (iterable instanceof Collection) {
            return Math.max(4, iterable.size());
        }
        return 4;
    }
}
