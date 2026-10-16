package kotlinx.coroutines.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51289a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f51290b;

    /* renamed from: c, reason: collision with root package name */
    int f51291c;

    /* renamed from: d, reason: collision with root package name */
    u f51292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, h.c.e eVar) {
        super(eVar);
        this.f51290b = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51289a = obj;
        this.f51291c |= Integer.MIN_VALUE;
        Object objL = this.f51290b.L(null, 0, 0L, this);
        return objL == h.c.a.a.f48038a ? objL : t.f(objL);
    }
}
