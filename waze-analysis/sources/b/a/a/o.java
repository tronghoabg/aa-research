package b.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final m f1710a;

    /* renamed from: b, reason: collision with root package name */
    private static final n f1711b;

    static {
        int i2 = c.f1687b;
        f1710a = new m();
        f1711b = new n();
    }

    public static double a(CharSequence charSequence) {
        long jD = f1711b.d(charSequence, charSequence.length());
        if (jD != 9221120237041090561L) {
            return Double.longBitsToDouble(jD);
        }
        throw new NumberFormatException("illegal syntax");
    }

    public static double b(char[] cArr, int i2, int i3) {
        long jC = f1710a.c(cArr, i2, i3);
        if (jC != 9221120237041090561L) {
            return Double.longBitsToDouble(jC);
        }
        throw new NumberFormatException("illegal syntax");
    }
}
