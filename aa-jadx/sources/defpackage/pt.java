package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pt<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {
    defpackage.pp a;
    private defpackage.pp c;
    public final java.util.WeakHashMap b = new java.util.WeakHashMap();
    private int d = 0;

    protected final defpackage.pp a(java.lang.Object obj) {
        defpackage.pp ppVar = this.a;
        while (ppVar != null && !ppVar.a.equals(obj)) {
            ppVar = ppVar.c;
        }
        return ppVar;
    }

    public final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.pp ppVarA = a(obj);
        if (ppVarA != null) {
            return ppVarA.b;
        }
        defpackage.pp ppVar = new defpackage.pp(obj, obj2);
        this.d++;
        defpackage.pp ppVar2 = this.c;
        if (ppVar2 == null) {
            this.a = ppVar;
        } else {
            ppVar2.c = ppVar;
            ppVar.d = ppVar2;
        }
        this.c = ppVar;
        return null;
    }

    public final java.lang.Object c(java.lang.Object obj) {
        defpackage.pp ppVarA = a(obj);
        if (ppVarA == null) {
            return null;
        }
        this.d--;
        java.util.WeakHashMap weakHashMap = this.b;
        if (!weakHashMap.isEmpty()) {
            java.util.Iterator<K> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((defpackage.ps) it.next()).b(ppVarA);
            }
        }
        defpackage.pp ppVar = ppVarA.d;
        defpackage.pp ppVar2 = ppVarA.c;
        if (ppVar != null) {
            ppVar.c = ppVar2;
        } else {
            this.a = ppVar2;
        }
        defpackage.pp ppVar3 = ppVarA.c;
        if (ppVar3 != null) {
            ppVar3.d = ppVar;
        } else {
            this.c = ppVar;
        }
        ppVarA.c = null;
        ppVarA.d = null;
        return ppVarA.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.pt)) {
            return false;
        }
        defpackage.pt ptVar = (defpackage.pt) obj;
        if (this.d != ptVar.d) {
            return false;
        }
        java.util.Iterator<java.util.Map.Entry<K, V>> it = iterator();
        java.util.Iterator<java.util.Map.Entry<K, V>> it2 = ptVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            java.util.Map.Entry<K, V> next2 = it2.next();
            if (next != null) {
                if (next != null || next.equals(next2)) {
                }
            } else if (next2 == null) {
                next2 = null;
                if (next != null) {
                }
            }
            return false;
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final int hashCode() {
        java.util.Iterator<java.util.Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        defpackage.pr prVar = new defpackage.pr(this.a, this.c);
        this.b.put(prVar, java.lang.Boolean.FALSE);
        return prVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator<java.util.Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
