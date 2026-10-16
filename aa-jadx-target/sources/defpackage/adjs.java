package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adjs {
    public static final defpackage.adjs a;
    private static final java.util.IdentityHashMap c;
    public final java.util.IdentityHashMap b;

    static {
        java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap();
        c = identityHashMap;
        a = new defpackage.adjs(identityHashMap);
    }

    public adjs(java.util.IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public final java.lang.Object a(defpackage.adjr adjrVar) {
        return this.b.get(adjrVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        java.util.IdentityHashMap identityHashMap = this.b;
        java.util.IdentityHashMap identityHashMap2 = ((defpackage.adjs) obj).b;
        if (identityHashMap.size() != identityHashMap2.size()) {
            return false;
        }
        for (java.util.Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !j$.util.Objects.equals(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHash = 0;
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            iHash += j$.util.Objects.hash(new java.lang.Object[]{entry.getKey(), entry.getValue()});
        }
        return iHash;
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}
