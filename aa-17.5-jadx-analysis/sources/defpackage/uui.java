package defpackage;

/* loaded from: classes3.dex */
public final class uui {
    private static volatile boolean a = false;

    public static void a() {
        if (!b()) {
            throw new IllegalStateException("Not on render thread");
        }
    }

    public static boolean b() {
        return Thread.currentThread() instanceof utv;
    }
}
