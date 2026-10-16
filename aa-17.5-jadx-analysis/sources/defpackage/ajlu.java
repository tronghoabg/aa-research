package defpackage;

/* loaded from: classes2.dex */
public final class ajlu {
    public static final String a = "xn--";
    public static final ajnb b;

    static {
        ajnb ajnbVar = ajnb.a;
        b = ahfd.b("xn--");
    }

    public static final int a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = i3 + (i3 / i2);
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return i5 + ((i4 * 36) / (i4 + 38));
    }

    public static final int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        throw new IllegalStateException(a.bp(i, "unexpected digit: "));
    }
}
