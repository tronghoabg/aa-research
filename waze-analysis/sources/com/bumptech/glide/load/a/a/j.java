package com.bumptech.glide.load.a.a;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final f f2951a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final i f2952b = new i();

    /* renamed from: c, reason: collision with root package name */
    private final Map f2953c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f2954d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f2955e;

    /* renamed from: f, reason: collision with root package name */
    private int f2956f;

    public j(int i2) {
        this.f2955e = i2;
    }

    private final a f(Class cls) {
        g gVar;
        Map map = this.f2954d;
        a aVar = (a) map.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            gVar = new g(0);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            gVar = new g(1);
        }
        map.put(cls, gVar);
        return gVar;
    }

    private final Object g(h hVar, Class cls) {
        f fVar = this.f2951a;
        a aVarF = f(cls);
        Object objA = fVar.a(hVar);
        if (objA != null) {
            this.f2956f -= aVarF.a(objA) * aVarF.b();
            i(aVarF.a(objA), cls);
        }
        if (objA != null) {
            return objA;
        }
        if (Log.isLoggable(aVarF.d(), 2)) {
            Log.v(aVarF.d(), "Allocated " + hVar.f2948a + " bytes");
        }
        return aVarF.c(hVar.f2948a);
    }

    private final NavigableMap h(Class cls) {
        Map map = this.f2953c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i2, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer numValueOf = Integer.valueOf(i2);
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
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + toString());
    }

    private final void j(int i2) {
        while (this.f2956f > i2) {
            Object objB = this.f2951a.b();
            com.bumptech.glide.g.p.f(objB);
            a aVarF = f(objB.getClass());
            this.f2956f -= aVarF.a(objB) * aVarF.b();
            i(aVarF.a(objB), objB.getClass());
            if (Log.isLoggable(aVarF.d(), 2)) {
                Log.v(aVarF.d(), "evicted: " + aVarF.a(objB));
            }
        }
    }

    public final synchronized Object a(int i2, Class cls) {
        Integer num;
        int i3;
        num = (Integer) h(cls).ceilingKey(Integer.valueOf(i2));
        return g((num == null || ((i3 = this.f2956f) != 0 && this.f2955e / i3 < 2 && num.intValue() > i2 * 8)) ? this.f2952b.d(i2, cls) : this.f2952b.d(num.intValue(), cls), cls);
    }

    public final synchronized void b() {
        j(0);
    }

    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        a aVarF = f(cls);
        int iA = aVarF.a(obj);
        int iB = aVarF.b() * iA;
        int i2 = this.f2955e;
        if (iB <= (i2 >> 1)) {
            h hVarD = this.f2952b.d(iA, cls);
            this.f2951a.c(hVarD, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(hVarD.f2948a));
            Integer numValueOf = Integer.valueOf(hVarD.f2948a);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f2956f += iB;
            j(i2);
        }
    }

    public final synchronized void d(int i2) {
        if (i2 >= 40) {
            b();
        } else if (i2 >= 20 || i2 == 15) {
            j(this.f2955e >> 1);
        }
    }

    public final synchronized Object e(Class cls) {
        return g(this.f2952b.d(8, cls), cls);
    }
}
