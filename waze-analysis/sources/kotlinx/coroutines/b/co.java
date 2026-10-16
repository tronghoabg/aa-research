package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class co extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51669a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cp f51670b;

    /* renamed from: c, reason: collision with root package name */
    int f51671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    co(cp cpVar, h.c.e eVar) {
        super(eVar);
        this.f51670b = cpVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51669a = obj;
        this.f51671c |= Integer.MIN_VALUE;
        return this.f51670b.collect(null, this);
    }
}
