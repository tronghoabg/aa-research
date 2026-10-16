package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class be extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51566a;

    /* renamed from: b, reason: collision with root package name */
    int f51567b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f51568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(w wVar, h.c.e eVar) {
        super(eVar);
        this.f51568c = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51566a = obj;
        this.f51567b |= Integer.MIN_VALUE;
        return this.f51568c.emit(null, this);
    }
}
