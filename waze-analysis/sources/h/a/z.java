package h.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z implements h.m.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f48026a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f48027b;

    public z(Object obj, int i2) {
        this.f48027b = i2;
        this.f48026a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // h.m.h
    public final Iterator iterator() {
        int i2 = this.f48027b;
        ?? r1 = this.f48026a;
        return i2 != 0 ? h.g.b.o.v((Object[]) r1) : r1.iterator();
    }
}
