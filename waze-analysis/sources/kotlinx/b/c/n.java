package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f51086a;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f51086a = z;
    }

    public static final bo a(h.g.a.p pVar) {
        h.g.b.x.f(pVar, "factory");
        return f51086a ? new u(pVar) : new z(pVar);
    }

    public static final cb b(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "factory");
        return f51086a ? new s(lVar) : new y(lVar);
    }
}
