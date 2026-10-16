package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51494a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ al f51495b;

    /* renamed from: c, reason: collision with root package name */
    int f51496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(al alVar, h.c.e eVar) {
        super(eVar);
        this.f51495b = alVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51494a = obj;
        this.f51496c |= Integer.MIN_VALUE;
        return this.f51495b.emit(null, this);
    }
}
