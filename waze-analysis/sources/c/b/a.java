package c.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name */
    private e f1714a;

    public static void a(e eVar, e eVar2) {
        a aVar = (a) eVar;
        if (aVar.f1714a != null) {
            throw new IllegalStateException();
        }
        aVar.f1714a = eVar2;
    }

    @Override // g.a.a, f.a.a
    public final T get() {
        e eVar = this.f1714a;
        if (eVar != null) {
            return (T) eVar.get();
        }
        throw new IllegalStateException();
    }
}
