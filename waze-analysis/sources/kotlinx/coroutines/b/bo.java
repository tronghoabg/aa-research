package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bo<T> implements bq, k, kotlinx.coroutines.b.a.y {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ bq f51595a;
    private final kotlinx.coroutines.br job;

    public bo(bq bqVar, kotlinx.coroutines.br brVar) {
        this.f51595a = bqVar;
        this.job = brVar;
    }

    @Override // kotlinx.coroutines.b.a.y
    public final k cc(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return bu.b(this, jVar, i2, aVar);
    }

    @Override // kotlinx.coroutines.b.bq, kotlinx.coroutines.b.k
    public final Object collect(l<? super T> lVar, h.c.e<?> eVar) {
        return this.f51595a.collect(lVar, eVar);
    }
}
