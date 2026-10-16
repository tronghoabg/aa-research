package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxu {
    private final defpackage.hxq a = new defpackage.hxq();
    private final defpackage.hxt b = new defpackage.hxt();
    private final java.util.Map c = new java.util.HashMap();
    private final java.util.Map d = new java.util.HashMap();
    private final int e;
    private int f;

    public hxu(int i) {
        this.e = i;
    }

    private final defpackage.hxl f(java.lang.Class cls) {
        defpackage.hxr hxrVar;
        java.util.Map map = this.d;
        defpackage.hxl hxlVar = (defpackage.hxl) map.get(cls);
        if (hxlVar != null) {
            return hxlVar;
        }
        if (cls.equals(int[].class)) {
            hxrVar = new defpackage.hxr(0);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new java.lang.IllegalArgumentException("No array pool found for: ".concat(java.lang.String.valueOf(cls.getSimpleName())));
            }
            hxrVar = new defpackage.hxr(1);
        }
        map.put(cls, hxrVar);
        return hxrVar;
    }

    private final java.lang.Object g(defpackage.hxs hxsVar, java.lang.Class cls) {
        defpackage.hxq hxqVar = this.a;
        defpackage.hxl hxlVarF = f(cls);
        java.lang.Object objA = hxqVar.a(hxsVar);
        if (objA != null) {
            this.f -= hxlVarF.a(objA) * hxlVarF.b();
            i(hxlVarF.a(objA), cls);
        }
        if (objA != null) {
            return objA;
        }
        if (android.util.Log.isLoggable(hxlVarF.d(), 2)) {
            android.util.Log.v(hxlVarF.d(), "Allocated " + hxsVar.a + " bytes");
        }
        return hxlVarF.c(hxsVar.a);
    }

    private final java.util.NavigableMap h(java.lang.Class cls) {
        java.util.Map map = this.c;
        java.util.NavigableMap navigableMap = (java.util.NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, java.lang.Class cls) {
        java.util.NavigableMap navigableMapH = h(cls);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Integer num = (java.lang.Integer) navigableMapH.get(numValueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(numValueOf);
                return;
            } else {
                navigableMapH.put(numValueOf, java.lang.Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            java.lang.Object objB = this.a.b();
            defpackage.a.ak(objB, "Argument must not be null");
            defpackage.hxl hxlVarF = f(objB.getClass());
            this.f -= hxlVarF.a(objB) * hxlVarF.b();
            i(hxlVarF.a(objB), objB.getClass());
            if (android.util.Log.isLoggable(hxlVarF.d(), 2)) {
                android.util.Log.v(hxlVarF.d(), "evicted: " + hxlVarF.a(objB));
            }
        }
    }

    public final synchronized java.lang.Object a(int i, java.lang.Class cls) {
        java.lang.Integer num;
        int i2;
        num = (java.lang.Integer) h(cls).ceilingKey(java.lang.Integer.valueOf(i));
        return g((num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) ? this.b.d(i, cls) : this.b.d(num.intValue(), cls), cls);
    }

    public final synchronized void b() {
        j(0);
    }

    public final synchronized void c(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        defpackage.hxl hxlVarF = f(cls);
        int iA = hxlVarF.a(obj);
        int iB = hxlVarF.b() * iA;
        int i = this.e;
        if (iB <= (i >> 1)) {
            defpackage.hxs hxsVarD = this.b.d(iA, cls);
            this.a.c(hxsVarD, obj);
            java.util.NavigableMap navigableMapH = h(cls);
            java.lang.Integer num = (java.lang.Integer) navigableMapH.get(java.lang.Integer.valueOf(hxsVarD.a));
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(hxsVarD.a);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, java.lang.Integer.valueOf(iIntValue));
            this.f += iB;
            j(i);
        }
    }

    public final synchronized void d(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20 || i == 15) {
                j(this.e >> 1);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized java.lang.Object e(java.lang.Class cls) {
        return g(this.b.d(8, cls), cls);
    }
}
