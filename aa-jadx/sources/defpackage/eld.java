package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class eld<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    public java.lang.Object[] a;
    public int b;
    public boolean d;
    private volatile defpackage.elc f;
    public java.util.Map c = java.util.Collections.EMPTY_MAP;
    public java.util.Map e = java.util.Collections.EMPTY_MAP;

    private final int f(java.lang.Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((defpackage.ela) this.a[i2]).a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((defpackage.ela) this.a[i4]).a);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    private final java.util.SortedMap g() {
        e();
        if (this.c.isEmpty() && !(this.c instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.c = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.c;
    }

    public final java.lang.Iterable a() {
        return this.c.isEmpty() ? java.util.Collections.EMPTY_SET : this.c.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        e();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((defpackage.ela) this.a[iF]).setValue(obj);
        }
        e();
        java.lang.Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new java.lang.Object[16];
            this.a = objArr;
        }
        int i = -(iF + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.b == 16) {
            defpackage.ela elaVar = (defpackage.ela) objArr[15];
            this.b = 15;
            g().put(elaVar.a, elaVar.b);
        }
        java.lang.Object[] objArr2 = this.a;
        int length = objArr2.length;
        java.lang.System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.a[i] = new defpackage.ela(this, comparable, obj);
        this.b++;
        return null;
    }

    public final java.lang.Object c(int i) {
        e();
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj = ((defpackage.ela) objArr[i]).b;
        java.lang.System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            java.util.Iterator it = g().entrySet().iterator();
            java.lang.Object[] objArr2 = this.a;
            int i2 = this.b;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            objArr2[i2] = new defpackage.ela(this, (java.lang.Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return f(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final java.util.Map.Entry d(int i) {
        if (i < this.b) {
            return (defpackage.ela) this.a[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i);
    }

    public final void e() {
        if (this.d) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.f == null) {
            this.f = new defpackage.elc(this);
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.eld)) {
            return super.equals(obj);
        }
        defpackage.eld eldVar = (defpackage.eld) obj;
        int size = size();
        if (size != eldVar.size()) {
            return false;
        }
        int i = this.b;
        if (i != eldVar.b) {
            return entrySet().equals(eldVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!d(i2).equals(eldVar.d(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.c.equals(eldVar.c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? (V) ((defpackage.ela) this.a[iF]).b : (V) this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.a[i2].hashCode();
        }
        return this.c.size() > 0 ? iHashCode + this.c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        e();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return (V) c(iF);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return (V) this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b + this.c.size();
    }
}
