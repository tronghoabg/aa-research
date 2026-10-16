package kotlinx.b.c;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y implements cb {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f51100a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f51101b;

    public y(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "compute");
        this.f51100a = lVar;
        this.f51101b = new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlinx.b.b] */
    @Override // kotlinx.b.c.cb
    public final kotlinx.b.b b(h.l.c cVar) {
        Object objPutIfAbsent;
        h.g.b.x.f(cVar, "key");
        ConcurrentHashMap concurrentHashMap = this.f51101b;
        Class clsW = h.g.b.o.w(cVar);
        Object lVar = concurrentHashMap.get(clsW);
        if (lVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsW, (lVar = new l((kotlinx.b.b) this.f51100a.invoke(cVar))))) != null) {
            lVar = objPutIfAbsent;
        }
        return ((l) lVar).f51085a;
    }
}
