package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51463a;

    /* renamed from: b, reason: collision with root package name */
    int f51464b;

    /* renamed from: c, reason: collision with root package name */
    Object f51465c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ad f51466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f51466d = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51463a = obj;
        this.f51464b |= Integer.MIN_VALUE;
        return this.f51466d.collect(null, this);
    }
}
