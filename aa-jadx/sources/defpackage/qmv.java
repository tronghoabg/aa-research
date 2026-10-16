package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmv {
    final java.util.Map a = new java.util.HashMap();

    public final java.util.Map a(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            java.lang.String strValueOf = java.lang.String.valueOf((java.lang.String) entry.getKey());
            map.put(str.concat(strValueOf), (java.lang.String) entry.getValue());
        }
        return map;
    }

    public final java.lang.String toString() {
        return defpackage.qlz.a(this.a, 1);
    }
}
