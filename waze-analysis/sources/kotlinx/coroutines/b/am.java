package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class am extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f51500a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f51501b;

    /* renamed from: c, reason: collision with root package name */
    int f51502c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aq f51503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(aq aqVar, h.c.e eVar) {
        super(eVar);
        this.f51503d = aqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51501b = obj;
        this.f51502c |= Integer.MIN_VALUE;
        return this.f51503d.emit(null, this);
    }
}
