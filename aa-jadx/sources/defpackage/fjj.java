package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fjj {
    public static final defpackage.fjj a = defpackage.dbc.j(new java.util.LinkedHashMap());
    public final java.util.Map b;

    public fjj(defpackage.fjj fjjVar) {
        fjjVar.getClass();
        this.b = new java.util.HashMap(fjjVar.b);
    }

    public final boolean a(java.lang.String str, java.lang.Class cls) {
        java.lang.Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public final boolean equals(java.lang.Object obj) {
        boolean zF;
        if (this == obj) {
            return true;
        }
        if (obj == null || !defpackage.afga.f(getClass(), obj.getClass())) {
            return false;
        }
        java.util.Map map = this.b;
        java.util.Map map2 = ((defpackage.fjj) obj).b;
        java.util.Set<java.lang.String> setKeySet = map.keySet();
        if (!defpackage.afga.f(setKeySet, map2.keySet())) {
            return false;
        }
        for (java.lang.String str : setKeySet) {
            java.lang.Object obj2 = map.get(str);
            java.lang.Object obj3 = map2.get(str);
            if (obj2 == null || obj3 == null) {
                zF = obj2 == obj3;
            } else if (obj2 instanceof java.lang.Object[]) {
                java.lang.Object[] objArr = (java.lang.Object[]) obj2;
                if (obj3 instanceof java.lang.Object[]) {
                    zF = defpackage.afga.bw(objArr, (java.lang.Object[]) obj3);
                } else {
                    zF = defpackage.afga.f(obj2, obj3);
                }
            } else {
                zF = defpackage.afga.f(obj2, obj3);
            }
            if (!zF) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            java.lang.Object value = entry.getValue();
            iHashCode += value instanceof java.lang.Object[] ? j$.util.Objects.hashCode(entry.getKey()) ^ java.util.Arrays.deepHashCode((java.lang.Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final java.lang.String toString() {
        return "Data {" + defpackage.afga.bo(this.b.entrySet(), null, null, null, new defpackage.ews(9), 31) + "}";
    }

    public fjj(java.util.Map map) {
        this.b = new java.util.HashMap(map);
    }
}
