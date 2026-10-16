package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51725a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f51726b;

    /* renamed from: c, reason: collision with root package name */
    int f51727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, h.c.e eVar) {
        super(eVar);
        this.f51726b = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51725a = obj;
        this.f51727c |= Integer.MIN_VALUE;
        return this.f51726b.emit(null, this);
    }
}
