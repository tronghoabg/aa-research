package h.m;

import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f<T, R, E> implements h<E> {

    /* renamed from: a, reason: collision with root package name */
    private final h f48178a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.l f48179b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f48180c;

    public f(h hVar, h.g.a.l lVar, h.g.a.l lVar2) {
        x.f(hVar, "sequence");
        x.f(lVar, "transformer");
        x.f(lVar2, "iterator");
        this.f48178a = hVar;
        this.f48179b = lVar;
        this.f48180c = lVar2;
    }

    @Override // h.m.h
    public final Iterator<E> iterator() {
        return new e(this);
    }
}
