package com.waze.map.opengl;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class af extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f29538a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29539b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(WazeMapRenderer wazeMapRenderer, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29539b = i2;
        this.f29538a = wazeMapRenderer;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f29539b;
        Object obj2 = this.f29538a;
        return i2 != 0 ? new af((WazeMapRenderer) obj2, eVar, 1) : new af((WazeRenderer) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f29539b != 0 ? ((af) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((af) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f29539b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            Iterator it = ((WazeMapRenderer) this.f29538a).f29503d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Iterator it2 = h.a.i.ao(((WazeRenderer) this.f29538a).f29512g).iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(WazeRenderer wazeRenderer, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29539b = i2;
        this.f29538a = wazeRenderer;
    }
}
