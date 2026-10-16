package defpackage;

/* loaded from: classes2.dex */
public final class sxe {
    private static roc a;

    public static synchronized void a() {
        if (a == null) {
            b(new roc());
        }
    }

    public static synchronized void b(roc rocVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = rocVar;
    }
}
