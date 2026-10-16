package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51706a;

    /* renamed from: b, reason: collision with root package name */
    int f51707b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f51708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(w wVar, h.c.e eVar) {
        super(eVar);
        this.f51708c = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51706a = obj;
        this.f51707b |= Integer.MIN_VALUE;
        return this.f51708c.emit(null, this);
    }
}
