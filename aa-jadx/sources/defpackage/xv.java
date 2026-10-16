package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xv implements java.lang.AutoCloseable {
    public final java.util.ArrayDeque a;
    private java.lang.String[] b;

    private xv(java.lang.Object obj, java.lang.String str, java.util.ArrayDeque arrayDeque) {
        this.a = arrayDeque;
        if (obj != null) {
            defpackage.xu xuVar = new defpackage.xu(obj, str);
            arrayDeque.addFirst(xuVar);
            if (android.util.Log.isLoggable("CarApp.Bun", 2)) {
                int size = arrayDeque.size();
                int i = 11;
                int iMin = java.lang.Math.min(size, 11);
                java.lang.String[] strArr = this.b;
                if (strArr == null) {
                    strArr = new java.lang.String[12];
                    this.b = strArr;
                }
                java.lang.String strConcat = strArr[iMin];
                if (strConcat == null) {
                    char[] cArr = new char[iMin];
                    java.util.Arrays.fill(cArr, ' ');
                    java.lang.String str2 = new java.lang.String(cArr);
                    if (iMin == 11) {
                        strConcat = str2.concat("...");
                    } else {
                        i = iMin;
                        strConcat = str2;
                    }
                    this.b[i] = strConcat;
                }
                android.util.Log.v("CarApp.Bun", strConcat.concat(defpackage.xx.e(xuVar.a.getClass()) + " " + xuVar.b));
            }
        }
    }

    public static defpackage.xv a() {
        return new defpackage.xv(null, "", new java.util.ArrayDeque());
    }

    static defpackage.xv b(java.lang.Object obj, java.lang.String str, defpackage.xv xvVar) {
        return new defpackage.xv(obj, str, xvVar.a);
    }

    final java.lang.String c() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayDeque arrayDeque = this.a;
        int iMin = java.lang.Math.min(arrayDeque.size(), 8);
        java.util.Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            int i = iMin - 1;
            if (iMin <= 0) {
                break;
            }
            sb.append(((defpackage.xu) itDescendingIterator.next()).a());
            iMin = i;
        }
        if (itDescendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.removeFirst();
    }
}
