package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class ao extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51507a;

    /* renamed from: b, reason: collision with root package name */
    int f51508b;

    /* renamed from: c, reason: collision with root package name */
    Object f51509c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aj f51510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(aj ajVar, h.c.e eVar) {
        super(eVar);
        this.f51510d = ajVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51507a = obj;
        this.f51508b |= Integer.MIN_VALUE;
        return this.f51510d.collect(null, this);
    }
}
