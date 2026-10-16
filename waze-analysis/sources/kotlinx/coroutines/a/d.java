package kotlinx.coroutines.a;

import kotlinx.coroutines.e.al;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class d extends h.g.b.u implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f51281a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2) {
        super(3, obj, k.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        this.f51281a = i2;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f51281a != 0) {
            h.g.a.l lVar = ((k) this.receiver).f51293a;
            h.g.b.x.c(lVar);
            al.k(lVar, obj2, (h.c.j) obj3);
            return h.ab.f48028a;
        }
        Object objB = ((t) obj2).b();
        h.g.a.l lVar2 = ((k) this.receiver).f51293a;
        h.g.b.x.c(lVar2);
        Object objA = t.a(objB);
        h.g.b.x.c(objA);
        al.k(lVar2, objA, (h.c.j) obj3);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, byte[] bArr) {
        super(3, obj, k.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        this.f51281a = i2;
    }
}
