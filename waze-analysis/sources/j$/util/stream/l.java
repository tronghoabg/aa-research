package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class l extends k5 {
    public static q2 T(a aVar, Spliterator spliterator) {
        j$.desugar.sun.nio.fs.n nVar = new j$.desugar.sun.nio.fs.n(25);
        j$.desugar.sun.nio.fs.n nVar2 = new j$.desugar.sun.nio.fs.n(26);
        j$.desugar.sun.nio.fs.n nVar3 = new j$.desugar.sun.nio.fs.n(27);
        Objects.requireNonNull(nVar);
        Objects.requireNonNull(nVar2);
        Objects.requireNonNull(nVar3);
        return new q2((Collection) new i4(k7.REFERENCE, nVar3, nVar2, nVar, 3).b(aVar, spliterator));
    }

    @Override // j$.util.stream.a
    public final m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (j7.DISTINCT.k(aVar.f50316f)) {
            return aVar.j(spliterator, false, intFunction);
        }
        if (j7.ORDERED.k(aVar.f50316f)) {
            return T(aVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.nio.file.z zVar = new j$.nio.file.z(5, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(zVar);
        new k0(zVar, false).b(aVar, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new q2(collectionKeySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return j7.DISTINCT.k(aVar.f50316f) ? aVar.S(spliterator) : j7.ORDERED.k(aVar.f50316f) ? T(aVar, spliterator).spliterator() : new s7(aVar.S(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        Objects.requireNonNull(t5Var);
        return j7.DISTINCT.k(i2) ? t5Var : j7.SORTED.k(i2) ? new j(t5Var) : new k(t5Var);
    }
}
