package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class ae extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51475a;

    /* renamed from: b, reason: collision with root package name */
    int f51476b;

    /* renamed from: c, reason: collision with root package name */
    Object f51477c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ad f51478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f51478d = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51475a = obj;
        this.f51476b |= Integer.MIN_VALUE;
        return this.f51478d.collect(null, this);
    }
}
