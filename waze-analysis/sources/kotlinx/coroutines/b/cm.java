package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cm extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51663a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cn f51664b;

    /* renamed from: c, reason: collision with root package name */
    int f51665c;

    /* renamed from: d, reason: collision with root package name */
    kotlinx.coroutines.b.a.ac f51666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cm(cn cnVar, h.c.e eVar) {
        super(eVar);
        this.f51664b = cnVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51663a = obj;
        this.f51665c |= Integer.MIN_VALUE;
        return this.f51664b.a(this);
    }
}
