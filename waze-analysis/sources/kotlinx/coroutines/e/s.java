package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f51915a;

    static {
        Object objA;
        try {
            objA = Class.forName("android.os.Build");
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        f51915a = h.m.e(objA);
    }

    public static final boolean a() {
        return f51915a;
    }
}
