package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class hxl {
    private final hxh a = new hxh();
    private final hxk b = new hxk();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final int e;
    private int f;

    public hxl(int i) {
        this.e = i;
    }

    private final hxc f(Class cls) {
        hxi hxiVar;
        Map map = this.d;
        hxc hxcVar = (hxc) map.get(cls);
        if (hxcVar != null) {
            return hxcVar;
        }
        if (cls.equals(int[].class)) {
            hxiVar = new hxi(0);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            hxiVar = new hxi(1);
        }
        map.put(cls, hxiVar);
        return hxiVar;
    }

    private final Object g(hxj hxjVar, Class cls) {
        hxh hxhVar = this.a;
        hxc hxcVarF = f(cls);
        Object objA = hxhVar.a(hxjVar);
        if (objA != null) {
            this.f -= hxcVarF.a(objA) * hxcVarF.b();
            i(hxcVarF.a(objA), cls);
        }
        if (objA != null) {
            return objA;
        }
        if (Log.isLoggable(hxcVarF.d(), 2)) {
            Log.v(hxcVarF.d(), "Allocated " + hxjVar.a + " bytes");
        }
        return hxcVarF.c(hxjVar.a);
    }

    private final NavigableMap h(Class cls) {
        Map map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer numValueOf = Integer.valueOf(i);
        Integer num = (Integer) navigableMapH.get(numValueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(numValueOf);
                return;
            } else {
                navigableMapH.put(numValueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            Object objB = this.a.b();
            a.al(objB, "Argument must not be null");
            hxc hxcVarF = f(objB.getClass());
            this.f -= hxcVarF.a(objB) * hxcVarF.b();
            i(hxcVarF.a(objB), objB.getClass());
            if (Log.isLoggable(hxcVarF.d(), 2)) {
                Log.v(hxcVarF.d(), "evicted: " + hxcVarF.a(objB));
            }
        }
    }

    public final synchronized Object a(int i, Class cls) {
        Integer num;
        int i2;
        num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        return g((num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) ? this.b.d(i, cls) : this.b.d(num.intValue(), cls), cls);
    }

    public final synchronized void b() {
        j(0);
    }

    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        hxc hxcVarF = f(cls);
        int iA = hxcVarF.a(obj);
        int iB = hxcVarF.b() * iA;
        int i = this.e;
        if (iB <= (i >> 1)) {
            hxj hxjVarD = this.b.d(iA, cls);
            this.a.c(hxjVarD, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(hxjVarD.a));
            Integer numValueOf = Integer.valueOf(hxjVarD.a);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            j(i);
        }
    }

    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            j(this.e >> 1);
        }
    }

    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }
}
