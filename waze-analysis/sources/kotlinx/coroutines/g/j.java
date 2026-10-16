package kotlinx.coroutines.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51996a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f51997b;

    /* renamed from: c, reason: collision with root package name */
    int f51998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, h.c.e eVar) {
        super(eVar);
        this.f51997b = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51996a = obj;
        this.f51998c |= Integer.MIN_VALUE;
        return this.f51997b.r(null, null, this);
    }
}
