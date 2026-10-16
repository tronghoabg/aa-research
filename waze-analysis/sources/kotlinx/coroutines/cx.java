package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ cx f51820a = new cx();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f51821b;

    /* renamed from: c, reason: collision with root package name */
    private static final StackTraceElement f51822c;

    /* renamed from: d, reason: collision with root package name */
    private static final StackTraceElement f51823d;

    /* renamed from: e, reason: collision with root package name */
    private static final StackTraceElement f51824e;

    /* renamed from: f, reason: collision with root package name */
    private static final StackTraceElement f51825f;

    static {
        int i2 = kotlinx.coroutines.c.d.f51787a;
        boolean z = true;
        if (!kotlinx.coroutines.c.d.a() && ai.c()) {
            z = false;
        }
        f51821b = z;
        f51822c = new StackTraceElement("kotlinx.coroutines", "launch", null, -1);
        f51823d = new StackTraceElement("kotlinx.coroutines", "async", null, -1);
        f51824e = new StackTraceElement("kotlinx.coroutines.guava", "future", null, -1);
        f51825f = new StackTraceElement("kotlinx.coroutines", "runBlocking", null, -1);
    }

    public final StackTraceElement a() {
        return f51823d;
    }

    public final StackTraceElement b() {
        return f51824e;
    }

    public final StackTraceElement c() {
        return f51822c;
    }

    public final StackTraceElement d() {
        return f51825f;
    }

    public final boolean e() {
        return f51821b;
    }
}
