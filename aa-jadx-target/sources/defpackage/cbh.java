package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class cbh {
    public static final void a(defpackage.cbi cbiVar, int i, java.lang.Object obj) {
        cbiVar.e[(cbiVar.f - cbiVar.a[cbiVar.b - 1].c) + i] = obj;
    }

    public static final void b(defpackage.cbi cbiVar, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        int i3 = cbiVar.f - cbiVar.a[cbiVar.b - 1].c;
        java.lang.Object[] objArr = cbiVar.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void c(defpackage.cbi cbiVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = cbiVar.f - cbiVar.a[cbiVar.b - 1].c;
        java.lang.Object[] objArr = cbiVar.e;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
