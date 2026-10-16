package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f51631a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f51632b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f51633c;

    /* renamed from: d, reason: collision with root package name */
    int f51634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f51633c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51632b = obj;
        this.f51634d |= Integer.MIN_VALUE;
        return this.f51633c.a(null, this);
    }
}
