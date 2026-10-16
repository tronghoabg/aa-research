package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class ah extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51485a;

    /* renamed from: b, reason: collision with root package name */
    int f51486b;

    /* renamed from: c, reason: collision with root package name */
    Object f51487c;

    /* renamed from: d, reason: collision with root package name */
    Object f51488d;

    /* renamed from: e, reason: collision with root package name */
    long f51489e;

    /* renamed from: f, reason: collision with root package name */
    int f51490f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ad f51491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f51491g = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51485a = obj;
        this.f51486b |= Integer.MIN_VALUE;
        return this.f51491g.collect(null, this);
    }
}
