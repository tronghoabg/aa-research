package h.m;

import h.g.b.x;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f48181a;

    /* renamed from: b, reason: collision with root package name */
    private Object f48182b;

    /* renamed from: c, reason: collision with root package name */
    private int f48183c = -2;

    g(v vVar) {
        this.f48181a = vVar;
    }

    private final void a() {
        Object objInvoke;
        int i2 = this.f48183c;
        v vVar = this.f48181a;
        if (i2 == -2) {
            objInvoke = vVar.f48214c.invoke();
        } else {
            h.g.a.l lVar = vVar.f48213b;
            Object obj = this.f48182b;
            x.c(obj);
            objInvoke = lVar.invoke(obj);
        }
        this.f48182b = objInvoke;
        this.f48183c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f48183c < 0) {
            a();
        }
        return this.f48183c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f48183c < 0) {
            a();
        }
        if (this.f48183c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f48182b;
        x.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f48183c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
