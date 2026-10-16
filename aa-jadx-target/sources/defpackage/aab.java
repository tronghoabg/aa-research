package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class aab {
    public int a;
    public int b;
    public final defpackage.ca c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final defpackage.kwv h;

    public aab(int i) {
        this.a = i;
        if (i <= 0) {
            defpackage.ca.Y("maxSize <= 0");
        }
        this.h = new defpackage.kwv((char[]) null, (byte[]) null);
        this.c = new defpackage.ca();
    }

    private final int g(java.lang.Object obj, java.lang.Object obj2) {
        int iA = a(obj, obj2);
        if (iA < 0) {
            defpackage.ca.Z(defpackage.a.bs(obj2, obj, "Negative size: ", "="));
        }
        return iA;
    }

    protected int a(java.lang.Object obj, java.lang.Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        obj.getClass();
        synchronized (this.c) {
            java.lang.Object obj2 = ((java.util.LinkedHashMap) this.h.a).get(obj);
            if (obj2 != null) {
                this.f++;
                return obj2;
            }
            this.g++;
            return null;
        }
    }

    public final java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objU;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            this.d++;
            this.b += g(obj, obj2);
            objU = this.h.U(obj, obj2);
            if (objU != null) {
                this.b -= g(obj, objU);
            }
        }
        if (objU != null) {
            f(obj, objU, obj2);
        }
        e(this.a);
        return objU;
    }

    public final java.lang.Object d(java.lang.Object obj) {
        java.lang.Object objV;
        synchronized (this.c) {
            objV = this.h.V(obj);
            if (objV != null) {
                this.b -= g(obj, objV);
            }
        }
        if (objV != null) {
            f(obj, objV, null);
        }
        return objV;
    }

    public final void e(int i) {
        java.lang.Object key;
        java.lang.Object value;
        while (true) {
            synchronized (this.c) {
                if (this.b < 0 || (this.h.W() && this.b != 0)) {
                    defpackage.ca.Z("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.b <= i) {
                    break;
                }
                defpackage.kwv kwvVar = this.h;
                if (!kwvVar.W()) {
                    java.util.Set setEntrySet = ((java.util.LinkedHashMap) kwvVar.a).entrySet();
                    setEntrySet.getClass();
                    java.util.Map.Entry entry = (java.util.Map.Entry) defpackage.afga.aA(setEntrySet);
                    if (entry == null) {
                        break;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    kwvVar.V(key);
                    this.b -= g(key, value);
                    this.e++;
                } else {
                    break;
                }
            }
            f(key, value, null);
        }
    }

    protected void f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        synchronized (this.c) {
            int i = this.f;
            int i2 = this.g;
            int i3 = i + i2;
            int i4 = i3 != 0 ? (i * 100) / i3 : 0;
            str = "LruCache[maxSize=" + this.a + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i4 + "%]";
        }
        return str;
    }

    public aab() {
        throw null;
    }
}
