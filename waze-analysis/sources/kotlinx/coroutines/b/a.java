package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51377a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f51378b;

    /* renamed from: c, reason: collision with root package name */
    int f51379c;

    /* renamed from: d, reason: collision with root package name */
    kotlinx.coroutines.b.a.ac f51380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, h.c.e eVar) {
        super(eVar);
        this.f51378b = bVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51377a = obj;
        this.f51379c |= Integer.MIN_VALUE;
        return this.f51378b.collect(null, this);
    }
}
