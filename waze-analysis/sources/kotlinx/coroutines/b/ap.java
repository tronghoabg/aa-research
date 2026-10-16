package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ap extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51511a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f51512b;

    /* renamed from: c, reason: collision with root package name */
    int f51513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(aq aqVar, h.c.e eVar) {
        super(eVar);
        this.f51512b = aqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51511a = obj;
        this.f51513c |= Integer.MIN_VALUE;
        return this.f51512b.emit(null, this);
    }
}
