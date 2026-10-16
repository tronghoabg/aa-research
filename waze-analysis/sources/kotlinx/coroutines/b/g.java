package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51680a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f51681b;

    /* renamed from: c, reason: collision with root package name */
    int f51682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, h.c.e eVar) {
        super(eVar);
        this.f51681b = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51680a = obj;
        this.f51682c |= Integer.MIN_VALUE;
        return this.f51681b.emit(null, this);
    }
}
