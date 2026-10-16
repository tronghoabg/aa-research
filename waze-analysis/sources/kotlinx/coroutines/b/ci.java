package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ci extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f51651a;

    /* renamed from: b, reason: collision with root package name */
    Object f51652b;

    /* renamed from: c, reason: collision with root package name */
    Object f51653c;

    /* renamed from: d, reason: collision with root package name */
    Object f51654d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f51655e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ cj f51656f;

    /* renamed from: g, reason: collision with root package name */
    int f51657g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ci(cj cjVar, h.c.e eVar) {
        super(eVar);
        this.f51656f = cjVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51655e = obj;
        this.f51657g |= Integer.MIN_VALUE;
        return this.f51656f.collect(null, this);
    }
}
