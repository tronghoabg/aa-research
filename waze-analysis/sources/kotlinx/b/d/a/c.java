package kotlinx.b.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f51153a;

    static {
        Object objA;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objA = property != null ? h.n.o.f(property) : null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Integer num = (Integer) (true != (objA instanceof h.l) ? objA : null);
        f51153a = num != null ? num.intValue() : 2097152;
    }
}
