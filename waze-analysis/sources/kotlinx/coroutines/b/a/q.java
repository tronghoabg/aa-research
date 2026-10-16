package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51435a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f51436b;

    /* renamed from: c, reason: collision with root package name */
    int f51437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(r rVar, h.c.e eVar) {
        super(eVar);
        this.f51436b = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51435a = obj;
        this.f51437c |= Integer.MIN_VALUE;
        return this.f51436b.emit(null, this);
    }
}
