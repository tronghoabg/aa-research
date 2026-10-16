package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class bg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51574a;

    /* renamed from: b, reason: collision with root package name */
    int f51575b;

    /* renamed from: c, reason: collision with root package name */
    Object f51576c;

    /* renamed from: d, reason: collision with root package name */
    h.g.b.aq f51577d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bk f51578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f51578e = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51574a = obj;
        this.f51575b |= Integer.MIN_VALUE;
        return this.f51578e.collect(null, this);
    }
}
