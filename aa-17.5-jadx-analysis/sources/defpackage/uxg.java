package defpackage;

/* loaded from: classes3.dex */
public final class uxg {
    private static final ThreadLocal a = new ThreadLocal();

    public static uxe a() {
        uxe uxeVar = (uxe) a.get();
        if (uxeVar == null) {
            return new uxe();
        }
        uxeVar.b(0);
        return uxeVar;
    }

    public static void b(uxe uxeVar) {
        uxeVar.c();
        a.set(uxeVar);
    }
}
