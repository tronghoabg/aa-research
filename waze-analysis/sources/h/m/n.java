package h.m;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class n extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public static final n f48191a = new n();

    n() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        x.f(iterable, "p0");
        return iterable.iterator();
    }
}
