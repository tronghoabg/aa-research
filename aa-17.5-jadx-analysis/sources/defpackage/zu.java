package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class zu {
    public int a;
    public int b;
    public final ca c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final kwp h;

    public zu(int i) {
        this.a = i;
        if (i <= 0) {
            ca.Y("maxSize <= 0");
        }
        this.h = new kwp((char[]) null, (char[]) null);
        this.c = new ca();
    }

    private final int g(Object obj, Object obj2) {
        int iA = a(obj, obj2);
        if (iA < 0) {
            ca.Z(a.bt(obj2, obj, "Negative size: ", "="));
        }
        return iA;
    }

    protected int a(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    public final Object b(Object obj) {
        obj.getClass();
        synchronized (this.c) {
            Object obj2 = ((LinkedHashMap) this.h.a).get(obj);
            if (obj2 != null) {
                this.f++;
                return obj2;
            }
            this.g++;
            return null;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object objX;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            this.d++;
            this.b += g(obj, obj2);
            objX = this.h.x(obj, obj2);
            if (objX != null) {
                this.b -= g(obj, objX);
            }
        }
        if (objX != null) {
            f(obj, objX, obj2);
        }
        e(this.a);
        return objX;
    }

    public final Object d(Object obj) {
        Object objY;
        synchronized (this.c) {
            objY = this.h.y(obj);
            if (objY != null) {
                this.b -= g(obj, objY);
            }
        }
        if (objY != null) {
            f(obj, objY, null);
        }
        return objY;
    }

    public final void e(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                if (this.b < 0 || (this.h.z() && this.b != 0)) {
                    ca.Z("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.b <= i) {
                    break;
                }
                kwp kwpVar = this.h;
                if (!kwpVar.z()) {
                    Set setEntrySet = ((LinkedHashMap) kwpVar.a).entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) woy.bG(setEntrySet);
                    if (entry == null) {
                        break;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    kwpVar.y(key);
                    this.b -= g(key, value);
                    this.e++;
                } else {
                    break;
                }
            }
            f(key, value, null);
        }
    }

    protected void f(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            int i = this.f;
            int i2 = this.g;
            int i3 = i + i2;
            int i4 = i3 != 0 ? (i * 100) / i3 : 0;
            str = "LruCache[maxSize=" + this.a + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i4 + "%]";
        }
        return str;
    }

    public zu() {
        throw null;
    }
}
