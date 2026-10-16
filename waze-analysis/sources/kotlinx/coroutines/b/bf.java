package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class bf extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51569a;

    /* renamed from: b, reason: collision with root package name */
    int f51570b;

    /* renamed from: c, reason: collision with root package name */
    Object f51571c;

    /* renamed from: d, reason: collision with root package name */
    Object f51572d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ al f51573e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(al alVar, h.c.e eVar) {
        super(eVar);
        this.f51573e = alVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51569a = obj;
        this.f51570b |= Integer.MIN_VALUE;
        return this.f51573e.emit(null, this);
    }
}
