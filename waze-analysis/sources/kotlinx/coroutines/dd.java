package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51833a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f51834b = new ThreadLocal();

    public static final ba a() {
        return (ba) f51834b.get();
    }

    public static final ba b() {
        ThreadLocal threadLocal = f51834b;
        ba baVar = (ba) threadLocal.get();
        if (baVar != null) {
            return baVar;
        }
        h hVar = new h(Thread.currentThread());
        threadLocal.set(hVar);
        return hVar;
    }

    public static final void c() {
        f51834b.set(null);
    }

    public static final void d(ba baVar) {
        f51834b.set(baVar);
    }
}
