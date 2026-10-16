package kotlinx.coroutines.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51993a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f51994b;

    /* renamed from: c, reason: collision with root package name */
    int f51995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar, h.c.e eVar) {
        super(eVar);
        this.f51994b = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51993a = obj;
        this.f51995c |= Integer.MIN_VALUE;
        return this.f51994b.q(this);
    }
}
