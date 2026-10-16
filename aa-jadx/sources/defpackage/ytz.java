package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ytz {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final /* synthetic */ int b = 0;

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract boolean d(defpackage.ytz ytzVar);

    public abstract byte[] e();

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ytz) {
            defpackage.ytz ytzVar = (defpackage.ytz) obj;
            if (b() == ytzVar.b() && d(ytzVar)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return e();
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrF = f();
        int i = bArrF[0] & 255;
        for (int i2 = 1; i2 < bArrF.length; i2++) {
            i |= (bArrF[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final java.lang.String toString() {
        byte[] bArrF = f();
        int length = bArrF.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (byte b2 : bArrF) {
            char[] cArr = a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
