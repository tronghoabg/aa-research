package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adlw {
    private static final java.lang.Object[][] a = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, 0, 2);
    private java.util.List b;
    private final defpackage.adjs c = defpackage.adjs.a;
    private java.lang.Object[][] d = a;

    public final defpackage.adly a() {
        return new defpackage.adly(this.b, this.c, this.d);
    }

    public final void b(defpackage.adlx adlxVar, java.lang.Object obj) {
        int length = 0;
        while (true) {
            java.lang.Object[][] objArr = this.d;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (adlxVar.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            java.lang.Object[][] objArr2 = this.d;
            int length2 = objArr2.length;
            java.lang.Object[][] objArr3 = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, length2 + 1, 2);
            java.lang.System.arraycopy(objArr2, 0, objArr3, 0, length2);
            this.d = objArr3;
            length = objArr3.length - 1;
        }
        this.d[length] = new java.lang.Object[]{adlxVar, obj};
    }

    public final void c(java.util.List list) {
        defpackage.ysr.aY(!list.isEmpty(), "addrs is empty");
        this.b = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
    }
}
