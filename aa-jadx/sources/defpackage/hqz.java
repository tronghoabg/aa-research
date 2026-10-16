package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hqz {
    public final int a;
    public final byte[] b;
    public final java.util.Map c;
    public final java.util.List d;
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    public hqz(int i, byte[] bArr, boolean z, java.util.List list) {
        java.util.Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = java.util.Collections.EMPTY_MAP;
        } else {
            treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.hqw hqwVar = (defpackage.hqw) it.next();
                treeMap.put(hqwVar.a, hqwVar.b);
            }
        }
        this(i, bArr, treeMap, list, z);
    }

    public hqz(int i, byte[] bArr, java.util.Map map, java.util.List list, boolean z) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = list == null ? null : j$.util.DesugarCollections.unmodifiableList(list);
        this.e = z;
    }
}
