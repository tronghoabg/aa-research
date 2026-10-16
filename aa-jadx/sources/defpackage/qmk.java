package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmk extends defpackage.qlz {
    public final java.util.Map a = new java.util.HashMap(4);

    @Override // defpackage.qlz
    public final /* bridge */ /* synthetic */ void b(defpackage.qlz qlzVar) {
        ((defpackage.qmk) qlzVar).a.putAll(this.a);
    }

    public final java.lang.String toString() {
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(entry.getKey()));
            map.put("dimension".concat(strValueOf), entry.getValue());
        }
        return defpackage.qlz.a(map, 0);
    }
}
