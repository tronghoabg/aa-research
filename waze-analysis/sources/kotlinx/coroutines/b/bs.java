package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bs extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f51601a;

    /* renamed from: b, reason: collision with root package name */
    Object f51602b;

    /* renamed from: c, reason: collision with root package name */
    Object f51603c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f51604d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bt f51605e;

    /* renamed from: f, reason: collision with root package name */
    int f51606f;

    /* renamed from: g, reason: collision with root package name */
    bv f51607g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bs(bt btVar, h.c.e eVar) {
        super(eVar);
        this.f51605e = btVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51604d = obj;
        this.f51606f |= Integer.MIN_VALUE;
        return bt.f(this.f51605e, null, this);
    }
}
