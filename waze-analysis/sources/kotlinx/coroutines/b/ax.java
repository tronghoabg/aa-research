package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class ax extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51539a;

    /* renamed from: b, reason: collision with root package name */
    int f51540b;

    /* renamed from: c, reason: collision with root package name */
    Object f51541c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ al f51542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(al alVar, h.c.e eVar) {
        super(eVar);
        this.f51542d = alVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51539a = obj;
        this.f51540b |= Integer.MIN_VALUE;
        return this.f51542d.emit(null, this);
    }
}
