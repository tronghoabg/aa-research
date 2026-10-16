package defpackage;

import j$.util.stream.Stream;
import java.util.Collection;
import java.util.function.LongPredicate;

/* loaded from: classes3.dex */
public interface aepb extends Collection, Iterable {
    aepm a();

    aeqd b();

    boolean c(long j);

    @Override // java.util.Collection, defpackage.aepb
    @Deprecated
    boolean contains(Object obj);

    boolean e(long j);

    boolean g(long j);

    boolean i(LongPredicate longPredicate);

    long[] k();

    @Override // java.util.Collection
    @Deprecated
    Stream<Long> parallelStream();

    @Override // java.util.Collection
    @Deprecated
    Stream<Long> stream();
}
