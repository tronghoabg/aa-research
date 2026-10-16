package b.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final p f1712a;

    /* renamed from: b, reason: collision with root package name */
    private static final q f1713b;

    static {
        int i2 = c.f1687b;
        f1712a = new p();
        f1713b = new q();
    }

    public static float a(CharSequence charSequence) {
        long jD = f1713b.d(charSequence, charSequence.length());
        if (jD != 9221120237041090561L) {
            return Float.intBitsToFloat((int) jD);
        }
        throw new NumberFormatException("illegal syntax");
    }

    public static float b(char[] cArr, int i2, int i3) {
        long jC = f1712a.c(cArr, i2, i3);
        if (jC != 9221120237041090561L) {
            return Float.intBitsToFloat((int) jC);
        }
        throw new NumberFormatException("illegal syntax");
    }
}
