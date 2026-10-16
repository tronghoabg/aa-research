package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bn extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f51761a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f51762b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bn(h.g.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f51761a = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bn bnVar = new bn(this.f51761a, eVar);
        bnVar.f51762b = obj;
        return bnVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bn) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        h.c.j coroutineContext = ((af) this.f51762b).getCoroutineContext();
        h.g.a.a aVar2 = this.f51761a;
        try {
            de deVar = new de();
            deVar.f(aj.V(coroutineContext));
            try {
                return aVar2.invoke();
            } finally {
                deVar.d();
            }
        } catch (InterruptedException e2) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
        }
    }
}
