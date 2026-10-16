package c.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f1719a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile e f1720b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f1721c = f1719a;

    private f(e eVar) {
        this.f1720b = eVar;
    }

    public static e a(e eVar) {
        return new f(eVar);
    }

    @Override // g.a.a, f.a.a
    public final T get() {
        T t = (T) this.f1721c;
        if (t != f1719a) {
            return t;
        }
        e eVar = this.f1720b;
        if (eVar == null) {
            return (T) this.f1721c;
        }
        T t2 = (T) eVar.get();
        this.f1721c = t2;
        this.f1720b = null;
        return t2;
    }
}
