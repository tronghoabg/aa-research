package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bi extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51583a;

    /* renamed from: b, reason: collision with root package name */
    int f51584b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ al f51585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(al alVar, h.c.e eVar) {
        super(eVar);
        this.f51585c = alVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51583a = obj;
        this.f51584b |= Integer.MIN_VALUE;
        return this.f51585c.emit(null, this);
    }
}
