package kotlinx.coroutines.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51286a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f51287b;

    /* renamed from: c, reason: collision with root package name */
    int f51288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar, h.c.e eVar) {
        super(eVar);
        this.f51287b = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51286a = obj;
        this.f51288c |= Integer.MIN_VALUE;
        Object objF = k.f(this.f51287b, this);
        return objF == h.c.a.a.f48038a ? objF : t.f(objF);
    }
}
