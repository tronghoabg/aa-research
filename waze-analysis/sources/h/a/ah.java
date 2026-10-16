package h.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah<T> implements Iterable<ag<? extends T>>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f47972a;

    public ah(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "iteratorFactory");
        this.f47972a = aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<ag<T>> iterator() {
        return new ai((Iterator) this.f47972a.invoke());
    }
}
