package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51482a;

    /* renamed from: b, reason: collision with root package name */
    int f51483b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ al f51484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(al alVar, h.c.e eVar) {
        super(eVar);
        this.f51484c = alVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51482a = obj;
        this.f51483b |= Integer.MIN_VALUE;
        return this.f51484c.emit(null, this);
    }
}
