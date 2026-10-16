package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeut {
    public static final java.lang.Object[] a = new java.lang.Object[0];
    public static final java.lang.Object[] b = new java.lang.Object[0];

    public static void a(java.lang.Object[] objArr, int i, int i2) {
        defpackage.aefc.b(objArr.length, i, i2);
    }

    public static void b(java.lang.Object[] objArr) {
        java.util.Arrays.sort(objArr, 0, objArr.length);
    }

    public static void c(java.lang.Object[] objArr, java.util.Comparator comparator) {
        java.util.Arrays.sort(objArr, 0, objArr.length, comparator);
    }
}
