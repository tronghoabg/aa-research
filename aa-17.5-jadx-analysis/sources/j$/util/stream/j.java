package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class j extends v2 {
    public static n0 v(a aVar, Spliterator spliterator) {
        i iVar = new i((byte) 0);
        i iVar2 = new i((byte) 1);
        return new n0((Collection) new c2(v3.REFERENCE, new i((byte) 2), iVar2, iVar, (byte) 1).b(aVar, spliterator));
    }

    @Override // j$.util.stream.a
    public final j0 l(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (u3.DISTINCT.p(aVar.f)) {
            return aVar.c(spliterator, false, intFunction);
        }
        if (u3.ORDERED.p(aVar.f)) {
            return v(aVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new o(new j$.nio.file.h0(atomicBoolean, concurrentHashMap, (byte) 5)).b(aVar, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new n0(collectionKeySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator m(a aVar, Spliterator spliterator) {
        return u3.DISTINCT.p(aVar.f) ? aVar.u(spliterator) : u3.ORDERED.p(aVar.f) ? v(aVar, spliterator).spliterator() : new y3(aVar.u(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final z2 o(int i, z2 z2Var) {
        z2Var.getClass();
        return u3.DISTINCT.p(i) ? z2Var : u3.SORTED.p(i) ? new g(z2Var) : new h(z2Var);
    }
}
