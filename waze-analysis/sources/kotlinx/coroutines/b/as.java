package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class as extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51522a;

    /* renamed from: b, reason: collision with root package name */
    int f51523b;

    /* renamed from: c, reason: collision with root package name */
    Object f51524c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ al f51525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(al alVar, h.c.e eVar) {
        super(eVar);
        this.f51525d = alVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51522a = obj;
        this.f51523b |= Integer.MIN_VALUE;
        return this.f51525d.emit(null, this);
    }
}
