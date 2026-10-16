package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2989n extends AbstractC2967i2 {
    static O0 V(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        C2999p c2999p = new C2999p(19);
        C2999p c2999p2 = new C2999p(20);
        C2999p c2999p3 = new C2999p(21);
        Objects.requireNonNull(c2999p);
        Objects.requireNonNull(c2999p2);
        Objects.requireNonNull(c2999p3);
        return new O0((Collection) new F1(EnumC2963h3.REFERENCE, c2999p3, c2999p2, c2999p, 3).c(abstractC2929b, spliterator));
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC2958g3.DISTINCT.t(abstractC2929b.H())) {
            return abstractC2929b.z(spliterator, false, intFunction);
        }
        if (EnumC2958g3.ORDERED.t(abstractC2929b.H())) {
            return V(abstractC2929b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C3000p0 c3000p0 = new C3000p0(3, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c3000p0);
        new P(c3000p0, false).e(abstractC2929b, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new O0(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC2929b
    final Spliterator M(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        if (EnumC2958g3.DISTINCT.t(abstractC2929b.H())) {
            return abstractC2929b.U(spliterator);
        }
        if (EnumC2958g3.ORDERED.t(abstractC2929b.H())) {
            return V(abstractC2929b, spliterator).spliterator();
        }
        return new C3003p3(abstractC2929b.U(spliterator));
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        Objects.requireNonNull(interfaceC3011r2);
        if (EnumC2958g3.DISTINCT.t(i5)) {
            return interfaceC3011r2;
        }
        if (EnumC2958g3.SORTED.t(i5)) {
            return new C2979l(interfaceC3011r2);
        }
        return new C2984m(interfaceC3011r2);
    }
}
