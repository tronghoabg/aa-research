package h.m;

import h.g.b.x;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f48169a;

    public a(h hVar) {
        x.f(hVar, "sequence");
        this.f48169a = new AtomicReference(hVar);
    }

    @Override // h.m.h
    public final Iterator<T> iterator() {
        h hVar = (h) this.f48169a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
