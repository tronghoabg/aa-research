package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class ca extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51635a;

    /* renamed from: b, reason: collision with root package name */
    int f51636b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aj f51637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(aj ajVar, h.c.e eVar) {
        super(eVar);
        this.f51637c = ajVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51635a = obj;
        this.f51636b |= Integer.MIN_VALUE;
        return this.f51637c.collect(null, this);
    }
}
