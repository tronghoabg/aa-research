package h.c.a;

import h.c.j;
import h.g.a.l;
import h.g.b.au;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f48044a;

    /* renamed from: b, reason: collision with root package name */
    private int f48045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h.c.e eVar, j jVar, l lVar) {
        super(eVar, jVar);
        this.f48044a = lVar;
    }

    @Override // h.c.b.a.a
    protected final Object invokeSuspend(Object obj) {
        int i2 = this.f48045b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f48045b = 2;
            e.b.c.b(obj);
            return obj;
        }
        this.f48045b = 1;
        e.b.c.b(obj);
        c cVar = this;
        l lVar = this.f48044a;
        au.h(lVar, 1);
        return lVar.invoke(cVar);
    }
}
