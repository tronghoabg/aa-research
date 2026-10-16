package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51467a;

    /* renamed from: b, reason: collision with root package name */
    int f51468b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ad f51469c;

    /* renamed from: d, reason: collision with root package name */
    Object f51470d;

    /* renamed from: e, reason: collision with root package name */
    kotlinx.coroutines.b.a.ac f51471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f51469c = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51467a = obj;
        this.f51468b |= Integer.MIN_VALUE;
        return this.f51469c.collect(null, this);
    }
}
