package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bp<T> implements ch, k, kotlinx.coroutines.b.a.y {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ch f51596a;
    private final kotlinx.coroutines.br job;

    public bp(ch chVar, kotlinx.coroutines.br brVar) {
        this.f51596a = chVar;
        this.job = brVar;
    }

    @Override // kotlinx.coroutines.b.a.y
    public final k cc(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return ck.a(this, jVar, i2, aVar);
    }

    @Override // kotlinx.coroutines.b.bq, kotlinx.coroutines.b.k
    public final Object collect(l<? super T> lVar, h.c.e<?> eVar) {
        return this.f51596a.collect(lVar, eVar);
    }

    @Override // kotlinx.coroutines.b.ch
    public final Object d() {
        return this.f51596a.d();
    }
}
