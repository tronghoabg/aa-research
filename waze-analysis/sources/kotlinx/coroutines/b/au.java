package kotlinx.coroutines.b;

/* loaded from: classes2.dex */
public final class au extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51527a;

    /* renamed from: b, reason: collision with root package name */
    int f51528b;

    /* renamed from: c, reason: collision with root package name */
    Object f51529c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ al f51530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(al alVar, h.c.e eVar) {
        super(eVar);
        this.f51530d = alVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51527a = obj;
        this.f51528b |= Integer.MIN_VALUE;
        return this.f51530d.emit(null, this);
    }
}
