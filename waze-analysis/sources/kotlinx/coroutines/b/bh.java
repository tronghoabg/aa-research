package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51579a;

    /* renamed from: b, reason: collision with root package name */
    int f51580b;

    /* renamed from: c, reason: collision with root package name */
    h.g.b.aq f51581c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aq f51582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(aq aqVar, h.c.e eVar) {
        super(eVar);
        this.f51582d = aqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51579a = obj;
        this.f51580b |= Integer.MIN_VALUE;
        return this.f51582d.emit(null, this);
    }
}
