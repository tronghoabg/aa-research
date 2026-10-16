package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aao {
    public static final java.lang.Object[] a = new java.lang.Object[0];
    public static final defpackage.aan b = new defpackage.aan(0);

    public static final void a(java.util.List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            defpackage.ca.aa(defpackage.a.bz(size, i, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(java.util.List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            defpackage.ca.Y(defpackage.a.bz(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
        }
        if (i < 0) {
            defpackage.ca.aa(defpackage.a.bm(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 > size) {
            defpackage.ca.aa(defpackage.a.bz(size, i2, "toIndex (", ") is more than than the list size (", ")"));
        }
    }

    public static final defpackage.aan c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.aan aanVar = new defpackage.aan(2);
        aanVar.p(obj);
        aanVar.p(obj2);
        return aanVar;
    }
}
