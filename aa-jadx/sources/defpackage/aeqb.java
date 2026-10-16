package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface aeqb extends java.util.Collection, java.lang.Iterable {
    defpackage.aeqm a();

    defpackage.aerd b();

    boolean c(long j);

    @Override // java.util.Collection, defpackage.aeqb
    @java.lang.Deprecated
    boolean contains(java.lang.Object obj);

    boolean e(long j);

    boolean g(long j);

    boolean i(java.util.function.LongPredicate longPredicate);

    long[] k();

    @Override // java.util.Collection
    @java.lang.Deprecated
    j$.util.stream.Stream<java.lang.Long> parallelStream();

    @Override // java.util.Collection
    @java.lang.Deprecated
    j$.util.stream.Stream<java.lang.Long> stream();
}
