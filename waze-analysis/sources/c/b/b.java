package c.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f1715a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile e f1716b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f1717c = f1715a;

    private b(e eVar) {
        this.f1716b = eVar;
    }

    public static e a(e eVar) {
        return eVar instanceof b ? eVar : new b(eVar);
    }

    private final synchronized Object b() {
        Object obj = this.f1717c;
        Object obj2 = f1715a;
        if (obj != obj2) {
            return obj;
        }
        Object obj3 = this.f1716b.get();
        Object obj4 = this.f1717c;
        if (obj4 != obj2 && obj4 != obj3) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj3 + ". This is likely due to a circular dependency.");
        }
        this.f1717c = obj3;
        this.f1716b = null;
        return obj3;
    }

    @Override // g.a.a, f.a.a
    public final T get() {
        T t = (T) this.f1717c;
        return t == f1715a ? (T) b() : t;
    }
}
