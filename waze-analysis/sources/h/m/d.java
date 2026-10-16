package h.m;

import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final h f48171a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f48172b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f48173c;

    public d(h hVar, boolean z, h.g.a.l lVar) {
        x.f(hVar, "sequence");
        x.f(lVar, "predicate");
        this.f48171a = hVar;
        this.f48172b = z;
        this.f48173c = lVar;
    }

    @Override // h.m.h
    public final Iterator<T> iterator() {
        return new u(this, 1);
    }
}
