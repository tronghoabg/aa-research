package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dij {
    public final java.util.List a;

    public dij(java.util.List list) {
        this.a = list;
        int i = defpackage.dik.a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.String strA = ((defpackage.dig) list.get(i2)).a();
            i2++;
            int size2 = list.size();
            for (int i3 = i2; i3 < size2; i3++) {
                if (defpackage.afga.f(strA, ((defpackage.dig) list.get(i3)).a())) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int size3 = list.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        if (defpackage.afga.f(((defpackage.dig) list.get(i4)).a(), strA)) {
                            arrayList.add(list.get(i4));
                        }
                    }
                    defpackage.dki.c("'" + strA + "' must be unique. Actual [" + arrayList + "]");
                }
            }
        }
        int size4 = this.a.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((defpackage.dig) this.a.get(i5)).c();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.dij) && defpackage.afga.f(this.a, ((defpackage.dij) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Settings(settings=" + this.a + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dij(defpackage.dig... digVarArr) {
        digVarArr.getClass();
        java.util.List listAsList = java.util.Arrays.asList(digVarArr);
        listAsList.getClass();
        this(listAsList);
    }
}
