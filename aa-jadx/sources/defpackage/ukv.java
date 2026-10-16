package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ukv {
    public static final int a;
    public static final int b;
    public static final int c;
    private static final int d;

    static {
        int i = defpackage.tpm.l(0.0d, 180.0d).a;
        a = i;
        b = i + 1;
        c = i + 17;
        d = defpackage.tpm.l(0.0d, 90.0d).a;
    }

    public static int a(int i, int i2) {
        int i3 = i + 1;
        return i3 < i2 ? i3 : i3 % i2;
    }

    public static boolean b(int i, int i2) {
        int i3;
        int iAbs = java.lang.Math.abs(i2);
        int i4 = b;
        return iAbs != i4 && java.lang.Math.abs(i) != i4 && (i3 = d) <= i && i <= i4 && (-i4) <= i2 && i2 <= (-i3);
    }
}
