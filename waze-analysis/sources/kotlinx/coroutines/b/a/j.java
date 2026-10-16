package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f51416a;

    /* renamed from: b, reason: collision with root package name */
    Object f51417b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f51418c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f51419d;

    /* renamed from: e, reason: collision with root package name */
    int f51420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, h.c.e eVar) {
        super(eVar);
        this.f51419d = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51418c = obj;
        this.f51420e |= Integer.MIN_VALUE;
        return this.f51419d.emit(null, this);
    }
}
