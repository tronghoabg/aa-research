package defpackage;

/* loaded from: classes.dex */
public final class sxi {
    private static sxh a;

    public static synchronized sxh a() {
        if (a == null) {
            b(new sxl());
        }
        return a;
    }

    public static synchronized void b(sxh sxhVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = sxhVar;
    }
}
