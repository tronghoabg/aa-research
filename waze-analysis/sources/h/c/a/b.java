package h.c.a;

import h.g.a.l;
import h.g.b.au;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends h.c.b.a.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f48042a;

    /* renamed from: b, reason: collision with root package name */
    private int f48043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h.c.e eVar, l lVar) {
        super(eVar);
        this.f48042a = lVar;
    }

    @Override // h.c.b.a.a
    protected final Object invokeSuspend(Object obj) {
        int i2 = this.f48043b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f48043b = 2;
            e.b.c.b(obj);
            return obj;
        }
        this.f48043b = 1;
        e.b.c.b(obj);
        b bVar = this;
        l lVar = this.f48042a;
        au.h(lVar, 1);
        return lVar.invoke(bVar);
    }
}
