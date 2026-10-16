package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51638a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cc f51639b;

    /* renamed from: c, reason: collision with root package name */
    int f51640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cb(cc ccVar, h.c.e eVar) {
        super(eVar);
        this.f51639b = ccVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51638a = obj;
        this.f51640c |= Integer.MIN_VALUE;
        return this.f51639b.a(0, this);
    }
}
